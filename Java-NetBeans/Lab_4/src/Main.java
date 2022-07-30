/*
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  for (int i = 0; i < 5; i++) { // จำนวนชั้นของปิรามิด
   for (int j = 0; j < (5-i-1); j++) { // วาดช่องว่างลดลงทีละหนึ่ง 
    System.out.print(" ");
   }
   for (int k = 0; k < (i + 1); k++) { // วาด * เพิ่มขึ้นทีละสอง
    System.out.print("$ ");
   }
   System.out.println();
  }
 }
}
*/

/*
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); 
  int count = scan.nextInt(); 
  for (int i = 1; i < count+1; i++) { 
   for (int k = 1; k < (i + 1); k++) { 
    System.out.print("*");
   }
   System.out.println();
  }
  System.out.println(); 
 }
}
*/

/*
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
		int count = scan.nextInt(); // รอรับข้อมูลมาเก็บในตัวแปร count

		for (int i = 0; i < count; i++) { // จำนวนชั้นของปิรามิด
			for (int j = 0; j < (count - i - 1); j++) { // วาดช่องว่างลดลงทีละหนึ่ง 
				System.out.print(" ");
			}
			for (int k = 0; k < ((2 * i) + 1); k++) { // วาด * เพิ่มขึ้นทีละสอง
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}
*/

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y, r;
        y = in.nextInt();
        r = y % 400 == 0 || y % 100 != 0 && y % 4 == 0 ? 1 : 0;

        switch (r) {
            case 1:
                System.out.println ("Leap Year");
                break;

            case 0:
                System.out.println ("Not a Leap Year");
                break;

            default:
                System.out.println ("Not a Leap Year");
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
  double x =0;
    double a = sn.nextDouble();
    double b = sn.nextDouble();
    double c = sn.nextDouble();
    double d = sn.nextDouble();
    double e = sn.nextDouble();
    x = (a+b+c+d+e)/5;
    
    System.out.println("THAI = "+a);
    System.out.println("MATH = "+b);
    System.out.println("ENGLISH = "+c);
    System.out.println("SCIENCE = "+d);
    System.out.println("SPORT = "+e);
    System.out.println("---");
    System.out.println("GPA = "+x);

 }
}
*/

/*
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
  Scanner sn = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
    String a = sn.nextLine();
    String b = sn.nextLine();
    String c = sn.nextLine();
    String d = sn.nextLine();
    String e = sn.nextLine();
    System.out.println("--- Customer Detail ---");
    System.out.printf("Name : %s %s\n",a,b);
    System.out.printf("Address : %s\n",c);
    System.out.printf("Gender : %s\n",d);
    System.out.printf("Tel : %s\n",e);
 }
}
*/

/*
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
         
        int Score = scan.nextInt();
         
        if(Score >=90 && Score <= 100){
            System.out.print("A");
        }
        else if(Score >= 85 && Score < 90){
            System.out.print("B+");
        }
        else if(Score >= 80 && Score <= 84){
            System.out.print("B");
        }
        else if(Score >= 75 && Score < 80){
            System.out.print("C+");
        }
        else if(Score >= 70 && Score <= 74){
            System.out.print("C");
        }
        else if(Score >= 65 && Score < 70){
            System.out.print("D+");
        }
        else if(Score >= 60 && Score <= 64){
            System.out.print("D");
        }
        else if(Score < 60 && Score >= 0){
            System.out.print("F");
        }
        else if(Score > 100){
          System.out.print("Error : Value must be less than or equal to 100.");
        } 
        else if(Score < 0){
          System.out.print("Error : Value must be greater than or equal to 0.");
        } 
    }
}
*/

/*
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // ประกาศตัวแปรเพื่อรับข้อมูลจากคีบอร์ด
  int num1, num2, num3; // ประกาศตัวแปรเพื่อเก็บตัวเลข 3 ตัว

                num1 = scan.nextInt(); // รอรับข้อมูลตัวเลขที่ 1

                num2 = scan.nextInt(); // รอรับข้อมูลตัวเลขที่ 2

                num3 = scan.nextInt(); // รอรับข้อมูลตัวเลขที่ 3

  int max = num1; // เก็บค่าตัวเลขที่ 1 ไว้ในตัวแปร max รอการเปรีบบเทียบกับตัวอื่น
  if (num2 > max) { // เปรียบเทียบตัวเลขที่ 2 ถ้าตัวเลขที่ 2 มากกว่าเก็บค่าที่มากกว่าไว้ใน max
   max = num2; 
  }
  if (num3 > max) { // เปรียบเทียบตัวเลขที่ 3 ถ้าตัวเลขที่ 3 มากกว่าเก็บค่าที่มากกว่าไว้ใน max
   max = num3; 
  }
  System.out.println("MAX : " + max); // แสดงค่าตัวแปร max
 }
}
*/

/*
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // สร้างตัวแปรสำหรับรับค่าจากคีบอร์ด
  int count = scan.nextInt(); // รอรับข้อมูลมาเก็บในตัวแปร count
  int x,i,sum = 0;
  for (i = 0; i < count; i++) { // จำนวนชั้นของปิรามิด
    x = scan.nextInt();
    sum = sum+x;
   }
  System.out.printf("%d THB",sum);
 }
}
*/

/*
import java.util.Arrays;
import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    int x,i;
    int [] a;
    a = new int[5];
    Scanner sn = new Scanner(System.in);
    for(i=0;i<a.length;i++)
    {
      x = sn.nextInt();
      a[i] = x;
    }
    Arrays.sort(a);
    for(i=0;i<a.length;i++)
    {
      System.out.println(a[4-i]);
    }
  }
}
*/

/*
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      int ROW = sn.nextInt();
        int score[] = new int[ROW];


        // Assigning values
        for (int i = 0; i < ROW; i++) {          
                score[i] = sn.nextInt();

            }
Arrays.sort(score);
        for (int i = 0; i < ROW; i++) {
            
                System.out.println(+ score[ROW-i-1]);
            }

    }
}
*/

/*
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      int ROW = sn.nextInt();
      String a[] = new String[ROW];
      int score[] = new int[ROW];
      String b[] = new String[ROW];
      String c[] = new String[ROW];
      int d[] = new int[ROW];
      d[0] = 0;

        // Assigning values
        for (int i = 0; i < ROW; i++) { 
                //System.out.print("a = \n");
                a[i] = sn.nextLine();
                //System.out.print("b = \n");
                b[i] = sn.nextLine();
                //System.out.print("score = \n");
                score[i] = sn.nextInt();              
                d[i] = 2017-score[i];
                
                //System.out.print("c = \n");
                c[i] = sn.next();
            }
System.out.println("--Customers Information--");
        for (int i = 0; i < ROW; i++) {
                //System.out.println("i = "+i);
                //System.out.printf("a = %s \n",a[i]);
                
                System.out.printf("%s (age : %d)\n",b[i],d[i]);                
                //System.out.println("score = "+ score[i]);
                //System.out.printf("c = %s \n",c[i]);
            }

    }
}
*/

/*
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      int ROW = sn.nextInt();
        int score[] = new int[ROW];

        for (int i = 0; i < ROW; i++) {          
                score[i] = sn.nextInt();
            }

        for (int i = 0; i < ROW; i++) {
            
                System.out.println(+ score[ROW-i-1]);
            }
    }
}
*/

/*
import java.util.Scanner;

public class Main{

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); // ประกาศตัวแปรเพื่อรับข้อมูลจากคีบอร์ด
                String str; // ประกาศตัวแปรเพื่อเก็บข้อความ

  //System.out.print("Input : ");
                str = scan.nextLine(); // รอรับข้อมูลข้อความ
  //System.out.print("Output : ");
  for (int i = (str.length() - 1); i >= 0; i--) { // ตั้ง index เพื่ออ้างอิงตำแหน่งสุดท้ายก่อน
   System.out.print(str.charAt(i)); // แสดงตัวอักษรทีละตัวตาม index
  }

  System.out.println();
 }
}
*/