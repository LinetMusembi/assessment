import kotlin.math.min

fun main() {
    println( measurement("lynet","irene"))
    println( variety().contentToString())
    println( sentence("i am learning kotlin"))





}
fun measurement(name:String,name2:String):Int{
    return name.length

}
fun variety():Array<Int> {
    val numsArray = arrayOf(5,6,3,2,8)
    numsArray.min()
    numsArray.max()
    numsArray.average()
    return numsArray




}
fun sentence(words:String):String{
    return words

}
fun call():String{
    val school = "Akirachix"



}





























