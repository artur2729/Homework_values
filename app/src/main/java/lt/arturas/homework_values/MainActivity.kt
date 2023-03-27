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
    
}