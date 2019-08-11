package cis120.section2.lab03.recursion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class FibTest {

	@Test
	void test_fib1_0_elements() {
		Assert.assertEquals(0, Fib.fib1(0));
	}

	@Test
	void test_fib1_5_elements() {
		Assert.assertEquals(5, Fib.fib1(5));
	}

	@Test
	void test_fib1_10_elements() {
		Assert.assertEquals(55, Fib.fib1(10));
	}

	@Test
	void test_fib1_20_elements() {
		Assert.assertEquals(6765, Fib.fib1(20));
	}

	@Test
	void test_fib2_0_elements() {
		Assert.assertEquals(0, Fib.fib1(0));
	}

	@Test
	void test_fib2_5_elements() {
		Assert.assertEquals(5, Fib.fib2(5));

	}

	@Test
	void test_fib2_10_elements() {
		Assert.assertEquals(55, Fib.fib2(10));

	}

	@Test
	void test_fib2_20_elements() {
		Assert.assertEquals(6765, Fib.fib2(20));

	}

}
