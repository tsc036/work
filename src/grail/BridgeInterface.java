package grail;
import util.annotations.Tags;
@Tags({"BridgeScene"})
public interface BridgeInterface 
{
	public AvatarInterface getArthur();
	public AvatarInterface getGalahad();
	public AvatarInterface getGuard();
	public AvatarInterface getLancelot();
	public AvatarInterface getRobin();
	public void move(int x,int y);
	public GorgeInterface getGorge();
	public StandingAreaInterface getKnightArea();
	public StandingAreaInterface getGuardArea();
	public void approach(AvatarInterface a);
	public boolean getKnightTurn();
	public AvatarInterface getInteractingKnight();
	public void passed();
	public void failed();
	public void say(String s);
	public boolean getOccupied();
}
