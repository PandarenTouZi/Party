package com.haochang.party.audio

import android.view.View
import com.haochang.base.framework.mvp.activity.BaseActivityMVPActivity
import com.haochang.party.R

/**
 * author:pandaren
 * createDate:2023/11/6 17:33
 */
class MainAudioMVPActivity : BaseActivityMVPActivity<MainAudioMVPContract.IPresenter>(),
    MainAudioMVPContract.IView {
    override fun provideLayoutId(): Int {
        return R.layout.main_audio
    }

    override fun onInitView(rootView: View) {

    }

    override fun onInitMVPContract(): MainAudioMVPContract.IPresenter {
        return MainAudioMVPPresenter(this, MainAudioMVPModel())
    }
}