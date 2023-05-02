package X;

import android.database.Cursor;
import com.whatsapp.util.Log;

/* renamed from: X.46T  reason: invalid class name */
public class AnonymousClass46T {
    public static Integer A00(AnonymousClass01V r1, C16260sj r2) {
        int A03 = r2.A03("android.permission.READ_CONTACTS");
        Integer num = null;
        if (A03 != 0) {
            Log.i("phonebook/getCount/permission_denied");
        } else {
            Cursor A00 = AnonymousClass286.A00(r1, "phonebook/get_count/");
            if (A00 != null) {
                try {
                    num = Integer.valueOf(A00.getCount());
                } catch (Throwable unused) {
                }
            }
            if (A00 != null) {
                A00.close();
                return num;
            }
        }
        return num;
        throw th;
    }
}
