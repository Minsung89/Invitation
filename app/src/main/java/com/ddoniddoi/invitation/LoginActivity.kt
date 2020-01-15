package com.ddoniddoi.invitation

import android.content.Intent
import android.os.Bundle
import com.ddoniddoi.androidbasic.BaseActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setValues()
        setupEvents()
    }

    override fun setValues() {
    }

    override fun setupEvents() {
        loginBtn.setOnClickListener {
            var intent = Intent(mContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
