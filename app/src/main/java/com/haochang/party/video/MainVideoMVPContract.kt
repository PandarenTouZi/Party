package com.haochang.party.video

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * author:pandaren
 * createDate:2023/11/6 16:47
 */
interface MainVideoMVPContract {
    abstract class IModel : BaseActivityMVPContract.IModel()

    interface IView : BaseActivityMVPContract.IView

    abstract class IPresenter(view: BaseActivityMVPContract.IView,
                              model: BaseActivityMVPContract.IModel
    ) : BaseActivityMVPContract.IPresenter<IView, IModel>(
        view, model
    )
}