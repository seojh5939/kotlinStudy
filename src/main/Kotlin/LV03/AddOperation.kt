package LV03

class AddOperation {
    fun operation(num1: Double, num2: Double): Double = (num1+num2).toDouble()

    fun print(num1: Double, num2: Double): Any =  println("덧셈결과: ${operation(num1, num2)}")
}