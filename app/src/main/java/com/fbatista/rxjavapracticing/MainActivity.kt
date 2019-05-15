package com.fbatista.rxjavapracticing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //The IDE shows an warning here saying that I'm not using the result, but it looks weird and the code runs perfectly.
        ObservablesCollection.StringObservable().map {
            "$it \nI just edited the output using map operator"
        }.subscribe(
            {message ->
                showToast(message)
            }
        )
    }



    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

}