
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CreateMessageTest {

	@Test
	public void test_get_message() {
		CreateMessage obj = new CreateMessage();
		assertEquals(7, obj.addition(2, 5));
	}
 
}
