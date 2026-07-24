public class StudentTest {

    public static void main(String[] args) {

        Course java = new Course("Java Programming");
        Course database = new Course("Database Systems");
        Course networking = new Course("Networking");

        Teacher t1 = new Teacher("Mr. Smith", 45, java);
        Teacher t2 = new Teacher("Mrs. Johnson", 40, database);
        Teacher t3 = new Teacher("Mr. Brown", 38, networking);

        Student[] students;

        try {

            students = new Student[]{
                    new Student("Alice", 20, 95, java),
                    new Student("Bob", 21, 88, database),
                    new Student("Charlie", 19, 79, networking),
                    new Student("David", 22, 92, java)
            };

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Students and Grades");
        System.out.println("--------------------");

        double total = 0;
        double highest = 0;

        for (Student s : students) {
            System.out.println(
                    s.getName() + " - "
                    + s.getCourse().getCourseName()
                    + " : "
                    + s.getGrade());

            total += s.getGrade();

            if (s.getGrade() > highest) {
                highest = s.getGrade();
            }
        }

        System.out.println();

        System.out.println("Teachers and Courses");
        System.out.println("--------------------");

        Teacher[] teachers = {t1, t2, t3};

        for (Teacher t : teachers) {
            System.out.println(
                    t.getName()
                    + " teaches "
                    + t.getCourse().getCourseName());
        }

        System.out.println();

        System.out.println("Highest Grade: " + highest);

        double average = total / students.length;

        System.out.printf("Average Grade: %.2f%n", average);

        System.out.println();

        System.out.println("Polymorphism Demo");
        System.out.println("-----------------");

        Person[] people = {
                students[0],
                students[1],
                t1,
                t2
        };

        for (Person p : people) {
            p.displayRole();
        }

        System.out.println();
        System.out.println("School: " + Course.SCHOOL);
    }
}