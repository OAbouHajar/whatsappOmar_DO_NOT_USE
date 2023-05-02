package com.facebook.msys.mci;

public class DataTask {
    public final long mContentLength;
    public final String mContentUrl;
    public final long mNativeContext;
    public final String mTaskCategory;
    public final String mTaskIdentifier;
    public final int mTaskMode;
    public final int mTaskType;
    public final UrlRequest mUrlRequest;

    public DataTask(String str, String str2, int i2, UrlRequest urlRequest, String str3, long j2, int i3, long j3) {
        this.mTaskCategory = str;
        this.mTaskIdentifier = str2;
        this.mTaskType = i2;
        this.mUrlRequest = urlRequest;
        this.mContentUrl = str3;
        this.mContentLength = j2;
        this.mTaskMode = i3;
        this.mNativeContext = j3;
    }
}
