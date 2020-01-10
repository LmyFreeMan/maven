package practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pratice.Hellow;

public class HellowTest {
	@Test
	public void testSayHello() {
		Hellow hellow=new Hellow();
		String result=hellow.sayHello("zs");
		assertEquals("hello,zs", result);
	}
}
