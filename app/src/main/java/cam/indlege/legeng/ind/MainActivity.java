package cam.indlege.legeng.ind;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.onesignal.OneSignal;

import java.util.Base64;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1,imageView2,imageView3,imageViewSpin;
    private TextView textView;
    private Handler handler;
    int n = 0;
    int p = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        textView = findViewById(R.id.textView);
        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        imageView3 = findViewById(R.id.imageView4);
        imageViewSpin = findViewById(R.id.imageView5);

        handler = new Handler();


        imageViewSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        myRandom();

                        Random random = new Random();
                        int a = random.nextInt(4);
                        for (int i = 0; i < a; i++) {
                            if (a == 0) {
                                imageView1.setImageResource(R.drawable.ic_slot_1);
                            }
                            if (a == 1) {
                                imageView1.setImageResource(R.drawable.ic_slot_2);
                            }
                            if (a == 2) {

                            }
                            imageView1.setImageResource(R.drawable.ic_slot_3);
                            if (a == 3) {
                                imageView1.setImageResource(R.drawable.ic_slot_4);
                            }
                        }

                        n++;
                        if (n != 40) {
                            handler.postDelayed(this::run, 10);
                        } else {
                            n = 0;
                        }

                    }

                });

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        myRandom();

                        Random random = new Random();
                        int a = random.nextInt(4);
                        for (int i = 0; i < a; i++) {
                            if (a == 0) {
                                imageView2.setImageResource(R.drawable.ic_slot_1);
                            }
                            if (a == 1) {
                                imageView2.setImageResource(R.drawable.ic_slot_2);
                            }
                            if (a == 2) {
                                imageView2.setImageResource(R.drawable.ic_slot_3);
                            }

                            if (a == 3) {
                                imageView2.setImageResource(R.drawable.ic_slot_4);
                            }
                        }

                        n++;
                        if (n != 40) {
                            handler.postDelayed(this::run, 10);
                        } else {
                            n = 0;
                        }

                    }

                });


                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        myRandom();

                        Random random = new Random();
                        int a = random.nextInt(4);
                        for (int i = 0; i < a; i++) {
                            if (a == 0) {
                                imageView3.setImageResource(R.drawable.ic_slot_1);
                            }
                            if (a == 1) {
                                imageView3.setImageResource(R.drawable.ic_slot_2);
                            }
                            if (a == 2) {
                                imageView3.setImageResource(R.drawable.ic_slot_3);
                            }

                            if (a == 3) {
                                imageView3.setImageResource(R.drawable.ic_slot_4);
                            }
                        }

                        n++;
                        if (n != 40) {
                            handler.postDelayed(this::run, 10);
                        } else {
                            n = 0;
                            imageView1.invalidate();
                            BitmapDrawable drawable = (BitmapDrawable) imageView1.getDrawable();
                            Bitmap bitmapImage1 = drawable.getBitmap();
                            Log.d("ssss", bitmapImage1+"");
                            imageView2.invalidate();
                            BitmapDrawable drawable2 = (BitmapDrawable) imageView2.getDrawable();
                            Bitmap bitmapImage2 = drawable2.getBitmap();
                            Log.d("ssss", bitmapImage2+"");

                            imageView3.invalidate();
                            BitmapDrawable drawable3 = (BitmapDrawable) imageView3.getDrawable();
                            Bitmap bitmapImage3 = drawable3.getBitmap();
                            Log.d("ssss", bitmapImage3+"");

                            if (bitmapImage1 == bitmapImage2|| bitmapImage1 == bitmapImage3 || bitmapImage2 == bitmapImage3){
                                handler.post(new Runnable() {
                                    @Override
                                    public void run() {

                                        int r = (int) imageView1.getRotation();
                                        imageView1.setRotation(r+5);

                                        int t = (int) imageView2.getRotation();
                                        imageView2.setRotation(t+5);

                                        int y = (int) imageView3.getRotation();
                                        imageView3.setRotation(y+5);

                                        p++;
                                        if (p != 40){
                                            handler.postDelayed(this::run,10);
                                        }else {
                                            p = 0;
                                        }
                                    }
                                });
                            }
                        }

                    }

                });



            }

        });



    }


            private void myRandom() {
                int min = 600;
                int max = 800;
                int diff = max - min;
                Random random = new Random();
                int i = random.nextInt(diff + 1);
                i += min;
                textView.setText("" + i);
            }

   @RequiresApi(api = Build.VERSION_CODES.O)
   public static String ddddeee(String ssse){
       Base64.Decoder kdsa = Base64.getDecoder();
       String kdhiadq = new String(kdsa.decode(ssse));
       return kdhiadq;
   }

   public static int ded (Il il){
       return   Settings.Secure.getInt(il.getContentResolver(), Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
   }

   @RequiresApi(api = Build.VERSION_CODES.O)
   public static String kfdodk(String iunds, String kjjf, String kfjd, String lojkcd){


       String jdfs;
       String kds;
       String kmmds;
       String kdnd;
       String qqw;
       String poi;
       String oiub;

       String[] oinhq = iunds.split("::");
       try {
           jdfs = oinhq[0];
       }catch (Exception e){
           jdfs = "";
       }
       try {
           kds = oinhq[1];
       }catch (Exception e){
           kds = "";
       }

       try {
           kmmds = oinhq[2];
       }catch (Exception e){
           kmmds = "";

       }

       try {
           kdnd = oinhq[3];
       }catch (Exception e){
           kdnd = "";
       }

       try {
           qqw = oinhq[4];
       }catch (Exception e){
           qqw = "";
       }


       try {
           poi = oinhq[5];
       }catch (Exception e){
           poi = "";
       }

       try {
           oiub = oinhq[6];
       }catch (Exception e){
           oiub = "";
       }

       OneSignal.sendTag(MainActivity.ddddeee("c3ViX2FwcA=="),kds);



       String kjiqxz [] = {jdfs,MainActivity.ddddeee("P2J1bmRsZT0=") , kjjf , MainActivity.ddddeee("JmFkX2lkPQ==") , kfjd , MainActivity.ddddeee("JmFwcHNfaWQ9") , lojkcd ,
               MainActivity.ddddeee("JnN1YjY9") , kds ,
               MainActivity.ddddeee("JnN1Yjc9") , kmmds ,
               MainActivity.ddddeee("JnN1YjI9") , kdnd ,
               MainActivity.ddddeee("JnN1YjM9") , qqw ,
               MainActivity.ddddeee("JnN1YjQ9") , poi ,
               MainActivity.ddddeee("JnN1YjU9") , oiub};
       StringBuilder juudaq = new StringBuilder();
       for (int i = 0; i< kjiqxz.length; i++){
           juudaq.append(kjiqxz[i]);
       }

       return  juudaq.toString();

   }

}