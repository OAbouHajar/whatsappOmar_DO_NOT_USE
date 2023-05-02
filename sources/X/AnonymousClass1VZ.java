package X;

import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: X.1VZ  reason: invalid class name */
public final class AnonymousClass1VZ {
    public int A00;
    public AnonymousClass3BM A01;
    public AnonymousClass4TZ A02;
    public C86034Qy A03;
    public AnonymousClass4IQ A04;
    public String A05;
    public String A06;
    public boolean A07;
    public final C19050xg A08 = new C99744uW(this);
    public final C16570tH A09;
    public final AnonymousClass1IT A0A;
    public final AnonymousClass1IA A0B;
    public final C14870pt A0C;
    public final C17840vj A0D;
    public final C20210zg A0E;
    public final C82864El A0F = new C82864El(this);
    public final C17830vi A0G;
    public final AnonymousClass5S0 A0H;
    public final C20180zd A0I;
    public final Runnable A0J = new RunnableRunnableShape12S0100000_I0_11((Object) this, 6);
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;

    public AnonymousClass1VZ(C16570tH r4, AnonymousClass1IT r5, AnonymousClass1IA r6, C14870pt r7, C17840vj r8, C20210zg r9, C17830vi r10, AnonymousClass5S0 r11, C20180zd r12, String str, String str2, String str3) {
        C18450wi.A0H(r7, 1);
        C18450wi.A0H(r8, 2);
        C18450wi.A0H(r12, 3);
        C18450wi.A0H(r6, 5);
        C18450wi.A0H(r4, 6);
        C18450wi.A0H(r9, 7);
        C18450wi.A0H(r5, 8);
        this.A0C = r7;
        this.A0D = r8;
        this.A0I = r12;
        this.A0H = r11;
        this.A0B = r6;
        this.A09 = r4;
        this.A0E = r9;
        this.A0A = r5;
        this.A0K = str;
        this.A0N = str2;
        this.A0L = str3;
        this.A0G = r10;
        UUID randomUUID = UUID.randomUUID();
        C18450wi.A0B(randomUUID);
        this.A0M = C18450wi.A06("FCS_STATE_MACHINE", randomUUID);
    }

    public static final /* synthetic */ void A00(AnonymousClass1VZ r1, String str) {
        C20210zg r0 = r1.A0E;
        r0.A02.A03(r1.A00, str);
    }

    public static final /* synthetic */ void A01(AnonymousClass1VZ r2, String str, Map map, short s2) {
        C20210zg r0 = r2.A0E;
        r0.A02.A05(r2.A00, s2);
        if (str == null) {
            str = r2.A06;
            if (str == null) {
                r2.A08(map);
                return;
            }
            r2.A06 = null;
        }
        r2.A07(str, map, (Map) null, false);
    }

    public final AnonymousClass1IC A02(String str) {
        C18450wi.A0H(str, 0);
        AnonymousClass4RI AD6 = this.A0H.AD6(str);
        if (AD6 == null) {
            return null;
        }
        return AD6.A00();
    }

    public final void A03(AnonymousClass1IC r21, C77633w6 r22, Map map, boolean z2) {
        Object obj;
        Map map2;
        AnonymousClass1IC r6 = r21;
        String A002 = r6.A00();
        A06("resource_id", A002);
        Map map3 = map;
        if (map == null) {
            obj = null;
            map2 = AnonymousClass1Z8.A00;
        } else {
            obj = map3.get(C796140n.ERROR.key);
            map2 = map3;
        }
        C77633w6 r8 = r22;
        Map A003 = C90284dt.A00(C89584cU.A01(map2, r8.A05));
        if (obj != null) {
            A003.put("error", obj);
        }
        Object obj2 = A003.get("app_id");
        this.A05 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = A003.get("context");
        String str = obj3 instanceof String ? (String) obj3 : null;
        String str2 = r8.A01;
        int i2 = this.A00;
        String str3 = this.A0L;
        AnonymousClass3BM r9 = this.A01;
        if (r9 == null) {
            C18450wi.A0O("backNavManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass4WX r12 = new AnonymousClass4WX(str2, str3, r9.A01(), i2, r9.A02);
        AnonymousClass39C r14 = new AnonymousClass39C(this, r8, str, A002, map3);
        if (!(r6 instanceof AnonymousClass1IW)) {
            AnonymousClass3BM r0 = this.A01;
            if (r0 == null) {
                C18450wi.A0O("backNavManager");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            AnonymousClass4W2 r02 = r0.A06;
            C87144Vo r2 = new C87144Vo(r8, map3);
            r02.A00.put(r2.A00.A01, r2);
        } else if (z2) {
            AnonymousClass1IW r62 = (AnonymousClass1IW) r6;
            if (r62 instanceof AnonymousClass1JG) {
                AnonymousClass1JG r63 = (AnonymousClass1JG) r62;
                String str4 = r12.A01;
                r63.A00 = str4;
                C25401Jq r3 = new C25401Jq(str4, r12.A02);
                r63.A02.A00 = r3;
                r63.A01.A02(r14, str4, A003, r3, r12.A00);
                r63.A05(A003);
            } else if (r62 instanceof AnonymousClass1IU) {
                AnonymousClass1IU r64 = (AnonymousClass1IU) r62;
                int i3 = r12.A00;
                String str5 = r12.A01;
                r64.A00 = str5;
                C25401Jq r23 = new C25401Jq(str5, r12.A02);
                r64.A02.A00 = r23;
                r64.A01.A02(r14, str5, A003, r23, i3);
                r64.A05(A003);
            } else {
                AnonymousClass1IY r65 = (AnonymousClass1IY) r62;
                String str6 = r12.A01;
                r65.A00 = str6;
                C25401Jq r32 = new C25401Jq(str6, r12.A02);
                r65.A02.A00 = r32;
                r65.A01.A02(r14, str6, A003, r32, r12.A00);
                r65.A05(A003);
            }
            A04(r8, map3);
            return;
        } else {
            AnonymousClass3BM r92 = this.A01;
            if (r92 == null) {
                C18450wi.A0O("backNavManager");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            if (r92.A03) {
                r92.A03 = false;
            } else {
                AnonymousClass4W2 r11 = r92.A06;
                boolean contains = r11.A01.contains(str2);
                boolean contains2 = r11.A02.contains(str2);
                if ((contains || contains2) && !r92.A01) {
                    r92.A03(str2, (String) null, map3, false);
                    this.A0E.A02.A05(this.A00, 4);
                    return;
                }
            }
            A04(r8, map3);
        }
        AnonymousClass4TZ r24 = this.A02;
        if (r24 == null) {
            C18450wi.A0O("fcsLoadingEventManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r24.A00(C797241a.ON_START, str, A002, (Map) null);
        r6.A03(r14, r12, A003);
    }

    public final void A04(C77633w6 r7, Map map) {
        AnonymousClass4W2 r1;
        Stack stack;
        AnonymousClass3BM r4 = this.A01;
        if (r4 == null) {
            C18450wi.A0O("backNavManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        Map map2 = map;
        if (map == null) {
            map2 = AnonymousClass1Z8.A00;
        }
        AnonymousClass38L r5 = new AnonymousClass38L((Map) C90284dt.A00(C89584cU.A01(map2, r7.A05)).get("presentation"));
        String str = r7.A01;
        JSONObject put = new JSONObject().put("isModalOnScreen", r4.A02);
        AnonymousClass41L r2 = r5.A02;
        C18450wi.A0B(put.put("presentationType", r2).put("backstack_input", map));
        r4.A00 = r5.A03;
        if (r2 != AnonymousClass41L.MODAL || r4.A02) {
            boolean z2 = r4.A02;
            r1 = r4.A06;
            if (z2) {
                stack = r1.A02;
                stack.add(str);
                C87144Vo r22 = new C87144Vo(r7, map);
                r1.A00.put(r22.A00.A01, r22);
            }
        } else {
            r1 = r4.A06;
            r1.A02.add(str);
        }
        stack = r1.A01;
        stack.add(str);
        C87144Vo r222 = new C87144Vo(r7, map);
        r1.A00.put(r222.A00.A01, r222);
    }

    public final void A05(C86034Qy r4, Map map) {
        this.A03 = r4;
        int hashCode = r4.hashCode();
        this.A00 = hashCode;
        C20210zg r0 = this.A0E;
        String str = this.A0K;
        r0.A00(hashCode, str);
        A06("state_name", r4.A01);
        A06("config_name", str);
        C18450wi.A0B(new JSONObject().put("input", map));
    }

    public final void A06(String str, String str2) {
        C20210zg r3 = this.A0E;
        r3.A02(this.A00, str, str2);
        r3.A02(this.A00, "session_id", this.A0N);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r12 != null) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.lang.String r10, java.util.Map r11, java.util.Map r12, boolean r13) {
        /*
            r9 = this;
            r5 = r9
            X.0vi r0 = r9.A0G
            java.util.Map r0 = r0.A00
            r7 = r10
            java.lang.Object r6 = r0.get(r10)
            X.4Qy r6 = (X.C86034Qy) r6
            if (r6 == 0) goto L_0x014e
            X.0pt r1 = r9.A0C
            java.lang.Runnable r0 = r9.A0J
            r1.A0J(r0)
            boolean r0 = r6 instanceof X.C77613w4
            if (r0 == 0) goto L_0x0025
            r9.A05(r6, r11)
            X.5Fv r0 = new X.5Fv
            r0.<init>(r9)
            r6.A00(r11, r0)
            return
        L_0x0025:
            boolean r0 = r6 instanceof X.C77633w6
            if (r0 == 0) goto L_0x0132
            r8 = 0
            if (r12 != 0) goto L_0x0056
            X.3BM r0 = r9.A01
            java.lang.String r1 = "backNavManager"
            if (r0 != 0) goto L_0x003d
            X.C18450wi.A0O(r1)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x003d:
            java.util.ArrayList r0 = r0.A01()
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x0056
            X.3BM r0 = r9.A01
            if (r0 != 0) goto L_0x0078
            X.C18450wi.A0O(r1)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0056:
            X.4Pa r2 = new X.4Pa
            r2.<init>()
            r0 = r6
            X.3w6 r0 = (X.C77633w6) r0
            java.lang.String r1 = r0.A01
            if (r11 != 0) goto L_0x0068
            if (r12 != 0) goto L_0x0066
            X.1Z8 r12 = X.AnonymousClass1Z8.A00
        L_0x0066:
            r8 = r12
            goto L_0x0088
        L_0x0068:
            if (r12 == 0) goto L_0x0076
            java.lang.String r0 = "merge"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            java.util.Map r11 = r2.A00(r12, r11)
        L_0x0076:
            r8 = r11
            goto L_0x0088
        L_0x0078:
            X.4W2 r0 = r0.A06
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r10)
            X.4Vo r0 = (X.C87144Vo) r0
            if (r0 == 0) goto L_0x0088
            java.util.Map r12 = r0.A01
            if (r12 != 0) goto L_0x0056
        L_0x0088:
            X.3w6 r6 = (X.C77633w6) r6
            X.5S0 r0 = r9.A0H
            java.lang.String r1 = r6.A02
            X.4RI r0 = r0.AD6(r1)
            r3 = 0
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "Resource not found: "
            java.lang.String r0 = X.C18450wi.A06(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r9.A08(r3)
            return
        L_0x00a2:
            X.1IC r4 = r0.A00()
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x00b9
            boolean r0 = r4 instanceof X.AnonymousClass1IG
            if (r0 == 0) goto L_0x00b6
            r1 = r4
            X.1IG r1 = (X.AnonymousClass1IG) r1
            java.lang.String r0 = r9.A0M
            r1.A59(r0)
        L_0x00b6:
            r4.A01()
        L_0x00b9:
            if (r13 != 0) goto L_0x0124
            boolean r0 = r4 instanceof X.AnonymousClass1IX
            r1 = 1
            if (r0 == 0) goto L_0x0124
            X.3BM r0 = r9.A01
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "backNavManager"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00d1:
            java.util.ArrayList r0 = r0.A01()
            int r0 = r0.size()
            if (r0 < r1) goto L_0x0124
            boolean r0 = r9.A07
            if (r0 == 0) goto L_0x0124
            X.4TZ r2 = r9.A02
            if (r2 != 0) goto L_0x00f0
            java.lang.String r0 = "fcsLoadingEventManager"
            X.C18450wi.A0O(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00f0:
            java.lang.String r1 = r9.A05
            java.lang.String r0 = "onStartLoading"
            r2.A01(r3, r0, r1)
            r2 = r4
            X.1IX r2 = (X.AnonymousClass1IX) r2
            if (r8 != 0) goto L_0x011a
            X.1Z8 r1 = X.AnonymousClass1Z8.A00
        L_0x00fe:
            java.util.Map r0 = r6.A05
            java.lang.Object r0 = X.C89584cU.A01(r1, r0)
            java.util.Map r1 = X.C90284dt.A00(r0)
            if (r3 == 0) goto L_0x010f
            java.lang.String r0 = "error"
            r1.put(r0, r3)
        L_0x010f:
            int r0 = r9.A00
            X.4Ro r3 = new X.4Ro
            r3.<init>(r4, r5, r6, r7, r8)
            r2.Aak(r3, r1, r0)
            return
        L_0x011a:
            X.40n r0 = X.C796140n.ERROR
            java.lang.String r0 = r0.key
            java.lang.Object r3 = r8.get(r0)
            r1 = r8
            goto L_0x00fe
        L_0x0124:
            boolean r0 = r4 instanceof X.AnonymousClass1IX
            if (r0 == 0) goto L_0x012b
            r0 = 1
            r9.A07 = r0
        L_0x012b:
            r9.A05(r6, r8)
            r9.A03(r4, r6, r8, r13)
            return
        L_0x0132:
            boolean r0 = r6 instanceof X.C77603w3
            if (r0 != 0) goto L_0x0142
            boolean r0 = r6 instanceof X.C77623w5
            if (r0 != 0) goto L_0x0142
            java.lang.String r1 = "Unsupported Type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0142:
            r9.A05(r6, r11)
            X.5Fw r0 = new X.5Fw
            r0.<init>(r9)
            r6.A00(r11, r0)
            return
        L_0x014e:
            java.lang.String r0 = "state not found for name: "
            java.lang.String r1 = X.C18450wi.A06(r0, r10)
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VZ.A07(java.lang.String, java.util.Map, java.util.Map, boolean):void");
    }

    public final void A08(Map map) {
        this.A0C.A0J(this.A0J);
        this.A0H.AXb();
        AnonymousClass3BM r0 = this.A01;
        if (r0 == null) {
            C18450wi.A0O("backNavManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass4W2 r1 = r0.A06;
        r1.A01.removeAllElements();
        r1.A02.removeAllElements();
        AnonymousClass3BM r02 = this.A01;
        if (r02 == null) {
            C18450wi.A0O("backNavManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r02.A07.A01(new C1206562m(C440222l.A00));
        AnonymousClass3BM r12 = this.A01;
        if (r12 == null) {
            C18450wi.A0O("backNavManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        r12.A07.A03(r12);
        this.A09.A03(this.A08);
        C20180zd r2 = this.A0I;
        String str = this.A0M;
        synchronized (r2) {
            C20180zd.A02.remove(str);
        }
        this.A03 = null;
        AnonymousClass4IQ r03 = this.A04;
        if (r03 != null) {
            C17950vu r4 = r03.A01;
            AnonymousClass5Q9 r3 = r03.A00;
            C17850vk r22 = r4.A0C;
            String str2 = r4.A0F;
            synchronized (r22) {
                r22.A00.remove(str2);
            }
            r4.A0A.A00.clear();
            if (r3 != null) {
                r3.ARR(map);
            }
            r4.A00 = null;
        }
        this.A04 = null;
    }
}
