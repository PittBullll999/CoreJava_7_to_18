package org.codes.webflux.normalflux;


import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        GetFluxorMonoData g=new GetFluxorMonoData();
        Example e=new Example();
        Flux.zip(g.returnIntegerFlux(1,5),g.returnIntegerFlux(10,20),(a,b)->a+"+"+b).subscribe(System.out::println);


//        g.returnIntegerFlux().map(i-> {System.out.println(i);return i; }).toStream().toList();
//        g.returnIntegerFlux().subscribe(System.out::println,throwable -> System.out.println(throwable.getMessage()),()-> System.out.println("complete"));
//        Flux.concat(g.returnStringFlux(),g.returnStringName()).map(i->i+" is and indian").subscribe(i-> System.out.println(i));
//        Flux.concat(g.returnIntegerFlux(0,100),g.returnIntegerFlux(100,100)).subscribe(i-> System.out.println(i));
        //e.merge();
        Flux.just(1,2,3,4,5,6).delayElements(Duration.ofMillis(100)).subscribe(i-> System.out.println(i));
        MyController c=new MyController();
        c.getItems();
    }

    public void merge() {
        Flux<String> flux1 = Flux.just("Hello", "Vikram");

        flux1 = Flux.interval(Duration.ofMillis(3000))
                .zipWith(flux1, (i, msg) -> msg);


        Flux<String> flux2 = Flux.just("reactive");
        flux2 = Flux.interval(Duration.ofMillis(2000))
                .zipWith(flux2, (i, msg) -> msg);

        Flux<String> flux3 = Flux.just("world");
        Flux.merge(flux1, flux2, flux3)
                .subscribe(System.out::println);

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
class MyController {

    List<Item> items = Arrays.asList(
            new Item("name1","description1"),
            new Item("name2","description2"),
            new Item("name3","description3"),
            new Item("name4","description4"));

    Flux<Item> getItems(){
        return Flux.fromIterable(items)
                .delayElements(Duration.ofSeconds(3));
    }
}
@Data
@AllArgsConstructor
class Item{
    String name;
    String description;
}
