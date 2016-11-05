package grail;
import mp.tokens.*;
import util.annotations.*;
@Tags({"SingletonsCreator"})
@PropertyNames({"scannerFactory","bridgeSceneFactory","avatarTableFactory","commandInterpreterFactory"})
public class SingletonsCreator 
{
	static StringScanner scanner;
	static BridgeScene scene;
	static Table table;
	static CommandInterpreter command;
	static ConsoleSceneView sceneView;
	@Tags({"scannerFactoryMethod"})
	public static StringScanner scannerFactory()
	{
		if(scanner==null)
		{
			scanner=new StringScanner();
		}
		return scanner;
	}
	@Tags({"bridgeSceneFactoryMethod"})
	public static BridgeScene bridgeSceneFactory()
	{
		if(scene==null)
		{
			scene=new BridgeScene();
		}
		return scene;
	}
	@Tags({"avatarTableFactoryMethod"})
	public static Table avatarTableFactory()
	{
		if(table==null)
		{
			table=new Table();
		}
		return table;
	}
	@Tags({"comandInterpreterFactoryMethod"})
	public static CommandInterpreter commandInterperterFactory()
	{
		if(command==null)
		{
			command=new CommandInterpreter(scanner,scene);
		}
		return command;
	}
	@Tags({"consoleSceneViewFactoryMethod"})
	public static ConsoleSceneView consoleSceneViewFactory()
	{
		if(sceneView==null)
		{
			sceneView=new ConsoleSceneView();
		}
		return sceneView;
	}
	
	
}
