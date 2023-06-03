package Board.Service.Board;

import Board.DAO.BoardDAO;
import Board.VO.BoardVO;

import java.sql.SQLException;
import java.util.ArrayList;

public class BoardService implements IBoardService{
    BoardDAO db;

    public BoardService() {
        db = new BoardDAO();
    }

    @Override
    public void regBoard(BoardVO board) throws SQLException, ClassNotFoundException {
        db.insert(board);
    }

    @Override
    public ArrayList<BoardVO> getList() throws SQLException, ClassNotFoundException {
        return db.selectAll();
    }

    @Override
    public BoardVO getOne(String info) throws SQLException, ClassNotFoundException {
        return db.selectOneTitle(info);
    }

    public BoardVO getTwo(int num) throws SQLException, ClassNotFoundException {
        return db.selectOneIndexNumber(num);
    }

    @Override
    public ArrayList<BoardVO> getSearchList(String info) throws SQLException, ClassNotFoundException {
        return db.selectLike(info);
    }

    @Override
    public void updateBoard(BoardVO board) throws SQLException, ClassNotFoundException {
        db.update(board);
    }

    @Override
    public void remove(String title) throws SQLException, ClassNotFoundException {
        db.delete(title);
    }
}
