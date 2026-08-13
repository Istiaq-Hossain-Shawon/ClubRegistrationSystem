
public class Activity {

    private String activityId;
    private String name;
    private String[] categories;     
    private String timeSlot;
    private boolean requiresCheckIn;
    private boolean hasCompetition;
    private String[] modes;           

    public Activity(String activityId, String name, String[] categories, String timeSlot,
                    boolean requiresCheckIn, boolean hasCompetition, String[] modes) {
        this.activityId = activityId;
        this.name = name;
        this.categories = categories;
        this.timeSlot = timeSlot;
        this.requiresCheckIn = requiresCheckIn;
        this.hasCompetition = hasCompetition;
        this.modes = modes;
    }

    // Getter methods
    public String getActivityId() {
        return activityId;
    }

    public String getName() {
        return name;
    }

    public String[] getCategories() {
        return categories;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public boolean getRequiresCheckIn() {
        return requiresCheckIn;
    }

    public boolean getHasCompetition() {
        return hasCompetition;
    }

    public String[] getModes() {
        return modes;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setRequiresCheckIn(boolean requiresCheckIn) {
        this.requiresCheckIn = requiresCheckIn;
    }

    public void setHasCompetition(boolean hasCompetition) {
        this.hasCompetition = hasCompetition;
    }

    // Checks if this activity belongs to the given category.
    public boolean hasCategory(String category) {
        for (String oneCategory : categories) {
            if (oneCategory.equals(category)) {
                return true;
            }
        }
        return false;
    }

    // Checks if this activity can be attended in the given mode
    public boolean hasMode(String mode) {
        for (String oneMode : modes) {
            if (oneMode.equals(mode)) {
                return true;
            }
        }
        return false;
    }

    public String getCategoryText() {
        String text = "";
        for (int i = 0; i < categories.length; i++) {
            if (i > 0) {
                text = text + " ";
            }
            text = text + categories[i];
        }
        return text;
    }

    public String getModeText() {
        String text = "";
        for (int i = 0; i < modes.length; i++) {
            if (i > 0) {
                text = text + ",";
            }
            text = text + modes[i];
        }
        return text;
    }

    public String getShortText() {
        return activityId + " " + name;
    }

    public String toString() {
        return activityId + " " + name + " ( " + getCategoryText() + " ) "
                + timeSlot + " Mode:[" + getModeText() + "]";
    }
}
