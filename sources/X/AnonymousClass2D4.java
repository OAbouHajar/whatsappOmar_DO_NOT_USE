package X;

import android.text.TextUtils;
import com.mod.bomfab.R$styleable;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: X.2D4  reason: invalid class name */
public class AnonymousClass2D4 {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Boolean A07;
    public Boolean A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;

    public AnonymousClass2D4(Boolean bool, Boolean bool2, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A03 = j2;
        this.A02 = j3;
        this.A01 = j4;
        this.A00 = j5;
        this.A06 = j6;
        this.A05 = j7;
        this.A04 = j8;
        this.A0C = l2;
        this.A0I = l3;
        this.A0H = l4;
        this.A0N = l5;
        this.A0M = l6;
        this.A0F = l7;
        this.A0G = l8;
        this.A0B = l9;
        this.A07 = bool;
        this.A09 = l10;
        this.A0E = l11;
        this.A08 = bool2;
        this.A0D = l12;
        this.A0A = l13;
        this.A0L = l14;
        this.A0K = l15;
        this.A0J = l16;
    }

    public static AnonymousClass2D4 A00(String str) {
        String[] split = str.split(",");
        long A012 = AnonymousClass2D6.A01(split, 0);
        long A013 = AnonymousClass2D6.A01(split, 1);
        long A014 = AnonymousClass2D6.A01(split, 2);
        long A015 = AnonymousClass2D6.A01(split, 3);
        long A016 = AnonymousClass2D6.A01(split, 4);
        long A017 = AnonymousClass2D6.A01(split, 5);
        long A018 = AnonymousClass2D6.A01(split, 6);
        Long A042 = AnonymousClass2D6.A04(split, 18);
        Long A043 = AnonymousClass2D6.A04(split, 7);
        Long A044 = AnonymousClass2D6.A04(split, 8);
        Long A045 = AnonymousClass2D6.A04(split, 9);
        Long A046 = AnonymousClass2D6.A04(split, 10);
        Long A047 = AnonymousClass2D6.A04(split, 11);
        Long A048 = AnonymousClass2D6.A04(split, 12);
        Long A049 = AnonymousClass2D6.A04(split, 19);
        return new AnonymousClass2D4(AnonymousClass2D6.A02(split, 13), AnonymousClass2D6.A02(split, 16), A042, A043, A044, A045, A046, A047, A048, A049, AnonymousClass2D6.A04(split, 14), AnonymousClass2D6.A04(split, 15), AnonymousClass2D6.A04(split, 17), AnonymousClass2D6.A04(split, 20), AnonymousClass2D6.A04(split, 21), AnonymousClass2D6.A04(split, 22), AnonymousClass2D6.A04(split, 23), A012, A013, A014, A015, A016, A017, A018);
    }

    public void A01(int i2) {
        switch (i2) {
            case 0:
                this.A03++;
                return;
            case 1:
                this.A02++;
                return;
            case 2:
                this.A01++;
                return;
            case 3:
                this.A00++;
                return;
            case 4:
                this.A06++;
                return;
            case 5:
                this.A05++;
                return;
            case 6:
                this.A04++;
                return;
            case 7:
                this.A0I = Long.valueOf(AnonymousClass2D6.A00(this.A0I, 1));
                return;
            case 8:
                this.A0H = Long.valueOf(AnonymousClass2D6.A00(this.A0H, 1));
                return;
            case 9:
                this.A0N = Long.valueOf(AnonymousClass2D6.A00(this.A0N, 1));
                return;
            case 10:
                this.A0M = Long.valueOf(AnonymousClass2D6.A00(this.A0M, 1));
                return;
            case 11:
                this.A0F = Long.valueOf(AnonymousClass2D6.A00(this.A0F, 1));
                return;
            case 12:
                this.A0G = Long.valueOf(AnonymousClass2D6.A00(this.A0G, 1));
                return;
            default:
                switch (i2) {
                    case 19:
                        this.A0B = Long.valueOf(AnonymousClass2D6.A00(this.A0B, 1));
                        return;
                    case 20:
                        this.A0A = Long.valueOf(AnonymousClass2D6.A00(this.A0A, 1));
                        return;
                    case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                        this.A0L = Long.valueOf(AnonymousClass2D6.A00(this.A0L, 1));
                        return;
                    case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                        this.A0K = Long.valueOf(AnonymousClass2D6.A00(this.A0K, 1));
                        return;
                    case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                        this.A0J = Long.valueOf(AnonymousClass2D6.A00(this.A0J, 1));
                        return;
                    default:
                        StringBuilder sb = new StringBuilder("EngagementRowCount/update - unhandled fieldIdx: ");
                        sb.append(i2);
                        throw new IllegalArgumentException(sb.toString());
                }
        }
    }

    public String toString() {
        return TextUtils.join(",", Arrays.asList(new Serializable[]{Long.valueOf(this.A03), Long.valueOf(this.A02), Long.valueOf(this.A01), Long.valueOf(this.A00), Long.valueOf(this.A06), Long.valueOf(this.A05), Long.valueOf(this.A04), this.A0I, this.A0H, this.A0N, this.A0M, this.A0F, this.A0G, this.A07, this.A09, this.A0E, this.A08, this.A0D, this.A0C, this.A0B, this.A0A, this.A0L, this.A0K, this.A0J}));
    }
}
