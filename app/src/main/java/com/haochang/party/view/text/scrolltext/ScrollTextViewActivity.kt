package com.haochang.party.view.text.scrolltext

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/6/22
 */
class ScrollTextViewActivity : BaseActivityMVPActivity<ScrollTextViewPresenter>(),
    ScrollTextViewContract.IView {

    override fun onInitMVPContract(): ScrollTextViewPresenter {
        return ScrollTextViewPresenter(this, ScrollTextViewModule())
    }

    override fun provideLayoutId(): Int {
        return R.layout.layout_scrolltextview
    }

    override fun onInitView(rootView: View) {

    }
}