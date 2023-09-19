package com.kjprojects.snackbar2
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    //INITIALIZATION
    private lateinit var coordinatorLayout : CoordinatorLayout
    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaration
        coordinatorLayout = findViewById(R.id.coordinatorLayout)

        //Declaration & function
        button = findViewById(R.id.button)
        button.setOnClickListener {
            val snackbar = Snackbar.make(it, "KJ Projects", Snackbar.LENGTH_LONG).setAction("Show"){
                Toast.makeText(this, "Snackbar notification popup", Toast.LENGTH_SHORT).show()
            }
            snackbar.setActionTextColor(Color.WHITE)
            val snackbarView = snackbar.view
            snackbarView.setBackgroundColor(Color.BLACK)
            snackbar.show()
        }



    }
}