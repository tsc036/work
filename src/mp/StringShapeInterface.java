package mp;
import util.annotations.Tags;
@Tags({"StringShape"})
public interface StringShapeInterface extends LocatableInterface 
{
	public String getText();
	public void setText(String s);
}
