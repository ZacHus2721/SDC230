public class Student extends Person {

    private double grade;
    private Course course;

    public Student(String name, int age, double grade, Course course) {
        super(name, age);

        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }

        this.grade = grade;
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public void displayRole() {
        System.out.println("I am a student.");
    }
}