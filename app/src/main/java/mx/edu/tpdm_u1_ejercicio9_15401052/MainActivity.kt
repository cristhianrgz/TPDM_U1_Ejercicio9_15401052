package mx.edu.tpdm_u1_ejercicio9_15401052

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var num1 : EditText ?= null
    var num2 : EditText ?= null
    var calcular : Button ?= null
    var resultado : TextView ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1 = findViewById(R.id.editnum1)
        num2 = findViewById(R.id.editnum2)
        calcular = findViewById(R.id.btncalcular)
        resultado = findViewById(R.id.resultado)

        calcular?.setOnClickListener {
            var tabla=""
            var n = num1?.text.toString().toInt()
            var m = num2?.text.toString().toInt()

            (1..m).forEach{
                var result = n * it
                tabla = tabla +n+" x "+it+" = "+result+"\n"
            }
            resultado?.setText(tabla)
        }
    }
}
