public class Task {
    String title;
    String description;
    boolean completed;
    public Task(String t, String d){
        title = t;
        description = d;
        completed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }
    public void markCompleted(){
      completed = true;
    }

}
