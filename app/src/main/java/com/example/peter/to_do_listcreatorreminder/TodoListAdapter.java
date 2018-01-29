package com.example.peter.to_do_listcreatorreminder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.peter.to_do_listcreatorreminder.models.Todo;

import java.util.List;

/**
 * Created by peter on 2018/1/29.
 */

public class TodoListAdapter extends RecyclerView.Adapter{

    private List<Todo> data;

    public TodoListAdapter(List<Todo> data) {
        this.data = data;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_list_item, parent,false);
        return new TodoListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Todo todo = data.get(position);
        ((TodoListViewHolder) holder).todoText.setText(todo.text);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
