package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* renamed from: X.0Vr  reason: invalid class name and case insensitive filesystem */
public class C06410Vr {
    public static final List A00 = AnonymousClass000.A0u();
    public static volatile C13370lv A01 = C08780eK.A01;

    static {
        ((C08780eK) A01).A00 = 5;
        AnonymousClass0X1.A00 = A01;
    }

    public static void A00(Object obj, String str) {
        if (A01.AJ7(4)) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(str, obj);
            if (A01.AJ7(4)) {
                A01.AHr("OpticE2EConfig", formatStrLocaleSafe);
            }
        }
    }

    public static void A01(Throwable th, Object... objArr) {
        if (A01.AJ7(6)) {
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s hit fixed orientation exception", objArr);
            if (A01.AJ7(6)) {
                A01.AiL("FixedOrientationCompat", formatStrLocaleSafe, th);
            }
        }
    }
}
