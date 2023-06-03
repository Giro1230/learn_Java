package chap02;

import java.util.Random;

public class SearchChar {
    public static void main(String[] args){
        // charAt은 문자열에서 원하는 위치의 문자를 char타입으로 저장 할수 있다.
        String str = "ABC DFG";
        char cha = str.charAt(1);
        System.out.println(cha);

        String charAt = "Hello Java";

        for (int i = 0; i < charAt.length(); i++) {
            if(charAt.charAt(i) == 'J'){
                System.out.println((i+1)+"번째에 J가 있습니다.");
            }
        }

        String ss1 = "ABC DEFG";
        String ss2 = "ABCDEFG";

        for (int i = 0; i < ss1.length(); i++) {
            char c1 = ss1.charAt(i);
            char c2 = ss2.charAt(i);
            if(c1 != c2){
                System.out.printf("%d번째문자가 다릅니다.",i+1);
                break;
            }
        }

        // 참조변수는 주소 값을 가지게 된다. 결국 같은 주소 값을 가지는 참조변수가 2개가 생기게 된것이고 주소는 같은 주소를 공유하게 된다.
        String equals1 = "Hello";
        String equals2 = "Hello";
        // 새로운 주소값을 할당했기 때문에 결과가 false
        String equals3 = new String("Hello");

        System.out.println(equals1==equals2);
        System.out.println(equals2==equals3);
        System.out.println(equals1==equals3);

        // 문자 자체를 비교하기 위해서 equals 메소드를 사용하게 된다.
        boolean b1 = equals1.equals(equals3);
        boolean b2 = equals2.equals(equals3);
        boolean b3 = equals3.equals("Hello");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        String subString1 = "012345";
        // 첫번째 숫자는 시작되는 숫자, 두번째 숫자는 자신을 포함하지 않은 마지막 숫자
        String c = subString1.substring(1, 4);
        System.out.println(c);

        String subString2 = "AppleBananaPeach";
        String banana = subString2.substring(5, 11);
        System.out.println(banana);

        // 이 경우는 시작 위치에서 끝까지 출력하게 된다.
        String peach = subString2.substring(11);
        System.out.println(peach);

        // 문자열 안에 char타입의 값을 넣게 되면 몇번에 위치 했는지 알수 있다. 문자열 안에 없는 값을 넣게 되면 -1이 출력된다.
        // lastIndexOf는 해당값의 마지막 위치의 번호를 출력한다.
        int index = subString2.lastIndexOf('P');
        System.out.println(index);

        String indexOf = "apple.jpg";
        int index2 = indexOf.indexOf('.');
        System.out.println("파일의 확장자는 " + indexOf.substring(index2+1));

        String str5 = "apple";
        String str6 = ".jpg";
        // 문자열을 이어붙인다.
        String result = str5.concat(str6);
        System.out.println(result);


        String s1 = "sss++s++s=SSSSSSsss++s=S=+sssss";

        int j = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)=='s'){
                j++;
                int x = s1.indexOf('s')+i;
                System.out.println("s의 위치 :" + (x+1));
            }
        }

        System.out.println("\ns의 갯수 : "+j);

        // split은 문자열을 설정하고 해당 문자열이 있는 곳을 삭제하여 문자열을 나눈다.
        String split = "2022-10-26";
        String[] x = split.split("-");

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        String x1 = "네오는 /무지는 /어피치는 ";
        String x2 = "교실에서 /화장실에서 /식당에서 ";
        String x3 = "공부했다/화장했다/밥을먹었다";

        String[] name = x1.split("/");
        String[] place = x2.split("/");
        String[] acting = x3.split("/");

        Random rd = new Random();

        for (int i = 0; i < name.length; i++) {
            int rdN1 = rd.nextInt(name.length);
            int rdN2 = rd.nextInt(place.length);
            int rdN3 = rd.nextInt(acting.length);
            System.out.println(name[rdN1] + place[rdN2] + acting[rdN3]);
        }

        // replace는 타켓인 곳을 원하는 값으로 바꾼다.
        String replace = "AABBCCDD";
        String result2 = replace.replace("BC", "XX");
        
        System.out.println(result2);
        
        // contains는 해당값에서 원하는 값을 대입해보고 boolean으로 값이 반환된다.
        String contains = "AABBCCDD";
        contains.contains("XX");
        System.out.println(contains.contains("XX"));

        // trim은 앞뒤의 공백구간을 지우고 문자열의 크기를 줄인다.
        String trim = " AABB CCDD ";
        System.out.println(trim.length());

        System.out.println(trim.trim().length());

        // 대문자를 소문자로 줄인다.
        String toLowerCase = "AABBCCDD";
        System.out.println(toLowerCase.toLowerCase());
        
        // 소문자를 대문자로 늘린다.
        String toUpperCase = "aabbccdd";
        System.out.println(toUpperCase.toUpperCase());

    }
}
