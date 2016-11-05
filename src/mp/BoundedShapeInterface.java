package mp;
import util.annotations.Tags;
@Tags({"Locatable","BoundedShape"})
public interface BoundedShapeInterface extends LocatableInterface 
{
	public int getWidth();
	public int getHeight();
	public void setHeight(int h);
	public void setWidth(int w);
}
