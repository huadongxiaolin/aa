package com.example.myapplication08;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

//服务创建完成后,AS会自动在AndroidManifest.xml文件中注册服务
public class MyService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("MyService", "创建服务，执行onCreate()方法");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("MyService", "开启服务，执行onStartCommand()方法");
        return super.onStartCommand(intent, flags, startId);
    }

    //    onBind()是Service子类必须实现的方法,返回一个IBinder对象,应用程序可通过该对象与Service组件通信
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("MyService", "关闭服务，执行onDestroy()方法");
    }
}
