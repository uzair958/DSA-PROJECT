import java.util.*;

public class MAP {
    HashMap<String, LinkedList<node>> map;

    public MAP() {
        map = new HashMap<>();
    }

    public void create_map(String source, node[] destinations, int n) {
        LinkedList<node> destinations_list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            destinations_list.add(destinations[i]);
        }
        map.put(source, destinations_list);

    }

    public static ArrayList<node> dijkstra(HashMap<String, LinkedList<node>> graph, node Source, node destination) {
        HashMap<String, Integer> distance = new HashMap<>();
        HashMap<String, node> parent = new HashMap<>();
        PriorityQueue<node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        for (String vertex : graph.keySet()) {
            distance.put(vertex, Integer.MAX_VALUE);
            parent.put(vertex, null);
        }
           String source=Source.vertex;
        // Set distance to source as 0
        distance.put(source, 0);
        pq.add(new node(source, 0));

        while (!pq.isEmpty()) {
            String current = pq.poll().vertex;
            node current_node=pq.poll();
            // If the destination is reached, stop the algorithm
            if (Objects.equals(current, destination.vertex)) {
                break;
            }

            for (node neighbor : graph.get(current)) {
                int newDist = distance.get(current) + neighbor.distance;

                if (newDist < distance.get(neighbor.vertex)) {
                    distance.put(neighbor.vertex, newDist);
                    parent.put(neighbor.vertex, current_node);
                    pq.add(new node(neighbor.vertex, newDist));


                }
            }
        }
        ArrayList<node> path = new ArrayList<>();
        int total_distance=0;
        while (destination != null) {
            path.add(destination);
            total_distance+=destination.distance;
            destination = parent.get(destination.vertex);

        }
        Collections.reverse(path);
        return path;
    }

}

