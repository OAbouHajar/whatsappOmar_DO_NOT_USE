package X;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.4dd  reason: invalid class name and case insensitive filesystem */
public final class C90174dd {
    public List A00;
    public final long A01;
    public final long A02;
    public final C90174dd A03;
    public final AnonymousClass4SK A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final HashMap A09 = AnonymousClass000.A0x();
    public final HashMap A0A = AnonymousClass000.A0x();
    public final boolean A0B;
    public final String[] A0C;

    public C90174dd(C90174dd r2, AnonymousClass4SK r3, String str, String str2, String str3, String str4, String[] strArr, long j2, long j3) {
        this.A07 = str;
        this.A08 = str2;
        this.A05 = str4;
        this.A04 = r3;
        this.A0C = strArr;
        this.A0B = AnonymousClass000.A1V(str2);
        this.A02 = j2;
        this.A01 = j3;
        this.A06 = str3;
        this.A03 = r2;
    }

    public static SpannableStringBuilder A00(String str, Map map) {
        if (!map.containsKey(str)) {
            C88794b6 r1 = new C88794b6();
            r1.A0E = new SpannableStringBuilder();
            map.put(str, r1);
        }
        return (SpannableStringBuilder) ((C88794b6) map.get(str)).A0E;
    }

    public static AnonymousClass4SK A01(AnonymousClass4SK r3, Map map, String[] strArr) {
        int i2;
        int i3 = 0;
        if (r3 == null) {
            if (strArr == null) {
                return null;
            }
            i2 = strArr.length;
            if (i2 == 1) {
                return (AnonymousClass4SK) map.get(strArr[0]);
            }
            if (i2 <= 1) {
                return r3;
            }
            r3 = new AnonymousClass4SK();
        } else if (strArr == null) {
            return r3;
        } else {
            i2 = strArr.length;
            if (i2 == 1) {
                r3.A00((AnonymousClass4SK) map.get(strArr[0]));
                return r3;
            } else if (i2 <= 1) {
                return r3;
            }
        }
        do {
            r3.A00((AnonymousClass4SK) map.get(strArr[i3]));
            i3++;
        } while (i3 < i2);
        return r3;
    }

    public C90174dd A02(int i2) {
        List list = this.A00;
        if (list != null) {
            return (C90174dd) list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public final void A03(String str, List list, long j2) {
        String str2;
        String str3 = this.A06;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (!A07(j2) || !"div".equals(this.A07) || (str2 = this.A05) == null) {
            for (int i2 = 0; i2 < C13680ns.A07(this.A00); i2++) {
                A02(i2).A03(str, list, j2);
            }
            return;
        }
        list.add(new Pair(str, str2));
    }

    public final void A04(String str, Map map, long j2, boolean z2) {
        boolean z3;
        String str2 = str;
        HashMap hashMap = this.A0A;
        hashMap.clear();
        HashMap hashMap2 = this.A09;
        hashMap2.clear();
        String str3 = this.A07;
        if (!"metadata".equals(str3)) {
            String str4 = this.A06;
            if (!"".equals(str4)) {
                str2 = str4;
            }
            Map map2 = map;
            if (this.A0B && z2) {
                A00(str2, map).append(this.A08);
            } else if (!"br".equals(str3) || !z2) {
                long j3 = j2;
                if (A07(j2)) {
                    Iterator A0y = AnonymousClass000.A0y(map);
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass000.A0z(A0y);
                        C13680ns.A1X(A0z.getKey(), hashMap, ((C88794b6) A0z.getValue()).A0E.length());
                    }
                    boolean equals = "p".equals(str3);
                    for (int i2 = 0; i2 < C13680ns.A07(this.A00); i2++) {
                        C90174dd A022 = A02(i2);
                        if (!z2) {
                            z3 = false;
                            if (!equals) {
                                A022.A04(str2, map2, j3, z3);
                            }
                        }
                        z3 = true;
                        A022.A04(str2, map2, j3, z3);
                    }
                    if (equals) {
                        SpannableStringBuilder A002 = A00(str2, map);
                        int length = A002.length();
                        while (true) {
                            length--;
                            if (length < 0) {
                                break;
                            } else if (A002.charAt(length) != ' ') {
                                if (A002.charAt(length) != 10) {
                                    A002.append(10);
                                }
                            }
                        }
                    }
                    Iterator A0y2 = AnonymousClass000.A0y(map);
                    while (A0y2.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass000.A0z(A0y2);
                        C13680ns.A1X(A0z2.getKey(), hashMap2, ((C88794b6) A0z2.getValue()).A0E.length());
                    }
                }
            } else {
                A00(str2, map).append(10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00df, code lost:
        if (r13 == 1) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r27, java.util.Map r28, java.util.Map r29, java.util.Map r30, long r31) {
        /*
            r26 = this;
            r25 = r27
            r4 = r26
            r23 = r31
            r0 = r23
            boolean r0 = r4.A07(r0)
            if (r0 == 0) goto L_0x0203
            java.lang.String r1 = r4.A06
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001a
            r25 = r1
        L_0x001a:
            java.util.HashMap r0 = r4.A09
            java.util.Iterator r17 = X.C13690nt.A0j(r0)
        L_0x0020:
            boolean r0 = r17.hasNext()
            r6 = 0
            r18 = r28
            r5 = r29
            r7 = r30
            if (r0 == 0) goto L_0x01fa
            java.util.Map$Entry r3 = X.AnonymousClass000.A0z(r17)
            java.lang.Object r2 = r3.getKey()
            java.util.HashMap r1 = r4.A0A
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r1.get(r2)
            int r6 = X.AnonymousClass000.A0D(r0)
        L_0x0045:
            java.lang.Object r0 = r3.getValue()
            int r9 = X.AnonymousClass000.A0D(r0)
            if (r6 == r9) goto L_0x0020
            java.lang.Object r8 = r7.get(r2)
            X.4b6 r8 = (X.C88794b6) r8
            r0 = r25
            java.lang.Object r0 = r5.get(r0)
            X.4Oh r0 = (X.C85404Oh) r0
            int r13 = r0.A08
            X.4SK r2 = r4.A04
            java.lang.String[] r1 = r4.A0C
            r0 = r18
            X.4SK r10 = A01(r2, r0, r1)
            java.lang.CharSequence r7 = r8.A0E
            android.text.SpannableStringBuilder r7 = (android.text.SpannableStringBuilder) r7
            if (r7 != 0) goto L_0x0076
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r8.A0E = r7
        L_0x0076:
            if (r10 == 0) goto L_0x0020
            X.4dd r5 = r4.A03
            int r11 = r10.A03
            r1 = -1
            if (r11 != r1) goto L_0x01db
            int r0 = r10.A06
            if (r0 != r1) goto L_0x01db
        L_0x0083:
            r12 = -1
            r11 = 33
            if (r1 == r12) goto L_0x0090
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r7.setSpan(r0, r6, r9, r11)
        L_0x0090:
            int r0 = r10.A07
            r1 = 1
            if (r0 != r1) goto L_0x009d
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r7.setSpan(r0, r6, r9, r11)
        L_0x009d:
            int r0 = r10.A0B
            if (r0 != r1) goto L_0x00a9
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r7.setSpan(r0, r6, r9, r11)
        L_0x00a9:
            boolean r0 = r10.A0H
            if (r0 == 0) goto L_0x00b7
            int r1 = r10.A04
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            X.AnonymousClass455.A00(r7, r0, r6, r9)
        L_0x00b7:
            boolean r0 = r10.A0G
            if (r0 == 0) goto L_0x00c5
            int r1 = r10.A02
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            X.AnonymousClass455.A00(r7, r0, r6, r9)
        L_0x00c5:
            java.lang.String r1 = r10.A0E
            if (r1 == 0) goto L_0x00d1
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r1)
            X.AnonymousClass455.A00(r7, r0, r6, r9)
        L_0x00d1:
            X.4a0 r0 = r10.A0D
            r14 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x00f1
            int r15 = r0.A01
            if (r15 != r12) goto L_0x01d7
            if (r13 == r3) goto L_0x00e1
            r15 = 1
            if (r13 != r2) goto L_0x00e2
        L_0x00e1:
            r15 = 3
        L_0x00e2:
            r13 = 1
        L_0x00e3:
            int r1 = r0.A02
            r0 = -2
            if (r1 != r0) goto L_0x00e9
            r1 = 1
        L_0x00e9:
            X.4Jc r0 = new X.4Jc
            r0.<init>(r15, r13, r1)
            X.AnonymousClass455.A00(r7, r0, r6, r9)
        L_0x00f1:
            int r1 = r10.A09
            if (r1 == r3) goto L_0x0154
            if (r1 == r14) goto L_0x014b
            r0 = 4
            if (r1 == r0) goto L_0x014b
        L_0x00fa:
            int r0 = r10.A0A
            if (r0 != r2) goto L_0x0106
            X.454 r0 = new X.454
            r0.<init>()
            X.AnonymousClass455.A00(r7, r0, r6, r9)
        L_0x0106:
            int r0 = r10.A05
            if (r0 == r2) goto L_0x013f
            if (r0 == r3) goto L_0x013c
            if (r0 != r14) goto L_0x011b
            float r1 = r10.A00
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
        L_0x0113:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            r0.<init>(r1)
            X.AnonymousClass455.A00(r7, r0, r6, r9)
        L_0x011b:
            float r2 = r10.A01
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0136
            java.lang.String r1 = r4.A07
            java.lang.String r0 = "p"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0136
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r0
            r8.A03 = r2
        L_0x0136:
            android.text.Layout$Alignment r0 = r10.A0C
            r8.A0D = r0
            goto L_0x0020
        L_0x013c:
            float r1 = r10.A00
            goto L_0x0113
        L_0x013f:
            float r0 = r10.A00
            int r1 = (int) r0
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            r0.<init>(r1, r2)
            X.AnonymousClass455.A00(r7, r0, r6, r9)
            goto L_0x011b
        L_0x014b:
            X.456 r0 = new X.456
            r0.<init>()
            r7.setSpan(r0, r6, r9, r11)
            goto L_0x00fa
        L_0x0154:
            if (r5 == 0) goto L_0x00fa
            X.4SK r13 = r5.A04
            java.lang.String[] r1 = r5.A0C
            r0 = r18
            X.4SK r0 = A01(r13, r0, r1)
            if (r0 == 0) goto L_0x01cb
            int r0 = r0.A09
            if (r0 != r2) goto L_0x01cb
            java.util.ArrayDeque r16 = new java.util.ArrayDeque
            r16.<init>()
            r0 = r16
            r0.push(r5)
        L_0x0170:
            boolean r0 = r16.isEmpty()
            if (r0 != 0) goto L_0x00fa
            java.lang.Object r15 = r16.pop()
            X.4dd r15 = (X.C90174dd) r15
            X.4SK r13 = r15.A04
            java.lang.String[] r1 = r15.A0C
            r0 = r18
            X.4SK r0 = A01(r13, r0, r1)
            if (r0 == 0) goto L_0x01b5
            int r0 = r0.A09
            if (r0 != r14) goto L_0x01b5
            java.util.List r0 = r15.A00
            if (r0 == 0) goto L_0x01ce
            int r0 = r0.size()
            if (r0 != r2) goto L_0x01ce
            r1 = 0
            X.4dd r0 = r15.A02(r1)
            java.lang.String r0 = r0.A08
            if (r0 == 0) goto L_0x01ce
            X.4dd r0 = r15.A02(r1)
            java.lang.String r1 = r0.A08
            X.4SK r0 = r5.A04
            if (r0 == 0) goto L_0x01ab
            int r12 = r0.A08
        L_0x01ab:
            X.4GJ r0 = new X.4GJ
            r0.<init>(r1, r12)
            r7.setSpan(r0, r6, r9, r11)
            goto L_0x00fa
        L_0x01b5:
            java.util.List r0 = r15.A00
            if (r0 == 0) goto L_0x0170
            int r13 = r0.size()
        L_0x01bd:
            int r13 = r13 + -1
            if (r13 < 0) goto L_0x0170
            X.4dd r1 = r15.A02(r13)
            r0 = r16
            r0.push(r1)
            goto L_0x01bd
        L_0x01cb:
            X.4dd r5 = r5.A03
            goto L_0x0154
        L_0x01ce:
            java.lang.String r1 = "TtmlRenderUtil"
            java.lang.String r0 = "Skipping rubyText node without exactly one text child."
            android.util.Log.i(r1, r0)
            goto L_0x00fa
        L_0x01d7:
            int r13 = r0.A00
            goto L_0x00e3
        L_0x01db:
            r3 = 0
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1R(r11, r2)
            int r0 = r10.A06
            if (r0 != r2) goto L_0x01e6
            r3 = 2
        L_0x01e6:
            r1 = r1 | r3
            goto L_0x0083
        L_0x01e9:
            X.4dd r16 = r4.A02(r6)
            r17 = r25
            r19 = r5
            r20 = r7
            r21 = r23
            r16.A05(r17, r18, r19, r20, r21)
            int r6 = r6 + 1
        L_0x01fa:
            java.util.List r0 = r4.A00
            int r0 = X.C13680ns.A07(r0)
            if (r6 >= r0) goto L_0x0203
            goto L_0x01e9
        L_0x0203:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90174dd.A05(java.lang.String, java.util.Map, java.util.Map, java.util.Map, long):void");
    }

    public final void A06(TreeSet treeSet, boolean z2) {
        boolean z3;
        String str = this.A07;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z2 || equals || (equals2 && this.A05 != null)) {
            long j2 = this.A02;
            if (j2 != -9223372036854775807L) {
                C13700nu.A0d(treeSet, j2);
            }
            long j3 = this.A01;
            if (j3 != -9223372036854775807L) {
                C13700nu.A0d(treeSet, j3);
            }
        }
        if (this.A00 != null) {
            for (int i2 = 0; i2 < this.A00.size(); i2++) {
                C90174dd r1 = (C90174dd) this.A00.get(i2);
                if (!z2) {
                    z3 = false;
                    if (!equals) {
                        r1.A06(treeSet, z3);
                    }
                }
                z3 = true;
                r1.A06(treeSet, z3);
            }
        }
    }

    public boolean A07(long j2) {
        long j3 = this.A02;
        if (j3 == -9223372036854775807L && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j3 <= j2 && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j2 >= this.A01) {
            return j3 <= j2 && j2 < this.A01;
        }
        return true;
    }
}
