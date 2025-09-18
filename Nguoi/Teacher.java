/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nguoi;

import java.util.*;
import java.text.*;

public class Teacher extends Person {

    private String idTeacher;
    private String rankCompition;

    public Teacher(String idTeacher, String rankCompition, String name, Date birtDay, String sex, int identityCard) {
        super(name, birtDay, sex, identityCard);
        this.idTeacher = idTeacher;
        this.rankCompition = rankCompition;
    }

    public Teacher() {
    }

    public void setIdTeacher(String idTeacher) {
        this.idTeacher = idTeacher;
    }

    public String getIdTeacher() {
        return idTeacher;
    }

    public void setRankCompition(String rankCompition) {
        this.rankCompition = rankCompition;
    }

    public String getRankCompition() {
        return rankCompition;
    }

    @Override
    public void input() {
        Scanner scan = new Scanner(System.in);
        super.input();
        System.out.print("Enter teacher's Id: ");
        setIdTeacher(scan.nextLine());
        

    }

    @Override
    public void output() {
        super.output(); 
        System.out.println("id teacher: "+getIdTeacher()+" ranking compition: "+getRankCompition());
    }
    
    public void rankingCompition() {
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        System.out.println("1-loai A, 2-loai B, 3-loai C");
        switch (num) {
            case 1:
                setRankCompition("Loai A");
                break;
            case 2:
                setRankCompition("Loai B");
                break;
            case 3:
                setRankCompition("Loai C");
                break;
            case 4:
                setRankCompition("Loai D");
                break;
            default:
                System.out.println("enter faile");
        }
    }

}
