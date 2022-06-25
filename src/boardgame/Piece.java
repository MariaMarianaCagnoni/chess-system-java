package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	
	
	public Piece(Board board) {
		
		this.board = board;
		this.position = null;  //o java por padrão setaria como null,apenas enfatizando.
		
	}




	protected Board getBoard() {
		return board;
	}


}
