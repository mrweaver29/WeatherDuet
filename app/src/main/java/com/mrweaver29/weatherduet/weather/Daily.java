package com.mrweaver29.weatherduet.weather;

/**
 * Created by Benjamin on 4/28/2015.
 */
public class Daily {
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

    public double getTempHigh() {
        return mTempHigh;
    }

    public void setTempHigh(double tempHigh) {
        mTempHigh = tempHigh;
    }

    public double getTempLow() {
        return mTempLow;
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
}
