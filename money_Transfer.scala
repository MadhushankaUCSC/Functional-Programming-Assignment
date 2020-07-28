object money_Transfer{
  def main(args:Array[String])={ 
  println("\n.............Q3. Money Transfer ............\n")

//get account numbers as user input
print("Enter Your Account NO : ")
val acc_No1 = scala.io.StdIn.readInt()

print("Enter Receiver Account NO : ")
val acc_No2 = scala.io.StdIn.readInt()

//get transfer amount as user input
print("Enter Transfer Amount : ")
val transfer_Amount = scala.io.StdIn.readDouble()

  var acc1_balance=10000  
  var acc2_balance=15000
 
 //var bank:List[Account]=List()
 if(acc1_balance >= transfer_Amount){
 	var customer1=new Account("123456789V",acc_No1,acc1_balance)
  	var customer2=new Account("987456321V",acc_No2,acc2_balance)
  	var tranfer1=customer1.transfer(customer2,transfer_Amount)
  
   //print balance of both accounts
	println(f"Balance of account no $acc_No1 is :"+customer1.balance)
  	println(f"Balance of account no $acc_No2 is :"+customer2.balance)
} 

 else{
	println("Your Account Balance Is Not Sufficient To Complete This Transaction")
}

}
  }


  class Account (id:String,n: Int, b: Double) {
    val nic:String=id
    val acnumber: Int = n
    var balance: Double = b
    override def toString="["+nic+":"+acnumber+":"+balance+"]"

def withdraw(a:Double) =this.balance=this.balance-a
  def deposit(a:Double) =this.balance=this.balance+a
  def transfer(a:Account,b:Double)= {
       this.balance=this.balance-b
       a.balance=a.balance+b
}

}
