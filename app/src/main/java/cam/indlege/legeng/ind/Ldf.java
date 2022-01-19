package cam.indlege.legeng.ind;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

import cam.indlege.legeng.ind.ifkd.Entityfourteen;

public class Ldf extends WebViewClient {

    @SuppressLint("StaticFieldLeak")
    public static Offff offff;
    @SuppressLint("StaticFieldLeak")
    public static Il il;
    Entityfourteen entityfourteen = null;




    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains("404")){
            offff.startActivity(new Intent(offff.getApplicationContext(), MainActivity.class));
            offff.finishAffinity();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        new Thread(new Runnable() {
            @Override
            public void run() {
                entityfourteen = new Entityfourteen(url);
                O.lofd.daofourteen().insert(entityfourteen);
            }
        }).start();



    }
}
