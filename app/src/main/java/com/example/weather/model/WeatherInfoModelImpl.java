package com.example.weather.model;

import android.app.Activity;

public interface WeatherInfoModelImpl {
   void getWeather(Activity activity,String cityNumber,WeatherInfoListener iListener);

   void getWeather1(Activity activity, String cityNumber, WeatherInfoListener iListener);
}
