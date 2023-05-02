package X;

import android.location.Address;
import android.location.Geocoder;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.Me;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0wG  reason: invalid class name and case insensitive filesystem */
public final class C18170wG {
    public final C16300so A00;
    public final C16040sK A01;
    public final C17180uf A02;
    public final C16980tz A03;
    public final C17120uZ A04;
    public final AnonymousClass013 A05;
    public final C18160wF A06;

    public C18170wG(C16300so r2, C16040sK r3, C17180uf r4, C16980tz r5, C17120uZ r6, AnonymousClass013 r7, C18160wF r8) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r2, 2);
        C18450wi.A0H(r5, 3);
        C18450wi.A0H(r7, 4);
        C18450wi.A0H(r8, 5);
        C18450wi.A0H(r4, 6);
        C18450wi.A0H(r6, 7);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = r4;
        this.A04 = r6;
    }

    public AnonymousClass26B A00() {
        String A012 = A01();
        String A022 = this.A06.A02(this.A05, A012);
        if (A022 == null) {
            StringBuilder sb = new StringBuilder("Localized name for country code ");
            sb.append(A012);
            sb.append(" is null!");
            Log.e(sb.toString());
        }
        return new AnonymousClass26B((Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, A022, A012, "country_default");
    }

    public final String A01() {
        C16040sK r0 = this.A01;
        r0.A0B();
        Me me = r0.A00;
        if (me == null) {
            this.A00.AcB("directory_country_code_resolve_error", "Me object from MeManager is null", false);
        } else {
            String A012 = C18160wF.A01(me.cc, me.number);
            C18450wi.A0B(A012);
            if (!A012.equals("ZZ")) {
                return A012;
            }
        }
        return "XX";
    }

    public boolean A02(LatLng latLng) {
        String str;
        HashSet hashSet;
        if (latLng != null) {
            try {
                List<Address> fromLocation = new Geocoder(this.A03.A00, AnonymousClass013.A00(this.A05.A00)).getFromLocation(latLng.A00, latLng.A01, 1);
                if (fromLocation != null && !fromLocation.isEmpty()) {
                    str = fromLocation.get(0).getCountryCode();
                }
            } catch (Exception e2) {
                Log.w("SearchLocationUtil/geoLocateCountryCodeFromLatLng/failed", e2);
            }
            str = null;
        } else {
            str = A01();
        }
        String A062 = this.A02.A02.A06(C16620tM.A02, 2246);
        if (A062 == null || A062.isEmpty()) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet();
            for (String add : A062.split(":")) {
                hashSet.add(add);
            }
        }
        return hashSet.contains(str);
    }
}
