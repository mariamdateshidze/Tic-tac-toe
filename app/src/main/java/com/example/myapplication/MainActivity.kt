package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    private var isPlayerOne: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

    }

    private fun init() {
        button00.setOnClickListener {
            playerChecker(button00)

        }
        button01.setOnClickListener {
            playerChecker(button01)

        }
        button02.setOnClickListener {
            playerChecker(button02)

        }
        button10.setOnClickListener {
            playerChecker(button10)

        }
        button11.setOnClickListener {
            playerChecker(button11)

        }
        button12.setOnClickListener {
            playerChecker(button12)

        }
        button20.setOnClickListener {
            playerChecker(button20)

        }
        button21.setOnClickListener {
            playerChecker(button21)

        }
        button22.setOnClickListener {
            playerChecker(button22)

        }
        buttonReset.setOnClickListener {
            reset()

        }


    }

    private fun playerChecker(button: Button) {
        if (isPlayerOne) {
            button.text = "X"
        } else {
            button.text = "0"
        }

        button.isClickable = false
        isPlayerOne = !isPlayerOne
        checkWinner()

    }

    private fun checkWinner() {
        if (button00.text.toString()
                .isNotEmpty() && button00.text.toString() == button01.text.toString() && button00.text.toString() == button02.text.toString()
        ) {
            showToast(button00.text.toString())
        } else if (button10.text.toString()
                .isNotEmpty() && button10.text.toString() == button11.text.toString() && button10.text.toString() == button12.text.toString()
        ) {
            showToast(button10.text.toString())
        } else if (button20.text.toString()
                .isNotEmpty() && button20.text.toString() == button21.text.toString() && button20.text.toString() == button22.text.toString()
        ) {
            showToast(button20.text.toString())

        } else if (button00.text.toString()
                .isNotEmpty() && button00.text.toString() == button10.text.toString() && button00.text.toString() == button20.text.toString()
        ) {
            showToast(button00.text.toString())
        } else if (button01.text.toString()
                .isNotEmpty() && button01.text.toString() == button11.text.toString() && button01.text.toString() == button21.text.toString()
        ) {
            showToast(button01.text.toString())
        } else if (button02.text.toString()
                .isNotEmpty() && button02.text.toString() == button12.text.toString() && button02.text.toString() == button22.text.toString()
        ) {
            showToast(button02.text.toString())
        } else if (button00.text.toString()
                .isNotEmpty() && button00.text.toString() == button11.text.toString() && button00.text.toString() == button22.text.toString()
        ) {
            showToast(button00.text.toString())
        } else if (button02.text.toString()
                .isNotEmpty() && button02.text.toString() == button11.text.toString() && button02.text.toString() == button20.text.toString()
        ) {
            showToast(button02.text.toString())


        } else if (button00.text.toString().isNotEmpty() && button01.text.toString()
                .isNotEmpty() && button02.text.toString().isNotEmpty() && button10.text.toString()
                .isNotEmpty() && button11.text.toString().isNotEmpty() && button12.text.toString()
                .isNotEmpty() && button20.text.toString().isNotEmpty() && button21.text.toString()
                .isNotEmpty() && button22.text.toString().isNotEmpty()
        ) {
            showToast(winnerSymbol = "none of the players")
        }


    }

    private fun showToast(winnerSymbol: String) {
        Toast.makeText(this, "Winner is $winnerSymbol", Toast.LENGTH_SHORT).show()
        button00.isClickable = false
        button01.isClickable = false
        button02.isClickable = false
        button10.isClickable = false
        button11.isClickable = false
        button12.isClickable = false
        button20.isClickable = false
        button21.isClickable = false
        button22.isClickable = false

    }
    private fun reset(){
        button00.text = ""
        button00.isClickable=true

        button01.text = ""
        button01.isClickable=true

        button02.text = ""
        button02.isClickable=true

        button10.text = ""
        button10.isClickable=true

        button11.text = ""
        button11.isClickable=true

        button12.text = ""
        button12.isClickable=true

        button20.text = ""
        button20.isClickable=true

        button21.text = ""
        button21.isClickable=true

        button22.text = ""
        button22.isClickable=true
        isPlayerOne=!isPlayerOne


    }
}





