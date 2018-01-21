package com.example.peter.to_do_listcreatorreminder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.peter.to_do_listcreatorreminder.models.Todo;

import java.util.List;

/**
 * Created by peter on 2018/1/20.
 */


public class TodoListAdapter extends BaseAdapter {
    private Context context;
    private List<Todo> data;

    public TodoListAdapter(@NonNull Context context, @NonNull List<Todo> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        Todo todo = data.get(position);
        View view = LayoutInflater.from(context).inflate(R.layout.main_list_item, null);
        ((TextView) view.findViewById(R.id.main_list_item_text)).setText(todo.text);
        return view;
    }
}
