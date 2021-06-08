package com.haochang.party.network

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainNetworkContract : BaseActivityMVPContract {
    interface IView : BaseActivityMVPContract.IView
    interface IModule : BaseActivityMVPContract.IModule
    abstract class IPresenter(view: IView, module: IModule) :
        BaseActivityMVPContract.IPresenter<IView, IModule>(view, module)
}