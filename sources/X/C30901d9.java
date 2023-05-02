package X;

import android.database.Cursor;

/* renamed from: X.1d9  reason: invalid class name and case insensitive filesystem */
public abstract class C30901d9 extends C16740tZ {
    public double A00;
    public double A01;
    public int A02;

    public C30901d9(C28381Vw r2, byte b2, long j2) {
        super(r2, b2, j2);
        this.A02 = 1;
        this.A02 = 0;
    }

    public C30901d9(C28381Vw r10, C30901d9 r11, byte b2, long j2, boolean z2) {
        super(r11, r10, b2, j2, z2);
        this.A02 = 1;
        this.A00 = r11.A00;
        this.A01 = r11.A01;
        this.A02 = r11.A02;
    }

    public C16870tm A0F() {
        C16870tm A0F = super.A0F();
        AnonymousClass00B.A06(A0F);
        return A0F;
    }

    public void A12(Cursor cursor) {
        this.A00 = cursor.getDouble(cursor.getColumnIndexOrThrow("latitude"));
        this.A01 = cursor.getDouble(cursor.getColumnIndexOrThrow("longitude"));
        A0F().A03(cursor.getBlob(cursor.getColumnIndexOrThrow("thumbnail")), true);
    }

    public void A13(Cursor cursor, C16040sK r4) {
        this.A00 = cursor.getDouble(cursor.getColumnIndexOrThrow("latitude"));
        this.A01 = cursor.getDouble(cursor.getColumnIndexOrThrow("longitude"));
        this.A02 = cursor.getInt(cursor.getColumnIndexOrThrow("map_download_status"));
    }
}
