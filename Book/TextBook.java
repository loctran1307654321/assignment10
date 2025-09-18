/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;
import java.util.*;
public class TextBook extends Book {
    private String subject;

    public TextBook() {
    }

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("subject: "+ getSubject());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice()*1.1;
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter subject: ");
        setSubject(scan.nextLine());
        
    }
    
    
    
}
