package p1109.p03.vo;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberDB {
    Scanner sc = new Scanner(System.in);
    private ArrayList<MemberVO> memberList;

    public MemberDB() {
        memberList = new ArrayList<MemberVO>();
    }

    public void insert(MemberVO member){
        memberList.add(member);
    }

    public MemberVO select(String id) {
        MemberVO n = null;

        for (int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getId().equals(id)){
                System.out.print("비밀번호 : ");
                String checkNum = sc.next();
                if(memberList.get(i).getPwd().equals(checkNum)){
                    n = memberList.get(i);
                }
                break;
            }
        }

        return n;
    }

    public ArrayList<MemberVO> getMemberList() {
        return memberList;
    }

    public void update(String id, MemberVO reMember) {
        for (int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getId().equals(id)){
                System.out.print("비밀번호 : ");
                String checkNum = sc.next();
                if(memberList.get(i).getPwd().equals(checkNum)){
                    memberList.remove(i);
                    memberList.add(reMember);
                }
                break;
            }
        }
    }

    public void deleteMember(String id){
        for (int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getId().equals(id)){
                System.out.print("비밀번호 : ");
                String checkNum = sc.next();
                if(memberList.get(i).getPwd().equals(checkNum)){
                    memberList.remove(i);
                }
                break;
            }
        }
    }

    public boolean IdDuplicateCheck(String id){
        if (memberList.size() > 0) {
            for (int i = 0; i < memberList.size(); i++) {
                if(memberList.get(i).getId().equals(id)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean longin(String id) {
        for (int i = 0; i < memberList.size(); i++) {
            if(memberList.get(i).getId().equals(id)){
                System.out.print("비밀번호 : ");
                String checkNum = sc.next();
                if(memberList.get(i).getPwd().equals(checkNum)){
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
