package com.haochang.party.view

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainViewsActivity : BaseActivityMVPActivity<MainViewsPresenter>(), MainViewsContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.layout_main_view
    }

    override fun onInitMVPContract(): MainViewsPresenter {
        return MainViewsPresenter(this, MainViewsModule())
    }

    override fun onInitView(rootView: View) {
    }
}