package com.example.weather.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.weather.R;
import com.example.weather.model.WeatherInfoListener;
import com.example.weather.model.WeatherInfoModel;
import com.example.weather.tool.ParseStringtoJSON;
import com.example.weather.view.DisplayWeatherInfoView;
import com.example.weather.view.RequestWeatherInfoView;


public class MainActivity extends AppCompatActivity implements WeatherInfoListener,RequestWeatherInfoView{
	private WeatherInfoModel weatherInfoModel;
	private DisplayWeatherInfoView displayWeatherInfoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayWeatherInfoView = new DisplayWeatherInfoView(this, this);
        weatherInfoModel = new WeatherInfoModel();
    }

	@Override
	public void onSuccess(String weather) {
		// TODO Auto-generated method stub
		displayWeatherInfoView.hideProgress();
		Log.d("weather",ParseStringtoJSON.getJSON(weather).toString());
		displayWeatherInfoView.setText(ParseStringtoJSON.getJSON(weather));
	}

	@Override
	public void Onfail() {
		// TODO Auto-generated method stub
		displayWeatherInfoView.hideProgress();
		Log.d("Weather","��ȡ����ʧ��.");
	}

    @Override
    public void onSuccesss(String s) {

    }

    @Override
	public void sendRequest(String number) {
		// TODO Auto-generated method stub
		weatherInfoModel.getWeather(this,number,this);
	}
}
