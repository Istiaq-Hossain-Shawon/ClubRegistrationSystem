public class Student extends Person {

    // The largest number of activities one student can join
    private static final int MAX_REGISTRATIONS = 10;

    private String campus;
    private Registration[] registrations;    
    private int registrationCount;          

    public Student(String id, String firstName, String lastName, String campus) {
        super(id, firstName, lastName);
        this.campus = campus;
        this.registrations = new Registration[MAX_REGISTRATIONS];
        this.registrationCount = 0;
    }

    // Getter methods
    public String getCampus() {
        return campus;
    }

    public int getRegistrationCount() {
        return registrationCount;
    }

    public Registration getRegistration(int index) {
        if (index < 0 || index >= registrationCount) {
            return null;
        }
        return registrations[index];
    }

    // Setter method
    public void setCampus(String campus) {
        this.campus = campus;
    }

// Adds one activity to this student.
// It returns false if the array is full or if the student
// is already registered for the same activity.
    public boolean addRegistration(Activity activity, String mode) {
        if (registrationCount >= MAX_REGISTRATIONS) {
            return false;
        }
        if (isRegistered(activity.getActivityId())) {
            return false;
        }
        registrations[registrationCount] = new Registration(activity, mode);
        registrationCount++;
        return true;
    }

 // Checks if this student already joined the activity with the given ID.
    public boolean isRegistered(String activityId) {
        for (int i = 0; i < registrationCount; i++) {
            if (registrations[i].getActivity().getActivityId().equals(activityId)) {
                return true;
            }
        }
        return false;
    }

    public String getRole() {
        return "Student";
    }

    public String toString() {
        return "Student[" + getId() + "]: " + getFullName() + " (" + campus + ")";
    }
}
