
object rational_number {
def main(args:Array[String])={ 
  
  val a=new Rational(3,4)
  val b=new Rational(5,8)
  val c=new Rational(2,7)

//print rational numbers
  println("\nRational numbers") 
  println("\t a="+a)
  println("\t b="+b)
  println("\t c="+c)

//print the negetive of rational numbers
  println("\n.............Q1. negetive rational_number.............................\n")
  println(f"negetive of $a is :"+a.neg)
  println(f"negetive of $b is :"+b.neg)
  println(f"negetive of $c is :"+c.neg)

  println("\n...............Q2. substraction of rational_number.........................\n")
  val s1=a-b
  val s2=s1-c

  println(f"substraction of ($a)-($b)-($c) is ="+s2)
  
  }
  
 } 
  class Rational(n:Int,d:Int)
{ 
  require(d>0,"d must be grater than 0")
  def numer=n/gcd(Math.abs(n),d)
  def denom=d/gcd(Math.abs(n),d)
  def this(n:Int)=this(n,1)
  private def gcd(a:Int,b:Int):Int =if(b==0)a else gcd(b,a%b)
  def +(r:Rational)=new Rational(this.numer*r.denom+ this.denom*r.numer,this.denom*r.denom)
  def neg=new Rational(-this.numer,this.denom)
  def -(r:Rational)=this+r.neg
  override def toString=numer+"/"+denom
}

