package LV01

import LV04.AddOperation
import LV04.DivideOperation
import LV04.MultiplyOperation
import LV04.SubstractOperation

class Calculator {
    var first: Double = 0.0
    var second: Double = 0.0
    var select:String? = ""

    fun run() {
        while(true) {
            first = checkInputValid("first").toString().toDouble()
            second = checkInputValid("second").toString().toDouble()
            select = checkInputValid("select").toString()
            when(select) {
                // 덧셈
                "1" -> println("덧셈 결과: ${add(first, second)}")
                // 뺄셈
                "2" -> println("뺄셈 결과: ${sub(first, second)}")
                // 곱셈
                "3" -> println("곱셈 결과: ${mul(first, second)}")
                // 나눗셈
                "4" -> println("나눗셈 결과: ${div(first, second)}")
                else -> println("해당 연산자는 제공하지 않습니다. 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산중 하나를 고르세요.")
            }
        }
    }

    fun add(num1: Double, num2: Double) = num1 + num2
    fun sub(num1: Double, num2: Double) = num1 - num2
    fun mul(num1: Double, num2: Double) = num1 * num2
    fun div(num1: Double, num2: Double) = num1 / num2

    fun checkInputValid(types: String): Any {
        return when(types) {
            "first" -> {
                println("첫번째 숫자를 입력해주세요")
                while (true) {
                    try {
                        var num1:String? = readLine()
                        first = num1?.toDouble() ?: -9999.0
                        return first
                    } catch (e: Exception) {
                        println("첫번째 숫자를 다시 입력해주세요.")
                    }
                }
            }
            "second" -> {
                println("두번째 숫자를 입력해주세요")
                while(true) {
                    try {
                        var num2:String? = readLine()
                        second = num2?.toDouble() ?: -9999.0
                        return second
                    } catch (e:Exception) {
                        println("두번째 숫자를 다시 입력해주세요.")
                    }
                }
            }
            "select" -> {
                println("어떤 연산을 하시겠습니까?")
                println("[1] 덧셈 [2] 뺄셈 [3] 곱셈 [4] 나눗셈")
                while(true) {
                    try {
                        var select:String? = readLine()
                        var check = select?.toInt() ?: -1

                        if(check <= -1 || check > 5){
                            println("올바른 입력이 아닙니다. 다시 입력해주세요.")
                        }

                        return check.toString()

                    } catch(e:Exception) {
                        println("올바른 입력이 아닙니다.")
                    }
                }
            }
            else -> {
                return "Error"
            }
        }
    }
}