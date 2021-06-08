package com.haochang.party.network

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainNetworkActivity : BaseActivityMVPActivity<MainNetworkPresenter>(),
    MainNetworkContract.IView {
    override fun onInitMVPContract(): MainNetworkPresenter {
        return MainNetworkPresenter(this, MainNetworkModule())
    }

    override fun onInitView(rootView: View) {
    }
}