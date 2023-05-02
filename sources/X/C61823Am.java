package X;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3Am  reason: invalid class name and case insensitive filesystem */
public class C61823Am {
    public static final AnonymousClass54V A0M;
    public static final Pattern A0N = Pattern.compile("\\[([^\\[\\]])*\\]");
    public static final Pattern A0O = Pattern.compile(" ");
    public static final Pattern A0P = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");
    public static final Pattern A0Q = Pattern.compile("[- ]");
    public static final Pattern A0R = Pattern.compile("\\d(?=[^,}][^,}])");
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public AnonymousClass54V A03;
    public AnonymousClass54V A04;
    public AnonymousClass4Q0 A05 = new AnonymousClass4Q0(64);
    public String A06 = "";
    public String A07 = "";
    public String A08;
    public String A09 = "";
    public StringBuilder A0A = AnonymousClass000.A0o();
    public StringBuilder A0B = AnonymousClass000.A0o();
    public StringBuilder A0C = AnonymousClass000.A0o();
    public StringBuilder A0D = AnonymousClass000.A0o();
    public StringBuilder A0E = AnonymousClass000.A0o();
    public List A0F = AnonymousClass000.A0u();
    public boolean A0G = true;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = false;
    public boolean A0K = false;
    public final C26071Mf A0L = C26071Mf.A00();

    static {
        AnonymousClass54V r2 = new AnonymousClass54V();
        r2.hasInternationalPrefix = true;
        r2.internationalPrefix_ = "NA";
        A0M = r2;
    }

    public C61823Am(String str) {
        this.A08 = str;
        AnonymousClass54V A002 = A00(str);
        this.A03 = A002;
        this.A04 = A002;
    }

    public final AnonymousClass54V A00(String str) {
        int i2;
        C26071Mf r4 = this.A0L;
        if (str == null || !r4.A07.contains(str)) {
            Logger logger = C26071Mf.A0B;
            Level level = Level.WARNING;
            StringBuilder A0r = AnonymousClass000.A0r("Invalid or missing region code (");
            if (str == null) {
                str = "null";
            }
            A0r.append(str);
            logger.log(level, AnonymousClass000.A0h(") provided.", A0r));
            i2 = 0;
        } else {
            AnonymousClass54V A0D2 = r4.A0D(str);
            if (A0D2 != null) {
                i2 = A0D2.countryCode_;
            } else {
                throw AnonymousClass000.A0T(C13680ns.A0h("Invalid region code: ", str));
            }
        }
        AnonymousClass54V A0D3 = r4.A0D(r4.A0F(i2));
        return A0D3 == null ? A0M : A0D3;
    }

    public final String A01() {
        AnonymousClass54V r1;
        List<AnonymousClass54U> list;
        StringBuilder sb = this.A0D;
        if (sb.length() < 3) {
            return A06(sb.toString());
        }
        String substring = sb.substring(0, 3);
        if (!this.A0I || this.A03.intlNumberFormat_.size() <= 0) {
            r1 = this.A03;
            list = r1.numberFormat_;
        } else {
            r1 = this.A03;
            list = r1.intlNumberFormat_;
        }
        boolean z2 = r1.hasNationalPrefix;
        for (AnonymousClass54U r2 : list) {
            if (z2 && !this.A0I && !r2.nationalPrefixOptionalWhenFormatting_) {
                if (!C26071Mf.A0G.matcher(r2.nationalPrefixFormattingRule_).matches()) {
                }
            }
            if (A0P.matcher(r2.format_).matches()) {
                this.A0F.add(r2);
            }
        }
        A08(substring);
        return A0B() ? A02() : this.A0A.toString();
    }

    public final String A02() {
        StringBuilder sb;
        String A042;
        StringBuilder sb2 = this.A0D;
        int length = sb2.length();
        if (length > 0) {
            int i2 = 0;
            do {
                A042 = A04(sb2.charAt(i2));
                i2++;
            } while (i2 < length);
            if (this.A0G) {
                return A06(A042);
            }
            sb = this.A0A;
        } else {
            sb = this.A0E;
        }
        return sb.toString();
    }

    public final String A03() {
        boolean z2 = false;
        if (this.A03.countryCode_ == 1) {
            StringBuilder sb = this.A0D;
            if (!(sb.charAt(0) != '1' || sb.charAt(1) == '0' || sb.charAt(1) == '1')) {
                z2 = true;
            }
        }
        int i2 = 1;
        if (z2) {
            StringBuilder sb2 = this.A0E;
            sb2.append('1');
            sb2.append(' ');
            this.A0I = true;
        } else {
            AnonymousClass54V r2 = this.A03;
            if (r2.hasNationalPrefixForParsing) {
                Pattern A002 = this.A05.A00(r2.nationalPrefixForParsing_);
                StringBuilder sb3 = this.A0D;
                Matcher matcher = A002.matcher(sb3);
                if (matcher.lookingAt()) {
                    this.A0I = true;
                    i2 = matcher.end();
                    this.A0E.append(sb3.substring(0, i2));
                }
            }
            i2 = 0;
        }
        StringBuilder sb4 = this.A0D;
        String substring = sb4.substring(0, i2);
        sb4.delete(0, i2);
        return substring;
    }

    public final String A04(char c2) {
        Pattern pattern = A0O;
        StringBuilder sb = this.A0C;
        Matcher matcher = pattern.matcher(sb);
        if (matcher.find(this.A00)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c2));
            sb.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.A00 = start;
            return sb.substring(0, start + 1);
        }
        if (this.A0F.size() == 1) {
            this.A0G = false;
        }
        this.A06 = "";
        return this.A0A.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (A09() != false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A05(char r8, boolean r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r2 = r7.A0A
            r2.append(r8)
            if (r9 == 0) goto L_0x000d
            int r0 = r2.length()
            r7.A01 = r0
        L_0x000d:
            boolean r0 = java.lang.Character.isDigit(r8)
            r5 = 1
            if (r0 != 0) goto L_0x002a
            int r0 = r2.length()
            if (r0 != r5) goto L_0x00a7
            java.util.regex.Pattern r1 = X.C26071Mf.A0K
            java.lang.String r0 = java.lang.Character.toString(r8)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x00a7
        L_0x002a:
            r3 = 0
            r4 = 1
            if (r5 != 0) goto L_0x0082
            r7.A0G = r3
            r7.A0H = r4
        L_0x0032:
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x00a9
            boolean r0 = r7.A0H
            if (r0 != 0) goto L_0x0160
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x0054
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x0160
        L_0x0046:
            r7.A0G = r4
            r7.A0J = r3
            java.util.List r0 = r7.A0F
            r0.clear()
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0054:
            java.lang.String r1 = r7.A09
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x006c
            java.lang.StringBuilder r0 = r7.A0D
            r0.insert(r3, r1)
            java.lang.StringBuilder r1 = r7.A0E
            java.lang.String r0 = r7.A09
            int r0 = r1.lastIndexOf(r0)
            r1.setLength(r0)
        L_0x006c:
            java.lang.String r1 = r7.A09
            java.lang.String r0 = r7.A03()
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0160
            java.lang.StringBuilder r1 = r7.A0E
            r0 = 32
            r1.append(r0)
            goto L_0x0046
        L_0x0082:
            r0 = 43
            if (r8 != r0) goto L_0x0095
            java.lang.StringBuilder r1 = r7.A0B
            r0 = r1
        L_0x0089:
            r1.append(r8)
            if (r9 == 0) goto L_0x0032
            int r0 = r0.length()
            r7.A02 = r0
            goto L_0x0032
        L_0x0095:
            r1 = 10
            int r0 = java.lang.Character.digit(r8, r1)
            char r8 = java.lang.Character.forDigit(r0, r1)
            java.lang.StringBuilder r0 = r7.A0B
            r0.append(r8)
            java.lang.StringBuilder r1 = r7.A0D
            goto L_0x0089
        L_0x00a7:
            r5 = 0
            goto L_0x002a
        L_0x00a9:
            java.lang.StringBuilder r0 = r7.A0B
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0160
            if (r1 == r4) goto L_0x0160
            r0 = 2
            if (r1 == r0) goto L_0x0160
            r0 = 3
            if (r1 != r0) goto L_0x00c1
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x0155
            r7.A0J = r4
        L_0x00c1:
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x00e1
            boolean r0 = r7.A09()
            if (r0 == 0) goto L_0x00cd
            r7.A0J = r3
        L_0x00cd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.StringBuilder r0 = r7.A0E
            r1.append(r0)
            java.lang.StringBuilder r0 = r7.A0D
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            return r0
        L_0x00e1:
            java.util.List r1 = r7.A0F
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0150
            java.lang.String r3 = r7.A04(r8)
            java.util.Iterator r6 = r1.iterator()
        L_0x00f1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0130
            java.lang.Object r5 = r6.next()
            X.54U r5 = (X.AnonymousClass54U) r5
            X.4Q0 r1 = r7.A05
            java.lang.String r0 = r5.pattern_
            java.util.regex.Pattern r1 = r1.A00(r0)
            java.lang.StringBuilder r0 = r7.A0D
            java.util.regex.Matcher r4 = r1.matcher(r0)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L_0x00f1
            java.util.regex.Pattern r1 = A0Q
            java.lang.String r0 = r5.nationalPrefixFormattingRule_
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.find()
            r7.A0K = r0
            java.lang.String r0 = r5.format_
            java.lang.String r0 = r4.replaceAll(r0)
            java.lang.String r1 = r7.A06(r0)
        L_0x0129:
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0133
            return r1
        L_0x0130:
            java.lang.String r1 = ""
            goto L_0x0129
        L_0x0133:
            java.lang.StringBuilder r0 = r7.A0D
            java.lang.String r0 = r0.toString()
            r7.A08(r0)
            boolean r0 = r7.A0B()
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r7.A02()
            return r0
        L_0x0147:
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x0160
            java.lang.String r0 = r7.A06(r3)
            return r0
        L_0x0150:
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0155:
            java.lang.String r0 = r7.A03()
            r7.A09 = r0
            java.lang.String r0 = r7.A01()
            return r0
        L_0x0160:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61823Am.A05(char, boolean):java.lang.String");
    }

    public final String A06(String str) {
        StringBuilder A0o;
        StringBuilder sb = this.A0E;
        int length = sb.length();
        if (!this.A0K || length <= 0 || sb.charAt(length - 1) == ' ') {
            A0o = AnonymousClass000.A0o();
            A0o.append(sb);
        } else {
            A0o = AnonymousClass000.A0o();
            A0o.append(new String(sb));
            A0o.append(' ');
        }
        return AnonymousClass000.A0h(str, A0o);
    }

    public void A07() {
        this.A07 = "";
        this.A0A.setLength(0);
        this.A0B.setLength(0);
        this.A0C.setLength(0);
        this.A00 = 0;
        this.A06 = "";
        this.A0E.setLength(0);
        this.A09 = "";
        this.A0D.setLength(0);
        this.A0G = true;
        this.A0H = false;
        this.A02 = 0;
        this.A01 = 0;
        this.A0I = false;
        this.A0J = false;
        this.A0F.clear();
        this.A0K = false;
        if (!this.A03.equals(this.A04)) {
            this.A03 = A00(this.A08);
        }
    }

    public final void A08(String str) {
        int length = str.length() - 3;
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            AnonymousClass54U r2 = (AnonymousClass54U) it.next();
            if (r2.leadingDigitsPattern_.size() > length && !this.A05.A00(AnonymousClass000.A0n(r2.leadingDigitsPattern_, length)).matcher(str).lookingAt()) {
                it.remove();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = X.AnonymousClass000.A0o();
        r3 = r5.A0L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09() {
        /*
            r5 = this;
            java.lang.StringBuilder r4 = r5.A0D
            int r0 = r4.length()
            r1 = 0
            if (r0 == 0) goto L_0x004a
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0o()
            X.1Mf r3 = r5.A0L
            int r2 = r3.A07(r4, r0)
            if (r2 == 0) goto L_0x004a
            r4.setLength(r1)
            r4.append(r0)
            java.lang.String r1 = r3.A0F(r2)
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003d
            X.54V r0 = r3.A0C(r2)
        L_0x002b:
            r5.A03 = r0
        L_0x002d:
            java.lang.String r0 = java.lang.Integer.toString(r2)
            java.lang.StringBuilder r1 = r5.A0E
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r0 = 1
            return r0
        L_0x003d:
            java.lang.String r0 = r5.A08
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002d
            X.54V r0 = r5.A00(r1)
            goto L_0x002b
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61823Am.A09():boolean");
    }

    public final boolean A0A() {
        Pattern A002 = this.A05.A00(AnonymousClass000.A0h(this.A03.internationalPrefix_, AnonymousClass000.A0r("\\+|")));
        StringBuilder sb = this.A0B;
        Matcher matcher = A002.matcher(sb);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.A0I = true;
        int end = matcher.end();
        StringBuilder sb2 = this.A0D;
        sb2.setLength(0);
        sb2.append(sb.substring(end));
        StringBuilder sb3 = this.A0E;
        sb3.setLength(0);
        sb3.append(sb.substring(0, end));
        if (sb.charAt(0) != '+') {
            sb3.append(' ');
        }
        return true;
    }

    public final boolean A0B() {
        Iterator it = this.A0F.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.A0G = false;
                break;
            }
            AnonymousClass54U r5 = (AnonymousClass54U) it.next();
            String str = r5.pattern_;
            if (this.A06.equals(str)) {
                break;
            }
            if (str.indexOf(124) == -1) {
                String replaceAll = A0R.matcher(A0N.matcher(str).replaceAll("\\\\d")).replaceAll("\\\\d");
                StringBuilder sb = this.A0C;
                sb.setLength(0);
                String str2 = r5.format_;
                Matcher matcher = this.A05.A00(replaceAll).matcher("999999999999999");
                matcher.find();
                String group = matcher.group();
                String replaceAll2 = group.length() < this.A0D.length() ? "" : group.replaceAll(replaceAll, str2).replaceAll("9", " ");
                if (replaceAll2.length() > 0) {
                    sb.append(replaceAll2);
                    this.A06 = str;
                    this.A0K = A0Q.matcher(r5.nationalPrefixFormattingRule_).find();
                    this.A00 = 0;
                    return true;
                }
            }
            it.remove();
        }
        return false;
    }
}
