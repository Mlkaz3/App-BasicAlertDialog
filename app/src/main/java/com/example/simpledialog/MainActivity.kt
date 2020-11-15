package com.example.simpledialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openthedoor: Button = findViewById(R.id.button)
        openthedoor.setOnClickListener {
            openDialog()


        }
    }

    private fun openDialog() {
        // create an alert builder
        val builder = AlertDialog.Builder(this)
        builder.setTitle("My First Dialog")

        // set the custom layout
        val customLayout: View = layoutInflater.inflate(R.layout.mydialog, null);
        builder.setView(customLayout);
        builder.setMessage("Nice Work!")

        builder
            .setPositiveButton(
                "OK"
            ) { dialog, _ -> // When the user click yes button
                // then app will close
                dialog.cancel()
            }

        // create and show the alert dialog
        val dialog: AlertDialog = builder.create()
        dialog.show()

    }
}
