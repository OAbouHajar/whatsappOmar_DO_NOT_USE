package com.obwhatsapp.search;

import X.AnonymousClass013;
import X.AnonymousClass026;
import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass15X;
import X.AnonymousClass17F;
import X.AnonymousClass17S;
import X.AnonymousClass19S;
import X.AnonymousClass1BB;
import X.AnonymousClass1MW;
import X.AnonymousClass1WA;
import X.AnonymousClass2Ao;
import X.AnonymousClass2B6;
import X.AnonymousClass2B7;
import X.AnonymousClass2B8;
import X.AnonymousClass2B9;
import X.AnonymousClass2EA;
import X.AnonymousClass2UU;
import X.AnonymousClass2UX;
import X.AnonymousClass2UZ;
import X.C003401n;
import X.C003501o;
import X.C011405n;
import X.C016407u;
import X.C14710pd;
import X.C14870pt;
import X.C15800rs;
import X.C15830rv;
import X.C15860rz;
import X.C16000sG;
import X.C16080sP;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16620tM;
import X.C16730tY;
import X.C16740tZ;
import X.C16980tz;
import X.C17180uf;
import X.C18050w4;
import X.C18070w6;
import X.C18550ws;
import X.C18570wu;
import X.C18940xV;
import X.C19150xq;
import X.C216114t;
import X.C23131Ap;
import X.C23221Ay;
import X.C25781Lc;
import X.C30801cy;
import X.C34901l3;
import X.C35031lG;
import X.C49922Wr;
import X.C49932Ws;
import X.C49942Wt;
import X.C50422Zk;
import X.C51912cV;
import X.C51922cW;
import X.C55942kh;
import X.C55952ki;
import X.C55972kk;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.IDxCallbackShape187S0100000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxObserverShape36S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class SearchViewModel extends C003401n implements AnonymousClass2B8, C003501o {
    public long A00 = 0;
    public Handler A01 = new Handler(Looper.getMainLooper(), new IDxCallbackShape187S0100000_2_I0(this, 5));
    public SparseIntArray A02 = new SparseIntArray();
    public AnonymousClass028 A03;
    public AnonymousClass028 A04;
    public AnonymousClass028 A05;
    public AnonymousClass028 A06;
    public AnonymousClass028 A07;
    public AnonymousClass026 A08 = new AnonymousClass026();
    public AnonymousClass026 A09 = new AnonymousClass026();
    public AnonymousClass026 A0A = new AnonymousClass026();
    public AnonymousClass026 A0B = new AnonymousClass026();
    public AnonymousClass026 A0C = new AnonymousClass026();
    public AnonymousClass026 A0D = new AnonymousClass026();
    public AnonymousClass026 A0E = new AnonymousClass026();
    public AnonymousClass027 A0F = new AnonymousClass027();
    public AnonymousClass027 A0G = new AnonymousClass027();
    public AnonymousClass027 A0H = new AnonymousClass027();
    public C18940xV A0I = new IDxMObserverShape74S0100000_2_I0(this, 12);
    public UserJid A0J;
    public C49922Wr A0K;
    public AnonymousClass2B9 A0L = AnonymousClass2B9.A00();
    public C55942kh A0M = new C55942kh(this);
    public C55952ki A0N = new C55952ki(this);
    public C51912cV A0O = new C51912cV();
    public C35031lG A0P;
    public C30801cy A0Q = new C30801cy();
    public C30801cy A0R = new C30801cy();
    public C30801cy A0S = new C30801cy();
    public C30801cy A0T = new C30801cy();
    public C30801cy A0U = new C30801cy();
    public C30801cy A0V = new C30801cy();
    public C30801cy A0W = new C30801cy();
    public C30801cy A0X = new C30801cy();
    public C30801cy A0Y = new C30801cy();
    public C30801cy A0Z = new C30801cy();
    public Integer A0a;
    public Runnable A0b;
    public Runnable A0c;
    public String A0d;
    public List A0e = new ArrayList();
    public List A0f = new ArrayList();
    public List A0g = new ArrayList();
    public List A0h = new ArrayList();
    public Set A0i = new HashSet();
    public AtomicBoolean A0j = new AtomicBoolean();
    public boolean A0k = true;
    public final C016407u A0l;
    public final C14870pt A0m;
    public final C17180uf A0n;
    public final AnonymousClass1BB A0o;
    public final C16080sP A0p;
    public final AnonymousClass2Ao A0q;
    public final C15800rs A0r;
    public final C16440t3 A0s;
    public final C16980tz A0t;
    public final C15860rz A0u;
    public final AnonymousClass013 A0v;
    public final AnonymousClass17F A0w;
    public final C18550ws A0x;
    public final C19150xq A0y;
    public final AnonymousClass15X A0z;
    public final C18070w6 A10;
    public final C14710pd A11;
    public final C49942Wt A12;
    public final C49932Ws A13;
    public final AnonymousClass2B6 A14;
    public final AnonymousClass2UU A15;
    public final C23221Ay A16;
    public final AnonymousClass1MW A17;
    public final C18570wu A18;
    public final C25781Lc A19;
    public final AnonymousClass19S A1A;
    public final C18050w4 A1B;
    public final AnonymousClass1WA A1C;
    public final C16320sq A1D;
    public final AtomicBoolean A1E = new AtomicBoolean();

    public SearchViewModel(C016407u r45, C50422Zk r46, C14870pt r47, C17180uf r48, AnonymousClass1BB r49, C16000sG r50, C16080sP r51, AnonymousClass2Ao r52, C15800rs r53, C16440t3 r54, C16980tz r55, C15860rz r56, AnonymousClass013 r57, C216114t r58, AnonymousClass17F r59, C18550ws r60, C19150xq r61, AnonymousClass15X r62, C18070w6 r63, C14710pd r64, C16490t9 r65, AnonymousClass17S r66, AnonymousClass2UU r67, C23221Ay r68, AnonymousClass1MW r69, C18570wu r70, C25781Lc r71, AnonymousClass19S r72, C18050w4 r73, C23131Ap r74, C16320sq r75) {
        this.A0t = r55;
        C16440t3 r12 = r54;
        this.A0s = r12;
        C14710pd r5 = r64;
        this.A11 = r5;
        this.A0m = r47;
        C16320sq r1 = r75;
        this.A1D = r1;
        this.A0x = r60;
        C16080sP r13 = r51;
        this.A0p = r13;
        AnonymousClass013 r11 = r57;
        this.A0v = r11;
        AnonymousClass17F r10 = r59;
        this.A0w = r10;
        this.A0y = r61;
        C016407u r6 = r45;
        this.A0l = r6;
        this.A19 = r71;
        this.A1B = r73;
        this.A18 = r70;
        this.A0z = r62;
        this.A0q = r52;
        this.A0n = r48;
        this.A0u = r56;
        C15800rs r7 = r53;
        this.A0r = r7;
        this.A17 = r69;
        C23221Ay r9 = r68;
        this.A16 = r9;
        this.A15 = r67;
        this.A10 = r63;
        this.A1A = r72;
        this.A0o = r49;
        this.A1C = new AnonymousClass1WA(r1, true);
        this.A03 = r6.A03("current_screen");
        this.A0D.A0D(r6.A03("query_text"), new IDxObserverShape115S0100000_2_I0((Object) this, 261));
        this.A05 = r6.A03("search_type");
        this.A04 = r6.A03("search_jid");
        this.A06 = r6.A03("smart_filter");
        this.A07 = r6.A03("user_grid_view_choice");
        if (r5.A0C(1448)) {
            this.A0K = r46.A00(this.A04, this.A05, this.A06, this.A0D);
        }
        AnonymousClass026 r15 = this.A0D;
        AnonymousClass028 r2 = this.A05;
        C23131Ap r28 = r74;
        C216114t r23 = r58;
        C16490t9 r25 = r65;
        AnonymousClass17S r26 = r66;
        AnonymousClass028 r17 = this.A04;
        AnonymousClass028 r18 = this.A06;
        C16080sP r19 = r13;
        AnonymousClass028 r16 = r2;
        C49942Wt r14 = new C49942Wt(r15, r16, r17, r18, r19, r7, r12, r11, r23, r5, r25, r26, r9, r28);
        this.A12 = r14;
        C16440t3 r36 = r12;
        AnonymousClass013 r37 = r11;
        C14710pd r39 = r5;
        C16490t9 r40 = r25;
        AnonymousClass17S r41 = r26;
        C23221Ay r42 = r9;
        C23131Ap r43 = r28;
        C49932Ws r29 = new C49932Ws(this.A0D, this.A05, this.A04, this.A06, r13, r7, r36, r37, r23, r39, r40, r41, r42, r43);
        this.A13 = r29;
        AnonymousClass026 r3 = this.A0D;
        AnonymousClass028 r22 = this.A05;
        AnonymousClass2B6 r292 = new AnonymousClass2B6(r3, r22, this.A04, this.A06, r50, r13, r36, r37, r10, r39, r40, r41, r42, r43);
        this.A14 = r292;
        A0K();
        this.A0E.A0D(r14.A00(), new IDxObserverShape115S0100000_2_I0((Object) this, 262));
        this.A0E.A0D(r29.A00(), new IDxObserverShape115S0100000_2_I0((Object) this, 264));
        this.A0E.A0D(r292.A06(), new IDxObserverShape115S0100000_2_I0((Object) this, 268));
        this.A0E.A0D(r292.A01(), new IDxObserverShape115S0100000_2_I0((Object) this, 263));
        this.A0E.A0D(r292.A02(), new IDxObserverShape115S0100000_2_I0((Object) this, 266));
        this.A0E.A0D(this.A07, new IDxObserverShape115S0100000_2_I0((Object) this, 273));
        C49922Wr r0 = this.A0K;
        if (r0 != null) {
            this.A0E.A0D(r0.A00(), new IDxObserverShape115S0100000_2_I0((Object) this, 265));
        }
        this.A0C.A0D(r292.A00(), new IDxObserverShape115S0100000_2_I0((Object) this, 272));
        this.A0C.A0D(r292.A03(), new IDxObserverShape115S0100000_2_I0((Object) this, 272));
        this.A0C.A0D(r292.A04(), new IDxObserverShape115S0100000_2_I0((Object) this, 272));
        this.A0C.A0D(r14.A01(), new IDxObserverShape115S0100000_2_I0((Object) this, 272));
        this.A0C.A0D(r29.A01(), new IDxObserverShape115S0100000_2_I0((Object) this, 272));
        this.A0C.A0D(this.A0G, new IDxObserverShape115S0100000_2_I0((Object) this, 258));
        this.A0C.A0D(this.A0E, new IDxObserverShape115S0100000_2_I0((Object) this, 269));
        this.A0D.A0D(r292.A05(), new IDxObserverShape36S0200000_2_I0(r6, 9, this));
        if (!r5.A0D(C16620tM.A01)) {
            AnonymousClass2UX A0A2 = A0A();
            AnonymousClass026 r110 = this.A0E;
            if (r110.A01() == null) {
                r110.A0B(A0A2);
            }
        }
    }

    public void A04() {
        this.A0q.A00();
        A0N();
    }

    public int A05() {
        Number number = (Number) this.A0l.A04("last_nav_type");
        if (number == null) {
            return 0;
        }
        return number.intValue();
    }

    public int A06() {
        Number number = (Number) this.A0l.A02(0, "search_type").A01();
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    public int A07(C15830rv r6) {
        AnonymousClass2UX A0B2 = A0B();
        int i2 = -2;
        for (int i3 = 0; i3 < A0B2.size(); i3++) {
            if ((((AnonymousClass2UZ) A0B2.get(i3)).A01() == 3 || ((AnonymousClass2UZ) A0B2.get(i3)).A01() == 2) && C34901l3.A00(A0B2.A01(i3).ACx(), r6)) {
                i2 = i3;
            }
        }
        return i2;
    }

    public int A08(C16730tY r6) {
        int i2 = -2;
        if (this.A0L.A01.contains(r6)) {
            AnonymousClass2UX A0B2 = A0B();
            for (int i3 = 0; i3 < A0B2.size(); i3++) {
                int A002 = A0B2.A00(i3);
                if ((AnonymousClass2UZ.A00(A002) || A002 == 17 || A002 == 18 || A002 == 16 || A002 == 14) && C34901l3.A00(A0B2.A02(i3), r6)) {
                    i2 = i3;
                }
            }
        }
        return i2;
    }

    public UserJid A09() {
        return (UserJid) this.A0l.A02((Object) null, "search_jid").A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:116:0x021a, code lost:
        if (r11 != false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0257, code lost:
        if (r14 != false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00be, code lost:
        if (A0Z() == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016d, code lost:
        if (r7.A03.size() <= 0) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0187, code lost:
        if (A0e() != false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019f, code lost:
        if (r7.A00.size() <= 0) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c3, code lost:
        if (A0e() != false) goto L_0x01c5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0272  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2UX A0A() {
        /*
            r19 = this;
            r4 = r19
            X.0tz r3 = r4.A0t
            X.013 r0 = r4.A0v
            X.2UX r1 = new X.2UX
            r1.<init>(r3, r0)
            X.026 r2 = r4.A0D
            java.lang.Object r0 = r2.A01()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0064
            com.whatsapp.jid.UserJid r0 = r4.A09()
            if (r0 != 0) goto L_0x0064
            int r0 = r4.A06()
            if (r0 != 0) goto L_0x0064
            X.1lG r0 = r4.A0C()
            if (r0 != 0) goto L_0x0064
            r4.A0M()
            android.util.SparseIntArray r0 = r4.A02
            r1.A03(r0)
            boolean r0 = r4.A0f()
            if (r0 == 0) goto L_0x0047
            X.1Ay r0 = r4.A16
            java.util.List r2 = r0.A01()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.A08(r0)
        L_0x0047:
            X.0uf r0 = r4.A0n
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x005c
            X.1BB r2 = r4.A0o
            android.content.Context r0 = r3.A01()
            java.util.List r0 = r2.A00(r0)
            r1.A07(r0)
        L_0x005c:
            X.026 r0 = r4.A0A
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
        L_0x0060:
            r0.A09(r11)
        L_0x0063:
            return r1
        L_0x0064:
            X.2B9 r0 = r4.A0L
            X.2B9 r7 = r0.A01()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            X.2Wt r0 = r4.A12
            X.028 r0 = r0.A01()
            java.lang.Object r0 = r0.A01()
            boolean r18 = r11.equals(r0)
            X.2Ws r0 = r4.A13
            X.028 r0 = r0.A01()
            java.lang.Object r0 = r0.A01()
            boolean r17 = r11.equals(r0)
            boolean r16 = r4.A0d()
            boolean r15 = r4.A0b()
            java.util.List r8 = r7.A02
            int r5 = r8.size()
            r0 = 5
            r14 = 1
            r6 = 0
            r3 = 0
            if (r5 <= r0) goto L_0x009d
            r3 = 1
        L_0x009d:
            if (r15 == 0) goto L_0x00af
            int r13 = r4.A06()
            r12 = 118(0x76, float:1.65E-43)
            r10 = 105(0x69, float:1.47E-43)
            r9 = 103(0x67, float:1.44E-43)
            if (r13 == r9) goto L_0x0117
            if (r13 == r10) goto L_0x0117
            if (r13 == r12) goto L_0x0117
        L_0x00af:
            X.026 r9 = r4.A0A
            java.util.List r0 = r7.A01
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00c0
            boolean r5 = r4.A0Z()
            r0 = 1
            if (r5 != 0) goto L_0x00c1
        L_0x00c0:
            r0 = 0
        L_0x00c1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A09(r0)
            X.026 r5 = r4.A09
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r5.A09(r0)
            if (r18 != 0) goto L_0x0063
            java.util.List r0 = r4.A0e
            r1.addAll(r0)
            java.util.List r0 = r4.A0g
            r1.addAll(r0)
            java.util.List r0 = r4.A0h
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00fc
            X.2kj r0 = X.AnonymousClass2UX.A01
            r1.add(r0)
            java.util.Set r0 = r4.A0i
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00f7
            java.util.Set r0 = r4.A0i
            r1.A0C(r0)
        L_0x00f7:
            java.util.List r0 = r4.A0h
            r1.addAll(r0)
        L_0x00fc:
            if (r17 != 0) goto L_0x0063
            boolean r0 = r4.A0c()
            if (r0 == 0) goto L_0x0155
            int r0 = r1.size()
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = r2.A01()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x014c
            return r1
        L_0x0117:
            java.util.List r5 = r7.A01
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0135
            java.util.List r0 = r4.A0f
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x012c
            java.util.List r0 = r4.A0f
            r1.A06(r0)
        L_0x012c:
            if (r13 == r9) goto L_0x0148
            if (r13 == r10) goto L_0x0144
            if (r13 != r12) goto L_0x0135
            r1.A0B(r5, r3)
        L_0x0135:
            int r0 = r1.size()
            if (r0 == 0) goto L_0x00af
            X.026 r0 = r4.A0A
            r0.A09(r11)
            X.026 r0 = r4.A09
            goto L_0x0060
        L_0x0144:
            r1.A0A(r5, r3)
            goto L_0x0135
        L_0x0148:
            r1.A09(r5, r3)
            goto L_0x0135
        L_0x014c:
            X.2kj r0 = X.AnonymousClass2UX.A04
            r1.add(r0)
            X.2kj r0 = X.AnonymousClass2UX.A00
            goto L_0x01f1
        L_0x0155:
            boolean r0 = r4.A0e()
            if (r0 == 0) goto L_0x0160
            android.util.SparseIntArray r0 = r4.A02
            r1.A03(r0)
        L_0x0160:
            int r0 = r4.A06()
            if (r0 != 0) goto L_0x016f
            java.util.List r0 = r7.A03
            int r0 = r0.size()
            r12 = 1
            if (r0 > 0) goto L_0x0170
        L_0x016f:
            r12 = 0
        L_0x0170:
            java.util.List r0 = r4.A0e
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0189
            java.util.List r0 = r4.A0g
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0189
            if (r12 != 0) goto L_0x0189
            boolean r0 = r4.A0e()
            r11 = 0
            if (r0 == 0) goto L_0x018a
        L_0x0189:
            r11 = 1
        L_0x018a:
            X.0pd r2 = r4.A11
            boolean r10 = X.C34321k4.A02(r2)
            if (r10 == 0) goto L_0x0276
            int r0 = r4.A06()
            if (r0 != 0) goto L_0x01a1
            java.util.List r0 = r7.A00
            int r0 = r0.size()
            r9 = 1
            if (r0 > 0) goto L_0x01a2
        L_0x01a1:
            r9 = 0
        L_0x01a2:
            java.util.List r0 = r4.A0e
            int r0 = r0.size()
            if (r0 > 0) goto L_0x01c5
            java.util.List r0 = r4.A0g
            int r0 = r0.size()
            if (r0 > 0) goto L_0x01c5
            if (r12 != 0) goto L_0x01b6
            if (r9 == 0) goto L_0x01be
        L_0x01b6:
            java.util.List r0 = r7.A04
            int r0 = r0.size()
            if (r0 > 0) goto L_0x01c5
        L_0x01be:
            boolean r0 = r4.A0e()
            r11 = 0
            if (r0 == 0) goto L_0x01c6
        L_0x01c5:
            r11 = 1
        L_0x01c6:
            r0 = r11 ^ 1
            r3 = r3 & r0
            java.util.List r5 = r7.A04
            int r0 = r5.size()
            if (r0 > 0) goto L_0x01d2
            r14 = 0
        L_0x01d2:
            if (r11 == 0) goto L_0x01f5
            boolean r0 = r4.A0e()
            if (r0 != 0) goto L_0x01f5
            int r0 = r8.size()
            if (r0 != 0) goto L_0x01f5
            if (r16 != 0) goto L_0x01f5
            X.028 r0 = r4.A06
            java.lang.Object r0 = r0.A01()
            if (r0 != 0) goto L_0x01f5
            X.2kj r0 = X.AnonymousClass2UX.A04
            r1.add(r0)
            X.2kj r0 = X.AnonymousClass2UX.A05
        L_0x01f1:
            r1.add(r0)
            return r1
        L_0x01f5:
            int r0 = r8.size()
            if (r10 == 0) goto L_0x0249
            if (r0 <= 0) goto L_0x0231
            if (r12 == 0) goto L_0x0209
            X.2kj r0 = X.AnonymousClass2UX.A07
            r1.add(r0)
            java.util.List r0 = r7.A03
            r1.A04(r2, r0, r6)
        L_0x0209:
            if (r9 == 0) goto L_0x021a
            X.0w6 r0 = r4.A10
            r0.A00()
            X.2kj r0 = X.AnonymousClass2UX.A03
            r1.add(r0)
            java.util.List r0 = r7.A00
            r1.A04(r2, r0, r6)
        L_0x021a:
            if (r11 == 0) goto L_0x0221
        L_0x021c:
            X.2kj r0 = X.AnonymousClass2UX.A04
            r1.add(r0)
        L_0x0221:
            java.util.List r0 = r4.A0f
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x022e
            java.util.List r0 = r4.A0f
            r1.A06(r0)
        L_0x022e:
            r1.A04(r2, r5, r3)
        L_0x0231:
            if (r16 != 0) goto L_0x0063
            int r0 = r1.size()
            if (r0 != 0) goto L_0x0063
            r0 = 1347(0x543, float:1.888E-42)
            boolean r0 = r2.A0C(r0)
            if (r0 == 0) goto L_0x0272
            X.2kj r0 = X.AnonymousClass2UX.A05
            r1.add(r0)
            X.2kj r0 = X.AnonymousClass2UX.A02
            goto L_0x01f1
        L_0x0249:
            if (r0 <= 0) goto L_0x0231
            if (r12 == 0) goto L_0x025a
            X.2kj r0 = X.AnonymousClass2UX.A07
            r1.add(r0)
            java.util.List r0 = r7.A03
            r1.A04(r2, r0, r6)
            if (r14 == 0) goto L_0x0231
            goto L_0x021c
        L_0x025a:
            if (r11 == 0) goto L_0x0261
            X.2kj r0 = X.AnonymousClass2UX.A04
            r1.add(r0)
        L_0x0261:
            java.util.List r0 = r4.A0f
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x026e
            java.util.List r0 = r4.A0f
            r1.A06(r0)
        L_0x026e:
            r1.A04(r2, r8, r3)
            goto L_0x0231
        L_0x0272:
            X.2kj r0 = X.AnonymousClass2UX.A06
            goto L_0x01f1
        L_0x0276:
            r9 = 0
            goto L_0x01c6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.search.SearchViewModel.A0A():X.2UX");
    }

    public final AnonymousClass2UX A0B() {
        AnonymousClass026 r1 = this.A0E;
        return r1.A01() == null ? A0A() : (AnonymousClass2UX) r1.A01();
    }

    public C35031lG A0C() {
        return (C35031lG) this.A0l.A02((Object) null, "smart_filter").A01();
    }

    public String A0D() {
        String str = (String) this.A0l.A02("", "query_text").A01();
        return str != null ? str : "";
    }

    public void A0E() {
        A0S((UserJid) null);
    }

    public void A0F() {
        A0V((C35031lG) null);
    }

    public void A0G() {
        A0R(0);
        A0E();
        A0F();
        A0Y(false);
        A0W("");
        this.A0l.A06("user_grid_view_choice", (Object) null);
        this.A0U.A0B((Object) null);
        this.A14.A09();
        this.A13.A02();
        this.A12.A02();
        this.A0g = new ArrayList();
        this.A0e = new ArrayList();
        this.A0f = new ArrayList();
        this.A0L = AnonymousClass2B9.A00();
        Runnable runnable = this.A0c;
        if (runnable != null) {
            runnable.run();
        }
        this.A0h = new ArrayList();
        this.A0i = new HashSet();
        this.A0O = new C51912cV();
        A0J();
    }

    public void A0H() {
        this.A12.A03();
        this.A13.A03();
    }

    public final void A0I() {
        this.A0j.set(true);
        if (TextUtils.isEmpty(A0D()) && A06() == 0 && A09() == null && A0C() == null) {
            this.A1E.set(true);
            this.A0k = true;
        } else if (this.A0k) {
            this.A00 = SystemClock.uptimeMillis();
            this.A0k = false;
        }
    }

    public final void A0J() {
        this.A0b = new RunnableRunnableShape14S0100000_I0_13((Object) this, 16);
        AnonymousClass1WA r1 = this.A1C;
        r1.A00();
        r1.execute(this.A0b);
    }

    public final void A0K() {
        C19150xq r1 = this.A0y;
        r1.A02(this.A14.A00);
        r1.A02(this.A0I);
    }

    public final void A0L() {
        int size = A0B().size();
        AnonymousClass027 r1 = this.A0G;
        if (size - (r1.A01() == null ? 0 : ((Number) r1.A01()).intValue()) < 300) {
            this.A14.A08();
        }
    }

    public final void A0M() {
        synchronized (this) {
            C14710pd r3 = this.A11;
            if (r3.A0C(1608)) {
                this.A02.put(117, 8);
            }
            if (r3.A0C(2662)) {
                this.A02.put(111, 1);
            }
            SparseIntArray sparseIntArray = this.A02;
            sparseIntArray.put(105, 7);
            sparseIntArray.put(118, 6);
            sparseIntArray.put(AnonymousClass2EA.A03, 5);
            sparseIntArray.put(103, 4);
            sparseIntArray.put(97, 3);
            sparseIntArray.put(100, 2);
            sparseIntArray.put(0, 1);
        }
    }

    public final void A0N() {
        C19150xq r1 = this.A0y;
        r1.A03(this.A14.A00);
        r1.A03(this.A0I);
    }

    public final void A0O() {
        AbstractCollection abstractCollection = (AbstractCollection) this.A0E.A01();
        boolean z2 = false;
        int size = abstractCollection == null ? 0 : abstractCollection.size();
        AnonymousClass027 r1 = this.A0G;
        int intValue = r1.A01() == null ? 0 : ((Number) r1.A01()).intValue();
        if (A0d() && intValue > size - 3) {
            z2 = true;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        AnonymousClass026 r12 = this.A0C;
        if (!C34901l3.A00(valueOf, r12.A01())) {
            r12.A0B(valueOf);
        }
    }

    public void A0P(int i2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C016407u r2 = this.A0l;
        r2.A06("last_nav_time", Long.valueOf(elapsedRealtime));
        r2.A06("last_nav_type", Integer.valueOf(i2));
    }

    public void A0Q(int i2) {
        Integer valueOf = Integer.valueOf(i2);
        if (!C34901l3.A00(valueOf, this.A03.A01())) {
            this.A0l.A06("current_screen", valueOf);
        }
    }

    public void A0R(int i2) {
        if (A0C() == null && i2 != A06()) {
            this.A15.A00(2, i2);
            A0F();
            C51912cV r4 = this.A0O;
            Integer valueOf = Integer.valueOf(i2);
            r4.A00(new C51922cW(A09(), valueOf, A0D(), 2));
            this.A0l.A06("search_type", valueOf);
        }
    }

    public void A0S(UserJid userJid) {
        if (!C34901l3.A00(userJid, A09())) {
            this.A0O.A00(new C51922cW(userJid, Integer.valueOf(A06()), A0D(), 3));
            this.A0l.A06("search_jid", userJid);
        }
    }

    public void A0T(C16740tZ r3) {
        if (r3 != null && 1 == r3.A06()) {
            this.A10.A02(r3);
        }
        A0Y(false);
        A0P(2);
        this.A0Z.A0B(r3);
    }

    public final void A0U(AnonymousClass2B9 r3) {
        this.A0L = r3.A01();
        Runnable runnable = this.A0c;
        if (runnable != null) {
            runnable.run();
        }
        this.A01.removeMessages(0);
        A0J();
    }

    public void A0V(C35031lG r4) {
        if (A06() == 0 && !C34901l3.A00(r4, A0C())) {
            this.A0O.A00(new C51922cW(r4, A0D()));
            this.A0l.A06("smart_filter", r4);
        }
    }

    public void A0W(String str) {
        if (!str.equals(A0D())) {
            this.A0O.A00(new C51922cW(A09(), Integer.valueOf(A06()), str, 1));
            this.A0l.A06("query_text", str);
        }
    }

    public void A0X(boolean z2) {
        A0G();
        A0Q(1);
        A0P(4);
        this.A0U.A09(Boolean.valueOf(z2));
    }

    public void A0Y(boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        AnonymousClass027 r1 = this.A0H;
        if (!valueOf.equals(r1.A01())) {
            r1.A0B(valueOf);
        }
    }

    public boolean A0Z() {
        return A06() == 103 || A06() == 105 || A06() == 118;
    }

    public boolean A0a() {
        C35031lG A0C2 = A0C();
        return A0C2 != null && 2 == A0C2.A01;
    }

    public final boolean A0b() {
        if (this.A0L.A02.size() == 0) {
            return false;
        }
        Boolean bool = (Boolean) this.A0l.A04("user_grid_view_choice");
        return bool != null ? bool.booleanValue() : A0Z() && A0D().isEmpty();
    }

    public final boolean A0c() {
        return !this.A0w.A0P() && this.A0u.A04() == 512;
    }

    public final boolean A0d() {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(this.A12.A01().A01()) && !bool.equals(this.A13.A01().A01())) {
            AnonymousClass2B6 r1 = this.A14;
            return bool.equals(r1.A00().A01()) || bool.equals(r1.A04().A01()) || bool.equals(r1.A03().A01());
        }
    }

    public final boolean A0e() {
        return (!Boolean.TRUE.equals(this.A14.A04().A01()) || this.A0L.A02.size() > 0) && this.A02.size() > 0;
    }

    public final boolean A0f() {
        return this.A11.A0C(1287);
    }

    public final boolean A0g(long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Number number = (Number) this.A0l.A04("last_nav_time");
        return elapsedRealtime - (number == null ? 0 : number.longValue()) > j2;
    }

    public AnonymousClass2B7 A7V(MediaViewFragment mediaViewFragment, C16730tY r3) {
        return new C55972kk(this);
    }

    @OnLifecycleEvent(C011405n.ON_PAUSE)
    public void onPause() {
        A05();
        if (A05() != 2 && A05() != 1 && A05() != 4) {
            if (A05() != 0 || A0g(500)) {
                A0P(3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (A0g(300000) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (r1 != 3) goto L_0x0016;
     */
    @androidx.lifecycle.OnLifecycleEvent(X.C011405n.ON_RESUME)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r5 = this;
            r5.A05()
            int r1 = r5.A05()
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0016
            if (r1 == r0) goto L_0x0023
            r0 = 2
            r2 = 300000(0x493e0, double:1.482197E-318)
            if (r1 == r0) goto L_0x001a
            r0 = 3
            if (r1 == r0) goto L_0x0037
        L_0x0016:
            r5.A0P(r4)
            return
        L_0x001a:
            r0 = 500(0x1f4, double:2.47E-321)
            boolean r0 = r5.A0g(r0)
            if (r0 != 0) goto L_0x0037
            return
        L_0x0023:
            X.0pd r1 = r5.A11
            r0 = 1608(0x648, float:2.253E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x003d
            boolean r0 = r5.A0a()
            if (r0 == 0) goto L_0x003d
            r5.A0H()
            goto L_0x0016
        L_0x0037:
            boolean r0 = r5.A0g(r2)
            if (r0 == 0) goto L_0x0016
        L_0x003d:
            r5.A05()
            r5.A0X(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.search.SearchViewModel.onResume():void");
    }
}
