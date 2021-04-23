import kotlin.math.hypot

fun main() {
   println(isEven(2))
    println(isEven(5))
    var fruits=Product("Pineapple",0.1F,70.00,"glocery")
    var items=Product("soap",0.5F,100.00,"hygiene")
    var furnitures=Product("Chair",10F,300.00,"other")
    fruits.checkPro()
    items.checkPro()
    furnitures.checkPro()
    println(lab("LoveLace"))
    println(checkName(arrayOf("Kotlin","LoveLace","Anne","Instagram","Apple")))
}
   fun isEven(number:Int):Boolean{
       if(number%2==0){
           return true
       } else{
           return false
       }
   }
data class Product(var name:String,var weight:Float,var price:Double,var category:String){
fun checkPro(){
var glocery= mutableListOf<String>()
    var hygiene= mutableListOf<String>()
    var other= mutableListOf<String>()
    when(category){
      "glocery"-> println(mutableListOf("$name:$category"))
        "hygiene"-> println(mutableListOf("$name:$category"))
        else-> println("other category")

    }
}
}
fun lab(name:String):String{
    var text=""
    for(char in name){
     if(name.indexOf(char)%2==0){
        text +=char
     }
    }
    return text
}
fun checkName(names:Array<String>):MutableList<String>{
    var nameList= mutableListOf<String>()
    for(name in names)
        if (name.length %2==0){
            nameList.add(name)
        }
    return nameList
}
