package com.ms_wit.pnp;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String productId = getIntent().getStringExtra(MainActivity.PNP_ID);
        final PnP pnP = DataProvider.pnpMap.get(productId);

        TextView tv = (TextView) findViewById(R.id.nameText);
        tv.setText(pnP.getName());

        TextView descView = (TextView) findViewById(R.id.descriptionText);
        descView.setText(pnP.getDescription());

        ImageView iv = (ImageView) findViewById(R.id.imageView);
        Bitmap bitmap = getBitmapFromAsset(pnP.getPnpId());
        iv.setImageBitmap(bitmap);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private Bitmap getBitmapFromAsset(String pnpId) {
        AssetManager assetManager = getAssets();
        InputStream stream = null;

        try {
            stream = assetManager.open(pnpId + ".png");
            return BitmapFactory.decodeStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
