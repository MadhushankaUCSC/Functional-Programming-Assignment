
import math.{ sqrt, pow }

object case_class {

 def main(args:Array[String]){

 //get point 1 cordinates as user input
   print("Enter point 1 x cordinates : ")
   val x1 = scala.io.StdIn.readDouble()
   print("Enter point 1 y cordinates : ")
   val y1 = scala.io.StdIn.readDouble()
  val point1=new Points(x1,y1)

//get point 2 cordinates as user input
  print("Enter point 2 x cordinates : ")
   val x2 = scala.io.StdIn.readDouble()
   print("Enter point 2 y cordinates : ")
   val y2 = scala.io.StdIn.readDouble()
  val point2=new Points(x2,y2)

   printf(f"\npoint 1 :$point1\t")
  printf(f"point 2 :$point2\n")
  val point4=point1.add(point2)
  val point3=point1.move(2,5)
  val point5=point1.distance(point2)

  println("\nnew cordinates (After add): "+point4)
  println("\nnew cordinates (After move): "+point3)
  println("\nDistance between two points :"+point5)
  
}


case class Points(n:Double,m:Double){
  def x:Double=n
  def y:Double=m
   
  def move(dx:Double,dy:Double)=Points(this.x+dx,this.y+dy)    // Question 2 move point
  def add(that:Points)=Points(this.x+that.x,this.y+that.y)      //Question 1 Add two points
  def distance(other: Points):Double=sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))   // Question 3 get distance 
}
}