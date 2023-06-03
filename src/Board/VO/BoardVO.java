package Board.VO;

import java.sql.Timestamp;

public class BoardVO {
    private int index;
    private String title;
    private String content;
    private String writer;
    private Timestamp day;

    public BoardVO() {
    }

    public BoardVO(String title, String content, String writer){
        this.title = title;
        this.content = content;
        this.writer = writer;

    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setDay(Timestamp day) {
        this.day = day;
    }

    public int getIndex() {
        return index;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Timestamp getDay() {
        return day;
    }

    @Override
    public String toString() {
        return title + "\n" + writer + "\n" + content + "\n" + day;
    }
}
