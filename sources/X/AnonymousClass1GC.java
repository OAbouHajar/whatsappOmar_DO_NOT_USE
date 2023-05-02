package X;

import android.util.SparseArray;

/* renamed from: X.1GC  reason: invalid class name */
public class AnonymousClass1GC {
    public final C16040sK A00;
    public final C16440t3 A01;
    public final C15810rt A02;
    public final C14710pd A03;
    public final C16490t9 A04;
    public final AnonymousClass1Q5 A05 = new AnonymousClass21P();
    public final AnonymousClass01D A06;

    public AnonymousClass1GC(C16040sK r4, C16440t3 r5, C15810rt r6, C14710pd r7, C16490t9 r8, AnonymousClass01D r9) {
        this.A01 = r5;
        this.A03 = r7;
        this.A00 = r4;
        this.A02 = r6;
        this.A04 = r8;
        this.A06 = new AnonymousClass01T((Object) null, new AnonymousClass21O(this, r9));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r0.equals(r5) == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21S A00(X.AnonymousClass1WV r19, X.C16740tZ r20, byte[] r21, boolean r22) {
        /*
            r18 = this;
            X.21S r0 = X.AnonymousClass21S.A0R
            X.1Wr r2 = r0.A0U()
            X.21T r2 = (X.AnonymousClass21T) r2
            r4 = r20
            X.0tZ r6 = r4.A0D()
            if (r6 == 0) goto L_0x00a6
            X.1Vw r0 = r4.A11
            X.0rv r0 = r0.A00
            if (r0 == 0) goto L_0x0020
            X.1Vw r7 = r6.A11
            X.0rv r5 = r7.A00
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0037
        L_0x0020:
            X.1Vw r7 = r6.A11
            X.0rv r5 = r7.A00
            java.lang.String r3 = X.C16030sJ.A03(r5)
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            r1.A0M = r3
        L_0x0037:
            boolean r0 = r6 instanceof X.C38651rC
            if (r0 != 0) goto L_0x0131
            boolean r0 = r7.A02
            r3 = r18
            if (r0 == 0) goto L_0x011e
            X.0sK r0 = r3.A00
            r0.A0B()
            X.1ZT r0 = r0.A05
        L_0x0048:
            if (r0 == 0) goto L_0x005d
            java.lang.String r5 = r0.getRawString()
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A0L = r5
        L_0x005d:
            java.lang.String r5 = r7.A01
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A0N = r5
            X.1iD r0 = r1.A0E
            if (r0 != 0) goto L_0x0074
            X.1iD r0 = X.C33211iD.A0o
        L_0x0074:
            X.1Wr r11 = r0.A0U()
            X.1iE r11 = (X.C33221iE) r11
            X.0pd r10 = r3.A03
            X.0sK r8 = r3.A00
            r9 = 0
            r15 = 1
            r17 = 0
            r13 = r9
            r14 = r9
            X.21Q r7 = new X.21Q
            r16 = r22
            r12 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r7.A00 = r15
            r3.A01(r6, r7)
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            X.1Wm r0 = r11.A02()
            X.1iD r0 = (X.C33211iD) r0
            r1.A0E = r0
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
        L_0x00a6:
            boolean r0 = r4.A0y()
            if (r0 == 0) goto L_0x00ce
            java.util.List r0 = r4.A0q
            X.AnonymousClass00B.A06(r0)
            java.util.ArrayList r5 = X.C16030sJ.A06(r0)
            r2.A03()
            X.1Wm r3 = r2.A00
            X.21S r3 = (X.AnonymousClass21S) r3
            X.1XE r1 = r3.A09
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00cb
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r3.A09 = r1
        L_0x00cb:
            X.C28591Ws.A01(r5, r1)
        L_0x00ce:
            r3 = 1
            boolean r0 = r4.A10(r3)
            if (r0 == 0) goto L_0x00f5
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            int r0 = r1.A00
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.A00 = r0
            r1.A0P = r3
            int r5 = r4.A05
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            int r0 = r1.A00
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A00 = r0
            r1.A04 = r5
        L_0x00f5:
            r0 = 262144(0x40000, float:3.67342E-40)
            boolean r0 = r4.A10(r0)
            if (r0 == 0) goto L_0x010d
            r2.A03()
            X.1Wm r5 = r2.A00
            X.21S r5 = (X.AnonymousClass21S) r5
            int r1 = r5.A00
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r5.A00 = r1
            r5.A0Q = r3
        L_0x010d:
            java.lang.String r0 = r4.A0f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a1
            java.lang.String r0 = r4.A0e
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01a1
            goto L_0x015d
        L_0x011e:
            X.0rv r1 = r6.A0B()
            if (r1 == 0) goto L_0x012b
            boolean r0 = X.C16030sJ.A0G(r1)
            if (r0 != 0) goto L_0x012b
            r5 = r1
        L_0x012b:
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r5)
            goto L_0x0048
        L_0x0131:
            X.1rC r6 = (X.C38651rC) r6
            java.lang.String r5 = r6.A00
            if (r5 == 0) goto L_0x0147
            r2.A03()
            X.1Wm r3 = r2.A00
            X.21S r3 = (X.AnonymousClass21S) r3
            int r1 = r3.A00
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 | r0
            r3.A00 = r1
            r3.A0J = r5
        L_0x0147:
            java.lang.String r5 = r6.A01
            if (r5 == 0) goto L_0x00a6
            r2.A03()
            X.1Wm r3 = r2.A00
            X.21S r3 = (X.AnonymousClass21S) r3
            int r1 = r3.A00
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r3.A00 = r1
            r3.A0K = r5
            goto L_0x00a6
        L_0x015d:
            java.lang.String r1 = r4.A0e     // Catch:{ UnsupportedEncodingException -> 0x019b }
            java.lang.String r0 = X.AnonymousClass01S.A08     // Catch:{ UnsupportedEncodingException -> 0x019b }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x019b }
            X.1Wu r5 = new X.1Wu     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r5.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r2.A03()     // Catch:{ UnsupportedEncodingException -> 0x019b }
            X.1Wm r1 = r2.A00     // Catch:{ UnsupportedEncodingException -> 0x019b }
            X.21S r1 = (X.AnonymousClass21S) r1     // Catch:{ UnsupportedEncodingException -> 0x019b }
            int r0 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r0 = r0 | 32
            r1.A00 = r0     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r1.A07 = r5     // Catch:{ UnsupportedEncodingException -> 0x019b }
            java.lang.String r5 = r4.A0f     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r2.A03()     // Catch:{ UnsupportedEncodingException -> 0x019b }
            X.1Wm r1 = r2.A00     // Catch:{ UnsupportedEncodingException -> 0x019b }
            X.21S r1 = (X.AnonymousClass21S) r1     // Catch:{ UnsupportedEncodingException -> 0x019b }
            int r0 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r0 = r0 | 16
            r1.A00 = r0     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r1.A0G = r5     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r5 = 0
            r2.A03()     // Catch:{ UnsupportedEncodingException -> 0x019b }
            X.1Wm r1 = r2.A00     // Catch:{ UnsupportedEncodingException -> 0x019b }
            X.21S r1 = (X.AnonymousClass21S) r1     // Catch:{ UnsupportedEncodingException -> 0x019b }
            int r0 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r0 = r0 | 64
            r1.A00 = r0     // Catch:{ UnsupportedEncodingException -> 0x019b }
            r1.A01 = r5     // Catch:{ UnsupportedEncodingException -> 0x019b }
            goto L_0x01a1
        L_0x019b:
            r1 = move-exception
            java.lang.String r0 = "FMessageProtocolSerializers/buildOutgoingMessageContextInfo/error Failed to parse conversion data, exception="
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01a1:
            X.21U r7 = r4.A0J
            if (r7 == 0) goto L_0x022d
            boolean r0 = r7 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x022d
            X.AnonymousClass00B.A06(r7)
            long r0 = java.lang.System.currentTimeMillis()
            boolean r5 = r7 instanceof X.AnonymousClass21V
            if (r5 == 0) goto L_0x022d
            X.21V r7 = (X.AnonymousClass21V) r7
            java.lang.String r6 = r7.A02     // Catch:{ Exception -> 0x0227 }
            java.lang.String r5 = X.AnonymousClass01S.A08     // Catch:{ Exception -> 0x0227 }
            byte[] r5 = r6.getBytes(r5)     // Catch:{ Exception -> 0x0227 }
            X.1Wu r8 = new X.1Wu     // Catch:{ Exception -> 0x0227 }
            r8.<init>(r5)     // Catch:{ Exception -> 0x0227 }
            r2.A03()     // Catch:{ Exception -> 0x0227 }
            X.1Wm r6 = r2.A00     // Catch:{ Exception -> 0x0227 }
            X.21S r6 = (X.AnonymousClass21S) r6     // Catch:{ Exception -> 0x0227 }
            int r5 = r6.A00     // Catch:{ Exception -> 0x0227 }
            r5 = r5 | 32
            r6.A00 = r5     // Catch:{ Exception -> 0x0227 }
            r6.A07 = r8     // Catch:{ Exception -> 0x0227 }
            java.lang.String r8 = r7.A03     // Catch:{ Exception -> 0x0227 }
            r2.A03()     // Catch:{ Exception -> 0x0227 }
            X.1Wm r6 = r2.A00     // Catch:{ Exception -> 0x0227 }
            X.21S r6 = (X.AnonymousClass21S) r6     // Catch:{ Exception -> 0x0227 }
            int r5 = r6.A00     // Catch:{ Exception -> 0x0227 }
            r5 = r5 | 16
            r6.A00 = r5     // Catch:{ Exception -> 0x0227 }
            r6.A0G = r8     // Catch:{ Exception -> 0x0227 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x0227 }
            long r5 = r7.A01     // Catch:{ Exception -> 0x0227 }
            long r0 = r0 - r5
            long r0 = r8.toSeconds(r0)     // Catch:{ Exception -> 0x0227 }
            int r5 = (int) r0     // Catch:{ Exception -> 0x0227 }
            r2.A03()     // Catch:{ Exception -> 0x0227 }
            X.1Wm r1 = r2.A00     // Catch:{ Exception -> 0x0227 }
            X.21S r1 = (X.AnonymousClass21S) r1     // Catch:{ Exception -> 0x0227 }
            int r0 = r1.A00     // Catch:{ Exception -> 0x0227 }
            r0 = r0 | 64
            r1.A00 = r0     // Catch:{ Exception -> 0x0227 }
            r1.A01 = r5     // Catch:{ Exception -> 0x0227 }
            java.lang.String r6 = r7.A04     // Catch:{ Exception -> 0x0227 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0227 }
            if (r0 != 0) goto L_0x0214
            r2.A03()     // Catch:{ Exception -> 0x0227 }
            X.1Wm r5 = r2.A00     // Catch:{ Exception -> 0x0227 }
            X.21S r5 = (X.AnonymousClass21S) r5     // Catch:{ Exception -> 0x0227 }
            int r1 = r5.A00     // Catch:{ Exception -> 0x0227 }
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r5.A00 = r1     // Catch:{ Exception -> 0x0227 }
            r5.A0O = r6     // Catch:{ Exception -> 0x0227 }
        L_0x0214:
            int r6 = r7.A00     // Catch:{ Exception -> 0x0227 }
            r2.A03()     // Catch:{ Exception -> 0x0227 }
            X.1Wm r5 = r2.A00     // Catch:{ Exception -> 0x0227 }
            X.21S r5 = (X.AnonymousClass21S) r5     // Catch:{ Exception -> 0x0227 }
            int r1 = r5.A00     // Catch:{ Exception -> 0x0227 }
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r5.A00 = r1     // Catch:{ Exception -> 0x0227 }
            r5.A05 = r6     // Catch:{ Exception -> 0x0227 }
            goto L_0x022d
        L_0x0227:
            r1 = move-exception
            java.lang.String r0 = "CtwaAdsEntryPoint/fillMessageE2EContextInfo/failed to fill E2E context info/exception="
            com.whatsapp.util.Log.e(r0, r1)
        L_0x022d:
            java.lang.String r0 = r4.A0k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x027e
            java.lang.String r0 = r4.A0k
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0252
            java.lang.String r6 = r4.A0k
            r2.A03()
            X.1Wm r5 = r2.A00
            X.21S r5 = (X.AnonymousClass21S) r5
            int r1 = r5.A00
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r5.A00 = r1
            r5.A0I = r6
        L_0x0252:
            java.lang.String r0 = r4.A0j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x026c
            java.lang.String r6 = r4.A0j
            r2.A03()
            X.1Wm r5 = r2.A00
            X.21S r5 = (X.AnonymousClass21S) r5
            int r1 = r5.A00
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r5.A00 = r1
            r5.A0H = r6
        L_0x026c:
            int r6 = r4.A03
            r2.A03()
            X.1Wm r5 = r2.A00
            X.21S r5 = (X.AnonymousClass21S) r5
            int r1 = r5.A00
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r5.A00 = r1
            r5.A02 = r6
        L_0x027e:
            r9 = r19
            boolean r0 = X.C41071vB.A0N(r9, r4)
            if (r0 == 0) goto L_0x02e7
            X.AnonymousClass00B.A06(r9)
            int r5 = r9.expiration
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            int r0 = r1.A00
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.A00 = r0
            r1.A03 = r5
            long r5 = r9.ephemeralSettingTimestamp
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            int r0 = r1.A00
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.A00 = r0
            r1.A06 = r5
        L_0x02b4:
            int r1 = r9.disappearingMessagesInitiator
            if (r1 != 0) goto L_0x0460
            X.1cJ r5 = X.C30411cJ.A01
        L_0x02ba:
            X.1cH r0 = X.C30391cH.A02
            X.1Wr r3 = r0.A0U()
            r3.A03()
            X.1Wm r1 = r3.A00
            X.1cH r1 = (X.C30391cH) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            int r0 = r5.value
            r1.A01 = r0
            X.1Wm r0 = r3.A02()
            X.1cH r0 = (X.C30391cH) r0
            r2.A03()
            X.1Wm r3 = r2.A00
            X.21S r3 = (X.AnonymousClass21S) r3
            r3.A0D = r0
            int r1 = r3.A00
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r3.A00 = r1
        L_0x02e7:
            r3 = r21
            if (r21 == 0) goto L_0x030d
            X.1Vw r0 = r4.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0H(r0)
            if (r0 == 0) goto L_0x030d
            X.AnonymousClass00B.A06(r3)
            int r1 = r3.length
            r0 = 0
            X.1Ww r3 = X.C28631Ww.A01(r3, r0, r1)
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            int r0 = r1.A00
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.A00 = r0
            r1.A08 = r3
        L_0x030d:
            X.1uH r5 = r4.A0N
            if (r5 == 0) goto L_0x0452
            X.1Wm r0 = r2.A00
            X.21S r0 = (X.AnonymousClass21S) r0
            X.21X r0 = r0.A0C
            if (r0 != 0) goto L_0x031b
            X.21X r0 = X.AnonymousClass21X.A0E
        L_0x031b:
            X.1Wr r4 = r0.A0U()
            java.lang.String r3 = r5.A09
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0336
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A0A = r3
        L_0x0336:
            java.lang.String r3 = r5.A02
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x034d
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A03 = r3
        L_0x034d:
            X.21Y r3 = X.AnonymousClass21Y.A02
            int r1 = r5.A01
            r0 = 1
            if (r1 != r0) goto L_0x0459
            X.21Y r3 = X.AnonymousClass21Y.A01
        L_0x0356:
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            int r0 = r3.value
            r1.A01 = r0
            java.lang.String r3 = r5.A08
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x037e
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            r1.A09 = r3
        L_0x037e:
            java.lang.String r3 = r5.A04
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x0395
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 16
            r1.A00 = r0
            r1.A05 = r3
        L_0x0395:
            byte[] r3 = r5.A0D
            if (r3 == 0) goto L_0x03ae
            int r1 = r3.length
            r0 = 0
            X.1Ww r3 = X.C28631Ww.A01(r3, r0, r1)
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 32
            r1.A00 = r0
            r1.A02 = r3
        L_0x03ae:
            java.lang.String r3 = r5.A05
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x03c5
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A00 = r0
            r1.A06 = r3
        L_0x03c5:
            java.lang.String r3 = r5.A06
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x03dc
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 64
            r1.A00 = r0
            r1.A07 = r3
        L_0x03dc:
            java.lang.String r3 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x03f3
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.A00 = r0
            r1.A08 = r3
        L_0x03f3:
            java.lang.String r3 = r5.A03
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x040a
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.A00 = r0
            r1.A04 = r3
        L_0x040a:
            boolean r3 = r5.A0B
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r1.A00 = r0
            r1.A0C = r3
            boolean r3 = r5.A0C
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r1.A00 = r0
            r1.A0D = r3
            boolean r3 = r5.A0A
            r4.A03()
            X.1Wm r1 = r4.A00
            X.21X r1 = (X.AnonymousClass21X) r1
            int r0 = r1.A00
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.A00 = r0
            r1.A0B = r3
            X.1Wm r0 = r4.A02()
            X.21X r0 = (X.AnonymousClass21X) r0
            r2.A03()
            X.1Wm r1 = r2.A00
            X.21S r1 = (X.AnonymousClass21S) r1
            r1.A0C = r0
            int r0 = r1.A00
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.A00 = r0
        L_0x0452:
            X.1Wm r0 = r2.A02()
            X.21S r0 = (X.AnonymousClass21S) r0
            return r0
        L_0x0459:
            r0 = 2
            if (r1 != r0) goto L_0x0356
            X.21Y r3 = X.AnonymousClass21Y.A03
            goto L_0x0356
        L_0x0460:
            if (r1 != r3) goto L_0x0466
            X.1cJ r5 = X.C30411cJ.A02
            goto L_0x02ba
        L_0x0466:
            r0 = 2
            if (r1 != r0) goto L_0x02e7
            X.1cJ r5 = X.C30411cJ.A03
            goto L_0x02ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1GC.A00(X.1WV, X.0tZ, byte[], boolean):X.21S");
    }

    public void A01(C16740tZ r6, AnonymousClass21Q r7) {
        if (r7.A07 || C30921dB.A02(r6)) {
            ((AnonymousClass1Q5) ((SparseArray) this.A06.get()).get(r6.A10, this.A05)).A5i(r6, r7, this);
            C15810rt r1 = this.A02;
            if (((r6 instanceof C39171s2) || (r6 instanceof C38791rQ) || r6.A0v || (!(r6 instanceof C38541qx) && r1.A0H(r6.A11.A00))) && !r7.A08) {
                byte[] bArr = r6.A1F;
                if (bArr != null) {
                    C33221iE r4 = r7.A04;
                    AnonymousClass21R r12 = ((C33211iD) r4.A00).A0m;
                    if (r12 == null) {
                        r12 = AnonymousClass21R.A05;
                    }
                    C28581Wr A0U = AnonymousClass21R.A05.A0U();
                    A0U.A04(r12);
                    C28631Ww A012 = C28631Ww.A01(bArr, 0, bArr.length);
                    A0U.A03();
                    AnonymousClass21R r13 = (AnonymousClass21R) A0U.A00;
                    r13.A00 |= 4;
                    r13.A02 = A012;
                    r4.A03();
                    C33211iD r2 = (C33211iD) r4.A00;
                    r2.A0m = (AnonymousClass21R) A0U.A02();
                    r2.A00 |= 67108864;
                }
            } else if (AnonymousClass1H2.A01(r6) && !r7.A08) {
                AnonymousClass1H2.A00(this.A04, "FMessageProtocolSerializers/buildE2EMessage", 1);
            }
        } else {
            throw new IllegalArgumentException("message not completely loaded");
        }
    }
}
