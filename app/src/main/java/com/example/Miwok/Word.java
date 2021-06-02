package com.example.Miwok;

import com.example.miwok.R;

public class Word {

    private String mDefaultTranslations;

    private String mMiwokTranslations;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslations, String mMiwokTranslations, int mImageResourceId) {
        this.mDefaultTranslations = mDefaultTranslations;
        this.mMiwokTranslations = mMiwokTranslations;
        this.mImageResourceId = mImageResourceId;
    }

    public Word(String DefaultTranslations, String MiwokTranslations) {
        mDefaultTranslations = DefaultTranslations;
        mMiwokTranslations = MiwokTranslations;
    }

    public String getmDefaultTranslations() {
        return mDefaultTranslations;
    }

    public String getmMiwokTranslations() {
        return mMiwokTranslations;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
