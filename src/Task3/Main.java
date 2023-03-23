package Task3;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        // Instantiate all Arraylists
        ArrayList<String> canTeach1 = new ArrayList<>();
        ArrayList<String> canTeach2 = new ArrayList<>();
        ArrayList<String> canTeach3 = new ArrayList<>();
        ArrayList<String> canTeach4 = new ArrayList<>();
        ArrayList<String> passedCourses1 = new ArrayList<>();
        ArrayList<String> passedCourses2 = new ArrayList<>();
        ArrayList<String> passedCourses3 = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();

        // Add courses to canTeach
        canTeach1.add("Spanish");
        canTeach1.add("Math");
        canTeach2.add("Religion");
        canTeach2.add("History");
        canTeach3.add("Computer Science");
        canTeach3.add("Chemistry");
        canTeach4.add("Java 1.O");

        // Add courses to passedCourses
        passedCourses1.add("Math");
        passedCourses1.add("Religion");
        passedCourses2.add("Computer Science");
        passedCourses3.add("Java 1.O");

        // Add students to persons arraylists
        persons.add(new Student("John", passedCourses1));
        persons.add(new Student("Simon", passedCourses2));
        persons.add(new Student("Jack", passedCourses2));
        persons.add(new Student("Michael", passedCourses3));

        // Add teachers to persons arrayLists
        persons.add(new Teacher("Niko", canTeach1));
        persons.add(new Teacher("Donald", canTeach2));
        persons.add(new Teacher("Rick", canTeach3));
        persons.add(new Teacher("Joey", canTeach4));

        for(Person p:persons) {
            if(!p.addCourse("Java 1.O")) {

                System.out.print(p.getName());
                if(p instanceof Teacher) {
                    System.out.print(" Can't teach this course \n");
                }
                else {
                    System.out.print(" Has already passed this course \n");
                }
            }

        }



    }
}
