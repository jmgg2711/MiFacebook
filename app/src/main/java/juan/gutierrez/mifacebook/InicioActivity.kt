package juan.gutierrez.mifacebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InicioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val boton_crearcuenta: Button = findViewById(R.id.btn_CreaCuenta)

        boton_crearcuenta.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}