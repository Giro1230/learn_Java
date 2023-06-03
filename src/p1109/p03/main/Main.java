package p1109.p03.main;

import p1109.p03.service.MemberService;
import p1109.p03.vo.MemberVO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean switchButton = true;
        MemberService server = new MemberService();

        System.out.println("====== 환영합니다 ======");
        while (switchButton){
            System.out.println("1.회원가입\t2.로그인\t\t0.종료");
            System.out.print("입력 >> ");
            int x = input.nextInt();

            if (x == 0) {
                System.out.println("시스템을 종료합니다.");
                break;
            }

            switch (x){
                case 1 :
                    boolean idCheck = true;
                    String id = null;
                    while (idCheck) {
                        System.out.println();
                        System.out.print("ID input: ");
                        id = input.next();
                        System.out.println();

                        if (server.IdDuplicateCheck(id)){
                            System.out.println("아이디 중복입니다.");
                        }else {
                            idCheck = false;
                        }
                    }

                    System.out.print("Password input: ");
                    String pwd = input.next();
                    System.out.println();

                    System.out.print("Name input: ");
                    String name = input.next();
                    System.out.println();

                    System.out.print("PhoneNumber input: ");
                    String phoneNum = input.next();
                    System.out.println();

                    MemberVO member = new MemberVO(id, pwd, name, phoneNum);
                    server.regMember(member);

                    break;
                case 2 :
                    System.out.print("아이디 : ");
                    String checkId = input.next();

                    if (server.login(checkId)){
                        System.out.println("로그인 되셨습니다.");
                        System.out.println();

                        System.out.println("1. 정보보기\t2. 전체회원보기\t3. 회원정보 수정");
                        System.out.println("4. 회원탈퇴\t0. 로그아웃");
                        System.out.print("입력 >> ");
                        int menuNum = input.nextInt();

                        if (menuNum == 0) {
                            System.out.println("로그아웃 되었습니다.");
                            break;
                        }
                        switch (menuNum){
                                case 1 :
                                    System.out.println("조회하고 싶은 Id를 입력해주세요");
                                    System.out.print("ID : ");
                                    String searchID = input.next();
                                    System.out.println(server.getMember(searchID));
                                    System.out.println();
                                    break;
                                case 2 :
                                    server.getList();
                                    System.out.println();
                                    break;
                                case 3 :
                                    System.out.println("조회 하고 싶은 정보를 선택해주세요");
                                    System.out.println("1. 비밀번호\t2. 핸드폰번호");
                                    System.out.print("입력 >> ");
                                    int sNum = input.nextInt();

                                    System.out.println("조회하고 싶은 Id를 입력해주세요");
                                    System.out.print("ID : ");
                                    String updateId = input.next();

                                    switch (sNum) {
                                        case 1:
                                            System.out.print("새로운 비밀번호 입력 >>");
                                            String updatePwd = input.next();
                                            System.out.println();

                                            for (int i = 0; i < server.getDb().getMemberList().size(); i++) {
                                                if (server.getDb().getMemberList().get(i).getId().equals(updateId)){
                                                    server.getDb().getMemberList().get(i).setPwd(updatePwd);
                                                    MemberVO neMemberVO = server.getDb().getMemberList().get(i);
                                                    server.setMemberInfo(updateId, neMemberVO);
                                                }
                                            }
                                            break;
                                        case 2 :
                                            System.out.print("새로운 전화번호 입력 >> ");
                                            String updatePhoneNumber = input.next();
                                            System.out.println();

                                            for (int i = 0; i < server.getDb().getMemberList().size(); i++) {
                                                if (server.getDb().getMemberList().get(i).getId().equals(updateId)){
                                                    server.getDb().getMemberList().get(i).setTel(updatePhoneNumber);
                                                    MemberVO neMemberVO = server.getDb().getMemberList().get(i);
                                                    server.setMemberInfo(updateId, neMemberVO);
                                                }
                                            }
                                            break;
                                    }
                                    break;
                                case 4 :
                                    System.out.println("삭재하고 싶은 Id를 입력해주세요");
                                    System.out.print("ID : ");
                                    String deleteId = input.next();

                                    server.deleteMember(deleteId);
                            }
                        System.out.println("\n계속하시겠습니까?");
                        System.out.println("Y / N");
                        String d = input.next();
                        System.out.println();

                        if ("n".equals(d.toLowerCase())){
                            switchButton = false;
                        }
                    }else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                    break;
            }
        }

        input.close();
    }
}
