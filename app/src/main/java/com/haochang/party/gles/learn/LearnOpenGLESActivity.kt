package com.haochang.party.gles.learn

import android.opengl.GLSurfaceView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.haochang.base.framework.mvp.AbsMVPContract
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * @author: pandaren
 * @createTime: 2021/8/12
 */
class LearnOpenGLESActivity : BaseActivityMVPActivity<AbsMVPContract.IPresenter<*, *>>() {

    private var glSurfaceView: GLSurfaceView? = null

    override fun provideLayoutId(): Int {
        return 0
    }

    override fun provideContentView(): View? {
        glSurfaceView = GLSurfaceView(this)
        glSurfaceView?.setEGLContextClientVersion(3)
        glSurfaceView?.setRenderer(SimpleRender())
        setContentView(glSurfaceView)
        return glSurfaceView
    }

    override fun onInitView(rootView: View) {
        val rootViewGroup: ViewGroup? = null
        val inflateView = layoutInflater.inflate(R.layout.include_common_title, rootViewGroup)
        inflateView.findViewById<View>(R.id.includeCommonTitleIvBack).setOnClickListener {
            finish()
        }
        inflateView.findViewById<TextView>(R.id.includeCommonTitleTvTitle).text = "GLES基础页面"
        provideNormalTitleTop(inflateView)
    }

    override fun onInitMVPContract(): AbsMVPContract.IPresenter<*, *>? {
        return null
    }
}