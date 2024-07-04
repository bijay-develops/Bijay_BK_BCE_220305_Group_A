public class testStatic 
{
    public static void main(String[] args) {

		
		testStatic.myStaticMethod();
		testStatic.allFreeMethod();

	}

	private static void allFreeMethod() {
		System.out.println("i am another method");
	}

	private static void myStaticMethod() {
		System.out.println("I am static method");

	}

}