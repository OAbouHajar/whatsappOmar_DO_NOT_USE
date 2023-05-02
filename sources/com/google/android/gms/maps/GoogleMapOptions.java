package com.google.android.gms.maps;

import X.C13930oJ;
import X.C15710ri;
import X.C32251fv;
import X.C92724i2;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends C15710ri implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C92724i2();
    public int A00 = -1;
    public CameraPosition A01;
    public LatLngBounds A02 = null;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Float A0F = null;
    public Float A0G = null;

    public GoogleMapOptions() {
    }

    public GoogleMapOptions(CameraPosition cameraPosition, LatLngBounds latLngBounds, Float f2, Float f3, byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, byte b12, byte b13, int i2) {
        this.A03 = A04(b2);
        this.A04 = A04(b3);
        this.A00 = i2;
        this.A01 = cameraPosition;
        this.A05 = A04(b4);
        this.A06 = A04(b5);
        this.A07 = A04(b6);
        this.A08 = A04(b7);
        this.A09 = A04(b8);
        this.A0A = A04(b9);
        this.A0B = A04(b10);
        this.A0C = A04(b11);
        this.A0D = A04(b12);
        this.A0F = f2;
        this.A0G = f3;
        this.A02 = latLngBounds;
        this.A0E = A04(b13);
    }

    public static byte A03(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : 1;
        }
        return -1;
    }

    public static Boolean A04(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static void A05(Parcel parcel, byte b2, int i2) {
        parcel.writeInt(i2 | AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        parcel.writeInt(b2);
    }

    public String toString() {
        C13930oJ r2 = new C13930oJ(this);
        r2.A00(Integer.valueOf(this.A00), "MapType");
        r2.A00(this.A0B, "LiteMode");
        r2.A00(this.A01, "Camera");
        r2.A00(this.A06, "CompassEnabled");
        r2.A00(this.A05, "ZoomControlsEnabled");
        r2.A00(this.A07, "ScrollGesturesEnabled");
        r2.A00(this.A08, "ZoomGesturesEnabled");
        r2.A00(this.A09, "TiltGesturesEnabled");
        r2.A00(this.A0A, "RotateGesturesEnabled");
        r2.A00(this.A0E, "ScrollGesturesEnabledDuringRotateOrZoom");
        r2.A00(this.A0C, "MapToolbarEnabled");
        r2.A00(this.A0D, "AmbientEnabled");
        r2.A00(this.A0F, "MinZoomPreference");
        r2.A00(this.A0G, "MaxZoomPreference");
        r2.A00(this.A02, "LatLngBoundsForCameraTarget");
        r2.A00(this.A03, "ZOrderOnTop");
        r2.A00(this.A04, "UseViewLifecycleInFragment");
        return r2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A012 = C32251fv.A01(parcel, 20293);
        A05(parcel, A03(this.A03), 2);
        A05(parcel, A03(this.A04), 3);
        C32251fv.A06(parcel, 4, this.A00);
        C32251fv.A09(parcel, this.A01, 5, i2, false);
        A05(parcel, A03(this.A05), 6);
        A05(parcel, A03(this.A06), 7);
        A05(parcel, A03(this.A07), 8);
        A05(parcel, A03(this.A08), 9);
        A05(parcel, A03(this.A09), 10);
        A05(parcel, A03(this.A0A), 11);
        A05(parcel, A03(this.A0B), 12);
        A05(parcel, A03(this.A0C), 14);
        A05(parcel, A03(this.A0D), 15);
        Float f2 = this.A0F;
        if (f2 != null) {
            parcel.writeInt(262160);
            parcel.writeFloat(f2.floatValue());
        }
        Float f3 = this.A0G;
        if (f3 != null) {
            parcel.writeInt(262161);
            parcel.writeFloat(f3.floatValue());
        }
        C32251fv.A09(parcel, this.A02, 18, i2, false);
        A05(parcel, A03(this.A0E), 19);
        C32251fv.A05(parcel, A012);
    }
}
