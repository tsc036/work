package grail;
import util.annotations.Tags;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
@Tags({"ConsoleSceneView"})
public class ConsoleSceneView implements PropertyChangeListener 
{
	public ConsoleSceneView()
	{
		SingletonsCreator.bridgeSceneFactory().getArthur().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getArthur().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGalahad().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGuard().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getLancelot().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getHead().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getBody().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getArms().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getArms().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getLegs().getLeftLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getLegs().getRightLine().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getRobin().getStringShape().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGorge().getBridgeLeftSide().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGorge().getBridgeRightSide().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGorge().getLeftSide().addPropertyChangeListener(this);
		SingletonsCreator.bridgeSceneFactory().getGorge().getRightSide().addPropertyChangeListener(this);
	}
	public void propertyChange(PropertyChangeEvent e)
	{
		System.out.println(e);
	}
}
