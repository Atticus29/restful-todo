public class Task {
  private String mDescription;
  private boolean mCompleted;

  public Task(String description){
    mDescription = description;
    mCompleted = false;

  }

  public boolean isCompleted(){
    return mCompleted;
  }

  public String getDescription(){
    return mDescription;
  }
}
