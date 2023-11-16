// Define the 'Sports' interface
interface Sports {
    float sportwt = 6.0F;
    void putwt();
}

// Define the 'Student' class
class Student {
    int rollnumber;

    void getNumber(int roll) {
        rollnumber = roll;
    }

    void putNumber() {
        System.out.println("Rollno:" + rollnumber);
    }
}

// Define the 'Test' class as a subclass of 'Student' and implements 'Sports' interface
class Test extends Student implements Sports {
    float term1, term2;

    void getMarks(float t1, float t2) {
        term1 = t1;
        term2 = t2;
    }

    void putMarks() {
        System.out.println("Marks obtained");
        System.out.println("Term 1=" + term1);
        System.out.println("Term 2=" + term2);
        putwt();
        System.out.println("Total Score=" + (term1 + term2 + sportwt));
    }

    // Implement the abstract method from 'Sports' interface
    public void putwt() {
        System.out.println("Sports weightage=" + sportwt);
    }
}

// Define the 'Results' class which extends 'Test'
class Results extends Test {
    // This class inherits features from both 'Test' and 'Sports' (via 'Test').

    public static void main(String[] args) {
        // Create an instance of 'Results' class
        Results result = new Results();

        // Set roll number and marks
        result.getNumber(12);
        result.getMarks(27.5F, 33);

        // Display the results
        result.putNumber();
        result.putMarks();
    }
}
