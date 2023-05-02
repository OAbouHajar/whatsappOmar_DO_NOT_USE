package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.4db  reason: invalid class name and case insensitive filesystem */
public abstract class C90164db {
    public static final void A03(AnonymousClass3Y5 r2, Object obj, StringBuilder sb) {
        String obj2;
        int i2 = r2.A02;
        if (i2 == 11) {
            Class cls = r2.A06;
            C13710nw.A01(cls);
            obj2 = cls.cast(obj).toString();
        } else if (i2 == 7) {
            obj2 = "\"";
            sb.append(obj2);
            sb.append(C87834Yv.A00((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(obj2);
    }

    public Object A04(AnonymousClass3Y5 r6) {
        int i2;
        if (this instanceof C66193Yk) {
            C66193Yk r1 = (C66193Yk) this;
            i2 = r6.A04;
            if (i2 == 1) {
                return Integer.valueOf(r1.A05);
            }
            if (i2 == 2) {
                return r1.A03;
            }
            if (i2 == 3) {
                return Integer.valueOf(r1.A00);
            }
            if (i2 == 4) {
                return r1.A04;
            }
        } else if (this instanceof AnonymousClass3Yj) {
            AnonymousClass3Yj r12 = (AnonymousClass3Yj) this;
            i2 = r6.A04;
            if (i2 == 1) {
                return Integer.valueOf(r12.A04);
            }
            if (i2 == 2) {
                return r12.A00;
            }
            if (i2 == 3) {
                return r12.A02;
            }
            if (i2 == 4) {
                return r12.A01;
            }
        } else if (this instanceof C66183Yi) {
            C66183Yi r0 = (C66183Yi) this;
            i2 = r6.A04;
            switch (i2) {
                case 1:
                    return Integer.valueOf(r0.A05);
                case 2:
                    return r0.A00;
                case 3:
                    return r0.A01;
                case 4:
                    return r0.A02;
                case 5:
                    return r0.A03;
                case 6:
                    return r0.A04;
            }
        } else if (this instanceof AnonymousClass3Yh) {
            AnonymousClass3Yh r13 = (AnonymousClass3Yh) this;
            i2 = r6.A04;
            if (i2 == 1) {
                return Integer.valueOf(r13.A03);
            }
            if (i2 == 2) {
                return r13.A02;
            }
            if (i2 == 4) {
                return r13.A01;
            }
        } else {
            String str = r6.A07;
            boolean z2 = ((AnonymousClass3YQ) this) instanceof AnonymousClass3YP;
            if (r6.A06 != null) {
                if (z2) {
                    throw new UnsupportedOperationException("Converting to JSON does not require this method.");
                }
                try {
                    char upperCase = Character.toUpperCase(str.charAt(0));
                    String substring = str.substring(1);
                    StringBuilder A0g = C13690nt.A0g(C13680ns.A06(substring) + 4);
                    A0g.append("get");
                    A0g.append(upperCase);
                    A0g.append(substring);
                    return getClass().getMethod(A0g.toString(), new Class[0]).invoke(this, new Object[0]);
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            } else if (!z2) {
                return null;
            } else {
                throw new UnsupportedOperationException("Converting to JSON does not require this method.");
            }
        }
        throw AnonymousClass000.A0V(C13680ns.A0i("Unknown SafeParcelable id=", C13690nt.A0g(37), i2));
    }

    public Map A05() {
        if (!(this instanceof AnonymousClass3YP)) {
            return this instanceof C66193Yk ? C66193Yk.A07 : this instanceof AnonymousClass3Yj ? AnonymousClass3Yj.A06 : this instanceof C66183Yi ? C66183Yi.A06 : AnonymousClass3Yh.A05;
        }
        AnonymousClass3YP r1 = (AnonymousClass3YP) this;
        C65983Xi r0 = r1.A02;
        if (r0 == null) {
            return null;
        }
        String str = r1.A03;
        C13710nw.A01(str);
        return (Map) r0.A02.get(str);
    }

    public boolean A06(AnonymousClass3Y5 r3) {
        Set set;
        if (this instanceof C66193Yk) {
            set = ((C66193Yk) this).A06;
        } else if (this instanceof AnonymousClass3Yj) {
            set = ((AnonymousClass3Yj) this).A05;
        } else if (this instanceof C66183Yi) {
            return true;
        } else {
            if (this instanceof AnonymousClass3Yh) {
                set = ((AnonymousClass3Yh) this).A04;
            } else if (r3.A03 == 11) {
                if (r3.A0A) {
                    throw new UnsupportedOperationException("Concrete type arrays not supported");
                }
                throw new UnsupportedOperationException("Concrete types not supported");
            } else if (!(((AnonymousClass3YQ) this) instanceof AnonymousClass3YP)) {
                return false;
            } else {
                throw new UnsupportedOperationException("Converting to JSON does not require this method.");
            }
        }
        return C13690nt.A1V(set, r3.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r2.A02.containsKey(r6) != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        if (r6 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        r3.append(r0);
        r3.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        r0 = android.util.Base64.encodeToString(r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            java.util.Map r5 = r10.A05()
            r0 = 100
            java.lang.StringBuilder r3 = X.C13690nt.A0g(r0)
            java.util.Iterator r9 = X.C13700nu.A0I(r5)
        L_0x000e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.String r8 = X.AnonymousClass000.A0m(r9)
            java.lang.Object r7 = r5.get(r8)
            X.3Y5 r7 = (X.AnonymousClass3Y5) r7
            boolean r0 = r10.A06(r7)
            if (r0 == 0) goto L_0x000e
            java.lang.Object r6 = r10.A04(r7)
            X.5Ln r2 = r7.A00
            if (r2 == 0) goto L_0x0046
            X.3YI r2 = (X.AnonymousClass3YI) r2
            java.lang.Number r6 = (java.lang.Number) r6
            android.util.SparseArray r1 = r2.A01
            int r0 = r6.intValue()
            java.lang.Object r1 = r1.get(r0)
            if (r1 != 0) goto L_0x00c1
            java.util.HashMap r0 = r2.A02
            java.lang.String r6 = "gms_unknown"
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x00c1
        L_0x0046:
            int r0 = r3.length()
            java.lang.String r4 = ","
            if (r0 != 0) goto L_0x00bd
            java.lang.String r0 = "{"
            r3.append(r0)
        L_0x0053:
            java.lang.String r1 = "\""
            r3.append(r1)
            r3.append(r8)
            java.lang.String r0 = "\":"
            r3.append(r0)
            if (r6 != 0) goto L_0x0068
            java.lang.String r0 = "null"
        L_0x0064:
            r3.append(r0)
            goto L_0x000e
        L_0x0068:
            int r0 = r7.A03
            switch(r0) {
                case 8: goto L_0x00a7;
                case 9: goto L_0x009f;
                case 10: goto L_0x0098;
                default: goto L_0x006d;
            }
        L_0x006d:
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0093
            java.util.AbstractList r6 = (java.util.AbstractList) r6
            java.lang.String r0 = "["
            r3.append(r0)
            int r2 = r6.size()
            r1 = 0
        L_0x007d:
            if (r1 >= r2) goto L_0x0090
            if (r1 <= 0) goto L_0x0084
            r3.append(r4)
        L_0x0084:
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x008d
            A03(r7, r0, r3)
        L_0x008d:
            int r1 = r1 + 1
            goto L_0x007d
        L_0x0090:
            java.lang.String r0 = "]"
            goto L_0x0064
        L_0x0093:
            A03(r7, r6, r3)
            goto L_0x000e
        L_0x0098:
            java.util.HashMap r6 = (java.util.HashMap) r6
            X.AnonymousClass45D.A00(r3, r6)
            goto L_0x000e
        L_0x009f:
            r3.append(r1)
            byte[] r6 = (byte[]) r6
            r0 = 10
            goto L_0x00ad
        L_0x00a7:
            r3.append(r1)
            byte[] r6 = (byte[]) r6
            r0 = 0
        L_0x00ad:
            if (r6 != 0) goto L_0x00b8
            r0 = 0
        L_0x00b0:
            r3.append(r0)
            r3.append(r1)
            goto L_0x000e
        L_0x00b8:
            java.lang.String r0 = android.util.Base64.encodeToString(r6, r0)
            goto L_0x00b0
        L_0x00bd:
            r3.append(r4)
            goto L_0x0053
        L_0x00c1:
            r6 = r1
            goto L_0x0046
        L_0x00c3:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x00d0
            java.lang.String r0 = "}"
        L_0x00cb:
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r3)
            return r0
        L_0x00d0:
            java.lang.String r0 = "{}"
            goto L_0x00cb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90164db.toString():java.lang.String");
    }
}
