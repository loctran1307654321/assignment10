/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nguoi;

public class Main {
    public static void main(String[] args) {
        ListPerson ds = new ListPerson();

        ds.addList(new Teacher());
        ds.addList(new Student());

        System.out.println("\noutput list:");
        ds.outputList();
    }
}
