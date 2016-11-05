package mp.tokens;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@Tags({"Start"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"Input"})
@EditablePropertyNames({"Input"})
public class Start implements ScannerInterface
{
	private String input;
	public Start(String s)
	{
		input=s.substring(0,1);
	}
	public String getInput()
	{
		return input;
	}
	public void setInput(String s)
	{
		input=s.substring(0,1);
	}
}
