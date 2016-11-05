
package mp.tokens;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@Tags({"ScannerBean"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"ScannedString","Tokens"})
@EditablePropertyNames({"ScannedString"})
public class StringScanner implements ScannerBeanInterface 
{
	private String scannedString;
	private ScannerInterface tokens[];
	private int count;
	private ScannerInterface t[]=new ScannerInterface[100] ;
	public StringScanner()
	{
		scannedString="";
	}
	public String getScannedString()
	{
		return scannedString;
	}
	public void setScannedString(String s)
	{
		count=0;
		scannedString=s;
		scanString(scannedString);
		tokens=new ScannerInterface[count];
		for(int i=0;i<tokens.length;i++)
		{
			tokens[i]=t[i];
		}
	}
	public ScannerInterface[] getTokens()
	{
		return tokens;
	}
	public int indexOf(String s,char ch,int fromIndex)
	{
		for(int i=fromIndex;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				return i;
		}
		return -1;
	}
	public void scanString(String s)
	{
		int placeHolder=-1,i=0;
		while(indexOf(s,' ',placeHolder+1)!=-1)
		{
			if(s.charAt(placeHolder+1)=='"')
			{
				ScannerInterface si=new Quote(s.substring(placeHolder+1,indexOf(s,'"',placeHolder+2)+1));
				t[i]=si;
			}
			else if(s.charAt(placeHolder+1)=='{')
			{
				ScannerInterface si=new Start(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
				t[i]=si;
			}
			else if(s.charAt(indexOf(s,' ',placeHolder+1)-1)=='}')
			{
				ScannerInterface si=new End(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
				t[i]=si;			
			}
			else
			{
				if(!Character.isDigit(s.charAt(placeHolder+1)))
				{
					if(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)).equalsIgnoreCase("move"))
					{
						ScannerInterface si=new Move(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
						t[i]=si;
					}
					else if(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)).equalsIgnoreCase("say"))
					{
						ScannerInterface si=new Say(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
						t[i]=si;
					}
					else if(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)).equalsIgnoreCase("repeat"))
					{
						ScannerInterface si=new Repeat(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
						t[i]=si;
					}
					else if(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)).equalsIgnoreCase("approach"))
					{
						ScannerInterface si=new Approach(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
						t[i]=si;
					}
					else if(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)).equalsIgnoreCase("pass"))
					{
						ScannerInterface si=new Pass(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
						t[i]=si;
					}
					else if(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)).equalsIgnoreCase("fail"))
					{
						ScannerInterface si=new Fail(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
						t[i]=si;
					}
					else
					{
						ScannerInterface si=new Word(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
						t[i]=si;
					}
				}
				else
				{
					ScannerInterface si=new Number(s.substring(placeHolder+1,indexOf(s,' ',placeHolder+1)));
					t[i]=si;
				}
				
			}
			placeHolder=indexOf(s,' ',placeHolder+1);
			i++;
			count++;
		}
	}
	
}
