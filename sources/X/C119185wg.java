package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.mod.bomfab.R$styleable;

/* renamed from: X.5wg  reason: invalid class name and case insensitive filesystem */
public class C119185wg {
    public static final C115875qS A0L = new C115875qS(6);
    public static final C115875qS A0M = new C115875qS(5);
    public static final C115875qS A0N = new C115875qS(4);
    public static final C115875qS A0O = new C115875qS(3);
    public static final C115885qT A0P = new C115885qT(9);
    public static final C115885qT A0Q = new C115885qT(10);
    public static final C115885qT A0R = new C115885qT(14);
    public static final C115885qT A0S = new C115885qT(13);
    public static final C115885qT A0T = new C115885qT(17);
    public static final C115885qT A0U = new C115885qT(7);
    public static final C115885qT A0V = new C115885qT(20);
    public static final C115885qT A0W = new C115885qT(11);
    public static final C115885qT A0X = new C115885qT(12);
    public static final C115885qT A0Y = new C115885qT(21);
    public static final C115885qT A0Z = new C115885qT(0);
    public static final C115885qT A0a = new C115885qT(1);
    public static final C115885qT A0b = new C115885qT(8);
    public static final C115885qT A0c = new C115885qT(15);
    public static final C115885qT A0d = new C115885qT(19);
    public static final C115885qT A0e = new C115885qT(18);
    public static final C115885qT A0f = new C115885qT(2);
    public static final C115885qT A0g = new C115885qT(16);
    public final int A00;
    public final int A01;
    public final Bitmap A02;
    public final Rect A03;
    public final Rect A04;
    public final Rect A05;
    public final C118895va A06;
    public final C119185wg A07;
    public final Boolean A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final Long A0H;
    public final Long A0I;
    public final byte[] A0J;
    public final byte[] A0K;

    public C119185wg(C118835vK r2) {
        this.A03 = r2.A01;
        this.A04 = r2.A0K;
        this.A01 = r2.A0J;
        this.A00 = r2.A0I;
        this.A0J = r2.A0G;
        this.A0K = r2.A0H;
        this.A06 = r2.A03;
        this.A05 = r2.A02;
        this.A0H = r2.A0E;
        this.A0D = r2.A0A;
        this.A09 = r2.A06;
        this.A0B = r2.A08;
        this.A0A = r2.A07;
        this.A0I = r2.A0F;
        this.A07 = r2.A04;
        this.A0E = r2.A0B;
        this.A0G = r2.A0D;
        this.A08 = r2.A05;
        this.A0F = r2.A0C;
        this.A0C = r2.A09;
        this.A02 = r2.A00;
    }

    public Object A00(C115885qT r3) {
        int i2 = r3.A00;
        if (i2 == 0) {
            return this.A0J;
        }
        if (i2 == 1) {
            return this.A06;
        }
        if (i2 == 2) {
            return this.A05;
        }
        if (i2 == 3) {
            return this.A04;
        }
        switch (i2) {
            case 7:
                return this.A0H;
            case 8:
                return this.A0D;
            case 9:
                return this.A09;
            case 10:
                return this.A0B;
            case 11:
                return this.A0A;
            case 12:
                return this.A0I;
            case 13:
                return null;
            case 14:
                return this.A07;
            case 15:
                return this.A0E;
            case 16:
                return this.A0G;
            case 17:
                return this.A08;
            case 18:
                return this.A0F;
            case 19:
                return this.A0K;
            case 20:
                return this.A0C;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return this.A02;
            default:
                throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Invalid photo capture result key: "));
        }
    }
}
