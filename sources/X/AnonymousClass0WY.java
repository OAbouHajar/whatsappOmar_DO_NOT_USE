package X;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.0WY  reason: invalid class name */
public final class AnonymousClass0WY {
    public static final int A00(Cursor cursor, String str) {
        int length;
        if (Build.VERSION.SDK_INT > 25 || (length = str.length()) == 0) {
            return -1;
        }
        String[] columnNames = cursor.getColumnNames();
        C18450wi.A0B(columnNames);
        String A0h = AnonymousClass000.A0h(str, AnonymousClass000.A0r("."));
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(FilenameUtils.EXTENSION_SEPARATOR);
        A0o.append(str);
        A0o.append('`');
        String obj = A0o.toString();
        int length2 = columnNames.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            String str2 = columnNames[i2];
            int i4 = i3 + 1;
            if (str2.length() >= length + 2 && (C008703y.A0M(str2, A0h) || (str2.charAt(0) == '`' && C008703y.A0M(str2, obj)))) {
                return i3;
            }
            i2++;
            i3 = i4;
        }
        return -1;
    }

    public static final int A01(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex(AnonymousClass000.A0i(str, AnonymousClass000.A0r("`"), '`'));
        return columnIndex2 < 0 ? A00(cursor, str) : columnIndex2;
    }

    public static final int A02(Cursor cursor, String str) {
        String str2;
        int A01 = A01(cursor, str);
        if (A01 >= 0) {
            return A01;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C18450wi.A0B(columnNames);
            str2 = C11330iZ.A01(columnNames);
        } catch (Exception e2) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e2);
            str2 = "unknown";
        }
        StringBuilder A0r = AnonymousClass000.A0r("column '");
        A0r.append(str);
        A0r.append("' does not exist. Available columns: ");
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(str2, A0r));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        X.C41191vO.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.database.Cursor A03(android.database.Cursor r11) {
        /*
            r10 = 4
            r9 = 3
            r8 = 2
            r7 = 0
            r6 = 1
            java.lang.String[] r1 = r11.getColumnNames()     // Catch:{ all -> 0x006a }
            int r0 = r11.getCount()     // Catch:{ all -> 0x006a }
            android.database.MatrixCursor r5 = new android.database.MatrixCursor     // Catch:{ all -> 0x006a }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x006a }
        L_0x0012:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0066
            int r0 = r11.getColumnCount()     // Catch:{ all -> 0x006a }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ all -> 0x006a }
            int r3 = r11.getColumnCount()     // Catch:{ all -> 0x006a }
            r2 = 0
        L_0x0023:
            if (r2 >= r3) goto L_0x005c
            int r0 = r11.getType(r2)     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0057
            if (r0 == r6) goto L_0x004c
            if (r0 == r8) goto L_0x0041
            if (r0 == r9) goto L_0x003a
            if (r0 != r10) goto L_0x0060
            byte[] r0 = r11.getBlob(r2)     // Catch:{ all -> 0x006a }
            r4[r2] = r0     // Catch:{ all -> 0x006a }
            goto L_0x0059
        L_0x003a:
            java.lang.String r0 = r11.getString(r2)     // Catch:{ all -> 0x006a }
            r4[r2] = r0     // Catch:{ all -> 0x006a }
            goto L_0x0059
        L_0x0041:
            double r0 = r11.getDouble(r2)     // Catch:{ all -> 0x006a }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x006a }
            r4[r2] = r0     // Catch:{ all -> 0x006a }
            goto L_0x0059
        L_0x004c:
            long r0 = r11.getLong(r2)     // Catch:{ all -> 0x006a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x006a }
            r4[r2] = r0     // Catch:{ all -> 0x006a }
            goto L_0x0059
        L_0x0057:
            r4[r2] = r7     // Catch:{ all -> 0x006a }
        L_0x0059:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x005c:
            r5.addRow(r4)     // Catch:{ all -> 0x006a }
            goto L_0x0012
        L_0x0060:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006a }
            r0.<init>()     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x0066:
            X.C41191vO.A00(r11, r7)
            return r5
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.C41191vO.A00(r11, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WY.A03(android.database.Cursor):android.database.Cursor");
    }
}
