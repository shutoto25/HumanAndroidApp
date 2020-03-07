package com.example.humanandroidapp

import android.util.Log

class Human : Animal, Thinkable {

    private var hobby: String

    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d(TAG, "私の名前は" + this.name + "です。")
        Log.d(TAG, "年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d(TAG, "私は" + this.hobby + "について考える。")
    }
}