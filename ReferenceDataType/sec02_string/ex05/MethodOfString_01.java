package ReferenceDataType.sec02_string.ex05;

import java.util.Arrays;

public class MethodOfString_01 {
    public static void main(String[] args) {

        // 1. 문자열 길이 - length()
        String str1 = "Hello Java!";
        String str2 = "안녕하세요~ 반갑습니다!";
        System.out.println(str1.length()); //11
        System.out.println(str2.length()); // 13
        System.out.println();

        // 2. 문자열 검색 - charAt() : 특정위치에서의 char 값, indexOf() : 앞부터, lastIndexOf() : 뒤부터
        System.out.println(str1.charAt(1)); // e, index가 1번인 곳의 char 값
        System.out.println(str2.charAt(1)); // 녕
        System.out.println();

        System.out.println(str1.indexOf('a')); // 7
        System.out.println(str1.lastIndexOf('a')); // 9
        System.out.println(str1.indexOf('a', 8)); // 8번(v)부터 찾아라, 9
        System.out.println(str1.lastIndexOf('a', 8)); // 8번(v)부터 찾아라, 7
        System.out.println(str1.indexOf("Java")); // 시작 인덱스 출력, 6
        System.out.println(str1.lastIndexOf("Java")); // 6
        System.out.println(str2.indexOf("하세요")); // 시작 인덱스, 2
        System.out.println(str2.lastIndexOf("하세요")); // 2, 뒤에서 봐도 하나밖에 없으니까 위랑 같음
        System.out.println(str1.indexOf("Bye")); // -1, 찾는 문자열이 인덱스에 없음
        System.out.println(str2.lastIndexOf("감사")); // -1, 찾는 문자가 인덱스에 없음

        // 3. 문자열 변환 및 연결 String.valueOf(), concat()
        // String.valueOf(기본자료형) 기본 자료형 -> String
        String str3 = String.valueOf(2.3); // double을 String으로
        String str4 = String.valueOf(false); // booelan 값인 false를 String으로
        System.out.println(str3); // 2.3
        System.out.println(str4); // false

        // concat() : 문자열 연결
        String str5 = str3.concat(str4);
        System.out.println(str5); // 2.3false

        // String.valueOf() + concat() => +
        String str6 = "안녕" + 3; // 안녕3
        String str7 = "안녕".concat(String.valueOf(3)); // 안녕3

        // 문자열 -> byte[] getBytes(), 문자열 -> char[] toCharArray()
        String str8 = "Hello Java!";
        String str9 = "안녕하세요";

        // byte -> 실제로 영문자는 1byte만 사용함, 한글은 2byte를 쪼개서 사용, getBytes()
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1)); // 각 문자의 ASCII 코드가 byte 배열로 저장된 것
        System.out.println(Arrays.toString(array2)); // byte가 기본이므로 깨져서 ASCII 코드가 나옴

        // char -> 2byte 배열, toCharArray()
        char[] array3 = str8.toCharArray();
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array3)); // 2byte이므로 글자 출력
        System.out.println(Arrays.toString(array4)); // char 형식

    }
}
