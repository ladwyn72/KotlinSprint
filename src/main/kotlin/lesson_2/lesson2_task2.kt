package lesson_2

fun main() {
    val permanentEmployees = 50
    val permanentEmployeesSalary = 30000
    val internCount = 30
    val internSalary = 20000

    val permanentEmployeesSalaryExpenses = permanentEmployees * permanentEmployeesSalary
    val totalSalaryExpensesAfterInterns = permanentEmployeesSalaryExpenses + (internCount * internSalary)
    val averageSalaryAfterInterns = totalSalaryExpensesAfterInterns / (permanentEmployees + internCount)

    println(permanentEmployeesSalaryExpenses)
    println(totalSalaryExpensesAfterInterns)
    println(averageSalaryAfterInterns)
}
