package com.haochang.party.utils

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainUtilsContract : BaseActivityMVPContract {
    interface IView : BaseActivityMVPContract.IView
    interface IModule : BaseActivityMVPContract.IModule
    abstract class IPresenter(view: IView, module: IModule) :
        BaseActivityMVPContract.IPresenter<IView, IModule>(view, module)
}