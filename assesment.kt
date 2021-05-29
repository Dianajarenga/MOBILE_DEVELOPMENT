import java.time.temporal.TemporalAmount

fun main() {
booklist()
  var customer=CurrentAccount(2334,"Diana",10000000.00)
    customer.deposit(50000.00)
   print(customer)
    customer.withdraw(40000.00)
}
data class Book(var title:String,var author:String, var pages:Int)
fun booklist():Book{
    var book= mutableListOf(Book("Life","Jarenga",100),Book("style","Diana",200))
   // book.reversed()

return booklist()
}
class CurrentAccount(var accountNumber:Int,var accountName:String, var balance:Double,) {
    fun deposit(amount: Double): Double {

        var amount = balance + amount
        return amount
        print(amount)
    }

    fun withdraw(amoun: Double): Double {
        var amoun = balance - amoun
        return amoun
        print(amoun)
    }

    fun details() {
        print("Account $accountNumber with balance $balance is operated by $accountName" )
    }
}

class SavingsAccount( var accountNumber:Int,var accountName:String, var balance:Double ,var withdrawals:Int){
    

}