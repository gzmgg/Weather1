package com.example.weather.tool;

import org.json.JSONException;
import org.json.JSONObject;

import com.example.weather.entity.Weather;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ParseStringtoJSON {
	public static Weather getJSON(String json){
		Weather weather;
		weather = new Weather();
		try {
			JSONObject jsonObject = new JSONObject(json);
			JSONObject jsonObject2 = jsonObject.getJSONObject("weatherinfo");
//			weather.setCity(jsonObject2.getString("city"));
//			weather.setCityid(jsonObject2.getString("cityid"));
//			weather.setTemp(jsonObject2.getString("temp"));
//			weather.setWD(jsonObject2.getString("WD"));
//			weather.setWS(jsonObject2.getString("WS"));
//			weather.setSD(jsonObject2.getString("SD"));
//			weather.setWSE(jsonObject2.getString("WSE"));
//			weather.setTime(jsonObject2.getString("time"));
//			weather.setIsRadar(jsonObject2.getString("isRadar"));
//			weather.setRadar(jsonObject2.getString("Radar"));
//			weather.setNjd(jsonObject2.getString("njd"));
//			weather.setQy(jsonObject2.getString("qy"));
			weather = new Gson().fromJson(jsonObject2.toString(), Weather.class);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return weather;
	}
}
