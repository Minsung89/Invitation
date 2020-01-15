package com.ddoniddoi.invitation

import android.content.Intent
import android.os.Bundle
import com.ddoniddoi.androidbasic.BaseActivity
import kotlinx.android.synthetic.main.activity_order_history.*

class OrderHistoryActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_history)

        setValues()
        setupEvents()

    }

    override fun setValues() {
    }

    override fun setupEvents() {

        orderHistoryGuestBookIcon.setOnClickListener {
            startActivity(Intent(mContext, GuestBookActivity::class.java))
        }
        orderHistoryHomeIcon.setOnClickListener {
            startActivity(Intent(mContext, MainActivity::class.java))
        }
        orderHistoryInvitaionIcon.setOnClickListener {
            startActivity(Intent(mContext, InvitationActivity::class.java))
        }
        orderHistorySampleIcon.setOnClickListener {
            startActivity(Intent(mContext,SampleViewActivity::class.java))
        }
    }
}
