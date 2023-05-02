package com.obwhatsapp.location;

import X.AnonymousClass09W;
import X.AnonymousClass1P7;
import X.AnonymousClass2S4;
import X.AnonymousClass2S6;
import X.AnonymousClass3EN;
import X.AnonymousClass4C4;
import X.C04660Nk;
import X.C38751rM;
import X.C38841rV;
import X.C39721sx;
import X.C58002sK;
import X.C95564mq;
import X.C98694sp;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.R;

public class WaMapView extends AnonymousClass2S4 {
    public static C04660Nk A02;
    public static AnonymousClass4C4 A03;
    public AnonymousClass09W A00;
    public AnonymousClass2S6 A01;

    public WaMapView(Context context) {
        super(context);
    }

    public WaMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaMapView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public WaMapView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public void A00(LatLng latLng) {
        String string = getContext().getString(R.string.str0c95);
        AnonymousClass2S6 r1 = this.A01;
        if (r1 != null) {
            r1.A06(new AnonymousClass3EN(latLng, string));
            return;
        }
        AnonymousClass09W r12 = this.A00;
        if (r12 != null) {
            r12.A0G(new C95564mq(latLng, string));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r9.A00 != 0.0d) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(com.google.android.gms.maps.model.LatLng r9, X.C58002sK r10, X.AnonymousClass1P7 r11) {
        /*
            r8 = this;
            double r0 = r9.A01
            r5 = 0
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0010
            double r2 = r9.A00
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r2 = 0
            if (r4 == 0) goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            r8.setVisibility(r5)
            if (r2 == 0) goto L_0x0114
            android.content.Context r2 = r8.getContext()
            boolean r2 = r11.A05(r2)
            if (r2 == 0) goto L_0x00c8
            X.2S6 r0 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            if (r0 != 0) goto L_0x0071
            boolean r0 = r8 instanceof X.C604732i     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            if (r0 == 0) goto L_0x0086
            com.google.android.gms.maps.GoogleMapOptions r2 = new com.google.android.gms.maps.GoogleMapOptions     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r0 = 1
            r2.A00 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2.A0C = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2.A05 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2.A08 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2.A06 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2.A0A = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2.A09 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2.A07 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            X.C438721w.A00(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            X.2S6 r1 = new X.2S6     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r1.<init>(r0, r2)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
        L_0x0052:
            r8.A01 = r1     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            boolean r0 = r11.A00     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            if (r0 != 0) goto L_0x007c
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r1 = 2
            com.facebook.redex.IDxDListenerShape57S0200000_2_I0 r0 = new com.facebook.redex.IDxDListenerShape57S0200000_2_I0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r0.<init>(r11, r1, r8)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2.addOnPreDrawListener(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
        L_0x0065:
            X.2S6 r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r0 = 4
            r1.setVisibility(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            X.2S6 r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r0 = -1
            r8.addView(r1, r0, r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
        L_0x0071:
            X.2S6 r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            X.4so r0 = new X.4so     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r0.<init>(r9, r10, r8)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r1.A06(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            goto L_0x00c2
        L_0x007c:
            r0 = 0
            r1.A04(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            X.2S6 r0 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r0.A03()     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            goto L_0x0065
        L_0x0086:
            com.google.android.gms.maps.GoogleMapOptions r3 = new com.google.android.gms.maps.GoogleMapOptions     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r2 = 1097859072(0x41700000, float:15.0)
            r0 = 0
            com.google.android.gms.maps.model.CameraPosition r1 = new com.google.android.gms.maps.model.CameraPosition     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r1.<init>(r9, r2, r0, r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r0 = 1
            r3.A00 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.A0C = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.A05 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.A08 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.A06 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.A0A = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.A09 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.A07 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.A01 = r1     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r3.A0B = r0     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            X.C438721w.A00(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            X.2S6 r1 = new X.2S6     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            r1.<init>(r0, r3)     // Catch:{ IncompatibleClassChangeError -> 0x00c3 }
            goto L_0x0052
        L_0x00c2:
            return
        L_0x00c3:
            r0 = move-exception
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
            return
        L_0x00c8:
            X.09W r2 = r8.A00
            if (r2 != 0) goto L_0x0109
            double r2 = r9.A00
            X.020 r4 = new X.020
            r4.<init>(r2, r0)
            r2 = 1097859072(0x41700000, float:15.0)
            r1 = 1
            X.0YG r0 = new X.0YG
            r0.<init>(r4, r2, r1, r1)
            X.0P5 r2 = new X.0P5
            r2.<init>()
            r2.A06 = r5
            r2.A03 = r5
            r2.A05 = r5
            r2.A01 = r0
            java.lang.String r0 = "whatsapp_consumer"
            r2.A02 = r0
            android.content.Context r0 = r8.getContext()
            r11.A04(r0)
            android.content.Context r0 = r8.getContext()
            X.2jx r1 = new X.2jx
            r1.<init>(r0, r2)
            r8.A00 = r1
            r0 = 0
            r1.A0E(r0)
            X.09W r1 = r8.A00
            r0 = -1
            r8.addView(r1, r0, r0)
        L_0x0109:
            X.09W r2 = r8.A00
            r1 = 2
            com.facebook.redex.IDxRCallbackShape82S0200000_2_I0 r0 = new com.facebook.redex.IDxRCallbackShape82S0200000_2_I0
            r0.<init>(r9, r1, r8)
            r2.A0G(r0)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.location.WaMapView.A01(com.google.android.gms.maps.model.LatLng, X.2sK, X.1P7):void");
    }

    public void A02(AnonymousClass1P7 r6, C38841rV r7, boolean z2) {
        double d2;
        double d3;
        C39721sx r2;
        if (z2 || (r2 = r7.A02) == null) {
            d2 = r7.A00;
            d3 = r7.A01;
        } else {
            d2 = r2.A00;
            d3 = r2.A01;
        }
        A01(new LatLng(d2, d3), z2 ? null : C58002sK.A03(getContext(), R.raw.expired_map_style_json), r6);
    }

    public void A03(AnonymousClass1P7 r7, C38751rM r8) {
        LatLng latLng = new LatLng(r8.A00, r8.A01);
        A01(latLng, (C58002sK) null, r7);
        A00(latLng);
    }

    public void setupGoogleMap(AnonymousClass2S6 r2, LatLng latLng, C58002sK r4) {
        r2.A06(new C98694sp(r2, latLng, r4, this));
    }
}
