package X;

import android.database.Cursor;

/* renamed from: X.2dg  reason: invalid class name and case insensitive filesystem */
public class C52362dg {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final byte[] A09;

    public C52362dg(String str, String str2, String str3, String str4, String str5, byte[] bArr, int i2, int i3, long j2, long j3) {
        this.A01 = i2;
        this.A02 = j2;
        this.A00 = i3;
        this.A09 = bArr;
        this.A05 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A06 = str4;
        this.A08 = str5;
        this.A03 = j3;
    }

    public static C52362dg A00(Cursor cursor) {
        String string = cursor.isNull(cursor.getColumnIndexOrThrow("local_path")) ? cursor.getString(cursor.getColumnIndexOrThrow("local_path")) : null;
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("sync_type"));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("file_size"));
        return new C52362dg(string, cursor.getString(cursor.getColumnIndexOrThrow("media_hash")), cursor.getString(cursor.getColumnIndexOrThrow("direct_path")), cursor.getString(cursor.getColumnIndexOrThrow("media_enc_hash")), cursor.getString(cursor.getColumnIndexOrThrow("message_id")), cursor.getBlob(cursor.getColumnIndexOrThrow("media_key")), i2, cursor.getInt(cursor.getColumnIndexOrThrow("chunk_order")), j2, cursor.getLong(cursor.getColumnIndexOrThrow("start_time")));
    }
}
