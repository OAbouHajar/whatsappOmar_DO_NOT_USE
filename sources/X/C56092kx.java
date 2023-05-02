package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.animation.Interpolator;
import com.obwhatsapp.R;

/* renamed from: X.2kx  reason: invalid class name and case insensitive filesystem */
public class C56092kx {
    public static final Interpolator A00 = C04240Lt.A00(0.85f, 0.0f, 0.15f, 1.0f);
    public static final Interpolator A01 = C04240Lt.A00(0.83f, 0.0f, 0.17f, 1.0f);
    public static final AnonymousClass4EI A02 = new C74113ps(false, false);
    public static final String[] A03 = {"👍"};

    public static int A00(AnonymousClass23T r2, String str) {
        AnonymousClass23U r0;
        if (r2 != null) {
            synchronized (r2) {
                r0 = (AnonymousClass23U) r2.A01.get(str);
            }
            if (r0 != null) {
                return r0.A04.size();
            }
        }
        return 0;
    }

    public static C55792kN A01(C55792kN r11) {
        C55792kN r2 = r11;
        String str = r11.A05;
        if (TextUtils.isEmpty(str)) {
            return r2;
        }
        AnonymousClass00B.A06(str);
        return !C37941pz.A02(str) ? new C55792kN(r11.A03, r11.A04, "□", r11.A01, r11.A02, r11.A00) : r2;
    }

    public static String A02(Context context, AnonymousClass013 r2, int i2) {
        return i2 > 999 ? context.getString(R.string.str0cc5) : r2.A0K().format((long) i2);
    }
}
