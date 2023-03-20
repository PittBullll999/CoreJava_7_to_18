package org.codes.java.java8.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Book
{
    Book(String name)
    {
        this.bookName=name;
    }
    private String bookName;
    private String autherName;
    private Integer bookPrice;
    private Integer numberOfPages;
}
public class Streams {
    public static void main(String[] args) {

        allMatchAnyMatchNoneMatch();

    }
    public static void flatMap()
    {

        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);


        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);


        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =
                Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);
        listOfListofInts.stream().flatMap(i->i.stream()).forEach(System.out::println);

        listOfListofInts.stream().flatMap(i->i.stream()).flatMapToInt(k-> IntStream.of((int)k*2)).forEach(System.out::println);
        List<String> list = Arrays.asList("Abhinav raj m", "Athul raj ",
                "Abhijith", "Beena","Rajan");

//        list.stream().flatMap(st->
//                Stream.of(st.charAt(1))).forEach(System.out::println);

    }
    public static void normalStream()
    {
        List<Integer> integers= Arrays.asList(1,2,3,4,5,6,7,2,3,5,6,7);

        System.out.println(integers.stream().findAny());//  ---> findany() will return any element in the stream if stream is empty return will optionla empty


        long count =integers.stream().count();// --->this will return the total count of the stream


        integers.stream().distinct().forEach(t-> System.out.println(t));// --->this will return the distinct element in the list


        System.out.println(integers.stream().findFirst());//--->this will return the first element of the stream


        integers.stream().filter(k->k%2==0).forEach(System.out::println);//---> this will return a filtered stream of that list
        System.out.println("................................................................");
        integers.stream().limit(8).filter(i->i%2==0).distinct().forEach(System.out::println);//---->limit only apply the methodes for maxsize range


    }
    public static void foreach()
    {
        List<Book> books=Arrays.asList(new Book("Flying it my way")
                ,new Book("Wings of fires"),new Book("Chemmeen")
                ,new Book("Odakuyal"));
        books.stream().forEach(i->i.setBookPrice(1000)); //foreach is a terminal operation so it won't return anything
        books.stream().forEach(System.out::println);

    }
    public static void map()
    {
        List<Book> books=Arrays.asList(new Book("Flying it my way")
                ,new Book("Wings of fires"),new Book("Chemmeen")
                ,new Book("Odakuyal"));
        books.stream().map(i->//map will return a stream of data depends on what we returning
        {
            i.setNumberOfPages(1500);
            return i;//this map is returning the entire object of stream
        }
        ).map(
                i->{
                    return i.getBookName();//here it only retunring the bookname of the book
                }
        ).forEach(System.out::println);//here it only pring the bookname becasue only bookname is returning

    }
    public static void collects()
    {
        List<Book> books=Arrays.asList(new Book("Flying it my way")
                ,new Book("Wings of fires"),new Book("Chemmeen")
                ,new Book("Odakuyal"),new Book("Elements"),new Book("Bible"));
        List<Book> books1=books.stream().map(
                i->{
                    if(i.getBookName().contains("l"))
                    {
                        i.setBookPrice(1500);
                        i.setNumberOfPages(1300);
                    }
                    else
                    {
                        i.setBookPrice(1200);
                        i.setNumberOfPages(700);
                    }
                    return i;
                }
        ).map(
                i->{
                    System.out.println(i.toString());
                    return i;
                }
        ).collect(Collectors.toList());


    }
    public static void filter()
    {
        List<Book> books=Arrays.asList(new Book("Flying it my way")
                ,new Book("Wings of fires"),new Book("Chemmeen")
                ,new Book("Odakuyal"),new Book("Elements"),new Book("Bible"));
        books.stream().map(
                i->{
                    if(i.getBookName().contains("l"))
                    {
                        i.setBookPrice(1500);
                        i.setNumberOfPages(1300);
                    }
                    else
                    {
                        i.setBookPrice(1200);
                        i.setNumberOfPages(700);
                    }
                    return i;
                }
        ).filter(i->i.getBookName().length()>10)//filter will return a stream of data withrespct to the condition
                .forEach(System.out::println);
    }
    public static void findFirst()
    {
        List<Book> books=Arrays.asList(new Book("Flying it my way")
                ,new Book("Wings of fires"),new Book("Chemmeen")
                ,new Book("Odakuyal"),new Book("Elements"),new Book("Bible"));
        Optional<Book> book=books.stream().filter(i->i.getBookName().contains("mm")).findFirst();//this will return the first element in the stream wich match with the condition
        System.out.println(book.get().toString());
    }
    public static void flatmap()
    {
        List<Integer> a=Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> b=Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> c=Arrays.asList(1,2,3,4,5,6,7,8);
        List<List<Integer>> list=Arrays.asList(a,b,c);

        List<Integer> list1;
        list1=list.stream().flatMap(Collection::stream).collect(Collectors.toList());//flat map flatter the data structure and simplfy the further operation

        System.out.println(list1.toString());
    }
    public static void peek()
    {
        // this is a intermediate operation so we can further operation on te output of the peek

        List<Book> books=Arrays.asList(new Book("Flying it my way")
                ,new Book("Wings of fires"),new Book("Chemmeen")
                ,new Book("Odakuyal"),new Book("Elements"),new Book("Bible"));
        List<Book> books1=books.stream()
                .peek(i->
                {
                    i.setBookPrice(1200);
                    i.setNumberOfPages(1000);
                })
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
    public static void allMatchAnyMatchNoneMatch()
    {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,6,6,7,44,6,8,99,9,9,1,2,2);

        boolean b =list.stream().allMatch(i->i%2==0);//this will check if all the element matches the condition
        boolean c=list.stream().anyMatch(i->i%3==0);//this will check only for one element that matches the condition
        list.stream().distinct().sorted().forEach(System.out::println);//this will return the stream element in sorted and distinct way

        System.out.println(c);
        System.out.println(b);
    }

}
