package com.haochang.party.video

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R
import com.haochang.video.play.VideoPlayer
import com.haochang.video.record.VideoRecorder

/**
 * author:pandaren
 * createDate:2023/11/6 17:33
 * 视频
 */
class MainVideoMVPActivity : BaseActivityMVPActivity<MainVideoMVPContract.IPresenter>(),
    MainVideoMVPContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.main_video
    }

    override fun onInitView(rootView: View) {
        println("MainVideoMVPActivity.onInitView   ${VideoRecorder().test()}  ${VideoPlayer().test()}")
    }

    override fun onInitMVPContract(): MainVideoMVPContract.IPresenter {
        return MainVideoMVPPresenter(this, MainVideoMVPModel())
    }
}