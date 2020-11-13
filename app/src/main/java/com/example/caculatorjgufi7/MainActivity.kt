package com.example.caculatorjgufi7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var c: String = ""

    private var operand: Double = 0.0
    private var operation: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView = findViewById(R.id.resultTextView)
    }






    fun numberClick(view: View) {
        if (view is TextView){
            var result: String = resultTextView.text.toString()
            val number: String = view.text.toString()
            c = number

            if (result == "0"){
                result = ""
            }

            resultTextView.text = result + number
        }


    }

    fun operationClick(view: View) {
        if(view is TextView){

            if(!TextUtils.isEmpty(resultTextView.text)){
                operand = resultTextView.text.toString().toDouble()
            }

            operation = view.text.toString()

            resultTextView.text = ""


        }
    }

    fun equalsClick(view: View) {

        val secOperandText: String = resultTextView.text.toString()
        var secOperand: Double = 0.0

        if(!TextUtils.isEmpty(secOperandText)){
            secOperand = secOperandText.toDouble()
        }

        when(operation){
            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "*" -> resultTextView.text = (operand * secOperand).toString()
            "/" -> resultTextView.text = (operand / secOperand).toString()
        }
    }

    fun clearClick(view: View) {
        resultTextView.text = ""
        operand = 0.0
        operation =""
    }

    fun delClick(view: View) {
        if(resultTextView.text.toString().toDouble()-resultTextView.text.toString().toInt() == 0.0){
            resultTextView.text = (((resultTextView.text.toString().toDouble()-c.toDouble())/10).toInt()).toString()
        }
        else{
            var r = resultTextView.text
            var sum: Int = 1
            while(!(r.toString().toDouble() == r.toString().toInt().toDouble())){
                r = (r.toString().toDouble()*10).toString()
                sum*=10
            }
            resultTextView.text = (resultTextView.text.toString().toDouble()-(c.toDouble()/(sum))).toString()

        }




        }

    }

// ======================= del funqcias es gavuwere maqamde mara ar moqmedebda ratomgac ===========================
//        if(resultTextView.text.toString().toDouble() == resultTextView.text.toString().toInt().toDouble() ){
//        resultTextView.text = ((resultTextView.text.toString().toInt())/10).toString()
//        }
//        else{
//            var sum: Int = -1
//            var r = resultTextView.text
//            while (!(r.toString().toDouble() == r.toString().toInt().toDouble())){
//                r = (r.toString().toDouble()*10).toString()
//                sum +=1
//            }
//            r = ((r.toString().toDouble())/10).toInt().toString()
//            if(sum == 0){
//                r = r.toString().toDouble().toString()
//            }
//            else{
//                r = ((r.toString().toDouble())/(sum*10)).toString()
//            }
//            resultTextView.text = r
//
//            }