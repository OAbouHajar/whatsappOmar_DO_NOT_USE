package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1tZ  reason: invalid class name and case insensitive filesystem */
public class C40101tZ {
    public static C28331Vq A00(Cursor cursor) {
        UserJid nullable = UserJid.getNullable(cursor.getString(1));
        if (nullable == null) {
            return null;
        }
        long j2 = cursor.getLong(2);
        String string = cursor.getString(3);
        String string2 = cursor.getString(5);
        int i2 = cursor.getInt(9);
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 0;
                }
            }
        }
        return new C28331Vq(nullable, new C40111ta(AnonymousClass4Y1.A01(cursor.getString(12)), cursor.getLong(14), AnonymousClass4Y1.A00(cursor.getString(13))), string, string2, i3, cursor.getInt(11), j2);
    }
}
