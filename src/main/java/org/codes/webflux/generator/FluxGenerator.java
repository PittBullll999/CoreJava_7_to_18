package org.codes.webflux.generator;


import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class FluxGenerator {
    public Flux<Integer> integerFlux()
    {
        return Flux.range(1,100);
    }
    public Flux<Integer> integerFluxWithError()
    {
        return Flux.range(1,10).map(i->{
            if(i<9)
            {
                return i;
            }
            else {
                throw new RuntimeException("THis is number 9");
            }
        });
    }


}
