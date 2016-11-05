package mp.tokens;
import util.annotations.Tags;
@Tags({"ScannerBean"})
public interface ScannerBeanInterface 
{
	public String getScannedString();
	public void setScannedString(String s);
	public ScannerInterface[] getTokens();
	public int indexOf(String s,char ch,int fromIndex);
	public void scanString(String s);
}