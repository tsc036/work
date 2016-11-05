package mp;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.Tags;
@PropertyNames({"x","y","width","height"})
@EditablePropertyNames({"x","y","width","height"})
@StructurePattern(StructurePatternNames.LINE_PATTERN)
@Tags({"Line"})
public class Line extends BoundedShape implements LineInterface 
{
	public Line(int intX,int intY, int w,int h)
	{
		super(intX,intY,h,w);
	}
}
