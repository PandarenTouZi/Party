package com.haochang.party.view.text.scrolltext

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * @author: pandaren
 * @createTime: 2021/6/22
 */
class ScrollTextViewContract : BaseActivityMVPContract {
    abstract class IModule : BaseActivityMVPContract.IModule() {}
    interface IView : BaseActivityMVPContract.IView {}
    abstract class IPresenter(view: IView, module: IModule) :
        BaseActivityMVPContract.IPresenter<IView, IModule>(view, module) {}
}