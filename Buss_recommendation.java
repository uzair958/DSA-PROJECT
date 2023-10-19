import java.util.ArrayList;

public class Buss_recommendation {
    void Display(ArrayList<Destination> stops)
    {
        ArrayList<String>output=new ArrayList<>();
        ArrayList<String>commonBusses;
        ArrayList<String>temp=new ArrayList<>();
        int i;


        commonBusses=stops.get(0).busses;
        for( i=0;i<stops.size()-1;i++)
        {

            if( commonBusses.size()!=0)
            {
                temp=commonBusses;
                commonBusses.retainAll(stops.get(i+1).busses);
            }
            else
            {
                output.addAll(temp);
                commonBusses=stops.get(i).busses;
                i=i-1;
            }
        }
    }
}
