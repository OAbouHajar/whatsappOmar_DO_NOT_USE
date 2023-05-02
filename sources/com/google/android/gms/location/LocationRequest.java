package com.google.android.gms.location;

import X.C15710ri;
import X.C32251fv;
import X.C92634ht;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class LocationRequest extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C92634ht();
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public boolean A07;
    public boolean A08;

    @Deprecated
    public LocationRequest() {
        this.A01 = 102;
        this.A03 = 3600000;
        this.A04 = 600000;
        this.A07 = false;
        this.A05 = Long.MAX_VALUE;
        this.A02 = Integer.MAX_VALUE;
        this.A00 = 0.0f;
        this.A06 = 0;
        this.A08 = false;
    }

    public LocationRequest(float f2, int i2, int i3, long j2, long j3, long j4, long j5, boolean z2, boolean z3) {
        this.A01 = i2;
        this.A03 = j2;
        this.A04 = j3;
        this.A07 = z2;
        this.A05 = j4;
        this.A02 = i3;
        this.A00 = f2;
        this.A06 = j5;
        this.A08 = z3;
    }

    public static void A03(long j2) {
        if (j2 < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.A01 == locationRequest.A01) {
                long j2 = this.A03;
                long j3 = locationRequest.A03;
                if (j2 == j3 && this.A04 == locationRequest.A04 && this.A07 == locationRequest.A07 && this.A05 == locationRequest.A05 && this.A02 == locationRequest.A02 && this.A00 == locationRequest.A00) {
                    long j4 = this.A06;
                    if (j4 >= j2) {
                        j2 = j4;
                    }
                    long j5 = locationRequest.A06;
                    if (j5 >= j3) {
                        j3 = j5;
                    }
                    return j2 == j3 && this.A08 == locationRequest.A08;
                }
            }
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), Long.valueOf(this.A03), Float.valueOf(this.A00), Long.valueOf(this.A06)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request[");
        int i2 = this.A01;
        sb.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (i2 != 105) {
            sb.append(" requested=");
            sb.append(this.A03);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.A04);
        sb.append("ms");
        long j2 = this.A06;
        if (j2 > this.A03) {
            sb.append(" maxWait=");
            sb.append(j2);
            sb.append("ms");
        }
        float f2 = this.A00;
        if (f2 > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(f2);
            sb.append("m");
        }
        long j3 = this.A05;
        if (j3 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j3 - elapsedRealtime);
            sb.append("ms");
        }
        int i3 = this.A02;
        if (i3 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i3);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A06(parcel, 1, this.A01);
        C32251fv.A07(parcel, 2, this.A03);
        C32251fv.A07(parcel, 3, this.A04);
        C32251fv.A08(parcel, 4, this.A07);
        C32251fv.A07(parcel, 5, this.A05);
        C32251fv.A06(parcel, 6, this.A02);
        C32251fv.A04(parcel, this.A00, 7);
        C32251fv.A07(parcel, 8, this.A06);
        C32251fv.A08(parcel, 9, this.A08);
        C32251fv.A05(parcel, A012);
    }
}
