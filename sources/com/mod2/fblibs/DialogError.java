package com.mod2.fblibs;

public class DialogError extends Throwable {
    private static final long serialVersionUID = 1;
    private int mErrorCode;
    private String mFailingUrl;

    public DialogError(String str, int i2, String str2) {
        super(str);
        this.mErrorCode = i2;
        this.mFailingUrl = str2;
    }

    /* access modifiers changed from: package-private */
    public int getErrorCode() {
        return this.mErrorCode;
    }

    /* access modifiers changed from: package-private */
    public String getFailingUrl() {
        return this.mFailingUrl;
    }
}
