package com.haochang.party.audio

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * author:pandaren
 * createDate:2023/11/6 16:47
 */
interface MainAudioMVPContract {
    abstract class IModel : BaseActivityMVPContract.IModule()

    interface IView : BaseActivityMVPContract.IView

    abstract class IPresenter(view: BaseActivityMVPContract.IView,
                              model: BaseActivityMVPContract.IModule
    ) : BaseActivityMVPContract.IPresenter<IView, IModel>(
        view, model
    )
}