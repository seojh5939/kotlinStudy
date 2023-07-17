package LV04

class AddOperation : AbstractOperation {
    override fun operation(num1: Double, num2: Double): Double = (num1+num2).toDouble()

    override fun print(num1: Double, num2: Double): Any =  println("덧셈결과: ${operation(num1, num2)}")
}