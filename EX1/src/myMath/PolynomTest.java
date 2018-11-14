package myMath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class PolynomTest {

	@Test
	void testPolynom() {
		Polynom p=new Polynom();
		if(p==null)
			fail("p does not exist");
		if(p.size()!=0)
			fail("ERR:already existed polynom");
		p.add(new Monom(2,4));
		if(p.size()==0)
			fail("ERR:the polynom can not be empty after adding monom");
	}



	@Test
	void testF() {
		Polynom p=new Polynom();
		p.add(new Monom(2,3));
		p.add(new Monom(2,4));
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		if(p.f(2)!=62)
			fail("ERR:wrong answer");
	}

	@Test
	void testAddPolynom_able() {
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(2,1));
		System.out.println(p1.toString());
		p.add(p1);
		Polynom s=new Polynom();
		s.add(new Monom(4,2));
		s.add(new Monom(4,1));
		s.add(new Monom(2,0));
		if(!s.equals(p))
			fail("ERR:p and s have to be equal");
	}

	@Test
	void testSubstractMonom() {
		System.out.println("testSubstractMonom");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Monom s=new Monom(2,2);
		p.substract(s);
		Polynom p1=new Polynom();
		p1.add(new Monom(2,1));
		p1.add(new Monom(2,0));
		if(!p1.equals(p))
			fail("ERR:p and p1 have to be equal");	}

	@Test
	void testSubstractPolynom_able() {
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(2,1));
		System.out.println(p1.toString());
		p.substract(p1);
		Polynom s=new Polynom();
		s.add(new Monom(2,0));
		if(!s.equals(p))
			fail("ERR:p and s have to be equal");
	}

	@Test
	void testAddMonom() {
		System.out.println("testSubstractMonom");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Monom s=new Monom(2,2);
		p.add(s);
		Polynom p1=new Polynom();
		p1.add(new Monom(4,2));
		p1.add(new Monom(2,1));
		p1.add(new Monom(2,0));
		if(!p1.equals(p))
			fail("ERR:p and p1 have to be equal");
	}

	@Test
	void testMultiply() {
		System.out.println("multiply");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		System.out.println(p.toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(2,1));
		System.out.println(p1.toString());
		p.multiply(p1);
		System.out.println(p.toString());
		Polynom s=new Polynom();
		s.add(new Monom(4,4));
		s.add(new Monom(8,3));
		s.add(new Monom(8,2));
		s.add(new Monom(4,1));
		if(!s.equals(p))
			fail("ERR:p and s have to be equal");
	}

	@Test
	void testSize() {
		System.out.println("size");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		p.add(new Monom(2,0));
		if(p.size()!=3)
			fail("ERR:wrong size");
	}

	@Test
	void testEqualsPolynom_able() {
		System.out.println("equals");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		System.out.println(p.toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(2,1));
		System.out.println(p1.toString());
		System.out.println(p.equals(p1));
		if(!p.equals(p1))
			fail("ERR:p and p1 have to be equal");
	}

	@Test
	void testIsZero() {
		System.out.println("equals");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		if(p.isZero()&&p.size()!=0)
			fail("ERR:if the polynom is the zero polynom then its size have to be zero");
	}

	@Test
	void testRoot() {
		Polynom p=new Polynom();
		p.add(new Monom(-100,0));
		p.add(new Monom(1,3));
		double eps=0.01;
		double root0=p.root(0, 100, eps);
		System.out.println(root0);
		System.out.println(p.f(root0));
		if(Math.abs(p.f(root0))>=eps)
			fail("ERR:the function root is not in the required eps");
	}

	@Test
	void testDerivative() {
		System.out.println("testDerivative");
		Polynom p=new Polynom();
		p.add(new Monom(2,2));
		p.add(new Monom(2,1));
		System.out.println(p.toString());
		System.err.println(p.derivative().toString());
		Polynom p1=new Polynom();
		p1.add(new Monom(4,1));
		p1.add(new Monom(2,0));
		System.out.println(p1.toString());
		System.out.println(p.derivative().equals(p1));
		if(!p.derivative().equals(p1))
			fail("ERR:the p and p1 derivative are not equal");
	}

	@Test
	void testArea() {
		Polynom p1=new Polynom();
		p1.add(new Monom(2,2));
		p1.add(new Monom(5,1));
		p1.add(new Monom(10,0));
		double x=p1.area(-5, 5, 0.08);
		System.out.println(x);
		x=p1.area(-5, 5, 0.09);
		System.out.println(x);
		Polynom p=new Polynom();
		p.add(new Monom(9,4));
		p.add(new Monom(4,2));
		p.add(new Monom(7,1));
		p.add(new Monom(5,0));
		x=p.area(-2, 0, 0.04);
		System.out.println(x);
		System.out.println();
	}

	@Test
	void testPolynomString() {
		System.out.println("tostring----------------");
		String s="3x^8 -5x^3+2x^4 -1x";
		Polynom p1=new Polynom(s);
		System.out.println(p1);
		Polynom p=new Polynom();
		p.add(new Monom(3,8));
		p.add(new Monom(-5,3));
		p.add(new Monom(2,4));
		p.add(new Monom(-1,1));
		if(!p.equals(p1))
			fail("ERR:p and p1 have to be equal");
	}

}



