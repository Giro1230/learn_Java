package book.vo;

public class BookVO {
    private String bookCode;
    private String bookName;
    private String bookAuthor;
    private String publisher;
    private int price;

    public BookVO(String bookCode,String bookName,String bookAuthor,String publisher,int price) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publisher = publisher;
        this.price = price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "도서 코드 : " + bookCode + ' ' +
                ", 도서명 : " + bookName + ' ' +
                ", 저자 : " + bookAuthor + ' ' +
                ", 출판사 : " + publisher + ' ' +
                ", 가격 : " + price;
    }
}
