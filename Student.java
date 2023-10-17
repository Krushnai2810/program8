public class Student {
	int rollNumber;
	double fees;
	String name;
	static String universityName ="SPPU";
	
	void setDataOfStudent(int prn,double pfees ,String pname)
	{
		rollNumber=prn;
		fees=pfees;
		name=pname;
	}
	
	void showStudentDetails()
	{
	 System.out.println("Name = "+name);
	 System.out.println("Roll number = "+rollNumber);
	 System.out.println("Fees = "+fees);

	 System.out.println("University ="+Student.universityName);
	
 class TestStudent {

	public static void main(String[] args) {
	
	Student s1 = new Student();
	s1.showStudentDetails();
	s1.setDataOfStudent(111,3454.00,"Pooja");
	s1.showStudentDetails();
	
	}
}


	}
}