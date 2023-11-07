package com.haochang.party.network

/**
 * @author: pandaren
 * @createTime: 2021/6/8
 */
class MainNetworkPresenter(view: MainNetworkContract.IView,
                           module: MainNetworkContract.IModel
) : MainNetworkContract.IPresenter(view, module) {
    override fun onViewCreate() {
    }

    override fun onViewDestroy() {
    }
}