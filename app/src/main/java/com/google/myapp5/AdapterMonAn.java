package com.google.myapp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.PrivateKey;
import java.util.List;

public class AdapterMonAn extends BaseAdapter {

    private Context context;
    private int layout;
    private List<MonAn> araylist;

    public AdapterMonAn(Context context, int layout, List<MonAn> araylist) {
        this.context = context;
        this.layout = layout;
        this.araylist = araylist;
    }

    @Override
    public int getCount() {
        return araylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        MonAn monAn =araylist.get(position);
        TextView textV1 = convertView.findViewById(R.id.Name);
        TextView textV2 = convertView.findViewById(R.id.mota);
        ImageView imageV = convertView.findViewById(R.id.img_hinh);

        textV1.setText(monAn.getTenmon());
        textV2.setText(monAn.getMota());
        imageV.setImageResource(monAn.getHinh());

        return convertView;
    }
}
