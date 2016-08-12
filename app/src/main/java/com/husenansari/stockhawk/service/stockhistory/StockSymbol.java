package com.husenansari.stockhawk.service.stockhistory;

import android.os.Parcel;
import android.os.Parcelable;


public class StockSymbol implements Parcelable {
    public String date;
    public double close;

    public StockSymbol(String date, double close) {
        this.date = date;
        this.close = close;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.date);
        dest.writeDouble(this.close);
    }

    public StockSymbol() {
    }

    protected StockSymbol(Parcel in) {
        this.date = in.readString();
        this.close = in.readDouble();
    }

    public static final Creator<StockSymbol> CREATOR = new Creator<StockSymbol>() {
        @Override
        public StockSymbol createFromParcel(Parcel source) {
            return new StockSymbol(source);
        }

        @Override
        public StockSymbol[] newArray(int size) {
            return new StockSymbol[size];
        }
    };
}
