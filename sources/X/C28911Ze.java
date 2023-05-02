package X;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.MotionEventCompat;
import android.util.SparseIntArray;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Ze  reason: invalid class name and case insensitive filesystem */
public class C28911Ze {
    public static final SparseIntArray A03;
    public static final AnonymousClass00O A04 = new AnonymousClass00O(1);
    public static final Object A05 = new Object();
    public final C33161i8 A00;
    public final C33141i6 A01;
    public final Locale A02;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(45);
        A03 = sparseIntArray;
        sparseIntArray.put(2, 5);
        sparseIntArray.put(3, 5);
        sparseIntArray.put(4, 5);
        sparseIntArray.put(242, 240);
        sparseIntArray.put(237, 239);
        sparseIntArray.put(243, 241);
        sparseIntArray.put(238, 241);
        sparseIntArray.put(240, 235);
        sparseIntArray.put(239, 233);
        sparseIntArray.put(241, 236);
        sparseIntArray.put(197, 183);
        sparseIntArray.put(195, 181);
        sparseIntArray.put(199, 185);
        sparseIntArray.put(200, 186);
        sparseIntArray.put(198, 184);
        sparseIntArray.put(194, 180);
        sparseIntArray.put(196, 182);
        sparseIntArray.put(204, 190);
        sparseIntArray.put(202, 188);
        sparseIntArray.put(206, 192);
        sparseIntArray.put(207, 193);
        sparseIntArray.put(205, 191);
        sparseIntArray.put(201, 187);
        sparseIntArray.put(203, 189);
        sparseIntArray.put(260, 248);
        sparseIntArray.put(259, 247);
        sparseIntArray.put(263, 251);
        sparseIntArray.put(256, 244);
        sparseIntArray.put(264, 252);
        sparseIntArray.put(262, 250);
        sparseIntArray.put(261, 249);
        sparseIntArray.put(257, 245);
        sparseIntArray.put(267, MotionEventCompat.ACTION_MASK);
        sparseIntArray.put(266, 254);
        sparseIntArray.put(265, 253);
        sparseIntArray.put(258, 246);
        sparseIntArray.put(292, 293);
        sparseIntArray.put(284, 285);
        sparseIntArray.put(290, 291);
        sparseIntArray.put(273, 274);
        sparseIntArray.put(276, 278);
        sparseIntArray.put(281, 283);
        sparseIntArray.put(287, 288);
        sparseIntArray.put(277, 278);
        sparseIntArray.put(282, 283);
    }

    public C28911Ze(Context context, Resources resources, Locale locale) {
        C33161i8 r1;
        C33201iC r0;
        if (AnonymousClass1WH.A06(locale) == null || (r1 = A00(context, resources, locale)) == null || (r0 = r1.A00) == null || r0.A02.size() == 0) {
            locale = Locale.US;
            r1 = A00(context, resources, locale);
        }
        this.A00 = r1;
        this.A01 = C33141i6.A00(locale);
        this.A02 = locale;
    }

    public static C33161i8 A00(Context context, Resources resources, Locale locale) {
        String A052 = AnonymousClass1WH.A05(locale);
        Object obj = A05;
        synchronized (obj) {
            AnonymousClass00O r2 = A04;
            int A032 = r2.A03(A052);
            if (A032 >= 0) {
                C33161i8 r0 = (C33161i8) r2.A02[(A032 << 1) + 1];
                return r0;
            }
            C33161i8 A002 = AnonymousClass1UQ.A00(context, resources, "cldr_strings", locale, true);
            synchronized (obj) {
                r2.put(A052, A002);
            }
            return A002;
        }
    }

    @Deprecated
    public static String A01(Context context, Locale locale, int i2) {
        Resources resources = context.getResources();
        C33161i8 A002 = A00(context, resources, locale);
        if (A002 != null || (A002 = A00(context, resources, Locale.US)) != null) {
            return A02(A002, i2);
        }
        Log.e("CldrResources/getString: CLDR data not loaded");
        return "";
    }

    public static String A02(C33161i8 r4, int i2) {
        ConcurrentHashMap concurrentHashMap = r4.A02;
        Integer valueOf = Integer.valueOf(i2);
        String str = (String) concurrentHashMap.get(valueOf);
        if (str == null) {
            C33201iC r0 = r4.A00;
            if (r0 == null || (str = r0.A02(i2)) == null) {
                int i3 = A03.get(i2, -1);
                if (i3 != -1) {
                    return A02(r4, i3);
                }
                Log.e(String.format(Locale.US, "CldrResources/getString error: could not find CLDR string for id=%d", new Object[]{valueOf}));
                return "";
            }
            concurrentHashMap.put(valueOf, str);
        }
        return str;
    }

    public String A03(int i2) {
        C33161i8 r0 = this.A00;
        if (r0 != null) {
            return A02(r0, i2);
        }
        Log.e("CldrResources/getString: CLDR data not loaded");
        return "";
    }

    public String A04(Object obj, int i2) {
        String format;
        C33161i8 r1 = this.A00;
        if (r1 == null) {
            format = "translations/getQuantityString: CLDR data not loaded";
        } else {
            String A002 = r1.A00(this.A01, obj, i2);
            if (A002 != null) {
                return A002;
            }
            int i3 = A03.get(i2, -1);
            if (i3 != -1) {
                return A04(obj, i3);
            }
            format = String.format(Locale.US, "CldrResources/getQuantityString error: could not find CLDR string for id=%d", new Object[]{Integer.valueOf(i2)});
        }
        Log.e(format);
        return "";
    }
}
