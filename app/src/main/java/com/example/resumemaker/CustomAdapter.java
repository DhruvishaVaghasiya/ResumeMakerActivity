package com.example.resumemaker;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] cityName;

    public CustomAdapter(Context appContext,String[] cityName)
    {
        this.context=appContext;
        this.cityName=cityName;
    }

    @Override
    public int getCount() {
        return cityName.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.spinner_itme, null);
        TextView cityTxt = view.findViewById(R.id.cityTxt);
        cityTxt.setText(cityName[position]);
        return view;
    }
}
