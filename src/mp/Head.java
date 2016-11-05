package mp;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;

import java.beans.PropertyChangeEvent;

import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.Tags;
@StructurePattern(StructurePatternNames.IMAGE_PATTERN)
@PropertyNames({"x","y","width","height","imageFileName"})
@EditablePropertyNames({"x","y","width","height","imageFileName"})
@Tags({"ImageShape"})
public class Head extends BoundedShape implements HeadInterface
{
	private String imageFileName;
	public Head( String image,int intx,int inty, int w,int h)
	{
		super(intx,inty,w,h);
		imageFileName=image;
	}
	public String getImageFileName() 
	{
		return imageFileName;
	}
	public void setImageFileName(String s)
	{
		String oldm=imageFileName;
		imageFileName=s;
		holder.notifyAllListeners(new PropertyChangeEvent(this,"imageFileName",oldm,imageFileName));
	}
}
