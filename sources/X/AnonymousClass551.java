package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.551  reason: invalid class name */
public final class AnonymousClass551 implements Comparable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final C65583Vi A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public AnonymousClass551(C32491gT r8, C65583Vi r9, int i2) {
        int i3;
        int i4;
        String[] strArr;
        int length;
        int i5;
        this.A09 = r9;
        String str = r8.A0S;
        this.A0A = (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) ? null : str;
        int i6 = 0;
        this.A0D = (i2 & 7) != 4 ? false : true;
        int i7 = 0;
        while (true) {
            C34641kb r1 = r9.A03;
            i3 = Integer.MAX_VALUE;
            if (i7 >= r1.size()) {
                i7 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = C65593Vj.A00(r8, AnonymousClass000.A0n(r1, i7), false);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.A04 = i7;
        this.A05 = i4;
        this.A07 = Integer.bitCount(r8.A0D & r9.A01);
        boolean z2 = true;
        this.A0B = AnonymousClass000.A1O(r8.A0G & 1);
        int i8 = r8.A06;
        this.A01 = i8;
        this.A08 = r8.A0F;
        int i9 = r8.A05;
        this.A00 = i9;
        if ((i9 != -1 && i9 > r9.A00) || (i8 != -1 && i8 > r9.A01)) {
            z2 = false;
        }
        this.A0C = z2;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i10 = AnonymousClass3C1.A01;
        if (i10 >= 24) {
            strArr = AnonymousClass3C1.A0G(configuration);
        } else {
            strArr = new String[1];
            Locale locale = configuration.locale;
            strArr[0] = i10 >= 21 ? AnonymousClass3C1.A09(locale) : locale.toString();
        }
        int i11 = 0;
        while (true) {
            length = strArr.length;
            if (i11 >= length) {
                break;
            }
            strArr[i11] = AnonymousClass3C1.A08(strArr[i11]);
            i11++;
        }
        int i12 = 0;
        while (true) {
            if (i12 < length) {
                i5 = C65593Vj.A00(r8, strArr[i12], false);
                if (i5 > 0) {
                    break;
                }
                i12++;
            } else {
                i12 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
        }
        this.A02 = i12;
        this.A03 = i5;
        while (true) {
            C34641kb r2 = r9.A0E;
            if (i6 < r2.size()) {
                String str2 = r8.A0T;
                if (str2 != null && str2.equals(r2.get(i6))) {
                    i3 = i6;
                    break;
                }
                i6++;
            } else {
                break;
            }
        }
        this.A06 = i3;
    }

    /* renamed from: A00 */
    public int compareTo(AnonymousClass551 r8) {
        AnonymousClass57I r6;
        AnonymousClass57I reverse;
        boolean z2 = this.A0C;
        if (!z2 || !this.A0D) {
            r6 = C65593Vj.A03;
            reverse = r6.reverse();
        } else {
            r6 = C65593Vj.A03;
            reverse = r6;
        }
        C90794ep A002 = AnonymousClass57I.A00(AnonymousClass57I.A00(C90794ep.start().compareFalseFirst(this.A0D, r8.A0D), Integer.valueOf(this.A04), r8.A04).compare(this.A05, r8.A05).compare(this.A07, r8.A07).compareFalseFirst(z2, r8.A0C), Integer.valueOf(this.A06), r8.A06);
        Integer valueOf = Integer.valueOf(this.A00);
        Integer valueOf2 = Integer.valueOf(r8.A00);
        C90794ep compare = AnonymousClass57I.A00(A002.compare(valueOf, valueOf2, this.A09.A0Q ? r6.reverse() : C65593Vj.A04).compareFalseFirst(this.A0B, r8.A0B), Integer.valueOf(this.A02), r8.A02).compare(this.A03, r8.A03).compare(Integer.valueOf(this.A01), Integer.valueOf(r8.A01), reverse).compare(Integer.valueOf(this.A08), Integer.valueOf(r8.A08), reverse);
        if (!AnonymousClass3C1.A0F(this.A0A, r8.A0A)) {
            reverse = C65593Vj.A04;
        }
        return compare.compare(valueOf, valueOf2, reverse).result();
    }
}
