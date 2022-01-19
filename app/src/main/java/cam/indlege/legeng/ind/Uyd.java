package cam.indlege.legeng.ind;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.widget.Button;

import androidx.annotation.RequiresApi;

public class Uyd {

    public void uyd(Button buttonS, Button buttonP,Il il){

        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                il.startActivity(new Intent(il.getApplicationContext(),MainActivity.class));
                il.finishAffinity();
            }
        });

        buttonP.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                Intent dus = new Intent(il.getApplicationContext(),Poliii.class);
                dus.putExtra("wes",MainActivity.ddddeee("aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49Nk1BY1hOT0xIVGo4V084b2l3UDlEd1M2UWNTY29id0I="));
                il.startActivity(dus);
            }
        });
    }
}
