package Lab1;

public class StringDemo
{
    public static void main(String[] args) {
        String name = "John" + " " + "Doe";
        String firstname = "John";
        String lastname = "Doe";
        String fullname = String.format("%s %s", firstname, lastname);

        int age = 20;
        double gpa = 3.815;
        char grade = 'A';
        String info = String.format("Name: %s, age: %d, gpa: %.3f, grade: %c", firstname, age, gpa, grade);

        // System.out.println(name);
        // System.out.println();
        // System.out.println(firstname + " " + lastname);
        // System.out.println();
        //System.out.println(fullname);
        // System.out.println();
        System.out.println(info);
        System.out.printf("Name: %s\nage: %d\ngpa: %.3f\ngrade: %c\n\n", firstname, age, gpa, grade);


        // ----------------------
        // --- String methods ---
        // ----------------------

        System.out.printf("0. %s\n", name);
        System.out.printf("1. %s\n", name.replace("John", "Jane")); // Strings are immutable
        System.out.printf("2. %s\n", name);
        name = name.replace("John", "Jane");
        System.out.printf("3. %s\n\n", name);

        System.out.printf("Nb of chars: %d\n\n", name.length());

        System.out.printf("%s\n", name.toUpperCase());
        System.out.printf("%s\n", name.toLowerCase());
        System.out.printf("%s\n\n", name);

        System.out.printf("Initials: %s.%s\n\n", name.charAt(0), name.charAt(5));

        System.out.printf("First name: %s\nLast name: %s\n\n", name.substring(0, 4), name.substring(5, 8));
    }
}
