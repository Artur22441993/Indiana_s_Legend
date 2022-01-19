package cam.indlege.legeng.ind;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Poliii extends Activity {

    WebView ewds;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.poliii);
        ewds = findViewById(R.id.webPoli);
        String dsd = getIntent().getStringExtra("wes");
        ewds.loadUrl(dsd);
    }
}
