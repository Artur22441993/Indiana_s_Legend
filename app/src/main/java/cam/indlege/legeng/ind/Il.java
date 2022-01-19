package cam.indlege.legeng.ind;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class Il extends Activity {

    Button gdfgf;
    Button kdjdb;
    ProgressBar kfbd;
    int df = 0;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.il);
        getWindow().addFlags(1024);
        gdfgf = findViewById(R.id.startG);
        kdjdb = findViewById(R.id.startP);
        kfbd = findViewById(R.id.progressBar);
        Ldf.il = this;

        if (MainActivity.ded(Il.this) == df){
            O.oo(Il.this);
        }else {
            kdjdb.setVisibility(View.VISIBLE);
            gdfgf.setVisibility(View.VISIBLE);
            kfbd.setVisibility(View.INVISIBLE);
            Uyd uyd = new Uyd();
            uyd.uyd(gdfgf, kdjdb,Il.this);
        }
    }

}
