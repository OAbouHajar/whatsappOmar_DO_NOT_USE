package X;

import android.content.Context;
import com.facebook.redex.IDxSupplierShape284S0100000_I1;

/* renamed from: X.0P2  reason: invalid class name */
public class AnonymousClass0P2 {
    public final Context A00;
    public final AnonymousClass0N8 A01;
    public final AnonymousClass0N9 A02;
    public final AnonymousClass0MZ A03;
    public final AnonymousClass0NA A04;
    public final C12860l5 A05;

    public AnonymousClass0P2(AnonymousClass0OW r3) {
        AnonymousClass0N8 r0;
        AnonymousClass0N9 r02;
        AnonymousClass0NA r03;
        this.A00 = r3.A02;
        C12860l5 r1 = r3.A01;
        if (r1 == null) {
            r1 = new IDxSupplierShape284S0100000_I1(this, 0);
            r3.A01 = r1;
        }
        this.A05 = r1;
        this.A03 = r3.A00;
        synchronized (AnonymousClass0N8.class) {
            r0 = AnonymousClass0N8.A00;
            if (r0 == null) {
                r0 = new AnonymousClass0N8();
                AnonymousClass0N8.A00 = r0;
            }
        }
        this.A01 = r0;
        synchronized (AnonymousClass0N9.class) {
            r02 = AnonymousClass0N9.A00;
            if (r02 == null) {
                r02 = new AnonymousClass0N9();
                AnonymousClass0N9.A00 = r02;
            }
        }
        this.A02 = r02;
        synchronized (AnonymousClass0NA.class) {
            r03 = AnonymousClass0NA.A00;
            if (r03 == null) {
                r03 = new AnonymousClass0NA();
                AnonymousClass0NA.A00 = r03;
            }
        }
        this.A04 = r03;
    }
}
