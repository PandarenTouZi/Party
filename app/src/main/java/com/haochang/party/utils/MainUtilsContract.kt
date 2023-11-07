package com.haochang.party.utils

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainUtilsContract : BaseActivityMVPContract {
    interface IView : BaseActivityMVPContract.IView
    abstract class IModel : BaseActivityMVPContract.IModel()
    abstract class IPresenter(view: IView, module: IModel) :
        BaseActivityMVPContract.IPresenter<IView, IModel>(view, module)
}