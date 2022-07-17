
import GraphExceptions.InvalidSizeException;

public class GraphMatrix {

    private final int noOfVertices;
    private int[][] adjacencyMatrix;

    GraphMatrix() {
        this.noOfVertices = 0;
        this.adjacencyMatrix = new int[0][0];
    }

    GraphMatrix(int noOfVertices) throws InvalidSizeException {
        if(noOfVertices < 0)
            throw new InvalidSizeException("00: Invalid Graph Size");

        this.noOfVertices = noOfVertices;
        this.adjacencyMatrix = new int[noOfVertices][noOfVertices];
    }

    GraphMatrix(int[][] adjacencyMatrix) throws InvalidSizeException{
        if(adjacencyMatrix.length < 1)
            throw new InvalidSizeException("00: Invalid Graph Size");

        if(adjacencyMatrix.length != adjacencyMatrix[0].length)
            throw new InvalidSizeException("01: Invalid Adjacency Matrix Size");

        this.noOfVertices = adjacencyMatrix.length;
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public void display() {
        System.out.print("[\n");
        for(int[] list : adjacencyMatrix) {
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
