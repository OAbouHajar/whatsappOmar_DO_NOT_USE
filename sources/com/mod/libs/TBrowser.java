package com.mod.libs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import com.facebook.msys.mci.FileManager;

public class TBrowser extends WebView implements View.OnClickListener {
    private TTR TR;
    private String imgFile;

    public TBrowser(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TR = new TTR(context);
        clearCache(true);
        clearHistory();
        setBackgroundColor(0);
        String GetSharedString = this.TR.GetSharedString(TRConst.SignbotFileName);
        if (!this.TR.FileExists(GetSharedString).booleanValue() || GetSharedString.equals("")) {
            this.imgFile = "file:///android_asset/welcome.gif";
        } else {
            this.imgFile = FileManager.FILE_SCHEMA + GetSharedString;
        }
        loadDataWithBaseURL("", "<html><body style='margin: 0; padding: 0'><center><img id='imgTarget' src='" + this.imgFile + "' /></center></body><style>#imgTarget{width: 100%; height: 100%;position: relative;}</style></html>", "text/html", "text/html", "");
        setOnClickListener(this);
    }

    public void onClick(View view) {
    }
}
