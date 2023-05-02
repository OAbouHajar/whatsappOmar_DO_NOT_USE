package X;

import android.location.Location;
import android.location.LocationListener;
import java.util.List;

/* renamed from: X.21x  reason: invalid class name and case insensitive filesystem */
public class C438821x implements C008003r, LocationListener {
    public C06080Ud A00 = null;
    public final AnonymousClass16R A01;

    public C438821x(AnonymousClass16R r2) {
        this.A01 = r2;
    }

    public C008003r A6l() {
        return new C438821x(this.A01);
    }

    public Location ABN() {
        return this.A01.A01("FbMaps");
    }

    public void Abd(C06080Ud r10, String str) {
        this.A00 = r10;
        this.A01.A05(this, str, 0.0f, 3, 5000, 1000);
    }

    public void AhD() {
        this.A01.A04(this);
    }

    public void onFlushComplete(int i2) {
    }

    public void onLocationChanged(Location location) {
        C06080Ud r1 = this.A00;
        if (r1 != null && C06080Ud.A00(location, r1.A00)) {
            r1.A00 = location;
            C04630Nh r0 = r1.A01;
            if (r0 != null) {
                r0.A00.A0R.invalidate();
            }
        }
    }

    public void onLocationChanged(List list) {
        if (this.A00 != null && list.size() > 1) {
            C06080Ud r2 = this.A00;
            Location location = (Location) list.get(0);
            if (C06080Ud.A00(location, r2.A00)) {
                r2.A00 = location;
                C04630Nh r0 = r2.A01;
                if (r0 != null) {
                    r0.A00.A0R.invalidate();
                }
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }
}
