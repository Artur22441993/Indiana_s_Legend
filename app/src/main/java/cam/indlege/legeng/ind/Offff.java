package cam.indlege.legeng.ind;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebView;

import androidx.annotation.Nullable;

public class Offff extends Activity {

    WebView webOfer;
    public ValueCallback<Uri> jjdij;
    public Uri lkjina = null;
    public ValueCallback<Uri[]> kinjnw;
    public String nsdqwe;
    public static final int JGHSSS = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.offf);

        webOfer = findViewById(R.id.webOfer);
        Ldf.offff = this;
        ldsdj.offff = this;
        String jfd = getIntent().getStringExtra("sdwq");
        webOfer.loadUrl(jfd);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != JGHSSS || kinjnw == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (nsdqwe != null) {
                    results = new Uri[]{Uri.parse(nsdqwe)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        kinjnw.onReceiveValue(results);
        kinjnw = null;

        if (jjdij == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? lkjina : data.getData();
            }
        } catch (Exception e) { }
        jjdij.onReceiveValue(result);
        jjdij = null;
    }

    @Override
    public void onBackPressed() {
        if (webOfer.isFocused() && webOfer.canGoBack()) {
            webOfer.goBack();
        }
    }
}
