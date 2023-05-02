package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.obwhatsapp.videoplayback.YoutubePlayerTouchOverlay;
import com.whatsapp.util.Log;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.37g  reason: invalid class name and case insensitive filesystem */
public class C610837g extends AnonymousClass29D {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 1;
    public int A03 = -1;
    public long A04 = -9223372036854775807L;
    public AnonymousClass4Vk A05;
    public JSONObject A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public Bitmap[] A09;
    public final Context A0A;
    public final ViewGroup A0B;
    public final WebView A0C;
    public final C14870pt A0D;
    public final C14710pd A0E;
    public final C46202Cw A0F;
    public final YoutubePlayerTouchOverlay A0G;
    public final String A0H;

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x008a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C610837g(android.content.Context r12, android.graphics.Bitmap r13, X.C19980zJ r14, X.C14870pt r15, X.C14710pd r16, X.C24551Gj r17, X.C16740tZ r18, X.C46202Cw r19, java.lang.String r20, int r21) {
        /*
            r11 = this;
            r11.<init>()
            r2 = 0
            r11.A01 = r2
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r11.A04 = r0
            r11.A07 = r2
            r11.A08 = r2
            r0 = -1
            r11.A03 = r0
            r3 = 1
            r11.A02 = r3
            r11.A00 = r2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x021a
            r4 = r16
            r11.A0E = r4
            r11.A0A = r12
            r11.A0D = r15
            r5 = r19
            r11.A0F = r5
            X.0tM r1 = X.C16620tM.A01
            r0 = 2200(0x898, float:3.083E-42)
            boolean r0 = r4.A0E(r1, r0)
            if (r0 == 0) goto L_0x0068
            X.4FN r7 = new X.4FN
            r7.<init>(r11)
            r8 = r18
            byte[] r0 = r8.A1F
            r9 = r17
            if (r0 != 0) goto L_0x0060
            X.0sq r6 = r9.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            X.1Vw r0 = r8.A11
            java.lang.String r0 = r0.A01
            r1.append(r0)
            java.lang.String r0 = "counterAbuseTokenUtils"
            java.lang.String r4 = X.AnonymousClass000.A0h(r0, r1)
            r1 = 22
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r9, r8, r7, r1)
            r6.Acp(r0, r4)
            goto L_0x0068
        L_0x0060:
            X.4Vk r1 = r9.A01(r8)
            X.37g r0 = r7.A00
            r0.A05 = r1
        L_0x0068:
            android.content.Context r0 = r11.A0A     // Catch:{ Exception -> 0x008b }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ Exception -> 0x008b }
            r0 = 2131820569(0x7f110019, float:1.9273857E38)
            java.io.InputStream r4 = r1.openRawResource(r0)     // Catch:{ Exception -> 0x008b }
            byte[] r1 = X.C30311c8.A08(r4)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0084 }
            r0.<init>(r1)     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x0098
            r4.close()     // Catch:{ Exception -> 0x008b }
            goto L_0x0098
        L_0x0084:
            r0 = move-exception
            if (r4 == 0) goto L_0x008a
            r4.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            throw r0     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            java.lang.String r1 = "Unable to load youtube html frame."
            java.lang.String r0 = "youtube_html_frame_load_failed"
            r11.A0F(r1, r0, r2)
            r0 = 0
        L_0x0098:
            r11.A0H = r0
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r12)
            r1 = 2131559251(0x7f0d0353, float:1.874384E38)
            r0 = 0
            android.view.View r1 = r4.inflate(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r11.A0B = r1
            r0 = 2131367137(0x7f0a14e1, float:1.8354187E38)
            android.view.View r4 = X.C004601z.A0E(r1, r0)
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            r11.A0C = r4
            r0 = 2131367136(0x7f0a14e0, float:1.8354185E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            com.obwhatsapp.videoplayback.YoutubePlayerTouchOverlay r1 = (com.obwhatsapp.videoplayback.YoutubePlayerTouchOverlay) r1
            r11.A0G = r1
            r1.A01 = r5
            r5 = r21
            r1.A00 = r5
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r5
            r1.setLayoutParams(r0)
            android.webkit.WebSettings r0 = r4.getSettings()
            r0.setJavaScriptEnabled(r3)
            android.webkit.WebSettings r0 = r4.getSettings()
            r0.setDomStorageEnabled(r3)
            android.webkit.WebSettings r0 = r4.getSettings()
            r0.setMediaPlaybackRequiresUserGesture(r2)
            android.webkit.WebSettings r1 = r4.getSettings()
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r12)
            r1.setUserAgentString(r0)
            android.webkit.WebSettings r0 = r4.getSettings()
            r0.setAllowFileAccess(r2)
            android.webkit.WebSettings r0 = r4.getSettings()
            r0.setAllowUniversalAccessFromFileURLs(r2)
            X.3AH r1 = new X.3AH
            r1.<init>(r11)
            java.lang.String r0 = "YoutubeJsInterface"
            r4.addJavascriptInterface(r1, r0)
            java.lang.String[] r0 = X.C30931dC.A03
            r1 = r20
            java.lang.String r0 = X.C30931dC.A03(r1, r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r8 = X.C42181xM.A02(r0)
            java.lang.String r6 = "s"
            java.lang.String r7 = "m"
            java.lang.String r5 = "h"
            r10 = 0
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x016a }
            java.lang.String r0 = "t"
            java.lang.String r1 = r1.getQueryParameter(r0)     // Catch:{ Exception -> 0x016a }
            if (r1 == 0) goto L_0x016a
            boolean r0 = r1.contains(r5)     // Catch:{ Exception -> 0x016a }
            if (r0 == 0) goto L_0x0168
            java.lang.String[] r1 = r1.split(r5)     // Catch:{ Exception -> 0x016a }
            r0 = r1[r2]     // Catch:{ Exception -> 0x016a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x016a }
            int r5 = r0 * 3600
            r1 = r1[r3]     // Catch:{ Exception -> 0x016a }
        L_0x0140:
            boolean r0 = r1.contains(r7)     // Catch:{ Exception -> 0x016a }
            if (r0 == 0) goto L_0x0155
            java.lang.String[] r1 = r1.split(r7)     // Catch:{ Exception -> 0x016a }
            r0 = r1[r2]     // Catch:{ Exception -> 0x016a }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x016a }
            int r0 = r0 * 60
            int r5 = r5 + r0
            r1 = r1[r3]     // Catch:{ Exception -> 0x016a }
        L_0x0155:
            boolean r0 = r1.contains(r6)     // Catch:{ Exception -> 0x016a }
            if (r0 == 0) goto L_0x0161
            java.lang.String[] r0 = r1.split(r6)     // Catch:{ Exception -> 0x016a }
            r1 = r0[r2]     // Catch:{ Exception -> 0x016a }
        L_0x0161:
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ Exception -> 0x016a }
            int r10 = r5 + r0
            goto L_0x016a
        L_0x0168:
            r5 = 0
            goto L_0x0140
        L_0x016a:
            if (r8 != 0) goto L_0x0175
            java.lang.String r1 = "Unable to parse youtube id."
            java.lang.String r0 = "youtube_id_parse_failed"
            r11.A0F(r1, r0, r2)
            return
        L_0x0175:
            java.lang.String r6 = "100%"
            org.json.JSONObject r5 = X.C13700nu.A0J()     // Catch:{ Exception -> 0x01f2 }
            org.json.JSONObject r7 = X.C13700nu.A0J()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = "onReady"
            java.lang.String r0 = "onPlayerReady"
            org.json.JSONObject r9 = r7.put(r1, r0)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = "onError"
            java.lang.String r0 = "onPlayerError"
            org.json.JSONObject r9 = r9.put(r1, r0)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = "onStateChange"
            java.lang.String r0 = "onPlayerStateChange"
            r9.put(r1, r0)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "start"
            org.json.JSONObject r1 = r5.put(r0, r10)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "rel"
            org.json.JSONObject r1 = r1.put(r0, r2)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "modestbranding"
            org.json.JSONObject r9 = r1.put(r0, r2)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r1 = "iv_load_policy"
            r0 = 3
            org.json.JSONObject r1 = r9.put(r1, r0)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "autohide"
            org.json.JSONObject r1 = r1.put(r0, r3)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "autoplay"
            org.json.JSONObject r1 = r1.put(r0, r3)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "cc_load_policy"
            org.json.JSONObject r1 = r1.put(r0, r3)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "playsinline"
            org.json.JSONObject r1 = r1.put(r0, r3)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "controls"
            r1.put(r0, r2)     // Catch:{ Exception -> 0x01f2 }
            org.json.JSONObject r1 = X.C13700nu.A0J()     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "videoId"
            org.json.JSONObject r1 = r1.put(r0, r8)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "events"
            org.json.JSONObject r1 = r1.put(r0, r7)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "height"
            org.json.JSONObject r1 = r1.put(r0, r6)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "width"
            org.json.JSONObject r1 = r1.put(r0, r6)     // Catch:{ Exception -> 0x01f2 }
            java.lang.String r0 = "playerVars"
            org.json.JSONObject r0 = r1.put(r0, r5)     // Catch:{ Exception -> 0x01f2 }
            goto L_0x01f7
        L_0x01f2:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x01f7:
            r11.A06 = r0
            if (r0 != 0) goto L_0x0203
            java.lang.String r1 = "Invalid player params."
            java.lang.String r0 = "invalid_player_params"
            r11.A0F(r1, r0, r3)
            return
        L_0x0203:
            X.3Nj r0 = new X.3Nj
            r0.<init>(r14, r11)
            r4.setWebViewClient(r0)
            android.graphics.Bitmap[] r0 = new android.graphics.Bitmap[r3]
            r0[r2] = r13
            r11.A09 = r0
            X.3Nf r0 = new X.3Nf
            r0.<init>(r11)
            r4.setWebChromeClient(r0)
            return
        L_0x021a:
            java.lang.String r0 = "InlineYoutubeVideoPlayer/constructor instance created on version <19"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "InlineVideoPlayback is not supported on version <19"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610837g.<init>(android.content.Context, android.graphics.Bitmap, X.0zJ, X.0pt, X.0pd, X.1Gj, X.0tZ, X.2Cw, java.lang.String, int):void");
    }

    public int A03() {
        return this.A01;
    }

    public int A04() {
        long j2 = this.A04;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        return (int) j2;
    }

    public Bitmap A05() {
        return null;
    }

    public View A06() {
        return this.A0B;
    }

    public void A07() {
        if (this.A08) {
            Log.i("InlineYoutubeVideoPlayer/pause");
            this.A0C.loadUrl("javascript:(function() { player.pauseVideo(); })()");
            this.A02 = 2;
            this.A00 = 2;
            C46202Cw r1 = this.A0F;
            r1.A03();
            r1.A0K = true;
        }
    }

    public void A08() {
        AnonymousClass4Vk r0;
        JSONObject jSONObject;
        if (!this.A07) {
            Log.i("InlineYoutubeVideoPlayer/start");
            this.A07 = true;
            if (!(!this.A0E.A0E(C16620tM.A01, 2200) || (r0 = this.A05) == null || (jSONObject = this.A06) == null)) {
                try {
                    jSONObject.put("rctn", r0.A01).put("rct", this.A05.A00);
                } catch (JSONException e2) {
                    Log.e("InlineYoutubeVideoPlayer/addCounterAbuseDataIfNeeded", e2);
                }
            }
            WebView webView = this.A0C;
            Locale locale = Locale.US;
            String str = this.A0H;
            AnonymousClass00B.A05(str);
            JSONObject jSONObject2 = this.A06;
            AnonymousClass00B.A06(jSONObject2);
            webView.loadDataWithBaseURL("https://whatsapp.com", String.format(locale, str, new Object[]{jSONObject2.toString()}), "text/html", AnonymousClass01S.A08, "https://youtube.com");
            return;
        }
        this.A0C.loadUrl("javascript:(function() { player.playVideo(); })()");
        this.A02 = 1;
        this.A00 = 1;
        C46202Cw r02 = this.A0F;
        r02.A0N();
        r02.A0K = true;
    }

    public void A09() {
        Log.i("InlineYoutubeVideoPlayer/stop");
        YoutubePlayerTouchOverlay youtubePlayerTouchOverlay = this.A0G;
        if (youtubePlayerTouchOverlay.getChildCount() > 0) {
            youtubePlayerTouchOverlay.removeAllViews();
        }
        WebView webView = this.A0C;
        webView.removeJavascriptInterface("YoutubeJsInterface");
        webView.stopLoading();
        webView.destroy();
        this.A01 = 0;
        this.A03 = -1;
        this.A00 = 0;
        this.A02 = 1;
        this.A08 = false;
        this.A07 = false;
        this.A04 = -9223372036854775807L;
    }

    public void A0A(int i2) {
        if (this.A08) {
            StringBuilder A0r = AnonymousClass000.A0r("InlineYoutubeVideoPlayer/seekTo: ");
            int i3 = i2 / 1000;
            A0r.append(i3);
            C13680ns.A1V(A0r);
            WebView webView = this.A0C;
            StringBuilder A0r2 = AnonymousClass000.A0r("javascript:(function() { player.seekTo(");
            A0r2.append(i3);
            webView.loadUrl(AnonymousClass000.A0h(", true); })()", A0r2));
            this.A01 = i2;
        }
    }

    public void A0B(boolean z2) {
    }

    public boolean A0C() {
        return C13690nt.A1R(this.A02);
    }

    public boolean A0D() {
        return false;
    }

    public boolean A0E() {
        return false;
    }

    public final void A0F(String str, String str2, boolean z2) {
        A02(C13680ns.A0h("InlineYoutubeVideoPlayer: ", str), str2, z2);
    }
}
