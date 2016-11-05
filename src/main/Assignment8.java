package main;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import grail.*;
import mp.tokens.*;

public class Assignment8
{
	public static void main(String[] args)
	{
		SingletonsCreator.consoleSceneViewFactory();
		OEFrame o=ObjectEditor.edit(SingletonsCreator.bridgeSceneFactory());
		SingletonsCreator.bridgeSceneFactory().getArthur().move(10, 20);
		SingletonsCreator.bridgeSceneFactory().getArthur().getStringShape().setText("hey");
	}
	public static void sleep(long interval)
	{
		try
		{
			Thread.sleep(interval);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}