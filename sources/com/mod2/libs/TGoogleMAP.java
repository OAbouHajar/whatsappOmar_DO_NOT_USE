package com.mod2.libs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;

public class TGoogleMAP {
    private TTR TR = new TTR(this.context);
    private WebView browser;
    private Context context;

    public TGoogleMAP(Context context2) {
        this.context = context2;
    }

    public void BicyclingOff() {
        this.browser.loadUrl("javascript:BicyclingOff()");
    }

    public void BicyclingOn() {
        this.browser.loadUrl("javascript:BicyclingOn()");
    }

    public void ClearMarkers() {
        this.browser.loadUrl("javascript:ClearMarkers()");
    }

    public void ClearTrails() {
        this.browser.loadUrl("javascript:ClearTrails()");
    }

    public void DrawTrack(String str, String str2, String str3, String str4) {
        this.browser.loadUrl("javascript:DrawTrack(" + str + ", " + str2 + ", " + str3 + ", " + str4 + ", '#ff0000', 2)");
    }

    public void DrawTrack(String str, String str2, String str3, String str4, String str5, String str6) {
        this.browser.loadUrl("javascript:DrawTrack(" + str + ", " + str2 + ", " + str3 + ", " + str4 + ", '" + str5 + "', " + str6 + ")");
    }

    public void DrawTrail(String str, String str2) {
        this.browser.loadUrl("javascript:DrawTrail(" + str + ", " + str2 + ", '#ff0000', 2)");
    }

    public void DrawTrail(String str, String str2, String str3, String str4) {
        this.browser.loadUrl("javascript:DrawTrail(" + str + ", " + str2 + ", '" + str3 + "', " + str4 + ")");
    }

    public void GotoAddress(String str) {
        this.browser.loadUrl("javascript:GotoAddress('" + str + "')");
    }

    public void GotoLatLong(String str, String str2) {
        this.browser.loadUrl("javascript:GotoLatLong(" + str + ", " + str2 + ")");
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void InitGoogleMAP(String str) {
        this.browser = (WebView) this.TR.InitView(str);
        this.browser.getSettings().setJavaScriptEnabled(true);
        this.browser.loadUrl("file:///android_asset/googleMAP.html");
    }

    public void PutMarker(String str, String str2) {
        this.browser.loadUrl("javascript:PutMarker(" + str + ", " + str2 + ", '', '')");
    }

    public void PutMarker(String str, String str2, String str3, String str4) {
        this.browser.loadUrl("javascript:PutMarker(" + str + ", " + str2 + ", '" + str3 + "', '" + str4 + "')");
    }

    public void Refresh() {
        this.browser.loadUrl("file:///android_asset/googleMAP.html");
    }

    public void StreetViewOff() {
        this.browser.loadUrl("javascript:StreetViewOff()");
    }

    public void StreetViewOn() {
        this.browser.loadUrl("javascript:StreetViewOn()");
    }

    public void TrafficOff() {
        this.browser.loadUrl("javascript:TrafficOff()");
    }

    public void TrafficOn() {
        this.browser.loadUrl("javascript:TrafficOn()");
    }
}
