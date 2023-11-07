package com.haochang.party.audio

import android.view.View
import com.haochang.audio.player.AudioPlayer
import com.haochang.audio.record.AudioRecorder
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.base.listener.OnBaseClickListener
import com.haochang.party.R

/**
 * author:pandaren
 * createDate:2023/11/6 17:33
 * 音频
 */
class MainAudioMVPActivity : BaseActivityMVPActivity<MainAudioMVPContract.IPresenter>(),
    MainAudioMVPContract.IView {

    private val mOnBaseClickListener: OnBaseClickListener

    init {
        mOnBaseClickListener = object : OnBaseClickListener() {
            override fun onBaseClick(v: View?) {
                when (v?.id) {
                    R.id.mainAudioMVPActivity_tv_playLocal -> {
                        mPresenter?.startPlayRawAudio()
                    }
                    else -> {}
                }
            }
        }
    }

    override fun provideLayoutId(): Int {
        return R.layout.main_audio
    }

    override fun onInitView(rootView: View) {
        println("MainVideoMVPActivity.onInitView   ${AudioRecorder().test()}  ${AudioPlayer().test()}")
        rootView.findViewById<View>(R.id.mainAudioMVPActivity_tv_playLocal).also {
            it.setOnClickListener(mOnBaseClickListener)
        }
    }

    override fun onInitMVPContract(): MainAudioMVPContract.IPresenter {
        return MainAudioMVPPresenter(this, MainAudioMVPModel())
    }
}