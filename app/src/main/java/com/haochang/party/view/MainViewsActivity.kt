package com.haochang.party.view

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainViewsActivity : BaseActivityMVPActivity<MainViewsPresenter>(), MainViewsContract.IView {
    override fun onInitMVPContract(): MainViewsPresenter {
        return MainViewsPresenter(this, MainViewsModule())
    }

    override fun onInitView(rootView: View) {

    }
}