package grail;
import mp.tokens.*;
import mp.tokens.Number;
import util.annotations.EditablePropertyNames;
import util.annotations.PropertyNames;
import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import util.annotations.Tags;
@EditablePropertyNames({"command"})
@Tags({"CommandInterpreter"})
@StructurePattern(StructurePatternNames.BEAN_PATTERN)
public class CommandInterpreter implements CommandInterpreterInterface
{
	private ScannerBeanInterface scanner;
	private BridgeInterface bridge;
	private TableInterface table;
	public CommandInterpreter(ScannerBeanInterface s,BridgeInterface b)
	{
		scanner=s;
		bridge=b;
		table=new Table();
		table.put("arthur",b.getArthur());
		table.put("galahad",b.getGalahad());
		table.put("guard", b.getGuard());
		table.put("lancelot", b.getLancelot());
		table.put("robin", b.getRobin());
	}
	public void setCommand(String s)
	{
		scanner.setScannedString(s);
		if(scanner.getTokens()[0] instanceof Say && scanner.getTokens()[1] instanceof Quote)
		{
			bridge.say(scanner.getTokens()[1].getInput());
		}
		else if(scanner.getTokens()[0] instanceof Move && scanner.getTokens()[1] instanceof Word && scanner.getTokens()[2] instanceof Number && scanner.getTokens()[3] instanceof Number)
		{
			if(table.get(scanner.getTokens()[1].getInput().toLowerCase())!=null)
			{
				((AvatarInterface)table.get(((TokenWord) scanner.getTokens()[1]).getValue())).move(((TokenNum)scanner.getTokens()[2]).getValue(),((TokenNum)scanner.getTokens()[3]).getValue());
			}
		}
		
	}
}
