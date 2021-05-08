import jdk.jfr.Category
fun main() {
    println( isEven(2))
    println(isEven(3))
    var prod= ProductL("sweet",22.0,20.0,"groceries")
    var prod2=  ProductL("shoe",20.0,30.0,"hygiene")
    var prod3  =  ProductL("WE",30.0,90.0,"other")

    println(productsC(prod2))

    evenLetters("banana")
    nameList(arrayListOf("diana","mary","suzy","john"))
}





data class ProductL (var name:String, var Weight:Double, var Price:Double, var Category:String)
    data class Product(var groceries:List<Product>, var hygine: List<Product>,var other: List<Product>

    )
    fun productsC(product:ProductL){
        var groceries= mutableListOf<ProductL>()
        var hygiene= mutableListOf<ProductL>()
        var other= mutableListOf<ProductL>()
        when (product.Category){
            "groceries"->groceries.add(product)
             "hygiene"->hygiene.add(product)
        else->other.add(product)

}
        print(hygiene)
    }


fun isEven( num:Int):Boolean {
    return num%2==0
}
fun evenLetters(word:String):String {
    var i = 0
    for (i in word) {
        if (word.indexOf(i) % 2 == 0) {

            println(i)

        }
    }
return word
}
fun nameList(names:ArrayList<String>){
    for (name in names){
        if (name.length%2==0){
            println(name)
        }
    }
}











