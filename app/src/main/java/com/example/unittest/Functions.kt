
import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Date

class Functions {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun subtraction(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplication(a: Int, b: Int): Int {
        return a * b
    }

    fun division(a: Int, b: Int): Int {
        return if (b == 0) {
            0
        } else { a / b }
    }

    @SuppressLint("SimpleDateFormat")
    fun dateFormatter(date: Date): String {
        val dateFormatter = SimpleDateFormat("dd-MM-yyyy")
        return dateFormatter.format(date)
    }

    @SuppressLint("SimpleDateFormat")
    fun toTimeString(hour: String): String {
        val dateFormatter = DateTimeFormatter.ofPattern("HH:mm")
        val hourReceive = LocalTime.parse(hour, dateFormatter)
        val formattedHourString = dateFormatter.format(hourReceive)
        return formattedHourString.toString()
    }

    fun <T> List<T>.atIndex(index: Int): T? {
        if (index < 0 || index > size - 1) {
            return null
        }
        return get(index)
    }

    fun String.isAlphanumeric(): Boolean {
        return  isNotEmpty() && !contains(Regex("[^a-zA-Z0-9]"))
    }

    fun isEmail(mail: String): Boolean {
        if (mail.isEmpty()) {
            return false
        }
        val emailValid = Regex("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}")
        return emailValid.matches(mail)
    }

    fun capitalizeFirstLetter(value: String): String {
        if (value.isNotEmpty()) {
            val first = value.substring(0, 1).toUpperCase()
            val other = value.substring(1)
            return  first + other
        }
        return value
    }

    fun removeSpace(value: String): String {
        return value.replace("\\s+".toRegex(), "")
    }
}


