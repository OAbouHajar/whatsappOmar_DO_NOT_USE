package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.4Vc  reason: invalid class name and case insensitive filesystem */
public final class C87034Vc {
    public final LatLng A00;
    public final AnonymousClass1US A01;

    public C87034Vc(LatLng latLng, AnonymousClass1US r2) {
        this.A01 = r2;
        this.A00 = latLng;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87034Vc) {
                C87034Vc r5 = (C87034Vc) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K3.A0H(this.A01) + AnonymousClass000.A0C(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("BottomSheetData(minifiedBusinessProfile=");
        A0r.append(this.A01);
        A0r.append(", userLocation=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }
}
