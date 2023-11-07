package com.haochang.party.view.text.scrolltext

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * @author: pandaren
 * @createTime: 2021/6/22
 */
class ScrollTextViewContract : BaseActivityMVPContract {
    abstract class IModel : BaseActivityMVPContract.IModel() {}
    interface IView : BaseActivityMVPContract.IView {}
    abstract class IPresenter(view: IView, module: IModel) :
        BaseActivityMVPContract.IPresenter<IView, IModel>(view, module) {}
}