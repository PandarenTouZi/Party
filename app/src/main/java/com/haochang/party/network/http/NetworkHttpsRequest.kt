package com.haochang.party.network.http

//import com.haochang.network.client.HttpsClient
//import com.haochang.network.request.HttpsRequest

/**
 * @author: pandaren
 * @createTime: 2021/4/7
 * 实现app耦合请求
 */
class NetworkHttpsRequest /*: HttpsRequest()*/ {
    /*class Builder : HttpsRequest.Builder() {
        override fun url(url: String): HttpsRequest.Builder =
            super.url(if (HttpsClient.instance?.host?.isEmpty() != false) url else HttpsClient.instance?.host + url)

        override fun headers(header: HashMap<String, String>?): HttpsRequest.Builder {
            return super.headers(
                if (header?.isEmpty() == false) {
                    if (HttpsClient.instance?.normalHeader != null) {
                        header.putAll(HttpsClient.instance?.normalHeader!!)
                    }
                    header
                } else
                    HttpsClient.instance?.normalHeader
            )
        }

        override fun params(params: HashMap<String, String>?): HttpsRequest.Builder {
            return super.params(params)
        }
    }*/
}