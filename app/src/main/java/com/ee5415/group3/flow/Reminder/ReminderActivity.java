package com.ee5415.group3.flow.Reminder;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.ee5415.group3.flow.AppDefault.AppDefaultActivity;
import com.ee5415.group3.flow.R;

public class ReminderActivity extends AppDefaultActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected int contentViewLayoutRes() {
        return R.layout.reminder_layout;
    }

    @NonNull
    @Override
    protected ReminderFragment createInitialFragment() {
        return ReminderFragment.newInstance();
    }


}
