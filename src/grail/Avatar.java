package grail;
import mp.*;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.PropertyNames;
import util.annotations.Tags;
@Tags({"Avatar"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"legs","arms","body","head","stringShape"})
public class Avatar implements AvatarInterface 
{
	private AngleInterface legs,arms;
	private LineInterface body;
	private HeadInterface head;
	private StringShapeInterface stringShape;
	public Avatar(Head h)
	{
		head=h;
		body=new Line(5,6,0,10);
		arms=new Angle(5,6,25,25);
		legs=new Angle(5,6,25,25);
		stringShape=new StringShape("whats up",0,0);
		connectBody( 10,10);
	}
	public Avatar(int x,int y,int picL,int picH,int l,int h,int bodyH, String s,String name)
	{
		head=new Head(name,x,y,picL,picH);
		body =new Line(x,y,0,bodyH);
		arms=new Angle(x,y,l,h);
		legs=new Angle(x,y,l,h);
		stringShape=new StringShape(s,x,y);
		connectBody(x,y);
	}
	public HeadInterface getHead()
	{
		return head;
	}
	public AngleInterface getLegs()
	{
		return legs;
	}
	public AngleInterface getArms()
	{
		return arms;
	}
	public LineInterface getBody()
	{
		return body;
	}
	public StringShapeInterface getStringShape()
	{
		return stringShape;
	}
	@Tags({"move"})
	public void move(int x,int y)
	{
		head.setX(head.getX()+x);
		head.setY(head.getY()+y);
		body.setX(body.getX()+x);
		body.setY(body.getY()+y);
		arms.move(x,y);
		legs.move(x,y);
		stringShape.setX(stringShape.getX()+x);
		stringShape.setY(stringShape.getY()+y);
	}
	public void connectBody(int x,int y)
	{
		head.setX(x);
		head.setY(y);
		body.setX(x+head.getWidth()/2);
		body.setY(y+head.getHeight());
		arms.getLeftLine().setX(x+head.getWidth()/2);
		arms.getLeftLine().setY(y+head.getHeight());
		arms.getRightLine().setX(x+head.getWidth()/2);
		arms.getRightLine().setY(y+head.getHeight());
		legs.getLeftLine().setX(x+head.getWidth()/2);
		legs.getLeftLine().setY(y+head.getHeight()+body.getHeight());
		legs.getRightLine().setX(x+head.getWidth()/2);
		legs.getRightLine().setY(y+head.getHeight()+body.getHeight());
		stringShape.setX(x+head.getWidth());
		stringShape.setY(y);
		
	}
}
