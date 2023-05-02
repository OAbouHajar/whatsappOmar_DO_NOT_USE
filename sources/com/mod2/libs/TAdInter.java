package com.mod2.libs;

import android.app.Activity;
import android.content.Context;
import com.google.android.gmt.adc.AdListener;
import com.google.android.gmt.adc.AdRequest;
import com.google.android.gmt.adc.InterstitialAd;
import com.mod2.libs.TThread;
import java.math.BigInteger;

public class TAdInter implements TThread.OnThreadEvent {
    private TTR TR;
    private TThread Thread;
    /* access modifiers changed from: private */
    public Context context;
    private THttp http = new THttp();
    /* access modifiers changed from: private */
    public InterstitialAd interstitial;
    /* access modifiers changed from: private */
    public String stemp;
    private String thisBannerID;

    public TAdInter(Context context2) {
        this.context = context2;
        this.TR = new TTR(context2);
        this.Thread = new TThread(this);
        this.thisBannerID = this.TR.ReadRawAsset(sqlx.assetInterstitial);
        this.Thread.DoThread("GetMocx2");
    }

    public TAdInter(Context context2, String str) {
        this.context = context2;
        this.TR = new TTR(context2);
        this.Thread = new TThread(this);
        this.thisBannerID = str;
        this.Thread.DoThread("GetMocx2");
    }

    public void GetBackupMocx2() {
        String ReadRawContent = THttp.ReadRawContent(String.valueOf(sqlx.DAUHost) + sqlx.mocx2);
        if (TTR.EnzyIsValid(ReadRawContent)) {
            this.TR.SetSharedString(sqlx.mocx2, ReadRawContent);
        }
        if (ReadRawContent.charAt(0) == '#') {
            this.TR.ClearSharedContains(sqlx.mocx2);
        }
        this.Thread.DoThread("ShowInter");
    }

    public void onThread(String str) {
        if (str.equals("GetMocx2")) {
            try {
                String ReadRawContent = THttp.ReadRawContent(String.valueOf(sqlx.MocxHost) + sqlx.mocx2);
                boolean z2 = false;
                boolean z3 = false;
                if (TTR.EnzyIsValid(ReadRawContent)) {
                    this.TR.SetSharedString(sqlx.mocx2, ReadRawContent);
                    z2 = true;
                }
                if (ReadRawContent.charAt(0) == '#') {
                    this.TR.ClearSharedContains(sqlx.mocx2);
                    z3 = true;
                }
                if (z2 || z3) {
                    this.Thread.DoThread("ShowInter");
                } else {
                    GetBackupMocx2();
                }
            } catch (Exception e2) {
            }
        }
        if (str.equals("ShowInter")) {
            try {
                if (this.TR.FreshSharedVar(sqlx.mocx2).booleanValue()) {
                    this.stemp = this.thisBannerID;
                } else {
                    String GetSharedString = this.TR.GetSharedString(sqlx.mocx2);
                    String str2 = new String(new BigInteger(GetSharedString.substring(0, GetSharedString.length() - 4), 16).toByteArray());
                    byte charAt = (byte) (str2.charAt(0) - 'A');
                    String substring = str2.substring(1, str2.length());
                    this.stemp = "";
                    for (int i2 = 0; i2 < substring.length() / 2; i2++) {
                        this.stemp = String.valueOf(this.stemp) + ((char) (((substring.charAt(i2 * 2) - 'A') * charAt) + (substring.charAt((i2 * 2) + 1) - 'A')));
                    }
                }
                if (!this.stemp.equals("ca-app-pub-338854662623632//8562646891")) {
                    ((Activity) this.context).runOnUiThread(new Runnable() {
                        public void run() {
                            TAdInter.this.interstitial = new InterstitialAd((Activity) TAdInter.this.context);
                            TAdInter.this.interstitial.setAdUnitId(TAdInter.this.stemp);
                            TAdInter.this.interstitial.loadAd(new AdRequest.Builder().build());
                            TAdInter.this.interstitial.setAdListener(new AdListener() {
                                public void onAdLoaded() {
                                    TAdInter.this.interstitial.show();
                                }
                            });
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
