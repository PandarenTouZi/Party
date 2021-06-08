package com.haochang.party.base

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainMVPActivity: BaseActivityMVPActivity<MainMVPPresenter>(), MainMVPContract.IView {
    override fun onInitMVPContract(): MainMVPPresenter {
        return MainMVPPresenter(this, MainMVPModule())
    }

    override fun onInitView(rootView: View) {
    }
}