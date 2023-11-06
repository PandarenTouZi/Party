package com.haochang.party.view

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainViewsContract : BaseActivityMVPContract {
    interface IView : BaseActivityMVPContract.IView
    abstract class IModule : BaseActivityMVPContract.IModule()
    abstract class IPresenter(view: IView, module: IModule) :
        BaseActivityMVPContract.IPresenter<IView, IModule>(view, module)
}