package LV03

class Calculator {
    var first : Double = 0.0
    var second : Double = 0.0
    var select : String = ""

    fun run() {
        while(true) {
            first = checkInputValid("first").toString().toDouble()
            second = checkInputValid("second").toString().toDouble()
            select = checkInputValid("select").toString()
            checkSelectOperator(select)
        }
    }

    fun selectCalculate(type: String): Any {
        return when(type) {
            // 덧셈
            "add" -> AddOperation().print(first, second)
            // 뺄셈
            "sub" -> SubstractOperation().print(first, second)
            // 곱셈
            "multi" -> MultiplyOperation().print(first, second)
            // 나눗셈
            "divide" -> DivideOperation().print(first, second)
            else -> println("해당 연산자는 제공하지 않습니다. 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산중 하나를 고르세요.")
        }
    }

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
                println("[0] 처음으로 돌아가기 [1] 덧셈 [2] 뺄셈 [3] 곱셈 [4] 나눗셈 [5] 나머지")
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

    fun checkSelectOperator(select: String) : Any {
        return when(select) {
            "0" -> run()
            "1" -> {
                selectCalculate("add")
            }
            "2" -> {
                selectCalculate("sub")
            }
            "3" -> {
                selectCalculate("multi")
            }
            "4" -> {
                selectCalculate("divide")
            }
            else -> println("올바른 입력값이 아닙니다. 다시 입력해주세요.")
        }
    }
}