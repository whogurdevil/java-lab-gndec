public class student {
    String name;
    int age;
    String cls;
    int roll;

    student(){
        name = "";
        age = 0;
        cls = "";
        roll = 0;
    }
    student(String name, int age, String cls, int roll){
        this.name = name;
       this.age = age;
       this.cls = cls;
        this.roll = roll;
    }
// this keyword is used to refer the class variables from global variables
    void printData(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Class = "+cls);
        System.out.println("Roll Number = "+roll);
    }

    public static void main(String[] args) {
        student harry = new student();//student with default values
        harry.name = "Harry";
        harry.age = 15;
        harry.cls = "B.Tech CSE 2nd";
        harry.roll = 21;
        student ekus = new student("Ekuspreet",21,"B.Tech CSE 3rd",97);
        harry.printData();
        ekus.printData();
    }
}
