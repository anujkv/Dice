package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener  {
    private lateinit var rollbtn : Button
    private lateinit var rollResult : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollbtn  = findViewById(R.id.rollbtn)
        rollResult  = findViewById(R.id.diceView)

        rollbtn.setOnClickListener(){
             val drawableResource = when((Random().nextInt(6)+1)){
                 1 -> R.drawable.dice_1
                 2 -> R.drawable.dice_2
                 3 -> R.drawable.dice_3
                 4 -> R.drawable.dice_4
                 5 -> R.drawable.dice_5
                 else -> R.drawable.dice_6
             }

             rollResult.setImageResource(drawableResource)
         }

    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.rollbtn -> {
                val drawableResource = when((Random().nextInt(6)+1)){
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
                rollResult.setImageResource(drawableResource)

            }
        }
    }
}


