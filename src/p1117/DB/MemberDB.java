package p1117.DB;

import p1117.VO.MemberVO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class MemberDB {
    int id = 0;
    Map<String, MemberVO> db = new HashMap<String, MemberVO>();

    public void insertMember(MemberVO member) throws Exception{
        db.put(member.getName(), member);
        File file = new File("/Users/giro/Desktop/Code/Java/src/p1117/data/member"+ (id++) +".txt");
        FileWriter fw = new FileWriter(file ,true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(member +"\n");

        bw.close();
        fw.close();
    }

    public MemberVO getMember(String id){
        return db.get(id);
    }


    void deleteMember(String id) {
        db.remove(id);
    }
}
