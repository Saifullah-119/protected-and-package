import prcpkg.*;
class OutProtecChild extends ProtecSuper
{
	protected void getX(){
		System.out.println(x);
	}
}
class ProtecTest
{
	public static void main(String args[])
	{
		OutProtecChild c=new OutProtecChild();
		c.getX();
		System.out.println(c.x);
	}
}