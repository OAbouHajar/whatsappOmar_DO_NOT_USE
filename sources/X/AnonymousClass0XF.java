package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.0XF  reason: invalid class name */
public class AnonymousClass0XF {
    public C03580Jb A00;
    public C03590Jc A01;
    public boolean A02;

    public AnonymousClass0XF() {
        this(C03580Jb.screen, C03590Jc.Document);
    }

    public AnonymousClass0XF(C03580Jb r2, C03590Jc r3) {
        this.A00 = null;
        this.A01 = null;
        this.A02 = false;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static int A00(AnonymousClass0IL r4, List list, int i2) {
        int i3 = 0;
        if (i2 >= 0) {
            Object obj = list.get(i2);
            C13170la r0 = r4.A00;
            if (obj == r0) {
                for (Object obj2 : r0.AAc()) {
                    if (obj2 != r4) {
                        i3++;
                    }
                }
            }
            return -1;
        }
        return i3;
    }

    public static List A01(AnonymousClass0IR r9) {
        ArrayList A0u = AnonymousClass000.A0u();
        while (!AnonymousClass000.A1R(r9.A01, r9.A00)) {
            String str = null;
            int i2 = r9.A01;
            String str2 = r9.A03;
            char charAt = str2.charAt(i2);
            if (charAt < 'A' || (charAt > 'Z' && (charAt < 'a' || charAt > 'z'))) {
                r9.A01 = i2;
            } else {
                while (true) {
                    int A05 = r9.A05();
                    if (A05 < 65 || (A05 > 90 && (A05 < 97 || A05 > 122))) {
                        str = str2.substring(i2, r9.A01);
                    }
                }
                str = str2.substring(i2, r9.A01);
            }
            if (str == null) {
                break;
            }
            try {
                A0u.add(C03580Jb.valueOf(str));
            } catch (IllegalArgumentException unused) {
            }
            if (!r9.A0D()) {
                break;
            }
        }
        return A0u;
    }

    public static boolean A02(C04000Ks r9, AnonymousClass0QN r10, AnonymousClass0IL r11) {
        ArrayList A0u = AnonymousClass000.A0u();
        AnonymousClass0IL r5 = r11;
        for (C13170la r0 = r11.A00; r0 != null; r0 = ((AnonymousClass0PV) r0).A00) {
            A0u.add(0, r0);
        }
        int size = A0u.size() - 1;
        AnonymousClass0QN r4 = r10;
        List list = r10.A01;
        C04000Ks r3 = r9;
        if (list != null && list.size() == 1) {
            return A05(r9, (AnonymousClass0QS) r10.A01.get(0), r11);
        }
        List list2 = r10.A01;
        return A03(r3, r4, r5, A0u, (list2 == null ? 0 : list2.size()) - 1, size);
    }

    public static boolean A03(C04000Ks r4, AnonymousClass0QN r5, AnonymousClass0IL r6, List list, int i2, int i3) {
        AnonymousClass0QS r1 = (AnonymousClass0QS) r5.A01.get(i2);
        if (A05(r4, r1, r6)) {
            C03710Jo r12 = r1.A00;
            if (r12 == C03710Jo.DESCENDANT) {
                if (i2 != 0) {
                    while (i3 >= 0) {
                        if (!A04(r4, r5, list, i2 - 1, i3)) {
                            i3--;
                        }
                    }
                }
                return true;
            } else if (r12 == C03710Jo.CHILD) {
                return A04(r4, r5, list, i2 - 1, i3);
            } else {
                int A002 = A00(r6, list, i3);
                if (A002 > 0) {
                    return A03(r4, r5, (AnonymousClass0IL) r6.A00.AAc().get(A002 - 1), list, i2 - 1, i3);
                }
            }
        }
        return false;
    }

    public static boolean A04(C04000Ks r9, AnonymousClass0QN r10, List list, int i2, int i3) {
        AnonymousClass0QN r6 = r10;
        int i4 = i3;
        AnonymousClass0QS r1 = (AnonymousClass0QS) r6.A01.get(i2);
        List list2 = list;
        AnonymousClass0IL r4 = (AnonymousClass0IL) list.get(i3);
        C04000Ks r5 = r9;
        if (A05(r9, r1, r4)) {
            C03710Jo r12 = r1.A00;
            if (r12 == C03710Jo.DESCENDANT) {
                if (i2 == 0) {
                    return true;
                }
                while (i4 > 0) {
                    i4--;
                    if (A04(r9, r6, list, i2 - 1, i4)) {
                        return true;
                    }
                }
            } else if (r12 == C03710Jo.CHILD) {
                return A04(r9, r6, list, i2 - 1, i3 - 1);
            } else {
                int A002 = A00(r4, list, i3);
                if (A002 > 0) {
                    return A03(r5, r6, (AnonymousClass0IL) r4.A00.AAc().get(A002 - 1), list2, i2 - 1, i4);
                }
            }
        }
        return false;
    }

    public static boolean A05(C04000Ks r5, AnonymousClass0QS r6, AnonymousClass0IL r7) {
        boolean equals;
        List list;
        String str = r6.A01;
        if (str == null || str.equals(r7.A00().toLowerCase(Locale.US))) {
            List<AnonymousClass0OU> list2 = r6.A02;
            if (list2 != null) {
                for (AnonymousClass0OU r2 : list2) {
                    String str2 = r2.A01;
                    if (str2.equals("id")) {
                        equals = r2.A02.equals(r7.A03);
                        continue;
                    } else if (str2.equals("class") && (list = r7.A04) != null) {
                        equals = list.contains(r2.A02);
                        continue;
                    }
                    if (!equals) {
                        return false;
                    }
                }
            }
            List<C12740kt> list3 = r6.A03;
            if (list3 == null) {
                return true;
            }
            for (C12740kt ALM : list3) {
                if (!ALM.ALM(r5, r7)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02a1, code lost:
        r10.A02 = true;
        r3.A01(A06(r11));
        r10.A02 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        if (r7.toString() != null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0157, code lost:
        if (r11.A0F(")") == false) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e5 A[Catch:{ 0Kk -> 0x02c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0291 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C05400Qu A06(X.AnonymousClass0IR r11) {
        /*
            r10 = this;
            X.0Qu r3 = new X.0Qu
            r3.<init>()
        L_0x0005:
            int r1 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x02dd
            java.lang.String r0 = "<!--"
            boolean r0 = r11.A0F(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0005
            java.lang.String r0 = "-->"
            boolean r0 = r11.A0F(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0005
            r0 = 64
            boolean r0 = r11.A0E(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x01ba
            java.lang.String r2 = r11.A0H()     // Catch:{ 0Kk -> 0x02c9 }
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            if (r2 == 0) goto L_0x01b1
            boolean r0 = r10.A02     // Catch:{ 0Kk -> 0x02c9 }
            java.lang.String r4 = "Invalid @media rule: expected '}' at end of rule set"
            r6 = 0
            r7 = 1
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "media"
            boolean r0 = r2.equals(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0075
            java.util.List r1 = A01(r11)     // Catch:{ 0Kk -> 0x02c9 }
            r0 = 123(0x7b, float:1.72E-43)
            boolean r0 = r11.A0E(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x006c
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            X.0Jb r5 = r10.A00     // Catch:{ 0Kk -> 0x02c9 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ 0Kk -> 0x02c9 }
        L_0x0055:
            boolean r0 = r2.hasNext()     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0067
            java.lang.Object r1 = r2.next()     // Catch:{ 0Kk -> 0x02c9 }
            X.0Jb r0 = X.C03580Jb.all     // Catch:{ 0Kk -> 0x02c9 }
            if (r1 == r0) goto L_0x02a1
            if (r1 != r5) goto L_0x0055
            goto L_0x02a1
        L_0x0067:
            r10.A06(r11)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x02ac
        L_0x006c:
            java.lang.String r0 = "Invalid @media rule: missing rule set"
            X.0Kk r1 = new X.0Kk     // Catch:{ 0Kk -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x02c3
        L_0x0075:
            java.lang.String r0 = "import"
            boolean r0 = r2.equals(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0178
            int r1 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0135
            int r8 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            java.lang.String r0 = "url("
            boolean r0 = r11.A0F(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0135
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            java.lang.String r0 = r11.A0G()     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0144
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0o()     // Catch:{ 0Kk -> 0x02c9 }
        L_0x009e:
            int r1 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0127
            java.lang.String r9 = r11.A03     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            char r2 = r9.charAt(r0)     // Catch:{ 0Kk -> 0x02c9 }
            r0 = 39
            if (r2 == r0) goto L_0x0127
            r0 = 34
            if (r2 == r0) goto L_0x0127
            r0 = 40
            if (r2 == r0) goto L_0x0127
            r0 = 41
            if (r2 == r0) goto L_0x0127
            boolean r0 = X.AnonymousClass0VC.A01(r2)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0127
            boolean r0 = java.lang.Character.isISOControl(r2)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0127
            int r0 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r1 = r0 + 1
            r11.A01 = r1     // Catch:{ 0Kk -> 0x02c9 }
            r0 = 92
            if (r2 != r0) goto L_0x0121
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x009e
            int r0 = r1 + 1
            r11.A01 = r0     // Catch:{ 0Kk -> 0x02c9 }
            char r2 = r9.charAt(r1)     // Catch:{ 0Kk -> 0x02c9 }
            r0 = 10
            if (r2 == r0) goto L_0x009e
            r0 = 13
            if (r2 == r0) goto L_0x009e
            r0 = 12
            if (r2 == r0) goto L_0x009e
            int r1 = X.AnonymousClass0IR.A00(r2)     // Catch:{ 0Kk -> 0x02c9 }
            r6 = -1
            if (r1 == r6) goto L_0x0121
            r5 = 1
        L_0x00fa:
            int r2 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r2, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x011f
            int r0 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            char r0 = r9.charAt(r0)     // Catch:{ 0Kk -> 0x02c9 }
            int r2 = X.AnonymousClass0IR.A00(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r2 == r6) goto L_0x011f
            int r0 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r0 + 1
            r11.A01 = r0     // Catch:{ 0Kk -> 0x02c9 }
            int r1 = r1 << 4
            int r1 = r1 + r2
            int r5 = r5 + 1
            r0 = 5
            if (r5 > r0) goto L_0x011f
            goto L_0x00fa
        L_0x011f:
            char r0 = (char) r1     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x0122
        L_0x0121:
            char r0 = (char) r2     // Catch:{ 0Kk -> 0x02c9 }
        L_0x0122:
            r7.append(r0)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x009e
        L_0x0127:
            int r0 = r7.length()     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = r7.toString()     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0144
        L_0x0133:
            r11.A01 = r8     // Catch:{ 0Kk -> 0x02c9 }
        L_0x0135:
            java.lang.String r0 = r11.A0G()     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0159
            java.lang.String r0 = "Invalid @import rule: expected string or url()"
            X.0Kk r1 = new X.0Kk     // Catch:{ 0Kk -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x02c3
        L_0x0144:
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            int r1 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0159
            java.lang.String r0 = ")"
            boolean r0 = r11.A0F(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0133
        L_0x0159:
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            A01(r11)     // Catch:{ 0Kk -> 0x02c9 }
            int r1 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            r0 = 59
            boolean r0 = r11.A0E(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            X.0Kk r1 = new X.0Kk     // Catch:{ 0Kk -> 0x02c9 }
            r1.<init>(r4)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x02c3
        L_0x0178:
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ 0Kk -> 0x02c9 }
            r1[r6] = r2     // Catch:{ 0Kk -> 0x02c9 }
            java.lang.String r0 = "Ignoring @%s rule"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ 0Kk -> 0x02c9 }
            java.lang.String r0 = "CSSParser"
            android.util.Log.w(r0, r1)     // Catch:{ 0Kk -> 0x02c9 }
            r2 = 0
        L_0x0188:
            int r1 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            java.lang.Integer r0 = r11.A09()     // Catch:{ 0Kk -> 0x02c9 }
            int r1 = r0.intValue()     // Catch:{ 0Kk -> 0x02c9 }
            r0 = 59
            if (r1 == r0) goto L_0x01ad
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 != r0) goto L_0x01a5
            int r2 = r2 + 1
            goto L_0x0188
        L_0x01a5:
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 != r0) goto L_0x0188
            if (r2 <= 0) goto L_0x0188
            int r2 = r2 + -1
        L_0x01ad:
            if (r2 != 0) goto L_0x0188
            goto L_0x02c4
        L_0x01b1:
            java.lang.String r0 = "Invalid '@' rule"
            X.0Kk r1 = new X.0Kk     // Catch:{ 0Kk -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x02c3
        L_0x01ba:
            java.util.List r8 = r11.A0I()     // Catch:{ 0Kk -> 0x02c9 }
            if (r8 == 0) goto L_0x02dd
            boolean r0 = r8.isEmpty()     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x02dd
            r0 = 123(0x7b, float:1.72E-43)
            boolean r0 = r11.A0E(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0299
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            X.0f0 r5 = new X.0f0     // Catch:{ 0Kk -> 0x02c9 }
            r5.<init>()     // Catch:{ 0Kk -> 0x02c9 }
        L_0x01d6:
            java.lang.String r2 = r11.A0H()     // Catch:{ 0Kk -> 0x02c9 }
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            r0 = 58
            boolean r0 = r11.A0E(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0291
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            int r1 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0289
            int r4 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            java.lang.String r1 = r11.A03     // Catch:{ 0Kk -> 0x02c9 }
            char r7 = r1.charAt(r4)     // Catch:{ 0Kk -> 0x02c9 }
            r6 = r4
        L_0x01fb:
            r0 = -1
            if (r7 == r0) goto L_0x0221
            r0 = 59
            if (r7 == r0) goto L_0x0221
            r0 = 125(0x7d, float:1.75E-43)
            if (r7 == r0) goto L_0x0221
            r0 = 33
            if (r7 == r0) goto L_0x0221
            r0 = 10
            if (r7 == r0) goto L_0x0221
            r0 = 13
            if (r7 == r0) goto L_0x0221
            boolean r0 = X.AnonymousClass0VC.A01(r7)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x021c
            int r0 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r6 = r0 + 1
        L_0x021c:
            int r7 = r11.A05()     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x01fb
        L_0x0221:
            int r0 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 <= r4) goto L_0x0287
            java.lang.String r1 = r1.substring(r4, r6)     // Catch:{ 0Kk -> 0x02c9 }
            if (r1 == 0) goto L_0x0289
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            r0 = 33
            boolean r0 = r11.A0E(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0244
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            java.lang.String r0 = "important"
            boolean r0 = r11.A0F(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x027f
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
        L_0x0244:
            r0 = 59
            r11.A0E(r0)     // Catch:{ 0Kk -> 0x02c9 }
            X.AnonymousClass0XP.A0J(r5, r2, r1)     // Catch:{ 0Kk -> 0x02c9 }
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            int r1 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x0261
            r0 = 125(0x7d, float:1.75E-43)
            boolean r0 = r11.A0E(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x01d6
        L_0x0261:
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            java.util.Iterator r4 = r8.iterator()     // Catch:{ 0Kk -> 0x02c9 }
        L_0x0268:
            boolean r0 = r4.hasNext()     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 == 0) goto L_0x0005
            java.lang.Object r2 = r4.next()     // Catch:{ 0Kk -> 0x02c9 }
            X.0QN r2 = (X.AnonymousClass0QN) r2     // Catch:{ 0Kk -> 0x02c9 }
            X.0Jc r1 = r10.A01     // Catch:{ 0Kk -> 0x02c9 }
            X.0Pf r0 = new X.0Pf     // Catch:{ 0Kk -> 0x02c9 }
            r0.<init>(r2, r1, r5)     // Catch:{ 0Kk -> 0x02c9 }
            r3.A00(r0)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x0268
        L_0x027f:
            java.lang.String r0 = "Malformed rule set: found unexpected '!'"
            X.0Kk r1 = new X.0Kk     // Catch:{ 0Kk -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x02c3
        L_0x0287:
            r11.A01 = r4     // Catch:{ 0Kk -> 0x02c9 }
        L_0x0289:
            java.lang.String r0 = "Expected property value"
            X.0Kk r1 = new X.0Kk     // Catch:{ 0Kk -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x02c3
        L_0x0291:
            java.lang.String r0 = "Expected ':'"
            X.0Kk r1 = new X.0Kk     // Catch:{ 0Kk -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x02c3
        L_0x0299:
            java.lang.String r0 = "Malformed rule block: expected '{'"
            X.0Kk r1 = new X.0Kk     // Catch:{ 0Kk -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x02c3
        L_0x02a1:
            r10.A02 = r7     // Catch:{ 0Kk -> 0x02c9 }
            X.0Qu r0 = r10.A06(r11)     // Catch:{ 0Kk -> 0x02c9 }
            r3.A01(r0)     // Catch:{ 0Kk -> 0x02c9 }
            r10.A02 = r6     // Catch:{ 0Kk -> 0x02c9 }
        L_0x02ac:
            int r1 = r11.A01     // Catch:{ 0Kk -> 0x02c9 }
            int r0 = r11.A00     // Catch:{ 0Kk -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            r0 = 125(0x7d, float:1.75E-43)
            boolean r0 = r11.A0E(r0)     // Catch:{ 0Kk -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            X.0Kk r1 = new X.0Kk     // Catch:{ 0Kk -> 0x02c9 }
            r1.<init>(r4)     // Catch:{ 0Kk -> 0x02c9 }
        L_0x02c3:
            throw r1     // Catch:{ 0Kk -> 0x02c9 }
        L_0x02c4:
            r11.A0C()     // Catch:{ 0Kk -> 0x02c9 }
            goto L_0x0005
        L_0x02c9:
            r2 = move-exception
            java.lang.String r0 = "CSS parser terminated early due to error: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "CSSParser"
            android.util.Log.e(r0, r1)
        L_0x02dd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0XF.A06(X.0IR):X.0Qu");
    }
}
