package JUNIT;

public class Lab2_PersondetailsMain {

	public static void main(String[] args) {
//		String first_name ="Divya";
//		String Last_name="Bharathi";
//		String Gender="F";
//		String Age="20";
//		double weight=85.55D;

		Lab2_Persondetails l=new Lab2_Persondetails();
		l.setFirst_name("Parag");
		l.setLast_name("Watve");
		l.setGender("Male");
		l.setAge("25");
		l.setWeight("60");
		
		System.out.println("first name is:"+l.first_name);
		System.out.println("Last name is:"+l.Last_name);
		System.out.println("Gender is:"+l.Gender);
		System.out.println("Age is:"+l.Age);
		System.out.println("Weight is:"+l.weight);
		

	}

}
