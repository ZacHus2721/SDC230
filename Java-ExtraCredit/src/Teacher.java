public class Teacher extends Person {

    private Course course;

    public Teacher(String name, int age, Course course) {
        super(name, age);
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public void displayRole() {
        System.out.println("I am a teacher.");
    }
}