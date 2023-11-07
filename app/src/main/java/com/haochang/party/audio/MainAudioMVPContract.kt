package com.haochang.party.audio

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * author:pandaren
 * createDate:2023/11/6 16:47
 */
interface MainAudioMVPContract {
    abstract class IModel : BaseActivityMVPContract.IModel() {

        abstract fun stopAllPlayers()
        interface IRawAudioPlayerListener {
            fun onError(msg: String)

        }
        abstract fun startPlayRawAudio(listener: IRawAudioPlayerListener)

    }

    interface IView : BaseActivityMVPContract.IView {}

    abstract class IPresenter(
        view: IView,
        model: IModel
    ) : BaseActivityMVPContract.IPresenter<IView, IModel>(
        view, model
    ) {
        abstract fun startPlayRawAudio()
    }
}