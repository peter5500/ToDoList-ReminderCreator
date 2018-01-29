package com.example.peter.to_do_listcreatorreminder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by peter on 2018/1/29.
 */

public class TodoListViewHolder extends RecyclerView.ViewHolder {

    TextView todoText;

    public TodoListViewHolder(View itemView) {
        super(itemView);

        todoText = itemView.findViewById(R.id.main_list_item_text);
    }
}
