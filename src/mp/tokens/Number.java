package mp.tokens;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@Tags({"Number"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"Input","Value"})
@EditablePropertyNames({"Input"})
public class Number implements TokenNum
{
	private String input;
	private int value;
	public Number(String s)
	{
		input=s;
		if(input.charAt(0)=='0')
		{
			int i=0;
			while(i==0)
			{
				if(input.charAt(i)!=0)
				{
					value=Integer.parseInt(s.substring(i, s.length()));
				}
				i++;
			}
		}
		else	
		{
			value=Integer.parseInt(input);
		}
	}
	public String getInput()
	{
		return input;
	}
	public int getValue()
	{
		return value;
	}
	public void setInput(String s)
	{
		input=s;
	}
}
