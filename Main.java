import GraphExceptions.InvalidSizeException;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InvalidSizeException {

//        GraphMatrix graph = new GraphMatrix();
//        graph.display();
//        System.out.println(graph.getNoOfVertices());

//        GraphMatrix graph2 = new GraphMatrix(-1);
//        graph2.display();
//        System.out.println(graph2.getNoOfVertices());

//      GraphMatrix graph3 = new GraphMatrix(new int[][]{{1,0,1},{0,0,0},{1,1,1}});
//      graph3.display();
//      System.out.println(graph3.getNoOfVertices());

//        GraphList graph = new GraphList();
//        graph.display();
//        System.out.println(graph.getNoOfVertices());

//        GraphList graph2 = new GraphList(2);
//        graph2.display();
//        System.out.println(graph2.getNoOfVertices());

          List<List<Integer>> adjList = new LinkedList<>();
          List<Integer> list = new LinkedList<>();
          list.add(1);
          adjList.add(list);
          list.add(2);
          adjList.add(list);
          list.add(3);
          adjList.add(list);
          list.add(4);
          adjList.add(list);

          GraphList graph3 = new GraphList(adjList);
          graph3.display();
          System.out.println(graph3.getNoOfVertices());

    }
}
