package X;

import android.util.Log;
import com.mod.bomfab.R$styleable;

/* renamed from: X.4co  reason: invalid class name and case insensitive filesystem */
public final class C89734co {
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    public static int A00(int i2) {
        if (i2 == 2) {
            return 10;
        }
        if (i2 == 5) {
            return 11;
        }
        if (i2 == 29) {
            return 12;
        }
        if (i2 == 42) {
            return 16;
        }
        if (i2 != 22) {
            return i2 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public static AnonymousClass4JS A01(C90204dh r9, boolean z2) {
        int i2;
        int i3;
        int i4;
        int A04 = r9.A04(5);
        if (A04 == 31) {
            A04 = r9.A04(6) + 32;
        }
        int A042 = r9.A04(4);
        if (A042 == 15) {
            i3 = r9.A04(24);
        } else if (A042 < 13) {
            i3 = A01[A042];
        } else {
            throw new AnonymousClass40M();
        }
        int A043 = r9.A04(4);
        String A0c = C13680ns.A0c(i2, "mp4a.40.");
        if (i2 == 5 || i2 == 29) {
            int A044 = r9.A04(4);
            if (A044 == 15) {
                i4 = r9.A04(24);
            } else if (A044 < 13) {
                i4 = A01[A044];
            } else {
                throw new AnonymousClass40M();
            }
            i2 = r9.A04(5);
            if (i2 == 31) {
                i2 = r9.A04(6) + 32;
            }
            if (i2 == 22) {
                A043 = r9.A04(4);
            }
        }
        if (z2) {
            if (!(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7 || i2 == 17)) {
                switch (i2) {
                    case 19:
                    case 20:
                    case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                    case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                    case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                        break;
                    default:
                        throw AnonymousClass40M.A00(C13680ns.A0c(i2, "Unsupported audio object type: "));
                }
            }
            if (r9.A0C()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (r9.A0C()) {
                r9.A08(14);
            }
            boolean A0C = r9.A0C();
            if (A043 != 0) {
                if (i2 == 6 || i2 == 20) {
                    r9.A08(3);
                }
                if (A0C) {
                    if (i2 == 22) {
                        r9.A08(16);
                    } else if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                        r9.A08(3);
                    }
                    r9.A08(1);
                }
                switch (i2) {
                    case 17:
                    case 19:
                    case 20:
                    case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                    case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                    case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                        int A045 = r9.A04(2);
                        if (A045 == 2 || A045 == 3) {
                            throw AnonymousClass40M.A00(C13680ns.A0c(A045, "Unsupported epConfig: "));
                        }
                }
            } else {
                throw C13680ns.A0m();
            }
        }
        int i5 = A00[A043];
        if (i5 != -1) {
            return new AnonymousClass4JS(i4, A0c, i5);
        }
        throw new AnonymousClass40M();
    }
}
