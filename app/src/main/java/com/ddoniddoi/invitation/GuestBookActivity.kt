package com.ddoniddoi.invitation

import android.content.Intent
import android.os.Bundle
import com.ddoniddoi.androidbasic.BaseActivity
import kotlinx.android.synthetic.main.activity_guest_book.*

class GuestBookActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest_book)

        setValues()
        setupEvents()

    }

    override fun setValues() {
    }

    override fun setupEvents() {
        guestBookHomeIcon.setOnClickListener {
            startActivity(Intent(mContext,MainActivity::class.java))
        }
        guestBookInvitaionIcon.setOnClickListener {
            startActivity(Intent(mContext,InvitationActivity::class.java))
        }
        guestBookSampleIcon.setOnClickListener {
            startActivity(Intent(mContext,SampleViewActivity::class.java))
        }
        guestBookOrderHistoryIcon.setOnClickListener {
            startActivity(Intent(mContext,OrderHistoryActivity::class.java))
        }
    }
}
