/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class LE0{
    
    class Student {
        String name;
        int age;
        
     
        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        void setName(String name) {
            this.name = name;
        }
        
        void setAge(int age) {
            this.age = age;
        }
        
        String getName() {
            return name;
        }
        
        int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
 
        LE0 main = new LE0();
        LE0.Student student = main.new Student("mridul", 20);
        
       
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

