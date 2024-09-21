
import java.util.ArrayList;
//ADJACENCY LIST
public class graphs {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest= d;
        }

    }

    //create the graph
    public static void createGraph(ArrayList<Edge> graph[]){

        for(int i =0;i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));


        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));

        
    }
    public static void main(String[] args) {
        int V=4;

        ArrayList<Edge> graph[] = new ArrayList[V];
           createGraph(graph);

        for(int i =0;i<graph[2].size();i++){
            Edge e= graph[2].get(i);
            System.out.println(e.dest+" ");
        }
//Here we got the neightbour of a particular edge through  this 
         



        
    }



    
}
/* */
// in a graph every node is called vertex and its plural form is vertices.
//THE connection between two vertices is called edge
/*
 * Applications of graphs:_
 * MAPS
 * SOCIAL NETWORK
 * DELIVERY NETWORK 
 * USED TO MAKE GOOGLE MAPS
 * GRAPHS HAVE MANY ALGORITHMS TO FIND THE SHORTEST PATHS
 * ALGO LIKE (SHORTEST CYCLIC PATHS) IS RESPONISIBLE FOR DECEDING SHORTEST PATH
 * 
 * 
 * basics of graphs
 * 1-we can ount our vertex in graph
 * 2- we should know about edges. Edges Are of two types
 *         /        \
 *        /           \
 *    UNIDIRECTIONAL   BIDIRECTIONAL
 * (can travel from x-> y)   (can travel from x <--> y)
 * 3- edge weight
 * (A) Weighted:_ a number associated with edge. such graphs are called weighted graph
 *                weight can be positive negative and zero also. direction can be or cannot be also
 * (B) un-weighted:- weight is not there but direction can or cannot be there
 * 
 * Storing a graph_;-
 * Adjacency list
 * ADJANCENCY MATRIX
 * EDGE LIST
 * 2D MATRIX (IMPLICIT GRAPH)
 * 
 * 
 */
