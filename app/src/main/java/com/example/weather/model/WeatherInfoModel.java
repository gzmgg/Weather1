package com.example.weather.model;

import android.app.Activity;
import android.util.Log;

import com.android.volley.RequestQueue;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class WeatherInfoModel implements WeatherInfoModelImpl{

	@Override
	public void getWeather(Activity activity,String cityNumber, final WeatherInfoListener iListener) {
		// TODO Auto-generated method stub
		RequestQueue requestQueue = Volley.newRequestQueue(activity);
		JsonObjectRequest request = new JsonObjectRequest("http://www.weather.com.cn/adat/sk/"+cityNumber+".html", null, new Listener<JSONObject>() {

			@Override
			public void onResponse(JSONObject response) {
				// TODO Auto-generated method stub
				Log.d("response", response.toString());
				iListener.onSuccess(response.toString());
			}
		}, new ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				// TODO Auto-generated method stub
				iListener.Onfail();
			}
		});
		requestQueue.add(request);
	}


	@Override
	public void getWeather1(Activity activity,String cityNumber, final WeatherInfoListener iListener) {
		// TODO Auto-generated method stub
		RequestQueue requestQueue = Volley.newRequestQueue(activity);
		JsonObjectRequest request = new JsonObjectRequest("http://www.weather.com.cn/adat/sk/"+cityNumber+".html", null, new Listener<JSONObject>() {

			@Override
			public void onResponse(JSONObject response) {
				// TODO Auto-generated method stub
				Log.d("response", response.toString());
				iListener.onSuccesss(response.toString());
			}
		}, new ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
				// TODO Auto-generated method stub
				iListener.Onfail();
			}
		});
		requestQueue.add(request);
	}
}
