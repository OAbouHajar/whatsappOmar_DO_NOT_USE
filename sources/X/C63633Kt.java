package X;

import android.database.Cursor;
import android.database.CursorWrapper;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.3Kt  reason: invalid class name and case insensitive filesystem */
public class C63633Kt extends CursorWrapper {
    public final Map A00 = AnonymousClass000.A0x();

    public C63633Kt(Cursor cursor) {
        super(cursor);
    }

    public int getColumnIndex(String str) {
        Map map = this.A00;
        Number number = (Number) map.get(str);
        if (number != null) {
            return number.intValue();
        }
        int columnIndex = super.getColumnIndex(str);
        map.put(str, Integer.valueOf(columnIndex));
        return columnIndex;
    }

    public int getColumnIndexOrThrow(String str) {
        String str2;
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(getColumnNames());
        } catch (Exception unused) {
            str2 = "";
        }
        StringBuilder A0r = AnonymousClass000.A0r("column '");
        A0r.append(str);
        A0r.append("' does not exist. Available columns: ");
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(str2, A0r));
    }
}
