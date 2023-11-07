package com.haochang.party.network

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainNetworkActivity : BaseActivityMVPActivity<MainNetworkPresenter>(),
    MainNetworkContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.layout_main_network
    }

    override fun onInitMVPContract(): MainNetworkPresenter {
        return MainNetworkPresenter(this, MainNetworkModel())
    }

    override fun onInitView(rootView: View) {
    }

    override fun onPostResume() {
        super.onPostResume()
    }
}