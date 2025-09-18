/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nguoi;

import java.util.*;
import java.text.*;

public class Student extends Person {

    private String idStudent;
    private String gpa;

    public Student(String idStudent, String train, String name, Date birtDay, String sex, int identityCard) {
        super(name, birtDay, sex, identityCard);
        this.idStudent = idStudent;
        this.gpa = train;
    }

    public Student() {
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setGpa(String train) {
        this.gpa = train;
    }

    public String getGpa() {
        return gpa;
    }

    public void trainingAssessment() {
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1-gioi, 2-kha, 3-trung binh, 4-yeu");
        num=scan.nextInt();
        switch (num) {
            case 1:
                setGpa("gioi");
                break;
            case 2:
                setGpa("kha");
                break;
            case 3:
                setGpa("trung binh");
                break;
            case 4:
                setGpa("yeu");
                break;    
            default:
                System.out.println("Enter faile");
        }
    }

    @Override
    public void input() {
        Scanner scan=new Scanner(System.in);
        super.input();
        System.out.print("Enter student's ID: ");
        setIdStudent(scan.nextLine());
        trainingAssessment();
    }

    @Override
    public void output() {
        super.output(); 
        System.out.println("student's ID: "+getIdStudent()+" student's GPA: "+getGpa());
        
    }
    
    
    
}
