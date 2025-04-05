object A2
{
 def main(args:Array[String]):Unit=
 {
  //var x:Int=0;
 var x:Array[Int]=new Array[Int](3);
  for(i<-0 to 2)
  {
   print("the values:");
   x(i)=scala.io.StdIn.readLine().toInt;
  }
   for(i<-0 to 2)
   {
    print(x(i)+ " ");
    }
}
}