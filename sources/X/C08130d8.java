package X;

import android.database.Cursor;
import com.facebook.redex.IDxIAdapterShape37S0100000_I1;

/* renamed from: X.0d8  reason: invalid class name and case insensitive filesystem */
public final class C08130d8 implements C13130lW {
    public final C02860Fx A00;
    public final AnonymousClass0SM A01;

    public C08130d8(AnonymousClass0SM r3) {
        this.A01 = r3;
        this.A00 = new IDxIAdapterShape37S0100000_I1(r3, this, 1);
    }

    public Long ADF(String str) {
        C07770cR A012 = AnonymousClass0M4.A01("SELECT long_value FROM Preference where `key`=?", str);
        AnonymousClass0SM r0 = this.A01;
        r0.A09();
        Long l2 = null;
        Cursor A002 = AnonymousClass0M5.A00(r0, A012, false);
        try {
            if (A002.moveToFirst() && !A002.isNull(0)) {
                l2 = Long.valueOf(A002.getLong(0));
            }
            return l2;
        } finally {
            A002.close();
            A012.A01();
        }
    }

    public void AIP(AnonymousClass0R4 r3) {
        AnonymousClass0SM r1 = this.A01;
        r1.A09();
        r1.A0A();
        try {
            this.A00.A05(r3);
            r1.A0C();
        } finally {
            r1.A0B();
        }
    }
}
