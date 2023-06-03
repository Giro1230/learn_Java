package p1109.p03.service;

import p1109.p03.vo.MemberVO;

public interface IMemberService {
    void regMember(MemberVO member);
    MemberVO getMember(String id);
    void getList();

    void setMemberInfo(String id, MemberVO reMember);

    void deleteMember(String id);
    public boolean IdDuplicateCheck(String id);

    public boolean login(String id);

    }
