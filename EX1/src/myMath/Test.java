package myMath;

public class Test {
	public static void main(String[] args) {
		/*
		Polynom p=new Polynom();
	 	p.add(new Monom(2,8));
	 	p.add(new Monom(2,7));
	 	p.add(new Monom(2,6));
	 	p.add(new Monom(2,5));
	 	p.add(new Monom(2,4));
	 	p.add(new Monom(2,3));
	 	Graph frame = new Graph(p,-5,5);
        frame.setVisible(true);
        */
		Polynom p3=new Polynom();
	 	p3.add(new Monom(2,8));
	 	p3.add(new Monom(2,7));
	 	p3.add(new Monom(2,6));
	 	p3.add(new Monom(2,5));
	 	System.out.println(p3.toString());
	 	double _coefficient1 = Math.random()*1000 ;
		int _pow1 = (int)(Math.random()*10) ;
		double _coefficient2 = Math.random()*1000 ;
		int _pow2 = (int)(Math.random()*10) + 11 ;
		double _coefficient3 = Math.random()*1000 ;
		int _pow3 = (int)(Math.random()*10) + 22;
		String s = "" + _coefficient1 + "X^" + _pow1 + " + " + _coefficient2 + "X^" + _pow2 + " + " + _coefficient3 + "X^" + _pow3 ;
		Polynom p = new Polynom("" + _coefficient1 + "X^" + _pow1 + " " + _coefficient2 + "X^" + _pow2 + " " + _coefficient3 + "X^" + _pow3 );

		System.out.println(s);
		System.out.println(p.toString());
		System.out.println(p.toString().equals(s));
	}
}
