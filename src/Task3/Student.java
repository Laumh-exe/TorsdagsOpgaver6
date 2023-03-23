package Task3;

import java.util.ArrayList;

public class Student extends Person{

    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;

    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        currentCourses = new ArrayList<>();
    }

    @Override
    public boolean addCourse(String course) {

        for(String s:passedCourses) {
            if(s.equals(course)) {
                return false;
            }
        }

        currentCourses.add(course);
        return true;


    }

}
