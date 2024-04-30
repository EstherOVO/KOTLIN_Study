package i_function;

public class JavaFun {

// 자바에서 매개 변수를 다양하게 받고 싶을 때
    public void repeat(String str, int num, boolean isNewLine) {

        for (int i = 0; i < num; i++) {
            if (isNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num) {

        repeat(str, num, true);
    }

    public void repeat(String str) {

        repeat(str, 3, true);
    }

    public static void main(String[] args) {

        JavaFun javaFun = new JavaFun();
        javaFun.repeat("문자열", 3, true);
        javaFun.repeat("문자열", 5);
        javaFun.repeat("문자열");
    }
}
