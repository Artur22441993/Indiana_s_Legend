package cam.indlege.legeng.ind;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.room.Database;

import com.onesignal.OneSignal;

public class AAAAA extends Application {


    public final String fd = "MWJhOWQyNmYtNTcwMC00MDIyLThhM2ItNGUxMDY2OTU1ZjJj";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
        OneSignal.initWithContext(this);
        OneSignal.setAppId(MainActivity.ddddeee(fd));
        AAAAooo.aaaaOOO(this);

    }
}
