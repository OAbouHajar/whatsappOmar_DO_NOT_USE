package X;

import android.database.Cursor;

/* renamed from: X.28B  reason: invalid class name */
public class AnonymousClass28B {
    public int A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final String A04;

    public AnonymousClass28B(int i2, String str, long j2) {
        this.A04 = str;
        this.A03 = 0;
        this.A02 = i2;
        this.A01 = j2;
    }

    public AnonymousClass28B(String str, int i2, int i3, int i4, long j2) {
        this.A04 = str;
        this.A03 = i2;
        this.A00 = i3;
        this.A02 = i4;
        this.A01 = j2;
    }

    public static AnonymousClass28B A00(Cursor cursor) {
        return new AnonymousClass28B(cursor.getString(cursor.getColumnIndexOrThrow("file_key")), cursor.getInt(cursor.getColumnIndexOrThrow("rmr_source")), cursor.getInt(cursor.getColumnIndexOrThrow("failure_count")), cursor.getInt(cursor.getColumnIndexOrThrow("response_device_id")), cursor.getLong(cursor.getColumnIndexOrThrow("last_fetch_timestamp")));
    }
}
