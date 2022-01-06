package com.example.orderconfirm

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import com.example.orderconfirm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var total = 0

    @SuppressLint("SetTextI18n", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding?.apply {

            checkBox1.setOnCheckedChangeListener { _, p1 ->
                if (p1) {
                    total += 399
                } else {
                    total -= 399
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox2.setOnCheckedChangeListener { _, p1 ->
                if (p1) {
                    total += 499
                } else {
                    total -= 499
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox3.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 499
                } else {
                    total -= 499
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox4.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 539
                } else {
                    total -= 539
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox5.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 539
                } else {
                    total -= 539
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox6.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 599
                } else {
                    total -= 599
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox7.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 599
                } else {
                    total -= 599
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox8.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 599
                } else {
                    total -= 599
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox9.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 699
                } else {
                    total -= 699
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox10.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 839
                } else {
                    total -= 839
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox11.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 839
                } else {
                    total -= 839
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox12.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 699
                } else {
                    total -= 699
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox13.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 699
                } else {
                    total -= 699
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox14.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 699
                } else {
                    total -= 699
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox15.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 499
                } else {
                    total -= 499
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox16.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 599
                } else {
                    total -= 599
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox17.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 599
                } else {
                    total -= 599
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox18.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 539
                } else {
                    total -= 539
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox19.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 699
                } else {
                    total -= 699
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox20.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 839
                } else {
                    total -= 839
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox21.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 839
                } else {
                    total -= 839
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox22.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 699
                } else {
                    total -= 699
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox23.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 839
                } else {
                    total -= 839
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox24.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 839
                } else {
                    total -= 839
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox25.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 539
                } else {
                    total -= 539
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox26.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 399
                } else {
                    total -= 399
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox27.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 309
                } else {
                    total -= 309
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox28.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 399
                } else {
                    total -= 399
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox29.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 399
                } else {
                    total -= 399
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox30.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 25
                } else {
                    total -= 25
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox31.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 39
                } else {
                    total -= 39
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox32.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 49
                } else {
                    total -= 49
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox33.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 95
                } else {
                    total -= 95
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox34.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 99
                } else {
                    total -= 99
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox35.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 129
                } else {
                    total -= 129
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox36.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 119
                } else {
                    total -= 119
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox37.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 109
                } else {
                    total -= 109
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox38.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 59
                } else {
                    total -= 59
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox39.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 99
                } else {
                    total -= 99
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox40.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 198
                } else {
                    total -= 198
                }

                totalTextView2.text = "Rs. $total"
            }

            checkBox41.setOnCheckedChangeListener { _, p1 ->
                if(p1){
                    total += 398
                } else {
                    total -= 398
                }

                totalTextView2.text = "Rs. $total"
            }

            radioButton1.setOnCheckedChangeListener { _, p1 ->
                if (p1) {
                    total += 10
                } else {
                    total -= 10
                }

                totalTextView2.text = "Rs. $total"
            }

            button.setOnClickListener {

                if(total < 25){
                    Toast.makeText(this@MainActivity, "Require minimum total Rs. 25 !", Toast.LENGTH_SHORT).show()
                }
                else{
                    AlertDialog.Builder(this@MainActivity)
                        .setTitle("Total order value")
                        .setMessage("\n--> \tRs. $total")
                        .setPositiveButton("Confirm"
                        ) { _, _ ->
                            orderConfirmation.text = "Order confirmed with bill Rs. $total !"
                            with(orderConfirmation) { setTextColor(Color.parseColor("#29B329")) }
                        }
                        .setNegativeButton("Cancel"
                        ) { _, _ ->
                            orderConfirmation.text = "Order cancelled with bill Rs. $total !"
                            with(orderConfirmation) { setTextColor(Color.parseColor("#ED5757")) }
                        }
                        .show()
                }
            }
        }
    }
}