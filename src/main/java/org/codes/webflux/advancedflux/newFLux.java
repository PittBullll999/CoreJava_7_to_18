package org.codes.webflux.advancedflux;

import reactor.core.publisher.Flux;
import reactor.util.retry.Retry;

import java.time.Duration;

public class newFLux {
    public static void main(String[] args) {
        Flux<Integer> flux = Flux.range(1, 5)
                .map(i -> {
                    if (i == 3) {
                        throw new RuntimeException("Error");
                    }
                    return i;
                });

        flux.retryWhen(Retry.backoff(3, Duration.ofSeconds(2))).subscribe(
                value -> System.out.println("Received: " + value),
                error -> System.err.println("Error: " + error)
        );
    }
}
