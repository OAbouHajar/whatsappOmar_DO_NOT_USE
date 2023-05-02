package X;

import java.util.Locale;

/* renamed from: X.0X1  reason: invalid class name */
public class AnonymousClass0X1 {
    public static C13370lv A00 = C08790eL.A00;

    public static void A00(Class cls, Object obj, Object obj2, Object obj3, String str) {
        if (A00.AJ7(2)) {
            Object[] objArr = new Object[3];
            AnonymousClass000.A1E(obj, obj2, objArr);
            objArr[2] = obj3;
            String format = String.format((Locale) null, str, objArr);
            C13370lv r1 = A00;
            if (r1.AJ7(2)) {
                r1.Ahh(cls.getSimpleName(), format);
            }
        }
    }

    public static void A01(Class cls, Object obj, Object obj2, String str) {
        C13370lv r3 = A00;
        if (r3.AJ7(2)) {
            String simpleName = cls.getSimpleName();
            Object[] objArr = new Object[2];
            AnonymousClass000.A1E(obj, obj2, objArr);
            r3.Ahh(simpleName, String.format((Locale) null, str, objArr));
        }
    }

    public static void A02(Class cls, Object obj, String str) {
        C13370lv r3 = A00;
        if (r3.AJ7(2)) {
            r3.Ahh(cls.getSimpleName(), String.format((Locale) null, str, AnonymousClass000.A1a(obj)));
        }
    }

    public static void A03(String str, String str2, Object... objArr) {
        C13370lv r1 = A00;
        if (r1.AJ7(5)) {
            r1.Ai1(str, String.format((Locale) null, str2, objArr));
        }
    }

    public static void A04(String str, String str2, Object... objArr) {
        C13370lv r1 = A00;
        if (r1.AJ7(6)) {
            r1.AiK(str, String.format((Locale) null, str2, objArr));
        }
    }
}
