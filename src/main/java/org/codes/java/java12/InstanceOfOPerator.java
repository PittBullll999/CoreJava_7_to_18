package org.codes.java.java12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Book{
    private String bookName;
    private String authorName;
    private double bookPrice;

}
public class InstanceOfOPerator {
    public static void main(String[] args) {
        Book b=new Book("WIngs of fire","Dr APJ abdulkalam",350d);
        if(b instanceof Book)
        {
            System.out.println("the book name is :"+b.getBookName());
            System.out.println("Price of the book is :"+b.getBookPrice());
            System.out.println("Writer of this book is :"+b.getAuthorName());
        }
        List<@NonNull Integer> list;
    }
}
