package X;

import android.support.v4.view.MotionEventCompat;
import android.util.SparseArray;

/* renamed from: X.1Zg  reason: invalid class name and case insensitive filesystem */
public abstract class C28931Zg {
    public static final AnonymousClass00O A00;

    static {
        AnonymousClass00O r3 = new AnonymousClass00O(1);
        A00 = r3;
        SparseArray sparseArray = new SparseArray(2);
        sparseArray.append(1, new String[]{"januarja", "februarja", "marca", "aprila", "maja", "junija", "julija", "avgusta", "septembra", "oktobra", "novembra", "decembra"});
        sparseArray.append(2, new String[]{"januarjem", "februarjem", "marcem", "aprilom", "majem", "junijem", "julijem", "avgustom", "septembrom", "oktobrom", "novembrom", "decembrom"});
        r3.put("sl", sparseArray);
    }

    public static String[] A00(AnonymousClass013 r3) {
        return new String[]{r3.A08(260), r3.A08(259), r3.A08(263), r3.A08(256), r3.A08(264), r3.A08(262), r3.A08(261), r3.A08(257), r3.A08(267), r3.A08(266), r3.A08(265), r3.A08(258)};
    }

    public static String[] A01(AnonymousClass013 r3, int i2) {
        String[] strArr;
        SparseArray sparseArray = (SparseArray) A00.get(r3.A06());
        if (sparseArray != null && (strArr = (String[]) sparseArray.get(i2)) != null) {
            return strArr;
        }
        return new String[]{r3.A08(248), r3.A08(247), r3.A08(251), r3.A08(244), r3.A08(252), r3.A08(250), r3.A08(249), r3.A08(245), r3.A08(MotionEventCompat.ACTION_MASK), r3.A08(254), r3.A08(253), r3.A08(246)};
    }
}
