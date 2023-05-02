package X;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: X.02E  reason: invalid class name */
public final class AnonymousClass02E {
    public static final AnonymousClass02E A02;
    public static final AnonymousClass02E A03;
    public static final AnonymousClass02F A04;
    public static final String A05 = Character.toString(8206);
    public static final String A06 = Character.toString(8207);
    public final AnonymousClass02F A00;
    public final boolean A01;

    static {
        AnonymousClass02F r2 = AnonymousClass02G.A01;
        A04 = r2;
        A02 = new AnonymousClass02E(r2, false);
        A03 = new AnonymousClass02E(r2, true);
    }

    public AnonymousClass02E(AnonymousClass02F r1, boolean z2) {
        this.A01 = z2;
        this.A00 = r1;
    }

    public static int A00(CharSequence charSequence) {
        int i2;
        byte directionality;
        byte directionality2;
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 < length) {
                if (i4 == 0) {
                    char charAt = charSequence.charAt(i3);
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(charSequence, i3);
                        i3 += Character.charCount(codePointAt);
                        directionality2 = Character.getDirectionality(codePointAt);
                    } else {
                        i3++;
                        directionality2 = charAt < 1792 ? C04410Ml.A00[charAt] : Character.getDirectionality(charAt);
                    }
                    if (directionality2 != 0) {
                        if (directionality2 == 1 || directionality2 == 2) {
                            if (i6 == 0) {
                                return 1;
                            }
                        } else if (directionality2 != 9) {
                            switch (directionality2) {
                                case 14:
                                case 15:
                                    i6++;
                                    i5 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i6++;
                                    i5 = 1;
                                    continue;
                                case 18:
                                    i6--;
                                    i5 = 0;
                                    continue;
                            }
                        }
                    } else if (i6 == 0) {
                        return -1;
                    }
                    i4 = i6;
                }
            } else if (i4 == 0) {
                return 0;
            }
        }
        if (i5 != 0) {
            return i5;
        }
        while (i3 > 0) {
            int i7 = i3 - 1;
            char charAt2 = charSequence.charAt(i7);
            if (Character.isLowSurrogate(charAt2)) {
                int codePointBefore = Character.codePointBefore(charSequence, i3);
                i2 = i3 - Character.charCount(codePointBefore);
                directionality = Character.getDirectionality(codePointBefore);
            } else {
                i2 = i7;
                directionality = charAt2 < 1792 ? C04410Ml.A00[charAt2] : Character.getDirectionality(charAt2);
            }
            switch (directionality) {
                case 14:
                case 15:
                    if (i4 == i6) {
                        return -1;
                    }
                    break;
                case 16:
                case 17:
                    if (i4 == i6) {
                        return 1;
                    }
                    break;
                case 18:
                    i6++;
                    continue;
            }
            i6--;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        r3 = r3 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.CharSequence r5) {
        /*
            int r4 = r5.length()
            r3 = 0
            r2 = 0
        L_0x0006:
            r0 = 0
            if (r4 <= 0) goto L_0x0055
            int r0 = r4 + -1
            char r1 = r5.charAt(r0)
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 == 0) goto L_0x0042
            int r1 = java.lang.Character.codePointBefore(r5, r4)
            int r0 = java.lang.Character.charCount(r1)
            int r4 = r4 - r0
            byte r1 = java.lang.Character.getDirectionality(r1)
        L_0x0022:
            if (r1 == 0) goto L_0x003b
            r0 = 1
            if (r1 == r0) goto L_0x0038
            r0 = 2
            if (r1 == r0) goto L_0x0038
            r0 = 9
            if (r1 == r0) goto L_0x0006
            switch(r1) {
                case 14: goto L_0x003e;
                case 15: goto L_0x003e;
                case 16: goto L_0x0052;
                case 17: goto L_0x0052;
                case 18: goto L_0x0035;
                default: goto L_0x0031;
            }
        L_0x0031:
            if (r2 != 0) goto L_0x0006
            r2 = r3
            goto L_0x0006
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x0038:
            if (r3 != 0) goto L_0x0031
            goto L_0x0054
        L_0x003b:
            if (r3 != 0) goto L_0x0031
            goto L_0x0040
        L_0x003e:
            if (r2 != r3) goto L_0x0056
        L_0x0040:
            r0 = -1
            return r0
        L_0x0042:
            int r4 = r4 + -1
            r0 = 1792(0x700, float:2.511E-42)
            if (r1 >= r0) goto L_0x004d
            byte[] r0 = X.C04410Ml.A00
            byte r1 = r0[r1]
            goto L_0x0022
        L_0x004d:
            byte r1 = java.lang.Character.getDirectionality(r1)
            goto L_0x0022
        L_0x0052:
            if (r2 != r3) goto L_0x0056
        L_0x0054:
            r0 = 1
        L_0x0055:
            return r0
        L_0x0056:
            int r3 = r3 + -1
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass02E.A01(java.lang.CharSequence):int");
    }

    public static AnonymousClass02E A02() {
        boolean z2 = true;
        if (C012406c.A00(Locale.getDefault()) != 1) {
            z2 = false;
        }
        AnonymousClass02F r1 = A04;
        return r1 == r1 ? z2 ? A03 : A02 : new AnonymousClass02E(r1, z2);
    }

    public CharSequence A03(AnonymousClass02F r7, CharSequence charSequence) {
        String str;
        String str2;
        if (charSequence == null) {
            return null;
        }
        boolean AJb = r7.AJb(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean AJb2 = (AJb ? AnonymousClass02G.A05 : AnonymousClass02G.A04).AJb(charSequence, 0, charSequence.length());
        boolean z2 = this.A01;
        if (!z2) {
            if (AJb2 || A00(charSequence) == 1) {
                str = A05;
            }
            str = "";
        } else {
            if (!AJb2 || A00(charSequence) == -1) {
                str = A06;
            }
            str = "";
        }
        spannableStringBuilder.append(str);
        if (AJb != z2) {
            char c2 = 8234;
            if (AJb) {
                c2 = 8235;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean AJb3 = (AJb ? AnonymousClass02G.A05 : AnonymousClass02G.A04).AJb(charSequence, 0, charSequence.length());
        if (!z2) {
            if (AJb3 || A01(charSequence) == 1) {
                str2 = A05;
            }
            str2 = "";
        } else {
            if (!AJb3 || A01(charSequence) == -1) {
                str2 = A06;
            }
            str2 = "";
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}
