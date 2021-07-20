package com.example.mykotlinepractice

class Practice {

}

fun main(){
    println("Hii Raju kumar Gupta")
    listCheck()
}

fun listCheck(){
    var mutableList = mutableListOf("Ajay","Vijay","Prakash","Vijay")

    for(element in mutableList){
        println(element)
    }
    println()
    for(index in 0..mutableList.size-1){
        println(mutableList[index])
    }

    var intlist : MutableList<Int> = mutableListOf()
    var stringlist : MutableList<String> = mutableListOf()
    var Anylist : MutableList<Any> = mutableListOf()

    intlist.add(12)
    intlist.add(13)
    intlist.add(14)
    intlist.add(15)

    stringlist.add("Raju")
    stringlist.add("Rahul kumar")
    stringlist.add("Raja")
    stringlist.add("Raj kumar")

    Anylist.add(12)
    Anylist.add("Raju kumar")
    Anylist.add("Rahul kumar gupta")
    Anylist.add(23)

    for(i in intlist){
        print("$i ")
    }

    println()

    for(i in stringlist){
        print("$i ")
    }

    println()

    for(i in Anylist){
        print("$i ")
    }

    var arr  = ArrayList<Int>()
    arr.add(102)
    arr.add(101)
    arr.add(1023)

    println()
    for(i in arr){
        println("$i ")
    }

}