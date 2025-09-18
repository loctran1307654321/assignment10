/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;
import java.util.*;
public class ReferenceBook extends Book {
    private String publisher;

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public ReferenceBook() {
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
    @Override
    public  void displayDetails(){
        super.displayDetails();
        System.out.println("publisher: "+getPublisher());
    }
    @Override
    public void addBook() {
        Scanner scan=new Scanner(System.in);
        super.addBook();
        System.out.println("Enter publisher: ");
        setPublisher(scan.nextLine());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice()/1.2;
    }
    
}
