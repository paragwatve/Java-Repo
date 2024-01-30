package JAN_Pac;

abstract class Shapes{
	abstract void draw();
}
class rect extends Shapes
{
	@Override
	void draw() {
		System.out.println("Draw the rectangle");
	}
}
public class TC014_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        rect r1= new rect();
        r1.draw();
	}

}
