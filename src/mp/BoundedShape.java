package mp;
import util.annotations.Tags;
import util.models.PropertyListenerRegisterer;
import util.annotations.PropertyNames;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import util.annotations.EditablePropertyNames;
@PropertyNames({"x","y","width","height"})
@EditablePropertyNames({"x","y","width","height"})
@Tags({"BoundedShape"})
public class BoundedShape extends Locatable implements BoundedShapeInterface
{
	private int height,width;
	public BoundedShape(int nX,int nY,int h,int w)
	{
		super(nX,nY);
		height=h;
		width=w;
	}
	public int getHeight() 
	{
		return height;
	}
	public void setHeight(int h) 
	{
		int oldh=h;
		height = h;
		holder.notifyAllListeners(new PropertyChangeEvent(this,"height",oldh,height));
	}
	public int getWidth() 
	{
		return width;
	}
	public void setWidth(int w) 
	{
		int oldw=width;
		width = w;
		holder.notifyAllListeners(new PropertyChangeEvent(this,"width",oldw,width));
	}
}
