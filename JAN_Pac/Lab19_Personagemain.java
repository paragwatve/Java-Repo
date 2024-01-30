package JAN_Pac;

public class Lab19_Personagemain {

	public static void main(String[] args) {
	
		 try {
			 Lab19_Person p1 = new Lab19_Person("Rupali", 30);
			   p1.getempdetails();
		   }catch(AgeException e){
			   System.out.println(e); 
		   }
	}
}
