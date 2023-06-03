package book.service;

import book.vo.BookVO;

import java.util.ArrayList;

public class BookService implements IBookService{
    ArrayList<BookVO> db;

    public BookService() {
        db = new ArrayList<>();
    }

    public void insertBookInfo(BookVO book){
        db.add(book);
    }

    public void getBookInfo(int num, String info){
        switch (num) {
            case 1:
                for (int i = 0; i < db.size(); i++) {
                    if(db.get(i).getBookName().contains(info)){
                        System.out.println(db.get(i).toString());
                    }
                }
                break;

            case 2 :
                for (int i = 0; i < db.size(); i++) {
                    if (db.get(i).getBookAuthor().contains(info)) {
                        System.out.println(db.get(i).toString());
                    }
                }
                break;

            case 3 :
                for (int i = 0; i < db.size(); i++) {
                    if (db.get(i).getPublisher().contains(info)) {
                        System.out.println(db.get(i).toString());
                    }
                }
                break;
        }
    }

    public void updateBookInfo(BookVO book){
        for (int i = 0; i < db.size(); i++) {
            if(db.get(i).getBookCode().equals(book.getBookCode())){
                db.remove(i);
                db.add(book);
                break;
            }
        }
    }

    public void deleteBookInfo(String code){
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getBookCode().equals(code)) {
                db.remove(i);
                break;
            }
        }
    }

    public ArrayList<BookVO> getDb() {
        return db;
    }
}
