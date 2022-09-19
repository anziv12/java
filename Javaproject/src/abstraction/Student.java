package abstraction;

public class Student extends InfoJava {
	@Override
	public void getName() 
	{
		String name = "Anzi";
		System.out.println(name);
	

}
	@Override
	public void getAge()
	{
		int age = 22;
		System.out.println(age);
		
		
	}
	public static void main(String[]args)
	{
		InfoJava info =new Student();
		info.getName();
		info.getAge();
	}
}
