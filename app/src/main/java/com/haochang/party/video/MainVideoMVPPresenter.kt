package com.haochang.party.video

import com.haochang.base.framework.mvp.activity.BaseActivityMVPContract

/**
 * author:pandaren
 * createDate:2023/11/6 17:33
 */
class MainVideoMVPPresenter(
    view: BaseActivityMVPContract.IView,
    model: BaseActivityMVPContract.IModel
) : MainVideoMVPContract.IPresenter(
    view, model
) {
}