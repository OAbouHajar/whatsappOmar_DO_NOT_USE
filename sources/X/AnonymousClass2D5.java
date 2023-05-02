package X;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.2D5  reason: invalid class name */
public class AnonymousClass2D5 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public AnonymousClass2D5(Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, boolean z2, boolean z3, boolean z4) {
        this.A06 = l2;
        this.A07 = z2;
        this.A09 = z3;
        this.A03 = l3;
        this.A08 = z4;
        this.A05 = l4;
        this.A04 = l5;
        this.A02 = l6;
        this.A01 = l7;
        this.A00 = l8;
    }

    public static AnonymousClass2D5 A00(String str) {
        boolean z2;
        boolean z3;
        String[] split = str.split(",");
        Long A042 = AnonymousClass2D6.A04(split, 0);
        int length = split.length;
        if (length > 1) {
            z2 = Boolean.parseBoolean(split[1]);
            if (length > 2) {
                z3 = Boolean.parseBoolean(split[2]);
            }
            z3 = false;
        } else {
            z2 = false;
            z3 = false;
        }
        return new AnonymousClass2D5(A042, AnonymousClass2D6.A04(split, 3), AnonymousClass2D6.A04(split, 5), AnonymousClass2D6.A04(split, 6), AnonymousClass2D6.A04(split, 7), AnonymousClass2D6.A04(split, 8), AnonymousClass2D6.A04(split, 9), z2, z3, length > 4 ? Boolean.parseBoolean(split[4]) : false);
    }

    public String toString() {
        return TextUtils.join(",", Arrays.asList(new Serializable[]{this.A06, Boolean.valueOf(this.A07), Boolean.valueOf(this.A09), this.A03, Boolean.valueOf(this.A08), this.A05, this.A04, this.A02, this.A01, this.A00}));
    }
}
