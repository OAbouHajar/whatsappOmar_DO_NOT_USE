package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseIntArray;
import com.obwhatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;

/* renamed from: X.3CH  reason: invalid class name */
public class AnonymousClass3CH implements LocationListener {
    public long A00;
    public Location A01;
    public Location A02;
    public PowerManager.WakeLock A03;
    public final SparseIntArray A04 = new SparseIntArray();
    public final AnonymousClass16R A05;
    public final C210812s A06;
    public final AnonymousClass1HW A07;
    public final AnonymousClass01V A08;
    public final C16440t3 A09;
    public final C15860rz A0A;
    public final C454828w A0B;

    public AnonymousClass3CH(AnonymousClass16R r2, C210812s r3, AnonymousClass1HW r4, AnonymousClass01V r5, C16440t3 r6, C15860rz r7, C454828w r8) {
        this.A09 = r6;
        this.A08 = r5;
        this.A0A = r7;
        this.A06 = r3;
        this.A05 = r2;
        this.A07 = r4;
        this.A0B = r8;
    }

    public final void A00() {
        long j2 = this.A00;
        if (j2 != 0) {
            int A092 = (int) C13690nt.A09(j2 - (j2 % 3600000));
            SparseIntArray sparseIntArray = this.A04;
            sparseIntArray.put(A092, sparseIntArray.get(A092, 0) + ((int) (System.currentTimeMillis() - j2)));
            StringBuilder A0o = AnonymousClass000.A0o();
            for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
                int keyAt = sparseIntArray.keyAt(i2);
                int i3 = sparseIntArray.get(keyAt);
                if (i2 != 0) {
                    A0o.append(";");
                }
                A0o.append(keyAt);
                A0o.append(",");
                A0o.append(i3);
            }
            C15860rz r0 = this.A0A;
            C13680ns.A0y(r0.A0K(), "location_shared_duration", A0o.toString());
            this.A00 = 0;
        }
    }

    public final void A01(Location location) {
        String str;
        this.A02 = location;
        LocationSharingService locationSharingService = (LocationSharingService) this.A0B;
        if (locationSharingService.A0I) {
            locationSharingService.A08.A0N(location);
        }
        long A002 = locationSharingService.A05.A00();
        long j2 = locationSharingService.A00;
        if (A002 > j2) {
            str = C13680ns.A0j(AnonymousClass000.A0r("LocationSharingService/onLocationUpdate/stop this service since passed maxEndTime; maxEndTime="), j2);
        } else if (!locationSharingService.A08.A0a()) {
            str = "LocationSharingService/onLocationUpdate/stop this service, no longer sharing live location";
        } else if (locationSharingService.A0H) {
            locationSharingService.A08.A0N(location);
            if (!locationSharingService.A08.A0b()) {
                locationSharingService.A08.A0H();
                return;
            }
            return;
        } else {
            return;
        }
        Log.i(str);
        locationSharingService.A0H = false;
        locationSharingService.A02();
    }

    public void onLocationChanged(Location location) {
        Log.i("MyLocationUpdater/onLocationChanged");
        if (AnonymousClass1GE.A01(location, this.A02)) {
            A01(location);
            this.A01 = location;
            return;
        }
        if (location.getAccuracy() < 80.0f) {
            this.A01 = location;
        }
        if (this.A01 != null && this.A02.getTime() + 40000 < this.A01.getTime()) {
            A01(this.A01);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
