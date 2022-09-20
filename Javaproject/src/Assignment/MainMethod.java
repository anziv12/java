import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		int ch;
		StudentEmpl obj = new StudentEmpl(l);
		Scanner s = new Scanner(System.in);

		System.out.println("enter choice\n1.Student\n2.employee");
		ch = s.nextInt();
		switch (ch) {
		case 1: {
			
			System.out.println("ENTER ROLLNO:");
			int rollno = s.nextInt();
			System.out.println("ENTER MARK 1:");
			int m1 = s.nextInt();
			System.out.println("ENTER MARK 2:");
			int m2 = s.nextInt();
			System.out.println("ENTER MARK 3:");
			int m3 = s.nextInt();
			System.out.println("ENTER NAME:");
			String name = s.next();

			obj.setName(name);
			obj.setRollno(rollno);
			obj.setM1(m1);
			obj.setM2(m2);
			obj.setM3(m3);
			System.out.println("Name:" + obj.getName());
			System.out.println("Rollno:" + obj.getRollno());
			System.out.println("Mark 1:" + obj.getM1());
			System.out.println("Mark 2:" + obj.getM2());
			System.out.println("Mark 3:" + obj.getM3());
			obj.grade();
		}
			break;

		case 2: 
		{
			System.out.println("EMPLOYEE NAME:");
			String ename = s.next();
			System.out.println("DESIGNATION:");
			String designation = s.next();
			System.out.println("BASIC PAY");
			float bp = s.nextFloat();

			obj.setEname(ename);
			obj.setDesignation(designation);
			obj.setBp(bp);
			System.out.println("NAME:"+obj.getEname());
			System.out.println("DESIGNATION:"+obj.getDesignation());
			obj.salary();
			
		}
			break;

		}

	}


}
