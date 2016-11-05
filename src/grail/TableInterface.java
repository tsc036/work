package grail;
import util.annotations.Tags;
@Tags({"Table"})
public interface TableInterface 
{
	public Object get(String k);
	public void put(String k,Object v);
}
