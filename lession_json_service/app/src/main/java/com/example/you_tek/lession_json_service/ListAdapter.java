package com.example.you_tek.lession_json_service;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by you-tek on 16/10/2015.
 */
public class ListAdapter extends ArrayAdapter<SanPham> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public ListAdapter(Context context, int resource, List<SanPham> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_dong_ssan_pham, null);
        }

        SanPham p = getItem(position);

        if (p != null) {
            // Anh xa + Gan gia tri
            TextView ten = (TextView) v.findViewById(R.id.textViewHoTen);
            TextView gia = (TextView) v.findViewById(R.id.textViewGia);
            ImageView hinh = (ImageView) v.findViewById(R.id.imageViewHinh);

        }

        return v;
    }

}

