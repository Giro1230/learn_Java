package Board.UI;

import Board.Service.Board.BoardService;
import Board.VO.BoardVO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class BoardUI {
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    BoardService server;
    CommentUI commentUI;
    public BoardUI() {
        server = new BoardService();
        commentUI = new CommentUI();
    }

    public void mainUI() throws SQLException, ClassNotFoundException, IOException {
        while (true){
            System.out.println("========== 게시판 v1.1 ==========\n");
            int i = 1;
            for (BoardVO k : server.getList()) {
                System.out.println(i + "\t" + k.getTitle()+"("+ commentUI.getCount(k.getIndex()) +")" + "\t" +k.getWriter());
                i++;
            }
            System.out.println();
            System.out.println("1. 게시물 쓰기\t2. 게시물 검색");
            System.out.println("3. 게시물 수정\t4. 게시물 삭제");
            System.out.println("0.종료");
            System.out.print("입력 >> ");
            String num1 = rd.readLine();
                switch (Integer.parseInt(num1)){
                    case 0 :
                        System.out.println("시스템을 종료합니다.");
                        System.exit(0);
                        break;
                    case 1 :
                        System.out.print("제목 : ");
                        String title = rd.readLine();
                        System.out.print("글쓴이 : ");
                        String writer = rd.readLine();
                        System.out.print("내용 : ");
                        String content = rd.readLine();

                        BoardVO b = new BoardVO(title,content,writer);
                        server.regBoard(b);
                        break;
                    case 2 :
                        System.out.println("검색 종류");
                        System.out.println("1.제목\t2.번호\t0.뒤로가기");
                        String num3 = rd.readLine();
                        switch (Integer.parseInt(num3)){
                            case 0:
                                break;
                            case 1:
                                System.out.print("검색할 제목 : ");
                                String searchTitle = rd.readLine();

                                int y = 1;
                                for (BoardVO m : server.getSearchList(searchTitle)) {
                                    System.out.println(y+"\t"+m.getTitle()+"\t"+m.getWriter());
                                    y++;
                                }
                                break;
                            case 2:
                                System.out.print("검색할 번호 : ");
                                String searchNumber = rd.readLine();
                                BoardVO m = server.getTwo(Integer.parseInt(searchNumber));
                                System.out.println(m);

                                commentUI.mainUI(m);

                                break;
                            default :
                                System.out.println("잘못 입력하셨습니다. 처음으로 돌아갑니다.");
                                break;
                        }
                        break;
                    case 3 :
                        System.out.print("바꾸고 싶은 제목 입력 : ");
                        String updateTitle = rd.readLine();
                        BoardVO upBoardVO = server.getOne(updateTitle);

                        System.out.println("어떤것을 변경하고 싶습니까?");
                        System.out.println("1. 제목\t2. 내용\t0. 뒤로가기");
                        System.out.print("입력 >> ");
                        String number = rd.readLine();

                        switch (Integer.parseInt(number)){
                            case 0 :
                                System.out.println("뒤로 갑니다.");
                                break;
                            case 1 :
                                System.out.print("제목 : ");
                                String updateTitle2 = rd.readLine();
                                upBoardVO.setTitle(updateTitle2);
                                server.updateBoard(upBoardVO);
                                break;
                            case 2 :
                                System.out.print("내용 : ");
                                String updateContent = rd.readLine();
                                upBoardVO.setContent(updateContent);
                                server.updateBoard(upBoardVO);
                                break;
                            default :
                                System.out.println("잘못입력 하셨습니다.");
                                break;
                        }
                        break;
                    case 4 :
                        System.out.print("삭제할 제목 입력 : ");
                        String remove = rd.readLine();
                        server.remove(remove);
                        for (int j = 1; i < server.getList().size() - 1; j++) {
                            server.getList().get(i).setIndex(i);
                        }
                        break;
                    default :
                        System.out.println("잘못입력 하셨습니다.");
                        break;
                }
        }
    }
}
