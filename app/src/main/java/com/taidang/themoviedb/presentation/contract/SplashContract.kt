package com.taidang.themoviedb.presentation.contract

import com.taidang.themoviedb.domain.model.Country
import com.taidang.themoviedb.presentation.contract.base.IBasePresenter
import com.taidang.themoviedb.presentation.contract.base.IBaseView

interface SplashContract {

    interface View : IBaseView<Presenter> {
        fun displayChooseCountryDialog(countries: List<Country>)
        fun gotoMainScreen()
    }

    interface Presenter : IBasePresenter<View> {
        fun pickCountry(country: Country)
    }
}