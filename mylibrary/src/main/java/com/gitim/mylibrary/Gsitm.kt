package com.gitim.mylibrary

import android.content.Context
import android.widget.Toast

object Gsitm {
    fun testToast(mContext: Context){
        Toast.makeText(mContext, "라이브러리 테스트 입니다", Toast.LENGTH_LONG).show()
    }
}