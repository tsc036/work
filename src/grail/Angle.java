  package grail;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import mp.Line;
import mp.LineInterface;
import util.annotations.PropertyNames;
import util.annotations.Tags;
@Tags({"Angle"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"leftLine","rightLine"})
public class Angle implements AngleInterface 
{
	private LineInterface leftLine,rightLine;
	public Angle()
	{
		leftLine=new Line(30,30,25,25);
		rightLine=new Line(30,30,25,25);
	}
	public Angle(int x,int y,int l,int h)
	{
		leftLine=new Line(x,y,l*-1,h);
		rightLine=new Line(x,y,l,h);
	}
	public LineInterface getRightLine()
	{
		return rightLine;
	}
	public LineInterface getLeftLine()
	{
		return leftLine;
	}
	@Tags({"move"})
	public void move(int x,int y)
	{
		leftLine.setX(leftLine.getX()+x);
		leftLine.setY(leftLine.getY()+y);
		rightLine.setX(rightLine.getX()+x);
		rightLine.setY(rightLine.getY()+y);
	}
}
