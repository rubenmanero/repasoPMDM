package com.ruben.repasopmdm

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var v1: TextView
    private lateinit var v2: TextView
    private lateinit var v3: TextView
    private lateinit var v4: TextView
    private lateinit var v5: TextView
    private lateinit var v6: TextView
    private lateinit var v7: TextView
    private lateinit var v8: TextView
    private lateinit var v9: TextView
    private lateinit var v10: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        initListeners()
    }

    private fun initComponents() {
        v1 = findViewById(R.id.box1)
        v2 = findViewById(R.id.box2)
        v3 = findViewById(R.id.box3)
        v4 = findViewById(R.id.box4)
        v5 = findViewById(R.id.box5)
        v6 = findViewById(R.id.box6)
        v7 = findViewById(R.id.box7)
        v8 = findViewById(R.id.box8)
        v9 = findViewById(R.id.box9)
        v10 = findViewById(R.id.box10)
    }

    private fun initListeners() {
        v1.setOnClickListener { showDialog(v1) }
        v2.setOnClickListener { showDialog(v2) }
        v3.setOnClickListener { showDialog(v3) }
        v4.setOnClickListener { showDialog(v4) }
        v5.setOnClickListener { showDialog(v5) }
        v6.setOnClickListener { showDialog(v6) }
        v7.setOnClickListener { showDialog(v7) }
        v8.setOnClickListener { showDialog(v8) }
        v9.setOnClickListener { showDialog(v9) }
        v10.setOnClickListener { showDialog(v10) }
    }

    private fun showDialog(view: TextView) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog)
        dialog.show()

        val cvApplyColor: CardView = dialog.findViewById(R.id.cvApplyColor)
        val rgColors: RadioGroup = dialog.findViewById(R.id.rgColors)

        cvApplyColor.setOnClickListener {
            val selectedColor = rgColors.checkedRadioButtonId
            val selectedRadioButtonColor: RadioButton = rgColors.findViewById(selectedColor)
            when (selectedRadioButtonColor.text) {
                getString(R.string.white) -> {
                    view.setBackgroundColor(getColor(R.color.white))
                    view.text = getString(R.string.white)
                    view.setTextColor(getColor(R.color.black))
                }

                getString(R.string.red) -> {
                    view.setBackgroundColor(getColor(R.color.red))
                    view.text = getString(R.string.red)
                    view.setTextColor(getColor(R.color.white))
                }
                getString(R.string.orange) -> {
                    view.setBackgroundColor(getColor(R.color.orange))
                    view.text = getString(R.string.orange)
                    view.setTextColor(getColor(R.color.black))
                }
                getString(R.string.yellow) -> {
                    view.setBackgroundColor(getColor(R.color.yellow))
                    view.text = getString(R.string.yellow)
                    view.setTextColor(getColor(R.color.black))
                }
                getString(R.string.green) -> {
                    view.setBackgroundColor(getColor(R.color.green))
                    view.text = getString(R.string.green)
                    view.setTextColor(getColor(R.color.black))
                }
                getString(R.string.cyan) -> {
                    view.setBackgroundColor(getColor(R.color.cyan))
                    view.text = getString(R.string.cyan)
                    view.setTextColor(getColor(R.color.black))
                }
                getString(R.string.blue) -> {
                    view.setBackgroundColor(getColor(R.color.blue))
                    view.text = getString(R.string.blue)
                    view.setTextColor(getColor(R.color.white))
                }
                getString(R.string.violet) -> {
                    view.setBackgroundColor(getColor(R.color.violet))
                    view.text = getString(R.string.violet)
                    view.setTextColor(getColor(R.color.white))
                }
                getString(R.string.gray) -> {
                    view.setBackgroundColor(getColor(R.color.gray))
                    view.text = getString(R.string.gray)
                    view.setTextColor(getColor(R.color.white))
                }
                else -> {
                    view.setBackgroundColor(getColor(R.color.black))
                    view.text = getString(R.string.black)
                    view.setTextColor(getColor(R.color.white))
                }
            }
            dialog.hide()
        }
    }
}