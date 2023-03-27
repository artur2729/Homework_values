package lt.arturas.homework_values

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "kotlin_variables_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val maxByte: Byte = Byte.MAX_VALUE
        val maxShort: Short = Short.MAX_VALUE
        val maxInt:Int = Int.MAX_VALUE
        val maxLong: Long = Long.MAX_VALUE

        Log.i(TAG, "Byte value: $maxByte\n" +
                "Short value: $maxShort\n" +
                "Int value: $maxInt\n" +
                "Long value: $maxLong\n"
        )

        val suma:Double = variables_suma(maxByte, maxShort, maxInt, maxLong)
        variables_char()
        variables_char_asterix()
        comparison(maxInt, maxShort)
        variables_equal(suma, maxLong)
    }

    fun maxValues(){
        val maxByte: Byte = Byte.MAX_VALUE
        val maxShort: Short = Short.MAX_VALUE
        val maxInt:Int = Int.MAX_VALUE
        val maxLong: Long = Long.MAX_VALUE

        Log.i(TAG, "Byte value: $maxByte\n" +
                "Short value: $maxShort\n" +
                "Int value: $maxInt\n" +
                "Long value: $maxLong\n"
        )
    }

    fun variables_suma(maxByte: Byte, maxShort: Short, maxInt: Int, maxLong: Long): Double {
        val suma: Double = maxByte.toDouble() + maxShort.toDouble() + maxInt.toDouble() + maxLong.toDouble()
        Log.i(TAG, "suma: $suma")
        return suma
    }

    fun variables_char(){
        val char1 = 88.toChar()
        val char2 = '%'

        Log.i(TAG, "variables_char: char1 $char1, char2 $char2")
    }

    fun variables_char_asterix(){
        var someChar = '*'
        val uni = "\\u%04x".format(someChar.code)
        Log.i(TAG, "variables_char_asterix: Value of * in decimal is: $uni")
    }

    fun comparison(maxInt: Int, maxShort: Short){
        val Short_is_bigger:Boolean = maxInt < maxShort.toInt()
        Log.i(TAG, "comparison: Is maxShort bigger than maxInt? Answer: $Short_is_bigger")
    }

    fun variables_equal(suma: Double, maxLong: Long){
        val equal:Boolean = suma == maxLong.toDouble()
        Log.i(TAG, "variables_equal: Are both variables suma and maxLong equal? $equal")
    }

}