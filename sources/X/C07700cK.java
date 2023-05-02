package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0cK  reason: invalid class name and case insensitive filesystem */
public final class C07700cK implements C13620mg {
    public static final String[] A02 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] A03 = new String[0];
    public final SQLiteDatabase A00;
    public final List A01;

    public C07700cK(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
        this.A01 = sQLiteDatabase.getAttachedDbs();
    }

    public static /* synthetic */ Cursor A00(SQLiteCursorDriver sQLiteCursorDriver, SQLiteQuery sQLiteQuery, C11350id r2, String str) {
        return (Cursor) r2.A01(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public final boolean A01(SQLiteDatabase sQLiteDatabase) {
        return C18450wi.A0R(this.A00, sQLiteDatabase);
    }

    public C13500mT A6T(String str) {
        C18450wi.A0H(str, 0);
        SQLiteStatement compileStatement = this.A00.compileStatement(str);
        C18450wi.A0B(compileStatement);
        return new AnonymousClass0GC(compileStatement);
    }

    public void A8n(String str) {
        C18450wi.A0H(str, 0);
        this.A00.execSQL(str);
    }

    public Cursor AbE(C13040lN r6) {
        Cursor rawQueryWithFactory = this.A00.rawQueryWithFactory(new C06730Xl(new C11350id(r6)), r6.AGC(), A03, (String) null);
        C18450wi.A0B(rawQueryWithFactory);
        return rawQueryWithFactory;
    }

    public Cursor AbF(String str) {
        C18450wi.A0H(str, 0);
        return AbE(new C07780cS(str));
    }

    public int AhK(ContentValues contentValues, String str, String str2, Object[] objArr, int i2) {
        String str3;
        long j2;
        int byteValue;
        double doubleValue;
        int i3 = 0;
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            int length = objArr.length + size;
            Object[] objArr2 = new Object[length];
            StringBuilder A0r = AnonymousClass000.A0r("UPDATE ");
            A0r.append(A02[3]);
            A0r.append("WorkSpec");
            A0r.append(" SET ");
            Iterator<String> it = contentValues.keySet().iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                A0r.append(i3 > 0 ? "," : "");
                A0r.append(A0m);
                objArr2[i3] = contentValues.get(A0m);
                A0r.append("=?");
                i3++;
            }
            for (int i4 = size; i4 < length; i4++) {
                objArr2[i4] = objArr[i4 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                A0r.append(" WHERE ");
                A0r.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            String obj = A0r.toString();
            C18450wi.A0B(obj);
            C13500mT A6T = A6T(obj);
            int i5 = 0;
            while (i5 < length) {
                Object obj2 = objArr2[i5];
                i5++;
                if (obj2 == null) {
                    A6T.A5R(i5);
                } else if (obj2 instanceof byte[]) {
                    A6T.A5N(i5, (byte[]) obj2);
                } else {
                    if (obj2 instanceof Float) {
                        doubleValue = (double) AnonymousClass000.A04(obj2);
                    } else if (obj2 instanceof Double) {
                        doubleValue = ((Number) obj2).doubleValue();
                    } else {
                        if (obj2 instanceof Long) {
                            j2 = ((Number) obj2).longValue();
                        } else {
                            if (obj2 instanceof Integer) {
                                byteValue = AnonymousClass000.A0D(obj2);
                            } else if (obj2 instanceof Short) {
                                byteValue = ((Number) obj2).shortValue();
                            } else if (obj2 instanceof Byte) {
                                byteValue = ((Number) obj2).byteValue();
                            } else if (obj2 instanceof String) {
                                A6T.A5S(i5, (String) obj2);
                            } else if (obj2 instanceof Boolean) {
                                j2 = AnonymousClass000.A1X(obj2) ? 1 : 0;
                            } else {
                                StringBuilder A0r2 = AnonymousClass000.A0r("Cannot bind ");
                                A0r2.append(obj2);
                                A0r2.append(" at index ");
                                A0r2.append(i5);
                                str3 = AnonymousClass000.A0h(" Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String", A0r2);
                            }
                            j2 = (long) byteValue;
                        }
                        A6T.A5Q(i5, j2);
                    }
                    A6T.A5P(i5, doubleValue);
                }
            }
            return ((AnonymousClass0GC) A6T).A00.executeUpdateDelete();
        }
        str3 = "Empty values";
        throw AnonymousClass000.A0T(str3);
    }

    public void close() {
        this.A00.close();
    }
}
