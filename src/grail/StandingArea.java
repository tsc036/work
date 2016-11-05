package grail;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.OVAL_PATTERN)
@PropertyNames({"x","y","height","width"})
@EditablePropertyNames({"x","y","height","width"})
@Tags({"Standing Area"})
public class StandingArea implements StandingAreaInterface
{
	private int x,y,height,width;
	public StandingArea(int xval,int yval, int h,int w)
	{
		x=xval;
		y=yval;
		height=h;
		width=w;
	}
	public int getX() 
	{
		return x;
	}
	public void setX(int xval) 
	{
		x = xval;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int yval) 
	{
		y = yval;
	}
	public int getHeight() 
	{
		return height;
	}
	public void setHeight(int h) 
	{
		height = h;
	}
	public int getWidth() 
	{
		return width;
	}
	public void setWidth(int w) 
	{
		width = w;
	}
}
