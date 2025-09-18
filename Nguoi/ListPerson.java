/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nguoi;

import java.util.ArrayList;

public class ListPerson {
    private ArrayList<Person> list = new ArrayList<>();

    public void addList(Person p) {
        p.input();
        list.add(p);
    }

    public void outputList() {
        if (list.isEmpty()) {
            System.out.println("list is empty");
        } else {
            for (Person p : list) {
                p.output();
            }
        }
    }
}
