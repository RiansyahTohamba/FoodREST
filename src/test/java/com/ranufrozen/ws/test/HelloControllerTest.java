package com.ranufrozen.ws.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.ranufrozen.ws.HelloController;


public class HelloControllerTest {
	@Test
	void hello() {
//		proses building di maven nya bagaimana?
		
		HelloController controller = new HelloController();
		String response = controller.hello();
		assertEquals("Hello, World", response);
	}
}
