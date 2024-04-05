//What will be the output of the following program?
class A {
    public A() {
        System.out.println("Grand Parent CLass");
    }
	public void base(){
        System.out.println("Derived Method");
    }
	void print()
	{
		System.out.println("Base Method");
	}
}

class B extends A{
	B()
	{
		System.out.println("Parent Class");
	}
    public void derived(){
        System.out.println("Derived Method");
    }
	void print()
	{
		System.out.println("Parent Method");
	}
}

class C extends B{
	C()
	{
		System.out.println("Child Class");
	}
    public void deriDerived() {
        System.out.println("DeriDerived");
    }
	void print()
	{
		System.out.println("Child Method");
	}
}

class inheritance_demo{
    public static void main(String[] args) {
        C c = new C( );
		c.deriDerived();
		c.derived();
		c.base();
		A a;
		a = c;
		a.print();
		a = new B();
		a.print();
		a = new A();
		a.print();
		
    }
}