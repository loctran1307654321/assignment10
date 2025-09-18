/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;
import java.util.*;

public abstract class Book implements IBook {
    private  String id;
    private String title;
    private double basePrice;

    public Book(String id, String title, double basePrice) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
    }
    
    public Book() {
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    @Override
    public void addBook(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Id: ");
        setId(scan.nextLine());
        System.out.print("Enter title: ");
        setTitle(scan.nextLine());
        System.out.print("Enter price: ");
        setBasePrice(scan.nextDouble());
    }
    @Override
    public  void displayDetails()
    {
        System.out.println("Id: "+getId()+" title: "+getTitle()+" price: "+getBasePrice());
    }
    @Override
    public  abstract double calculatePrice();

    
    
    
    
}
