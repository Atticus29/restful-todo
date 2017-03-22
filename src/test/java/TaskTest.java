import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {
  @Test
  public void isCompleted_isFalseAfterInstantiation_false(){
    Task myTask = new Task("Mow the lawn");
    assertEquals(false, myTask.isCompleted());
  }

  @Test
  public void getDescription_returnsDescription_true(){
    Task testTask = new Task("Use to-do list");
    assertEquals("Use to-do list", testTask.getDescription());
  }
}
