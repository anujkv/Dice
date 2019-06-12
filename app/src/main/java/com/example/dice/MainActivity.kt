package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollbtn : Button = findViewById(R.id.rollbtn)

        rollbtn.setOnClickListener(){
             val randomValue = (Random().nextInt(6)+1)
             val drawableResource = when(randomValue){
                 1 -> R.drawable.dice_1
                 2 -> R.drawable.dice_2
                 3 -> R.drawable.dice_3
                 4 -> R.drawable.dice_4
                 5 -> R.drawable.dice_5
                 else -> R.drawable.dice_6
             }
             val rollResult : ImageView = findViewById(R.id.diceView)
             rollResult.setImageResource(drawableResource)
         }

    }

    override fun onClick(p0: View?) {

        when(p0?.id){
            R.id.rollbtn -> {
                val randomValue = (Random().nextInt(6)+1)
                val drawableResource = when(randomValue){
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
                val rollResult : ImageView = findViewById(R.id.diceView)
                rollResult.setImageResource(drawableResource)

            }
        }
    }
}
