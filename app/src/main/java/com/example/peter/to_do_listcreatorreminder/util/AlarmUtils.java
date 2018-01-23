package com.example.peter.to_do_listcreatorreminder.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import com.example.peter.to_do_listcreatorreminder.AlarmReceiver;
import com.example.peter.to_do_listcreatorreminder.TodoEditActivity;
import com.example.peter.to_do_listcreatorreminder.models.Todo;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by peter on 2018/1/20.
 */

public class AlarmUtils {
    public static void setAlarm(@NonNull Context context, @NonNull Todo todo) {
        Calendar c = Calendar.getInstance(); // c will contain the current time
        if (todo.remindDate.compareTo(c.getTime()) < 0) { // this statement checks if date is smaller than current time
            // we only fire alarm when date is in the future
            return;
        }

        AlarmManager alarmMgr = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);

        Intent intent = new Intent(context, AlarmReceiver.class);
        intent.putExtra(TodoEditActivity.KEY_TODO, todo);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context,
                0,
                intent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        alarmMgr.set(AlarmManager.RTC_WAKEUP, // will wake up the device
                todo.remindDate.getTime(),
                alarmIntent);
    }
}
