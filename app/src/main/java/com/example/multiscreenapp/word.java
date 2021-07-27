package com.example.multiscreenapp;

/**
 * {@link word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;
    private int mImageResourceID=NO_IMAGE_PRVIDED;
    private static final int NO_IMAGE_PRVIDED=-1;
    private int mAudioResourceId;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     *
     *
     * @param imageResource is the word in the image
     *
     *
     */

    public word(String defaultTranslation, String miwokTranslation,int imageResource,int aidioResouvce) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID=imageResource;
        mAudioResourceId=aidioResouvce;
    }

    public word(String defaultTranslation, String miwokTranslation,int aidioResouvce) {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=aidioResouvce;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmImageResource() { return mImageResourceID; }
    public boolean hasImage()
    {
        return mImageResourceID!=NO_IMAGE_PRVIDED;
    }
    public int getmAudioResourceId()
    {
        return mAudioResourceId;
    }
}