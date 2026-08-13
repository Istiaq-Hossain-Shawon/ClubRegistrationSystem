 
public class Registration {

    private Activity activity;
    private String mode;

    public Registration(Activity activity, String mode) {
        this.activity = activity;
        this.mode = mode;
    }

    // Getter methods
    public Activity getActivity() {
        return activity;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String toString() {
        return activity.getName() + " [" + activity.getActivityId() + "]"
                + "   -   Mode: " + mode;
    }
}
