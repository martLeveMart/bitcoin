package helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
  @Test
  public void successfulResponse() {
    App app = new App();
    String result = app.handleRequest(new infRequete(3.0, "EUR,USD"), null);
    String content = result;
    System.out.println(content);
    assertTrue(content.contains("\"EUR\""));
    assertTrue(content.contains("\"USD\""));
    assertTrue(content.contains("\"bitcoinAmount\""));
  }
}
