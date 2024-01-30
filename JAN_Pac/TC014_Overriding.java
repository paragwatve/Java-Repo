package JAN_Pac;


		class SwipeMachine 
		{
			void readcard() 
			{
				System.out.println("Hello");
			}
		}
         class ChipCardMachine extends SwipeMachine
         {
        	 void readcard() 
        	 {
        		System.out.println("World"); 
        	 }
         }
         public class TC014_Overriding {
         public static void main(String[] args) {
     		// TODO Auto-generated method stub
        	 SwipeMachine normal = new SwipeMachine();
        	 normal.readcard();
        	 normal = new ChipCardMachine();
        	 normal.readcard();
	}

}
