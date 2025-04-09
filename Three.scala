object Three
{
def main(args: Array[String]):Unit=
 {
  var x:Int=0;
  var y:Int=0;
  var k:Int=0;
 x=scala.io.StdIn.readLine().toInt;
 y=scala.io.StdIn.readLine().toInt;
k= scala.io.StdIn.readLine().toInt;
 var z=Array.ofDim[Int](x, y,k);		 	
 for(i<-0 to x-1)
 {
  for(j<-0 to y-1)
   {
     for(l<-0 to k-1)
     {
    z(i)(j)(l)= scala.io.StdIn.readLine().toInt;
    }
}
}
  for(i<-0 to x-1)
   {
     for(j<-0 to y-1)
     {
       for(l<-0 to k-1)
       {
       print(z(i)(j)(l)+" ");
      }
      println();
    }
 println();
 }


}
}
