package X;

import android.app.Application;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.facebook.redex.IDxPCallbackShape79S0200000_1_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.2qc  reason: invalid class name and case insensitive filesystem */
public class C57272qc extends AnonymousClass02H implements C29091a1, C29101a2, C29111a3, C29121a4, C29131a5 {
    public int A00;
    public int A01;
    public int A02;
    public C87314Wg A03;
    public Jid A04;
    public Stack A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass028 A08;
    public final AnonymousClass028 A09;
    public final AnonymousClass028 A0A;
    public final AnonymousClass026 A0B;
    public final AnonymousClass026 A0C;
    public final C016407u A0D;
    public final C17150uc A0E;
    public final C17180uf A0F;
    public final C17210ui A0G;
    public final AnonymousClass2Z2 A0H;
    public final AnonymousClass1PS A0I;
    public final AnonymousClass4Q8 A0J;
    public final AnonymousClass3FH A0K;
    public final C616239q A0L;
    public final AnonymousClass4HM A0M;
    public final C84794Lx A0N;
    public final AnonymousClass3F7 A0O;
    public final AnonymousClass013 A0P;
    public final C30801cy A0Q;
    public final C30801cy A0R;
    public final C30801cy A0S;
    public final C30801cy A0T;
    public final C30801cy A0U = C30801cy.A01();
    public final C30801cy A0V = C30801cy.A01();
    public final Set A0W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57272qc(Application application, C016407u r27, AnonymousClass4CR r28, C17150uc r29, C17180uf r30, C17210ui r31, AnonymousClass2Z2 r32, AnonymousClass1PS r33, AnonymousClass4Q8 r34, C108655Ov r35, AnonymousClass5P2 r36, AnonymousClass4HM r37, AnonymousClass5P3 r38, C31241dn r39, AnonymousClass013 r40, Jid jid, String str, Set set, boolean z2, boolean z3) {
        super(application);
        int i2 = z3;
        boolean z4 = z2;
        AnonymousClass026 r9 = new AnonymousClass026();
        this.A0B = r9;
        C30801cy A012 = C30801cy.A01();
        this.A0S = A012;
        C30801cy A013 = C30801cy.A01();
        this.A0T = A013;
        this.A0Q = C30801cy.A01();
        AnonymousClass026 r6 = new AnonymousClass026();
        this.A0C = r6;
        this.A0R = C30801cy.A01();
        this.A05 = new Stack();
        C016407u r14 = r27;
        this.A0D = r14;
        this.A0P = r40;
        this.A0F = r30;
        C616239q A6w = r36.A6w(new C100914wP(this));
        this.A0L = A6w;
        this.A0G = r31;
        this.A0J = r34;
        this.A0W = set;
        AnonymousClass2Z2 r13 = r32;
        this.A0H = r13;
        this.A0E = r29;
        this.A0I = r33;
        AnonymousClass4HM r12 = r37;
        this.A0M = r12;
        C100854wJ r4 = new C100854wJ(this);
        C100874wL r3 = new C100874wL(this);
        C100854wJ r18 = r4;
        C100834wH r17 = new C100834wH(this);
        AnonymousClass3FH A78 = r35.A78(r17, r18, r3, new C100894wN(this), A6w, this, this, 1);
        this.A0K = A78;
        Map map = r14.A03;
        this.A01 = map.get("saved_consumer_home_type") != null ? AnonymousClass000.A0D(map.get("saved_consumer_home_type")) : i2;
        this.A06 = map.get("saved_force_root_category") != null ? AnonymousClass000.A1X(map.get("saved_force_root_category")) : z4;
        C84794Lx r15 = new C84794Lx(new AnonymousClass4DR(this), C16150sX.A0V(r28.A00.A04));
        this.A0N = r15;
        AnonymousClass027 r11 = r12.A00;
        this.A09 = r11;
        AnonymousClass027 r2 = A78.A06;
        this.A08 = r2;
        AnonymousClass027 r1 = r15.A00;
        this.A0A = r1;
        A6w.A06(r14);
        if (map.get("saved_parent_category") != null) {
            A012.A0B(map.get("saved_parent_category"));
        }
        if (map.get("saved_second_level_category") != null) {
            A013.A0B(map.get("saved_second_level_category"));
        }
        if (map.get("saved_search_state_stack") != null) {
            Stack stack = new Stack();
            this.A05 = stack;
            stack.addAll((Collection) map.get("saved_search_state_stack"));
        }
        this.A02 = map.get("saved_search_state") != null ? AnonymousClass000.A0D(map.get("saved_search_state")) : 0;
        if (A013.A01() == null) {
            C31241dn r5 = r39;
            if (r39 != null) {
                this.A0S.A0B(r5);
                this.A00 = 2;
                if (C52592e6.A00(r5.A00)) {
                    this.A02 = 2;
                } else {
                    this.A0T.A0B(r5);
                    this.A02 = 1;
                }
            }
        }
        Jid jid2 = jid;
        if (jid != null) {
            this.A04 = jid2;
            this.A02 = 3;
        }
        if ("nearby_business".equals(str)) {
            this.A02 = 4;
        }
        C13700nu.A0U(r11, r6, this, 15);
        C13700nu.A0U(r2, r6, this, 14);
        C13700nu.A0U(r1, r6, this, 16);
        r9.A0D(A012, new IDxObserverShape116S0100000_2_I1(this, 39));
        r9.A0D(A013, new IDxObserverShape116S0100000_2_I1(this, 39));
        r13.A0B = r12;
        r13.A0C = r15;
        r13.A09 = A78;
        AnonymousClass3F7 A6x = r38.A6x(this, this);
        this.A0O = A6x;
        C13700nu.A0U(A6x.A00, r6, this, 13);
    }

    public void A04() {
        AnonymousClass3F7 r2 = this.A0O;
        AnonymousClass26A r0 = r2.A00;
        r0.A02.removeCallbacks(r0.A09);
        r2.A05.A00();
        r2.A01 = null;
        AnonymousClass2Z2 r02 = this.A0K.A0F.A00;
        r02.A00();
        r02.A07 = null;
        AnonymousClass2Z2 r03 = this.A0H;
        r03.A0B = null;
        r03.A0C = null;
        r03.A09 = null;
    }

    public final AnonymousClass4HF A05() {
        AnonymousClass028 r1 = this.A08;
        return r1.A01() != null ? ((AnonymousClass4P1) r1.A01()).A03 : new AnonymousClass4HF(150, (String) null);
    }

    public final List A06() {
        int i2;
        C31301dt A012;
        ArrayList A0u = AnonymousClass000.A0u();
        AnonymousClass26A r2 = this.A0O.A00;
        Object A013 = r2.A01();
        if (A013 != null) {
            A0u.add(A013);
            Integer[] numArr = new Integer[2];
            numArr[1] = Integer.valueOf(C13690nt.A1W(numArr, 2) ? 1 : 0);
            List asList = Arrays.asList(numArr);
            int i3 = this.A02;
            if ((i3 == 1 || i3 == 4 || A0R()) && asList.contains(Integer.valueOf(r2.A00))) {
                C616239q r1 = this.A0L;
                if (!(r1.A00 == null || (A012 = r1.A01(this)) == null)) {
                    A0u.add(A012);
                }
            }
        }
        if (this.A02 == 0 && r2.A00 != 4) {
            Iterator it = this.A0W.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass000.A0W("restartVisibilityState");
            }
        }
        int i4 = r2.A00;
        if (this.A0F.A02.A0E(C16620tM.A02, 1806) && (((i2 = this.A02) == 2 || i2 == 0) && i4 != 4)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(new C87224Vx((Object) null, "-1", this.A00.getString(R.string.str00d5)));
            if (this.A02 == 2) {
                C30801cy r12 = this.A0S;
                if (r12.A01() != null) {
                    C31241dn r3 = (C31241dn) r12.A01();
                    linkedList.add(new C87224Vx(r3, r3.A00, r3.A01));
                }
            }
            A0u.add(new C72013lQ(new C100784wC(this), linkedList));
        }
        return A0u;
    }

    public void A07() {
        int i2 = this.A02;
        if (i2 != 0) {
            if (i2 == 1) {
                AnonymousClass26A r2 = this.A0O.A00;
                int i3 = r2.A00;
                if (!(i3 == 4 || i3 == 3 || i3 == 6 || i3 == 5)) {
                    if (A0Q()) {
                        this.A05.pop();
                        C616239q r1 = this.A0L;
                        r1.A05();
                        r1.A00 = null;
                        this.A02 = 2;
                        if (!this.A07 && this.A0A.A01() != null) {
                            C84794Lx r0 = this.A0N;
                            r0.A00.A0B(r0.A01);
                        } else if (r2.A01 != null) {
                            A0A();
                        }
                        this.A0T.A09((Object) null);
                        C30801cy r12 = this.A0S;
                        r12.A09(r12.A01());
                    } else {
                        A0M(this.A06);
                    }
                }
                C13680ns.A1O(this.A0V, 2);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        AnonymousClass3FH r22 = this.A0K;
                        if (!r22.A04) {
                            this.A0G.A0G(r22.A02());
                        }
                    } else {
                        return;
                    }
                }
                C13680ns.A1O(this.A0V, 2);
            } else {
                int i4 = this.A0O.A00.A00;
                if (i4 == 4 || i4 == 3 || i4 == 6 || i4 == 5) {
                    C13680ns.A1O(this.A0V, 2);
                    return;
                } else {
                    A0M(this.A06);
                    return;
                }
            }
            AnonymousClass3FH r23 = this.A0K;
            if (!r23.A04) {
                this.A0G.A0G(r23.A02());
                return;
            }
            return;
        }
        A0C();
    }

    public void A08() {
        AnonymousClass3FH r5 = this.A0K;
        AnonymousClass4P1 r0 = (AnonymousClass4P1) r5.A06.A01();
        if (r0 != null && r0.A04 != null) {
            AnonymousClass26A r2 = this.A0O.A00;
            if (r2.A01 != null) {
                r5.A04();
                if (A0P()) {
                    int i2 = this.A02;
                    if (i2 == 1) {
                        A0G(A05());
                    } else if (i2 != 3) {
                        if (i2 == 4) {
                            AnonymousClass2Z2 r4 = this.A0H;
                            AnonymousClass26B r3 = r2.A01;
                            String str = r5.A0K;
                            r4.A03(A05(), this.A0L.A00(), r3, str);
                        }
                    } else if (A0R()) {
                        AnonymousClass2Z2 r32 = this.A0H;
                        Jid jid = this.A04;
                        AnonymousClass26B r6 = r2.A01;
                        String str2 = r5.A0K;
                        r32.A02(A05(), this.A0L.A00(), r6, jid, str2);
                    }
                }
            }
        }
    }

    public final void A09() {
        this.A0B.A0B("all_categories");
        C71923lH r1 = new C71923lH();
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(r1);
        A0I(A0u);
        this.A02 = 0;
        AnonymousClass2Z2 r3 = this.A0H;
        AnonymousClass26B r2 = this.A0O.A00.A01;
        AnonymousClass00B.A07(r2, "Trying to fetch the categories, but the search location is null");
        r3.A01();
        C59722yq A74 = r3.A0J.A74(r2, r3, r3.A0O.A00);
        A74.A00 = "2.0";
        A74.A04();
        r3.A00 = A74;
    }

    public final void A0A() {
        C31241dn r7 = (C31241dn) this.A0S.A01();
        if (r7 != null) {
            AnonymousClass26A r3 = this.A0O.A00;
            if (r3.A01 != null) {
                C71923lH r1 = new C71923lH();
                ArrayList A0u = AnonymousClass000.A0u();
                A0u.add(r1);
                A0I(A0u);
                this.A02 = 2;
                AnonymousClass2Z2 r2 = this.A0H;
                AnonymousClass26B r6 = r3.A01;
                String str = this.A0K.A0K;
                AnonymousClass4HF r4 = null;
                if (A0P()) {
                    r4 = new AnonymousClass4HF(150, (String) null);
                }
                r2.A01();
                C62903Fj r8 = new C62903Fj(r6, r2);
                r2.A06 = r8;
                C59772yv A7C = r2.A0G.A7C(r4, (AnonymousClass4R9) null, r6, r7, r8, r2.A0O.A00, "current", "immediate_children", str, (String) null);
                A7C.A04();
                r2.A00 = A7C;
            }
        }
    }

    public final void A0B() {
        int i2 = this.A02;
        if (i2 == 1) {
            A0K(false);
        } else if (i2 != 3) {
            if (i2 == 4) {
                A0N(false);
            }
        } else if (A0R()) {
            A0O(false);
        }
    }

    public final void A0C() {
        C30801cy r1;
        int i2;
        int i3 = this.A01;
        if (i3 == 0) {
            this.A0B.A09("product_name");
            r1 = this.A0V;
            i2 = 4;
        } else if (i3 == 1) {
            r1 = this.A0V;
            i2 = 7;
        } else {
            return;
        }
        C13680ns.A1O(r1, i2);
    }

    public void A0D(int i2) {
        C87314Wg r0 = this.A03;
        if (r0 != null) {
            C17210ui r12 = this.A0G;
            long size = (long) r0.A07.size();
            C616239q r1 = this.A0L;
            long A072 = (long) C13680ns.A07(r1.A00);
            AnonymousClass3F7 r02 = this.A0O;
            int A022 = r02.A02();
            int i3 = this.A00;
            int A012 = r02.A01();
            String str = this.A03.A02;
            Boolean valueOf = r1.A06.AIq() ? Boolean.valueOf(r1.A02) : null;
            String str2 = r1.A03 ? "has_catalog" : null;
            String str3 = r1.A04 ? "open_now" : null;
            String A042 = r1.A04();
            C29151a7 r13 = new C29151a7();
            C29151a7.A00(r13, i2);
            r13.A0P = Long.valueOf(size);
            C29151a7.A01(r13, A022, i3, A072);
            if (A012 == 0) {
                A012 = 2;
            }
            r13.A0C = Integer.valueOf(A012);
            r13.A0W = str;
            r13.A00 = valueOf;
            r13.A0X = str2;
            r13.A0Y = str3;
            r13.A0Z = A042;
            r12.A07(r13);
        }
    }

    public void A0E(int i2) {
        C17210ui r6 = this.A0G;
        AnonymousClass3F7 r0 = this.A0O;
        int A022 = r0.A02();
        int i3 = this.A00;
        int A012 = r0.A01();
        C616239q r1 = this.A0L;
        Boolean valueOf = r1.A06.AIq() ? Boolean.valueOf(r1.A02) : null;
        String str = r1.A04 ? "open_now" : null;
        String A042 = r1.A04();
        String str2 = r1.A03 ? "has_catalog" : null;
        C29151a7 r12 = new C29151a7();
        C29151a7.A00(r12, 63);
        r12.A06 = Integer.valueOf(A022);
        r12.A04 = Integer.valueOf(i3);
        r12.A0D = Integer.valueOf(i2);
        if (A012 == 0) {
            A012 = 2;
        }
        r12.A0C = Integer.valueOf(A012);
        r12.A00 = valueOf;
        r12.A0Y = str;
        r12.A0Z = A042;
        r12.A0X = str2;
        r6.A07(r12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (r1.isEmpty() == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r1.isEmpty() == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 == r0) goto L_0x0050
            r0 = 1
            if (r5 == r0) goto L_0x002d
            r0 = 2
            if (r5 == r0) goto L_0x002d
            r0 = 3
            if (r5 == r0) goto L_0x002d
            r0 = 4
            if (r5 != r0) goto L_0x002c
            X.026 r1 = r4.A0C
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r1.A09(r0)
            X.1cy r1 = r4.A0V
            r0 = 3
            X.C13680ns.A1O(r1, r0)
            X.0ui r3 = r4.A0G
            X.3F7 r0 = r4.A0O
            java.lang.Integer r2 = X.AnonymousClass3F7.A00(r0)
            r1 = 28
            r0 = 6
            r3.A0A(r2, r1, r0)
        L_0x002c:
            return
        L_0x002d:
            X.028 r0 = r4.A08
            java.lang.Object r1 = r0.A01()
            X.4P1 r1 = (X.AnonymousClass4P1) r1
            boolean r0 = r4.A0P()
            if (r0 == 0) goto L_0x004b
            if (r1 == 0) goto L_0x004b
            java.util.List r1 = r1.A0B
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x004b
        L_0x0045:
            java.util.ArrayList r1 = X.C13680ns.A0n(r1)
            r3 = 2
            goto L_0x006d
        L_0x004b:
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            goto L_0x0045
        L_0x0050:
            X.028 r0 = r4.A08
            java.lang.Object r1 = r0.A01()
            X.4P1 r1 = (X.AnonymousClass4P1) r1
            boolean r0 = r4.A0P()
            if (r0 == 0) goto L_0x0086
            if (r1 == 0) goto L_0x0086
            java.util.List r1 = r1.A0B
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0086
        L_0x0068:
            java.util.ArrayList r1 = X.C13680ns.A0n(r1)
            r3 = 1
        L_0x006d:
            X.3lR r0 = new X.3lR
            r0.<init>(r4, r3)
            r1.add(r0)
            r4.A0I(r1)
            X.0ui r2 = r4.A0G
            X.3F7 r0 = r4.A0O
            java.lang.Integer r1 = X.AnonymousClass3F7.A00(r0)
            r0 = 28
            r2.A0A(r1, r0, r3)
            return
        L_0x0086:
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57272qc.A0F(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r0 = r1.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(X.AnonymousClass4HF r14) {
        /*
            r13 = this;
            X.1cy r0 = r13.A0T
            java.lang.Object r6 = r0.A01()
            X.1dn r6 = (X.C31241dn) r6
            X.3F7 r0 = r13.A0O
            X.26A r2 = r0.A00
            X.26B r0 = r2.A01
            if (r0 == 0) goto L_0x0073
            if (r6 == 0) goto L_0x0073
            r3 = r14
            if (r14 == 0) goto L_0x0019
            java.lang.String r0 = r14.A01
            if (r0 != 0) goto L_0x003d
        L_0x0019:
            X.39q r1 = r13.A0L
            java.util.Set r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0077
            java.util.List r0 = r1.A00
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0077
        L_0x002d:
            r0 = 1
        L_0x002e:
            X.3lK r1 = new X.3lK
            r1.<init>(r0)
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r0.add(r1)
            r13.A0I(r0)
        L_0x003d:
            r0 = 1
            r13.A02 = r0
            X.2Z2 r1 = r13.A0H
            X.26B r5 = r2.A01
            X.39q r2 = r13.A0L
            boolean r0 = r2.A08()
            if (r0 == 0) goto L_0x0074
            java.lang.String r10 = "all_descendents"
        L_0x004e:
            X.3FH r0 = r13.A0K
            java.lang.String r11 = r0.A0K
            X.4R9 r4 = r2.A00()
            java.lang.String r9 = "all_descendents"
            r1.A01()
            r0 = 0
            X.4yi r7 = new X.4yi
            r7.<init>(r5, r1, r0)
            r1.A03 = r7
            X.2Yy r2 = r1.A0G
            X.0wA r0 = r1.A0O
            X.1Kf r8 = r0.A00
            r12 = 0
            X.2yv r0 = r2.A7C(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.A04()
            r1.A00 = r0
        L_0x0073:
            return
        L_0x0074:
            java.lang.String r10 = "current"
            goto L_0x004e
        L_0x0077:
            r0 = 0
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57272qc.A0G(X.4HF):void");
    }

    public final void A0H(C87314Wg r12) {
        this.A02 = 1;
        this.A0T.A0B(this.A0S.A01());
        AnonymousClass3FH r1 = this.A0K;
        r1.A0C((String) null);
        List emptyList = Collections.emptyList();
        C18450wi.A0H(emptyList, 0);
        List list = r12.A04;
        List list2 = r12.A07;
        List list3 = r12.A06;
        r1.ANq(new C87314Wg(r12.A00, r12.A01, r12.A03, r12.A02, emptyList, list, list2, list3));
    }

    public final void A0I(List list) {
        List A062 = A06();
        A062.addAll(list);
        this.A0C.A09(A062);
    }

    public final void A0J(boolean z2) {
        if (!z2 || A05() == null || A05().A01 == null) {
            this.A0K.A0C((String) null);
            C71953lK r1 = new C71953lK(false);
            ArrayList A0u = AnonymousClass000.A0u();
            A0u.add(r1);
            A0I(A0u);
        } else if (A0P()) {
            AnonymousClass3FH r4 = this.A0K;
            AnonymousClass4P1 r3 = r4.A09;
            List list = r3.A0B;
            if (!list.isEmpty()) {
                list.add(new C55272jC(0));
                r3.A02 = 2;
                r4.A05();
            }
        }
    }

    public final void A0K(boolean z2) {
        A0J(z2);
        A0G(A0P() ? A05() : null);
    }

    public final void A0L(boolean z2) {
        int i2 = this.A02;
        if (i2 == 0) {
            A09();
        } else if (i2 == 1) {
            A0K(z2);
        } else if (i2 == 2) {
            A0A();
        } else if (i2 == 3) {
            A0O(z2);
        } else if (i2 == 4) {
            A0N(z2);
        }
    }

    public final void A0M(boolean z2) {
        if (!this.A07) {
            AnonymousClass028 r2 = this.A09;
            if (r2.A01() != null && !((C84784Lw) r2.A01()).A03.isEmpty()) {
                AnonymousClass4HM r0 = this.A0M;
                r0.A00.A09(r0.A01);
                C17210ui r4 = this.A0G;
                long size = (long) ((C84784Lw) r2.A01()).A03.size();
                AnonymousClass3F7 r02 = this.A0O;
                r4.A05(r02.A02(), size, r02.A01());
                this.A0S.A09((Object) null);
                this.A0B.A09("all_categories");
                C616239q r1 = this.A0L;
                r1.A05();
                r1.A00 = null;
                this.A02 = 0;
            }
        }
        if (this.A0O.A00.A01 != null) {
            if (A0Q()) {
                this.A05.pop();
            }
            if (z2) {
                A09();
            } else {
                A0C();
                return;
            }
        }
        this.A0S.A09((Object) null);
        this.A0B.A09("all_categories");
        C616239q r12 = this.A0L;
        r12.A05();
        r12.A00 = null;
        this.A02 = 0;
    }

    public final void A0N(boolean z2) {
        this.A02 = 4;
        this.A00 = 4;
        this.A0B.A09("nearby_business");
        A0J(z2);
        AnonymousClass2Z2 r4 = this.A0H;
        AnonymousClass26B r3 = this.A0O.A00.A01;
        String str = this.A0K.A0K;
        r4.A03(A05(), this.A0L.A00(), r3, str);
    }

    public final void A0O(boolean z2) {
        Jid jid;
        if (this.A0F.A02() && (jid = this.A04) != null) {
            AnonymousClass26A r2 = this.A0O.A00;
            if (r2.A01 != null) {
                this.A02 = 3;
                this.A00 = 3;
                this.A0B.A09("business_chaining");
                A0J(z2);
                AnonymousClass4R9 A002 = this.A0L.A00();
                if (A002.A01 == null) {
                    this.A0E.A03(new IDxPCallbackShape79S0200000_1_I1(A002, 0, this), UserJid.of(jid));
                    return;
                }
                this.A0H.A02(A0P() ? A05() : null, A002, r2.A01, jid, this.A0K.A0K);
            }
        }
    }

    public boolean A0P() {
        String str;
        AnonymousClass26B r0 = this.A0O.A00.A01;
        if (r0 == null || (str = r0.A08) == null) {
            return false;
        }
        return str.equals("device") || str.equals("pin_on_map");
    }

    public final boolean A0Q() {
        Stack stack = this.A05;
        return !stack.isEmpty() && AnonymousClass000.A0D(stack.peek()) == 2;
    }

    public final boolean A0R() {
        return this.A0F.A03() && this.A04 != null && this.A02 == 3;
    }

    public void AMP() {
        C13680ns.A1P(this.A0Q, 3);
    }

    public void AOE() {
        AnonymousClass4HN A032 = this.A0L.A03();
        if (A032 != null) {
            this.A0R.A09(A032);
        }
    }

    public void AOG() {
        C30801cy r2;
        Integer num;
        int i2;
        AnonymousClass3F7 r0 = this.A0O;
        r0.A03();
        AnonymousClass26A r4 = r0.A00;
        int i3 = r4.A00;
        if (i3 != 0) {
            int i4 = 7;
            i2 = 2;
            if (i3 == 2) {
                r2 = this.A0U;
                if (this.A02 == 0) {
                    i4 = 6;
                }
                num = Integer.valueOf(i4);
                r2.A0B(C13690nt.A0I(num, r4.A01));
            } else if (i3 == 4) {
                r2 = this.A0U;
                num = Integer.valueOf(i2);
                r2.A0B(C13690nt.A0I(num, r4.A01));
            } else if (i3 != 7) {
                return;
            }
        }
        r2 = this.A0U;
        i2 = 1;
        if (this.A02 == 0) {
            i2 = 0;
        }
        num = Integer.valueOf(i2);
        r2.A0B(C13690nt.A0I(num, r4.A01));
    }

    public void AOT(int i2) {
        AnonymousClass3F7 r3;
        C30801cy r2;
        int i3;
        if (i2 == 0 || i2 == 7 || i2 == 6) {
            C17210ui r22 = this.A0G;
            r3 = this.A0O;
            r22.A0A(AnonymousClass3F7.A00(r3), 29, 0);
            r2 = this.A0U;
            i3 = 8;
        } else if (i2 == 3) {
            C17210ui r1 = this.A0G;
            r3 = this.A0O;
            r1.A0A(AnonymousClass3F7.A00(r3), 29, 3);
            r2 = this.A0U;
            i3 = 5;
        } else {
            return;
        }
        r2.A0B(C13690nt.A0I(Integer.valueOf(i3), r3.A00.A01));
    }

    public void AOU() {
        this.A0L.A05();
        A0E(1);
        A0B();
    }

    public void AOV() {
        C616239q r1 = this.A0L;
        r1.A05();
        r1.A00 = null;
        A0B();
        this.A0G.A0A(AnonymousClass3F7.A00(this.A0O), 32, 5);
    }

    public void APx(boolean z2) {
        this.A0L.A02 = z2;
        A0E(1);
        A0B();
    }

    public void AS2(boolean z2) {
        this.A0L.A03 = z2;
        A0E(1);
        A0B();
    }

    public void ASA(int i2) {
        A0F(4);
    }

    public void AT5() {
        C13680ns.A1O(this.A0V, 5);
    }

    public void ATA() {
        C13680ns.A1O(this.A0Q, 0);
        this.A0G.A0A(AnonymousClass3F7.A00(this.A0O), 34, 0);
    }

    public void ATn() {
        AOG();
    }

    public void AUA(boolean z2) {
        this.A0L.A04 = z2;
        A0E(1);
        A0B();
    }

    public void AWa() {
        AnonymousClass3F7 r2 = this.A0O;
        r2.A02 = true;
        r2.A06();
        C13680ns.A1O(this.A0Q, 1);
        this.A0G.A0A(AnonymousClass3F7.A00(r2), 31, 0);
    }

    public void AWb() {
        A0L(true);
        this.A0G.A0A(AnonymousClass3F7.A00(this.A0O), 30, 1);
    }

    public void AWr() {
        this.A0S.A09((Object) null);
        this.A0B.A09("product_name");
        C13680ns.A1O(this.A0V, 4);
        this.A0G.A0A(AnonymousClass3F7.A00(this.A0O), 33, 5);
    }
}
