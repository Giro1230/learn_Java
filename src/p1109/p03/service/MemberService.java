package p1109.p03.service;

import p1109.p03.vo.MemberDB;
import p1109.p03.vo.MemberVO;

public class MemberService implements IMemberService{
    private MemberDB db;

    public MemberService(){
        db = new MemberDB();
    }

    @Override
    public void regMember(MemberVO member) {
        db.insert(member);
    }

    @Override
    public void getList(){
        for (MemberVO member :db.getMemberList()) {
            System.out.println(member);
        }
    }

    @Override
    public MemberVO getMember(String id) {
        return db.select(id);
    }

    @Override
    public void setMemberInfo(String id, MemberVO reMember) {
        db.update(id, reMember);
    }

    @Override
    public void deleteMember(String id) {
        db.deleteMember(id);
    }

    @Override
    public boolean IdDuplicateCheck(String id){
        return db.IdDuplicateCheck(id);
    }

    @Override
    public boolean login(String id) {
        return db.longin(id);
    }

    public MemberDB getDb() {
        return db;
    }
}
