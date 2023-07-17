package LV04

class DivideOperation : AbstractOperation {
    override fun operation(num1: Double, num2: Double): Double = num1 / num2

    override fun print(num1: Double, num2: Double): Any = println("나눗셈 결과: ${operation(num1, num2)}")
}