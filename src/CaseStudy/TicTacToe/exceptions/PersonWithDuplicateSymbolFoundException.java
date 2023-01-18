package CaseStudy.TicTacToe.exceptions;

public class PersonWithDuplicateSymbolFoundException extends RuntimeException{
    public PersonWithDuplicateSymbolFoundException(String message) {
        super(message);
    }
}
