package com.example.Miwok;

public class Word {

    private String mDefaultTranslations;

    private String mMiwokTranslations;

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
}
