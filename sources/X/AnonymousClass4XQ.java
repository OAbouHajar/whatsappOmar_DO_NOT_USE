package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4XQ  reason: invalid class name */
public abstract class AnonymousClass4XQ {
    public int A00 = -1;
    public AnonymousClass4XQ A01;
    public AnonymousClass4XQ A02;
    public Boolean A03 = null;
    public Boolean A04 = null;

    public AnonymousClass4XQ A00() {
        AnonymousClass4XQ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw AnonymousClass000.A0V("Current path token is a leaf");
    }

    public String A01() {
        if (this instanceof C70273gO) {
            return "[*]";
        }
        if (this instanceof C70323gT) {
            return "..";
        }
        if (this instanceof C70303gR) {
            return ((C70303gR) this).A02;
        }
        if (this instanceof C70283gP) {
            C70283gP r1 = (C70283gP) this;
            StringBuilder A0r = AnonymousClass000.A0r("[");
            A0r.append(C90264dr.A00(r1.A01, ",", r1.A00));
            return AnonymousClass000.A0h("]", A0r);
        } else if (this instanceof C70313gS) {
            C70313gS r3 = (C70313gS) this;
            StringBuilder A0r2 = AnonymousClass000.A0r("[");
            for (int i2 = 0; i2 < r3.A00.size(); i2++) {
                if (i2 != 0) {
                    A0r2.append(",");
                }
                A0r2.append("?");
            }
            return AnonymousClass000.A0h("]", A0r2);
        } else if (!(this instanceof C70293gQ)) {
            return this instanceof C70253gM ? ((C70253gM) this).A00.toString() : ((C70243gL) this).A00.toString();
        } else {
            return AnonymousClass000.A0h(((C70293gQ) this).A02, AnonymousClass000.A0r("."));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01e0, code lost:
        r2.A03 = java.lang.Boolean.TRUE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass552 r21, X.C89314bx r22, java.lang.Object r23, java.lang.String r24) {
        /*
            r20 = this;
            r8 = r21
            r3 = r20
            boolean r0 = r3 instanceof X.C70273gO
            r9 = r22
            r12 = r23
            r13 = r24
            if (r0 == 0) goto L_0x004e
            X.4RV r6 = r9.A01
            X.5Tl r5 = r6.A00
            boolean r0 = r12 instanceof java.util.Map
            if (r0 == 0) goto L_0x0030
            java.util.Collection r0 = r5.AFG(r12)
            java.util.Iterator r1 = r0.iterator()
        L_0x001e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r1.next()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r3.A04(r9, r12, r13, r0)
            goto L_0x001e
        L_0x0030:
            boolean r0 = r12 instanceof java.util.List
            if (r0 == 0) goto L_0x0062
            r4 = 0
        L_0x0035:
            int r0 = r5.AK7(r12)
            if (r4 >= r0) goto L_0x0062
            r3.A03(r9, r12, r13, r4)     // Catch:{ 3ft -> 0x003f }
            goto L_0x004b
        L_0x003f:
            r2 = move-exception
            java.util.Set r1 = r6.A03
            X.420 r0 = X.AnonymousClass420.REQUIRE_PROPERTIES
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x004b
            throw r2
        L_0x004b:
            int r4 = r4 + 1
            goto L_0x0035
        L_0x004e:
            boolean r0 = r3 instanceof X.C70323gT
            if (r0 == 0) goto L_0x0084
            X.4XQ r10 = r3.A00()
            boolean r0 = r10 instanceof X.C70283gP
            if (r0 == 0) goto L_0x0063
            X.4uS r11 = new X.4uS
            r11.<init>(r9, r10)
        L_0x005f:
            X.C70323gT.A00(r8, r9, r10, r11, r12, r13)
        L_0x0062:
            return
        L_0x0063:
            boolean r0 = r10 instanceof X.C70263gN
            if (r0 == 0) goto L_0x006d
            X.4uQ r11 = new X.4uQ
            r11.<init>(r9)
            goto L_0x005f
        L_0x006d:
            boolean r0 = r10 instanceof X.C70273gO
            if (r0 == 0) goto L_0x0077
            X.4uP r11 = new X.4uP
            r11.<init>()
            goto L_0x005f
        L_0x0077:
            boolean r0 = r10 instanceof X.C70313gS
            if (r0 == 0) goto L_0x0081
            X.4uR r11 = new X.4uR
            r11.<init>(r9, r10)
            goto L_0x005f
        L_0x0081:
            X.5OU r11 = X.C70323gT.A00
            goto L_0x005f
        L_0x0084:
            boolean r0 = r3 instanceof X.C70303gR
            if (r0 == 0) goto L_0x009a
            X.3gR r3 = (X.C70303gR) r3
            X.4XQ r0 = r3.A01
            if (r0 != 0) goto L_0x02c4
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x0094
            X.552 r8 = X.AnonymousClass552.A01
        L_0x0094:
            java.lang.String r0 = r3.A02
            r9.A02(r8, r12, r0)
            return
        L_0x009a:
            boolean r0 = r3 instanceof X.C70283gP
            if (r0 == 0) goto L_0x0117
            X.3gP r3 = (X.C70283gP) r3
            X.4RV r1 = r9.A01
            X.5Tl r6 = r1.A00
            boolean r0 = r12 instanceof java.util.Map
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x00e4
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x0062
            java.util.Set r1 = r1.A03
            X.420 r0 = X.AnonymousClass420.SUPPRESS_EXCEPTIONS
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0062
            if (r23 != 0) goto L_0x00df
            java.lang.String r1 = "null"
        L_0x00be:
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r0 = r3.A01()
            r2[r4] = r0
            r2[r5] = r24
            r0 = 2
            r2[r0] = r1
            r1 = 3
            java.lang.String r0 = X.AnonymousClass000.A0d(r6)
            r2[r1] = r0
            java.lang.String r0 = "Expected to find an object with property %s in path %s but found '%s'. This is not a json object according to the JsonProvider: '%s'."
            java.lang.String r1 = java.lang.String.format(r0, r2)
            X.3ft r0 = new X.3ft
            r0.<init>(r1)
            throw r0
        L_0x00df:
            java.lang.String r1 = X.AnonymousClass000.A0d(r12)
            goto L_0x00be
        L_0x00e4:
            java.util.List r1 = r3.A01
            int r0 = r1.size()
            if (r0 == r5) goto L_0x00f6
            X.4XQ r0 = r3.A01
            if (r0 != 0) goto L_0x00fa
            int r0 = r1.size()
            if (r0 <= r5) goto L_0x00fa
        L_0x00f6:
            r3.A04(r9, r12, r13, r1)
            return
        L_0x00fa:
            java.util.ArrayList r2 = X.C13690nt.A0i(r5)
            r0 = 0
            r2.add(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0106:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r1.next()
            r2.set(r4, r0)
            r3.A04(r9, r12, r13, r2)
            goto L_0x0106
        L_0x0117:
            boolean r0 = r3 instanceof X.C70313gS
            if (r0 == 0) goto L_0x0179
            X.3gS r3 = (X.C70313gS) r3
            X.4RV r5 = r9.A01
            X.5Tl r1 = r5.A00
            boolean r0 = r12 instanceof java.util.Map
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r9.A04
            boolean r0 = r3.A08(r5, r9, r12, r0)
            if (r0 == 0) goto L_0x0062
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x0133
            X.552 r8 = X.AnonymousClass552.A01
        L_0x0133:
            X.4XQ r0 = r3.A01
            if (r0 != 0) goto L_0x02ce
            r9.A02(r8, r12, r13)
            return
        L_0x013b:
            boolean r0 = r12 instanceof java.util.List
            r4 = 0
            if (r0 == 0) goto L_0x0160
            java.lang.Iterable r0 = r1.Ago(r12)
            java.util.Iterator r2 = r0.iterator()
        L_0x0148:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r9.A04
            boolean r0 = r3.A08(r5, r9, r1, r0)
            if (r0 == 0) goto L_0x015d
            r3.A03(r9, r12, r13, r4)
        L_0x015d:
            int r4 = r4 + 1
            goto L_0x0148
        L_0x0160:
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x0062
            java.lang.Object[] r1 = X.C13690nt.A1Z()
            java.lang.String r0 = r3.toString()
            X.C13690nt.A1L(r0, r12, r1)
            java.lang.String r0 = "Filter: %s can not be applied to primitives. Current context is: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            goto L_0x02fb
        L_0x0179:
            boolean r0 = r3 instanceof X.C70293gQ
            if (r0 == 0) goto L_0x0210
            X.3gQ r3 = (X.C70293gQ) r3
            java.lang.String r4 = r3.A01
            java.util.Map r0 = X.AnonymousClass49E.A00
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L_0x02ec
            java.lang.Object r14 = r0.newInstance()     // Catch:{ Exception -> 0x02d6 }
            X.5OS r14 = (X.AnonymousClass5OS) r14     // Catch:{ Exception -> 0x02d6 }
            java.util.List r0 = r3.A00
            if (r0 == 0) goto L_0x01e5
            java.util.Iterator r7 = r0.iterator()
        L_0x0199:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r2 = r7.next()
            X.4eA r2 = (X.C90454eA) r2
            X.41D r0 = r2.A00
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x01af;
                case 1: goto L_0x01c3;
                default: goto L_0x01ae;
            }
        L_0x01ae:
            goto L_0x0199
        L_0x01af:
            java.lang.Boolean r0 = r2.A03
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0199
            X.4RV r0 = r9.A01
            X.5Tl r1 = r0.A00
            X.4uM r0 = new X.4uM
            r0.<init>(r2, r1)
            r2.A01 = r0
            goto L_0x01e0
        L_0x01c3:
            X.4TN r6 = r2.A02
            java.lang.Object r5 = r9.A04
            X.4RV r0 = r9.A01
            X.4uN r1 = new X.4uN
            r1.<init>(r0, r6, r5)
            java.lang.Boolean r0 = r2.A03
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01de
            X.5OT r0 = r2.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0199
        L_0x01de:
            r2.A01 = r1
        L_0x01e0:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.A03 = r0
            goto L_0x0199
        L_0x01e5:
            java.util.List r0 = r3.A00
            r15 = r8
            r16 = r9
            r17 = r12
            r18 = r13
            r19 = r0
            java.lang.Object r2 = r14.AIZ(r15, r16, r17, r18, r19)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r13)
            java.lang.String r0 = "."
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r1)
            r9.A02(r8, r2, r0)
            X.4XQ r0 = r3.A01
            if (r0 == 0) goto L_0x0062
            X.4XQ r0 = r3.A00()
            r0.A02(r8, r9, r2, r13)
            return
        L_0x0210:
            boolean r0 = r3 instanceof X.C70253gM
            if (r0 == 0) goto L_0x028f
            X.3gM r3 = (X.C70253gM) r3
            boolean r0 = r3.A08(r9, r12, r13)
            if (r0 == 0) goto L_0x0062
            X.4R7 r4 = r3.A00
            X.41W r0 = r4.A00
            int r1 = r0.ordinal()
            X.4RV r0 = r9.A01
            X.5Tl r0 = r0.A00
            switch(r1) {
                case 0: goto L_0x026d;
                case 1: goto L_0x024e;
                default: goto L_0x022b;
            }
        L_0x022b:
            int r2 = r0.AK7(r12)
            java.lang.Integer r0 = r4.A01
            int r1 = r0.intValue()
            java.lang.Integer r0 = r4.A02
            int r0 = r0.intValue()
            int r0 = java.lang.Math.min(r2, r0)
            if (r1 >= r0) goto L_0x0062
            if (r2 == 0) goto L_0x0062
            r3.toString()
        L_0x0246:
            if (r1 >= r0) goto L_0x0062
            r3.A03(r9, r12, r13, r1)
            int r1 = r1 + 1
            goto L_0x0246
        L_0x024e:
            int r1 = r0.AK7(r12)
            if (r1 == 0) goto L_0x0062
            java.lang.Integer r0 = r4.A02
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x025d
            int r0 = r0 + r1
        L_0x025d:
            int r1 = java.lang.Math.min(r1, r0)
            r0 = 0
            r3.toString()
        L_0x0265:
            if (r0 >= r1) goto L_0x0062
            r3.A03(r9, r12, r13, r0)
            int r0 = r0 + 1
            goto L_0x0265
        L_0x026d:
            int r2 = r0.AK7(r12)
            java.lang.Integer r0 = r4.A01
            int r1 = r0.intValue()
            if (r1 >= 0) goto L_0x027a
            int r1 = r1 + r2
        L_0x027a:
            r0 = 0
            int r0 = java.lang.Math.max(r0, r1)
            r3.toString()
            if (r2 == 0) goto L_0x0062
            if (r0 < r2) goto L_0x0287
            return
        L_0x0287:
            if (r0 >= r2) goto L_0x0062
            r3.A03(r9, r12, r13, r0)
            int r0 = r0 + 1
            goto L_0x0287
        L_0x028f:
            X.3gL r3 = (X.C70243gL) r3
            boolean r0 = r3.A08(r9, r12, r13)
            if (r0 == 0) goto L_0x0062
            X.4ae r0 = r3.A00
            java.util.List r2 = r0.A00
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x02ae
            java.lang.Object r0 = X.C13690nt.A0Z(r2)
            int r0 = X.AnonymousClass000.A0D(r0)
            r3.A03(r9, r12, r13, r0)
            return
        L_0x02ae:
            java.util.Iterator r1 = r2.iterator()
        L_0x02b2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r1.next()
            int r0 = X.AnonymousClass000.A0D(r0)
            r3.A03(r9, r12, r13, r0)
            goto L_0x02b2
        L_0x02c4:
            X.4XQ r1 = r3.A00()
            java.lang.String r0 = r3.A02
            r1.A02(r8, r9, r12, r0)
            return
        L_0x02ce:
            X.4XQ r0 = r3.A00()
            r0.A02(r8, r9, r12, r13)
            return
        L_0x02d6:
            r2 = move-exception
            java.lang.String r0 = "Function of name: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r4)
            java.lang.String r0 = " cannot be created"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.3fx r0 = new X.3fx
            r0.<init>(r1, r2)
            throw r0
        L_0x02ec:
            java.lang.String r0 = "Function with name: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r4)
            java.lang.String r0 = " does not exist."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
        L_0x02fb:
            X.3fx r0 = X.C70003fx.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XQ.A02(X.552, X.4bx, java.lang.Object, java.lang.String):void");
    }

    public void A03(C89314bx r5, Object obj, String str, int i2) {
        String A022 = C90264dr.A02(str, "[", String.valueOf(i2), "]");
        AnonymousClass552 r2 = r5.A08 ? new C70053g2(obj, i2) : AnonymousClass552.A01;
        if (i2 < 0) {
            i2 += r5.A01.A00.AK7(obj);
        }
        try {
            Object obj2 = ((List) obj).get(i2);
            if (this.A01 == null) {
                r5.A02(r2, obj2, A022);
            } else {
                A00().A02(r2, r5, obj2, A022);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public void A04(C89314bx r11, Object obj, String str, List list) {
        Object obj2;
        Object obj3 = null;
        if (list.size() == 1) {
            String A0n = AnonymousClass000.A0n(list, 0);
            String A022 = C90264dr.A02(str, "['", A0n, "']");
            Map map = (Map) obj;
            Object obj4 = !map.containsKey(A0n) ? C109755Tl.A00 : map.get(A0n);
            if (obj4 != C109755Tl.A00) {
                obj3 = obj4;
            } else if (this.A01 == null) {
                Set set = r11.A01.A03;
                if (!set.contains(AnonymousClass420.DEFAULT_PATH_LEAF_TO_NULL)) {
                    if (!set.contains(AnonymousClass420.SUPPRESS_EXCEPTIONS) && set.contains(AnonymousClass420.REQUIRE_PROPERTIES)) {
                        throw new C69963ft(AnonymousClass000.A0h(A022, AnonymousClass000.A0r("No results for path: ")));
                    }
                    return;
                }
            } else if (((A07() && A06()) || r11.A01.A03.contains(AnonymousClass420.REQUIRE_PROPERTIES)) && !r11.A01.A03.contains(AnonymousClass420.SUPPRESS_EXCEPTIONS)) {
                throw new C69963ft(AnonymousClass000.A0h(A022, AnonymousClass000.A0q("Missing property in path ")));
            } else {
                return;
            }
            AnonymousClass552 r3 = r11.A08 ? new C70043g1(obj, A0n) : AnonymousClass552.A01;
            if (this.A01 == null) {
                StringBuilder A0q = AnonymousClass000.A0q("[");
                A0q.append(String.valueOf(this.A00));
                String A0h = AnonymousClass000.A0h("]", A0q);
                if (A0h.equals("[-1]") || r11.A02.A00.A01.A02.A01().equals(A0h)) {
                    r11.A02(r3, obj3, A022);
                    return;
                }
                return;
            }
            A00().A02(r3, r11, obj3, A022);
            return;
        }
        StringBuilder A0q2 = AnonymousClass000.A0q(str);
        A0q2.append("[");
        A0q2.append(C90264dr.A00(list, ", ", "'"));
        String A0h2 = AnonymousClass000.A0h("]", A0q2);
        AnonymousClass4RV r6 = r11.A01;
        C109755Tl r4 = r6.A00;
        Object A023 = ((C99724uU) r4).A00.A02();
        for (Object next : list) {
            if (r4.AFG(obj).contains(next)) {
                Map map2 = (Map) obj;
                obj2 = !map2.containsKey(next) ? C109755Tl.A00 : map2.get(next);
                if (obj2 == C109755Tl.A00) {
                    if (!r6.A03.contains(AnonymousClass420.DEFAULT_PATH_LEAF_TO_NULL)) {
                    }
                }
                r4.AeR(A023, next, obj2);
            } else {
                Set set2 = r6.A03;
                if (!set2.contains(AnonymousClass420.DEFAULT_PATH_LEAF_TO_NULL)) {
                    if (set2.contains(AnonymousClass420.REQUIRE_PROPERTIES)) {
                        throw new C69963ft(AnonymousClass000.A0h(A0h2, AnonymousClass000.A0q("Missing property in path ")));
                    }
                }
            }
            obj2 = null;
            r4.AeR(A023, next, obj2);
        }
        r11.A02(r11.A08 ? new C70033g0(obj, list) : AnonymousClass552.A01, A023, A0h2);
    }

    public boolean A05() {
        AnonymousClass4XQ r0;
        Boolean bool = this.A03;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean A06 = A06();
        if (A06 && (r0 = this.A01) != null) {
            A06 = r0.A05();
        }
        this.A03 = Boolean.valueOf(A06);
        return A06;
    }

    public boolean A06() {
        if ((this instanceof C70273gO) || (this instanceof C70323gT)) {
            return false;
        }
        if (this instanceof C70303gR) {
            return true;
        }
        if (this instanceof C70283gP) {
            C70283gP r3 = (C70283gP) this;
            List list = r3.A01;
            if (list.size() != 1) {
                return r3.A01 == null && list.size() > 1;
            }
            return true;
        } else if (this instanceof C70313gS) {
            return false;
        } else {
            if (this instanceof C70293gQ) {
                return true;
            }
            if (!(this instanceof C70253gM)) {
                return C13690nt.A1R(((C70243gL) this).A00.A00.size());
            }
            return false;
        }
    }

    public boolean A07() {
        Boolean bool = this.A04;
        if (bool == null) {
            AnonymousClass4XQ r0 = this.A02;
            bool = Boolean.valueOf(r0 == null || (r0.A06() && this.A02.A07()));
            this.A04 = bool;
        }
        return bool.booleanValue();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        if (this.A01 == null) {
            return A01();
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(A01());
        return AnonymousClass000.A0h(A00().toString(), A0o);
    }
}
