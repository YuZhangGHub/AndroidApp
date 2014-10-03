package com.example.androidapp;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.FormBodyPart;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.ByteArrayBody;
import org.apache.http.entity.mime.content.ContentBody;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.InputStreamBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

import com.example.base.C;
import com.example.androidapp.R;
import com.example.base.BaseUi;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends BaseUi {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
		Button postValue = (Button) findViewById(R.id.buttonPostValue);
		Button postJson = (Button) findViewById(R.id.buttonPostJson);
		Button SetImage = (Button) findViewById(R.id.buttonSetImage);
		Button GetImage = (Button) findViewById(R.id.buttonGetImage);
        
     // login submit
        OnClickListener mOnClickListener = new OnClickListener() {
     			@Override
     			public void onClick(View v) {
     				switch (v.getId()) {
     				case R.id.buttonPostValue : 
						doTaskLogin();
						break;
     				case R.id.buttonPostJson :
     					doTaskPostJson();
     					break;
     				case R.id.buttonSetImage :
     					doTaskSetImage();
     					break;
     				case R.id.buttonGetImage :
     					doTaskGetImage();
     					break;
     				}	
     			}
     		};
     	postValue.setOnClickListener(mOnClickListener);
     	postJson.setOnClickListener(mOnClickListener);
     	SetImage.setOnClickListener(mOnClickListener);
     	GetImage.setOnClickListener(mOnClickListener);
    }
    
    private void doTaskLogin() {
		app.setLong(System.currentTimeMillis());
			HashMap<String, String> urlParams = new HashMap<String, String>();
			urlParams.put("name", "james");
			urlParams.put("pass", "james");
			try {
				this.doTaskAsync(C.task.testLogin, C.api.testLogin, urlParams);
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
    
    private void doTaskPostJson() {
    	app.setLong(System.currentTimeMillis());
    	
    	JSONObject json = new JSONObject();
		JSONObject subJson = new JSONObject();

		try {
			subJson.put("Name", "Yu");
			subJson.put("Pass", "Hello");
			json.put("json", subJson);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		HashMap<String, String> urlParams = new HashMap<String, String>();
		urlParams.put("json", json.toString());
		try {
			this.doTaskAsync(C.task.testJson, C.api.testJson, urlParams);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    private void doTaskSetImage()
    {
    	 app.setLong(System.currentTimeMillis());
	     String filePath = "/mnt/sdcard/icon.png";// 测试写的文件路径，转换成自己的文件路径  
	     final String hostUrl = C.api.base + C.api.testImage;// 写成自己要上传的地址  
	     
	     try {
				this.doTaskAsync(C.task.testImage, C.api.testImage, filePath);
			} catch (Exception e) {
				e.printStackTrace();
			}
    }
    
    private void doTaskGetImage()
    {
    	this.loadImage("http://172.13.0.130:8002/pictures/icon.png");
 
    	//在handler里写回调
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
