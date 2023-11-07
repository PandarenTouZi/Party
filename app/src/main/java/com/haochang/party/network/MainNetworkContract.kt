package com.haochang.party.network

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainNetworkContract : BaseActivityMVPContract {
    interface IView : BaseActivityMVPContract.IView
    abstract class IModel : BaseActivityMVPContract.IModel()
    abstract class IPresenter(view: IView, module: IModel) :
        BaseActivityMVPContract.IPresenter<IView, IModel>(view, module)
}