/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;

/**
 *
 * @author BANK
 */
class Address
{
    String houseNum;
    String streetName;
    String city;
    String province;
    String country;
    int zipCode;
    Address(String houseNum, String streetName, String city, String province,
            String country, int zipCode)
    {
        this.houseNum = houseNum;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
        this.country = country;
        this.zipCode = zipCode;      
    }
}
class Student
{
    int ID;
    String Name;
    Address studentAddress;
    Student(int ID, String Name, Address studentAddress)
    {
        this.ID = ID;
        this.Name = Name;
        this.studentAddress = studentAddress;
        
    }
}
public class Lab_1 {
    public static void main(String[] args) {
        Address st1_ad = new Address("99/68", "Pahon", "Klong", "Phathum", "Thai", 12120);
        Student student1 = new Student(1620900997, "God Tee", st1_ad);
        System.out.println(student1.ID+" "+student1.Name+" "+
                student1.studentAddress.houseNum+" "+student1.studentAddress.streetName+" "+
                student1.studentAddress.city+" "+student1.studentAddress.province+" "+
                student1.studentAddress.country+" "+student1.studentAddress.zipCode);
        
        Address st2_ad = new Address("27/641", "Khan", "Rak", "Bank", "Thai", 10160);
        Student student2 = new Student(25120, "Tep", st2_ad);
        System.out.println(student2.ID+" "+student2.Name+" "+
                student2.studentAddress.houseNum+" "+student2.studentAddress.streetName+" "+
                student2.studentAddress.city+" "+student2.studentAddress.province+" "+
                student2.studentAddress.country+" "+student2.studentAddress.zipCode);
        
        Address st3_ad = new Address("55/555", "Python", "King", "Zoro", "American", 55555);
        Student student3 = new Student(1620900997, "Roronoa", st3_ad);
        System.out.println(student3.ID+" "+student3.Name+" "+
                student3.studentAddress.houseNum+" "+student3.studentAddress.streetName+" "+
                student3.studentAddress.city+" "+student3.studentAddress.province+" "+
                student3.studentAddress.country+" "+student3.studentAddress.zipCode);
    }    
    }    

