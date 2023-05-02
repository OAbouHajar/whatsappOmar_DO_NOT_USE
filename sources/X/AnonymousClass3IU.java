package X;

import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3IU  reason: invalid class name */
public final class AnonymousClass3IU implements Iterator {
    public static final Pattern A08;
    public static final Pattern A09;
    public static final Pattern A0A;
    public static final Pattern A0B;
    public static final Pattern A0C = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    public static final Pattern A0D = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    public static final Pattern A0E = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d [0-2]\\d$");
    public static final Pattern A0F = Pattern.compile(":[0-5]\\d");
    public int A00 = 0;
    public long A01;
    public C87214Vw A02 = null;
    public AnonymousClass41T A03 = AnonymousClass41T.NOT_READY;
    public final C801442s A04;
    public final C26071Mf A05;
    public final CharSequence A06;
    public final String A07;

    static {
        StringBuilder A0r = AnonymousClass000.A0r("[^");
        A0r.append("(\\[（［");
        A0r.append(")\\]）］");
        String A0h = AnonymousClass000.A0h("]", A0r);
        String A012 = A01(0, 3);
        StringBuilder A0r2 = AnonymousClass000.A0r("(?:[");
        A0r2.append("(\\[（［");
        A0r2.append("])?(?:");
        A0r2.append(A0h);
        A0r2.append("+[");
        A0r2.append(")\\]）］");
        A0r2.append("])?");
        A0r2.append(A0h);
        C13680ns.A1Y("+(?:[", "(\\[（［", "]", A0r2);
        C13680ns.A1Y(A0h, "+[", ")\\]）］", A0r2);
        C13680ns.A1Y("])", A012, A0h, A0r2);
        A0A = Pattern.compile(AnonymousClass000.A0h("*", A0r2));
        String A013 = A01(0, 2);
        String A014 = A01(0, 4);
        String A015 = A01(0, 19);
        String A0h2 = C13680ns.A0h("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]", A014);
        String A0h3 = AnonymousClass000.A0h(A01(1, 19), AnonymousClass000.A0r("\\p{Nd}"));
        String A0h4 = AnonymousClass000.A0h("+＋", AnonymousClass000.A0q("(\\[（［"));
        StringBuilder A0r3 = AnonymousClass000.A0r("[");
        A0r3.append(A0h4);
        String A0h5 = AnonymousClass000.A0h("]", A0r3);
        A09 = Pattern.compile(A0h5);
        StringBuilder A0r4 = AnonymousClass000.A0r("\\p{Z}[^");
        A0r4.append(A0h4);
        A08 = Pattern.compile(AnonymousClass000.A0h("\\p{Nd}]*", A0r4));
        StringBuilder A0r5 = AnonymousClass000.A0r("(?:");
        A0r5.append(A0h5);
        A0r5.append(A0h2);
        C13680ns.A1Y(")", A013, A0h3, A0r5);
        C13680ns.A1Y("(?:", A0h2, A0h3, A0r5);
        C13680ns.A1Y(")", A015, "(?:", A0r5);
        A0r5.append(C26071Mf.A08);
        A0B = Pattern.compile(AnonymousClass000.A0h(")?", A0r5), 66);
    }

    public AnonymousClass3IU(C801442s r4, C26071Mf r5, String str, String str2) {
        this.A05 = r5;
        this.A06 = str == null ? "" : str;
        this.A07 = str2;
        this.A04 = r4;
        this.A01 = Long.MAX_VALUE;
    }

    public static CharSequence A00(CharSequence charSequence, Pattern pattern) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    public static String A01(int i2, int i3) {
        StringBuilder A0r = AnonymousClass000.A0r("{");
        A0r.append(i2);
        A0r.append(",");
        A0r.append(i3);
        return AnonymousClass000.A0h("}", A0r);
    }

    public static boolean A02(char c2) {
        if (Character.isLetter(c2) || Character.getType(c2) == 6) {
            Character.UnicodeBlock of = Character.UnicodeBlock.of(c2);
            if (of.equals(Character.UnicodeBlock.BASIC_LATIN) || of.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || of.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || of.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
                return true;
            }
        }
        return false;
    }

    public final C87214Vw A03(String str, int i2) {
        char charAt;
        char charAt2;
        try {
            String str2 = str;
            if (A0A.matcher(str).matches()) {
                C801442s r3 = this.A04;
                if (r3.compareTo(C801442s.A01) >= 0) {
                    if (i2 > 0 && !A09.matcher(str).lookingAt() && ((charAt2 = this.A06.charAt(i2 - 1)) == '%' || Character.getType(charAt2) == 26 || A02(charAt2))) {
                        return null;
                    }
                    int length = str.length() + i2;
                    CharSequence charSequence = this.A06;
                    if (length < charSequence.length() && ((charAt = charSequence.charAt(length)) == '%' || Character.getType(charAt) == 26 || A02(charAt))) {
                        return null;
                    }
                }
                C26071Mf r5 = this.A05;
                String str3 = this.A07;
                AnonymousClass3HS r6 = new AnonymousClass3HS();
                r5.A0H(r6, str2, str3, true, true);
                if (r3.A00(r5, r6, str)) {
                    r6.hasCountryCodeSource = false;
                    r6.countryCodeSource_ = C798041j.FROM_NUMBER_WITH_PLUS_SIGN;
                    r6.hasRawInput = false;
                    r6.rawInput_ = "";
                    r6.hasPreferredDomesticCarrierCode = false;
                    r6.preferredDomesticCarrierCode_ = "";
                    return new C87214Vw(r6, str, i2);
                }
                return null;
            }
            return null;
        } catch (C803443m unused) {
        }
    }

    public boolean hasNext() {
        C87214Vw r0;
        AnonymousClass41T r1 = this.A03;
        if (r1 == AnonymousClass41T.NOT_READY) {
            int i2 = this.A00;
            Pattern pattern = A0B;
            CharSequence charSequence = this.A06;
            Matcher matcher = pattern.matcher(charSequence);
            while (true) {
                if (this.A01 <= 0 || !matcher.find(i2)) {
                    r0 = null;
                } else {
                    int start = matcher.start();
                    CharSequence A002 = A00(charSequence.subSequence(start, matcher.end()), C26071Mf.A0L);
                    if (!A0C.matcher(A002).find() && !A0D.matcher(A002).find()) {
                        if (A0E.matcher(A002).find()) {
                            if (A0F.matcher(charSequence.toString().substring(A002.length() + start)).lookingAt()) {
                                continue;
                            }
                        }
                        String charSequence2 = A002.toString();
                        r0 = A03(charSequence2, start);
                        if (r0 != null) {
                            break;
                        }
                        Matcher matcher2 = A08.matcher(charSequence2);
                        if (matcher2.find()) {
                            String substring = charSequence2.substring(0, matcher2.start());
                            Pattern pattern2 = C26071Mf.A0N;
                            CharSequence A003 = A00(substring, pattern2);
                            r0 = A03(A003.toString(), start);
                            if (r0 != null) {
                                break;
                            }
                            this.A01--;
                            int end = matcher2.end();
                            r0 = A03(A00(charSequence2.substring(end), pattern2).toString(), start + end);
                            if (r0 != null) {
                                break;
                            }
                            long j2 = this.A01 - 1;
                            this.A01 = j2;
                            if (j2 > 0) {
                                while (matcher2.find()) {
                                    end = matcher2.start();
                                }
                                CharSequence A004 = A00(charSequence2.substring(0, end), pattern2);
                                if (!A004.equals(A003)) {
                                    r0 = A03(A004.toString(), start);
                                    if (r0 != null) {
                                        break;
                                    }
                                    this.A01--;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i2 = start + A002.length();
                    this.A01--;
                }
            }
            this.A02 = r0;
            if (r0 == null) {
                r1 = AnonymousClass41T.DONE;
            } else {
                this.A00 = r0.A00 + r0.A02.length();
                r1 = AnonymousClass41T.READY;
            }
            this.A03 = r1;
        }
        return AnonymousClass000.A1Y(r1, AnonymousClass41T.READY);
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            C87214Vw r1 = this.A02;
            this.A02 = null;
            this.A03 = AnonymousClass41T.NOT_READY;
            return r1;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw C13680ns.A0m();
    }
}
