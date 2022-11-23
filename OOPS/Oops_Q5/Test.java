package Oops_Q5;

public class Test{
	public static void main(String[] args) {
		D d = new D();
		d.sum(3, 6);
		d.sub(34,9);
		d.mul(6, 3);
		d.div(10, 2);
	}
}

class A extends CalcAbs{
	@Override
	void sum(int a, int b) {
		int sum = a + b;
		System.out.println("Addition is " + sum);
	}
}

class B extends A{
	@Override
	void sub(int a, int b) {
		int sub = a - b;
		System.out.println("subtraction is " + sub);
	}
}

class C extends B{
	@Override
	void mul(int a, int b) {
		int mul = a * b;
		System.out.println("multiplication is " + mul);
	}
}

class D extends C{
	@Override
	void div(int a, int b) {
		int div = a / b;
		System.out.println("division is " + div);
	}
	
}
