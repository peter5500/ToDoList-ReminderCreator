package com.example.peter.to_do_listcreatorreminder.util;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by peter on 2018/1/19.
 */

public class ToDoListAdapter extends BaseAdapter {
    private Context context;
    private List<Todo> data;

    public ToDoListAdapter(@NonNull Context context, @NonNull List<Todo> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
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
        return null;
    }
}
