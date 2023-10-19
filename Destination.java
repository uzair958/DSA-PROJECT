import java.util.ArrayList;

public class Destination {

    Destination next;
    String Destination;
    int Distance;
    ArrayList<String> busses=new ArrayList<>();
    public Destination(String destination,int distance,String []buses_name)
    {                   // we will have array of all busses from source to destination \
                       // and those buss cost and their distance from source to this destination
        //              then we will assign the individual buss object their cost distance so that we can
        //              easily retrieve later


        this.Destination= destination;
        this.Distance=distance;
        this.next=null;

        for(int i=0;i<5;i++)
        {
             busses.add(buses_name[i]);
        }
    }
}

