package org.codes.webflux.advancedflux;

import org.codes.webflux.generator.FluxGenerator;
import org.reactivestreams.Subscription;
import reactor.core.Exceptions;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicLong;

public class React {
    public static void main(String[] args) {
        FluxGenerator f=new FluxGenerator();
        Flux.generate(AtomicLong::new,
                (state,sink)->{
            long i=state.getAndIncrement();
            sink.next("3 X" +i+" = "+3*i);
            if(i==10) sink.complete();
            return state;
                }).subscribe();

    }
}
class NewSubscriber<T> extends BaseSubscriber<T> {
    @Override
    public void hookOnSubscribe(Subscription subscription)
    {
        System.out.println("subsciption happened");
        request(1);
    }
    @Override
    public void hookOnNext(T value)
    {
        System.out.println(value.toString()+" receiver");
        request(1);
    }
    @Override
    public void hookOnError(Throwable throwable) {
        System.out.println(throwable.getMessage());
    }
    @Override
    public void hookOnComplete()
    {
        System.out.println("This methode is complete");
    }
}
