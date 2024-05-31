package com.example.test2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import com.example.test2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btRezult.setOnClickListener {

            val resultValue = bindingClass.edName.text.toString()

            when(resultValue){
                Constance.DIRECTOR ->{
                    bindingClass.textView.visibility = View.VISIBLE
                    val tText = "Получите зарплату в размере ${Constance.DIRECTOR_SUM} рублей"
                    if(bindingClass.edPass.text.toString() == Constance.DIIRECTOR_PASSWORD){
                    bindingClass.textView.text = tText
                    } else {
                        bindingClass.textView.text = "Неверный пороль!"
                    }
                }
                Constance.INGENER ->{
                    bindingClass.textView.visibility = View.VISIBLE
                    val tText = "Получите зарплату в размере ${Constance.INGENER_SUM} рублей"
                    if(bindingClass.edPass.text.toString() == Constance.IGENER_PASSWORD){
                        bindingClass.textView.text = tText
                    } else {
                        bindingClass.textView.text = "Неверный пороль!"
                    }
                }
                Constance.DVORNIK ->{
                bindingClass.textView.visibility = View.VISIBLE
                val tText = "Получите зарплату в размере ${Constance.DVORNIK_SUM} рублей"
                    if(bindingClass.edPass.text.toString() == Constance.DVORNIK_PASSWORD){
                        bindingClass.textView.text = tText
                    } else {
                        bindingClass.textView.text = "Неверный пороль!"
                    }
            }
                else -> {

                    bindingClass.textView.visibility = View.VISIBLE
                    bindingClass.textView.text ="Такой сотрудник не найден!1"

                }




            }
        }


    }

    object Constance{
        const val INGENER_SUM = 10000
        const val DVORNIK_SUM = 1000
        const val DIRECTOR_SUM = 100000

        const val DIRECTOR = "Андрей"
        const val INGENER = "Эдуард"
        const val DVORNIK = "Егор"

        const val DVORNIK_PASSWORD = "4455"
        const val IGENER_PASSWORD = "2233"
        const val DIIRECTOR_PASSWORD = "1234"

    }


}