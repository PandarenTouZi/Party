package com.haochang.party.network.application

import android.app.Application
//import com.haochang.network.client.HttpsClient
//import com.haochang.network.client.HttpsClientConfig

/**
 * @author: pandaren
 * @createTime: 2021/4/7
 * 统筹网络框架的
 */
class NetworkApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        val header = HashMap<String, String>()
        header["app-channel"] = "google"
        header["app-version"] = "2.8.0"
        header["cli-uniqid"] = ""
        header["cli-idfa"] = ""
        header["cli-os"] = "android"
        header["cli-os-version"] = "10"
        header["cli-model"] = "XiaoMi"
        header["cli-resolution"] = "1920x2335"
        header["cli-mcc"] = ""
        header["cli-mnc"] = ""
        header["cli-app"] = "ck"
        header["cli-app-pkg"] = packageName
        /*HttpsClient().init(
            HttpsClientConfig.Builder(header).host("https://new-test-ck.haochang.tv/").build()
        )*/
    }
}