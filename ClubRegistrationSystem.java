 
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
     // Adds one student to the system
    public boolean addStudent(Student student) {
        if (studentCount >= MAX_STUDENTS) {
            return false;
        }
        students[studentCount] = student;
        studentCount++;
        return true;
    }
    
    public void assignStudentsRandomly() {
        for (int i = 0; i < activityCount; i++) {
            Student student = students[randomNumber(studentCount)];
            registerStudent(student, activities[i]);
        }
        
        for (int i = 0; i < studentCount; i++) {
            int howMany = 1 + randomNumber(4);
            for (int j = 0; j < howMany; j++) {
                Activity activity = activities[randomNumber(activityCount)];
                registerStudent(students[i], activity);
            }
        }
    }
    // Registers one student for one activity using a suitable mode.
    private boolean registerStudent(Student student, Activity activity) {
        String mode = chooseMode(student, activity);
        if (mode == null) {
            return false;
        }
        return student.addRegistration(activity, mode);
    }

    private String chooseMode(Student student, Activity activity) {
        boolean campusIsPossible = activity.hasMode(student.getCampus());
        boolean onlineIsPossible = activity.hasMode(ONLINE);

        if (campusIsPossible && onlineIsPossible) {
            if (randomNumber(2) == 0) {
                return ONLINE;
            }
            return student.getCampus();
        }
        if (onlineIsPossible) {
            return ONLINE;
        }
        if (campusIsPossible) {
            return student.getCampus();
        }
        return null;   
    }

    private int randomNumber(int limit) {
        return (int) (Math.random() * limit);
    }

    public Activity findActivity(String activityId) {
        for (int i = 0; i < activityCount; i++) {
            if (activities[i].getActivityId().equals(activityId)) {
                return activities[i];
            }
        }
        return null;
    }
 
}
