import java.util.ArrayList;

public class node {

    node next;
    String vertex;
    int distance;
    ArrayList<String> busses=new ArrayList<>();
    public node(String vertex, int distance)
    {                   // we will have array of all busses from source to destination \
                       // and those buss cost and their distance from source to this destination
        //              then we will assign the individual buss object their cost distance so that we can
        //              easily retrieve later


        this.vertex= vertex;
        this.distance=distance;
        this.next=null;

    }
    public void add_Buss_Names(String buses_name[])
    {
        for(int i=0;i<5;i++)
        {
            busses.add(buses_name[i]);
        }
    }
}

