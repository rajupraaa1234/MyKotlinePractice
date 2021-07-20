package com.example.mykotlinepractice

class HashMapPractice {
}

fun main(){
    practiceOnHashSet()
}

fun practiceOnHashSet() {
    var hset = mapOf<Int,String>(1 to "Raju",2 to "Rahul",3 to "raja")
    for(key in hset){
        println("${key.key} ===> ${key.value}")
    }
}
