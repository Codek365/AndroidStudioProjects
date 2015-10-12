package com.example.you_tek.lession_listview_custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static com.example.you_tek.lession_listview_custom.R.id.textViewHoa;

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
            TextView tt1 = (TextView) v.findViewById(R.id.textViewHoTen);
            tt1.setText(p.HoTen);
            TextView tt2 = (TextView) v.findViewById(R.id.textViewToan);
            tt1.setText(String.valueOf(p.Toan));
            TextView tt3 = (TextView) v.findViewById(R.id.textViewLy);
            tt1.setText(String.valueOf(p.Ly));
            TextView tt4 = (TextView) v.findViewById(textViewHoa);
            tt1.setText(String.valueOf(p.Hoa));

        }

        return v;
    }

}
