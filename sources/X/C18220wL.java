package X;

import android.graphics.BitmapFactory;
import android.util.Pair;
import com.facebook.redex.IDxExecutorShape280S0100000_2_I0;
import com.facebook.redex.IDxNConsumerShape15S0300000_1_I0;
import com.facebook.redex.IDxNConsumerShape39S0200000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.0wL  reason: invalid class name and case insensitive filesystem */
public class C18220wL {
    public final C16300so A00;
    public final C16180sb A01;
    public final C14870pt A02;
    public final AnonymousClass01Z A03;
    public final C18260wP A04;
    public final C14710pd A05;
    public final C16490t9 A06;
    public final AnonymousClass12X A07;
    public final C18210wK A08;
    public final AnonymousClass1OJ A09;
    public final C216214u A0A;
    public final C27401Rp A0B;
    public final C215614o A0C;
    public final AnonymousClass1QT A0D;
    public final C27411Rq A0E;
    public final C18840xL A0F;
    public final C18820xJ A0G;
    public final C16510tB A0H;
    public final C18830xK A0I;
    public final C16320sq A0J;
    public final Executor A0K;

    public C18220wL(C16300so r3, C16180sb r4, C14870pt r5, AnonymousClass01Z r6, C18260wP r7, C14710pd r8, C16490t9 r9, AnonymousClass12X r10, C18210wK r11, AnonymousClass1OJ r12, C216214u r13, C27401Rp r14, C215614o r15, AnonymousClass1QT r16, C27411Rq r17, C18840xL r18, C18820xJ r19, C16510tB r20, C18830xK r21, C16320sq r22) {
        this.A05 = r8;
        this.A02 = r5;
        this.A00 = r3;
        this.A0J = r22;
        this.A01 = r4;
        this.A06 = r9;
        this.A0C = r15;
        this.A08 = r11;
        this.A0G = r19;
        this.A0D = r16;
        this.A0I = r21;
        this.A0F = r18;
        this.A0E = r17;
        this.A09 = r12;
        this.A0A = r13;
        this.A0B = r14;
        this.A0H = r20;
        this.A04 = r7;
        this.A03 = r6;
        this.A07 = r10;
        this.A0K = new IDxExecutorShape280S0100000_2_I0(r5, 3);
    }

    public static void A00(File file) {
        if (file != null) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(file.length());
            sb.append(" exists=");
            sb.append(file.exists());
            sb.toString();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x0214 A[Catch:{ URISyntaxException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022b A[Catch:{ URISyntaxException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0278 A[Catch:{ URISyntaxException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0298 A[Catch:{ URISyntaxException -> 0x023c }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02e2 A[Catch:{ URISyntaxException -> 0x023c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21I A01(X.C31781f1 r14, X.C43251zh r15, X.AnonymousClass21B r16, int r17, int r18, int r19) {
        /*
            r13 = this;
            r9 = r17
            r8 = 4
            r2 = r19
            if (r2 != r8) goto L_0x000a
            r15.A04(r2)
        L_0x000a:
            monitor-enter(r15)
            if (r17 != 0) goto L_0x0027
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0346 }
            r15.A02 = r0     // Catch:{ all -> 0x0346 }
            r15.A01()     // Catch:{ all -> 0x0346 }
            monitor-exit(r15)
            r0 = 3
            if (r2 == r0) goto L_0x0053
            X.0sq r2 = r13.A0J
            r1 = 19
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r13, r1, r14)
            r2.Acl(r0)
            goto L_0x0053
        L_0x0027:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0346 }
            r15.A02 = r0     // Catch:{ all -> 0x0346 }
            r15.A01()     // Catch:{ all -> 0x0346 }
            monitor-exit(r15)
            X.0wP r0 = r13.A04
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0053
            r0 = r16
            if (r16 == 0) goto L_0x0053
            X.1f0 r0 = r0.A01
            X.21E r0 = r0.A04
            java.lang.Long r0 = r0.A0A
            if (r0 != 0) goto L_0x0053
            r0 = 17
            if (r9 == r0) goto L_0x0051
            r0 = 22
            if (r9 == r0) goto L_0x0051
            r0 = 13
            if (r9 != r0) goto L_0x0053
        L_0x0051:
            r9 = 25
        L_0x0053:
            monitor-enter(r15)
            X.21I r7 = new X.21I     // Catch:{ all -> 0x0346 }
            r7.<init>()     // Catch:{ all -> 0x0346 }
            X.21E r0 = r15.A05     // Catch:{ all -> 0x0346 }
            r10 = 0
            if (r0 == 0) goto L_0x0099
            switch(r9) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0065;
                case 2: goto L_0x0068;
                case 3: goto L_0x006b;
                case 4: goto L_0x006d;
                case 5: goto L_0x006f;
                case 6: goto L_0x0072;
                case 7: goto L_0x0075;
                case 8: goto L_0x0078;
                case 9: goto L_0x007b;
                case 10: goto L_0x007d;
                case 11: goto L_0x0080;
                case 12: goto L_0x0083;
                case 13: goto L_0x0086;
                case 14: goto L_0x0089;
                case 15: goto L_0x008b;
                case 16: goto L_0x0061;
                case 17: goto L_0x0089;
                case 18: goto L_0x008e;
                case 19: goto L_0x007b;
                case 20: goto L_0x0091;
                case 21: goto L_0x006f;
                case 22: goto L_0x0093;
                case 23: goto L_0x0061;
                case 24: goto L_0x006f;
                case 25: goto L_0x0096;
                default: goto L_0x0061;
            }     // Catch:{ all -> 0x0346 }
        L_0x0061:
            r0 = 2
            goto L_0x009b
        L_0x0063:
            r0 = 1
            goto L_0x009b
        L_0x0065:
            r0 = 12
            goto L_0x009b
        L_0x0068:
            r0 = 10
            goto L_0x009b
        L_0x006b:
            r0 = 7
            goto L_0x009b
        L_0x006d:
            r0 = 6
            goto L_0x009b
        L_0x006f:
            r0 = 9
            goto L_0x009b
        L_0x0072:
            r0 = 8
            goto L_0x009b
        L_0x0075:
            r0 = 11
            goto L_0x009b
        L_0x0078:
            r0 = 13
            goto L_0x009b
        L_0x007b:
            r0 = 4
            goto L_0x009b
        L_0x007d:
            r0 = 14
            goto L_0x009b
        L_0x0080:
            r0 = 15
            goto L_0x009b
        L_0x0083:
            r0 = 16
            goto L_0x009b
        L_0x0086:
            r0 = 17
            goto L_0x009b
        L_0x0089:
            r0 = 5
            goto L_0x009b
        L_0x008b:
            r0 = 19
            goto L_0x009b
        L_0x008e:
            r0 = 20
            goto L_0x009b
        L_0x0091:
            r6 = 0
            goto L_0x009f
        L_0x0093:
            r0 = 18
            goto L_0x009b
        L_0x0096:
            r0 = 21
            goto L_0x009b
        L_0x0099:
            r6 = r10
            goto L_0x009f
        L_0x009b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0346 }
        L_0x009f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0346 }
            r7.A02 = r0     // Catch:{ all -> 0x0346 }
            long r2 = r15.A02     // Catch:{ all -> 0x0346 }
            long r0 = r15.A0E     // Catch:{ all -> 0x0346 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0346 }
            boolean r2 = r15.A0B     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = X.C42141xI.A02(r0, r2)     // Catch:{ all -> 0x0346 }
            r7.A0V = r0     // Catch:{ all -> 0x0346 }
            X.1f1 r5 = r15.A0F     // Catch:{ all -> 0x0346 }
            long r0 = r5.A07     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = X.C42141xI.A02(r0, r2)     // Catch:{ all -> 0x0346 }
            r7.A0Q = r0     // Catch:{ all -> 0x0346 }
            int r0 = r5.A03     // Catch:{ all -> 0x0346 }
            long r0 = (long) r0     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0O = r0     // Catch:{ all -> 0x0346 }
            int r1 = r15.A01     // Catch:{ all -> 0x0346 }
            int r0 = r5.A0B     // Catch:{ all -> 0x0346 }
            r2 = 2
            r4 = 1
            if (r0 != r2) goto L_0x00d5
            r0 = 7
            goto L_0x00e4
        L_0x00d5:
            if (r1 == 0) goto L_0x00e3
            if (r1 == r2) goto L_0x00e3
            r0 = 3
            if (r1 == r0) goto L_0x00e1
            if (r1 != r8) goto L_0x010e
            r0 = 8
            goto L_0x00e4
        L_0x00e1:
            r0 = 5
            goto L_0x00e4
        L_0x00e3:
            r0 = 1
        L_0x00e4:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0G = r0     // Catch:{ all -> 0x0346 }
            java.lang.Integer r0 = r15.A07     // Catch:{ all -> 0x0346 }
            r7.A0E = r0     // Catch:{ all -> 0x0346 }
            boolean r0 = r15.A0I     // Catch:{ all -> 0x0346 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A04 = r0     // Catch:{ all -> 0x0346 }
            int r1 = r5.A00     // Catch:{ all -> 0x0346 }
            if (r1 == 0) goto L_0x0116
            r0 = 1
            if (r1 == r4) goto L_0x011d
            r0 = 2
            if (r1 == r2) goto L_0x011d
            r0 = 3
            if (r1 == r0) goto L_0x011d
            r0 = 4
            if (r1 == r8) goto L_0x011d
            java.lang.String r0 = "Unreachable code"
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0346 }
            r1.<init>(r0)     // Catch:{ all -> 0x0346 }
            goto L_0x0115
        L_0x010e:
            java.lang.String r0 = "Unreachable code"
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch:{ all -> 0x0346 }
            r1.<init>(r0)     // Catch:{ all -> 0x0346 }
        L_0x0115:
            throw r1     // Catch:{ all -> 0x0346 }
        L_0x0116:
            java.lang.String r0 = "mediajobeventbuilder/key reuse type not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0346 }
            r0 = 0
            goto L_0x0121
        L_0x011d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0346 }
        L_0x0121:
            r7.A0D = r0     // Catch:{ all -> 0x0346 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0346 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0346 }
            int r1 = r0.intValue()     // Catch:{ all -> 0x0346 }
            r0 = 14
            if (r1 != r0) goto L_0x0196
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0346 }
        L_0x0136:
            r7.A0F = r1     // Catch:{ all -> 0x0346 }
            boolean r0 = r15.A0A     // Catch:{ all -> 0x0346 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A03 = r0     // Catch:{ all -> 0x0346 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0346 }
            r7.A0H = r0     // Catch:{ all -> 0x0346 }
            java.lang.Boolean r0 = r15.A06     // Catch:{ all -> 0x0346 }
            r7.A01 = r0     // Catch:{ all -> 0x0346 }
            int r0 = r15.A00     // Catch:{ all -> 0x0346 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0J = r0     // Catch:{ all -> 0x0346 }
            long r0 = r15.A03     // Catch:{ all -> 0x0346 }
            r8 = -1
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 == 0) goto L_0x0177
            long r0 = r5.A08     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            boolean r8 = r15.A0B     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = X.C42141xI.A02(r0, r8)     // Catch:{ all -> 0x0346 }
            r7.A0R = r0     // Catch:{ all -> 0x0346 }
            long r2 = r15.A02     // Catch:{ all -> 0x0346 }
            long r0 = r15.A03     // Catch:{ all -> 0x0346 }
            long r2 = r2 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = X.C42141xI.A02(r0, r8)     // Catch:{ all -> 0x0346 }
            r7.A0X = r0     // Catch:{ all -> 0x0346 }
        L_0x0177:
            X.211 r0 = r15.A04     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x0187
            X.212 r0 = r0.A03     // Catch:{ all -> 0x0346 }
            java.lang.Long r1 = r0.A09     // Catch:{ all -> 0x0346 }
            boolean r0 = r15.A0B     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = X.C42141xI.A02(r1, r0)     // Catch:{ all -> 0x0346 }
            r7.A0W = r0     // Catch:{ all -> 0x0346 }
        L_0x0187:
            X.21E r2 = r15.A05     // Catch:{ all -> 0x0346 }
            if (r2 == 0) goto L_0x02f9
            java.lang.Boolean r0 = r2.A04     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x01b5
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x01b2
            goto L_0x01af
        L_0x0196:
            boolean r0 = r15.A09     // Catch:{ all -> 0x0346 }
            r1 = 0
            if (r0 != 0) goto L_0x01a0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0346 }
            goto L_0x0136
        L_0x01a0:
            java.lang.Integer r0 = r15.A08     // Catch:{ all -> 0x0346 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0346 }
            boolean r0 = X.C34901l3.A00(r0, r1)     // Catch:{ all -> 0x0346 }
            if (r0 != 0) goto L_0x0136
            java.lang.Integer r1 = r15.A08     // Catch:{ all -> 0x0346 }
            goto L_0x0136
        L_0x01af:
            r0 = 4
            goto L_0x01b7
        L_0x01b2:
            r0 = 3
            goto L_0x01b7
        L_0x01b5:
            r0 = r10
            goto L_0x01bb
        L_0x01b7:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
        L_0x01bb:
            r7.A0S = r0     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = r2.A0B     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x0230
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x0346 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0346 }
        L_0x01c9:
            r7.A09 = r0     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = r2.A0E     // Catch:{ all -> 0x0346 }
            r7.A0U = r0     // Catch:{ all -> 0x0346 }
            java.lang.Long r3 = r2.A09     // Catch:{ all -> 0x0346 }
            if (r3 == 0) goto L_0x022e
            long r11 = r3.longValue()     // Catch:{ all -> 0x0346 }
            r8 = 0
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x022e
        L_0x01dd:
            boolean r1 = r15.A0B     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = X.C42141xI.A02(r3, r1)     // Catch:{ all -> 0x0346 }
            r7.A0b = r0     // Catch:{ all -> 0x0346 }
            java.lang.Long r3 = r2.A0D     // Catch:{ all -> 0x0346 }
            if (r3 == 0) goto L_0x022c
            java.lang.Long r0 = r2.A0C     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x022c
            long r11 = r0.longValue()     // Catch:{ all -> 0x0346 }
            long r8 = r3.longValue()     // Catch:{ all -> 0x0346 }
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x022c
            long r11 = r11 - r8
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0346 }
        L_0x01fe:
            java.lang.Long r0 = X.C42141xI.A02(r0, r1)     // Catch:{ all -> 0x0346 }
            r7.A0d = r0     // Catch:{ all -> 0x0346 }
            java.lang.Boolean r0 = r2.A02     // Catch:{ all -> 0x0346 }
            r7.A06 = r0     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = r2.A0A     // Catch:{ all -> 0x0346 }
            r7.A0c = r0     // Catch:{ all -> 0x0346 }
            java.lang.Boolean r0 = r2.A03     // Catch:{ all -> 0x0346 }
            r7.A07 = r0     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = r2.A08     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x021c
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x0346 }
            java.lang.Double r10 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0346 }
        L_0x021c:
            r7.A0A = r10     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r2.A0I     // Catch:{ all -> 0x0346 }
            r7.A0g = r0     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r2.A0H     // Catch:{ all -> 0x0346 }
            r7.A0f = r0     // Catch:{ all -> 0x0346 }
            java.lang.String r1 = r2.A0J     // Catch:{ all -> 0x0346 }
            r2 = 0
            if (r1 == 0) goto L_0x0242
            goto L_0x0232
        L_0x022c:
            r0 = 0
            goto L_0x01fe
        L_0x022e:
            r3 = 0
            goto L_0x01dd
        L_0x0230:
            r0 = r10
            goto L_0x01c9
        L_0x0232:
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x023c }
            r0.<init>(r1)     // Catch:{ URISyntaxException -> 0x023c }
            java.lang.String r2 = r0.getHost()     // Catch:{ URISyntaxException -> 0x023c }
            goto L_0x0242
        L_0x023c:
            r1 = move-exception
            java.lang.String r0 = "MediaJobEventBuilder/getDomainName syntax exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0346 }
        L_0x0242:
            r7.A0j = r2     // Catch:{ all -> 0x0346 }
            X.21E r3 = r15.A05     // Catch:{ all -> 0x0346 }
            java.lang.Long r10 = r3.A0F     // Catch:{ all -> 0x0346 }
            if (r10 == 0) goto L_0x0263
            long r8 = r10.longValue()     // Catch:{ all -> 0x0346 }
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0263
        L_0x0254:
            r7.A0P = r10     // Catch:{ all -> 0x0346 }
            java.lang.Integer r0 = r3.A07     // Catch:{ all -> 0x0346 }
            r7.A0C = r0     // Catch:{ all -> 0x0346 }
            java.lang.Integer r0 = r3.A06     // Catch:{ all -> 0x0346 }
            r7.A0B = r0     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r3.A0G     // Catch:{ all -> 0x0346 }
            r7.A0i = r0     // Catch:{ all -> 0x0346 }
            goto L_0x0265
        L_0x0263:
            r10 = 0
            goto L_0x0254
        L_0x0265:
            r2 = 3
            if (r6 == 0) goto L_0x0270
            int r0 = r6.intValue()     // Catch:{ all -> 0x0346 }
            if (r0 == r4) goto L_0x0274
            if (r0 == r2) goto L_0x0274
        L_0x0270:
            java.lang.String r0 = r3.A0J     // Catch:{ all -> 0x0346 }
            r7.A0h = r0     // Catch:{ all -> 0x0346 }
        L_0x0274:
            X.21J r8 = r3.A00     // Catch:{ all -> 0x0346 }
            if (r8 == 0) goto L_0x0294
            long r0 = r8.A00     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0K = r0     // Catch:{ all -> 0x0346 }
            long r0 = r8.A02     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0M = r0     // Catch:{ all -> 0x0346 }
            java.lang.Boolean r0 = r8.A03     // Catch:{ all -> 0x0346 }
            r7.A00 = r0     // Catch:{ all -> 0x0346 }
            long r0 = r8.A01     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0L = r0     // Catch:{ all -> 0x0346 }
        L_0x0294:
            X.21K r1 = r3.A01     // Catch:{ all -> 0x0346 }
            if (r1 == 0) goto L_0x02dc
            java.lang.Long r0 = r1.A02     // Catch:{ all -> 0x0346 }
            r7.A0e = r0     // Catch:{ all -> 0x0346 }
            if (r6 == 0) goto L_0x02bc
            int r0 = r6.intValue()     // Catch:{ all -> 0x0346 }
            if (r0 != r4) goto L_0x02bc
            java.lang.Integer r0 = r1.A01     // Catch:{ all -> 0x0346 }
            if (r0 != 0) goto L_0x02b2
            java.lang.String r0 = "ResumeCheckStat result is not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0346 }
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0346 }
        L_0x02b2:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0346 }
            if (r0 != r2) goto L_0x02bc
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0346 }
        L_0x02bc:
            X.21J r2 = r1.A00     // Catch:{ all -> 0x0346 }
            if (r2 == 0) goto L_0x02dc
            long r0 = r2.A00     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0Y = r0     // Catch:{ all -> 0x0346 }
            long r0 = r2.A02     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0a = r0     // Catch:{ all -> 0x0346 }
            java.lang.Boolean r0 = r2.A03     // Catch:{ all -> 0x0346 }
            r7.A05 = r0     // Catch:{ all -> 0x0346 }
            long r0 = r2.A01     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0Z = r0     // Catch:{ all -> 0x0346 }
        L_0x02dc:
            X.21E r0 = r15.A05     // Catch:{ all -> 0x0346 }
            java.lang.Float r1 = r0.A05     // Catch:{ all -> 0x0346 }
            if (r1 == 0) goto L_0x02f9
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.floatValue()     // Catch:{ all -> 0x0346 }
            float r0 = r0 - r2
            float r1 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0346 }
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02f9
            double r0 = (double) r2     // Catch:{ all -> 0x0346 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A08 = r0     // Catch:{ all -> 0x0346 }
        L_0x02f9:
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x0346 }
            java.util.UUID r0 = java.util.UUID.fromString(r0)     // Catch:{ all -> 0x0346 }
            long r2 = r0.getMostSignificantBits()     // Catch:{ all -> 0x0346 }
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0346 }
            r7.A0N = r0     // Catch:{ all -> 0x0346 }
            X.211 r0 = r15.A04     // Catch:{ all -> 0x0346 }
            r2 = 0
            if (r0 == 0) goto L_0x0341
            X.212 r0 = r0.A03     // Catch:{ all -> 0x0346 }
            java.lang.Long r0 = r0.A0M     // Catch:{ all -> 0x0346 }
            if (r0 == 0) goto L_0x0341
            long r0 = r0.longValue()     // Catch:{ all -> 0x0346 }
        L_0x031f:
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0346 }
            r7.A0T = r0     // Catch:{ all -> 0x0346 }
            r7.A0I = r6     // Catch:{ all -> 0x0346 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0346 }
            r1.<init>()     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = "MediaJobEventBuilder/postWamMediaUpload2Event "
            r1.append(r0)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0346 }
            r1.append(r0)     // Catch:{ all -> 0x0346 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0346 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0346 }
            goto L_0x0344
        L_0x0341:
            r0 = 0
            goto L_0x031f
        L_0x0344:
            monitor-exit(r15)
            return r7
        L_0x0346:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18220wL.A01(X.1f1, X.1zh, X.21B, int, int, int):X.21I");
    }

    public AnonymousClass21I A02(AnonymousClass1XP r9, int i2, int i3) {
        int A002;
        C31781f1 r2 = r9.A0J;
        AnonymousClass00B.A06(r2);
        C43251zh r3 = r9.A0K;
        AnonymousClass00B.A06(r3);
        AnonymousClass21B r4 = (AnonymousClass21B) r9.A0H.A00();
        if ("express".equalsIgnoreCase(r9.A0U)) {
            A002 = 4;
        } else {
            AnonymousClass00B.A06(r3);
            A002 = r3.A00();
        }
        return A01(r2, r3, r4, i2, i3, A002);
    }

    public AnonymousClass1XP A03(AnonymousClass1XL r7, boolean z2) {
        C38231qS r0 = r7.A00;
        AnonymousClass1XK r1 = r0.A05;
        C43101zL r5 = r0.A0A ? new C43261zi(r1) : new C43271zj(r1);
        C18210wK r4 = this.A08;
        AnonymousClass1OJ r2 = r4.A0J;
        String str = r7.A03;
        if (str == null) {
            str = UUID.randomUUID().toString();
        }
        C31781f1 A012 = r2.A01(str, 0);
        AnonymousClass1XP r22 = new AnonymousClass1XP(r5, A012, new C43251zh(A012, r2, r4.A0Q, z2), r7);
        C31781f1 r02 = r22.A0J;
        AnonymousClass00B.A06(r02);
        r22.A09.A04(r02.A0D);
        C43251zh r03 = r22.A0K;
        AnonymousClass00B.A06(r03);
        r03.A02();
        return r22;
    }

    public AnonymousClass1XP A04(AnonymousClass1XL r4, boolean z2) {
        AnonymousClass1XP A022 = this.A08.A02(r4, z2);
        if (A022 == null) {
            return A03(r4, z2);
        }
        if (z2) {
            C31781f1 r1 = A022.A0J;
            AnonymousClass00B.A06(r1);
            r1.A03++;
        }
        AnonymousClass1OJ r12 = this.A09;
        C31781f1 r0 = A022.A0J;
        AnonymousClass00B.A06(r0);
        r12.A03(r0);
        AnonymousClass00B.A06(r0);
        A022.A09.A04(r0.A0D);
        C43251zh r02 = A022.A0K;
        AnonymousClass00B.A06(r02);
        r02.A02();
        return A022;
    }

    public void A05(AnonymousClass1ZR r29, C41681wN r30) {
        String str;
        byte[] bArr;
        AnonymousClass1ZR r0 = r29;
        if (r29 != null && (str = r0.A0W) != null && (bArr = r0.A0U) != null) {
            C16180sb r2 = this.A01;
            String obj = UUID.randomUUID().toString();
            File file = r2.A05().A0Q;
            C16180sb.A04(file, false);
            AnonymousClass00B.A06(obj);
            File A002 = C16180sb.A00(file, obj);
            try {
                AnonymousClass1XI.A0G(A002, bArr);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(A002.getAbsolutePath(), options);
                Pair pair = new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
                C30771cv r7 = new C30771cv();
                r7.A01 = ((Number) pair.second).intValue();
                r7.A00 = ((Number) pair.first).intValue();
                r7.A06 = A002.getName();
                C41681wN r02 = r30;
                if (r02.A00 == 1 && str.equals(r02.A05)) {
                    r02.A00 = 2;
                    if (r02.A06) {
                        r02.A03 = r7;
                    }
                }
                C38231qS r11 = new C38231qS((AnonymousClass1XM) null, (AnonymousClass21D) null, AnonymousClass1XK.A0H, A002, (String) null, (String) null, "mms", (int[]) null, 0, 0, 0, true, true, false, false);
                C18210wK r10 = this.A08;
                String obj2 = UUID.randomUUID().toString();
                AnonymousClass1OJ r9 = r10.A0J;
                C31781f1 A022 = r9.A02(obj2, 2);
                if (A022 == null) {
                    A022 = r9.A01(obj2, 2);
                }
                C43251zh r72 = new C43251zh(A022, r9, r10.A0Q, false);
                r72.A03((byte) 0, 0, false);
                AnonymousClass21A r6 = new AnonymousClass21A(A022, r72);
                C31771f0 r73 = new C31771f0(new C43261zi(r11.A05), r6.A00, r11, new AnonymousClass1XJ(false, false, true));
                C43251zh r92 = r6.A01;
                r92.A03((byte) -1, 0, true);
                r92.A06(r73.A04);
                long currentTimeMillis = System.currentTimeMillis();
                if (r02.A00 == 2 && str.equals(r02.A05)) {
                    r02.A00 = 3;
                    AnonymousClass21F r22 = r02.A02;
                    if (r22 != null) {
                        r02.A0D.A09(r22.A01);
                    }
                    r02.A02 = null;
                    r02.A02 = new AnonymousClass21F(r02, r6, str);
                }
                C27411Rq r8 = this.A0E;
                StringBuilder sb = new StringBuilder("mediauploadqueue/enqueue ");
                sb.append(r73);
                Log.i(sb.toString());
                ((C31681er) r8.A01(r6, r73)).A0H.A03(new AnonymousClass21G(pair, r02, this, r6, A002, str, currentTimeMillis), this.A0K);
            } catch (IOException e2) {
                Log.w(String.format("MediaJobManager/writeLinkThumbnailFileAsLocalResource create thumbnail fail at %s.", new Object[]{A002}), e2);
                AnonymousClass1XI.A0N(A002);
            }
        }
    }

    public void A06(AnonymousClass1XP r4) {
        r4.A02 = true;
        C27401Rp r2 = this.A0B;
        r2.A05.A00(r4.A01().A05).A05(r4);
        r2.A03.A05(r4);
        r2.A04.A05(r4);
        C27411Rq r1 = this.A0E;
        r1.A05(r4);
        AnonymousClass21A r0 = r4.A01;
        if (r0 != null) {
            r1.A05(r0);
        }
    }

    public void A07(AnonymousClass1XP r2) {
        AnonymousClass21B r0 = (AnonymousClass21B) r2.A0H.A00();
        if (r0 != null) {
            A0C(r2, r0);
            return;
        }
        AnonymousClass21C r02 = (AnonymousClass21C) r2.A0D.A00();
        if (r02 != null) {
            A0B(r2, r02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.A0H.A00() != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.AnonymousClass1XP r4, int r5) {
        /*
            r3 = this;
            X.1XS r0 = r4.A0D
            java.lang.Object r0 = r0.A00()
            r2 = 1
            if (r0 != 0) goto L_0x0012
            X.1XS r0 = r4.A0H
            java.lang.Object r1 = r0.A00()
            r0 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.AnonymousClass00B.A0G(r0)
            if (r5 != r2) goto L_0x0035
            X.1XS r0 = r4.A08
            java.lang.Object r0 = r0.A00()
            X.21L r0 = (X.AnonymousClass21L) r0
            if (r0 == 0) goto L_0x0035
            java.io.File r1 = r0.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0035
            boolean r0 = X.AnonymousClass1XI.A0N(r1)
            if (r0 == 0) goto L_0x0035
            r1.getAbsolutePath()
        L_0x0035:
            X.1XS r1 = r4.A0A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18220wL.A08(X.1XP, int):void");
    }

    public void A09(AnonymousClass1XP r7, C31771f0 r8) {
        C27411Rq r2 = this.A0E;
        StringBuilder sb = new StringBuilder("mediauploadqueue/enqueue ");
        sb.append(r8);
        Log.i(sb.toString());
        C31681er r4 = (C31681er) r2.A01(r7, r8);
        C43251zh r1 = r7.A0K;
        AnonymousClass00B.A06(r1);
        r1.A06(r4.A0U.A04);
        boolean z2 = true;
        if (r8.A00() != 3) {
            z2 = false;
            r4.A0D.A03(r7.A0P, this.A0K);
        }
        AnonymousClass21H r12 = new AnonymousClass21H(this, r7, r8, r4);
        Executor executor = this.A0K;
        r4.A0H.A03(r12, executor);
        r4.A0F.A03(new AnonymousClass3HH(this, r7), (Executor) null);
        if (!z2) {
            r4.A0G.A03(r7.A0Q, executor);
        }
        r4.A0E.A03(r7.A0M, executor);
    }

    public final void A0A(AnonymousClass1XP r4, AnonymousClass213 r5) {
        r5.A02.A03(r4.A0N, (Executor) null);
        r5.A03.A03(r4.A0O, (Executor) null);
        r5.A04.A03(new IDxNConsumerShape15S0300000_1_I0(r4, this, r5, 1), (Executor) null);
        r5.A01.A03(new IDxNConsumerShape39S0200000_2_I0(r4, 3, this), (Executor) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r4 != null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass1XP r6, X.AnonymousClass21C r7) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A0S
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x0012
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0013
            r0 = 1
        L_0x000f:
            r5.A08(r6, r0)
        L_0x0012:
            return
        L_0x0013:
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x0048
            byte[] r4 = r7.A03
            X.1qS r0 = r6.A00()
            X.1f0 r3 = new X.1f0
            r3.<init>(r6, r0)
            X.210 r0 = r6.A01()
            X.1XK r2 = r0.A05
            X.1XL r0 = r6.A0L
            X.1XJ r0 = r0.A02
            boolean r1 = r0.A01
            X.1qS r0 = r6.A00()
            int[] r0 = r0.A0E
            boolean r0 = r5.A0E(r2, r0, r1)
            if (r0 == 0) goto L_0x0046
            if (r4 == 0) goto L_0x003e
        L_0x003c:
            r6.A03 = r4
        L_0x003e:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x004b
            r5.A09(r6, r3)
            return
        L_0x0046:
            r4 = 0
            goto L_0x003c
        L_0x0048:
            r0 = 20
            goto L_0x000f
        L_0x004b:
            java.lang.String r1 = "mediatranscodequeue/success/all-cancelled "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18220wL.A0B(X.1XP, X.21C):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r7 == 0) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012f, code lost:
        com.whatsapp.util.Log.e("ReferenceCountedFileManager/moveFile/file-not-found", r1);
        r0 = 7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x010e */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba A[Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9 A[Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00de A[Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012e A[Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }, ExcHandler: FileNotFoundException (r1v12 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE, Catch:{  }]), Splitter:B:56:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015a A[Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.AnonymousClass1XP r18, X.AnonymousClass21B r19) {
        /*
            r17 = this;
            r3 = r18
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A0T
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = r3.A0U
            r4 = r17
            r5 = r19
            if (r0 != 0) goto L_0x001c
            int r0 = r5.A00
            if (r0 == 0) goto L_0x001c
            r4.A08(r3, r0)
        L_0x001b:
            return
        L_0x001c:
            int r7 = r5.A00
            r0 = 12
            r10 = 0
            if (r7 != r0) goto L_0x0055
            X.1f0 r0 = r5.A01
            X.1qS r0 = r0.A02
            X.1XK r6 = r0.A05
            java.io.File r2 = r0.A06
            X.AnonymousClass00B.A06(r2)
            X.1ez r1 = r5.A02
            monitor-enter(r1)
            java.lang.String r0 = r1.A0B     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0037:
            monitor-exit(r1)
            X.1x7 r9 = new X.1x7
            r9.<init>(r6, r2, r0, r10)
            X.0so r8 = r4.A00
            X.0xJ r6 = r4.A0G
            X.0xK r2 = r4.A0I
            X.0xL r1 = r4.A0F
            X.0xM r0 = new X.0xM
            r0.<init>(r8, r1, r6, r2)
            X.1x9 r1 = r0.A00(r9)
            if (r1 == 0) goto L_0x0055
            X.1XS r0 = r3.A05
            r0.A04(r1)
        L_0x0055:
            java.lang.Object r9 = r3.A0R
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ all -> 0x0203 }
            r1.<init>()     // Catch:{ all -> 0x0203 }
            X.1XS r0 = r3.A07     // Catch:{ all -> 0x0203 }
            r0.A04(r1)     // Catch:{ all -> 0x0203 }
            int r8 = r1.get()     // Catch:{ all -> 0x0203 }
            boolean r0 = r5.A05     // Catch:{ all -> 0x0203 }
            r2 = 1
            if (r0 == 0) goto L_0x006e
            r0 = 1
            if (r7 != 0) goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            if (r8 <= 0) goto L_0x0176
            if (r0 != 0) goto L_0x0176
            X.1f0 r0 = r5.A01     // Catch:{ all -> 0x0203 }
            X.1qS r1 = r0.A02     // Catch:{ all -> 0x0203 }
            java.io.File r12 = r1.A06     // Catch:{ all -> 0x0203 }
            X.AnonymousClass00B.A06(r12)     // Catch:{ all -> 0x0203 }
            A00(r12)     // Catch:{ all -> 0x0203 }
            java.io.File r6 = r5.A03     // Catch:{ all -> 0x0203 }
            A00(r6)     // Catch:{ all -> 0x0203 }
            if (r6 == 0) goto L_0x009a
            long r15 = r6.length()     // Catch:{ all -> 0x0203 }
            X.AnonymousClass00B.A06(r12)     // Catch:{ all -> 0x0203 }
            long r13 = r12.length()     // Catch:{ all -> 0x0203 }
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = "mediajobmanager/handleMediaUploadResponse/upload dedup with wrong size"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0203 }
        L_0x009a:
            X.01Z r14 = r4.A03     // Catch:{ all -> 0x0203 }
            X.AnonymousClass00B.A06(r12)     // Catch:{ all -> 0x0203 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0203 }
            if (r6 == 0) goto L_0x00e0
            boolean r0 = r6.exists()     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x00e0
            X.21L r0 = new X.21L     // Catch:{ all -> 0x0203 }
            r0.<init>(r6, r2)     // Catch:{ all -> 0x0203 }
        L_0x00b0:
            android.util.Pair r6 = android.util.Pair.create(r11, r0)     // Catch:{ all -> 0x0203 }
        L_0x00b4:
            java.lang.Object r11 = r6.second     // Catch:{ all -> 0x0203 }
            X.21L r11 = (X.AnonymousClass21L) r11     // Catch:{ all -> 0x0203 }
            if (r11 == 0) goto L_0x00de
            java.io.File r0 = r11.A01     // Catch:{ all -> 0x0203 }
        L_0x00bc:
            A00(r0)     // Catch:{ all -> 0x0203 }
            java.lang.Object r0 = r6.first     // Catch:{ all -> 0x0203 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0203 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x0158
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0203 }
            r1.<init>()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/failed to move file; mediaJob="
            r1.append(r0)     // Catch:{ all -> 0x0203 }
            r1.append(r3)     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0203 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0203 }
            goto L_0x014e
        L_0x00de:
            r0 = 0
            goto L_0x00bc
        L_0x00e0:
            r6 = 0
            X.0sb r13 = r14.A00     // Catch:{ IOException -> 0x013d }
            boolean r0 = r13.A0T(r12)     // Catch:{ IOException -> 0x013d }
            if (r0 != 0) goto L_0x0136
            boolean r0 = r13.A0V(r12)     // Catch:{ IOException -> 0x013d }
            if (r0 != 0) goto L_0x0136
            X.1XK r15 = r1.A05     // Catch:{ all -> 0x0203 }
            int r1 = r1.A01     // Catch:{ all -> 0x0203 }
            X.0u3 r0 = r14.A05     // Catch:{ all -> 0x0203 }
            java.io.File r1 = X.C17970vw.A0B(r13, r0, r15, r12, r1)     // Catch:{ all -> 0x0203 }
            boolean r0 = r13.A0U(r12)     // Catch:{ IOException -> 0x010e, FileNotFoundException -> 0x012e }
            if (r0 == 0) goto L_0x010e
            X.01a r14 = r14.A03     // Catch:{ IOException -> 0x010e, FileNotFoundException -> 0x012e }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ IOException -> 0x010e, FileNotFoundException -> 0x012e }
            int r0 = r14.A00(r0)     // Catch:{ IOException -> 0x010e, FileNotFoundException -> 0x012e }
            int r0 = r0 + 1
            if (r0 != r8) goto L_0x010e
            goto L_0x0114
        L_0x010e:
            X.0tB r0 = r13.A04     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }
            X.AnonymousClass1XI.A0B(r0, r12, r1)     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }
            goto L_0x0119
        L_0x0114:
            X.0tB r0 = r13.A04     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }
            X.AnonymousClass1XI.A0C(r0, r12, r1)     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }
        L_0x0119:
            X.21L r0 = new X.21L     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }
            r0.<init>(r1, r10)     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }
            android.util.Pair r6 = android.util.Pair.create(r11, r0)     // Catch:{ FileNotFoundException -> 0x012e, IOException -> 0x0123 }
            goto L_0x00b4
        L_0x0123:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/copy-failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0203 }
            android.util.Pair r6 = android.util.Pair.create(r11, r6)     // Catch:{ all -> 0x0203 }
            goto L_0x00b4
        L_0x012e:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/file-not-found"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0203 }
            r0 = 7
            goto L_0x0144
        L_0x0136:
            X.21L r0 = new X.21L     // Catch:{ all -> 0x0203 }
            r0.<init>(r12, r10)     // Catch:{ all -> 0x0203 }
            goto L_0x00b0
        L_0x013d:
            r1 = move-exception
            java.lang.String r0 = "ReferenceCountedFileManager/moveFile/inmediafolder/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0203 }
            r0 = 3
        L_0x0144:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0203 }
            android.util.Pair r6 = android.util.Pair.create(r0, r6)     // Catch:{ all -> 0x0203 }
            goto L_0x00b4
        L_0x014e:
            if (r7 != 0) goto L_0x0158
            java.lang.Object r0 = r6.first     // Catch:{ all -> 0x0203 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0203 }
            int r7 = r0.intValue()     // Catch:{ all -> 0x0203 }
        L_0x0158:
            if (r11 == 0) goto L_0x0176
            java.util.concurrent.atomic.AtomicInteger r6 = r11.A03     // Catch:{ all -> 0x0203 }
            int r1 = r6.get()     // Catch:{ all -> 0x0203 }
            r0 = 0
            if (r1 != 0) goto L_0x0164
            r0 = 1
        L_0x0164:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0203 }
            X.1XS r0 = r3.A08     // Catch:{ all -> 0x0203 }
            r0.A04(r11)     // Catch:{ all -> 0x0203 }
            int r0 = r6.get()     // Catch:{ all -> 0x0203 }
            if (r0 != r8) goto L_0x0173
            r10 = 1
        L_0x0173:
            X.AnonymousClass00B.A0G(r10)     // Catch:{ all -> 0x0203 }
        L_0x0176:
            monitor-exit(r9)     // Catch:{ all -> 0x0203 }
            if (r7 != 0) goto L_0x01dd
            X.1f0 r0 = r5.A01
            X.1qS r0 = r0.A02
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x01dd
            X.1ez r6 = r5.A02
            java.lang.String r0 = r6.A06()
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01a2 }
            r1.<init>(r0)     // Catch:{ MalformedURLException -> 0x01a2 }
            java.lang.String r0 = r1.getHost()     // Catch:{ MalformedURLException -> 0x01a2 }
            if (r0 == 0) goto L_0x019c
            java.lang.String r0 = r1.getHost()     // Catch:{ MalformedURLException -> 0x01a2 }
            int r0 = r0.length()     // Catch:{ MalformedURLException -> 0x01a2 }
            if (r0 != 0) goto L_0x01c7
        L_0x019c:
            java.lang.String r0 = "mediaupload/url/no-host"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ MalformedURLException -> 0x01a2 }
            goto L_0x01a8
        L_0x01a2:
            r1 = move-exception
            java.lang.String r0 = "mediaupload/url/error "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x01a8:
            java.lang.String r0 = "app/mediajobmanager/handleMediaUploadResponse/url/error; url="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r6.A06()
            r1.append(r0)
            java.lang.String r0 = "; mediaJob="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r7 = 19
        L_0x01c7:
            boolean r0 = r5.A04
            if (r0 != 0) goto L_0x01dd
            java.lang.String r1 = "app/mediajobmanager/handleMediaUploadResponse/results not received; mediaJob="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r7 = 3
        L_0x01dd:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x01e2
            r2 = r7
        L_0x01e2:
            r3.A00 = r2
            if (r2 != 0) goto L_0x01f9
            byte[] r0 = r3.A03
            if (r0 == 0) goto L_0x01f9
            r0 = 10
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r2 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0
            r2.<init>(r3, r0)
            java.util.concurrent.Executor r1 = r4.A0K
            X.1XS r0 = r3.A0E
            r0.A03(r2, r1)
            return
        L_0x01f9:
            X.1XS r1 = r3.A0A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A04(r0)
            return
        L_0x0203:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0203 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18220wL.A0C(X.1XP, X.21B):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        if (r7 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bb, code lost:
        if (r6 == null) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.AnonymousClass1XP r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r1 = "app/mediajobmanager/enqueuemediaupload "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.210 r4 = r10.A01()
            X.1XK r5 = r4.A05
            boolean r8 = r4.A0G
            boolean r7 = r4.A0C
            java.io.File r6 = r4.A07
            if (r8 == 0) goto L_0x0047
            X.1QT r0 = r9.A0D
            boolean r0 = r0.A08(r5, r6)
            if (r0 != 0) goto L_0x0047
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload we cannot transcode media that needs transcoding "
        L_0x002e:
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 21
        L_0x003d:
            X.1XS r1 = r10.A0A
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04(r0)
            return
        L_0x0047:
            X.1XK r3 = X.AnonymousClass1XK.A08
            if (r5 != r3) goto L_0x005c
            java.lang.String r0 = r4.A0A
            byte r1 = X.C17970vw.A00(r0)
            r0 = -1
            if (r1 != r0) goto L_0x005c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "app/mediajobmanager/enqueuemediaupload we are unable to determine the mimetype of this document "
            goto L_0x002e
        L_0x005c:
            X.1XS r0 = r10.A0D
            java.lang.Object r0 = r0.A00()
            java.lang.String r2 = " "
            if (r0 == 0) goto L_0x006a
            r9.A07(r10)
            return
        L_0x006a:
            if (r8 != 0) goto L_0x00a1
            boolean r0 = X.C31831f6.A04(r5)
            if (r0 != 0) goto L_0x00a1
            X.1QT r0 = r9.A0D
            boolean r0 = r0.A09(r5, r6)
            if (r0 != 0) goto L_0x00a1
            if (r7 == 0) goto L_0x00bb
            if (r6 != 0) goto L_0x00be
            java.lang.String r0 = "app/mediajobmanager queuing media into upload queue with null file, media_type="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = "; media_name="
            r1.append(r0)
            java.lang.String r0 = r4.A0B
            r1.append(r0)
            r1.append(r2)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 7
            goto L_0x003d
        L_0x00a1:
            if (r7 == 0) goto L_0x00bb
        L_0x00a3:
            X.210 r1 = r10.A01()
            X.1Rp r0 = r9.A0B
            X.213 r2 = r0.A00(r10, r1)
            X.1zh r1 = r10.A0K
            X.AnonymousClass00B.A06(r1)
            X.211 r0 = r2.A00
            r1.A05(r0)
            r9.A0A(r10, r2)
            return
        L_0x00bb:
            if (r6 != 0) goto L_0x00be
            goto L_0x00a3
        L_0x00be:
            if (r5 != r3) goto L_0x00e2
            java.lang.String r0 = r4.A0A
            boolean r0 = X.AnonymousClass1A9.A0T(r0)
            if (r0 == 0) goto L_0x00e2
            X.0pd r2 = r9.A05
            r1 = 2425(0x979, float:3.398E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00e2
            X.210 r1 = r10.A01()
            X.1Rp r0 = r9.A0B
            X.213 r0 = r0.A00(r10, r1)
            r9.A0A(r10, r0)
            return
        L_0x00e2:
            X.1qS r1 = r10.A00()
            X.1f0 r0 = new X.1f0
            r0.<init>(r10, r1)
            r9.A09(r10, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18220wL.A0D(X.1XP, java.lang.String):void");
    }

    public boolean A0E(AnonymousClass1XK r4, int[] iArr, boolean z2) {
        C14710pd r2 = this.A05;
        C16620tM r1 = C16620tM.A02;
        if (r2.A0E(r1, 247) && r4 == AnonymousClass1XK.A08) {
            return true;
        }
        if (r2.A0E(r1, 246)) {
            return ((r4 == AnonymousClass1XK.A0B && (iArr == null || iArr.length < 2)) || r4 == AnonymousClass1XK.A0X || r4 == AnonymousClass1XK.A04) && z2;
        }
        return false;
    }
}
