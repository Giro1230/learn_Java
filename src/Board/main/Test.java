package Board.main;

import Board.UI.BoardUI;

import java.io.IOException;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        BoardUI ui = new BoardUI();

        ui.mainUI();
    }
}
