class MultiplyOperation : Operator {
    override fun operation(num1: Int, num2: Int): Int = num1 * num2

    override fun print(num1: Int, num2: Int): Any = println("곱셈결과: ${operation(num1, num2)}")
}