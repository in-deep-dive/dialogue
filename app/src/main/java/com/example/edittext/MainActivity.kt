package com.example.edittext

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AlertDialog
import com.example.edittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
         binding.button.setOnClickListener {
             val builder1 = AlertDialog.Builder(this)
             builder1.setTitle("Do YOU REALI WANT TO EXIT")
             builder1.setMessage("press yes to exist")
             builder1.setIcon(R.drawable.baseline_exit_to_app_24)
             builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
             })
             builder1.setNegativeButton("No" , DialogInterface.OnClickListener { dialogInterface, i ->

             })
             builder1.show()
         }

        binding.button2.setOnClickListener {
            val option = arrayOf("Laptop" , "Phone" , "Pc")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Choose any one ?")
            builder2.setSingleChoiceItems(option , 0 , DialogInterface.OnClickListener { dialog , which,  ->
                Toast.makeText(this, "you clicked on ${option[which]}" , Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.setNegativeButton("Decline" , DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()
        }
    }
}