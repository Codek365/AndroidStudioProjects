package com.example.you_tek.lession_listview_custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by you-tek on 07/10/2015.
 */
public class ListAdapter extends ArrayAdapter<SinhVien> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public ListAdapter(Context context, int resource, List<SinhVien> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_dong_sinh_vien, null);
        }

        SinhVien p = getItem(position);

        if (p != null) {
            // Anh xa + Gan gia tri
            TextView tt11 = (TextView) v.findViewById(R.id.textViewHoTen);
            TextView tt12 = (TextView) v.findViewById(R.id.textViewNamSinh);

        }

        return v;
    }

}
