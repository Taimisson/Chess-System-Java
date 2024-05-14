package boardgame;

public class Board {

        private int rows;
        private int columns;
        private Piece[][] pieces;

        public Board(int columns, int rows) {
            this.columns = columns;
            this.rows = rows;
            pieces = new Piece[columns][rows];
        }

        public int getRows() {
            return rows;
        }

        public void setRows(int rows) {
            this.rows = rows;
        }

        public int getColumns() {
            return columns;
        }

        public void setColumns(int columns) {
            this.columns = columns;
        }

        public Piece piece(int row, int column){
            return pieces[row][column];
        }

        public Piece piece(Position position){
            return pieces[position.getRow()][position.getColumn()];
        }
}
