package mp;
import java.beans.PropertyChangeListener;
import util.models.PropertyListenerRegisterer;
import util.annotations.Tags;
@Tags({"Locatable"})
public interface LocatableInterface extends PropertyListenerRegisterer 
{
	public int getX();
	public int getY();
	public void setX(int x);
	public void setY(int y);
	
}
