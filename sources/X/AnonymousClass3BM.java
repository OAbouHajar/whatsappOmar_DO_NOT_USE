package X;

import com.facebook.redex.IDxCEventShape180S0100000_2_I1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.3BM  reason: invalid class name */
public final class AnonymousClass3BM {
    public C797341b A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final C17840vj A04;
    public final C82864El A05;
    public final AnonymousClass4W2 A06;
    public final C52372dh A07;

    public AnonymousClass3BM(C17840vj r5, C82864El r6, AnonymousClass4W2 r7, C20180zd r8, String str, boolean z2) {
        C18450wi.A0I(r8, 1, r5);
        C18450wi.A0H(str, 4);
        C18450wi.A0H(r6, 5);
        this.A06 = r7;
        this.A04 = r5;
        this.A05 = r6;
        C52372dh A022 = r8.A02(str);
        this.A07 = A022;
        this.A02 = z2;
        A022.A00(new C1036452e(this, z2), C1207362u.class, this);
        A022.A00(new IDxCEventShape180S0100000_2_I1(this, 1), C1036552f.class, this);
    }

    public static /* synthetic */ void A00(AnonymousClass3BM r8, C1207362u r9, boolean z2) {
        C18450wi.A0H(r9, 2);
        AnonymousClass1VZ r7 = r8.A05.A00;
        AnonymousClass1VZ.A00(r7, "actionPerformed");
        r7.A06("action_performed", "cancel");
        r7.A0E.A02.A05(r7.A00, 4);
        String str = r9.A00;
        if (str != null) {
            AnonymousClass4W2 r4 = r8.A06;
            Stack stack = r4.A01;
            boolean contains = stack.contains(str);
            Stack stack2 = r4.A02;
            if (!stack2.contains(str) && !contains) {
                Object peek = z2 ? stack2.peek() : stack.peek();
                C18450wi.A0B(peek);
                r4.A00((String) peek);
                r7.A07(str, (Map) null, r8.A02(str, r9.A01), false);
                return;
            }
        }
        r8.A03(str, r9.A01, (Map) null, r9.A02);
    }

    public final ArrayList A01() {
        Stack stack;
        boolean z2 = this.A02;
        AnonymousClass4W2 r4 = this.A06;
        if (z2) {
            Stack stack2 = r4.A01;
            if (C13680ns.A0n(stack2).size() > 1) {
                ArrayList A0n = C13680ns.A0n(stack2);
                ArrayList A0n2 = C13680ns.A0n(r4.A02);
                if (A0n2 instanceof Collection) {
                    ArrayList A0i = C13690nt.A0i(A0n.size() + A0n2.size());
                    A0i.addAll(A0n);
                    A0i.addAll(A0n2);
                    return A0i;
                }
                ArrayList A0n3 = C13680ns.A0n(A0n);
                C003201k.A0J(A0n2, A0n3);
                return A0n3;
            }
            stack = r4.A02;
        } else {
            stack = r4.A01;
        }
        return C13680ns.A0n(stack);
    }

    public final Map A02(String str, String str2) {
        LinkedHashMap linkedHashMap;
        Map A002 = this.A06.A00(str);
        if (A002 != null) {
            linkedHashMap = new LinkedHashMap(A002);
        }
        if (str2 != null) {
            Object A012 = C89844d1.A01(str2).A01("$", new AnonymousClass5OQ[0]);
            C18450wi.A0B(A012);
            linkedHashMap.putAll((Map) A012);
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e1, code lost:
        if (r9 == null) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r9, java.lang.String r10, java.util.Map r11, boolean r12) {
        /*
            r8 = this;
            r8.A01 = r12
            r3 = 0
            r5 = 0
            if (r12 == 0) goto L_0x0011
            X.41b r1 = r8.A00
            if (r1 != 0) goto L_0x00ee
            java.lang.String r0 = "currentLeadingButtonConfig"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x0011:
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x00e1
            X.4W2 r4 = r8.A06
            java.util.Stack r2 = r4.A02
            if (r9 != 0) goto L_0x0038
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x00aa
            r8.A02 = r3
            java.lang.Object r0 = r2.peek()
            X.C18450wi.A0B(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.A00(r0)
            r4.A02()
        L_0x0033:
            r8.A04(r10, r11)
            goto L_0x010f
        L_0x0038:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0067
            java.lang.Object r0 = r2.firstElement()
            boolean r0 = X.C18450wi.A0R(r0, r9)
            if (r0 == 0) goto L_0x0053
            X.40v r0 = X.C796740v.FIRST_FRAGMENT
        L_0x004a:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x008a;
                case 2: goto L_0x006a;
                default: goto L_0x0051;
            }
        L_0x0051:
            goto L_0x010f
        L_0x0053:
            boolean r0 = r2.contains(r9)
            if (r0 == 0) goto L_0x005c
            X.40v r0 = X.C796740v.FRAGMENT
            goto L_0x004a
        L_0x005c:
            java.util.Stack r0 = r4.A01
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x0067
            X.40v r0 = X.C796740v.NOT_IDENTIFIED
            goto L_0x004a
        L_0x0067:
            X.40v r0 = X.C796740v.ACTIVITY
            goto L_0x004a
        L_0x006a:
            X.2dh r1 = r8.A07
            X.62l r0 = new X.62l
            r0.<init>(r9)
            r1.A01(r0)
        L_0x0074:
            java.lang.Object r1 = r2.lastElement()
            X.C18450wi.A0B(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.C18450wi.A0R(r1, r9)
            if (r0 != 0) goto L_0x00c3
            r4.A00(r1)
            r4.A02()
            goto L_0x0074
        L_0x008a:
            X.2dh r1 = r8.A07
            X.62l r0 = new X.62l
            r0.<init>(r9)
            r1.A01(r0)
        L_0x0094:
            java.lang.Object r1 = r2.lastElement()
            X.C18450wi.A0B(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.C18450wi.A0R(r1, r9)
            if (r0 != 0) goto L_0x00c3
            r4.A00(r1)
            r4.A02()
            goto L_0x0094
        L_0x00aa:
            X.2dh r1 = r8.A07
            X.62l r0 = new X.62l
            r0.<init>(r5)
            r1.A01(r0)
            java.lang.Object r0 = r2.peek()
            X.C18450wi.A0B(r0)
            java.lang.String r0 = (java.lang.String) r0
            r4.A00(r0)
            r4.A02()
        L_0x00c3:
            java.lang.Object r2 = r2.peek()
            X.C18450wi.A0B(r2)
            java.lang.String r2 = (java.lang.String) r2
            r4.A02()
            r0 = 1
            r8.A03 = r0
            X.4El r0 = r8.A05
            java.util.Map r1 = r8.A02(r2, r10)
            X.C18450wi.A0H(r2, r3)
            X.1VZ r0 = r0.A00
            r0.A07(r2, r11, r1, r3)
            goto L_0x010f
        L_0x00e1:
            if (r9 != 0) goto L_0x00ea
            goto L_0x0033
        L_0x00e5:
            r2.removeAllElements()
            r8.A02 = r3
        L_0x00ea:
            r8.A05(r11, r9, r10)
            goto L_0x010f
        L_0x00ee:
            X.41b r0 = X.C797341b.CLOSE
            if (r1 != r0) goto L_0x0011
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0033
            r8.A02 = r3
            X.4W2 r6 = r8.A06
            java.util.Stack r7 = r6.A01
            int r4 = r7.size()
            java.util.Stack r2 = r6.A02
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x0112
            r2.removeAllElements()
            r8.A04(r5, r11)
        L_0x010f:
            r8.A01 = r3
            return
        L_0x0112:
            if (r4 <= r0) goto L_0x0165
            java.util.ArrayList r1 = X.C13680ns.A0n(r2)
            java.lang.Object r0 = r7.lastElement()
            X.C18450wi.A0B(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x012c
            r2.removeAllElements()
            r8.A05(r11, r5, r5)
            goto L_0x010f
        L_0x012c:
            r6.A01()
            r2.removeAllElements()
            java.lang.Object r4 = r7.peek()
            X.C18450wi.A0B(r4)
            java.lang.String r4 = (java.lang.String) r4
            r6.A01()
            java.util.ArrayList r2 = X.C13680ns.A0n(r7)
            X.2dh r1 = r8.A07
            X.62m r0 = new X.62m
            r0.<init>(r2)
            r1.A01(r0)
            X.4El r2 = r8.A05
            X.C18450wi.A0H(r4, r3)
            java.util.Map r0 = r6.A00
            java.lang.Object r0 = r0.get(r4)
            X.4Vo r0 = (X.C87144Vo) r0
            if (r0 != 0) goto L_0x0162
            r1 = 0
        L_0x015c:
            X.1VZ r0 = r2.A00
            r0.A07(r4, r11, r1, r3)
            goto L_0x010f
        L_0x0162:
            java.util.Map r1 = r0.A01
            goto L_0x015c
        L_0x0165:
            X.4El r0 = r8.A05
            X.1VZ r0 = r0.A00
            X.0pt r1 = r0.A0C
            java.lang.Runnable r0 = r0.A0J
            r1.A0K(r0)
            goto L_0x010f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3BM.A03(java.lang.String, java.lang.String, java.util.Map, boolean):void");
    }

    public final void A04(String str, Map map) {
        AnonymousClass4W2 r6 = this.A06;
        Stack stack = r6.A01;
        if (stack.size() == 1) {
            this.A07.A01(new C1206562m(C440222l.A00));
            stack.removeAllElements();
            r6.A02.removeAllElements();
            AnonymousClass1VZ r0 = this.A05.A00;
            r0.A0C.A0K(r0.A0J);
            return;
        }
        Object peek = stack.peek();
        C18450wi.A0B(peek);
        r6.A00((String) peek);
        r6.A01();
        Object peek2 = stack.peek();
        C18450wi.A0B(peek2);
        String str2 = (String) peek2;
        this.A07.A01(new C1206562m(C13680ns.A0n(stack)));
        r6.A01();
        C82864El r2 = this.A05;
        Map A022 = A02(str2, str);
        C18450wi.A0H(str2, 0);
        r2.A00.A07(str2, map, A022, true);
    }

    public final void A05(Map map, String str, String str2) {
        boolean A0I = C003101j.A0I(A01(), str);
        if (A0I) {
            AnonymousClass4W2 r5 = this.A06;
            Stack stack = r5.A01;
            while (true) {
                Object lastElement = stack.lastElement();
                C18450wi.A0B(lastElement);
                String str3 = (String) lastElement;
                if (!C18450wi.A0R(str3, str)) {
                    r5.A00(str3);
                    r5.A01();
                } else {
                    this.A07.A01(new C1206562m(C13680ns.A0n(stack)));
                    Object peek = stack.peek();
                    C18450wi.A0B(peek);
                    String str4 = (String) peek;
                    r5.A01();
                    C82864El r2 = this.A05;
                    Map A022 = A02(str4, str2);
                    C18450wi.A0H(str4, 0);
                    r2.A00.A07(str4, map, A022, A0I);
                    return;
                }
            }
        }
    }
}
