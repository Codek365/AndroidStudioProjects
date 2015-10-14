package com.example.hoang.baitapcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Hoang on 10/9/2015.
 */
public class ListAdapter extends ArrayAdapter<ConThu> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public ListAdapter(Context context, int resource, List<ConThu> items) {
        super(context, resource, items);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_dong_conthu, null);
        }

        ConThu p = getItem(position);

        if (p != null) {
            // Anh xa + Gan gia tri
            TextView Ten = (TextView) v.findViewById(R.id.textViewTenConThu);
            Ten.setText(p.TenConThu);

            final ImageView imgv = (ImageView) v.findViewById(R.id.imageViewHinh);
            Picasso.with(getContext()).load("http://khoapham.vn/images/zoo/4.png").resize(100, 100).centerCrop().into(imgv);
        }


        return v;
    }

}

