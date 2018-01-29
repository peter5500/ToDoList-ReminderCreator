package com.example.peter.to_do_listcreatorreminder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.peter.to_do_listcreatorreminder.models.Todo;

import java.util.List;

/**
 * Created by peter on 2018/1/20.
 */


public class OldTodoListAdapter extends BaseAdapter {
    private Context context;
    private List<Todo> data;

    public OldTodoListAdapter(@NonNull Context context, @NonNull List<Todo> data) {
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
    public View getView(int position, View convertView, ViewGroup parent) {
        //use view holder to avoid find view every time
        ViewHolder vh;

//        //generate interface, waste memory cache
//        View view = LayoutInflater.from(context).inflate(R.layout.main_list_item, null);

        //create view only if the view is not enough, or will just edit the old view and display it
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.main_list_item, parent, false);
             vh = new ViewHolder();
             //only find once
            vh.todoText = (TextView) convertView.findViewById(R.id.main_list_item_text);
            vh.doneCheckbox = (CheckBox) convertView.findViewById(R.id.main_list_item_check);
            //cache the view holder
            convertView.setTag(vh);
        } else {
            //use the cached view holder
            vh = (ViewHolder) convertView.getTag();
        }


        final Todo todo = data.get(position);
        vh.todoText.setText(todo.text);
        vh.doneCheckbox.setChecked(todo.done);
        return convertView;

//        //edit the old view and become a new one, not efficient since need to findview every time
//        ((TextView) convertView.findViewById(R.id.main_list_item_text)).setText(todo.text);
//        return convertView;
    }

    //wrapper class
    private static class ViewHolder{
        TextView todoText;
        CheckBox doneCheckbox;
    }
}
