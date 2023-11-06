package com.haochang.party.audio

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * author:pandaren
 * createDate:2023/11/6 17:33
 */
class MainAudioMVPPresenter(
    view: BaseActivityMVPContract.IView,
    model: BaseActivityMVPContract.IModule
) : MainAudioMVPContract.IPresenter(
    view, model
) {
}