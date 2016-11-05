package mp;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
public class APropertyListenerSupport implements PropertyListenerSupport {
    public final int MAX_SIZE = 50;
    ArrayList<PropertyChangeListener> contents = new ArrayList<PropertyChangeListener>();

    public int size() 
    {
        return contents.size();
    }
    
    public PropertyChangeListener get (int index) 
    {
       return contents.get(index);
    }
    public void add(PropertyChangeListener l) 
    {
            contents.add(l);
    }  
    public void notifyAllListeners(PropertyChangeEvent event) 
    {
        for (int index = 0; index < size(); index++) 
        {
            get(index).propertyChange(event);
        }
    }
    public void remove(PropertyChangeListener element) 
    {
    	contents.remove(element);
    }

    public void remove(int startIndex) 
    {
        contents.remove(startIndex);
    }
    public int indexOf(PropertyChangeListener element) 
    {
        return contents.indexOf(element);
    }
    public void clear() 
    {
        contents.clear();
    }
}
