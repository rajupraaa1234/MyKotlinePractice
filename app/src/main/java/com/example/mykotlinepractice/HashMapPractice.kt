package com.example.mykotlinepractice

import java.lang.reflect.Array.set
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.collections.Set as Set1


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

    var hashmap:HashMap<Int,String> = HashMap<Int,String>()
    hashmap.put(1,"raju")
    hashmap.put(2,"rahul")
    hashmap.put(3,"raja")
    hashmap.put(4,"rakesh")

    for(i in hashmap){
        println("${i.key}  ${i.value}")
    }

    val stringMap: HashMap<String,String> = hashMapOf<String,String>()
    stringMap.put("name", "Ashu")
    stringMap.put("city", "Delhi")
    stringMap.put("department", "Development")
    stringMap.put("hobby", "Playing")

    println("......traverse stringMap.......")
    for(key in stringMap.keys){
        println("Key = ${key} , value = ${stringMap[key]}")
    }

    val mySet: kotlin.collections.Set<Any> = setOf(2,6,4,29,4,5,"Ajay","Ashu","Ajay")
    println(".......print Any set.........")
    for(element in mySet){
        println(element)
    }

    var hset2 = HashSet<Int>()
    hset2.add(12)
    hset2.add(12)

    for(i in hset2){
        println("$i ")
    }

}
