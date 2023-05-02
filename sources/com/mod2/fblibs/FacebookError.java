package com.mod2.fblibs;

public class FacebookError extends Throwable {
    private static final long serialVersionUID = 1;
    private int mErrorCode = 0;
    private String mErrorType;

    public FacebookError(String str) {
        super(str);
    }

    public FacebookError(String str, String str2, int i2) {
        super(str);
        this.mErrorType = str2;
        this.mErrorCode = i2;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorType() {
        return this.mErrorType;
    }
}
