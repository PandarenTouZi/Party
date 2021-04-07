package com.haochang.party

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.haochang.network.request.HttpsMethod
import com.haochang.network.request.HttpsRequest
import com.haochang.network.request.HttpsRequestCallback
import com.haochang.party.network.http.NetworkHttpsRequest

/**
 * @author: pandaren
 * @createTime: 2021/4/2
 * main logo
 */
class LogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = Button(this)
        button.text = "点击请求"
        button.setOnClickListener {
            val param = HashMap<String, String>()
            param["client"] = "android"
            val header = HashMap<String, String>()
            header["method"] = HttpsMethod.Get.name
            header["client"] = "android_header"
            NetworkHttpsRequest.Builder()
                .method(HttpsMethod.Get)
                .url("api/config")
                .headers(header)
                .params(param)
                .requestCallback(object : HttpsRequestCallback {
                    override fun onRequestFail(error: Long, message: String) {
                        println("LogoActivity.onRequestFail  $error   $message")
                    }

                    override fun onRequestSuccess(responseBody: String) {
                        println("LogoActivity.onRequestSuccess   $responseBody")
                    }
                })
                .build().execute()
        }
        setContentView(button)
    }
}