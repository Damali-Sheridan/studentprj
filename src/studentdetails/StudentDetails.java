/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentdetails;

/**
 *
 * @author damalibaker
 */
public class StudentDetails {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setName("Rayman");
        s1.setSid(11);
        
        Student s2 = new Student();
        s2.setName("Sameer");
        s2.setSid(12);
        
        Student s3 = new Student();
        s3.setName("Peter");
        s3.setSid(13);
       
        Student[] list = new Student[3];
        
        list[0] = s1;
        list[1]= s2;
        list[2] = s3;
        
        for (int i=0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        
    }
}
