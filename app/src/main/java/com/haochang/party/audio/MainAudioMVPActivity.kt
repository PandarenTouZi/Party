package com.haochang.party.audio

import android.view.View
import com.haochang.audio.player.AudioPlayer
import com.haochang.audio.record.AudioRecorder
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * author:pandaren
 * createDate:2023/11/6 17:33
 * 音频
 */
class MainAudioMVPActivity : BaseActivityMVPActivity<MainAudioMVPContract.IPresenter>(),
    MainAudioMVPContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.main_audio
    }

    override fun onInitView(rootView: View) {
        println("MainVideoMVPActivity.onInitView   ${AudioRecorder().test()}  ${AudioPlayer().test()}")
    }

    override fun onInitMVPContract(): MainAudioMVPContract.IPresenter {
        return MainAudioMVPPresenter(this, MainAudioMVPModel())
    }
}