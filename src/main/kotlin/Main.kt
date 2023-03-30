fun main(){
    var w=list(listOf("Mangoes","Apples","Lemon","passion","orange","beetroot","watermellon","grapes","banana","dates"))
    println(w)
   var x= heights(listOf(20,30,50,70))
    println(x)
    person()
    var u= mileage(listOf(Car(303,20),Car(202,40)))
    println(u)
    person()
    


}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc
fun  list(fruits:List<String>):List<String> {
    var lists = mutableListOf<String>()
    fruits.forEachIndexed { index, d ->
        if (index % 2 == 0)
            lists.add(d)
    }
    return lists
}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
fun heights(height:List<Int>):String{
    var heit=height.average()
    var d=height.sum()
    var g="The average is$heit metres and the sum is $d metres"
     return  g
}
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Int,var weight:Int)
fun  person(){
    var person1=Person("Mary",25,40,60)
    var person2=Person("Judas",24,69,80)
    var person3=Person("Gloria",30,60,80)
    var total =listOf<Person>(person1,person2,person3)
    val sorted2=total.sortedByDescending{ total->total.age}
    println(sorted2)
//    4. Given a list similar to the one above, write a function in which you will
//    create 2 more people objects and add them to the list at one go.
data class Person2(var name:String,var age:Int,var height:Int,var weight:Int)
    fun personnels  (){
        var person1=Person("Mary",25,40,60)
        var person2=Person("Judas",24,69,80)
        var person3=Person("Gloria",30,60,80)
        var person4=Person("Angella",30,60,50)
        var person5=Person("Eunice",39,69,50)
        var totals=listOf<Person>(person1,person2,person3,person4,person5)
        println(totals)

    }


//    Given a list similar to the one above, write a function in which you will
//    create 2 more people objects and add them to the list at one go.
}
//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:Int,var mileage:Int)

fun mileage( cars: List<Car>):Int{
    var count=0
    for (i in cars){
        count += i.mileage
    }
    var average=cars.count()
    return average



}



