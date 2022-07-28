package com.denlpr.thirdapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.denlpr.thirdapp.constance.Constance
import com.denlpr.thirdapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)

        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.b1.setOnClickListener {



            val resultValue : String = bindingClass.edValue.text.toString()


            when(resultValue) {


                Constance.Surveor -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получит ${Constance.Surveor_salary}"
                    if(bindingClass.kodeks.text.toString() == Constance.Surveor_kod){
                    bindingClass.tvResult.text = tempText}
                    else {bindingClass.tvResult.text = "неверный пароль"}
                }

                Constance.Manager -> {
                   bindingClass.tvResult.visibility = android.view.View.VISIBLE
                   val tempText = "Получит ${Constance.Manager_salary}"
                    if(bindingClass.kodeks.text.toString() == Constance.Manager_kod){
                        bindingClass.tvResult.text = tempText}
                    else {bindingClass.tvResult.text = "неверный пароль"}
               }

                Constance.Cleark -> {
                   bindingClass.tvResult.visibility = android.view.View.VISIBLE
                   val tempText = "Получит ${Constance.Clear_salary}"
                    if(bindingClass.kodeks.text.toString() == Constance.Cleark_kod){
                        bindingClass.tvResult.text = tempText}
                    else {bindingClass.tvResult.text = "неверный пароль"}
               }

                else -> {
                    bindingClass.tvResult.visibility = android.view.View.VISIBLE
                    bindingClass.tvResult.text = "нет такого работника"
                }
            }

        }

        }

    }






