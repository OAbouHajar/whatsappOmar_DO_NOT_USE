package com.google.android.gms.maps.model;

import X.C13930oJ;
import X.C15710ri;
import X.C32251fv;
import X.C92644hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class CameraPosition extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C92644hu();
    public final float A00;
    public final float A01;
    public final float A02;
    public final LatLng A03;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r9 > 90.0f) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CameraPosition(com.google.android.gms.maps.model.LatLng r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = "camera target must not be null."
            X.C13710nw.A02(r7, r0)
            r1 = 1
            r4 = 0
            r3 = 0
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r1[r3] = r0
            java.lang.String r0 = "Tilt needs to be between 0 and 90 inclusive: %s"
            if (r2 == 0) goto L_0x0039
            r6.A03 = r7
            r6.A02 = r8
            float r9 = r9 + r4
            r6.A01 = r9
            double r4 = (double) r10
            r2 = 0
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0035
            float r10 = r10 % r1
            float r10 = r10 + r1
        L_0x0035:
            float r10 = r10 % r1
            r6.A00 = r10
            return
        L_0x0039:
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.model.CameraPosition.<init>(com.google.android.gms.maps.model.LatLng, float, float, float):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CameraPosition) {
                CameraPosition cameraPosition = (CameraPosition) obj;
                if (!(this.A03.equals(cameraPosition.A03) && Float.floatToIntBits(this.A02) == Float.floatToIntBits(cameraPosition.A02) && Float.floatToIntBits(this.A01) == Float.floatToIntBits(cameraPosition.A01) && Float.floatToIntBits(this.A00) == Float.floatToIntBits(cameraPosition.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, Float.valueOf(this.A02), Float.valueOf(this.A01), Float.valueOf(this.A00)});
    }

    public String toString() {
        C13930oJ r2 = new C13930oJ(this);
        r2.A00(this.A03, "target");
        r2.A00(Float.valueOf(this.A02), "zoom");
        r2.A00(Float.valueOf(this.A01), "tilt");
        r2.A00(Float.valueOf(this.A00), "bearing");
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        C32251fv.A09(parcel, this.A03, 2, i2, false);
        C32251fv.A04(parcel, this.A02, 3);
        C32251fv.A04(parcel, this.A01, 4);
        C32251fv.A04(parcel, this.A00, 5);
        C32251fv.A05(parcel, A012);
    }
}
