package com.haochang.party.utils

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainUtilsActivity : BaseActivityMVPActivity<MainUtilsPresenter>(), MainUtilsContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.layout_main_utils
    }

    override fun onInitMVPContract(): MainUtilsPresenter {
        return MainUtilsPresenter(this, MainUtilsModule())
    }

    override fun onInitView(rootView: View) {

    }
}