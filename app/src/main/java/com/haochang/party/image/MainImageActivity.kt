package com.haochang.party.image

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainImageActivity : BaseActivityMVPActivity<MainImagePresenter>(), MainImageContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.layout_main_image
    }

    override fun onInitMVPContract(): MainImagePresenter {
        return MainImagePresenter(this, MainImageModel())
    }

    override fun onInitView(rootView: View) {
    }
}