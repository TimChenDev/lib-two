package com.devtimchen.libtwo

//import ICheck
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devtimchen.libone.ICheck

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 建立一個 aidl 的 binder
        val binder = ICheck.Stub.asInterface(null)
//        ICheck
    }
}