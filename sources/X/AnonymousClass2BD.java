package X;

import android.database.ContentObserver;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2BD  reason: invalid class name */
public class AnonymousClass2BD implements AnonymousClass2BC {
    public int A00 = 0;
    public C16930tt A01;
    public final C16460t6 A02;
    public final C16480t8 A03;
    public final C15830rv A04;
    public final C25791Ld A05;
    public final Map A06 = new HashMap();

    public AnonymousClass2BD(C16460t6 r2, C16480t8 r3, C15830rv r4, C25791Ld r5) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }

    public Cursor A00() {
        C16480t8 r8 = this.A03;
        C15830rv r7 = this.A04;
        AnonymousClass00B.A06(r7);
        StringBuilder sb = new StringBuilder("mediamsgstore/getMediaMessagesCursor:");
        sb.append(r7);
        Log.i(sb.toString());
        C16800tf A012 = r8.A0B.get();
        try {
            Cursor A08 = A012.A02.A08(C42951yy.A06, new String[]{String.valueOf(r8.A05.A02(r7))});
            A012.close();
            return A08;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: A01 */
    public AnonymousClass2BE ADR(int i2) {
        AnonymousClass2BE r1;
        Map map = this.A06;
        Integer valueOf = Integer.valueOf(i2);
        AnonymousClass2BE r12 = (AnonymousClass2BE) map.get(valueOf);
        if (this.A01 == null || r12 != null) {
            return r12;
        }
        synchronized (this) {
            if (this.A01.moveToPosition(i2)) {
                C16730tY A002 = this.A01.A00();
                AnonymousClass00B.A06(A002);
                r1 = AnonymousClass3A5.A00(A002, this.A05);
                map.put(valueOf, r1);
            } else {
                r1 = null;
            }
        }
        return r1;
    }

    public void A02() {
        if (this.A01 == null) {
            this.A01 = new C16930tt(A00(), this.A02, (C14710pd) null, this.A04);
        }
    }

    public HashMap AAC() {
        return new HashMap();
    }

    public void AcE() {
        C16930tt r2 = this.A01;
        if (r2 != null) {
            Cursor A002 = A00();
            r2.A01.close();
            r2.A01 = A002;
            r2.A00 = -1;
            r2.moveToPosition(-1);
        }
        this.A06.clear();
        this.A00 = 0;
    }

    public void close() {
        C16930tt r0 = this.A01;
        if (r0 != null) {
            r0.close();
        }
    }

    public int getCount() {
        C16930tt r0 = this.A01;
        if (r0 == null) {
            return 0;
        }
        return r0.getCount() - this.A00;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        C16930tt r0 = this.A01;
        if (r0 != null) {
            r0.registerContentObserver(contentObserver);
        }
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        C16930tt r0 = this.A01;
        if (r0 != null) {
            r0.unregisterContentObserver(contentObserver);
        }
    }
}
