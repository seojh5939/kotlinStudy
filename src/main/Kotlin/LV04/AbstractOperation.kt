package LV04

interface AbstractOperation {
    fun operation(num1: Double, num2: Double): Double
    companion object fun print(num1: Double, num2: Double) : Any
}