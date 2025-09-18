/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nguoi;

import java.text.*;

import java.util.*;

/**
 *
 * @author VICTUS
 */
public class Person {
    String name;
    Date birtDay;
    String sex;
    int identityCard;
    public Person(){
    }
    public Person(String name,Date birtDay,String sex,int identityCard){
        this.name=name;
        this.birtDay=birtDay;
        this.sex=sex;
        this.identityCard=identityCard;
    }

    public Date getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(Date birtDay) {
        this.birtDay = birtDay;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    
    
    public void input()
    {
        Scanner s=new Scanner(System.in);
        SimpleDateFormat ft=new SimpleDateFormat("dd-MM-yyyy");
        try{
            System.out.println("Enter name:");
            setName(s.nextLine());
            System.out.println("Enter birtday: dd-MM-yyyy");
            setBirtDay(ft.parse(s.nextLine()));
            System.out.println("Enter sex:");
            setSex(s.nextLine());
            System.out.println("Enter identity card:");
            setIdentityCard(s.nextInt());
        }catch(ParseException e){
            System.out.println("not parse use "+ft);
        }
    }
    public void output()
    {
        SimpleDateFormat ft=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Name: "+getName()+ " birt day: "+ft.format(getBirtDay())+" sex "+getSex()+
                " identity card "+getIdentityCard());
    }
    
}
