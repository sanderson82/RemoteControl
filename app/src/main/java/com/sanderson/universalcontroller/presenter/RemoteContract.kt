package com.sanderson.universalcontroller.presenter

/**
 * The contract required to make a view/presentation for the remote
 */
interface RemoteContract {
    interface View: BaseView<Presenter>, DistanceView
    interface Presenter: BasePresenter, DirectionPresenter
}