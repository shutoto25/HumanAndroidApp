package com.example.humanandroidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

const val TAG = "HumanAndroidApp"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val humanTanaka = Human("田中", 19, "サッカー")
        humanTanaka.say()
        humanTanaka.think()

        val humanMatsuo = Human("松尾", 22, "野球")
        humanMatsuo.say()
        humanMatsuo.think()
    }
}

//Humanクラスを定義し、生成したインスタンスからメソッドを呼び出してLog出力してください。
//
//以下の要件を満たすアプリを作成してください。
//
//抽象クラスAnimalを継承したHumanクラスを定義し、生成したインスタンスのsayメソッドで「私の名前は〜〜です。年は〜〜歳です。」
// （〜〜はメンバ変数から取得）というLogを出力させてください。sayメソッドにはoverride修飾子を付けてください。
//thinkメソッドを持つThinkableインタフェースを作成し、Humanクラスに実装させてください。
// Humanクラスにはhobbyという文字列型のメンバ変数を用意し、thinkメソッドを呼び出すと「私は〜〜について考える。」
// （〜〜はhobbyから取得）というLogを出力させてください。
//Humanクラスの各メンバ変数の初期化はコンストラクタ内で行い、インスタンス毎に異なる値が設定できるようにして下さい。
//MainActivityでHumanクラスのインスタンスを2つ作成し、それぞれのsayメソッドとthinkメソッドを呼び出して下さい。