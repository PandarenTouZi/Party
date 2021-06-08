package com.haochang.party.image

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainImageActivity : BaseActivityMVPActivity<MainImagePresenter>(), MainImageContract.IView {
    override fun onInitMVPContract(): MainImagePresenter {
        return MainImagePresenter(this, MainImageModule())
    }

    override fun onInitView(rootView: View) {
    }
}