package grail;
import mp.LineInterface;
import mp.Line;
import util.annotations.StructurePattern;
import util.annotations.PropertyNames;
import util.annotations.Tags;
@Tags({"Gorge"})
@StructurePattern("Bean Pattern")
@PropertyNames({"leftSide","rightSide","bridgeRightSide", "bridgeLeftSide"})
public class Gorge implements GorgeInterface
{
	private LineInterface rightSide,leftSide,bridgeRightSide,bridgeLeftSide;
	public Gorge(int x,int y)
	{
		rightSide=new Line(x-300,0,0,y);
		leftSide=new Line(x-100,0,0,y);
		bridgeLeftSide=new Line(x-300,y/4-50,200,0);
		bridgeRightSide=new Line(x-300,y/4+50,200,0);
	}
	public LineInterface getRightSide() 
	{
		return rightSide;
	}
	public LineInterface getLeftSide() 
	{
		return leftSide;
	}
	public LineInterface getBridgeRightSide() 
	{
		return bridgeRightSide;
	}
	public LineInterface getBridgeLeftSide() 
	{
		return bridgeLeftSide;
	}
}
