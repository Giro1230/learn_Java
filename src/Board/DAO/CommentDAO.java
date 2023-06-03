package Board.DAO;

import Board.VO.CommentVO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CommentDAO {
    PreparedStatement pstmt;
    ResultSet rs;
    Map<Integer, CommentVO> map;

    DBCon con;
    public CommentDAO() {
        con = new DBCon();
        map = new HashMap<>();
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

    public ArrayList<CommentVO> selectAllComment(int num) throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "SELECT * FROM CommentDB WHERE `index` = ?";
        pstmt = con.getCon().prepareStatement(query);
        pstmt.setInt(1, num);
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
            map.put(index,c);
            index++;
        }

        con.Disconnect();
        return com;
    }

    public CommentVO selectOneIdNum(int index){
        return map.get(index);
    }

    public void update(CommentVO c) throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "UPDATE CommentDB SET comments = ?, regDate = now() WHERE Bno = ?";
        pstmt = con.getCon().prepareStatement(query);
        pstmt.setString(1, c.getComment());
        pstmt.setInt(2,c.getBno());
        int result = pstmt.executeUpdate();

        if (result != 0) {
            System.out.println("업데이트 되었습니다");
        }
    }

    public void delete(int index) throws SQLException, ClassNotFoundException {
        con.DBConnection();

        String query = "DELETE FROM CommentDB WHERE `index` = ?";
        pstmt = con.getCon().prepareStatement(query);
        pstmt.setInt(1, index);
        int result = pstmt.executeUpdate();

        if (result != 0) {
            System.out.println("삭제 되었습니다");
        }
    }
}
