package X;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: X.399  reason: invalid class name */
public class AnonymousClass399 {
    public C62913Fk A00;
    public C59732yr A01;
    public final C50592a6 A02;
    public final C18110wA A03;

    public AnonymousClass399(C50592a6 r1, C18110wA r2) {
        this.A03 = r2;
        this.A02 = r1;
    }

    public synchronized void A00() {
        C59732yr r0 = this.A01;
        if (!(r0 == null || r0.A06.A03() == 2 || C16690tT.A02(this.A01.A06))) {
            this.A01.A06.A06(true);
            this.A01 = null;
        }
    }

    public void A01(LatLng latLng, C30321cA r13, String str, String str2, float f2) {
        LatLng latLng2 = latLng;
        ArrayList A012 = C89564cS.A01(latLng.A00, latLng.A01, 10);
        AnonymousClass00B.A06(A012);
        LatLng A022 = C15710ri.A02(C89564cS.A02(10, C13690nt.A0A(A012, 0), C13690nt.A0A(A012, 1)));
        synchronized (this) {
            A00();
            C62913Fk r4 = new C62913Fk(latLng2, r13, this, str, str2, f2);
            this.A00 = r4;
            C59732yr A76 = this.A02.A76(A022, r4, this.A03.A00, 256);
            A76.A04();
            this.A01 = A76;
        }
    }
}
