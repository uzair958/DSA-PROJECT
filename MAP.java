import java.util.HashMap;
import java.util.LinkedList;

public class MAP {
    HashMap<String, LinkedList<Destination>>map;

    public MAP()
    {
        map=new HashMap<>();
    }

    public void create_map( String source,Destination []destinations,int n)
    {
        LinkedList<Destination> destinations_list=new LinkedList<>();
        for(int i=0;i<n;i++) {
            destinations_list.add(destinations[i]);
        }
        map.put(source,destinations_list);

    }
}
