package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: X.4q6  reason: invalid class name and case insensitive filesystem */
public final class C97504q6 implements C109535Sn {
    public final C90174dd A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final long[] A04;

    public C97504q6(C90174dd r7, Map map, Map map2, Map map3) {
        this.A00 = r7;
        this.A03 = map2;
        this.A02 = map3;
        this.A01 = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        r7.A06(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = C13700nu.A01(it.next());
            i2++;
        }
        this.A04 = jArr;
    }

    public List ABD(long j2) {
        C90174dd r10 = this.A00;
        Map map = this.A01;
        Map map2 = this.A03;
        Map map3 = this.A02;
        ArrayList A0u = AnonymousClass000.A0u();
        String str = r10.A06;
        long j3 = j2;
        r10.A03(str, A0u, j3);
        TreeMap treeMap = new TreeMap();
        r10.A04(str, treeMap, j3, false);
        r10.A05(str, map, map2, treeMap, j3);
        ArrayList A0u2 = AnonymousClass000.A0u();
        Iterator it = A0u.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String A0e = C13690nt.A0e(pair.second, map3);
            if (A0e != null) {
                byte[] decode = Base64.decode(A0e, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                C85404Oh r5 = (C85404Oh) map2.get(pair.first);
                C88794b6 r1 = new C88794b6();
                r1.A0C = decodeByteArray;
                r1.A02 = r5.A02;
                r1.A08 = 0;
                r1.A01 = r5.A01;
                r1.A07 = 0;
                r1.A06 = r5.A05;
                r1.A04 = r5.A04;
                r1.A00 = r5.A00;
                r1.A0A = r5.A08;
                A0u2.add(r1.A00());
            }
        }
        Iterator A0j = C13690nt.A0j(treeMap);
        while (A0j.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0j);
            C85404Oh r52 = (C85404Oh) map2.get(A0z.getKey());
            C88794b6 r4 = (C88794b6) A0z.getValue();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) r4.A0E;
            for (AnonymousClass456 r0 : (AnonymousClass456[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), AnonymousClass456.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(r0), spannableStringBuilder.getSpanEnd(r0), "");
            }
            for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i3 = i2 + 1;
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i6 = 0; i6 < spannableStringBuilder.length() - 1; i6++) {
                if (spannableStringBuilder.charAt(i6) == 10) {
                    int i7 = i6 + 1;
                    if (spannableStringBuilder.charAt(i7) == ' ') {
                        spannableStringBuilder.delete(i7, i6 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
                if (spannableStringBuilder.charAt(i8) == ' ') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == 10) {
                        spannableStringBuilder.delete(i8, i9);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f2 = r52.A01;
            int i10 = r52.A06;
            r4.A01 = f2;
            r4.A07 = i10;
            r4.A06 = r52.A05;
            r4.A02 = r52.A02;
            r4.A04 = r52.A04;
            float f3 = r52.A03;
            int i11 = r52.A07;
            r4.A05 = f3;
            r4.A09 = i11;
            r4.A0A = r52.A08;
            A0u2.add(r4.A00());
        }
        return A0u2;
    }

    public long AC3(int i2) {
        return this.A04[i2];
    }

    public int AC4() {
        return this.A04.length;
    }

    public int ADu(long j2) {
        long[] jArr = this.A04;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            binarySearch ^= -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] != j2);
        }
        if (binarySearch >= jArr.length) {
            return -1;
        }
        return binarySearch;
    }
}
