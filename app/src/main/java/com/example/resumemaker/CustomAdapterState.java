package com.example.resumemaker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapterState extends BaseAdapter {
    Context context;
    String[] stateName;
    public CustomAdapterState(Context appContext, String[] stateName) {
        this.context=appContext;
        this.stateName=stateName;
    }

    @Override
    public int getCount() {
        return stateName.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.spinner_itme_state, null);
        TextView stateTxt = view.findViewById(R.id.stateTxt);
        stateTxt.setText(stateName[i]);
        return view;
    }
}
