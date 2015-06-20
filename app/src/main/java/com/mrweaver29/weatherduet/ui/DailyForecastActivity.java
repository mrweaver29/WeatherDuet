package com.mrweaver29.weatherduet.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.mrweaver29.weatherduet.R;
import com.mrweaver29.weatherduet.adapters.DayAdapter;
import com.mrweaver29.weatherduet.weather.Daily;

import java.util.Arrays;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class DailyForecastActivity extends Activity {

    private Daily[] mDays;

    private ColorWheel mColorWheel = new ColorWheel();

    @InjectView(android.R.id.list) ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);
        ButterKnife.inject(this);

        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.dailyRelativeLayout);
        int color1 = mColorWheel.getColor1();
        int color2 = mColorWheel.getColor2();
        int comboColor[] = { color1, color2 };

        GradientDrawable gradientDrawable = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM, comboColor);
        relativeLayout.setBackground(gradientDrawable);

        Intent intent = getIntent();
        Parcelable[] parcelables = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcelables, parcelables.length, Daily[].class);


        DayAdapter adapter = new DayAdapter(this, mDays);
        mListView.setAdapter(adapter);

    }
}
