package com.ddoniddoi.invitation

import android.content.Intent
import android.os.Bundle
import com.ddoniddoi.androidbasic.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setupEvents()

    }


    override fun setValues() {
    }

    override fun setupEvents() {
        invitaionIcon.setOnClickListener {
            startActivity(Intent(mContext,InvitationActivity::class.java))
        }
        guestBookIcon.setOnClickListener {
            startActivity(Intent(mContext,GuestBookActivity::class.java))
        }
        sampleIcon.setOnClickListener {
            startActivity(Intent(mContext,SampleViewActivity::class.java))
        }
        orderHistoryIcon.setOnClickListener {
            startActivity(Intent(mContext, OrderHistoryActivity::class.java))
        }
    }
}
