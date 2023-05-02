package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.Locale;

/* renamed from: X.15L  reason: invalid class name */
public abstract class AnonymousClass15L {
    public final AnonymousClass11X A00;

    public AnonymousClass15L(AnonymousClass11X r3) {
        this.A00 = r3;
        r3.A02.A02(new C34391kB(this));
    }

    public static long A00(ContentValues contentValues, C16800tf r3, String str) {
        C16810tg r1 = r3.A02;
        A05("ContactProvider/insertOrReplace/INSERT_", str);
        return r1.A03(contentValues, str);
    }

    public static long A01(ContentValues contentValues, C16800tf r3, String str, String str2, String[] strArr) {
        C16810tg r1 = r3.A02;
        A05("ContactProvider/delete/UPDATE_", str);
        return (long) r1.A00(str, contentValues, str2, strArr);
    }

    public static long A02(C16800tf r1, String str, String str2, String[] strArr) {
        C16810tg r12 = r1.A02;
        A05("ContactProvider/delete/DELETE_", str);
        return (long) r12.A01(str, str2, strArr);
    }

    public static Cursor A03(C16800tf r7, String str, String str2, String str3, String str4, String[] strArr, String[] strArr2) {
        C16810tg r2 = r7.A02;
        StringBuilder sb = new StringBuilder("ContactProvider/query/QUERY_");
        sb.append(str4);
        sb.toString();
        return r2.A09(str, strArr, str2, strArr2, (String) null, str3, (String) null);
    }

    public static void A04(ContentValues contentValues, C16800tf r3, String str) {
        C16810tg r1 = r3.A02;
        A05("ContactProvider/insertOrReplace/REPLACE_", str);
        r1.A05(contentValues, str);
    }

    public static void A05(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2.toUpperCase(Locale.ROOT));
        sb.toString();
    }
}
