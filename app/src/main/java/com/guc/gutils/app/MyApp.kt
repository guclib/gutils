package com.guc.gutils.app

import android.app.Application
import com.guc.gutils.GUtils

/**
 * Created by guc on 2021/5/25.
 * Description：程序入口
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        GUtils.init(this)
    }
}