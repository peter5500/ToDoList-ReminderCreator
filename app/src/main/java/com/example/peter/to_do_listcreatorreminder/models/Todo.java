package com.example.peter.to_do_listcreatorreminder.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;
import java.util.UUID;

/**
 * Created by peter on 2018/1/20.
 */

public class Todo implements Parcelable{
    public String id;

    public String text;

    public boolean done;

    public Date remindDate;

    public Todo(String text, Date remindDate) {
        this.id = UUID.randomUUID().toString();
        this.text = text;
        this.done = false;
        this.remindDate = remindDate;
    }

    protected Todo(Parcel in) {
        id = in.readString();
        text = in.readString();
        done = in.readByte() != 0;

        long date = in.readLong();
        remindDate = date == 0 ? null : new Date(date);
    }

    public static final Creator<Todo> CREATOR = new Creator<Todo>() {
        @Override
        public Todo createFromParcel(Parcel in) {
            return new Todo(in);
        }

        @Override
        public Todo[] newArray(int size) {
            return new Todo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(text);
        parcel.writeByte((byte) (done ? 1 : 0));
        parcel.writeLong(remindDate != null ? remindDate.getTime() : 0);
    }
}
