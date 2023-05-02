package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.SystemClock;

/* renamed from: X.0tg  reason: invalid class name and case insensitive filesystem */
public class C16810tg {
    public final SQLiteDatabase A00;
    public final C206911f A01;

    public C16810tg(SQLiteDatabase sQLiteDatabase, C206911f r2) {
        this.A00 = sQLiteDatabase;
        this.A01 = r2;
    }

    public int A00(String str, ContentValues contentValues, String str2, String[] strArr) {
        A0D(strArr);
        SystemClock.uptimeMillis();
        return this.A00.update(str, contentValues, str2, strArr);
    }

    public int A01(String str, String str2, String[] strArr) {
        A0D(strArr);
        SystemClock.uptimeMillis();
        return this.A00.delete(str, str2, strArr);
    }

    public long A02(ContentValues contentValues, String str) {
        SystemClock.uptimeMillis();
        return this.A00.insert(str, (String) null, contentValues);
    }

    public long A03(ContentValues contentValues, String str) {
        SystemClock.uptimeMillis();
        return this.A00.insertOrThrow(str, (String) null, contentValues);
    }

    public long A04(ContentValues contentValues, String str) {
        SystemClock.uptimeMillis();
        return this.A00.replace(str, (String) null, contentValues);
    }

    public long A05(ContentValues contentValues, String str) {
        SystemClock.uptimeMillis();
        return this.A00.replaceOrThrow(str, (String) null, contentValues);
    }

    public long A06(ContentValues contentValues, String str, int i2) {
        SystemClock.uptimeMillis();
        return this.A00.insertWithOnConflict(str, (String) null, contentValues, i2);
    }

    public Cursor A07(AnonymousClass024 r3, String str, String[] strArr) {
        CancellationSignal cancellationSignal;
        A0D(strArr);
        SystemClock.uptimeMillis();
        if (r3 != null) {
            try {
                cancellationSignal = (CancellationSignal) r3.A00();
            } catch (Exception e2) {
                e = e2;
                if (e instanceof OperationCanceledException) {
                    e = new AnonymousClass057();
                }
                throw e;
            }
        } else {
            cancellationSignal = null;
        }
        return new AnonymousClass2Pp(this.A00.rawQuery(str, strArr, cancellationSignal));
    }

    public Cursor A08(String str, String[] strArr) {
        A0D(strArr);
        SystemClock.uptimeMillis();
        return this.A00.rawQuery(str, strArr);
    }

    public final Cursor A09(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        A0D(strArr2);
        A0D(strArr2);
        SystemClock.uptimeMillis();
        return this.A00.query(false, str, strArr, str2, strArr2, str3, (String) null, str4, str5);
    }

    public C37281ou A0A(String str) {
        return new C37281ou(this.A00.compileStatement(str));
    }

    public void A0B(String str) {
        SystemClock.uptimeMillis();
        this.A00.execSQL(str);
    }

    public void A0C(String str, Object[] objArr) {
        A0D(objArr);
        SystemClock.uptimeMillis();
        this.A00.execSQL(str, objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r4.length <= 999) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(java.lang.Object[] r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0008
            int r2 = r4.length
            r0 = 999(0x3e7, float:1.4E-42)
            r1 = 0
            if (r2 > r0) goto L_0x0009
        L_0x0008:
            r1 = 1
        L_0x0009:
            java.lang.String r0 = "Too many sql arguments"
            X.AnonymousClass00B.A0B(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16810tg.A0D(java.lang.Object[]):void");
    }
}
