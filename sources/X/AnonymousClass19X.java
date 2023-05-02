package X;

import android.content.ContentValues;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.19X  reason: invalid class name */
public class AnonymousClass19X {
    public final C16900tq A00;
    public final Map A01 = new ConcurrentHashMap();

    public AnonymousClass19X(C16900tq r2) {
        this.A00 = r2;
    }

    public static final void A00(C16800tf r4, String str, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("lid_row_id", Long.valueOf(j2));
        contentValues.put("display_name", str);
        r4.A02.A06(contentValues, "lid_display_name", 5);
    }
}
