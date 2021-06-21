package com.haochang.party.gles

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/6/3
 */
class MainOpenGLESActivity : BaseActivityMVPActivity<MainOpenGLESPresenter>(),
    MainOpenGLESContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.layout_main_opengl
    }

    override fun onInitView(rootView: View) {

    }

    override fun onInitMVPContract(): MainOpenGLESPresenter {
        return MainOpenGLESPresenter(this, MainOpenGLESModule())
    }
}