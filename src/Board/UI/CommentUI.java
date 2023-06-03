package Board.UI;

import Board.Service.Comment.CommentService;
import Board.VO.BoardVO;
import Board.VO.CommentVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class CommentUI {
    CommentService server;
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

    public CommentUI() {
        server = new CommentService();
    }

    public void mainUI(BoardVO board) throws SQLException, ClassNotFoundException, IOException {
        boolean sw = true;
        while (sw){
            System.out.println("========== 댓글 ==========\n");
            int i = 1;
            for (CommentVO k : server.getAll(board.getIndex())) {
                System.out.println(i +" "+ k.getComment()+" "+k.getWriter() + " " + k.getRegDate());
                i++;
            }
            System.out.println();
            System.out.println("1. 댓글 쓰기\t2. 댓글 검색");
            System.out.println("3. 댓글 수정\t3. 댓글 삭제");
            System.out.println("0. 뒤로가기");
            System.out.print("입력 >> ");
            String num1 = rd.readLine();
            switch (Integer.parseInt(num1)){
                case 0 :
                    sw = false;
                    break;
                case 1 :
                    System.out.print("글쓴이 : ");
                    String writer = rd.readLine();
                    System.out.print("내용 : ");
                    String content = rd.readLine();

                    CommentVO b = new CommentVO(board.getIndex(),content,writer);
                    server.regData(b);
                    break;
                case 2 :
                    System.out.println("검색");
                    System.out.println("1.번호\t0.뒤로가기");
                    String num3 = rd.readLine();
                    switch (Integer.parseInt(num3)){
                        case 0:
                            break;
                        case 1:
                            System.out.print("검색할 번호 : ");
                            String searchNumber = rd.readLine();
                            CommentVO m = server.getOne(Integer.parseInt(searchNumber));
                            System.out.println();
                            break;
                        default :
                            System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
                            break;
                    }
                    break;
                case 3 :
                    System.out.print("바꾸고 싶은 번호 입력 : ");
                    String updateTitle = rd.readLine();
                    CommentVO comment = server.getOne(Integer.parseInt(updateTitle));

                    System.out.println("어떤것을 변경하고 싶습니까?");
                    System.out.println("1. 내용\t0. 뒤로가기");
                    System.out.print("입력 >> ");
                    String number = rd.readLine();

                    switch (Integer.parseInt(number)){
                        case 0 :
                            System.out.println("뒤로 갑니다.");
                            break;
                        case 1 :
                            System.out.print("내용 : ");
                            String updateContext = rd.readLine();
                            comment.setComment(updateContext);
                            server.update(comment);
                            break;
                        default :
                            System.out.println("잘못입력 하셨습니다.");
                            break;
                    }
                    break;
                case 4 :
                    System.out.print("삭제할 번호 입력 : ");
                    String remove = rd.readLine();
                    server.delete(Integer.parseInt(remove));
                    for (int j = 1; i < server.getAll(board.getIndex()).size() - 1; j++) {
                        server.getAll(board.getIndex()).get(i).setIndex(i);
                    }
                    break;
                default :
                    System.out.println("잘못입력 하셨습니다.");
                    break;
            }
        }
    }

    public int getCount(int index) throws SQLException, ClassNotFoundException {
        return server.getAll(index).size();
    }
}
