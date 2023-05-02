package X;

import android.database.AbstractCursor;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.0tt  reason: invalid class name and case insensitive filesystem */
public class C16930tt extends AbstractCursor {
    public static final String[] A06 = C818449y.A00;
    public int A00 = -1;
    public Cursor A01;
    public boolean A02 = false;
    public final C16460t6 A03;
    public final C14710pd A04;
    public final C15830rv A05;

    public C16930tt(Cursor cursor, C16460t6 r5, C14710pd r6, C15830rv r7) {
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = cursor;
        this.A05 = r7;
        if (r6 != null) {
            this.A02 = !C41971wz.A0B(r6.A06(C16620tM.A02, 2917));
        }
        moveToPosition(0);
    }

    public C16730tY A00() {
        C15830rv r2 = this.A05;
        C16460t6 r0 = this.A03;
        Cursor cursor = this.A01;
        return (C16730tY) (r2 == null ? r0.A0K.A01(cursor) : r0.A0G(cursor, r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r0 = r3.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01() {
        /*
            r3 = this;
            X.0tY r2 = r3.A00()
            if (r2 == 0) goto L_0x0047
            X.0ta r1 = r2.A02
            if (r1 == 0) goto L_0x0047
            X.1Vw r0 = r2.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0014
            boolean r0 = r1.A0P
            if (r0 == 0) goto L_0x0032
        L_0x0014:
            java.io.File r0 = r1.A0F
            if (r0 == 0) goto L_0x0032
            android.net.Uri r1 = android.net.Uri.fromFile(r0)
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r1.getPath()
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
        L_0x0031:
            return r1
        L_0x0032:
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0047
            boolean r0 = r2 instanceof X.C38711rI
            if (r0 == 0) goto L_0x0047
            X.0pd r0 = r3.A04
            if (r0 == 0) goto L_0x0047
            X.1rK r2 = (X.C38731rK) r2
            boolean r0 = X.AnonymousClass20C.A02(r0, r2)
            r1 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0047:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16930tt.A01():boolean");
    }

    public void close() {
        super.close();
        this.A01.close();
    }

    public String[] getColumnNames() {
        return A06;
    }

    public int getCount() {
        int i2 = this.A00;
        return i2 < 0 ? this.A01.getCount() : i2;
    }

    public double getDouble(int i2) {
        return 0.0d;
    }

    public float getFloat(int i2) {
        return 0.0f;
    }

    public int getInt(int i2) {
        return 0;
    }

    public long getLong(int i2) {
        if (i2 == 0) {
            Cursor cursor = this.A01;
            return cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        } else if (i2 == 2) {
            C16730tY A002 = A00();
            AnonymousClass00B.A06(A002);
            return A002.A0I;
        } else if (i2 != 6) {
            return 0;
        } else {
            C16730tY A003 = A00();
            AnonymousClass00B.A06(A003);
            return (long) A003.A00;
        }
    }

    public short getShort(int i2) {
        if (i2 != 5) {
            return 0;
        }
        C16730tY A002 = A00();
        AnonymousClass00B.A06(A002);
        return (short) A002.A10;
    }

    public String getString(int i2) {
        C16750ta r0;
        File file;
        if (i2 == 0) {
            Cursor cursor = this.A01;
            return Long.toString(cursor.getLong(cursor.getColumnIndexOrThrow("_id")));
        } else if (i2 == 1) {
            C16730tY A002 = A00();
            return (A002 == null || (r0 = A002.A02) == null || (file = r0.A0F) == null) ? "" : file.getAbsolutePath();
        } else if (i2 == 2) {
            C16730tY A003 = A00();
            return A003 != null ? Long.toString(A003.A0I) : "";
        } else if (i2 == 3) {
            C16730tY A004 = A00();
            AnonymousClass00B.A06(A004);
            return A004.A13();
        } else if (i2 != 4) {
            return "";
        } else {
            C16730tY A005 = A00();
            AnonymousClass00B.A06(A005);
            byte b2 = A005.A10;
            if (b2 == 1) {
                return "image/*";
            }
            if (b2 == 2) {
                return "audio/*";
            }
            if (b2 == 3) {
                return "video/*";
            }
            if (b2 != 9) {
                if (b2 == 13) {
                    return "image/gif";
                }
                if (b2 == 23 || b2 == 37 || b2 == 25) {
                    return "image/*";
                }
                if (b2 != 26) {
                    return b2 != 28 ? b2 != 29 ? "" : "image/gif" : "video/*";
                }
            }
            return A005.A06;
        }
    }

    public int getType(int i2) {
        return (i2 == 0 || i2 == 2 || i2 == 5 || i2 == 6) ? 1 : 3;
    }

    public boolean isNull(int i2) {
        return false;
    }

    public boolean onMove(int i2, int i3) {
        String str;
        if (i2 > (i3 << 1)) {
            this.A01.moveToPosition(-1);
            i2 = -1;
        }
        while (true) {
            if (i3 > i2) {
                boolean z2 = false;
                int i4 = 0;
                while (true) {
                    if (!this.A01.moveToNext()) {
                        break;
                    } else if (A01()) {
                        z2 = true;
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 > 0) {
                    StringBuilder sb = new StringBuilder("mediacursor/next/skip ");
                    sb.append(i4);
                    Log.i(sb.toString());
                }
                i2++;
                if (!z2) {
                    this.A00 = i2;
                    this.A01.moveToPosition(-1);
                    StringBuilder sb2 = new StringBuilder("mediacursor/next/realcount ");
                    sb2.append(this.A00);
                    str = sb2.toString();
                    break;
                }
            } else {
                while (i3 < i2) {
                    boolean z3 = false;
                    int i5 = 0;
                    while (true) {
                        if (!this.A01.moveToPrevious()) {
                            break;
                        } else if (A01()) {
                            z3 = true;
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i5 > 0) {
                        StringBuilder sb3 = new StringBuilder("mediacursor/prev/skip ");
                        sb3.append(i5);
                        Log.i(sb3.toString());
                    }
                    if (!z3) {
                        this.A01.moveToPosition(-1);
                        str = "mediacursor/prev/notfound";
                    } else {
                        i2--;
                    }
                }
                return true;
            }
        }
        Log.i(str);
        onChange(true);
        return false;
    }
}
