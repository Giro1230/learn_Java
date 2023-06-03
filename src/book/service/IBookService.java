package book.service;

import book.vo.BookVO;

public interface IBookService {
    public void insertBookInfo(BookVO book);
    public void getBookInfo(int num, String info);
    public void updateBookInfo(BookVO book);
    public void deleteBookInfo(String code);

    default void book(){
        System.out.println("Hello");
    }
}
