package mp.tokens;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@Tags({"Word"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"Input","Value"})
@EditablePropertyNames({"Input"})
public class Word implements TokenWord
{
	private String input,value;
	public Word(String s)
	{
		input=s;
		value=input.toLowerCase();
	}

	public String getInput() 
	{
		return input;
	}
	
	public void setInput(String s) 
	{
		input=s;
	}
	public String getValue()
	{
		return value;
	}
	
}
