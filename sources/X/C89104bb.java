package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

/* renamed from: X.4bb  reason: invalid class name and case insensitive filesystem */
public class C89104bb {
    public AnonymousClass4XU A00;

    public C89104bb(String str) {
        String str2;
        AnonymousClass4XU r0 = new AnonymousClass4XU(str);
        this.A00 = r0;
        r0.A05();
        if (this.A00.A07('[')) {
            AnonymousClass4XU r02 = this.A00;
            if (r02.A02.charAt(r02.A00) == ']') {
                AnonymousClass4XU r2 = this.A00;
                r2.A01++;
                r2.A00--;
                r2.A05();
                if (this.A00.A07('?')) {
                    AnonymousClass4XU r1 = this.A00;
                    r1.A01++;
                    r1.A05();
                    if (this.A00.A07('(')) {
                        AnonymousClass4XU r03 = this.A00;
                        if (r03.A02.charAt(r03.A00) == ')') {
                            return;
                        }
                    }
                    str2 = "Filter must start with '[?(' and end with ')]'. ";
                } else {
                    str2 = "Filter must start with '[?' and end with ']'. ";
                }
                throw C70003fx.A00(AnonymousClass000.A0h(str, AnonymousClass000.A0r(str2)));
            }
        }
        str2 = "Filter must start with '[' and end with ']'. ";
        throw C70003fx.A00(AnonymousClass000.A0h(str, AnonymousClass000.A0r(str2)));
    }

    public static final boolean A00(char c2) {
        return c2 == '<' || c2 == '>' || c2 == '=' || c2 == '~' || c2 == '!';
    }

    public final C99364tu A01() {
        AnonymousClass4XU r7 = this.A00;
        r7.A04();
        int i2 = r7.A01;
        r7.A04();
        if (r7.A07('!')) {
            r7.A06('!');
            r7.A04();
            char charAt = r7.A02.charAt(r7.A01);
            if (charAt != '$' && charAt != '@') {
                return new C70073g4(A01(), C801542t.NOT);
            }
            r7.A01 = i2;
        }
        r7.A04();
        if (r7.A07('(')) {
            r7.A06('(');
            C99364tu A02 = A02();
            r7.A06(')');
            return A02;
        }
        C89494cI A03 = A03();
        try {
            r7.A04();
            int i3 = r7.A01;
            CharSequence charSequence = r7.A02;
            if (!A00(charSequence.charAt(i3))) {
                while (true) {
                    int i4 = r7.A01;
                    if (!r7.A09(i4) || charSequence.charAt(i4) == ' ') {
                        break;
                    }
                    r7.A01++;
                }
            } else {
                while (true) {
                    int i5 = r7.A01;
                    if (!r7.A09(i5) || !A00(charSequence.charAt(i5))) {
                        break;
                    }
                    r7.A01++;
                }
            }
            String charSequence2 = charSequence.subSequence(i3, r7.A01).toString();
            String upperCase = charSequence2.toUpperCase(Locale.ROOT);
            for (C801642u r1 : C801642u.values()) {
                if (r1.operatorString.equals(upperCase)) {
                    return new C70063g3(r1, A03, A03());
                }
            }
            StringBuilder A0r = AnonymousClass000.A0r("Filter operator ");
            A0r.append(charSequence2);
            throw C70003fx.A00(AnonymousClass000.A0h(" is not supported!", A0r));
        } catch (C70003fx unused) {
            r7.A01 = r7.A01;
            if (A03 instanceof C70123g9) {
                C70123g9 r5 = (C70123g9) A03;
                C70123g9 r2 = new C70123g9(r5.A00, true, r5.A02);
                return new C70063g3(C801642u.EXISTS, r2, r2.A02 ? AnonymousClass5TX.A01 : AnonymousClass5TX.A00);
            }
            throw C70003fx.A00("Expected path node");
        }
    }

    public final C99364tu A02() {
        AnonymousClass4XU r4;
        int i2;
        C801542t r2;
        int i3;
        C801542t r22;
        ArrayList A0u = AnonymousClass000.A0u();
        do {
            ArrayList A0u2 = AnonymousClass000.A0u();
            do {
                A0u2.add(A01());
                r4 = this.A00;
                i2 = r4.A01;
                r2 = C801542t.AND;
            } while (r4.A0A(r2.operatorString));
            r4.A01 = i2;
            A0u.add(1 == A0u2.size() ? A0u2.get(0) : new C70073g4(r2, (Collection) A0u2));
            i3 = r4.A01;
            r22 = C801542t.OR;
        } while (r4.A0A(r22.operatorString));
        r4.A01 = i3;
        return 1 == A0u.size() ? (C99364tu) A0u.get(0) : new C70073g4(r22, (Collection) A0u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x025d, code lost:
        if (r1 != false) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r2 != '{') goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C89494cI A03() {
        /*
            r14 = this;
            X.4XU r3 = r14.A00
            r3.A04()
            java.lang.CharSequence r4 = r3.A02
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            r5 = 64
            r2 = 36
            r8 = 33
            if (r0 == r8) goto L_0x01a9
            if (r0 == r2) goto L_0x01ce
            if (r0 == r5) goto L_0x01ce
            r3.A04()
            int r0 = r3.A01
            char r2 = r4.charAt(r0)
            r6 = 34
            if (r2 == r6) goto L_0x017d
            r6 = 39
            if (r2 == r6) goto L_0x017d
            r0 = 45
            if (r2 == r0) goto L_0x0046
            r0 = 47
            if (r2 == r0) goto L_0x0122
            r0 = 91
            if (r2 == r0) goto L_0x00fc
            r0 = 102(0x66, float:1.43E-43)
            if (r2 == r0) goto L_0x00b0
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x007c
            r0 = 116(0x74, float:1.63E-43)
            if (r2 == r0) goto L_0x00b0
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L_0x00fc
        L_0x0046:
            int r2 = r3.A01
            r1 = r2
        L_0x0049:
            boolean r0 = r3.A09(r1)
            if (r0 == 0) goto L_0x0070
            char r1 = r4.charAt(r1)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 != 0) goto L_0x0069
            r0 = 45
            if (r1 == r0) goto L_0x0069
            r0 = 46
            if (r1 == r0) goto L_0x0069
            r0 = 69
            if (r1 == r0) goto L_0x0069
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x0070
        L_0x0069:
            int r0 = r3.A01
            int r1 = r0 + 1
            r3.A01 = r1
            goto L_0x0049
        L_0x0070:
            int r0 = r3.A01
            java.lang.CharSequence r0 = r4.subSequence(r2, r0)
            X.3gE r2 = new X.3gE
            r2.<init>((java.lang.CharSequence) r0)
            return r2
        L_0x007c:
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            if (r0 != r1) goto L_0x00ac
            int r1 = r3.A01
            int r0 = r1 + 3
            boolean r0 = r3.A09(r0)
            if (r0 == 0) goto L_0x00ac
            int r0 = r1 + 4
            java.lang.CharSequence r2 = r4.subSequence(r1, r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ac
            int r1 = r2.length()
            int r0 = r3.A01
            int r0 = r0 + r1
            r3.A01 = r0
            X.3g5 r2 = X.AnonymousClass5TX.A02
            return r2
        L_0x00ac:
            java.lang.String r0 = "Expected <null> value"
            goto L_0x02b4
        L_0x00b0:
            int r6 = r3.A01
            char r5 = r4.charAt(r6)
            int r1 = r3.A01
            r0 = 116(0x74, float:1.63E-43)
            int r2 = r1 + 4
            if (r5 != r0) goto L_0x00c0
            int r2 = r1 + 3
        L_0x00c0:
            boolean r0 = r3.A09(r2)
            java.lang.String r1 = "Expected boolean literal"
            if (r0 == 0) goto L_0x00f7
            int r0 = r2 + 1
            java.lang.CharSequence r2 = r4.subSequence(r6, r0)
            java.lang.String r0 = "true"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = "false"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00f7
        L_0x00de:
            int r1 = r2.length()
            int r0 = r3.A01
            int r0 = r0 + r1
            r3.A01 = r0
            java.lang.String r0 = r2.toString()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L_0x00f4
            X.3g8 r2 = X.AnonymousClass5TX.A01
            return r2
        L_0x00f4:
            X.3g8 r2 = X.AnonymousClass5TX.A00
            return r2
        L_0x00f7:
            X.3fx r0 = X.C70003fx.A00(r1)
            throw r0
        L_0x00fc:
            int r6 = r3.A01
            char r5 = r4.charAt(r6)
            r0 = 91
            r2 = 125(0x7d, float:1.75E-43)
            if (r5 != r0) goto L_0x010a
            r2 = 93
        L_0x010a:
            int r1 = r3.A01
            r0 = 0
            int r1 = r3.A01(r5, r2, r1, r0)
            r0 = -1
            if (r1 == r0) goto L_0x02ae
            int r0 = r1 + 1
            r3.A01 = r0
            java.lang.CharSequence r0 = r4.subSequence(r6, r0)
            X.3gD r2 = new X.3gD
            r2.<init>((java.lang.CharSequence) r0)
            return r2
        L_0x0122:
            int r10 = r3.A01
            int r11 = r3.A03(r0, r10)
            r0 = -1
            if (r11 == r0) goto L_0x0179
            int r13 = r11 + 1
            boolean r0 = r3.A09(r13)
            if (r0 == 0) goto L_0x016b
            r12 = r13
            r0 = 1
            char[] r9 = new char[r0]
        L_0x0137:
            boolean r0 = r3.A09(r12)
            if (r0 == 0) goto L_0x0160
            r0 = 0
            char r8 = r4.charAt(r12)
            r9[r0] = r8
            r7 = 0
            X.42m[] r6 = X.C800842m.values()
            int r5 = r6.length
            r2 = 0
        L_0x014b:
            if (r2 >= r5) goto L_0x015e
            r1 = r6[r2]
            char r0 = r1.flag
            if (r0 != r8) goto L_0x015b
            int r0 = r1.code
        L_0x0155:
            r7 = r7 | r0
            if (r7 <= 0) goto L_0x0160
            int r12 = r12 + 1
            goto L_0x0137
        L_0x015b:
            int r2 = r2 + 1
            goto L_0x014b
        L_0x015e:
            r0 = 0
            goto L_0x0155
        L_0x0160:
            if (r12 <= r11) goto L_0x016b
            java.lang.CharSequence r0 = r4.subSequence(r13, r12)
            int r0 = r0.length()
            int r11 = r11 + r0
        L_0x016b:
            int r0 = r11 + 1
            r3.A01 = r0
            java.lang.CharSequence r0 = r4.subSequence(r10, r0)
            X.3gC r2 = new X.3gC
            r2.<init>((java.lang.CharSequence) r0)
            return r2
        L_0x0179:
            java.lang.String r0 = "Pattern not closed. Expected / in "
            goto L_0x02b0
        L_0x017d:
            int r5 = r3.A01
            int r2 = r3.A03(r6, r5)
            r0 = -1
            if (r2 == r0) goto L_0x0195
            r1 = 1
            int r0 = r2 + 1
            r3.A01 = r0
            java.lang.CharSequence r0 = r4.subSequence(r5, r0)
            X.3gA r2 = new X.3gA
            r2.<init>(r0, r1)
            return r2
        L_0x0195:
            java.lang.String r0 = "String literal does not have matching quotes. Expected "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r6)
            java.lang.String r0 = " in "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0f(r3, r1)
            goto L_0x02b4
        L_0x01a9:
            r1 = 1
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            r3.A04()
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            if (r0 == r2) goto L_0x01ce
            if (r0 == r5) goto L_0x01ce
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            java.lang.Character r0 = java.lang.Character.valueOf(r8)
            r2[r1] = r0
            java.lang.String r0 = "Unexpected character: %c"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            goto L_0x02b4
        L_0x01ce:
            int r2 = r3.A01
        L_0x01d0:
            int r2 = r2 + -1
            boolean r0 = r3.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x01e3
            char r1 = r4.charAt(r2)
            r0 = 32
            if (r1 != r0) goto L_0x01e3
            goto L_0x01d0
        L_0x01e3:
            boolean r0 = r3.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x02a7
            r0 = -1
            if (r2 == r0) goto L_0x02a7
            char r10 = r4.charAt(r2)
        L_0x01f2:
            int r9 = r3.A01
            r7 = 1
        L_0x01f5:
            int r0 = r3.A01
            int r1 = r0 + 1
            r3.A01 = r1
            boolean r0 = r3.A09(r1)
            r6 = 0
            if (r0 == 0) goto L_0x027e
            char r0 = r4.charAt(r1)
            r2 = 91
            if (r0 != r2) goto L_0x0219
            int r1 = r3.A01
            r0 = 93
            int r1 = r3.A01(r2, r0, r1, r6)
            r0 = -1
            if (r1 == r0) goto L_0x02ab
            int r0 = r1 + 1
            r3.A01 = r0
        L_0x0219:
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            r5 = 41
            if (r0 != r5) goto L_0x0253
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            if (r0 != r5) goto L_0x0253
            int r2 = r3.A01
        L_0x022d:
            int r2 = r2 + -1
            boolean r0 = r3.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0240
            char r1 = r4.charAt(r2)
            r0 = 32
            if (r1 != r0) goto L_0x0240
            goto L_0x022d
        L_0x0240:
            boolean r0 = r3.A09(r2)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0253
            r0 = -1
            if (r2 == r0) goto L_0x0253
            char r1 = r4.charAt(r2)
            r0 = 40
            if (r1 == r0) goto L_0x0293
        L_0x0253:
            r1 = 0
        L_0x0254:
            int r0 = r3.A01
            char r0 = r4.charAt(r0)
            if (r0 != r5) goto L_0x025f
            r2 = 1
            if (r1 == 0) goto L_0x0260
        L_0x025f:
            r2 = 0
        L_0x0260:
            int r1 = r3.A01
            boolean r0 = r3.A09(r1)
            if (r0 == 0) goto L_0x027e
            char r0 = r4.charAt(r1)
            boolean r0 = A00(r0)
            if (r0 != 0) goto L_0x027e
            int r0 = r3.A01
            char r1 = r4.charAt(r0)
            r0 = 32
            if (r1 == r0) goto L_0x027e
            if (r2 == 0) goto L_0x01f5
        L_0x027e:
            if (r10 != r8) goto L_0x0281
            r7 = 0
        L_0x0281:
            int r0 = r3.A01
            java.lang.String r1 = X.AnonymousClass3K4.A0Y(r4, r9, r0)
            X.5OQ[] r0 = new X.AnonymousClass5OQ[r6]
            X.4TN r0 = X.C89144bf.A00(r1, r0)
            X.3g9 r2 = new X.3g9
            r2.<init>(r0, r6, r7)
            return r2
        L_0x0293:
            int r2 = r2 + -1
            boolean r0 = r3.A09(r2)
            if (r0 == 0) goto L_0x0253
            if (r2 <= r9) goto L_0x0253
            char r1 = r4.charAt(r2)
            r0 = 46
            if (r1 != r0) goto L_0x0293
            r1 = 1
            goto L_0x0254
        L_0x02a7:
            r10 = 32
            goto L_0x01f2
        L_0x02ab:
            java.lang.String r0 = "Square brackets does not match in filter "
            goto L_0x02b0
        L_0x02ae:
            java.lang.String r0 = "String not closed. Expected ' in "
        L_0x02b0:
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r3)
        L_0x02b4:
            X.3fx r0 = X.C70003fx.A00(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89104bb.A03():X.4cI");
    }
}
