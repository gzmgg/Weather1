package com.example.weather.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

import com.example.weather.R;
import com.example.weather.entity.Weather;

public class DisplayWeatherInfoView {
	private Activity activity;
	private RequestWeatherInfoView rwView;
	private EditText number;
	private ProgressDialog progressDialog;
	private TextView city;
	private TextView cityid;
	private TextView temp;
	private TextView WD;
	private TextView WS;
	private TextView SD;
	private TextView WSE;
	private TextView time;
	private TextView isRadar;
	private TextView Radar;
	private TextView qy;
	public DisplayWeatherInfoView(Activity activity,RequestWeatherInfoView rwView) {
		// TODO Auto-generated constructor stub
		this.activity = activity;
		this.rwView = rwView;
		initView();
	}
	private void initView(){
		number = (EditText) activity.findViewById(R.id.location);
		city = (TextView) activity.findViewById(R.id.city);
		cityid = (TextView) activity.findViewById(R.id.cityid);
		temp = (TextView) activity.findViewById(R.id.temp);
		WD = (TextView) activity.findViewById(R.id.WD);
		WS = (TextView) activity.findViewById(R.id.WS);
		SD = (TextView) activity.findViewById(R.id.SD);
		WSE = (TextView) activity.findViewById(R.id.WSE);
		time = (TextView) activity.findViewById(R.id.time);
		isRadar = (TextView) activity.findViewById(R.id.isRadar);
		Radar = (TextView) activity.findViewById(R.id.Radar);
		qy = (TextView) activity.findViewById(R.id.qy);
		progressDialog = new ProgressDialog(activity);
		progressDialog.setMessage("正在加载中...");
		progressDialog.setTitle("提示");
		activity.findViewById(R.id.go).setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				progressDialog.show();
				rwView.sendRequest(number.getText().toString());
			}
		});
	}
	public void hideProgress(){
		progressDialog.dismiss();
	}
	public void setText(Weather weather){
		city.setText("city:"+weather.getCity());
		cityid.setText("cityid:"+weather.getCityid());
		temp.setText("temp:"+weather.getTemp());
		WD.setText("WD:"+weather.getWD());
		WS.setText("WS"+weather.getWS());
		SD.setText("SD:"+weather.getSD());
		WSE.setText("WSE:"+weather.getWSE());
		time.setText("time:"+weather.getTime());
		isRadar.setText("isRadar:"+weather.getIsRadar());
		Radar.setText("Radar:"+weather.getRadar());
		qy.setText("qy:"+weather.getQy());
	}
}	
