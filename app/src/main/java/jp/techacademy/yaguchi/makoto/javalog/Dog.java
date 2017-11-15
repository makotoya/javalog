package jp.techacademy.yaguchi.makoto.javalog;

/**
 * Created by Makoto Yaguchi on 2017/11/14.
 */


import android.util.Log;

class Dog extends Animal implements Movable {
    // クラス変数
    static String to_jp = "犬";

    // コンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatet", "これは犬クラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「わんわん」");
    }

    @Override
    public void move() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った");
    }
}
