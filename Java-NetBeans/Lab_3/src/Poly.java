class Person{
    String name;
    String bornPlace;
    int bornYear;
    
    public Person(String name, String bornPlace, int bornYear ){
        this.name = name;
        this.bornPlace = bornPlace;
        this.bornYear = bornYear;
    }
    public void introduce(){
         System.out.print("My name is "+name+", ");
         System.out.println(" I was born in "+bornPlace+" in "+bornYear+".");
    }
}

class Teacher extends Person{
    String work;
    public Teacher(String name, String bornPlace, int bornYear, String work){
        super(name, bornPlace, bornYear);
        this.work = work;
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("I'm a teacher and work in  "+work+".");
    }
}
  
class Student extends Person{
    String study;
    public Student(String name, String bornPlace, int bornYear, String study){
        super(name, bornPlace, bornYear);
        this.study = study;
    }
    @Override
    public void introduce(){
        super.introduce();
        System.out.println("I'm a student and study in  "+study+".");
    }
}

public class Poly {
    public static void main(String[] args) {
        //Person person1 = new Person( . . . );
        Person person1, person2, person3;
        person1 = new Person("Python", "New York", 1989);
        person2 = new Teacher("Java", "Microsystems", 1995,"com sci");
        person3 = new Student("Bose", "Microsoft", 1989, "com en");
        //Polymorphism
        person1.introduce();
        person2.introduce();
        person3.introduce();
    }
    
}
