package com.example.android.miwok;

/**
 * Created by alexeyk on 21/03/2018.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defTranslateIn, String mivokTranslateIn){
        mDefaultTranslation = defTranslateIn;
        mMiwokTranslation = mivokTranslateIn;
    }

    public String getmDefaultTranslation(){
        return  mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

}
