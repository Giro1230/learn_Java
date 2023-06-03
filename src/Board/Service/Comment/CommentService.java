package Board.Service.Comment;

import Board.DAO.CommentDAO;
import Board.VO.CommentVO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CommentService implements ICommentService{
    CommentDAO dto = new CommentDAO();

    @Override
    public void regData(CommentVO comment) throws SQLException, ClassNotFoundException {
        dto.insertComment(comment);
    }

    @Override
    public ArrayList<CommentVO> getAll(int num) throws SQLException, ClassNotFoundException {
        return dto.selectAllComment(num);
    }

    @Override
    public CommentVO getOne(int index) {
        return dto.selectOneIdNum(index);
    }

    @Override
    public void update(CommentVO comment) throws SQLException, ClassNotFoundException {
        dto.update(comment);
    }

    @Override
    public void delete(int index) throws SQLException, ClassNotFoundException {
        dto.delete(index);
    }
}
