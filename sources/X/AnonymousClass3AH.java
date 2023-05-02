package X;

import android.webkit.JavascriptInterface;
import com.facebook.redex.RunnableRunnableShape0S0102000_I1;

/* renamed from: X.3AH  reason: invalid class name */
public class AnonymousClass3AH {
    public final /* synthetic */ C610837g A00;

    public AnonymousClass3AH(C610837g r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ea, code lost:
        if (r7 == 3) goto L_0x00ec;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.AnonymousClass3AH r5, int r6, int r7) {
        /*
            java.lang.String r0 = "InlineYoutubeVideoPlayer/YoutubeJsInterface/postPlayerEvent:"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r6)
            java.lang.String r0 = " data: "
            r1.append(r0)
            r1.append(r7)
            X.C13680ns.A1V(r1)
            if (r6 == 0) goto L_0x007f
            r4 = 1
            if (r6 == r4) goto L_0x00ff
            r0 = 2
            if (r6 == r0) goto L_0x0049
            r0 = 3
            X.37g r3 = r5.A00
            if (r6 == r0) goto L_0x0038
            java.lang.String r0 = "Invalid postPlayerEvent"
            java.lang.String r2 = X.C13680ns.A0c(r7, r0)
            if (r7 == 0) goto L_0x002a
            r4 = 0
        L_0x002a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "player_error_"
        L_0x0030:
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r7)
            r3.A0F(r2, r0, r4)
        L_0x0037:
            return
        L_0x0038:
            java.lang.String r0 = "Youtube player Error="
            java.lang.String r2 = X.C13680ns.A0c(r7, r0)
            if (r7 == 0) goto L_0x0041
            r4 = 0
        L_0x0041:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = "youtube_error_"
            goto L_0x0030
        L_0x0049:
            X.37g r5 = r5.A00
            int r0 = r7 * 1000
            long r6 = (long) r0
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x0037
            long r3 = r5.A04
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0037
            r5.A04 = r6
            android.webkit.WebView r1 = r5.A0C
            java.lang.String r0 = "javascript:(function() { loaded = true; })()"
            r1.loadUrl(r0)
            long r3 = r5.A04
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0037
            java.lang.String r0 = "Invalid duration="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r2 = X.C13680ns.A0j(r0, r3)
            r1 = 0
            java.lang.String r0 = "invalid_duration"
            r5.A0F(r2, r0, r1)
            return
        L_0x007f:
            X.37g r2 = r5.A00
            r0 = 3
            if (r7 <= r0) goto L_0x00db
            r0 = 5
            if (r7 != r0) goto L_0x0037
        L_0x0087:
            int r0 = r2.A02
            r3 = 2
            r5 = 1
            if (r0 == r3) goto L_0x00c6
            if (r7 != r3) goto L_0x0092
            r2.A07()
        L_0x0092:
            X.5Qg r0 = r2.A04
            if (r0 == 0) goto L_0x0099
            r0.AUt(r5, r7)
        L_0x0099:
            r2.A03 = r7
            int r0 = r2.A00
            if (r0 != r5) goto L_0x00ba
            if (r7 == r5) goto L_0x00be
        L_0x00a1:
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x00e9
            if (r7 != r5) goto L_0x00e9
            long r6 = r2.A04
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00f4
            java.lang.String r1 = "Video started playing before duration loaded."
            java.lang.String r0 = "playback_started_before_duration_loaded"
            r2.A0F(r1, r0, r5)
            return
        L_0x00ba:
            if (r0 != r3) goto L_0x00a1
            if (r7 != r3) goto L_0x00a1
        L_0x00be:
            r1 = 0
            r2.A00 = r1
            X.2Cw r0 = r2.A0F
            r0.A0K = r1
            goto L_0x00a1
        L_0x00c6:
            if (r7 != r5) goto L_0x0092
            android.webkit.WebView r1 = r2.A0C
            java.lang.String r0 = "javascript:(function() { player.playVideo(); })()"
            r1.loadUrl(r0)
            r2.A02 = r5
            r2.A00 = r5
            X.2Cw r0 = r2.A0F
            r0.A0N()
            r0.A0K = r5
            goto L_0x0092
        L_0x00db:
            if (r7 != 0) goto L_0x0087
            int r0 = r2.A03
            if (r0 == r7) goto L_0x0087
            X.5Qd r0 = r2.A01
            if (r0 == 0) goto L_0x0087
            r0.AOy(r2)
            goto L_0x0087
        L_0x00e9:
            r0 = 3
            if (r7 != r0) goto L_0x00fd
        L_0x00ec:
            X.5Qc r0 = r2.A00
            if (r0 == 0) goto L_0x0037
            r0.ANm(r2, r5)
            return
        L_0x00f4:
            r2.A08 = r5
            X.5Qf r0 = r2.A03
            if (r0 == 0) goto L_0x00fd
            r0.AXT(r2)
        L_0x00fd:
            r5 = 0
            goto L_0x00ec
        L_0x00ff:
            X.37g r1 = r5.A00
            int r0 = r7 * 1000
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3AH.A00(X.3AH, int, int):void");
    }

    @JavascriptInterface
    public void postPlayerEvent(int i2, int i3) {
        if (i3 >= 0 && i3 < 2147483) {
            this.A00.A0D.A0K(new RunnableRunnableShape0S0102000_I1(this, i2, i3, 2));
        }
    }
}
