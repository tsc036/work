package mp.tokens;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@Tags({"End"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"Input"})
@EditablePropertyNames({"Input"})
public class End implements ScannerInterface
{
	private String input;
	public End(String s)
	{
		input=s.substring(s.length()-1,s.length());
	}
	public String getInput()
	{
		return input;
	}
	public void setInput(String s)
	{
		input=s.substring(s.length()-1,s.length());
	}
}
