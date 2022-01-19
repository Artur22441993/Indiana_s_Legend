package cam.indlege.legeng.ind;

import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

import java.util.Map;
import java.util.Objects;

public class AAAAooo {

    public static String ksd;
    public static String lifsj = "";
    public static String kiusd;
    public static String judb;
    public static String hf = "N3FXNnJxeGtRN25heGFxZW9BdG04Sw==";

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void aaaaOOO(AAAAA aaaaa){

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    kiusd = AdvertisingIdClient.getAdvertisingIdInfo(aaaaa.getApplicationContext()).getId();
                }catch (Exception e){

                }
            }
        }).start();

        ksd = AppsFlyerLib.getInstance().getAppsFlyerUID(aaaaa.getApplicationContext());

        AppsFlyerLib.getInstance().init(MainActivity.ddddeee(hf), new AppsFlyerConversionListener() {
            @Override
            public void onConversionDataSuccess(Map<String, Object> map) {
                lifsj = Objects.requireNonNull(map.get(MainActivity.ddddeee("YWZfc3RhdHVz"))).toString();
                if (lifsj.equals(MainActivity.ddddeee("Tm9uLW9yZ2FuaWM="))){
                    String kdis = Objects.requireNonNull(map.get(MainActivity.ddddeee("Y2FtcGFpZ24="))).toString();
                    judb = MainActivity.kfdodk(kdis,aaaaa.getPackageName(), kiusd, ksd);
                }
            }

            @Override
            public void onConversionDataFail(String s) {
            }

            @Override
            public void onAppOpenAttribution(Map<String, String> map) {

            }

            @Override
            public void onAttributionFailure(String s) {

            }
        },aaaaa.getApplicationContext());
        AppsFlyerLib.getInstance().start(aaaaa.getApplicationContext());

    }
}
