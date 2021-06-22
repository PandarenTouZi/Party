package com.haochang.party.base

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainMVPPresenter(view: MainMVPContract.IView,
                       module: MainMVPContract.IModule
) : MainMVPContract.IPresenter(view, module) {

    override fun onViewCreate() {

    }

    override fun onViewDestroy() {
    }
}