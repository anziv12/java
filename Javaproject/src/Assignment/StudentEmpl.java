package Assignment;


	public class StudentEmpl implements Calculation
{
	public void grade()
{
		if((m1+m2+m3)>=270)
			System.out.println("GRADE A");
		else if (((m1+m2+m3)<270) && ((m1+m2+m3)>=250))
			System.out.println("GRADE B");
		else if (((m1+m2+m3)<250) && ((m1+m2+m3)>=210))
			System.out.println("GRADE C");
		else
			System.out.println("Fail");
}

public void salary()
{
	float salary=bp-(50.0f+0.2f);
	System.out.println("PF:2%");
	System.out.println("DEDUCTION:50");
	System.out.println("Salary:"+salary);
}

	private String ename;
	private String designation;
	private float bp;
	
	private String name;
	private int rollno;
	private int m1;
	private int m2;
	private int m3;
	
	
	
	public String getEname() 
	{return ename;}
	public void setEname(String ename) 
	{this.ename = ename;}

	public String getDesignation()
	{return designation;}
	public void setDesignation(String designation) 
	{this.designation = designation;}

	public float getBp()
	{return bp;}
	public void setBp(float bp)
	{this.bp = bp;}

	public String getName()
	{return name;}
	public void setName(String name) 
	{this.name = name;}

	public int getRollno()
	{return rollno;}
	public void setRollno(int rollno) 
	{this.rollno = rollno;}

	public int getM1() 
	{return m1;}
	public void setM1(int m1) 
	{this.m1 = m1;}

	public int getM2() 
	{return m2;}
	public void setM2(int m2) 
	{this.m2 = m2;}

	public int getM3() 
	{return m3;}
	public void setM3(int m3) 
	{this.m3 = m3;}
	
	
	
	
	

}


}
