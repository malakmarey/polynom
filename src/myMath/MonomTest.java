package myMath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MonomTest {

	@Test
	void testMonomString() {
		Monom m =new Monom("2x^4");
		Monom a=new Monom(2,4);
		if(!m.equals(a))
			fail("ERR:both Monom have to be equals");
	}

	@Test
	void testMultiply() {
		double coef0=Math.random()*100+1;
		double coef1=Math.random()*100+1;
		int power0=(int)(Math.random()*100+1);
		int power1=(int)(Math.random()*100+1);
		Monom m1=new Monom(coef0,power0);
		Monom m2=new Monom(coef1,power1);
		m1.multiply(m2);
		if(m1.get_coefficient()!=coef0*coef1||m1.get_power()!=power0+power1)
			fail("ERR:both Monom have to be equals");
	}

	@Test
	void testDerivative() {
		double coef0=Math.random()*100+1;
		int power0=(int)(Math.random()*100+1);
		Monom m0=new Monom(coef0,power0);
		m0.derivative();
		if(m0.get_coefficient()!=power0*coef0||m0.get_power()!=power0-1)
			fail("ERR:");
	}

	@Test
	void testAdd() {
		double coef0=Math.random()*100+1;
		double coef1=Math.random()*100+1;
		int power0=4;
		int power1=4;
		Monom m1=new Monom(coef0,power0);
		Monom m2=new Monom(coef1,power1);
		m1.add(m2);
		if((m1.get_coefficient()!=coef0+coef1)&&power0==power1)
			fail("Not yet implemented");
	}

	@Test
	void testSubstract() {
		double coef0=Math.random()*100+1;
		double coef1=Math.random()*100+1;
		int power0=(int)(Math.random()*3+1);
		int power1=2;
		Monom m1=new Monom(coef0,power0);
		Monom m2=new Monom(coef1,power1);
		m1.substract(m2);
		if(m1.get_coefficient()!=coef0-coef1&&power0==power1)
			fail("Not yet implemented");
	}
	@Test
	void testMonomDoubleInt() {
		double coef0=Math.random()*100+1;
		int power0=(int)(Math.random()*100+1);
		Monom m0=new Monom(coef0,power0);
		if(m0.get_coefficient()!=coef0||m0.get_power()!=power0)
			fail("Not yet implemented");
	}

	@Test
	void testMonomMonom() {
		double coef0=Math.random()*100+1;
		int power0=(int)(Math.random()*100+1);
		Monom m0=new Monom(coef0,power0);
		Monom m1=new Monom(m0);
		if(m1.get_coefficient()!=coef0||m1.get_power()!=power0)
			fail("Not yet implemented");
	}

	@Test
	void testF() {
		double coef0=Math.random()*100+1;
		int power0=(int)(Math.random()*10+1);
		Monom m0=new Monom(coef0,power0);
		double x=Math.random()*100+1;
		if(coef0*Math.pow(x, power0)!=m0.f(x))
			fail("Not yet implemented");
	}

	@Test
	void testToString() {
		double coef0=Math.random()*100+1;
		int power0=(int)(Math.random()*10);
		Monom m0=new Monom(coef0,power0);
		if(power0>0) {
			if(!m0.toString().equals(""+m0.get_coefficient()+"x^"+m0.get_power()))
				fail("ERR:the power or the coef are not equals");
		}
		else if(power0==1) {
			if(!m0.toString().equals(""+m0.get_coefficient()+"x"))
				fail("ERR:the power or the coef are not equals");
		}
		else if(power0==0) 
			if(!m0.toString().equals(""+m0.get_coefficient()))
				fail("ERR:the power or the coef are not equals");

	}

}
