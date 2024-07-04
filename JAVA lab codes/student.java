public class student 
{
    String Name="Ram";
	int Phone=123456789;
	String Address="Nepal";
	

	public static void main(String[] args) {
		student Stu=new student();
		String myName =Stu.Name;
		String myAddress =Stu.Address;
		final int myPhone =Stu.Phone;
		
		System.out.println("=====First OP=====");
		System.out.println(myName+"\n"+myAddress+"\n"+myPhone);
		System.out.println("=====Second OP=====");
		System.out.println(myName+myAddress+myPhone);
		System.out.println("=====Third OP=====");
		System.out.println(myName+" "+myAddress+" "+myPhone);

	}
}