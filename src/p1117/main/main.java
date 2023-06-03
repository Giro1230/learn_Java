package p1117.main;

import p1117.DB.MemberDB;
import p1117.VO.MemberVO;

public class main {
    public static void main(String[] args) throws Exception {
        MemberVO m1 = new MemberVO("admin", "admin","admin","010-1111-1111");
        MemberDB test = new MemberDB();
        test.insertMember(m1);
        test.getMember(m1.getId());
    }
}
