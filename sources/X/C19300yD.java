package X;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.redex.IDxDListenerShape33S0300000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.obwhatsapp.push.RegistrationIntentService;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.IDxATaskShape26S0200000_2_I0;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0yD  reason: invalid class name and case insensitive filesystem */
public class C19300yD extends C18940xV {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass12E A02;
    public final C208811y A03;
    public final C16040sK A04;
    public final AnonymousClass01Z A05;
    public final AnonymousClass127 A06;
    public final C18930xU A07;
    public final C16000sG A08;
    public final AnonymousClass1HT A09;
    public final AnonymousClass17V A0A;
    public final AnonymousClass1H9 A0B;
    public final C16980tz A0C;
    public final C15860rz A0D;
    public final AnonymousClass1HI A0E;
    public final AnonymousClass1HU A0F;
    public final AnonymousClass1GG A0G;
    public final AnonymousClass1HR A0H;
    public final C20070zS A0I;
    public final AnonymousClass126 A0J;
    public final C216114t A0K;
    public final C16460t6 A0L;
    public final AnonymousClass1HK A0M;
    public final AnonymousClass186 A0N;
    public final C17580vJ A0O;
    public final C17590vK A0P;
    public final C18030w2 A0Q;
    public final C14710pd A0R;
    public final C19430yQ A0S;
    public final C215914r A0T;
    public final C19200xv A0U;
    public final C209212c A0V;
    public final AnonymousClass1HP A0W;
    public final AnonymousClass1HN A0X;
    public final AnonymousClass1HJ A0Y;
    public final AnonymousClass1HO A0Z;
    public final C19090xk A0a;
    public final AnonymousClass1HL A0b;
    public final AnonymousClass17L A0c;
    public final C222517f A0d;
    public final AnonymousClass0y3 A0e;
    public final AnonymousClass124 A0f;
    public final AnonymousClass1HH A0g;
    public final C14770pj A0h;
    public final AnonymousClass1HS A0i;
    public final C209712h A0j;
    public final AnonymousClass1HQ A0k;
    public final AnonymousClass125 A0l;
    public final C222617g A0m;
    public final C229319v A0n;
    public final AnonymousClass1HM A0o;
    public final C18050w4 A0p;
    public final AnonymousClass15O A0q;
    public final C223017k A0r;
    public final AnonymousClass1A9 A0s;
    public final C16320sq A0t;

    public C19300yD(AnonymousClass12E r2, C208811y r3, C16040sK r4, AnonymousClass01Z r5, AnonymousClass127 r6, C18930xU r7, C16000sG r8, AnonymousClass1HT r9, AnonymousClass17V r10, AnonymousClass1H9 r11, C16980tz r12, C15860rz r13, AnonymousClass1HI r14, AnonymousClass1HU r15, AnonymousClass1GG r16, AnonymousClass1HR r17, C20070zS r18, AnonymousClass126 r19, C216114t r20, C16460t6 r21, AnonymousClass1HK r22, AnonymousClass186 r23, C17580vJ r24, C17590vK r25, C18030w2 r26, C14710pd r27, C19430yQ r28, C215914r r29, C19200xv r30, C209212c r31, AnonymousClass1HP r32, AnonymousClass1HN r33, AnonymousClass1HJ r34, AnonymousClass1HO r35, C19090xk r36, AnonymousClass1HL r37, AnonymousClass17L r38, C222517f r39, AnonymousClass0y3 r40, AnonymousClass124 r41, AnonymousClass1HH r42, C14770pj r43, AnonymousClass1HS r44, C209712h r45, AnonymousClass1HQ r46, AnonymousClass125 r47, C222617g r48, C229319v r49, AnonymousClass1HM r50, C18050w4 r51, AnonymousClass15O r52, C223017k r53, AnonymousClass1A9 r54, C16320sq r55) {
        this.A0C = r12;
        this.A0R = r27;
        this.A04 = r4;
        this.A0t = r55;
        this.A0A = r10;
        this.A0f = r41;
        this.A07 = r7;
        this.A0d = r39;
        this.A08 = r8;
        this.A0Q = r26;
        this.A0s = r54;
        this.A0a = r36;
        this.A03 = r3;
        this.A0m = r48;
        this.A0n = r49;
        this.A0l = r47;
        this.A0q = r52;
        this.A0L = r21;
        this.A0O = r24;
        this.A0Y = r34;
        this.A0U = r30;
        this.A0B = r11;
        this.A0r = r53;
        this.A0J = r19;
        this.A06 = r6;
        this.A0M = r22;
        this.A0c = r38;
        this.A0e = r40;
        this.A0T = r29;
        this.A0b = r37;
        this.A0h = r43;
        this.A0p = r51;
        this.A0D = r13;
        this.A0V = r31;
        this.A0o = r50;
        this.A0X = r33;
        this.A0Z = r35;
        this.A0W = r32;
        this.A0S = r28;
        this.A0G = r16;
        this.A0P = r25;
        this.A0k = r46;
        this.A0N = r23;
        this.A0K = r20;
        this.A0j = r45;
        this.A05 = r5;
        this.A0H = r17;
        this.A0i = r44;
        this.A09 = r9;
        this.A02 = r2;
        this.A0E = r14;
        this.A0F = r15;
        this.A0g = r42;
        this.A0I = r18;
    }

    public static boolean A00(C16740tZ r3) {
        if (!(r3 instanceof C39381sO)) {
            return (r3 instanceof AnonymousClass1WU) && ((AnonymousClass1WU) r3).A00 == 42;
        }
        C39381sO r32 = (C39381sO) r3;
        int i2 = r32.A00;
        return i2 == 65 || i2 == 66 || !r32.A01;
    }

    public void A04(C15830rv r2) {
        this.A09.A00.remove(r2);
    }

    public void A05(C16740tZ r7, int i2) {
        byte b2;
        if (r7.A0X != null && !this.A01 && (b2 = r7.A10) != 8 && b2 != 10 && System.currentTimeMillis() - r7.A0I > 900000) {
            this.A01 = true;
            AnonymousClass1HL r5 = this.A0b;
            if (r5.A00()) {
                C15860rz r4 = this.A0D;
                AnonymousClass01D r3 = r4.A01;
                r4.A0K().putInt("logins_with_messages", ((SharedPreferences) r3.get()).getInt("logins_with_messages", 0) + 1).apply();
                ((SharedPreferences) r3.get()).getInt("logins_with_messages", 0);
                if (!r5.A00()) {
                    this.A0a.A06();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02cb, code lost:
        if (r4.A00 == false) goto L_0x02cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03a1, code lost:
        if (r4.A00 == false) goto L_0x03a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C16740tZ r20, int r21) {
        /*
            r19 = this;
            r7 = r20
            r0 = 29
            r1 = r21
            if (r1 == r0) goto L_0x041d
            r11 = 0
            if (r20 == 0) goto L_0x0121
            X.1Vw r0 = r7.A11
            X.0rv r6 = r0.A00
        L_0x000f:
            r5 = 1
            r4 = r19
            if (r20 == 0) goto L_0x0266
            byte r9 = r7.A10
            r0 = 8
            if (r9 == r0) goto L_0x0266
            r8 = 10
            if (r9 == r8) goto L_0x0266
            boolean r0 = X.C38621r6.A0o(r7)
            if (r0 != 0) goto L_0x0266
            com.whatsapp.jid.UserJid r10 = r7.A0C()
            boolean r0 = r7.A1B
            if (r0 == 0) goto L_0x0111
            X.0zS r3 = r4.A0I
            r2 = 16
        L_0x0030:
            r3.A01(r10, r11, r2)
            X.126 r3 = r4.A0J
            r2 = 14
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r7, r2, r4)
            r3.A01(r0, r8)
            X.1Vw r10 = r7.A11
            boolean r0 = r10.A02
            r8 = 0
            if (r0 != 0) goto L_0x01c2
            X.0sK r0 = r4.A04
            boolean r0 = X.C38621r6.A0T(r0, r7)
            if (r0 != 0) goto L_0x01c2
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r7.A0I
            long r2 = r2 - r0
            X.14t r0 = r4.A0K
            X.0sH r14 = r0.A01(r6)
            X.0rv r0 = r7.A0B()
            com.whatsapp.jid.UserJid r12 = com.whatsapp.jid.UserJid.of(r0)
            X.125 r1 = r4.A0l
            int r0 = r1.A00(r6, r12)
            if (r0 < 0) goto L_0x0073
            r1.A06(r6, r12)
            X.127 r0 = r4.A06
            r0.A04(r6)
        L_0x0073:
            boolean r0 = r14.A0J()
            if (r0 != 0) goto L_0x0107
            boolean r0 = X.C16030sJ.A0Q(r6)
            if (r0 != 0) goto L_0x0107
            r11 = r14
        L_0x0080:
            java.lang.String r0 = r7.A0l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "msgadded/from_name is empty  jid:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r6)
            java.lang.String r0 = " message:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00a1:
            if (r11 == 0) goto L_0x00c3
            java.lang.String r0 = r7.A0l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c3
            java.lang.String r1 = r7.A0l
            java.lang.String r0 = r11.A0W
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00c3
            r11.A0W = r1
            X.11y r10 = r4.A03
            r1 = 19
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r11, r1, r4)
            r10.A01(r0)
        L_0x00c3:
            java.lang.String r13 = r7.A0h
            com.whatsapp.jid.UserJid r11 = r7.A0C()
            if (r13 == 0) goto L_0x00da
            boolean r0 = r11 instanceof X.AnonymousClass1ZX
            if (r0 == 0) goto L_0x00da
            X.11y r10 = r4.A03
            r1 = 2
            com.facebook.redex.RunnableRunnableShape0S1200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S1200000_I0
            r0.<init>(r11, r13, r4, r1)
            r10.A01(r0)
        L_0x00da:
            r4.A0D(r7)
            r4.A0C(r7)
            r4.A0A(r7)
            X.0tZ r0 = r7.A0D()
            if (r0 == 0) goto L_0x00ec
            r4.A0A(r0)
        L_0x00ec:
            boolean r0 = r7 instanceof X.C39061rr
            if (r0 == 0) goto L_0x0296
            boolean r0 = r14.A0J()
            if (r0 != 0) goto L_0x00fa
            com.whatsapp.jid.UserJid r12 = com.whatsapp.jid.UserJid.of(r6)
        L_0x00fa:
            if (r12 == 0) goto L_0x0296
            r0 = r7
            X.1rr r0 = (X.C39061rr) r0
            int r13 = r0.A00
            long r0 = r0.A01
            X.1HS r11 = r4.A0i
            monitor-enter(r11)
            goto L_0x0124
        L_0x0107:
            if (r12 == 0) goto L_0x0080
            X.0sG r0 = r4.A08
            X.0sH r11 = r0.A0A(r12)
            goto L_0x0080
        L_0x0111:
            r0 = 1024(0x400, float:1.435E-42)
            boolean r0 = r7.A10(r0)
            X.0zS r3 = r4.A0I
            r2 = 15
            if (r0 == 0) goto L_0x0030
            r2 = 14
            goto L_0x0030
        L_0x0121:
            r6 = r11
            goto L_0x000f
        L_0x0124:
            X.0wS r10 = r11.A06     // Catch:{ all -> 0x01bf }
            X.19r r10 = r10.A03()     // Catch:{ all -> 0x01bf }
            X.2Ir r14 = r10.AEf()     // Catch:{ all -> 0x01bf }
            X.0w8 r10 = r11.A05     // Catch:{ all -> 0x01bf }
            r18 = r10
            boolean r10 = r18.A09()     // Catch:{ all -> 0x01bf }
            if (r10 == 0) goto L_0x0144
            if (r14 == 0) goto L_0x0144
            boolean r10 = r14.AHb()     // Catch:{ all -> 0x01bf }
            if (r10 == 0) goto L_0x0144
            r11.A00(r12, r13, r8)     // Catch:{ all -> 0x01bf }
            goto L_0x0199
        L_0x0144:
            X.0wT r15 = r11.A03     // Catch:{ all -> 0x01bf }
            android.content.SharedPreferences r13 = r15.A01()     // Catch:{ all -> 0x01bf }
            java.lang.String r14 = "payments_inviter_jids_with_expiry"
            java.lang.String r10 = ""
            java.lang.String r10 = r13.getString(r14, r10)     // Catch:{ all -> 0x01bf }
            java.util.Map r10 = r15.A07(r10)     // Catch:{ all -> 0x01bf }
            java.lang.Object r13 = r10.get(r12)     // Catch:{ all -> 0x01bf }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x01bf }
            if (r13 == 0) goto L_0x0166
            long r16 = r13.longValue()     // Catch:{ all -> 0x01bf }
            int r13 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0180
        L_0x0166:
            java.lang.Long r13 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01bf }
            r10.put(r12, r13)     // Catch:{ all -> 0x01bf }
            android.content.SharedPreferences r13 = r15.A01()     // Catch:{ all -> 0x01bf }
            android.content.SharedPreferences$Editor r13 = r13.edit()     // Catch:{ all -> 0x01bf }
            java.lang.String r10 = X.C18300wT.A00(r10)     // Catch:{ all -> 0x01bf }
            android.content.SharedPreferences$Editor r10 = r13.putString(r14, r10)     // Catch:{ all -> 0x01bf }
            r10.apply()     // Catch:{ all -> 0x01bf }
        L_0x0180:
            boolean r10 = r18.A09()     // Catch:{ all -> 0x01bf }
            if (r10 != 0) goto L_0x0199
            X.0t3 r10 = r11.A01     // Catch:{ all -> 0x01bf }
            long r13 = r10.A00()     // Catch:{ all -> 0x01bf }
            int r10 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r10 >= 0) goto L_0x0196
            r0 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r0 = r0 + r13
        L_0x0196:
            r15.A0C(r8, r0)     // Catch:{ all -> 0x01bf }
        L_0x0199:
            X.0wU r0 = r11.A04     // Catch:{ all -> 0x01bf }
            X.1HQ r0 = r0.A0H     // Catch:{ all -> 0x01bf }
            X.1Nw r13 = r0.A01     // Catch:{ all -> 0x01bf }
            java.lang.String r14 = r12.getRawString()     // Catch:{ all -> 0x01bf }
            monitor-enter(r13)     // Catch:{ all -> 0x01bf }
            X.1Nx r12 = r13.A01     // Catch:{ all -> 0x01bc }
            X.2Is r10 = r12.A00()     // Catch:{ all -> 0x01bc }
            long r0 = r10.A00     // Catch:{ all -> 0x01bc }
            r15 = 1
            long r0 = r0 + r15
            r10.A00 = r0     // Catch:{ all -> 0x01bc }
            java.util.Set r0 = r10.A0D     // Catch:{ all -> 0x01bc }
            r0.add(r14)     // Catch:{ all -> 0x01bc }
            r12.A01(r10)     // Catch:{ all -> 0x01bc }
            monitor-exit(r13)     // Catch:{ all -> 0x01bf }
            goto L_0x0295
        L_0x01bc:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01bf }
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x01c2:
            boolean r0 = r7.A1D
            if (r0 == 0) goto L_0x01ce
            r4.A0C(r7)
            r4.A0D(r7)
            goto L_0x0320
        L_0x01ce:
            r0 = -1
            r3 = 6
            if (r1 == r0) goto L_0x01d5
            r0 = 7
            if (r1 != r0) goto L_0x01de
        L_0x01d5:
            int r0 = r7.A0C
            if (r0 == r3) goto L_0x01de
            X.0y3 r0 = r4.A0e
            r0.A01(r7)
        L_0x01de:
            X.17k r11 = r4.A0r
            boolean r0 = r11.A00(r7)
            if (r0 == 0) goto L_0x01ea
            boolean r0 = r7.A0u
            if (r0 == 0) goto L_0x01f8
        L_0x01ea:
            r0 = 16
            if (r1 != r0) goto L_0x020b
            boolean r0 = r7 instanceof X.AnonymousClass1WU
            if (r0 == 0) goto L_0x020b
            boolean r0 = A00(r7)
            if (r0 != 0) goto L_0x020b
        L_0x01f8:
            X.0pj r9 = r4.A0h
            android.os.Handler r2 = r9.A01()
            r1 = 29
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r9, r6, r7, r1)
            r2.post(r0)
            r9.A0B(r7, r8, r5)
        L_0x020b:
            r0 = 81
            boolean r0 = r11.A01(r7, r0)
            if (r0 != 0) goto L_0x021b
            r0 = 82
            boolean r0 = r11.A01(r7, r0)
            if (r0 == 0) goto L_0x0233
        L_0x021b:
            X.0pd r2 = r4.A0R
            r1 = 982(0x3d6, float:1.376E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0233
            X.0sq r2 = r4.A0t
            r1 = 16
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r7, r1, r4)
            r2.Acl(r0)
        L_0x0233:
            boolean r0 = r7 instanceof X.C39291sE
            if (r0 == 0) goto L_0x0243
            r0 = r7
            X.1sE r0 = (X.C39291sE) r0
            X.1ci r1 = r0.A04
            if (r1 == 0) goto L_0x0256
            X.124 r0 = r4.A0f
            r0.A02(r1)
        L_0x0243:
            boolean r0 = r7 instanceof X.C38641rB
            if (r0 == 0) goto L_0x0325
            r2 = r7
            X.1rB r2 = (X.C38641rB) r2
            X.1HM r1 = r4.A0o
            com.facebook.redex.IDxCallbackShape70S0200000_2_I0 r0 = new com.facebook.redex.IDxCallbackShape70S0200000_2_I0
            r0.<init>(r4, r8, r2)
            r1.A00(r2, r0)
            goto L_0x0325
        L_0x0256:
            int r0 = r0.A00
            if (r0 != r3) goto L_0x0243
            X.17f r9 = r4.A0d
            java.lang.String r3 = r10.A01
            long r0 = r7.A16
            X.0rv r2 = r10.A00
            r9.A02(r2, r3, r0)
            goto L_0x0243
        L_0x0266:
            boolean r0 = r7 instanceof X.C38771rO
            if (r0 != 0) goto L_0x0325
            boolean r0 = r7 instanceof X.C38831rU
            if (r0 == 0) goto L_0x0325
            X.0sK r1 = r4.A04
            r0 = r7
            X.1rU r0 = (X.C38831rU) r0
            boolean r0 = X.C38621r6.A0V(r1, r0)
            if (r0 == 0) goto L_0x028e
            X.0pj r3 = r4.A0h
            android.os.Handler r2 = r3.A01()
            r1 = 29
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r3, r6, r7, r1)
            r2.post(r0)
            r3.A0B(r7, r5, r5)
            goto L_0x0325
        L_0x028e:
            X.0y3 r0 = r4.A0e
            r0.A01(r7)
            goto L_0x0325
        L_0x0295:
            monitor-exit(r11)
        L_0x0296:
            X.0tZ r0 = r7.A0D()
            boolean r0 = r0 instanceof X.C38641rB
            if (r0 == 0) goto L_0x02a1
            r4.A0B(r7)
        L_0x02a1:
            boolean r0 = r7 instanceof X.C38841rV
            if (r0 == 0) goto L_0x02b5
            r12 = r7
            X.1rV r12 = (X.C38841rV) r12
            long r0 = r7.A0I
            int r10 = r12.A00
            int r10 = r10 * 1000
            long r10 = (long) r10
            long r0 = r0 + r10
            X.0yQ r10 = r4.A0S
            r10.A0X(r12, r0)
        L_0x02b5:
            boolean r0 = r7 instanceof X.C39381sO
            if (r0 == 0) goto L_0x03b2
            boolean r1 = A00(r7)
        L_0x02bd:
            boolean r0 = r7.A0u
            if (r0 == 0) goto L_0x0369
            java.lang.Integer r0 = r7.A0X
            if (r0 == 0) goto L_0x02cd
            r4.A09(r2)
            boolean r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x02ce
        L_0x02cd:
            r0 = 0
        L_0x02ce:
            r4.A00 = r5
            if (r0 != 0) goto L_0x030c
            boolean r1 = com.obwhatsapp.notification.AndroidWear.A02()
            X.0pj r0 = r4.A0h
            if (r1 == 0) goto L_0x0364
            r0.A09(r6)
        L_0x02dd:
            X.0rz r0 = r4.A0D
            X.01D r0 = r0.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "conversation_sound"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x030c
            X.15O r2 = r4.A0q
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = X.AnonymousClass01S.A04
            r1.append(r0)
            r0 = 2131820550(0x7f110006, float:1.9273818E38)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.A01(r0)
        L_0x030c:
            X.1Vw r8 = r7.A0R
            if (r8 == 0) goto L_0x0320
            X.17f r3 = r4.A0d
            X.17g r2 = r4.A0m
            X.AnonymousClass00B.A06(r8)
            long r0 = r7.A0I
            X.0tZ r0 = r2.A01(r8, r9, r0)
            r3.A03(r0)
        L_0x0320:
            X.17f r0 = r4.A0d
            r0.A03(r7)
        L_0x0325:
            boolean r0 = r7 instanceof X.C38961rh
            if (r0 == 0) goto L_0x03b8
            r10 = r7
            X.1rh r10 = (X.C38961rh) r10
            X.0tZ r0 = r10.A0D()
            if (r0 == 0) goto L_0x03b8
            X.0t6 r9 = r4.A0L
            X.1Vw r1 = r0.A11
            X.0th r0 = r9.A0K
            X.0tZ r8 = r0.A03(r1)
            boolean r0 = r8 instanceof X.C30591cd
            if (r0 == 0) goto L_0x03b8
            r0 = r8
            X.1cd r0 = (X.C30591cd) r0
            X.1cf r0 = r0.AGV()
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x03b5
            java.util.Iterator r3 = r0.iterator()
        L_0x034f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03b5
            java.lang.Object r2 = r3.next()
            X.1sy r2 = (X.C39731sy) r2
            int r1 = r2.A02
            int r0 = r10.A00
            if (r1 != r0) goto L_0x034f
            r2.A01 = r5
            goto L_0x034f
        L_0x0364:
            r0.A0E(r8)
            goto L_0x02dd
        L_0x0369:
            if (r1 == 0) goto L_0x037d
            java.lang.String r1 = "msgadded/bloks_notification is true jid: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x030c
        L_0x037d:
            X.0pj r10 = r4.A0h
            android.os.Handler r11 = r10.A01()
            r1 = 29
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r10, r6, r7, r1)
            r11.post(r0)
            boolean r0 = X.C41061vA.A0I(r7)
            if (r0 != 0) goto L_0x030c
            r0 = 2
            if (r9 != r0) goto L_0x039a
            int r0 = r7.A08
            if (r0 == r5) goto L_0x030c
        L_0x039a:
            java.lang.Integer r0 = r7.A0X
            if (r0 == 0) goto L_0x03a3
            boolean r1 = r4.A00
            r0 = 1
            if (r1 != 0) goto L_0x03a4
        L_0x03a3:
            r0 = 0
        L_0x03a4:
            r10.A0B(r7, r0, r8)
            java.lang.Integer r0 = r7.A0X
            if (r0 == 0) goto L_0x030c
            r4.A00 = r5
            r4.A09(r2)
            goto L_0x030c
        L_0x03b2:
            r1 = 0
            goto L_0x02bd
        L_0x03b5:
            r9.A0a(r8)
        L_0x03b8:
            boolean r0 = X.C41061vA.A0I(r7)
            if (r0 == 0) goto L_0x03c3
            X.0w4 r0 = r4.A0p
            r0.A02(r7, r5)
        L_0x03c3:
            boolean r0 = r7 instanceof X.C38971ri
            if (r0 != 0) goto L_0x03cb
            boolean r0 = r7 instanceof X.C40261tp
            if (r0 == 0) goto L_0x03d0
        L_0x03cb:
            X.127 r0 = r4.A06
            r0.A04(r6)
        L_0x03d0:
            boolean r0 = r7 instanceof X.C39051rq
            if (r0 == 0) goto L_0x041d
            X.1rq r7 = (X.C39051rq) r7
            X.0tZ r1 = r7.A0D()
            if (r1 == 0) goto L_0x041d
            boolean r0 = r1.A0x()
            if (r0 == 0) goto L_0x041d
            X.0t6 r6 = r4.A0L
            X.1Vw r1 = r1.A11
            X.0th r0 = r6.A0K
            X.0tZ r4 = r0.A03(r1)
            if (r4 == 0) goto L_0x041d
            X.1sA r0 = r4.A0E()
            X.1sB r0 = r0.A00
            if (r0 == 0) goto L_0x041d
            X.1sA r0 = r4.A0E()
            X.1sB r0 = r0.A00
            java.util.List r0 = r0.A02
            java.util.Iterator r3 = r0.iterator()
        L_0x0402:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x041a
            java.lang.Object r2 = r3.next()
            X.1t7 r2 = (X.C39821t7) r2
            java.lang.String r1 = r2.A04
            java.lang.String r0 = r7.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0402
            r2.A00 = r5
        L_0x041a:
            r6.A0a(r4)
        L_0x041d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19300yD.A06(X.0tZ, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r1 != 13) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C16740tZ r11, int r12) {
        /*
            r10 = this;
            r3 = 13
            r7 = 0
            r5 = 1
            switch(r12) {
                case -1: goto L_0x0019;
                case 0: goto L_0x0007;
                case 1: goto L_0x00a6;
                case 2: goto L_0x0007;
                case 3: goto L_0x0115;
                case 4: goto L_0x00a6;
                case 5: goto L_0x0183;
                case 6: goto L_0x0018;
                case 7: goto L_0x0007;
                case 8: goto L_0x0018;
                case 9: goto L_0x0018;
                case 10: goto L_0x0018;
                case 11: goto L_0x0018;
                case 12: goto L_0x0018;
                case 13: goto L_0x0018;
                case 14: goto L_0x01d1;
                case 15: goto L_0x01d1;
                case 16: goto L_0x0018;
                case 17: goto L_0x0007;
                case 18: goto L_0x0018;
                case 19: goto L_0x0018;
                case 20: goto L_0x0007;
                case 21: goto L_0x0018;
                case 22: goto L_0x0007;
                case 23: goto L_0x0018;
                case 24: goto L_0x0019;
                case 25: goto L_0x01de;
                case 26: goto L_0x01f1;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r1 = "app/messagechanged unknown type "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0018:
            return
        L_0x0019:
            int r1 = r11.A0C
            r0 = 5
            if (r1 != r0) goto L_0x0031
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = r11.A10(r0)
            if (r0 == 0) goto L_0x0031
            X.0sq r2 = r10.A0t
            r1 = 4
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r0.<init>((java.lang.Object) r10, (int) r12, (java.lang.Object) r11, (int) r1)
            r2.Acl(r0)
        L_0x0031:
            X.1Vw r2 = r11.A11
            boolean r5 = r2.A02
            if (r5 == 0) goto L_0x005e
            r0 = 24
            if (r12 == r0) goto L_0x0045
            int r1 = r11.A0C
            boolean r0 = X.C42881yp.A01(r1)
            if (r0 != 0) goto L_0x0045
            if (r1 != r3) goto L_0x005e
        L_0x0045:
            X.0rv r1 = r2.A00
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 != 0) goto L_0x005e
            boolean r0 = X.C16030sJ.A0G(r1)
            if (r0 != 0) goto L_0x005e
            X.0sq r2 = r10.A0t
            r1 = 5
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0
            r0.<init>((java.lang.Object) r10, (int) r12, (java.lang.Object) r11, (int) r1)
            r2.Acl(r0)
        L_0x005e:
            X.1GG r0 = r10.A0G
            X.0tz r0 = r0.A00
            android.content.Context r4 = r0.A00
            java.lang.Class<X.01F> r3 = X.AnonymousClass01F.class
            java.lang.Object r0 = X.C004501y.A00(r3, r4)
            X.01F r0 = (X.AnonymousClass01F) r0
            X.0sX r0 = (X.C16150sX) r0
            X.01J r0 = r0.A62
            java.lang.Object r0 = r0.get()
            X.1Hr r0 = (X.C24891Hr) r0
            X.0pd r2 = r0.A00
            r1 = 823(0x337, float:1.153E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0018
            if (r5 == 0) goto L_0x0018
            int r0 = r11.A0C
            boolean r0 = X.C42881yp.A01(r0)
            if (r0 == 0) goto L_0x0018
            X.21U r0 = r11.A0J
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = X.C004501y.A00(r3, r4)
            X.01F r0 = (X.AnonymousClass01F) r0
            X.0sX r0 = (X.C16150sX) r0
            X.01J r0 = r0.A6B
            java.lang.Object r1 = r0.get()
            X.0zP r1 = (X.C20040zP) r1
            X.21U r0 = r11.A0J
            r1.A03(r0)
            return
        L_0x00a6:
            X.1Vw r2 = r11.A11
            byte r1 = r11.A10
            boolean r0 = X.C38621r6.A0N(r1)
            if (r0 != 0) goto L_0x00c0
            boolean r0 = X.C30921dB.A00(r1)
            if (r0 != 0) goto L_0x00c0
            r0 = 44
            if (r1 == r0) goto L_0x00c0
            X.0y3 r0 = r10.A0e
            r0.A01(r11)
            return
        L_0x00c0:
            X.1HO r1 = r10.A0Z
            X.0rv r0 = r2.A00
            X.AnonymousClass00B.A06(r0)
            X.2IZ r1 = r1.A00(r0)
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.A01     // Catch:{ all -> 0x01fa }
            boolean r0 = r0.containsKey(r2)     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x00df
            r1.toString()     // Catch:{ all -> 0x01fa }
            X.1HO r0 = r1.A02     // Catch:{ all -> 0x01fa }
            X.0y3 r0 = r0.A00     // Catch:{ all -> 0x01fa }
            r0.A01(r11)     // Catch:{ all -> 0x01fa }
            goto L_0x00ea
        L_0x00df:
            r1.toString()     // Catch:{ all -> 0x01fa }
            java.util.HashSet r0 = r1.A00     // Catch:{ all -> 0x01fa }
            r0.add(r2)     // Catch:{ all -> 0x01fa }
            r1.A00()     // Catch:{ all -> 0x01fa }
        L_0x00ea:
            monitor-exit(r1)
            boolean r0 = r11 instanceof X.C38641rB
            if (r0 == 0) goto L_0x0018
            X.1rB r11 = (X.C38641rB) r11
            X.1HM r1 = r10.A0o
            X.1jm r4 = r11.A1A()
            java.lang.String r0 = r4.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0018
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x0112
            X.13k r3 = r1.A00
        L_0x0105:
            X.1WA r2 = r3.A09
            r1 = 37
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r3, r1, r4)
            r2.execute(r0)
            return
        L_0x0112:
            X.13k r3 = r1.A01
            goto L_0x0105
        L_0x0115:
            boolean r0 = r11 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0018
            X.0tY r11 = (X.C16730tY) r11
            X.0ta r1 = r11.A02
            if (r1 == 0) goto L_0x0018
            boolean r0 = r1.A0P
            if (r0 == 0) goto L_0x0018
            X.1Vw r0 = r11.A11
            X.0rv r3 = r0.A00
            boolean r0 = X.C16030sJ.A0Q(r3)
            if (r0 != 0) goto L_0x0018
            java.io.File r4 = r1.A0F
            if (r4 == 0) goto L_0x0159
            X.1A9 r1 = r10.A0s
            X.0sb r0 = r1.A01     // Catch:{ IOException -> 0x0147 }
            boolean r0 = r0.A0W(r4)     // Catch:{ IOException -> 0x0147 }
            if (r0 == 0) goto L_0x0159
            X.0tz r0 = r1.A04     // Catch:{ IOException -> 0x0147 }
            android.content.Context r1 = r0.A00     // Catch:{ IOException -> 0x0147 }
            android.net.Uri r0 = android.net.Uri.fromFile(r4)     // Catch:{ IOException -> 0x0147 }
            X.C17970vw.A0K(r1, r0)     // Catch:{ IOException -> 0x0147 }
            goto L_0x0159
        L_0x0147:
            r2 = move-exception
            java.lang.String r1 = "mediafileurils/broadcastscanmediaintent/unable to scan file "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0159:
            X.12E r0 = r10.A02
            X.1yO r0 = r0.A00()
            boolean r0 = r0.A01(r3)
            if (r0 != 0) goto L_0x0018
            byte r1 = r11.A10
            r0 = 2
            if (r1 != r0) goto L_0x01fd
            int r0 = r11.A08
            if (r0 != r5) goto L_0x01fd
            X.0pj r1 = r10.A0h
            java.lang.Integer r0 = r11.A0X
            if (r0 == 0) goto L_0x0179
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x0179
            r7 = 1
        L_0x0179:
            r1.A0B(r11, r7, r5)
            java.lang.Integer r0 = r11.A0X
            if (r0 == 0) goto L_0x0018
            r10.A00 = r5
            return
        L_0x0183:
            X.126 r2 = r10.A0J
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r1 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r1.<init>(r11, r3, r10)
            r0 = 7
            r2.A01(r1, r0)
            X.0pj r3 = r10.A0h
            android.os.Handler r2 = r3.A01()
            r1 = 10
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r3, r1, r11)
            r2.post(r0)
            r3.A0B(r11, r7, r5)
            boolean r0 = r11 instanceof X.C38841rV
            if (r0 == 0) goto L_0x01b5
            long r2 = r11.A0I
            r4 = r11
            X.1rV r4 = (X.C38841rV) r4
            int r0 = r4.A00
            int r0 = r0 * 1000
            long r0 = (long) r0
            long r2 = r2 + r0
            X.0yQ r0 = r10.A0S
            r0.A0X(r4, r2)
        L_0x01b5:
            X.0tZ r0 = r11.A0D()
            boolean r0 = r0 instanceof X.C38641rB
            if (r0 == 0) goto L_0x01c0
            r10.A0B(r11)
        L_0x01c0:
            boolean r0 = r11 instanceof X.C38971ri
            if (r0 == 0) goto L_0x0018
            X.127 r1 = r10.A06
            X.1Vw r0 = r11.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            r1.A04(r0)
            return
        L_0x01d1:
            X.0sq r2 = r10.A0t
            r1 = 15
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r0 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0
            r0.<init>(r11, r1, r10)
            r2.Acl(r0)
            return
        L_0x01de:
            boolean r4 = X.C218615s.A02(r11)
            X.1HK r3 = r10.A0M
            X.1Vw r2 = r11.A11
            r1 = 9
            X.2C0 r0 = new X.2C0
            r0.<init>(r10, r4)
            r3.A01(r0, r2, r1)
            return
        L_0x01f1:
            X.1HK r2 = r10.A0M
            X.1Vw r1 = r11.A11
            r0 = 0
            r2.A01(r0, r1, r3)
            return
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x01fd:
            X.0pj r3 = r10.A0h
            r4 = 0
            r6 = 1
            r8 = 1
            r9 = 1
            r3.A0C(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19300yD.A07(X.0tZ, int):void");
    }

    public void A08(Collection collection, Map map) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass1HT r2 = this.A09;
            C15830rv r1 = ((C16740tZ) it.next()).A11.A00;
            AnonymousClass00B.A06(r1);
            r2.A00.remove(r1);
        }
    }

    public final void A09(long j2) {
        String obj;
        C229319v r3 = this.A0n;
        if (!r3.A02 && j2 > 900000 && this.A0b.A00()) {
            RegistrationIntentService.A02(this.A0C.A00);
            try {
                ActivityManager A032 = this.A0B.A00.A03();
                if (A032 == null) {
                    obj = "app/logprocess am=null";
                } else {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = A032.getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ActivityManager.RunningAppProcessInfo next = it.next();
                            if (TextUtils.equals(next.processName, "com.google.process.gapps")) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("app/logprocess/procinfo ");
                                sb.append(next.processName);
                                sb.append(' ');
                                sb.append(next.pid);
                                obj = sb.toString();
                                break;
                            }
                        }
                    }
                    r3.A02 = true;
                }
                Log.i(obj);
            } catch (Exception e2) {
                Log.w("app/logprocess/error", e2);
            }
            r3.A02 = true;
        }
    }

    public final void A0A(C16740tZ r9) {
        AnonymousClass1Vt r0;
        C35361lo A012;
        C14710pd r1 = this.A0R;
        C16620tM r2 = C16620tM.A02;
        if ((r1.A0E(r2, 605) || r1.A0E(r2, 629)) && (r0 = r9.A0L) != null && (A012 = r0.A01()) != null) {
            C209712h r6 = this.A0j;
            if (!r6.A05.A0E(r2, 1084) || A012.A02(r6.A00.A0A()).exists()) {
                C15860rz r5 = r6.A02;
                if (r5.A0J("payment_backgrounds_batch_last_fetch_timestamp") == -1) {
                    r6.A0D.Ack(new IDxATaskShape26S0200000_2_I0((Object) null, 3, r6), new Void[0]);
                } else if (!A012.A02(r6.A00.A0A()).exists()) {
                    r5.A1R(true);
                }
            } else {
                r6.A0C.A03(A012, r6.A0A);
            }
        }
    }

    public final void A0B(C16740tZ r6) {
        String str;
        C16730tY r4 = (C16730tY) r6.A0D();
        if (r4 != null) {
            C16460t6 r0 = this.A0L;
            C16740tZ A032 = r0.A0K.A03(r4.A11);
            if (A032 == null) {
                this.A0U.A00(new C47362Iq(this, r6), r4, 1, false);
                return;
            }
            if (A032 instanceof C16730tY) {
                C30701co A033 = this.A0V.A03((C16730tY) A032);
                if (A033 != null) {
                    A033.A4Z(new IDxDListenerShape33S0300000_2_I0(this, r6, r4, 0));
                    return;
                }
                str = "MainMessageObserver/downloadQuotedMessageForSticker original downloader is null";
            } else {
                StringBuilder sb = new StringBuilder("MainMessageObserver/downloadQuotedMessageForSticker originalMessage not mediaMessage: ");
                sb.append(A032.getClass().getName());
                str = sb.toString();
            }
            Log.e(str);
        }
    }

    public final void A0C(C16740tZ r4) {
        C16320sq r2;
        int i2;
        if (r4 instanceof C16730tY) {
            r2 = this.A0t;
            i2 = 17;
        } else if (!(r4 instanceof C30581cc) || r4.A0U == null) {
            if (r4 instanceof C30571cb) {
                r2 = this.A0t;
                i2 = 18;
            }
            this.A0t.Acl(new RunnableRunnableShape2S0200000_I0(r4, 15, this));
        } else {
            AnonymousClass1HP r1 = this.A0W;
            if (r1.A01(r4)) {
                r1.A06.A06(r4, 1);
            }
            this.A0t.Acl(new RunnableRunnableShape2S0200000_I0(r4, 15, this));
        }
        r2.Acl(new RunnableRunnableShape2S0200000_I0(r4, i2, this));
        this.A0t.Acl(new RunnableRunnableShape2S0200000_I0(r4, 15, this));
    }

    public final void A0D(C16740tZ r6) {
        C208811y r4;
        RunnableRunnableShape0S0300000_I0 runnableRunnableShape0S0300000_I0;
        if (this.A04.A0G()) {
            C28381Vw r1 = r6.A11;
            if (r1.A02) {
                C15830rv r2 = r1.A00;
                UserJid nullable = UserJid.getNullable(r6.A0o);
                if ((r2 instanceof AnonymousClass1ZX) && (nullable instanceof AnonymousClass1ZT)) {
                    r4 = this.A03;
                    runnableRunnableShape0S0300000_I0 = new RunnableRunnableShape0S0300000_I0(this, r2, nullable, 3);
                    r4.A01(runnableRunnableShape0S0300000_I0);
                }
                return;
            }
        }
        if (!r6.A11.A02) {
            UserJid nullable2 = UserJid.getNullable(r6.A0p);
            UserJid A0C2 = r6.A0C();
            if ((A0C2 instanceof AnonymousClass1ZX) && (nullable2 instanceof AnonymousClass1ZT)) {
                r4 = this.A03;
                runnableRunnableShape0S0300000_I0 = new RunnableRunnableShape0S0300000_I0(this, A0C2, nullable2, 3);
                r4.A01(runnableRunnableShape0S0300000_I0);
            }
        }
    }
}
