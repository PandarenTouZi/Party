package com.haochang.party.permission

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainPermissionActivity : BaseActivityMVPActivity<MainPermissionPresenter>(),
    MainPermissionContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.layout_main_permission
    }

    override fun onInitMVPContract(): MainPermissionPresenter {
        return MainPermissionPresenter(this, MainPermissionModel())
    }

    override fun onInitView(rootView: View) {

    }
}