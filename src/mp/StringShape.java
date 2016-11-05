package mp;
import util.annotations.StructurePattern;
import util.annotations.Tags;
import util.annotations.StructurePatternNames;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import java.beans.PropertyChangeEvent;
@Tags({"String Shape"})
@StructurePattern(StructurePatternNames.STRING_PATTERN)
@PropertyNames({"x","y","text"})
@EditablePropertyNames({"x","y","text"})
public class StringShape extends Locatable implements StringShapeInterface 
{
	private String text;
	public StringShape(String t,int intx,int inty)
	{
		super(intx,inty);
		text=t;
	}
	public String getText() 
	{
		return text;
	}
	public void setText(String s) 
	{	
		String oldt=text;
		text=s;
		holder.notifyAllListeners(new PropertyChangeEvent(this,"text",oldt,text));
	}
}
