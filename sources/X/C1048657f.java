package X;

import android.database.Cursor;
import java.io.Closeable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57f  reason: invalid class name and case insensitive filesystem */
public class C1048657f implements Iterator, Closeable {
    public final Cursor A00;
    public final AnonymousClass5PV A01;

    public C1048657f(Cursor cursor, AnonymousClass5PV r3) {
        this.A00 = new C63633Kt(cursor);
        this.A01 = r3;
    }

    public void close() {
        this.A00.close();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1.isAfterLast() != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
            r2 = this;
            android.database.Cursor r1 = r2.A00
            boolean r0 = r1.isLast()
            if (r0 != 0) goto L_0x000f
            boolean r1 = r1.isAfterLast()
            r0 = 0
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1048657f.hasNext():boolean");
    }

    public Object next() {
        Cursor cursor = this.A00;
        if (cursor.moveToNext()) {
            return this.A01.AaB(cursor);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw C13680ns.A0m();
    }
}
