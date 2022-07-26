package prcpkg;
class ProtecSuper
{
	protected int x;
	ProtecSuper()
	{
		x=5;
	}
	protected int xPlus(int y){
		return x+y;
	}
}
class ProtecChild extends ProtecSuper
{
	protected int xPlus(int y){
		return x+y+0;
	}
}
