/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.*;
public class ListBook {

    ArrayList<Book> listB = new ArrayList<>();

    public void addBook(int num) {
        

        
        

            
            
            switch (num) {
                
                case 1:
                    Book b=new TextBook();
                    b.addBook();
                    listB.add(b);
                    break;
                case 2:
                    Book b2=new ReferenceBook();
                    b2.addBook();
                    listB.add(b2);
                    break;
                default:
                    System.out.println("enter fail");
            }
        
    }
    public boolean updateBookById(String id){
        Scanner scan=new Scanner(System.in);
        for (Book book : listB) {
            if(book.getId().equals(id)){
                System.out.print("Enter ID: ");
                book.setId(scan.nextLine());
                System.out.print("Enter Title: ");
                book.setTitle(scan.nextLine());
                System.out.println("Enter Price: ");
                book.setBasePrice(scan.nextDouble());
                return true;
            }
            
        }
        return false;
    }
    public void deleteBookById(String id)
    {
        for (Book book : listB) {
            if (book.getId().equals(id)) {
                System.out.println("deleted book have id: "+id);
                listB.remove(listB.indexOf(book));
            }
        }
    }
    public void findBookById(String id)
    {
        for (Book book : listB) {
            if(book.getId().equals(id)){
                System.out.println("Book have id :");
                book.displayDetails();
                return;
            }
            if(listB.get(listB.size()-1).equals(book)){
                System.out.println("not find about book have id: "+id);
            }
        }
    }
    public void displayAllBook(){
        for (Book book : listB) {
            book.displayDetails();
            
        }
    }
    public void findMostExpensiveBook()
    {
        String id;
        Book expensiveB= listB.get(0);
        for (Book book : listB) {
            if(book.getBasePrice()>expensiveB.getBasePrice())
            {
                expensiveB=book;
            }
        }
    }
    public int countBooks(){
           return listB.size();
    }
    
}
