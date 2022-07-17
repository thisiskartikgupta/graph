import GraphExceptions.InvalidSizeException;

import java.util.LinkedList;
import java.util.List;

public class GraphList {

    private final int noOfVertices;
    private List<List<Integer>> adjacencyList;

    GraphList() {
        this.noOfVertices = 0;
        this.adjacencyList = new LinkedList<>();
    }

    GraphList(int noOfVertices) throws InvalidSizeException {
        if(noOfVertices < 0)
            throw new InvalidSizeException("00: Invalid Graph Size");

        this.noOfVertices = noOfVertices;
        this.adjacencyList = new LinkedList<>();

        for(int i = 0; i < noOfVertices; i++)
            adjacencyList.add(new LinkedList<>());

    }

    GraphList(List<List<Integer>> adjacencyList) throws InvalidSizeException{
        if(adjacencyList.size() < 1)
            throw new InvalidSizeException("00: Invalid Graph Size");

        this.noOfVertices = adjacencyList.size();
        this.adjacencyList = adjacencyList;
    }

    public void display() {
        System.out.print("[\n");
        for(var list : adjacencyList) {
            System.out.print("\t{");
            for(int i : list) {
                System.out.print(i + ",");
            }
            System.out.print("},\n");
        }
        System.out.print("]\n");
    }

    public int getNoOfVertices() {
        return noOfVertices;
    }
}
