package CaseStudy.TicTacToe.models;

import java.util.ArrayList;
import java.util.List;


/**
 * Board/matrix
 * [
 * {Cell(0,0)},{Cell(0,1)},{Cell(0,2)}  //  row 0
 * {},{},{}
 * {},{},{}
 * ]
 * 
 */
public class Board {
    private int n; //size of the board being n*n
    private List<List<Cell>> matrix;

    public Board(int size){
        this.n = size;
        this.matrix = new ArrayList<>();

        for(int i=0;i<n;i++) {
            this.matrix.add(new ArrayList<>()); //each row is not null
            for(int j=0;j<n;j++) {
                this.matrix.get(i).add(new Cell(i,j));  //for each row add the i,jth Cell
            }
        }
    }

    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public List<List<Cell>> getMatrix() {
        return matrix;
    }
    public void setMatrix(List<List<Cell>> matrix) {
        this.matrix = matrix;
    }

    public void display() {
        //Print the matrix for user
    }

    
}
