package p1109.p02;

import java.util.Scanner;

public class TestUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Factory factory = new Factory();
        ITVService tv;
        ISpeaker speaker;

        System.out.print("TV 브랜드 입력 : ");
        String brandName = sc.next();
        System.out.println();

        tv = (ITVService) factory.getBrand(brandName);
        tv.on();
        tv.vUp();
        tv.vDown();
        tv.off();

        System.out.println();

        System.out.print("스피커 브랜드 입력 : ");
        brandName = sc.next();
        speaker = (ISpeaker) factory.getSpeakerBrand(brandName);
        System.out.println();

        speaker.volumeUp();
        speaker.volumeDown();
    }
}

