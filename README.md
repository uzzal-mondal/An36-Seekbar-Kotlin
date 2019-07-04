# An36-Seekbar


SeekBar
1.	A seekbar is an extension of a progressbar that adds a dragable thumb.  A seekbar using  to left and right thum within changing to value.

2.	Method use: - 
# firstly seekbar call in method onCheckBarChangeListner()

3.	 and gave me are 3 paramiters 

1.	OnProgress changed. That the progress level has changed.

2.	onStrart Tracking touch – notification that the user has started a touch.


3.	onStop Tracking touch – notification that the user has finished touch.

4.	Before the listenr adding I am showing to text view volume 0 out of 10.

5.	So that working now- textView adding to setText, take a text volume . firstly show the current volume , we know that seekbar is a stand left side.  We want to showing current volume . initialize seekbar are start to 0.

6.	Seekbar value you want to get write to  variable seekbar and call getProgressmethod seekbar.getProgress() 

7.	Then set to seekbar maximum value firstly showing the 0 and last value is 10. Call in method seekbar.getMax()



                                              ......Importatn  to sickBar...

Android SeekBar Using Kotlin


In this tutorial, we’ll be discussing SeekBar in our Android Application and implement it using Kotlin.

SeekBar
A SeekBar is a UI element which is an extension of the ProgressBar.

A SeekBar:

adds a draggable thumb to the ProgressBar.
is commonly used in cases such as audio player applications which have a UI control.
is like a scale with an upper and lower limit with every step a single unit.
Following are the XML attributes of the SeekBar.

android:minWidth/maxWidth/minHeight/maxHeight – Used to set the dimensions of the SeekBar view. This doesn’t change the thickness of the SeekBar.

android:max/min – The upper/lower limit of the SeekBar. Note: android:min is available from Android SDK 26 and above.

android:progress – The current value of the thumb position.

android:progressTint – Here we pass the color for the progress to the left of the thumb position.

android:progressBackgroundTint – This color is displayed for the background of the Seekbar, to the right of the thumb.

android:thumb – Here we can pass a custom drawable which will act as the thumb of the seekbar.

android:thumbTint – Color of the thumb.

android:thumbOffset – The distance between the thumb and the current progress in dp. A negative value shifts the thumb to the right of the progress. A positive one shifts it to the left.

style – To set custom/predefined Styles on the SeekBar. Besides the default one, there is a popular style Discrete which breaks the progress into discrete intervals.

android:tickMark – Here we pass a drawable which acts as breakpoints on the SeekBar. The number of breakpoints/tickMarks is equal to android:max.

android:tickMarkTint – Set a color on the tickMark drawable.

android:splitTrack – This expects a boolean value. By default on Android Lollipop and above this is true. It splits the Seekbar track into two parts – left and right of the SeekBar. This isn’t always visible in white background activities.

In kotlin, we can implement the SeekBar.OnSeekBarChangeListener interface. We need to implement the following three Kotlin functions:

fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) 

fun onStartTrackingTouch(p0: SeekBar?)

fun onStopTrackingTouch(p0: SeekBar?)
Let’s look at the different types of SeekBar by setting the above properties:

Simple SeekBar
<SeekBar
        android:id="@+id/seekbar1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="8dp" />
android seekbar basic

With Progress Tint Color
<SeekBar
        android:id="@+id/seekbar2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:max="50"
        android:minWidth="100dp"
        android:padding="8dp"
        android:progress="10"
        android:progressBackgroundTint="@android:color/black"
        android:progressTint="@color/colorPrimaryDark" />
android seekbar progress tint color

With Thumb Tint Color And Offset
<SeekBar
        android:id="@+id/seekbar3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="50"
        android:padding="8dp"
        android:progress="10"
        android:progressBackgroundTint="@android:color/holo_green_light"
        android:progressTint="@android:color/black"
        android:thumbOffset="-20dp"
        android:thumbTint="@color/colorPrimary" />
android seekbar thumb tint offset

With TickMarks
<SeekBar
        android:id="@+id/seekbar4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="4"
        android:padding="8dp"
        android:progress="1"
        android:progressTint="@android:color/holo_green_light"
        android:thumbTint="@color/colorPrimary"
        android:tickMark="@drawable/tickmark"
        android:tickMarkTint="@color/colorAccent" />
The tickmark.xml drawable is given below:

<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:bottom="-6dp"
        android:left="-3dp"
        android:top="-6dp">

        <shape android:shape="rectangle">
            <solid android:color="@color/colorPrimary" />
            <stroke
                android:width="2dp"
                android:color="#1fc78c" />
        </shape>
    </item>
</layer-list>
android seekbar tickmarks

With Style
Here we set Discrete style with different intervals (max value).

    <SeekBar
        android:id="@+id/seekbar5"
        style="@android:style/Widget.Material.SeekBar.Discrete"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="8dp" />


    <SeekBar
        android:id="@+id/seekbar6"
        style="@android:style/Widget.Material.SeekBar.Discrete"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="10"
        android:padding="8dp" />

android seekbar style

With Split Track
The first one has a Split track enabled by default. The second one does not.

<SeekBar
        android:id="@+id/seekbar7"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="50"
        android:padding="8dp"
        android:progress="10"
        android:thumbTint="@color/colorPrimary"
        android:tickMark="@android:drawable/checkbox_on_background"
        android:tickMarkTint="@android:color/black" />

    <SeekBar
        android:id="@+id/seekbar8"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="50"
        android:padding="8dp"
        android:progress="10"
        android:splitTrack="false"
        android:thumbTint="@color/colorPrimary"
        android:tickMark="@android:drawable/checkbox_on_background"
        android:tickMarkTint="@android:color/black" />
android seekbar split track

Project Structure
android-seekbar-project-structure

Code
The code for the activity_main.xml layout is given below:

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:layout_margin="16dp"
    android:id="@+id/linearLayout"
    android:gravity="center"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="0"
        android:textSize="32sp" />

    <SeekBar
        android:id="@+id/seekbar1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="8dp" />


    <SeekBar
        android:id="@+id/seekbar2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:max="50"
        android:minWidth="100dp"
        android:padding="8dp"
        android:progress="10"
        android:progressBackgroundTint="@android:color/black"
        android:progressTint="@color/colorPrimaryDark" />

    <SeekBar
        android:id="@+id/seekbar3"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="50"
        android:padding="8dp"
        android:progress="10"
        android:progressBackgroundTint="@android:color/holo_green_light"
        android:progressTint="@android:color/black"
        android:thumbOffset="-20dp"
        android:thumbTint="@color/colorPrimary" />


    <SeekBar
        android:id="@+id/seekbar4"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="4"
        android:padding="8dp"
        android:progress="1"
        android:progressTint="@android:color/holo_green_light"
        android:thumbTint="@color/colorPrimary"
        android:tickMark="@drawable/tickmark"
        android:tickMarkTint="@color/colorAccent" />


    <SeekBar
        android:id="@+id/seekbar5"
        style="@android:style/Widget.Material.SeekBar.Discrete"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="8dp" />


    <SeekBar
        android:id="@+id/seekbar6"
        style="@android:style/Widget.Material.SeekBar.Discrete"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="10"
        android:padding="8dp" />


    <SeekBar
        android:id="@+id/seekbar7"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="50"
        android:padding="8dp"
        android:progress="10"
        android:thumbTint="@color/colorPrimary"
        android:tickMark="@android:drawable/checkbox_on_background"
        android:tickMarkTint="@android:color/black" />

    <SeekBar
        android:id="@+id/seekbar8"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:max="50"
        android:padding="8dp"
        android:progress="10"
        android:splitTrack="false"
        android:thumbTint="@color/colorPrimary"
        android:tickMark="@android:drawable/checkbox_on_background"
        android:tickMarkTint="@android:color/black" />


    <SeekBar
        android:id="@+id/seekbar9"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="8dp"
        android:splitTrack="false"
        android:thumb="@mipmap/ic_launcher" />

</LinearLayout>
We’ve created a custom thumb in the last SeekBar:

custom_thumb.xml

<?xml version="1.0" encoding="utf-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">

    <item>
        <shape>
            <size
                android:width="10dp"
                android:height="10dp" />

            <solid android:color="@android:color/transparent" />
        </shape>
    </item>
    <item android:drawable="@mipmap/ic_launcher" />

</layer-list>
The code for the MainActivity.kt class is given below:

package net.androidly.androidlyseekbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.PorterDuff
import android.support.v4.content.ContextCompat


class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val seekbar = SeekBar(this)
        val layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        layoutParams.setMargins(30, 30, 30, 30)
        seekbar.layoutParams = layoutParams

        seekbar.progressDrawable.setColorFilter(ContextCompat.getColor(this, R.color.switch_thumb_normal_material_dark), PorterDuff.Mode.SRC_ATOP)
        seekbar.setBackgroundColor(ContextCompat.getColor(this,android.R.color.darker_gray))


        seekbar.setOnSeekBarChangeListener(this)
        linearLayout.addView(seekbar)

        seekbar1.setOnSeekBarChangeListener(this)
        seekbar2.setOnSeekBarChangeListener(this)
        seekbar3.setOnSeekBarChangeListener(this)
        seekbar4.setOnSeekBarChangeListener(this)
        seekbar5.setOnSeekBarChangeListener(this)
        seekbar6.setOnSeekBarChangeListener(this)
        seekbar7.setOnSeekBarChangeListener(this)
        seekbar8.setOnSeekBarChangeListener(this)
        seekbar9.setOnSeekBarChangeListener(this)
    }


    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        textView.text = "$p1"
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {
    }

    override fun onStopTrackingTouch(p0: SeekBar?) {
    }

}

In the above code, we’ve created a SeekBar programmatically and added it to the LinearLayout.

We’ve set the SeekBar change listener on each of them.
p1 represents the current progress value which is the same as seekBar.getProgress(). We set this value on the TextView.

The output of the above application in action is given below:

androidly seekbar output
