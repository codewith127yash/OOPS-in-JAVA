public class Variable
{
	static int staticVar ;
	int instanceVar;
	public static void main(String args[])
	{
		int localVar = 127;
		System.out.println("Static Variable Value = " +Variable.staticVar);
		Variable instanceVariable  = new Variable();
		System.out.println(" Instance Variable Value = "+instanceVariable.instanceVar);
		System.out.println("Local Variable = " + localVar);
	}
}