package p1115;

public class StringBufferEx {
    //  StringBuffer 클래스도 String 클래스처럼 문자열을 다룬다.
    //  String 객체의 경우 내부의 문자열을 수정할수 없다. (다시 만들어야한다.)
    //  StringBuffer 객체의 경우 문자열을 저장하는 가변 버퍼를 가지고 있다.
    //  그래서 저장된 문자열의 수정이 가능하다.
    //  간단한 문자열을 처리하는 경우에는 String 클랴스를 이용하고,
    //  문자열의 길이가 길거나 수시로 변하는 경우에는 StringBuffer 클래스를
    //  이용한다.(가급적)
    public static void main(String[] args) {
        //StringBuffer sb = new StringBuffer();// 내부 버퍼의 크기가
        StringBuffer sb = new StringBuffer("Java");//  'Java' 로 초기
        //StringBuffer sb3 = new StringBuffer(2000);//    버퍼 크기를

        sb.append("는 정말 ");
        sb.append("재미있다고 하고 싶다.");
        System.out.println(sb);
        sb.replace(11, 12, "없");
        System.out.println(sb);

        /*
        StringBuffer sb4 = new StringBuffer("This");
        sb4.append(" is pencil");// 문자열 이어붙이기
        sb4.insert(7, " my");// 문자열 삽입하기
        System.out.println(sb4);
        sb4.replace(8, 10, "your");// 문자열 수정하기
        System.out.println(sb4);
        sb4.delete(8, 13);// 문자열 삭제하기
        System.out.println(sb4);
        sb4.setLength(4);// 문자열 줄이기
        System.out.println(sb4);
        */
    }
}
