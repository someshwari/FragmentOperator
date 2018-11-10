package com.tubitv.fragmentoperator.logging

import android.util.Log
import com.tubitv.fragmentoperator.BuildConfig

class FoLog {

    companion object {
        @JvmStatic
        fun d(tag: String?, message: String?) {
            if (BuildConfig.DEBUG
                    && tag != null
                    && message != null) {
                Log.d(tag, message)
            }
        }
    }

}