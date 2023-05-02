package X;

import android.graphics.Point;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.29U  reason: invalid class name */
public class AnonymousClass29U {
    public C06540Wn A00;
    public AnonymousClass39T A01;

    public AnonymousClass29U(C06540Wn r4) {
        this.A00 = r4;
        r4.A04(new AnonymousClass020(0.0d, 0.0d));
    }

    public AnonymousClass29U(AnonymousClass39T r4) {
        this.A01 = r4;
        r4.A00(new LatLng(0.0d, 0.0d));
    }

    public Point A00(LatLng latLng) {
        AnonymousClass39T r0 = this.A01;
        return r0 != null ? r0.A00(latLng) : this.A00.A04(new AnonymousClass020(latLng.A00, latLng.A01));
    }
}
