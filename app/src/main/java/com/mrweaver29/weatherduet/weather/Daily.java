package com.mrweaver29.weatherduet.weather;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Benjamin on 4/28/2015.
 */
public class Daily implements Parcelable {
    private long mTime;
    private String mSummary;
    private double mTempHigh;
    private double mTempLow;
    private String mIcon;
    private String mTimezone;

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public int getTempHigh() {
        return (int)Math.round(mTempHigh);
    }

    public void setTempHigh(double tempHigh) {
        mTempHigh = tempHigh;
    }

    public int getTempLow() {
        return (int)Math.round(mTempLow);
    }

    public void setTempLow(double tempLow) {
        mTempLow = tempLow;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }

    public int getIconId() {
        return  Forecast.getIconId(mIcon);
    }

    public String getDayOfTheWeek() {
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
        formatter.setTimeZone(TimeZone.getTimeZone(mTimezone));
        Date dateTime = new Date(mTime * 1000);
        return formatter.format(dateTime);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(mTime);
        dest.writeString(mSummary);
        dest.writeDouble(mTempHigh);
        dest.writeDouble(mTempLow);
        dest.writeString(mIcon);
        dest.writeString(mTimezone);
    }

    private Daily(Parcel in) {
        mTime = in.readLong();
        mSummary = in.readString();
        mTempHigh = in.readDouble();
        mTempLow = in.readDouble();
        mIcon = in.readString();
        mTimezone = in.readString();
    }

    public Daily() {}

    public static final Creator<Daily> CREATOR = new Creator<Daily>() {
        @Override
        public Daily createFromParcel(Parcel source) {
            return new Daily(source);
        }

        @Override
        public Daily[] newArray(int size) {
            return new Daily[size];
        }
    };


}











