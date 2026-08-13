/**
 Student ID : 25014618
 Name       : Istiaq Hossain
 */
public class Main {

    // My own details
    private static final String MY_ID = "25014618";
    private static final String MY_FIRST_NAME = "Istiaq";
    private static final String MY_LAST_NAME = "Hossain";
    private static final String MY_CAMPUS = ClubRegistrationSystem.AUCKLAND;

    public static void main(String[] args) {

         
    }

    // Adds the six activities of the test data to the system
    private static void addActivities(ClubRegistrationSystem system) {
        String auckland = ClubRegistrationSystem.AUCKLAND;
        String pn = ClubRegistrationSystem.PALMERSTON_NORTH;
        String online = ClubRegistrationSystem.ONLINE;

        system.addActivity(new Activity("A101", "Basketball Club",
                new String[]{"Sport"}, "Wednesday PM",
                true, true, new String[]{auckland, pn}));

        system.addActivity(new Activity("A102", "Coding Circle",
                new String[]{"Technology"}, "Saturday AM",
                true, false, new String[]{auckland, pn, online}));

        system.addActivity(new Activity("A103", "Choir Group",
                new String[]{"Art"}, "Monday PM",
                false, false, new String[]{auckland, pn}));

        system.addActivity(new Activity("A104", "Robotics Workshop",
                new String[]{"Technology"}, "Friday PM",
                false, true, new String[]{auckland, pn}));

        system.addActivity(new Activity("A105", "Creative Writing Club",
                new String[]{"Literature"}, "Thursday PM",
                true, false, new String[]{auckland, pn, online}));

        system.addActivity(new Activity("A106", "Hiking Group",
                new String[]{"Sport", "Lifestyle"}, "Sunday AM",
                true, false, new String[]{auckland, pn}));
    }

    // Adds the nine students of the test data to the system
    private static void addStudents(ClubRegistrationSystem system) {
        String auckland = ClubRegistrationSystem.AUCKLAND;
        String pn = ClubRegistrationSystem.PALMERSTON_NORTH;

        system.addStudent(new Student("1105236", "Amy", "Sheffield", pn));
        system.addStudent(new Student("1235894", "Victoria", "Jensen", pn));
        system.addStudent(new Student("7225669", "James", "Lee", pn));
        system.addStudent(new Student("1328991", "Colin", "Delmont", pn));
        system.addStudent(new Student("1562347", "Thomas", "Becker", auckland));
        system.addStudent(new Student("5664789", "Steven", "Hobbs", auckland));
        system.addStudent(new Student("3658947", "Andrew", "Jackson", auckland));
        system.addStudent(new Student("6332698", "Jonathon", "Wood", auckland));
        system.addStudent(new Student("2455897", "Emma", "Smith", auckland));
    }
}
