package com.haochang.party.gles

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity

/**
 * @author: pandaren
 * @createTime: 2021/6/3
 */
class MainOpenGLESActivity : BaseActivityMVPActivity<MainOpenGLESPresenter>(),
    MainOpenGLESContract.IView {
    override fun onInitView(rootView: View) {

    }

    override fun onInitMVPContract(): MainOpenGLESPresenter {
        return MainOpenGLESPresenter(this, MainOpenGLESModule())
    }
}