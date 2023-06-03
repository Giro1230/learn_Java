package Board.Service.Board;

import Board.VO.BoardVO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IBoardService {
    public void regBoard(BoardVO board) throws SQLException, ClassNotFoundException;
    public ArrayList<BoardVO> getList() throws SQLException, ClassNotFoundException;
    public BoardVO getOne(String info) throws SQLException, ClassNotFoundException;
    public ArrayList<BoardVO> getSearchList(String info) throws SQLException, ClassNotFoundException;
    public void updateBoard(BoardVO board) throws SQLException, ClassNotFoundException;
    public void remove(String title) throws SQLException, ClassNotFoundException;
}
