package testes;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperatorsUnit {

	@Test
	public void test() {
		Operators op = new Operators();
		int a = 3,b = 3;
		int result = op.sum(a, b);
		assertEquals(6, result);
	}

}
