object salary{
val normalPay=150;
val otPay=75;
def main(args:Array[String]){
def nomalwage(x:Int):Int=x*normalPay;

def ot(x:Int):Int=x*otPay;

def income(y:Int,z:Int):Int=nomalwage(y)+ot(z);
def tax(x:Int):Double=x*.1;
 def takeHomeSalary(h:Int,k:Int):Double=income(h,k)-tax(income(h,k));
 println("Take Home Salary:"+takeHomeSalary(40,20));

}
}
