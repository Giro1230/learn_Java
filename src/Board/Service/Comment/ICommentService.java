package Board.Service.Comment;

import Board.VO.CommentVO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ICommentService {
    public void regData(CommentVO comment) throws SQLException, ClassNotFoundException;
    ArrayList<CommentVO> getAll(int num) throws SQLException, ClassNotFoundException;
    public CommentVO getOne(int index);
    public void update(CommentVO comment) throws SQLException, ClassNotFoundException;
    public void delete(int index) throws SQLException, ClassNotFoundException;
}
