package com.example.jinhui.mediarecord;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MAdapter extends BaseAdapter {
	private LayoutInflater inflater;
	private Context mContext;
	private ArrayList<String> list;
	private TextView tv;

	public MAdapter(Context c, ArrayList<String> i) {
		this.mContext = c;
		this.list = i;
		inflater = LayoutInflater.from(c);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		convertView = inflater.inflate(R.layout.item, null);
		tv = (TextView) convertView.findViewById(R.id.tv);
		tv.setText(list.get(position));
		return convertView;
	}
}
