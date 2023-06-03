package Board.VO;

import java.sql.Date;

public class CommentVO {
    private int bno;
    private int index;
    private String comment;
    private String writer;
    private Date regDate;

    public CommentVO() {
    }

    public CommentVO(int index, String comment, String writer) {
        this.index = index;
        this.comment = comment;
        this.writer = writer;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public int getBno() {
        return bno;
    }

    public int getIndex() {
        return index;
    }

    public String getComment() {
        return comment;
    }

    public String getWriter() {
        return writer;
    }

    public Date getRegDate() {
        return regDate;
    }


}
