package com.ms_wit.pnp;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PnPListAdapter extends ArrayAdapter<PnP>{

    private List<PnP> pnPs;

    public PnPListAdapter(Context context, int resource, List<PnP> objects) {
        super(context, resource, objects);
        pnPs = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).
                    inflate(R.layout.list_item, parent, false);
        }

        PnP pnP = pnPs.get(position);

        TextView nameText = (TextView) convertView.findViewById(R.id.nameText);
        nameText.setText(pnP.getName());


        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView);
        Bitmap bitmap = getBitmapFromAsset(pnP.getPnpId());
        iv.setImageBitmap(bitmap);

        return convertView;
    }

    private Bitmap getBitmapFromAsset(String productId) {
        AssetManager assetManager = getContext().getAssets();
        InputStream stream = null;

        try {
            stream = assetManager.open(productId + ".png");
            return BitmapFactory.decodeStream(stream);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
