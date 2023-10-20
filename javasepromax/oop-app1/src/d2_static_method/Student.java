package d2_static_method;

public class Student {
    double score;
    // 类方法
    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
    }

    // 实例方法 （对象的方法）
    public void printPass(){
        System.out.println("成绩：" + (score >= 60 ? "及格": "不及格"));
    }
}
