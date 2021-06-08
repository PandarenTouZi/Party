package com.haochang.party.gles

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * @author: pandaren
 * @createTime: 2021/6/4
 */
interface MainOpenGLESContract : BaseActivityMVPContract {
    interface IView : BaseActivityMVPContract.IView
    interface IModule : BaseActivityMVPContract.IModule
    abstract class IPresenter(view: IView, module: IModule) :
        BaseActivityMVPContract.IPresenter<IView, IModule>(view, module) {

    }
}