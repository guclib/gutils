package com.guc.gutils

import android.content.Context

/**
 * Created by guc on 2021/5/25.
 * Description：工具初始化入口
 */
object GUtils {
    lateinit var context: Context
    fun init(context: Context) {
        this.context = context.applicationContext
    }

}