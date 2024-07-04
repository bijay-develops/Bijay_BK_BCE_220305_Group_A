public class multipleObj 
{
    int x = 100;

	public static void main(String[] args)
     {
		multipleObj myObjectOne = new multipleObj();
		int x1 = myObjectOne.x;
		
		multipleObj myObjectTwo = new multipleObj();
		myObjectTwo.x = 111;
		int x2 = myObjectTwo.x;
		
		
		System.out.println("initial variable: " + x1);
		System.out.println("second variable: " + x2);
   
    }
}