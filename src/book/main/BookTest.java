package book.main;

import book.service.BookService;
import book.vo.BookInfotVo;
import book.vo.BookVO;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        BookService bs = new BookService();
        BookInfotVo bi = new BookInfotVo();
        Scanner sc = new Scanner(System.in);

        System.out.println("========\t환영합니다\t\t========");
        boolean switchButton = true;

        while (switchButton){
            System.out.println("1. 도서 등록\t2. 도서 검색\t3. 도서 재등록");
            System.out.println("4. 도서 삭제\t0. 종료");
            System.out.print("입력 >> ");
            int num = sc.nextInt();

            if (num == 0) {
                switchButton = false;
                break;
            }

            switch (num) {
                case 1:
                    bs.insertBookInfo(bi.insertVo());
                    break;

                case 2:
                    System.out.println("\n1. 도서명 검색\t2. 저자로 검색\t3. 출판사로 검색");
                    System.out.print("입력 >> ");
                    int number = sc.nextInt();

                    System.out.print("\n검색어 입력 : ");
                    String s = sc.next();

                    bs.getBookInfo(number, s);
                    break;

                case 3:
                    System.out.print("\n도서 코드 입력 : ");
                    String searchCode = sc.next();

                    System.out.print("\n수정 가격 입력 : ");
                    int setPrice = sc.nextInt();

                    for (int i = 0; i < bs.getDb().size(); i++) {
                        if (bs.getDb().get(i).getBookCode().equals(searchCode)) {
                            bs.getDb().get(i).setPrice(setPrice);
                            BookVO setBook = bs.getDb().get(i);
                            bs.updateBookInfo(setBook);
                        }
                    }
                    break;

                case 4 :
                    System.out.print("삭제할 도서코드 입력 : ");
                    String searchCode2 = sc.next();
                    bs.deleteBookInfo(searchCode2);
            }
            System.out.println("\n계속하시겠습니까?");
            System.out.println("Y / N");
            String d = sc.next();

            if ("n".equals(d.toLowerCase())){
                switchButton = false;
            }
        }
    }
}
