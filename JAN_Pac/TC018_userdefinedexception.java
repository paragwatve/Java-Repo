package JAN_Pac;

import java.util.Scanner;

class SalaryException extends Exception
{
    private int salary;
    SalaryException(int a)
    {
        salary=a;
    }
    public  String toString() {
        return salary+"is below 3000";
    }
    }
class emp{
    String name;
    int salary;
    void getempdetails() throws SalaryException {
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        System.out.println("enter your salary");
        salary=sc.nextInt();
        if(salary<3000) {
            throw new SalaryException(salary);
        }
    }
}
public class TC018_userdefinedexception {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
try {
    emp e1=new emp();
    e1.getempdetails();
}catch(SalaryException e){
    System.out.println(e);
       }
    }

}