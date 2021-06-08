package com.haochang.party.permission

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainPermissionActivity : BaseActivityMVPActivity<MainPermissionPresenter>(),
    MainPermissionContract.IView {
    override fun onInitMVPContract(): MainPermissionPresenter {
        return MainPermissionPresenter(this, MainPermissionModule())
    }

    override fun onInitView(rootView: View) {

    }
}