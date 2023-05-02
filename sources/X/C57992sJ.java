package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2sJ  reason: invalid class name and case insensitive filesystem */
public final class C57992sJ extends C15710ri {
    public static final List A0B = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new C92604hq();
    public long A00;
    public String A01;
    public boolean A02;
    public final LocationRequest A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C57992sJ(LocationRequest locationRequest, String str, String str2, String str3, List list, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = locationRequest;
        this.A06 = list;
        this.A04 = str;
        this.A07 = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A05 = str2;
        this.A0A = z5;
        this.A02 = z6;
        this.A01 = str3;
        this.A00 = j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C57992sJ) {
            C57992sJ r4 = (C57992sJ) obj;
            return AnonymousClass45A.A00(this.A03, r4.A03) && AnonymousClass45A.A00(this.A06, r4.A06) && AnonymousClass45A.A00(this.A04, r4.A04) && this.A07 == r4.A07 && this.A08 == r4.A08 && this.A09 == r4.A09 && AnonymousClass45A.A00(this.A05, r4.A05) && this.A0A == r4.A0A && this.A02 == r4.A02 && AnonymousClass45A.A00(this.A01, r4.A01);
        }
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A03);
        String str = this.A04;
        if (str != null) {
            A0o.append(" tag=");
            A0o.append(str);
        }
        String str2 = this.A05;
        if (str2 != null) {
            A0o.append(" moduleId=");
            A0o.append(str2);
        }
        String str3 = this.A01;
        if (str3 != null) {
            A0o.append(" contextAttributionTag=");
            A0o.append(str3);
        }
        A0o.append(" hideAppOps=");
        A0o.append(this.A07);
        A0o.append(" clients=");
        A0o.append(this.A06);
        A0o.append(" forceCoarseLocation=");
        A0o.append(this.A08);
        if (this.A09) {
            A0o.append(" exemptFromBackgroundThrottle");
        }
        if (this.A0A) {
            A0o.append(" locationSettingsIgnored");
        }
        if (this.A02) {
            A0o.append(" inaccurateLocationsDelayed");
        }
        return A0o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A09(parcel, this.A03, 1, i2, false);
        C32251fv.A0C(parcel, this.A06, 5, false);
        C32251fv.A0A(parcel, this.A04, 6, false);
        C32251fv.A08(parcel, 7, this.A07);
        C32251fv.A08(parcel, 8, this.A08);
        C32251fv.A08(parcel, 9, this.A09);
        C32251fv.A0A(parcel, this.A05, 10, false);
        C32251fv.A08(parcel, 11, this.A0A);
        C32251fv.A08(parcel, 12, this.A02);
        C32251fv.A0A(parcel, this.A01, 13, false);
        C32251fv.A07(parcel, 14, this.A00);
        C32251fv.A05(parcel, A012);
    }
}
