package com.mrweaver29.weatherduet.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import com.mrweaver29.weatherduet.R;
import com.mrweaver29.weatherduet.adapters.DayAdapter;
import com.mrweaver29.weatherduet.weather.Daily;

import java.util.Arrays;

public class DailyForecastActivity extends ListActivity {

    private Daily[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length, Daily[].class);

        DayAdapter adapter = new DayAdapter(this, mDays);
        setListAdapter(adapter);
    }
}
