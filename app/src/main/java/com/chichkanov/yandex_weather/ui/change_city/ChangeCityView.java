package com.chichkanov.yandex_weather.ui.change_city;

import com.arellomobile.mvp.MvpView;
import com.chichkanov.yandex_weather.model.places.Prediction;

import java.util.List;


public interface ChangeCityView extends MvpView {
    void showSuggestions(List<Prediction> suggestions);
}