package com.haochang.party.gles.learn

import android.opengl.GLSurfaceView
import com.haochang.base.ui.BaseActivity

/**
 * @author: pandaren
 * @createTime: 2021/8/12
 */
class LearnOpenGLESActivity : BaseActivity() {

    private var glSurfaceView: GLSurfaceView? = null
    override fun initView() {
        super.initView()
        glSurfaceView = GLSurfaceView(this)
//        glSurfaceView.layoutParams =

        glSurfaceView?.setEGLContextClientVersion(3)
        glSurfaceView?.setRenderer(SimpleRender())
        setContentView(glSurfaceView)
    }
}