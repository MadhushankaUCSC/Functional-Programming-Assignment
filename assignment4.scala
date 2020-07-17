object assignment4{

//main 
def main(args:Array[String])={

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  //alphabet

val Encrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);  //function of encrypt

val Decrypt=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size);   //function of decrypt

printf("\n--------------Caesar Cipher-------------\n");
val s = scala.io.StdIn.readLine("Enter string you want to encrypt: ");      //get input string
printf("Enter key value:");
val key_value=scala.io.StdIn.readInt();         //get key value
printf("\n---------------------------\n");

val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a));  //cipher function

val Encrypted_text=cipher(Encrypt,s,key_value,alphabet);   //call cipher function
printf("Encrypted_text :"+Encrypted_text);     //print encrypted text
printf("\n");

val Decrypted_text=cipher(Decrypt,Encrypted_text,key_value,alphabet);   //call cipher function
printf("Decrypted_text :"+Decrypted_text);             //print decrypted text
printf("\n---------------------------\n");
}
}