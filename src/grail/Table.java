package grail;
import java.util.ArrayList;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@Tags({"Table"})
@StructurePattern(StructurePatternNames.MAP_PATTERN)
public class Table implements TableInterface
{
	private ArrayList<String> key;
	private ArrayList<Object> val;
	public Table()
	{
		val=new ArrayList<Object>();
		key=new ArrayList<String>();
	}
	public void put(String k,Object v)
	{
		if(key!=null&&v!=null)
		{
			if(key.contains(k)==true)
			{
				val.set(key.indexOf(k), v);
			}
			else
			{
				key.add(k.toLowerCase());
				val.add(v);
			}
		}
	}
	public Object get(String k)
	{
		if(key.contains(k)==false)
		{
			return null;
		}
		else
		{
			return val.get(key.indexOf(k.toLowerCase()));
		}
	}
	
}
