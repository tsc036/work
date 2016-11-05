package mp.tokens;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@Tags({"Quote"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"Input"})
@EditablePropertyNames({"Input"})
public class Quote implements ScannerInterface
{
	private String input;
	public Quote(String s)
	{
		input=s.substring(1,s.length()-1);
	}
	public String getInput()
	{
		return input;
	}
	public void setInput(String s)
	{
		input=s.substring(1,s.length()-1);
	}
}
