public class info 
{
    private String Name = "Bijay";
	private String Address = "Lalitpur";
	private int Number = 123456789;
	
	public static void main(String[] args)
     {
		info Info=new info();
		String myName=Info.Name;
		String myAddress=Info.Address;
		int myPhone=Info.Number;
		System.out.println(myName +"\n" +myAddress + "\n"+myPhone);
		System.out.println("\nUpdated Variables:");
		Info.Name="Rambo";
		Info.Address="Lalitpur";
		Info.Number=980000000;
		System.out.println( Info.Name+"\n"+""+Info.Address+"\n"+""+Info.Number);
	
	}   
}