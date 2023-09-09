 fun main(args : Array<String>)
 {
     println("hello world")
     println("hello kotlin")
     var ice=suja()
     ice.name="suprise"
     println("enter the name : ${ ice.name}")
     ice=suja()
     ice.name="shyam"
     println("enter the name : ${ ice.name}")
     var a: Int=30
     var b: Int=5
     var result=a+b
     println("enter the value of $a and $b is :$result ")
     var name_2=suja()
     name_2.name="hii dear"
     println("enter te result of :${name_2.name}")
     var num1: Int=45
     var num2:Int=15
     var total: Int = 0
    total= if (num1>num2) num1 else num2
     println(total)
     var str1:String="sakthi"
     var str2:String ="Sakthi"
     if(str1== str2 )
         println("same")
     else
         println("not same")
     var acne:Int= 4
      var km= when(acne)
     {
         1->"hii"
         2->"hello"
         3->"jii"
         4->"baji"
         5->"mine"
         6->"after"
         else->"i am in love with you"
     }
     println("str is : $km")

 }





