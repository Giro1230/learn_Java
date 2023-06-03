package book.vo;

import java.util.Scanner;

public class BookInfotVo {
    public BookVO insertVo(){
        Scanner sc = new Scanner(System.in);
        BookVO book;

        System.out.print("\n도서 코드 입력 : ");
        String code = sc.next();

        System.out.print("\n도서 제목 입력 : ");
        String name = sc.next();

        System.out.print("\n도서 저자 입력 : ");
        String author = sc.next();

        System.out.print("\n출판사 입력 : ");
        String publisher = sc.next();

        System.out.print("\n가격 입력 : ");
        int price = sc.nextInt();

        return book = new BookVO(code, name, author, publisher, price);
    }
}
