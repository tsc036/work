package mp.tokens;
import util.annotations.Tags;
@Tags({"Number"})
public interface TokenNum extends ScannerInterface 
{
	public int getValue();
}
