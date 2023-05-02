package com.google.android.gms.wearable;

import X.AnonymousClass000;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass45A;
import X.C13680ns;
import X.C13690nt;
import X.C15710ri;
import X.C32251fv;
import X.C93224iq;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class ConnectionConfiguration extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C93224iq();
    public String A00;
    public String A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public volatile String A08;
    public volatile boolean A09;

    public ConnectionConfiguration(String str, String str2, String str3, String str4, String str5, int i2, int i3, boolean z2, boolean z3, boolean z4) {
        this.A05 = str;
        this.A06 = str2;
        this.A03 = i2;
        this.A04 = i3;
        this.A07 = z2;
        this.A09 = z3;
        this.A08 = str3;
        this.A02 = z4;
        this.A00 = str4;
        this.A01 = str5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ConnectionConfiguration) {
            ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
            return AnonymousClass45A.A00(this.A05, connectionConfiguration.A05) && AnonymousClass45A.A00(this.A06, connectionConfiguration.A06) && AnonymousClass45A.A00(Integer.valueOf(this.A03), Integer.valueOf(connectionConfiguration.A03)) && AnonymousClass45A.A00(Integer.valueOf(this.A04), Integer.valueOf(connectionConfiguration.A04)) && AnonymousClass45A.A00(Boolean.valueOf(this.A07), Boolean.valueOf(connectionConfiguration.A07)) && AnonymousClass45A.A00(Boolean.valueOf(this.A02), Boolean.valueOf(connectionConfiguration.A02));
        }
    }

    public final int hashCode() {
        Object[] objArr = new Object[6];
        objArr[0] = this.A05;
        objArr[1] = this.A06;
        AnonymousClass3K2.A1W(objArr, this.A03);
        objArr[3] = Integer.valueOf(this.A04);
        objArr[4] = Boolean.valueOf(this.A07);
        return AnonymousClass000.A0F(Boolean.valueOf(this.A02), objArr, 5);
    }

    public final String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.A05);
        A0r.append(AnonymousClass3K3.A0o("Name=", valueOf, valueOf.length()));
        A0r.append(C13680ns.A0g(String.valueOf(this.A06), ", Address="));
        A0r.append(C13680ns.A0i(", Type=", C13690nt.A0g(18), this.A03));
        A0r.append(C13680ns.A0i(", Role=", C13690nt.A0g(18), this.A04));
        boolean z2 = this.A07;
        StringBuilder A0g = C13690nt.A0g(15);
        A0g.append(", Enabled=");
        A0g.append(z2);
        AnonymousClass000.A1I(A0g, A0r);
        boolean z3 = this.A09;
        StringBuilder A0g2 = C13690nt.A0g(19);
        A0g2.append(", IsConnected=");
        A0g2.append(z3);
        AnonymousClass000.A1I(A0g2, A0r);
        A0r.append(C13680ns.A0g(String.valueOf(this.A08), ", PeerNodeId="));
        boolean z4 = this.A02;
        StringBuilder A0g3 = C13690nt.A0g(20);
        A0g3.append(", BtlePriority=");
        A0g3.append(z4);
        AnonymousClass000.A1I(A0g3, A0r);
        A0r.append(C13680ns.A0g(String.valueOf(this.A00), ", NodeId="));
        A0r.append(C13680ns.A0g(String.valueOf(this.A01), ", packagename="));
        return AnonymousClass000.A0h("]", A0r);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        boolean A1R = AnonymousClass3K3.A1R(parcel, "com.whatsapp");
        C32251fv.A0A(parcel, this.A06, 3, A1R);
        C32251fv.A06(parcel, 4, this.A03);
        C32251fv.A06(parcel, 5, this.A04);
        C32251fv.A08(parcel, 6, this.A07);
        C32251fv.A08(parcel, 7, this.A09);
        C32251fv.A0A(parcel, this.A08, 8, A1R);
        C32251fv.A08(parcel, 9, this.A02);
        C32251fv.A0A(parcel, this.A00, 10, A1R);
        C32251fv.A0A(parcel, this.A01, 11, A1R);
        C32251fv.A05(parcel, A002);
    }
}
