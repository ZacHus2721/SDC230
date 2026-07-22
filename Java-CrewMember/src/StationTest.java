public class StationTest {

    public static void main(String[] args) {

        CrewMember crew1 = new CrewMember("Vegapunk", "Scientist", 6, "Research");
        CrewMember crew2 = new CrewMember("Master Chief", "Pilot", 12, "Flight Operations");
        CrewMember crew3 = new CrewMember("Juliette Nichols", "Engineer", 4, "Maintenance");

        System.out.println("Space Station Crew Roster\n");

        System.out.println("Name: " + crew1.getName());
        System.out.println("Role: " + crew1.getRole());
        System.out.println("Years of Service: " + crew1.getYearsOfService());
        System.out.println("Department: " + crew1.getDepartment());
        System.out.println();

        System.out.println("Name: " + crew2.getName());
        System.out.println("Role: " + crew2.getRole());
        System.out.println("Years of Service: " + crew2.getYearsOfService());
        System.out.println("Department: " + crew2.getDepartment());
        System.out.println();

        System.out.println("Name: " + crew3.getName());
        System.out.println("Role: " + crew3.getRole());
        System.out.println("Years of Service: " + crew3.getYearsOfService());
        System.out.println("Department: " + crew3.getDepartment());
    }
}