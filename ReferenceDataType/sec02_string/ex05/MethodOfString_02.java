package ReferenceDataType.sec02_string.ex05;

import java.util.Arrays;

public class MethodOfString_02 {
    public static void main(String[] args) {

        // 1. 문자열 수정
        // toLowerCase() : 소문자로 변경, toUpperCase() : 대문자로 변경
        String str1 = "Java Study";
        System.out.println(str1.toLowerCase()); // java study
        System.out.println(str1.toUpperCase()); // JAVA STUDY

        // replace() : 특정 값을 특정 값으로 대체
        System.out.println(str1.replace("Study", "공부")); // Java 공부

        // substring() : 문자열 일부분을 새로운 문자열로 가져오는 것(= 발췌)
        System.out.println(str1.substring(0, 5)); // 시작 값과 끝 값의 인덱스. Java_ : 공백까지

        // split() : 데이터 쪼개기
        String[] strArray1 = "abc/def-ghi jkl".split("/"); // /를 기준으로 쪼갠다
        String[] strArray2 = "abc/def-ghi jkl".split("/|-| "); // | (or)를 사용해서 /와 -와 공백을 쪼개갰다.
        System.out.println(Arrays.toString(strArray1));
        System.out.println(Arrays.toString(strArray2));

        // trim() : 공백 제거
        System.out.println("    abc  ".trim());

        // 2. 문자열 내용 비교 equals() : 대소문자 구분 + 같은지 비교, equalsIgnoreCase() : 대소문자를 무시하고 같은지 비교
        String str2 = new String("Java");
        String str3 = new String("java");
        String str4 = new String("Java");

        // stack 메모리 비교 (==) : 번지 수 비교
        System.out.println(str2  == str3); // false
        System.out.println(str3  == str4); // false
        System.out.println(str4  == str2); // false

        // equals(), equalsIgnoreCase() : 내용 비교
        System.out.println(str2.equals(str3)); // str2와 str3의 내용이 똑같은지 비교, false
        System.out.println(str3.equals(str4)); // false
        System.out.println(str3.equalsIgnoreCase(str4)); // 대소문자 구분없이 내용 비교, true

    }
}
