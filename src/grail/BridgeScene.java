package grail;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.PropertyNames;
import util.annotations.Tags;
import util.annotations.Visible;
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
@PropertyNames({"arthur","galahad","guard","lancelot","robin","gorge","knightArea","guardArea","occupied","knightTurn"})
@Tags({"BridgeScene"})
public class BridgeScene implements BridgeInterface
{
	private AvatarInterface arthur,galahad,guard,lancelot,robin,interactingKnight;
	private GorgeInterface gorge;
	private StandingAreaInterface knightArea,guardArea;
	private boolean occupied,knightTurn;
	public BridgeScene() 
	{
		arthur=new Avatar(50,50,50,50,25,25,50,"woohoo","arthur.jpg");
		galahad=new Avatar(200,50,50,50,25,25,50,"lets go","galahad.jpg");
		guard=new Avatar(1625,225,50,50,25,25,50,"stop","guard.jpg");
		lancelot=new Avatar(50,300,50,50,25,25,50,"we can do it","lancelot.jpg");
		robin=new Avatar(200,300,50,50,25,25,50,"sorry","robin.jpg");
		gorge=new Gorge(2000,2000);
		guardArea=new StandingArea(1600,300,100,100);
		knightArea=new StandingArea(1600,600,100,100);
		occupied=false;
		knightTurn=false;
		interactingKnight=null;
	}
	public StandingAreaInterface getKnightArea()
	{
		return knightArea;
	}
	public StandingAreaInterface getGuardArea()
	{
		return guardArea;
	}
	public GorgeInterface getGorge()
	{
		return gorge;
	}
	public AvatarInterface getArthur() 
	{
		return arthur;
	}
	public AvatarInterface getGalahad() 
	{
		return galahad;
	}
	public AvatarInterface getGuard() 
	{
		return guard;
	}
	public AvatarInterface getLancelot() 
	{
		return lancelot;
	}
	public AvatarInterface getRobin() 
	{
		return robin;
	}
	@Tags({"approach"})
	public void approach(AvatarInterface a)
	{	if(occupied==false)
		{
			a.move(knightArea.getX()+25-a.getHead().getX(),knightArea.getY()-75-a.getHead().getY());
			occupied=true;
			interactingKnight=a;
		}
	}
	@Tags({"say"})
	public void say(String s)
	{
		if(interactingKnight!=null)
		{
			if(knightTurn==true)
			{
				interactingKnight.getStringShape().setText(s);
				knightTurn=false;
			}
			else
			{
				guard.getStringShape().setText(s);
				knightTurn=true;
			}
		}
	}
	@Tags({"move"})
	public void move(int x,int y)
	{
		arthur.move(x, y);
		galahad.move(x, y);
		guard.move(x, y);
		lancelot.move(x, y);
		robin.move(x, y);
	}
	@Visible(false)
	public boolean getOccupied()
	{
		return occupied;
	}
	@Visible(false)
	public boolean getKnightTurn()
	{
		return knightTurn;
	}
	@Visible(false)
	public AvatarInterface getInteractingKnight()
	{
		return interactingKnight;
	}
	@Tags({"passed"})
	public void passed()
	{
		if(knightTurn==false)
		{
			interactingKnight.move(1000, 0);
			occupied=false;
		}
	}
	@Tags({"failed"})
	public void failed()
	{
		if(knightTurn=true)
		{
			guard.move((gorge.getLeftSide().getX()+gorge.getRightSide().getX())/2-guard.getBody().getX(),0);
		}
		else
		{
			interactingKnight.move((gorge.getLeftSide().getX()+gorge.getRightSide().getX())/2-guard.getBody().getX(),0);
		}
		occupied=false;
		knightTurn=false;
	}
}
