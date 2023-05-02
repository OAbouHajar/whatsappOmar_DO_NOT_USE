package X;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape0S1300000_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.01Y  reason: invalid class name */
public class AnonymousClass01Y {
    public C46242Dd A00;
    public boolean A01;
    public boolean A02;
    public final AnonymousClass15J A03;
    public final C16300so A04;
    public final AnonymousClass154 A05;
    public final C208811y A06;
    public final C14870pt A07;
    public final C15900s5 A08;
    public final C16600tK A09;
    public final AnonymousClass155 A0A;
    public final AnonymousClass15K A0B;
    public final C16000sG A0C;
    public final C17140ub A0D;
    public final AnonymousClass156 A0E;
    public final C17030uP A0F;
    public final C16080sP A0G;
    public final AnonymousClass15I A0H;
    public final C16440t3 A0I;
    public final C15860rz A0J;
    public final AnonymousClass013 A0K;
    public final C16460t6 A0L;
    public final AnonymousClass153 A0M;
    public final C19780yz A0N;
    public final C17290uq A0O;
    public final C17580vJ A0P;
    public final C17590vK A0Q;
    public final C14710pd A0R;
    public final C20260zl A0S;
    public final C16490t9 A0T;
    public final C17190ug A0U;
    public final C19830z4 A0V;
    public final AnonymousClass122 A0W;
    public final C216014s A0X;
    public final C16320sq A0Y;
    public final Set A0Z = new HashSet();

    public AnonymousClass01Y(AnonymousClass15J r2, C16300so r3, AnonymousClass154 r4, C208811y r5, C14870pt r6, C15900s5 r7, C16600tK r8, AnonymousClass155 r9, AnonymousClass15K r10, C16000sG r11, C17140ub r12, AnonymousClass156 r13, C17030uP r14, C16080sP r15, AnonymousClass15I r16, C16440t3 r17, C15860rz r18, AnonymousClass013 r19, C16460t6 r20, AnonymousClass153 r21, C19780yz r22, C17290uq r23, C17580vJ r24, C17590vK r25, C14710pd r26, C20260zl r27, C16490t9 r28, C17190ug r29, C19830z4 r30, AnonymousClass122 r31, C216014s r32, C16320sq r33) {
        this.A0I = r17;
        this.A03 = r2;
        this.A07 = r6;
        this.A04 = r3;
        this.A0Y = r33;
        this.A0O = r23;
        this.A08 = r7;
        this.A0X = r32;
        this.A0S = r27;
        this.A0U = r29;
        this.A0G = r15;
        this.A0C = r11;
        this.A0K = r19;
        this.A06 = r5;
        this.A0D = r12;
        this.A0L = r20;
        this.A0P = r24;
        this.A0N = r22;
        this.A09 = r8;
        this.A0H = r16;
        this.A0J = r18;
        this.A0W = r31;
        this.A0Q = r25;
        this.A0E = r13;
        this.A0A = r9;
        this.A05 = r4;
        this.A0B = r10;
        this.A0T = r28;
        this.A0R = r26;
        this.A0F = r14;
        this.A0V = r30;
        this.A0M = r21;
    }

    public static int A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2046991529:
                    if (str.equals("overflow_menu_report")) {
                        return 17;
                    }
                    break;
                case -1882719533:
                    if (str.equals("account_info_report")) {
                        return 18;
                    }
                    break;
                case -1877536428:
                    if (str.equals("1_1_spam_banner_block")) {
                        return 14;
                    }
                    break;
                case -1501490119:
                    if (str.equals("notification_block")) {
                        return 23;
                    }
                    break;
                case -1421455676:
                    if (str.equals("biz_spam_banner_block")) {
                        return 15;
                    }
                    break;
                case -1286292841:
                    if (str.equals("message_menu")) {
                        return 10;
                    }
                    break;
                case -936237837:
                    if (str.equals("chat_list_block")) {
                        return 20;
                    }
                    break;
                case -715645275:
                    if (str.equals("triggered_block")) {
                        return 4;
                    }
                    break;
                case -172298781:
                    if (str.equals("call_log")) {
                        return 6;
                    }
                    break;
                case 3052376:
                    if (str.equals("chat")) {
                        return 1;
                    }
                    break;
                case 246732493:
                    if (str.equals("media_viewer")) {
                        return 11;
                    }
                    break;
                case 497826894:
                    if (str.equals("chat_list_noinsub_block")) {
                        return 21;
                    }
                    break;
                case 733327640:
                    if (str.equals("block_header_chat")) {
                        return 16;
                    }
                    break;
                case 1091102592:
                    if (str.equals("account_info")) {
                        return 5;
                    }
                    break;
                case 1245526844:
                    if (str.equals("1_1_old_spam_banner_block")) {
                        return 13;
                    }
                    break;
                case 1581966858:
                    if (str.equals("overflow_menu_block")) {
                        return 12;
                    }
                    break;
            }
        }
        return 0;
    }

    public static int A01(String str) {
        switch (str.hashCode()) {
            case -449631153:
                if (str.equals("otp_did_not_request")) {
                    return 5;
                }
                break;
            case -119378578:
                if (str.equals("offensive_messages")) {
                    return 4;
                }
                break;
            case 3536713:
                if (str.equals("spam")) {
                    return 3;
                }
                break;
            case 291932813:
                if (str.equals("no_longer_needed")) {
                    return 1;
                }
                break;
            case 1245889503:
                if (str.equals("no_sign_up")) {
                    return 2;
                }
                break;
        }
        return 0;
    }

    public static void A02(C19780yz r8, C20260zl r9, C16490t9 r10, C15830rv r11, C16320sq r12, Integer num, Integer num2) {
        C42601y5.A01(r8, r9, r10, r11, r12, num, num2, 1);
    }

    public static boolean A03(C20260zl r0) {
        return r0.A00();
    }

    public final UserJid A04() {
        synchronized (this) {
            for (UserJid userJid : this.A0Z) {
                if (userJid.getType() == 7) {
                    return userJid;
                }
            }
            return null;
        }
    }

    public final UserJid A05(UserJid userJid) {
        if (C16030sJ.A0O(userJid)) {
            return this.A0P.A00((AnonymousClass1ZT) userJid);
        }
        if (C16030sJ.A0M(userJid)) {
            return this.A0P.A01((AnonymousClass1ZX) userJid);
        }
        return null;
    }

    public Boolean A06(C15830rv r2) {
        if (this.A0N.A01(r2) == null) {
            return null;
        }
        return Boolean.valueOf(!this.A0O.A05(r2));
    }

    public List A07(C15830rv r10) {
        String A002;
        ArrayList arrayList = new ArrayList();
        C19780yz r3 = this.A0N;
        for (Pair pair : r3.A04(r10, 5)) {
            C16740tZ r6 = (C16740tZ) pair.first;
            C46252De r2 = new C46252De();
            if (r6 instanceof C30591cd) {
                A002 = ((C30591cd) r6).AGV().A04;
            } else {
                if (r6 instanceof C16830ti) {
                    A002 = this.A0M.A00(r6);
                    if (A002 == null) {
                    }
                }
                r2.A02 = r3.A06(r10, r6.A0I);
                r2.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toHours(r6.A0I) * TimeUnit.HOURS.toSeconds(1));
                arrayList.add(r2);
            }
            r2.A01 = A002;
            r2.A02 = r3.A06(r10, r6.A0I);
            r2.A00 = Long.valueOf(TimeUnit.MILLISECONDS.toHours(r6.A0I) * TimeUnit.HOURS.toSeconds(1));
            arrayList.add(r2);
        }
        return arrayList;
    }

    public synchronized Set A08() {
        return new HashSet(this.A0Z);
    }

    public synchronized Set A09() {
        HashSet hashSet;
        UserJid A052;
        Set<UserJid> set = this.A0Z;
        hashSet = new HashSet(set);
        for (UserJid userJid : set) {
            if ((userJid instanceof AnonymousClass1ZT) && (A052 = A05(userJid)) != null) {
                hashSet.remove(A052);
            }
        }
        return hashSet;
    }

    public void A0A() {
        HashSet hashSet;
        synchronized (this) {
            Set set = this.A0Z;
            hashSet = new HashSet(set);
            set.clear();
            A0B();
            this.A06.A01(new RunnableRunnableShape4S0100000_I0_3(this, 20));
        }
        A0P(hashSet);
    }

    public void A0B() {
        C15860rz r1 = this.A0J;
        r1.A0r((String) null);
        r1.A0X();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (A0R() == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C() {
        /*
            r3 = this;
            boolean r0 = r3.A0S()
            r2 = 0
            if (r0 == 0) goto L_0x000e
            boolean r0 = r3.A0R()
            r1 = 1
            if (r0 != 0) goto L_0x0017
        L_0x000e:
            r1 = 0
            X.155 r0 = r3.A0A
            r0.A07()
            r0.A08(r2)
        L_0x0017:
            boolean r0 = r3.A0T()
            if (r0 == 0) goto L_0x0032
            if (r1 == 0) goto L_0x002f
            X.0s5 r1 = r3.A08
            X.0tC r0 = X.C15910s6.A19
            int r1 = r1.A02(r0)
            X.155 r0 = r3.A0A
            int r0 = r0.A01()
            if (r1 <= r0) goto L_0x0032
        L_0x002f:
            r3.A0D()
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01Y.A0C():void");
    }

    public final synchronized void A0D() {
        C46242Dd r3 = this.A00;
        if (r3 == null) {
            r3 = new C46242Dd(this.A0A, this.A0I, this.A0U);
            this.A00 = r3;
        }
        r3.A00();
    }

    public final void A0E(Activity activity, AnonymousClass1ZI r5, AnonymousClass1ZJ r6) {
        this.A03.A00(activity, new C46222Da(activity, r5, this, r6), r6.A03());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (r0 == false) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(android.app.Activity r16, X.AnonymousClass1ZI r17, X.AnonymousClass1ZJ r18, boolean r19) {
        /*
            r15 = this;
            r12 = r18
            r11 = r17
            boolean r3 = r12.A03()
            java.lang.String r1 = r12.A02()
            r8 = 0
            if (r1 == 0) goto L_0x00ba
            int r0 = A01(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x0017:
            X.15I r0 = r15.A0H
            com.whatsapp.jid.UserJid r6 = r12.A00()
            r0.A0A(r6, r2, r3)
            X.0tK r0 = r15.A09
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0042
            r10 = r16
            if (r17 != 0) goto L_0x0031
            X.2Dj r11 = new X.2Dj
            r11.<init>(r10, r15, r3)
        L_0x0031:
            X.156 r0 = r15.A0E
            X.26U r13 = r0.A00(r6)
            X.154 r9 = r15.A05
            r14 = r19
            X.25z r0 = r9.A00(r10, r11, r12, r13, r14)
            r0.A01()
        L_0x0042:
            if (r3 == 0) goto L_0x008f
            X.0zl r4 = r15.A0S
            boolean r0 = X.C40561uK.A01(r4, r6)
            if (r0 == 0) goto L_0x007d
            java.lang.String r3 = r12.A01()
            java.lang.String r0 = "account_info"
            boolean r2 = r0.equals(r3)
            r0 = 1
            if (r2 != 0) goto L_0x0062
            java.lang.String r0 = "chat"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00aa
            r0 = 2
        L_0x0062:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x0066:
            if (r1 == 0) goto L_0x006f
            int r0 = r1.hashCode()
            switch(r0) {
                case -612071747: goto L_0x00a0;
                case -174614655: goto L_0x0098;
                case 133626717: goto L_0x0090;
                default: goto L_0x006f;
            }
        L_0x006f:
            r2 = 0
        L_0x0070:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            X.0sq r7 = r15.A0Y
            X.0t9 r5 = r15.A0T
            X.0yz r3 = r15.A0N
            A02(r3, r4, r5, r6, r7, r8, r9)
        L_0x007d:
            java.lang.String r0 = r12.A01()
            X.0z4 r3 = r15.A0V
            java.lang.Integer r0 = X.C19830z4.A02(r0)
            int r2 = r0.intValue()
            r0 = 6
            r3.A08(r6, r1, r2, r0)
        L_0x008f:
            return
        L_0x0090:
            java.lang.String r0 = "suspicious"
            boolean r0 = r1.equals(r0)
            r2 = 3
            goto L_0x00a7
        L_0x0098:
            java.lang.String r0 = "too_many_messages"
            boolean r0 = r1.equals(r0)
            r2 = 2
            goto L_0x00a7
        L_0x00a0:
            java.lang.String r0 = "messages_not_helpful"
            boolean r0 = r1.equals(r0)
            r2 = 1
        L_0x00a7:
            if (r0 != 0) goto L_0x0070
            goto L_0x006f
        L_0x00aa:
            java.lang.String r0 = "biz_spam_banner_block"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0066
            X.0rz r0 = r15.A0J
            r0.A0c()
            r0 = 15
            goto L_0x0062
        L_0x00ba:
            r2 = r8
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01Y.A0F(android.app.Activity, X.1ZI, X.1ZJ, boolean):void");
    }

    public final void A0G(Activity activity, AnonymousClass1ZI r14, C16010sH r15, String str, String str2, String str3, boolean z2, boolean z3) {
        C16010sH r1 = r15;
        UserJid userJid = (UserJid) r15.A08(UserJid.class);
        AnonymousClass00B.A06(userJid);
        Activity activity2 = activity;
        boolean z4 = z2;
        A0E(activity2, z3 ? new AnonymousClass2Db(activity2, r14, this, r15, z4) : new C46232Dc(r14), new AnonymousClass1ZJ(r1, userJid, (!z2 || str == null) ? null : A06(userJid), str, str2, str3, (List) null, z4));
    }

    public void A0H(Activity activity, AnonymousClass1ZI r4, UserJid userJid) {
        A0E(activity, r4, new AnonymousClass1ZJ(userJid, false));
    }

    public void A0I(Activity activity, C16010sH r13, UserJid userJid, String str, String str2, String str3) {
        A0F(activity, (AnonymousClass1ZI) null, new AnonymousClass1ZJ(r13, userJid, str != null ? A06(userJid) : null, str, str2, str3, A0U(r13, true) ? A07(userJid) : null, true), false);
    }

    public void A0J(Activity activity, C16010sH r11, String str, boolean z2) {
        A0G(activity, (AnonymousClass1ZI) null, r11, (String) null, (String) null, str, false, z2);
    }

    public void A0K(Activity activity, UserJid userJid) {
        A0H(activity, (AnonymousClass1ZI) null, userJid);
    }

    public final void A0L(UserJid userJid, String str, boolean z2) {
        A0M(userJid, z2);
        if (this.A0B.A01(userJid, z2)) {
            this.A0J.A0r(str);
        }
        this.A07.A0K(new RunnableRunnableShape3S0200000_I0_1(this, 28, userJid));
    }

    public void A0M(UserJid userJid, boolean z2) {
        this.A0L.A0w(this.A0W.A01(userJid, this.A0I.A00(), z2), -1);
    }

    public void A0N(AnonymousClass273 r9) {
        C16440t3 r4 = this.A0I;
        C14870pt r2 = this.A07;
        C16300so r1 = this.A04;
        C17190ug r6 = this.A0U;
        new C46262Df(r1, r2, this, r4, this.A0J, r6, r9).A00();
        if (this.A0S.A00()) {
            new AnonymousClass2Di(new C46272Dg(this), r6).A00();
        }
    }

    public synchronized void A0O(String str, Map map, Set set) {
        UserJid A042;
        synchronized (this) {
            HashSet hashSet = new HashSet();
            Set set2 = set;
            HashSet hashSet2 = new HashSet(set);
            Set set3 = this.A0Z;
            hashSet2.removeAll(set3);
            HashSet hashSet3 = new HashSet(set3);
            hashSet3.removeAll(set);
            if (A03(this.A0S) && (A042 = A04()) != null) {
                hashSet3.remove(A042);
                set.add(A042);
            }
            hashSet.addAll(hashSet2);
            hashSet.addAll(hashSet3);
            boolean z2 = this.A01;
            boolean A0Q2 = A0Q();
            this.A01 = true;
            C208811y r3 = this.A06;
            r3.A01(new RunnableRunnableShape3S0200000_I0_1(this, 29, map));
            if (!hashSet.isEmpty()) {
                if (A0Q2 && z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("old block list: ");
                    sb.append(Arrays.toString(set3.toArray()));
                    Log.e(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("new block list: ");
                    sb2.append(Arrays.toString(set.toArray()));
                    Log.e(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("added: ");
                    sb3.append(Arrays.toString(hashSet2.toArray()));
                    Log.e(sb3.toString());
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("removed: ");
                    sb4.append(Arrays.toString(hashSet3.toArray()));
                    Log.e(sb4.toString());
                    this.A04.AcB("block list de-synchronization", (hashSet2.isEmpty() || hashSet3.isEmpty()) ? !hashSet2.isEmpty() ? "Added" : "Removed" : "Added/Removed", true);
                }
                r3.A01(new RunnableRunnableShape0S1300000_I0(2, str, this, set2, hashSet));
            } else {
                this.A0J.A0m(this.A0I.A00());
                if (!A0Q2) {
                    this.A0D.A08(Collections.emptyList());
                }
            }
        }
    }

    public final void A0P(Collection collection) {
        if (!collection.isEmpty()) {
            this.A0D.A08(collection);
        }
    }

    public boolean A0Q() {
        return this.A0J.A0G() != 0;
    }

    public boolean A0R() {
        String A042 = this.A0A.A04();
        if (!TextUtils.isEmpty(A042)) {
            String A052 = this.A0K.A05();
            if (TextUtils.isEmpty(A052) || !A042.equals(A052)) {
                return false;
            }
        }
        return true;
    }

    public boolean A0S() {
        String A052 = this.A0A.A05();
        String A062 = this.A0K.A06();
        return !TextUtils.isEmpty(A062) && A062.equals(A052);
    }

    public final boolean A0T() {
        AnonymousClass155 r1 = this.A0A;
        return r1.A00() >= 0 && this.A0I.A00() >= r1.A02();
    }

    public boolean A0U(C16010sH r4, boolean z2) {
        UserJid of = r4 == null ? null : UserJid.of(r4.A07());
        return !this.A0R.A0C(978) && z2 && r4 != null && of != null && r4.A0H() && this.A0F.A02(of);
    }

    public synchronized boolean A0V(UserJid userJid) {
        return userJid == null ? false : this.A0Z.contains(userJid);
    }
}
