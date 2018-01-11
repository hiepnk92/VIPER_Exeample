package com.example.hiepnk.viper;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by hiepnk on 1/11/2018.
 */

public class TheStory extends RealmObject {


    @PrimaryKey
    private int id;
    private String title;
    private int part;
    private int numberChapter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public int getNumberChapter() {
        return numberChapter;
    }

    public void setNumberChapter(int numberChapter) {
        this.numberChapter = numberChapter;
    }
}
