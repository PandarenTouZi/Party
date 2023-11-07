package com.haochang.party.audio

/**
 * author:pandaren
 * createDate:2023/11/6 17:33
 */
class MainAudioMVPPresenter(
    view: MainAudioMVPContract.IView,
    model: MainAudioMVPContract.IModel
) : MainAudioMVPContract.IPresenter(
    view, model
) {
    override fun startPlayRawAudio() {
        mModule.stopAllPlayers()
        mModule.startPlayRawAudio(object : MainAudioMVPContract.IModel.IRawAudioPlayerListener {

        })
    }
}