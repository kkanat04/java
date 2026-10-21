package lab3.Student1;

public class AliasDemo {
    public static void main(String[] args) {

        Student a = new Student("Ada", 1);
        Student b = new Student("Alan", 2);

        b = a;

        b.name = "Augusta";

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
