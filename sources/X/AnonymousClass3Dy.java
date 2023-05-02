package X;

import com.google.android.exoplayer2.Timeline;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3Dy  reason: invalid class name */
public class AnonymousClass3Dy implements AnonymousClass5TQ {
    public final /* synthetic */ AnonymousClass29C A00;

    public AnonymousClass3Dy(AnonymousClass29C r1) {
        this.A00 = r1;
    }

    public /* synthetic */ void AQo(boolean z2) {
    }

    public /* synthetic */ void ASO(boolean z2) {
    }

    public /* synthetic */ void ASP(boolean z2) {
    }

    public /* synthetic */ void ATO(C86924Ur r1, int i2) {
    }

    public /* synthetic */ void AUm(boolean z2, int i2) {
    }

    public void AUo(C89214bm r1) {
    }

    public /* synthetic */ void AUq(int i2) {
    }

    public /* synthetic */ void AUr(int i2) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUs(X.C804643y r7) {
        /*
            r6 = this;
            int r0 = r7.type
            r3 = 1
            if (r0 != r3) goto L_0x0080
            java.lang.Throwable r1 = r7.cause
            java.lang.Exception r1 = (java.lang.Exception) r1
            boolean r0 = r1 instanceof X.AnonymousClass441
            if (r0 == 0) goto L_0x0080
            X.441 r1 = (X.AnonymousClass441) r1
            X.4eg r0 = r1.codecInfo
            if (r0 != 0) goto L_0x007d
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass43N
            if (r0 == 0) goto L_0x0073
            java.lang.String r5 = "error querying decoder"
        L_0x001d:
            java.lang.String r0 = "ExoPlayerVideoPlayer/error in playback errorMessage="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r5)
            java.lang.String r0 = " playerid="
            r1.append(r0)
            X.29C r4 = r6.A00
            int r0 = r4.hashCode()
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            com.whatsapp.util.Log.e(r0, r7)
            if (r5 != 0) goto L_0x0046
            java.lang.String r0 = "exoplayer_error_type_"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r7.type
            java.lang.String r5 = X.AnonymousClass000.A0l(r1, r0)
        L_0x0046:
            android.app.Activity r1 = r4.A0Q
            r0 = 2131888232(0x7f120868, float:1.9411094E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r1 = " "
            java.lang.String r0 = "_"
            java.lang.String r1 = r5.replace(r1, r0)
            java.lang.String r0 = "ExoPlayerVideoPlayer/onError="
            java.lang.String r0 = X.C13680ns.A0h(r0, r2)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.A02(r2, r1, r3)
            X.2PV r1 = r4.A0D
            if (r1 == 0) goto L_0x0072
            boolean r0 = r1 instanceof X.C610537d
            if (r0 != 0) goto L_0x0072
            X.37e r1 = (X.C610637e) r1
            X.4Wp r0 = r1.A0A
            r0.A00()
        L_0x0072:
            return
        L_0x0073:
            boolean r0 = r1.secureDecoderRequired
            if (r0 == 0) goto L_0x007a
            java.lang.String r5 = "error no secure decoder"
            goto L_0x001d
        L_0x007a:
            java.lang.String r5 = "no secure decoder"
            goto L_0x001d
        L_0x007d:
            java.lang.String r5 = "error instantiating decoder"
            goto L_0x001d
        L_0x0080:
            r5 = 0
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Dy.AUs(X.43y):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r6 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b5, code lost:
        if (r7 != 2) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUt(boolean r6, int r7) {
        /*
            r5 = this;
            X.29C r4 = r5.A00
            boolean r0 = r4.A0M
            r3 = 1
            if (r7 != r3) goto L_0x00fb
            r0 = 0
            r4.A0M = r0
            r4.A0N = r0
        L_0x000c:
            X.5Qg r0 = r4.A04
            if (r0 == 0) goto L_0x0013
            r0.AUt(r6, r7)
        L_0x0013:
            X.2PV r2 = r4.A0D
            if (r2 == 0) goto L_0x002c
            boolean r0 = r2 instanceof X.C610537d
            if (r0 == 0) goto L_0x0082
            X.37d r2 = (X.C610537d) r2
            r0 = 3
            if (r7 != r0) goto L_0x00af
            if (r6 == 0) goto L_0x00b7
            X.4Wp r0 = r2.A07
            r0.A00()
            X.4Wp r0 = r2.A08
            r0.A02()
        L_0x002c:
            r0 = 3
            if (r7 != r0) goto L_0x0069
            if (r6 == 0) goto L_0x006e
            boolean r0 = r4.A0O
            if (r0 == 0) goto L_0x0041
            r0 = 0
            r4.A0O = r0
            com.obwhatsapp.videoplayback.ExoPlaybackControlView r1 = r4.A0C
            if (r1 == 0) goto L_0x0041
            r0 = 500(0x1f4, float:7.0E-43)
            r1.A06(r0)
        L_0x0041:
            r4.A0N = r3
            boolean r0 = r4.A0L
            if (r0 != 0) goto L_0x0050
            r4.A0L = r3
            X.5Qf r0 = r4.A03
            if (r0 == 0) goto L_0x0050
            r0.AXT(r4)
        L_0x0050:
            r0 = 0
            r4.A0K = r0
        L_0x0053:
            boolean r2 = r4.A0E
            r1 = 2
            boolean r0 = X.AnonymousClass000.A1R(r7, r1)
            if (r2 == r0) goto L_0x0068
            if (r7 == r1) goto L_0x005f
            r3 = 0
        L_0x005f:
            r4.A0E = r3
            X.5Qc r0 = r4.A00
            if (r0 == 0) goto L_0x0068
            r0.ANm(r4, r3)
        L_0x0068:
            return
        L_0x0069:
            if (r7 != r0) goto L_0x006e
            if (r6 == 0) goto L_0x006e
            goto L_0x0041
        L_0x006e:
            r0 = 0
            r4.A0N = r0
            r0 = 4
            if (r7 != r0) goto L_0x0050
            boolean r0 = r4.A0K
            if (r0 != 0) goto L_0x0053
            r4.A0K = r3
            X.5Qd r0 = r4.A01
            if (r0 == 0) goto L_0x0053
            r0.AOy(r4)
            goto L_0x0053
        L_0x0082:
            X.37e r2 = (X.C610637e) r2
            r0 = 3
            if (r7 != r0) goto L_0x00be
            X.4Wp r1 = r2.A0B
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0092
            r1.A00()
            r2.A06 = r3
        L_0x0092:
            X.4Wp r0 = r2.A0D
            if (r6 == 0) goto L_0x00a3
            r0.A02()
            X.4Wp r0 = r2.A0C
            r0.A00()
            r2.A00 = r3
        L_0x00a0:
            X.4Wp r0 = r2.A0A
            goto L_0x00b9
        L_0x00a3:
            r0.A00()
            X.4Wp r0 = r2.A0C
            r0.A02()
            r0 = 2
            r2.A00 = r0
            goto L_0x00a0
        L_0x00af:
            if (r7 == r3) goto L_0x00b7
            r0 = 4
            if (r7 == r0) goto L_0x00b7
            r0 = 2
            if (r7 != r0) goto L_0x002c
        L_0x00b7:
            X.4Wp r0 = r2.A08
        L_0x00b9:
            r0.A00()
            goto L_0x002c
        L_0x00be:
            r0 = 4
            if (r7 != r0) goto L_0x00d5
            X.4Wp r0 = r2.A0D
            r0.A00()
            X.4Wp r0 = r2.A0A
            r0.A00()
            X.4Wp r0 = r2.A0C
            r0.A00()
            r0 = 5
        L_0x00d1:
            r2.A00 = r0
            goto L_0x002c
        L_0x00d5:
            r0 = 2
            if (r7 != r0) goto L_0x002c
            X.4Wp r0 = r2.A0D
            r0.A00()
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x00f4
            X.4Wp r1 = r2.A0A
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00f4
            if (r6 == 0) goto L_0x00f4
            r1.A02()
            monitor-enter(r2)
            int r0 = r2.A01     // Catch:{ all -> 0x00fe }
            int r0 = r0 + 1
            r2.A01 = r0     // Catch:{ all -> 0x00fe }
            monitor-exit(r2)
        L_0x00f4:
            X.4Wp r0 = r2.A0C
            r0.A00()
            r0 = 3
            goto L_0x00d1
        L_0x00fb:
            if (r0 == 0) goto L_0x000c
            return
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Dy.AUt(boolean, int):void");
    }

    public /* synthetic */ void AUy(int i2) {
    }

    public /* synthetic */ void AWt() {
    }

    public /* synthetic */ void AXd(List list) {
    }

    public /* synthetic */ void AYr(Timeline timeline, int i2) {
        C806544y.A00(this, timeline, i2);
    }

    public /* synthetic */ void AYs(Timeline timeline, Object obj, int i2) {
    }

    public void AZ8(C93604jT r6, AnonymousClass4TI r7) {
        String string;
        String str;
        hashCode();
        AnonymousClass29C r4 = this.A00;
        AnonymousClass4S2 r1 = r4.A09.A00;
        if (r1 != null) {
            if (r1.A00(2) == 1) {
                Log.i("ExoPlayerVideoPlayer/unplayable video track");
                string = r4.A0Q.getString(R.string.str0868);
                str = "unplayable_video_track";
            } else if (r1.A00(1) == 1) {
                Log.i("ExoPlayerVideoPlayer/unplayable audio track");
                string = r4.A0Q.getString(R.string.str0868);
                str = "unplayable_audio_track";
            } else {
                return;
            }
            Log.e(C13680ns.A0h("ExoPlayerVideoPlayer/onError=", string));
            r4.A02(string, str, true);
            AnonymousClass2PV r12 = r4.A0D;
            if (r12 != null && !(r12 instanceof C610537d)) {
                ((C610637e) r12).A0A.A00();
            }
        }
    }
}
