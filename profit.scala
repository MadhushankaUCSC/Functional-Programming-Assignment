object profit{

def main(args:Array[String]){

def attendees(x:Int)=120+(15-x)/5*20;

def revenue(x:Int)=x*attendees(x);

def cost(x:Int)=500+3*attendees(x);
def netProfit(x:Int)=revenue(x)-cost(x);

for(i<-15 to 30 ){
println("profit :"+netProfit(i));


}


}
}
