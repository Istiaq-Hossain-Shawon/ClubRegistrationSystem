 
public class ClubRegistrationSystem {

    public static final String AUCKLAND = "Auckland";
    public static final String PALMERSTON_NORTH = "PN";
    public static final String ONLINE = "Online";

    private static final int MAX_ACTIVITIES = 20;
    private static final int MAX_STUDENTS = 50;

    private String systemName;
    private Activity[] activities;      
    private int activityCount;
    private Student[] students;         
    private int studentCount;

    public ClubRegistrationSystem(String systemName) {
        this.systemName = systemName;
        this.activities = new Activity[MAX_ACTIVITIES];
        this.activityCount = 0;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }

    // Getter and setter methods
    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public int getActivityCount() {
        return activityCount;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public Activity getActivity(int index) {
        if (index < 0 || index >= activityCount) {
            return null;
        }
        return activities[index];
    }

    public Student getStudent(int index) {
        if (index < 0 || index >= studentCount) {
            return null;
        }
        return students[index];
    }
       // Adds one activity to the system
    public boolean addActivity(Activity activity) {
        if (activityCount >= MAX_ACTIVITIES) {
            return false;
        }
        activities[activityCount] = activity;
        activityCount++;
        return true;
    }
 
}
