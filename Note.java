package com.example.caafs.notetaker;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Note {
    private long date;
    private String title;
    private String input;

    public Note(long date, String title, String input) {
        this.date = date;
        this.title = title;
        this.input = input;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public long getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getInput() {
        return input;
    }
    public String getDateAsString(Context context) {
        SimpleDateFormat d = new SimpleDateFormat("dd/mm/yyyy"
                , context.getResources().getConfiguration().locale);
        d.setTimeZone(TimeZone.getDefault());
        return d.format(new Date(date));
    }
}
