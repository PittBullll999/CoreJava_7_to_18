package org.codes.webflux.normalflux;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

public class GetFluxorMonoData {

    public Flux<Integer> returnIntegerFlux(int m,int n)
    {
        return Flux.range(m,n);
    }
    public Mono<Integer> returnMonoInteger()
    {
        return Mono.just(1);
    }
    public Flux<String> returnStringName()
    {
        return Flux.just("Abhinav","Athul","Abhijith");
    }
    public Flux<String> returnStringFlux()
    {
        return Flux.just("Sachin tendulkar","Virat Kohli","ROhit sharma");
    }
}
