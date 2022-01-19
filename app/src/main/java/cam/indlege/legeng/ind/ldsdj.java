package cam.indlege.legeng.ind;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

public class ldsdj extends WebChromeClient {

   @SuppressLint("StaticFieldLeak")
   public static Offff offff;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> filePath,
                                     FileChooserParams fileChooserParams) {

        if (offff.kinjnw != null) {
            offff.kinjnw.onReceiveValue(null);
        }
        offff.kinjnw = filePath;
        Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
        contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
        contentSelectionIntent.setType("*/*");
        Intent[] intentArray = new Intent[0];
        Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
        chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
        chooserIntent.putExtra(Intent.EXTRA_TITLE, MainActivity.ddddeee("U2VsZWN0IE9wdGlvbjo="));
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
        offff.startActivityForResult(chooserIntent, 1);
        return true;
    }
}
