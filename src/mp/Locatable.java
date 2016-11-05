package mp;
import util.annotations.Tags;
import util.annotations.PropertyNames;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import util.annotations.EditablePropertyNames;
@PropertyNames({"x","y"})
@EditablePropertyNames({"x","y"})
@Tags({"Locatable"})

public class Locatable implements LocatableInterface
{
	private int x,y;
	PropertyListenerSupport holder=new APropertyListenerSupport();
	public Locatable(int nX,int nY)
	{
		x=nX;
		y=nY;
	}
	public int getX() {
		return x;
	}
	public void setX(int nX) 
	{
		int oldx=x;
		x = nX;
		holder.notifyAllListeners(new PropertyChangeEvent(this,"x",oldx,x));
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int nY) 
	{
		int oldy=y;
		y = nY;
		holder.notifyAllListeners(new PropertyChangeEvent(this,"y",oldy,y));
	}
	public void addPropertyChangeListener(PropertyChangeListener p) 
	{
		holder.add(p);
	}
}
