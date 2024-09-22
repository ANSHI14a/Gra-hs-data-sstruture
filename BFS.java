import java.util.ArrayList;

public class BFS {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest=d;
        }
    }
    public static void CreateGraph(ArrayList<Edge> graph[]){
        for(int i =0;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        
        graph[2].add(new Edge(2,4));
        
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));



    }
    public static void main(String[] args) {

        
    }
}
