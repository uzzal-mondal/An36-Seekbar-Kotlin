package com.example.an37_seekbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var seekbar: SeekBar? = null
    var seekbar2: SeekBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var seekbar = findViewById<SeekBar>(R.id.seekBar_id);
        var textshow = findViewById<TextView>(R.id.textView_id);

        var seekbar2 = findViewById<SeekBar>(R.id.seekBar2_id);
        var textRes = findViewById<TextView>(R.id.textView2)

        textshow.setText("Volume : "+seekbar.progress+ " / "+ seekbar.max)

        seekbar?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {


                    textshow.setText("Value : "+progress+ " / "+ seekbar.max)
                Toast.makeText(applicationContext, "onProgressChanged $progress",Toast.LENGTH_SHORT).show();
            }


            override fun onStartTrackingTouch(seekBar: SeekBar?) {


                Toast.makeText(applicationContext,"onStartTrackingTouch",Toast.LENGTH_SHORT).show();
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {


                Toast.makeText(applicationContext,"onStopTrackingTouch",Toast.LENGTH_SHORT).show();
            }

        })


        // again seek bar connected..


        seekbar2?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

                textRes.setText("Result: "+progress+"/"+ seekbar2.max)

                Toast.makeText(applicationContext,"Progress $progress", Toast.LENGTH_SHORT).show();
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

                Toast.makeText(applicationContext,"Start $seekBar", Toast.LENGTH_SHORT).show();
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

                Toast.makeText(applicationContext,"Stop $seekBar", Toast.LENGTH_SHORT).show();

            }
        })





    }
}
