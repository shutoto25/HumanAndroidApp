package com.example.humanandroidapp

/**
 * Animal抽象クラス.
 */
abstract class Animal(name: String, age: Int) {

    var name = name
    var age = age

    abstract fun say()
}