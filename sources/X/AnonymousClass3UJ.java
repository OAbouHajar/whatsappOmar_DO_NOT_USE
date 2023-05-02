package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3UJ  reason: invalid class name */
public final class AnonymousClass3UJ extends C96244o1 implements Handler.Callback {
    public int A00;
    public int A01;
    public long A02;
    public C32491gT A03;
    public AnonymousClass5UP A04;
    public AnonymousClass3Uc A05;
    public C65303Uf A06;
    public C65303Uf A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Handler A0B;
    public final AnonymousClass4G5 A0C;
    public final AnonymousClass5TT A0D;
    public final C108335No A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3UJ(Looper looper, C108335No r4) {
        super(3);
        AnonymousClass5TT r1 = AnonymousClass5TT.A00;
        this.A0E = r4;
        this.A0B = looper == null ? null : new Handler(looper, this);
        this.A0D = r1;
        this.A0C = new AnonymousClass4G5();
        this.A02 = -9223372036854775807L;
    }

    public void A08() {
        this.A03 = null;
        this.A02 = -9223372036854775807L;
        A0C();
        A0E();
        this.A04.release();
        this.A04 = null;
        this.A00 = 0;
    }

    public void A09(long j2, boolean z2) {
        A0C();
        this.A08 = false;
        this.A09 = false;
        this.A02 = -9223372036854775807L;
        if (this.A00 != 0) {
            A0F();
            return;
        }
        A0E();
        this.A04.flush();
    }

    public final long A0B() {
        int i2 = this.A01;
        if (i2 == -1 || i2 >= this.A07.A01.AC4()) {
            return Long.MAX_VALUE;
        }
        return this.A07.AC3(this.A01);
    }

    public final void A0C() {
        List emptyList = Collections.emptyList();
        Handler handler = this.A0B;
        if (handler != null) {
            handler.obtainMessage(0, emptyList).sendToTarget();
        } else {
            this.A0E.APH(emptyList);
        }
    }

    public final void A0D() {
        AnonymousClass5UP r2;
        String str;
        this.A0A = true;
        C32491gT r22 = this.A03;
        String str2 = r22.A0T;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1351681404:
                    if (str2.equals("application/dvbsubs")) {
                        r2 = new AnonymousClass3VS(r22.A0U);
                        break;
                    }
                    break;
                case -1248334819:
                    if (str2.equals("application/pgs")) {
                        r2 = new AnonymousClass3VV();
                        break;
                    }
                    break;
                case -1026075066:
                    if (str2.equals("application/x-mp4-vtt")) {
                        r2 = new AnonymousClass3VT();
                        break;
                    }
                    break;
                case -1004728940:
                    if (str2.equals("text/vtt")) {
                        r2 = new AnonymousClass3VU();
                        break;
                    }
                    break;
                case 691401887:
                    if (str2.equals("application/x-quicktime-tx3g")) {
                        r2 = new AnonymousClass3VW(r22.A0U);
                        break;
                    }
                    break;
                case 822864842:
                    if (str2.equals("text/x-ssa")) {
                        r2 = new AnonymousClass3VZ(r22.A0U);
                        break;
                    }
                    break;
                case 930165504:
                    str = "application/x-mp4-cea-608";
                    break;
                case 1566015601:
                    str = "application/cea-608";
                    break;
                case 1566016562:
                    if (str2.equals("application/cea-708")) {
                        r2 = new C65533Vd(r22.A0U, r22.A03);
                        break;
                    }
                    break;
                case 1668750253:
                    if (str2.equals("application/x-subrip")) {
                        r2 = new AnonymousClass3VX();
                        break;
                    }
                    break;
                case 1693976202:
                    if (str2.equals("application/ttml+xml")) {
                        r2 = new AnonymousClass3VY();
                        break;
                    }
                    break;
            }
            if (str2.equals(str)) {
                r2 = new C65543Ve(r22.A03, str2);
                this.A04 = r2;
                return;
            }
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(str2, AnonymousClass000.A0r("Attempted to create decoder for unsupported MIME type: ")));
    }

    public final void A0E() {
        this.A05 = null;
        this.A01 = -1;
        C65303Uf r0 = this.A07;
        if (r0 != null) {
            r0.release();
            this.A07 = null;
        }
        C65303Uf r02 = this.A06;
        if (r02 != null) {
            r02.release();
            this.A06 = null;
        }
    }

    public final void A0F() {
        A0E();
        this.A04.release();
        this.A04 = null;
        this.A00 = 0;
        A0D();
    }

    public boolean AIm() {
        return this.A09;
    }

    public boolean AJY() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
        if (r8 != false) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c6 A[LOOP:1: B:51:0x00c6->B:83:0x00c6, LOOP_START, SYNTHETIC, Splitter:B:51:0x00c6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Ac6(long r11, long r13) {
        /*
            r10 = this;
            boolean r0 = r10.A06
            r5 = 1
            if (r0 == 0) goto L_0x0019
            long r1 = r10.A02
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0019
            r10.A0E()
            r10.A09 = r5
        L_0x0019:
            boolean r0 = r10.A09
            if (r0 != 0) goto L_0x0142
            X.3Uf r0 = r10.A06
            if (r0 != 0) goto L_0x0048
            X.5UP r0 = r10.A04
            r0.AeO(r11)
            java.lang.Object r0 = r0.A7r()     // Catch:{ 3Ua -> 0x002f }
            X.3Uf r0 = (X.C65303Uf) r0     // Catch:{ 3Ua -> 0x002f }
            r10.A06 = r0     // Catch:{ 3Ua -> 0x002f }
            goto L_0x0048
        L_0x002f:
            r2 = move-exception
            java.lang.String r0 = "Subtitle decoding failed. streamFormat="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.1gT r0 = r10.A03
            java.lang.String r1 = X.AnonymousClass000.A0f(r0, r1)
            java.lang.String r0 = "TextRenderer"
            X.C89504cL.A01(r0, r1, r2)
            r10.A0C()
            r10.A0F()
            return
        L_0x0048:
            int r0 = r10.A01
            r4 = 2
            if (r0 != r4) goto L_0x0142
            X.3Uf r0 = r10.A07
            r3 = 0
            if (r0 == 0) goto L_0x0067
            long r1 = r10.A0B()
            r8 = 0
        L_0x0057:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0068
            int r0 = r10.A01
            int r0 = r0 + 1
            r10.A01 = r0
            long r1 = r10.A0B()
            r8 = 1
            goto L_0x0057
        L_0x0067:
            r8 = 0
        L_0x0068:
            X.3Uf r7 = r10.A06
            r2 = 0
            if (r7 == 0) goto L_0x00ac
            boolean r0 = X.AnonymousClass4XM.A00(r7)
            if (r0 == 0) goto L_0x0094
            if (r8 != 0) goto L_0x00ae
            long r8 = r10.A0B()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0089
            int r0 = r10.A00
            if (r0 != r4) goto L_0x008e
            r10.A0F()
        L_0x0089:
            int r0 = r10.A00
            if (r0 != r4) goto L_0x00c6
            return
        L_0x008e:
            r10.A0E()
            r10.A09 = r5
            goto L_0x0089
        L_0x0094:
            long r0 = r7.timeUs
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x00ac
            X.3Uf r0 = r10.A07
            if (r0 == 0) goto L_0x00a1
            r0.release()
        L_0x00a1:
            int r0 = r7.ADu(r11)
            r10.A01 = r0
            r10.A07 = r7
            r10.A06 = r2
            goto L_0x00ae
        L_0x00ac:
            if (r8 == 0) goto L_0x0089
        L_0x00ae:
            X.3Uf r0 = r10.A07
            java.util.List r1 = r0.ABD(r11)
            android.os.Handler r0 = r10.A0B
            if (r0 == 0) goto L_0x00c0
            android.os.Message r0 = r0.obtainMessage(r3, r1)
            r0.sendToTarget()
            goto L_0x0089
        L_0x00c0:
            X.5No r0 = r10.A0E
            r0.APH(r1)
            goto L_0x0089
        L_0x00c6:
            boolean r0 = r10.A08     // Catch:{ 3Ua -> 0x012a }
            if (r0 != 0) goto L_0x0142
            X.3Uc r6 = r10.A05     // Catch:{ 3Ua -> 0x012a }
            if (r6 != 0) goto L_0x00da
            X.5UP r0 = r10.A04     // Catch:{ 3Ua -> 0x012a }
            java.lang.Object r6 = r0.A7q()     // Catch:{ 3Ua -> 0x012a }
            X.3Uc r6 = (X.AnonymousClass3Uc) r6     // Catch:{ 3Ua -> 0x012a }
            if (r6 == 0) goto L_0x0142
            r10.A05 = r6     // Catch:{ 3Ua -> 0x012a }
        L_0x00da:
            int r0 = r10.A00     // Catch:{ 3Ua -> 0x012a }
            if (r0 != r5) goto L_0x00eb
            r0 = 4
            r6.flags = r0     // Catch:{ 3Ua -> 0x012a }
            X.5UP r0 = r10.A04     // Catch:{ 3Ua -> 0x012a }
            r0.AbI(r6)     // Catch:{ 3Ua -> 0x012a }
            r10.A05 = r2     // Catch:{ 3Ua -> 0x012a }
            r10.A00 = r4     // Catch:{ 3Ua -> 0x012a }
            goto L_0x0129
        L_0x00eb:
            X.4G5 r7 = r10.A0C     // Catch:{ 3Ua -> 0x012a }
            int r1 = r10.A00(r7, r6, r3)     // Catch:{ 3Ua -> 0x012a }
            r0 = -4
            if (r1 != r0) goto L_0x0125
            boolean r0 = X.AnonymousClass4XM.A00(r6)     // Catch:{ 3Ua -> 0x012a }
            if (r0 == 0) goto L_0x0106
            r10.A08 = r5     // Catch:{ 3Ua -> 0x012a }
            r10.A0A = r3     // Catch:{ 3Ua -> 0x012a }
        L_0x00fe:
            X.5UP r0 = r10.A04     // Catch:{ 3Ua -> 0x012a }
            r0.AbI(r6)     // Catch:{ 3Ua -> 0x012a }
            r10.A05 = r2     // Catch:{ 3Ua -> 0x012a }
            goto L_0x00c6
        L_0x0106:
            X.1gT r0 = r7.A00     // Catch:{ 3Ua -> 0x012a }
            if (r0 == 0) goto L_0x0142
            long r0 = r0.A0J     // Catch:{ 3Ua -> 0x012a }
            r6.A00 = r0     // Catch:{ 3Ua -> 0x012a }
            r6.A00()     // Catch:{ 3Ua -> 0x012a }
            boolean r1 = r10.A0A     // Catch:{ 3Ua -> 0x012a }
            int r0 = r6.flags     // Catch:{ 3Ua -> 0x012a }
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1R(r0, r5)     // Catch:{ 3Ua -> 0x012a }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r1 = r1 & r0
            r10.A0A = r1     // Catch:{ 3Ua -> 0x012a }
            if (r1 != 0) goto L_0x00c6
            goto L_0x00fe
        L_0x0125:
            r0 = -3
            if (r1 != r0) goto L_0x00c6
            return
        L_0x0129:
            return
        L_0x012a:
            r2 = move-exception
            java.lang.String r0 = "Subtitle decoding failed. streamFormat="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.1gT r0 = r10.A03
            java.lang.String r1 = X.AnonymousClass000.A0f(r0, r1)
            java.lang.String r0 = "TextRenderer"
            X.C89504cL.A01(r0, r1, r2)
            r10.A0C()
            r10.A0F()
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UJ.Ac6(long, long):void");
    }

    public int AgX(C32491gT r3) {
        String str = r3.A0T;
        return ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str)) ? r3.A0N == null ? 4 : 2 : AnonymousClass000.A1O(C90834eu.A04(str) ? 1 : 0) ? 1 : 0;
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            this.A0E.APH((List) message.obj);
            return true;
        }
        throw AnonymousClass3K4.A0V();
    }
}
