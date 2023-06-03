package Board.DAO;

import Board.VO.BoardVO;
import Board.VO.CommentVO;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BoardDAO {
    Statement stmt;
    PreparedStatement pstmt;
    ResultSet rs;
    DBCon con;
    Map<Integer, BoardVO> boardDESC;
    Map<Integer, CommentVO> commentDESC;

    public BoardDAO(){
        con = new DBCon();
        boardDESC = new HashMap<>();
        commentDESC = new HashMap<>();
    }

    public void insert(BoardVO board) throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "INSERT INTO BoardDB (title, writer, content, insertDate)"
                        + "VALUES (?, ?, ?, NOW())";
        pstmt = con.getCon().prepareStatement(query);
        pstmt.setString(1, board.getTitle());
        pstmt.setString(2, board.getWriter());
        pstmt.setString(3, board.getContent());
        int result = pstmt.executeUpdate();
        if (result != 0) {
            System.out.println("게시글이 등록되었습니다.");
        }
        con.Disconnect();
    }

    public ArrayList<BoardVO> selectAll() throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "SELECT * FROM BoardDB ORDER BY `index` DESC";
        pstmt = con.getCon().prepareStatement(query);
        rs = pstmt.executeQuery();

        ArrayList<BoardVO> list = new ArrayList<>();

        int i = 1;
        while (rs.next()) {
            BoardVO m = new BoardVO();
            m.setIndex(rs.getInt("index"));
            m.setTitle(rs.getString("title"));
            m.setWriter(rs.getString("writer"));
            m.setContent(rs.getString("content"));
            m.setDay(rs.getTimestamp("insertDate"));
            list.add(m);
            boardDESC.put(i, m);
            i++;
        }
        con.Disconnect();
        return list;
    }

    public BoardVO selectOneTitle(String title) throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "SELECT * FROM BoardDB WHERE title = ?";
        pstmt = con.getCon().prepareStatement(query);
        pstmt.setString(1, title);
        rs = pstmt.executeQuery();

        String query_index = "SELECT * FROM BoardDB ORDER BY `index` DESC";
        pstmt = con.getCon().prepareStatement(query_index);
        pstmt.executeQuery();

        BoardVO b = new BoardVO();
        while (rs.next()) {
            b.setIndex(rs.getInt("index"));
            b.setTitle(rs.getString("title"));
            b.setWriter(rs.getString("writer"));
            b.setContent(rs.getString("content"));
            b.setDay(rs.getTimestamp("insertDate"));
        }
        con.Disconnect();
        return b;
    }

    public ArrayList<BoardVO> selectLike(String info) throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "SELECT * FROM BoardDB WHERE title LIKE ?";
        pstmt = con.getCon().prepareStatement(query);
        pstmt.setString(1,"%" + info + "%");
        rs = pstmt.executeQuery();

        ArrayList<BoardVO> like = new ArrayList<>();

        while (rs.next()) {
            BoardVO m = new BoardVO();
            m.setIndex(rs.getInt("index"));
            m.setTitle(rs.getString("title"));
            m.setWriter(rs.getString("writer"));
            m.setContent(rs.getString("content"));
            m.setDay(rs.getTimestamp("insertDate"));
            like.add(m);
        }

        con.Disconnect();
        return like;
    }

    public BoardVO selectOneIndexNumber(int index) throws SQLException, ClassNotFoundException {
        return boardDESC.get(index);
    }

    public void update(BoardVO board) throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "UPDATE BoardDB SET title = ?, content = ?, updataDate = now() WHERE `index` = ?";
        pstmt = con.getCon().prepareStatement(query);
        pstmt.setString(1, board.getTitle());
        pstmt.setString(2, board.getContent());
        pstmt.setInt(3, board.getIndex());

        int result = pstmt.executeUpdate();
        if (result != 0) {
            System.out.println("게시물을 수정하였습니다.");
        }

        con.Disconnect();
    }

    public void delete(String title) throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "DELETE FROM BoardDB WHERE title = ?";
        pstmt = con.getCon().prepareStatement(query);
        pstmt.setString(1, title);

        int result = pstmt.executeUpdate();
        if (result != 0) {
            System.out.println("게시물을 삭제하였습니다.");
        }

        con.Disconnect();
    }

    public void insertComment(CommentVO com) throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "INSERT INTO CommentDB(`index`, comments, writer, regdate)"
                        + "VALUES (?, ?, ?, NOW())";
        pstmt = con.getCon().prepareStatement(query);
        pstmt.setInt(1, com.getIndex());
        pstmt.setString(2, com.getComment());
        pstmt.setString(3, com.getWriter());
        int result = pstmt.executeUpdate();
        if (result != 0) {
            System.out.println("저장되었습니다.");
        }
        con.Disconnect();
    }

    public ArrayList<CommentVO> selectAllComment() throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "SELECT * FROM CommentDB ORDER BY Bno DESC";
        pstmt = con.getCon().prepareStatement(query);
        rs = pstmt.executeQuery();

        ArrayList<CommentVO> com = new ArrayList<>();

        int index = 1;

        while (rs.next()) {
            CommentVO c = new CommentVO();
            c.setBno(rs.getInt(1));
            c.setIndex(rs.getInt(2));
            c.setComment(rs.getString(3));
            c.setWriter(rs.getString(4));
            c.setRegDate(rs.getDate(5));
            com.add(c);
            commentDESC.put(index,c);
            index++;
        }

        con.Disconnect();
        return com;
    }

    public CommentVO selectOneIdNum(int index){
        return commentDESC.get(index);
    }


}
