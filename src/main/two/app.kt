package main.two

import java.time.LocalDate

data class Person(
    val name: String = "",
    val sex: String = ""
)

enum class TestType(testType: String) {
    TEST1("1"),
    TEST2("2"),
    TEST3("3"),
    TEST4("4"),
    TEST5("5"),
    TEST6("6"),
    TEST7("7"),
    TEST8("8"),
    TEST9("9");

}

fun main() {
    //val list = listOf("01", "02")
    val list: List<String>? = null
    val list2 = list?.filter { it == "01" }
    //println(list2)

    val startDate = LocalDate.of(2021, 1, 10)
    val endDate = LocalDate.of(2021, 1, 10)
    val myDate = LocalDate.of(2021, 1, 11)
    //if (myDate in startDate..endDate) println(true) else println(false)
    //if ("5" in "1".."10") println(true) else println(false)

    val myType = TestType.TEST1
}
