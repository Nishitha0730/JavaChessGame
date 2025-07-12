package piece;

import javax.swing.text.Position;

public class Piece {
    public abstract class Piece(){
        protected Position position;
        protected PieceColor color;
    }

    public Piece(Piece color. Position position){
        this.color = color;
        this.position = position;
    }

    public PieceColor getColor(){
        return color;
    }

    public Position getPosition(){
        return position;
    }

    public void setPosition(Position position){
        this.position = position;
    }

    public abstract boolean isValidMove(Position newPosition, Piece[][] board);
}
