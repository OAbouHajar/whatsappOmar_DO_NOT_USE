package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.3ln  reason: invalid class name and case insensitive filesystem */
public class C72243ln extends C31301dt {
    public String A00;
    public boolean A01 = true;
    public boolean A02 = true;
    public final int A03;
    public final LatLng A04;
    public final AnonymousClass5Rh A05;
    public final AnonymousClass5P4 A06;
    public final AnonymousClass5T6 A07;
    public final AnonymousClass1US A08;
    public final boolean A09;
    public final boolean A0A;

    public C72243ln(LatLng latLng, AnonymousClass5Rh r3, AnonymousClass5P4 r4, AnonymousClass5T6 r5, AnonymousClass1US r6, int i2, boolean z2, boolean z3) {
        super(AnonymousClass428.A02);
        this.A03 = i2;
        this.A09 = z2;
        this.A08 = r6;
        this.A04 = latLng;
        this.A05 = r3;
        this.A0A = z3;
        this.A06 = r4;
        this.A07 = r5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A08.equals(((C72243ln) obj).A08);
    }

    public int hashCode() {
        return this.A08.hashCode();
    }

    public String toString() {
        return this.A08.toString();
    }
}
