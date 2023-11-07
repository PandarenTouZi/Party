package com.haochang.party.base

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainMVPActivity: BaseActivityMVPActivity<MainMVPPresenter>(), MainMVPContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.layout_main_view
    }

    override fun onInitMVPContract(): MainMVPPresenter {
        return MainMVPPresenter(this, MainMVPModel())
    }

    override fun onInitView(rootView: View) {
    }
}