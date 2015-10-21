package com.example.you_tek.mp3pl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by you-tek on 21/10/2015.
 */
public class ListAdapter extends ArrayAdapter<Mp3> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public ListAdapter(Context context, int resource, List<Mp3> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_mp3_line, null);
        }

        Mp3 p = getItem(position);

        if (p != null) {
            // Anh xa + Gan gia tri
            TextView title = (TextView) v.findViewById(R.id.textViewTitle);
            TextView singer = (TextView) v.findViewById(R.id.textViewSinger);
            TextView author = (TextView) v.findViewById(R.id.textViewAuthor);
            TextView image  = (TextView) v.findViewById(R.id.imageViewImage);
            TextView link  = (TextView) v.findViewById(R.id.buttonLink);

            title.setText(p.Title);
            singer.setText(p.Singer);
            author.setText(p.Author);
            image.setText(p.Image);
            link.setText(p.Link);

        }

        return v;
    }

}