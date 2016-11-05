package grail;
import mp.LineInterface;
import util.annotations.Tags;
@Tags({"Angle"})
public interface AngleInterface 
{
	public LineInterface getLeftLine();
	public LineInterface getRightLine();
	public void move(int x,int y);
}
