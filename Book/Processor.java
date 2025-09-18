/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.*;

public class Processor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListBook lb=new ListBook();
        String id;
        int n;
        do {

            System.out.println("1. Add new textbook \n"
                    + "2. Add new reference book \n"
                    + "3. Update book by id \n"
                    + "4. Delete book by id \n"
                    + "5. Find book by id \n"
                    + "6. Display all books \n"
                    + "7. Find the most expensive book \n"
                    + "8. Count the total number of TextBooks and ReferenceBooks separately in the book list. ");
            n = scan.nextInt();
            switch (n) {
                case 1:
                    lb.addBook(n);
                    break;
                case 2:
                    lb.addBook(n);
                    break;
                case 3:
                    System.out.println("Enter id of book: ");
                    scan.nextLine();
                    id=scan.nextLine();
                    lb.updateBookById(id);
                    break;
                case 4:
                    System.out.println("Enter id of book: ");
                    scan.nextLine();
                    id=scan.nextLine();
                    lb.deleteBookById(id);
                    break;
                case 5:
                    System.out.println("Enter id of book: ");
                    scan.nextLine();
                    id=scan.nextLine();
                    lb.findBookById(id);
                case 6:
                    lb.displayAllBook();
                    break;
                case 7:
                    lb.findMostExpensiveBook();
                    break;
                case 8:
                    System.out.println("number of book is: "+lb.countBooks());
                    break;
                default:
                    throw new AssertionError();
            }
        } while (n >= 1 && n <= 8);
    }
}
