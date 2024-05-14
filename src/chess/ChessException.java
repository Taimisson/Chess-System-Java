package chess;

import boardgame.BoardException;

import java.io.Serial;

public class ChessException extends BoardException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ChessException(String msg) {
        super(msg);
    }
}
