package grail;
import mp.LineInterface;
import util.annotations.Tags;
@Tags({"Gorge"})
public interface GorgeInterface 
{
	public LineInterface getRightSide();
	public LineInterface getLeftSide();
	public LineInterface getBridgeRightSide();
	public LineInterface getBridgeLeftSide();

	
}
