package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

/* renamed from: X.4cG  reason: invalid class name and case insensitive filesystem */
public final class C89484cG {
    public static final Map A0A = C25411Jr.A05(new C25401Jq(new C25401Jq("min", 2), "MIN"), new C25401Jq(new C25401Jq("max", 2), "MAX"), new C25401Jq(new C25401Jq("log", 2), "LOG"), new C25401Jq(new C25401Jq("pow", 2), "POW"), new C25401Jq(new C25401Jq("mod", 2), "MOD"));
    public ArrayList A00;
    public ArrayList A01;
    public final HashMap A02 = AnonymousClass000.A0x();
    public final HashMap A03 = AnonymousClass000.A0x();
    public final HashSet A04 = C13680ns.A0o();
    public final HashSet A05 = C13680ns.A0o();
    public final Vector A06 = new Vector();
    public final Vector A07 = new Vector();
    public final Vector A08 = new Vector();
    public final Vector A09 = new Vector();

    public static void A00(C87024Vb r0, String str, StringBuilder sb) {
        sb.append(r0.A00);
        sb.append(" in ");
        sb.append(str);
    }

    public final double A01(String str) {
        String str2;
        HashMap hashMap = this.A03;
        if (hashMap.containsKey(str)) {
            if (!this.A04.contains(str)) {
                ArrayList arrayList = this.A00;
                if (arrayList == null) {
                    str2 = "isComputedFeatureEvaluated";
                    throw C18450wi.A03(str2);
                }
                HashMap hashMap2 = this.A02;
                Object obj = arrayList.get(AnonymousClass000.A0D(C25411Jr.A00(hashMap2, str)));
                C18450wi.A0B(obj);
                if (!AnonymousClass000.A1X(obj)) {
                    A0D(AnonymousClass000.A0D(C25411Jr.A00(hashMap2, str)));
                }
            }
            ArrayList arrayList2 = this.A01;
            if (arrayList2 == null) {
                str2 = "outputValues";
                throw C18450wi.A03(str2);
            }
            Object obj2 = arrayList2.get(AnonymousClass000.A0D(C25411Jr.A00(hashMap, str)));
            C18450wi.A0B(obj2);
            return AnonymousClass3K3.A01(obj2);
        }
        StringBuilder A0r = AnonymousClass000.A0r("Symbol ");
        A0r.append(str);
        throw new C105585Ae(AnonymousClass000.A0h(" does not exist.", A0r));
    }

    public final int A02(AnonymousClass426 r3, int i2, int i3) {
        Vector vector = this.A07;
        vector.add(new C90684ed(r3, i2, i3));
        return vector.size() - 1;
    }

    public final int A03(C87024Vb r4, String str) {
        AnonymousClass426 r1;
        int A082 = A08(r4, str);
        while (true) {
            char A012 = r4.A01();
            if (A012 == '+') {
                r1 = AnonymousClass426.ADD;
            } else if (A012 != '-') {
                return A082;
            } else {
                r1 = AnonymousClass426.SUB;
            }
            r4.A03();
            A082 = A02(r1, A082, A08(r4, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        throw new X.C105585Ae(X.AnonymousClass000.A0h("'s expression", r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A04(X.C87024Vb r8, java.lang.String r9) {
        /*
            r7 = this;
            int r6 = r7.A09(r8, r9)
        L_0x0004:
            char r5 = r8.A01()
            java.lang.String r3 = "'s expression"
            java.lang.String r2 = " in "
            r4 = 61
            r1 = 1
            if (r5 != r4) goto L_0x002e
            int r0 = X.C87024Vb.A00(r8)
            if (r0 <= r1) goto L_0x0044
            char r0 = r8.A02(r1)
            if (r0 != r4) goto L_0x0044
            r8.A03()
            X.426 r1 = X.AnonymousClass426.EQ
        L_0x0022:
            r8.A03()
            int r0 = r7.A09(r8, r9)
            int r6 = r7.A02(r1, r6, r0)
            goto L_0x0004
        L_0x002e:
            r0 = 33
            if (r5 != r0) goto L_0x007a
            int r0 = X.C87024Vb.A00(r8)
            if (r0 <= r1) goto L_0x005f
            char r0 = r8.A02(r1)
            if (r0 != r4) goto L_0x005f
            r8.A03()
            X.426 r1 = X.AnonymousClass426.NE
            goto L_0x0022
        L_0x0044:
            java.lang.String r0 = "Invalid operator found at index "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r8.A00
            r1.append(r0)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r1)
            X.5Ae r0 = new X.5Ae
            r0.<init>(r1)
            throw r0
        L_0x005f:
            java.lang.String r0 = "Unexpected '!' found at index "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = r8.A00
            r1.append(r0)
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r1)
            X.5Ae r0 = new X.5Ae
            r0.<init>(r1)
            throw r0
        L_0x007a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89484cG.A04(X.4Vb, java.lang.String):int");
    }

    public final int A05(C87024Vb r9, String str) {
        int length;
        char A012 = r9.A01();
        if (A012 == '(') {
            r9.A03();
            int A072 = A07(r9, str);
            if (r9.A01() == ')') {
                r9.A03();
                return A072;
            }
            StringBuilder A0r = AnonymousClass000.A0r("Unexpected character found at index ");
            A00(r9, str, A0r);
            throw new C105585Ae(AnonymousClass000.A0h("'s expression. Expected ')'.", A0r));
        } else if ('a' > A012 ? 'A' > A012 || (A012 >= '[' && A012 != '_') : A012 >= '{') {
            char A022 = r9.A02(0);
            if ('0' > A022 || A022 >= ':') {
                StringBuilder A0r2 = AnonymousClass000.A0r("Unexpected character '");
                A0r2.append(A012);
                A0r2.append("' found at index ");
                A00(r9, str, A0r2);
                throw new C105585Ae(AnonymousClass000.A0h("'s expression", A0r2));
            }
            String str2 = r9.A01;
            String substring = str2.substring(r9.A00);
            C18450wi.A0B(substring);
            while (true) {
                length = str2.length();
                if (!AnonymousClass000.A1Q(length - r9.A00)) {
                    break;
                }
                char A023 = r9.A02(0);
                if ('0' > A023) {
                    if (A023 != '.') {
                        break;
                    }
                } else if (A023 >= ':') {
                    break;
                }
                r9.A03();
            }
            String substring2 = substring.substring(0, substring.length() - (length - r9.A00));
            C18450wi.A0B(substring2);
            try {
                double parseDouble = Double.parseDouble(substring2);
                Vector vector = this.A07;
                vector.add(new C90684ed(parseDouble));
                return vector.size() - 1;
            } catch (NumberFormatException unused) {
                StringBuilder A0r3 = AnonymousClass000.A0r("Failed to convert '");
                A0r3.append(substring2);
                A0r3.append("' to double in ");
                A0r3.append(str);
                throw new C105585Ae(AnonymousClass000.A0h("'s expression", A0r3));
            }
        } else {
            String str3 = r9.A01;
            String substring3 = str3.substring(r9.A00);
            C18450wi.A0B(substring3);
            while (AnonymousClass000.A1Q(str3.length() - r9.A00)) {
                char A024 = r9.A02(0);
                char c2 = '{';
                if ('a' > A024) {
                    if ('A' > A024) {
                        if ('0' > A024) {
                            break;
                        }
                        c2 = ':';
                    } else {
                        if (A024 >= '[' && A024 != '_') {
                            break;
                        }
                        r9.A03();
                    }
                }
                if (A024 >= c2) {
                    break;
                }
                r9.A03();
            }
            int length2 = substring3.length();
            String substring4 = str3.substring(r9.A00);
            C18450wi.A0B(substring4);
            String substring5 = substring3.substring(0, length2 - substring4.length());
            C18450wi.A0B(substring5);
            if (r9.A01() == '(') {
                r9.A03();
                ArrayList A0u = AnonymousClass000.A0u();
                while (r9.A01() != ')') {
                    C13690nt.A1O(A0u, A07(r9, str));
                    if (r9.A01() == ',') {
                        r9.A03();
                        if (r9.A01() == ')') {
                            StringBuilder A0r4 = AnonymousClass000.A0r("Function argument list ends in comma at index ");
                            A00(r9, str, A0r4);
                            throw new C105585Ae(AnonymousClass000.A0h("'s expression", A0r4));
                        }
                    }
                }
                r9.A03();
                String lowerCase = substring5.toLowerCase(Locale.ROOT);
                C18450wi.A0B(lowerCase);
                C25401Jq r4 = new C25401Jq(lowerCase, Integer.valueOf(A0u.size()));
                Map map = A0A;
                if (map.containsKey(r4)) {
                    AnonymousClass426 valueOf = AnonymousClass426.valueOf((String) C25411Jr.A00(map, r4));
                    int size = A0u.size();
                    if (size == 1) {
                        int A0D = AnonymousClass000.A0D(A0u.get(0));
                        Vector vector2 = this.A07;
                        vector2.add(new C90684ed(valueOf, A0D));
                        return vector2.size() - 1;
                    } else if (size == 2) {
                        return A02(valueOf, AnonymousClass000.A0D(A0u.get(0)), AnonymousClass000.A0D(A0u.get(1)));
                    } else {
                        StringBuilder A0q = AnonymousClass000.A0q(str);
                        C13680ns.A1Y("'s expression contains function call to '", substring5, "' with ", A0q);
                        A0q.append(A0u.size());
                        throw new C105585Ae(AnonymousClass000.A0h(" arguments which has been found in the lookup table but the number of arguments is unexpected.", A0q));
                    }
                } else {
                    StringBuilder A0q2 = AnonymousClass000.A0q(str);
                    C13680ns.A1Y("'s expression contains an unexpected function call to '", substring5, "' with ", A0q2);
                    A0q2.append(A0u.size());
                    throw new C105585Ae(AnonymousClass000.A0h(" arguments", A0q2));
                }
            } else if (!C18450wi.A0R(str, substring5)) {
                HashMap hashMap = this.A03;
                if (hashMap.containsKey(substring5)) {
                    if (this.A04.contains(substring5)) {
                        this.A05.add(substring5);
                    } else {
                        HashMap hashMap2 = this.A02;
                        ((Vector) this.A08.get(AnonymousClass000.A0D(C25411Jr.A00(hashMap2, str)))).addElement(Integer.valueOf(AnonymousClass000.A0D(C25411Jr.A00(hashMap2, substring5))));
                    }
                    return AnonymousClass000.A0D(C25411Jr.A00(hashMap, substring5));
                }
                StringBuilder A0r5 = AnonymousClass000.A0r("Unexpected symbol ");
                A0r5.append(substring5);
                A0r5.append(" found in ");
                A0r5.append(str);
                throw new C105585Ae(AnonymousClass000.A0h("'s expression", A0r5));
            } else {
                throw C105585Ae.A00("'s expression contains itself", str);
            }
        }
    }

    public final int A06(C87024Vb r5, String str) {
        int A042 = A04(r5, str);
        while (r5.A01() == '&') {
            if (C87024Vb.A00(r5) <= 1 || r5.A02(1) != '&') {
                StringBuilder A0r = AnonymousClass000.A0r("Invalid operator found at index ");
                A00(r5, str, A0r);
                throw new C105585Ae(AnonymousClass000.A0h("'s expression", A0r));
            }
            r5.A03();
            AnonymousClass426 r1 = AnonymousClass426.AND;
            r5.A03();
            A042 = A02(r1, A042, A04(r5, str));
        }
        return A042;
    }

    public final int A07(C87024Vb r5, String str) {
        int A062 = A06(r5, str);
        while (r5.A01() == '|') {
            if (C87024Vb.A00(r5) <= 1 || r5.A02(1) != '|') {
                StringBuilder A0r = AnonymousClass000.A0r("Invalid operator found at index ");
                A00(r5, str, A0r);
                throw new C105585Ae(AnonymousClass000.A0h("'s expression", A0r));
            }
            r5.A03();
            AnonymousClass426 r1 = AnonymousClass426.OR;
            r5.A03();
            A062 = A02(r1, A062, A06(r5, str));
        }
        return A062;
    }

    public final int A08(C87024Vb r4, String str) {
        AnonymousClass426 r1;
        int A0A2 = A0A(r4, str);
        while (true) {
            char A012 = r4.A01();
            if (A012 == '*') {
                r1 = AnonymousClass426.MUL;
            } else if (A012 != '/') {
                return A0A2;
            } else {
                r1 = AnonymousClass426.DIV;
            }
            r4.A03();
            A0A2 = A02(r1, A0A2, A0A(r4, str));
        }
    }

    public final int A09(C87024Vb r6, String str) {
        AnonymousClass426 r1;
        int A032 = A03(r6, str);
        while (true) {
            char A012 = r6.A01();
            if (A012 == '>') {
                if (C87024Vb.A00(r6) <= 1 || r6.A02(1) != '=') {
                    r1 = AnonymousClass426.GT;
                } else {
                    r6.A03();
                    r1 = AnonymousClass426.GE;
                }
            } else if (A012 != '<') {
                return A032;
            } else {
                if (C87024Vb.A00(r6) <= 1 || r6.A02(1) != '=') {
                    r1 = AnonymousClass426.LT;
                } else {
                    r6.A03();
                    r1 = AnonymousClass426.LE;
                }
            }
            r6.A03();
            A032 = A02(r1, A032, A03(r6, str));
        }
    }

    public final int A0A(C87024Vb r5, String str) {
        if (r5.A01() != '!') {
            return A05(r5, str);
        }
        r5.A03();
        int A052 = A05(r5, str);
        AnonymousClass426 r2 = AnonymousClass426.NOT;
        Vector vector = this.A07;
        vector.add(new C90684ed(r2, A052));
        return vector.size() - 1;
    }

    public final int A0B(String str, boolean z2) {
        HashMap hashMap = this.A03;
        if (!hashMap.containsKey(str)) {
            Vector vector = this.A07;
            vector.add(new C90684ed());
            int size = vector.size() - 1;
            C13680ns.A1X(str, hashMap, size);
            if (z2) {
                this.A04.add(str);
            }
            return size;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Multiple declarations of symbol ");
        A0r.append(str);
        throw new C105585Ae(AnonymousClass000.A0h(" found in the configuration file.", A0r));
    }

    public final C90684ed A0C(int i2) {
        if (i2 >= 0) {
            Vector vector = this.A07;
            if (i2 < vector.size()) {
                Object obj = vector.get(i2);
                C18450wi.A0B(obj);
                return (C90684ed) obj;
            }
        }
        StringBuilder A0r = AnonymousClass000.A0r("getNodeByIndex was called with unexpected index=");
        A0r.append(i2);
        A0r.append(", size of allNodes is ");
        throw new C105585Ae(AnonymousClass000.A0l(A0r, this.A07.size()));
    }

    public final void A0D(int i2) {
        Iterator it = ((AbstractCollection) this.A08.get(i2)).iterator();
        while (true) {
            if (it.hasNext()) {
                Number number = (Number) it.next();
                ArrayList arrayList = this.A00;
                if (arrayList == null) {
                    break;
                }
                C18450wi.A09(number);
                int intValue = number.intValue();
                if (!AnonymousClass000.A1X(arrayList.get(intValue))) {
                    A0D(intValue);
                }
            } else {
                C25401Jq r1 = (C25401Jq) this.A06.get(i2);
                int A0D = AnonymousClass000.A0D(r1.first);
                int A0D2 = AnonymousClass000.A0D(r1.second);
                ArrayList arrayList2 = this.A01;
                if (arrayList2 != null) {
                    C90684ed A0C = A0C(A0D2);
                    ArrayList arrayList3 = this.A01;
                    if (arrayList3 != null) {
                        arrayList2.set(A0D, Double.valueOf(A0C.A02(this, arrayList3, A0D2)));
                        ArrayList arrayList4 = this.A00;
                        if (arrayList4 != null) {
                            arrayList4.set(i2, Boolean.TRUE);
                            ArrayList arrayList5 = this.A01;
                            if (arrayList5 != null) {
                                Object obj = arrayList5.get(A0D);
                                C18450wi.A0B(obj);
                                ((Number) obj).doubleValue();
                                return;
                            }
                        }
                    }
                }
                throw C18450wi.A03("outputValues");
            }
        }
        throw C18450wi.A03("isComputedFeatureEvaluated");
    }
}
