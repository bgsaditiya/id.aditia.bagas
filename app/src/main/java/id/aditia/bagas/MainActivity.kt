package id.aditia.bagas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.pinjaman)
        val num2 = findViewById<EditText>(R.id.durasi)
        val button = findViewById<Button>(R.id.pinjam)
        val biayalayanan = findViewById<TextView>(R.id.biayalayanan)
        val sukubunga = findViewById<TextView>(R.id.sukubunga)
        val bersih = findViewById<TextView>(R.id.bersih)
        val bayar = findViewById<TextView>(R.id.TotalBayar)

        button.setOnClickListener {
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val layanan = (5*val1) / 100
            val bunga = ((3.75*val1) / 100) * val2
            val pencairan = val1 - layanan
//            val lol = pencairan.toInt().toString()
            val total = val1 + bunga
            biayalayanan.text = "Biaya layanan : Rp.$layanan"
            sukubunga.text = "Suku bunga : Rp.$bunga"
            bersih.text = "Pencairan bersih : Rp.$pencairan"
            bayar.text = "Total Pinjaman (yang harus dibayar) : Rp.$total"
        }

    }


}