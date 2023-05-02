package com.mod2.libs;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gmt.adc.AdRequest;
import com.google.android.gmt.adc.AdSize;
import com.google.android.gmt.adc.AdView;
import com.mod2.libs.TThread;
import java.math.BigInteger;

public class TAd extends TLinearLayout implements TThread.OnThreadEvent {
    private TTR TR;
    private TThread Thread;
    /* access modifiers changed from: private */
    public Context context;
    private THttp http = new THttp();
    /* access modifiers changed from: private */
    public String stemp;
    private String thisBannerID;

    public TAd(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        if (!isInEditMode()) {
            this.context = context2;
            this.TR = new TTR(context2);
            this.Thread = new TThread(this);
            this.thisBannerID = this.TR.ReadRawAsset(sqlx.assetBanner);
            this.Thread.DoThread("GetMocx1");
        }
    }

    public TAd(Context context2, AttributeSet attributeSet, String str) {
        super(context2, attributeSet);
        if (!isInEditMode()) {
            this.context = context2;
            this.TR = new TTR(context2);
            this.Thread = new TThread(this);
            this.thisBannerID = str;
            this.Thread.DoThread("GetMocx1");
        }
    }

    public void GetBackupMocx1() {
        String ReadRawContent = THttp.ReadRawContent(String.valueOf(sqlx.DAUHost) + sqlx.mocx1);
        if (TTR.EnzyIsValid(ReadRawContent)) {
            this.TR.SetSharedString(sqlx.mocx1, ReadRawContent);
        }
        if (ReadRawContent.charAt(0) == '#') {
            this.TR.ClearSharedContains(sqlx.mocx1);
        }
        this.Thread.DoThread("ShowBanner");
    }

    public void onThread(String str) {
        if (str.equals("GetMocx1")) {
            try {
                String ReadRawContent = THttp.ReadRawContent(String.valueOf(sqlx.MocxHost) + sqlx.mocx1);
                boolean z2 = false;
                boolean z3 = false;
                if (TTR.EnzyIsValid(ReadRawContent)) {
                    this.TR.SetSharedString(sqlx.mocx1, ReadRawContent);
                    z2 = true;
                }
                if (ReadRawContent.charAt(0) == '#') {
                    this.TR.ClearSharedContains(sqlx.mocx1);
                    z3 = true;
                }
                if (z2 || z3) {
                    this.Thread.DoThread("ShowBanner");
                } else {
                    GetBackupMocx1();
                }
            } catch (Exception e2) {
            }
        }
        if (str.equals("ShowBanner")) {
            try {
                if (this.TR.FreshSharedVar(sqlx.mocx1).booleanValue()) {
                    this.stemp = this.thisBannerID;
                } else {
                    String GetSharedString = this.TR.GetSharedString(sqlx.mocx1);
                    String str2 = new String(new BigInteger(GetSharedString.substring(0, GetSharedString.length() - 4), 16).toByteArray());
                    byte charAt = (byte) (str2.charAt(0) - 'A');
                    String substring = str2.substring(1, str2.length());
                    this.stemp = "";
                    for (int i2 = 0; i2 < substring.length() / 2; i2++) {
                        this.stemp = String.valueOf(this.stemp) + ((char) (((substring.charAt(i2 * 2) - 'A') * charAt) + (substring.charAt((i2 * 2) + 1) - 'A')));
                    }
                }
                if (!this.stemp.equals("ca-app-pub-338854662623632//7085913698")) {
                    ((Activity) this.context).runOnUiThread(new Runnable() {
                        public void run() {
                            AdView adView = new AdView(TAd.this.context);
                            adView.setAdSize(AdSize.SMART_BANNER);
                            adView.setAdUnitId(TAd.this.stemp);
                            TAd.this.addView(adView);
                            adView.loadAd(new AdRequest.Builder().build());
                        }
                    });
                }
                this.Thread.DoThread("InsDAU");
            } catch (Exception e3) {
            }
        }
        if (str.equals("InsDAU")) {
            try {
                String trim = this.TR.GetDate().trim();
                if (!trim.equals(this.TR.GetSharedString(sqlx.daudate).trim())) {
                    this.http.Host = sqlx.DAUHost;
                    THttp tHttp = this.http;
                    tHttp.Host = String.valueOf(tHttp.Host) + sqlx.dauFolder;
                    this.http.CreateHttpParams();
                    this.http.AddHttpParam("pid", this.context.getPackageName());
                    this.http.Post();
                    if (this.http.Posted) {
                        this.TR.SetSharedString(sqlx.daudate, trim);
                    }
                }
            } catch (Exception e4) {
            }
        }
    }
}
