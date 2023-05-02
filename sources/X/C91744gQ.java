package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: X.4gQ  reason: invalid class name and case insensitive filesystem */
public class C91744gQ implements LocationListener {
    public final /* synthetic */ AnonymousClass1WN A00;
    public final /* synthetic */ C19410yO A01;

    public C91744gQ(AnonymousClass1WN r1, C19410yO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            StringBuilder A0r = AnonymousClass000.A0r("CompanionDevice/location/changed ");
            A0r.append(location.getTime());
            A0r.append(" ");
            A0r.append(location.getAccuracy());
            C13680ns.A1V(A0r);
            C19410yO r3 = this.A01;
            C13700nu.A0X(r3.A0N, this, this.A00, location, 25);
            r3.A06.A04(this);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
