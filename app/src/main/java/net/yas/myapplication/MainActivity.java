package net.yas.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.URLUtil;

public class MainActivity extends AppCompatActivity {

    //@Override
   // protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);

     //   startActivity(intent);
   // }
    private void selectimage(){
        final CharSequence [] items={"take photo","Gallary","cancel"};
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Add photo");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                boolean result=Utility.checkPermission(MainActivity.this);
                if (items[item].equals("Take Photo"))
                    {
                    userChoosenTask="take photo";
                        if (result)
                            cameraIntent();
                }
                else if (items[item].equals("Gallary")){
                    userChoosenTask="Gallary";
                    if (result)
                        galleryIntent();

                }
                else if (items[item].equals("cancel")){
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }
    public class Utility{
        public static final int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE = 123;
        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
        public static boolean checkPermission(final Context context)
        {
            int currentAPIVersion = Build.VERSION.SDK_INT;
            if(currentAPIVersion>=android.os.Build.VERSION_CODES.M)
            {
                if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.READ_EXTERNAL_STORAGE)) {
                        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                        alertBuilder.setCancelable(true);
                        alertBuilder.setTitle("Permission necessary");
                        alertBuilder.setMessag
                                - See more at: http://www.theappguruz.com/blog/android-take-photo-camera-gallery-code-sample#sthash.EL8zrQDD.dpuf
    }
}

