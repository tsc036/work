package grail;
import mp.*;
import util.annotations.Tags;
@Tags({"Avatar"})
public interface AvatarInterface 
{
	public AngleInterface getArms();
	public AngleInterface getLegs();
	public LineInterface getBody();
	public HeadInterface getHead();
	public StringShapeInterface getStringShape();
	public void move(int x,int y);
	public void connectBody(int x,int y);
}
