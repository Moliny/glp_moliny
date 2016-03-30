package invest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CompoundingTest {

	
	
	@Test
	public void testCompunding() {
		double F=Compounding.compounding(50000.0, 0.05, 10,1);
		assertThat(F, is(81444.7313388721));
	}

	@Test
	public void testSimple_interest() {
		double F=Compounding.simple_interest(50000, 0.05, 10);
		assertThat(F, is(75000.0));
	}

	@Test
	public void testCount_Deposit() {
		double P=Compounding.Deposit(50000, 0.05, 10,1);
		assertThat(P, is(30695.66267703796));
	}

	
	
	@Test
	public void testCount_invest() {
		double F=Compounding.invest(10000, 0.1, 10,1);
		assertThat(F, is(175311.67061100024));
	}
	
	@Test
	public void testCount_refunt() {
		double P1=Compounding.year_refunt(1000000,0.09, 20);
		//double P2=Compunding.month_refunt(1000000,0.09, 20);
		assertThat(P1, is(98100.0000));
		//assertThat(P2, is(7556.2500));
	}

}
