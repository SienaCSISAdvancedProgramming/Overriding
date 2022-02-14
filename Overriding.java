import java.util.ArrayList;

/**
 * Example demonstrating overriding of methods in subclasses
 *
 * @author Jim Teresco,
 *         Siena College, Computer Science 225, Spring 2017
 *         Based heavily on example from Darren Lim
 * @version Spring 2022
 */

class Student {
    public String name = "Fred";

    protected void getName() {
        System.out.println(name);
    }
}

class Undergraduate extends Student {
    @Override
    protected void getName() {
        System.out.println("Undergraduate : " + name);
    }
}

class Freshman extends Undergraduate {
}

class Graduate extends Student {
    @Override
    protected void getName() {
        System.out.println("Graduate : " + name);
    }

}

class Phd extends Graduate {
    @Override
    protected void getName() {
        System.out.println("Phd : " + name);
    }
}

public class Overriding {

    public static void main(String[] args) {
        // populate an ArrayList with Student objects and instances of derived classes
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student());
        students.add(new Undergraduate());
        students.add(new Freshman());
        students.add(new Graduate());
        students.add(new Phd());

        // let's call each one's getName method
        for (Student s : students) {
            s.getName();
        }
    }
}
