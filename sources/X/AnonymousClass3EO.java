package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.3EO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EO implements AnonymousClass5OF {
    public final /* synthetic */ AnonymousClass2S6 A00;
    public final /* synthetic */ LatLng A01;
    public final /* synthetic */ C58002sK A02;
    public final /* synthetic */ C604732i A03;

    public /* synthetic */ AnonymousClass3EO(AnonymousClass2S6 r1, LatLng latLng, C58002sK r3, C604732i r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = latLng;
        this.A00 = r1;
    }

    public static LatLng A00(LatLng latLng, double d2, double d3) {
        double d4 = d2 / 6371009.0d;
        double radians = Math.toRadians(d3);
        double radians2 = Math.toRadians(latLng.A00);
        double radians3 = Math.toRadians(latLng.A01);
        double cos = Math.cos(d4);
        double sin = Math.sin(d4);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATK(X.AnonymousClass2NT r26) {
        /*
            r25 = this;
            r1 = r25
            X.32i r0 = r1.A03
            r23 = r0
            X.2sK r2 = r1.A02
            com.google.android.gms.maps.model.LatLng r6 = r1.A01
            X.2S6 r5 = r1.A00
            android.content.Context r0 = r23.getContext()
            boolean r0 = X.C434920f.A09(r0)
            if (r0 == 0) goto L_0x0061
            android.content.Context r1 = r23.getContext()
            r0 = 2131820558(0x7f11000e, float:1.9273834E38)
            X.2sK r0 = X.C58002sK.A03(r1, r0)
        L_0x0021:
            if (r2 != 0) goto L_0x0024
            r2 = r0
        L_0x0024:
            r24 = r26
            r0 = r24
            r0.A0J(r2)
            android.content.res.Resources r1 = r23.getResources()
            r0 = 2131166476(0x7f07050c, float:1.7947198E38)
            int r2 = r1.getDimensionPixelSize(r0)
            int r1 = r2 << 1
            r3 = 0
            r0 = r24
            r0.A08(r3, r1, r2, r2)
            java.lang.String r0 = "location must not be null."
            X.C13710nw.A02(r6, r0)
            r2 = 1097859072(0x41700000, float:15.0)
            r1 = 0
            com.google.android.gms.maps.model.CameraPosition r0 = new com.google.android.gms.maps.model.CameraPosition
            r0.<init>(r6, r2, r1, r1)
            X.2R9 r1 = X.AnonymousClass2R8.A00(r0)
            r0 = r24
            r0.A0A(r1)
            X.AnonymousClass00B.A04(r5)
            r5.setVisibility(r3)
            r0 = r23
            X.4Se r0 = r0.A00
            if (r0 == 0) goto L_0x0077
            goto L_0x0063
        L_0x0061:
            r0 = 0
            goto L_0x0021
        L_0x0063:
            X.5U0 r2 = r0.A00     // Catch:{ RemoteException -> 0x0070 }
            X.1e1 r2 = (X.C31361e1) r2     // Catch:{ RemoteException -> 0x0070 }
            android.os.Parcel r1 = r2.A01()     // Catch:{ RemoteException -> 0x0070 }
            r0 = 1
            r2.A03(r0, r1)     // Catch:{ RemoteException -> 0x0070 }
            goto L_0x0077
        L_0x0070:
            r1 = move-exception
            X.5Ab r0 = new X.5Ab
            r0.<init>(r1)
            throw r0
        L_0x0077:
            r0 = r23
            java.lang.Integer r0 = r0.A01
            if (r0 == 0) goto L_0x028f
            int r0 = r0.intValue()
            double r8 = (double) r0
            double r3 = r6.A00
            double r1 = r6.A01
            int r0 = r5.getWidth()
            int r11 = r0 << 1
            int r0 = r5.getHeight()
            int r10 = r0 << 1
            android.content.Context r5 = r23.getContext()
            if (r11 <= 0) goto L_0x0281
            if (r10 <= 0) goto L_0x0281
            X.3Y0 r7 = new X.3Y0
            r7.<init>()
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r3, r1)
            r7.A05 = r0
            r0 = 1086324736(0x40c00000, float:6.0)
            r7.A01 = r0
            r0 = 2131099791(0x7f06008f, float:1.7811945E38)
            int r0 = X.AnonymousClass00T.A00(r5, r0)
            r7.A04 = r0
            r0 = 2131099790(0x7f06008e, float:1.7811943E38)
            int r0 = X.AnonymousClass00T.A00(r5, r0)
            r7.A03 = r0
            r7.A00 = r8
            r0 = r24
            com.google.android.gms.maps.internal.IGoogleMapDelegate r6 = r0.A01     // Catch:{ RemoteException -> 0x027a }
            X.1e1 r6 = (X.C31361e1) r6     // Catch:{ RemoteException -> 0x027a }
            android.os.Parcel r5 = r6.A01()     // Catch:{ RemoteException -> 0x027a }
            X.C90334dy.A01(r5, r7)     // Catch:{ RemoteException -> 0x027a }
            r0 = 35
            android.os.Parcel r7 = r6.A02(r0, r5)     // Catch:{ RemoteException -> 0x027a }
            android.os.IBinder r6 = r7.readStrongBinder()     // Catch:{ RemoteException -> 0x027a }
            if (r6 != 0) goto L_0x00d9
            r5 = 0
            goto L_0x00e5
        L_0x00d9:
            java.lang.String r0 = "com.google.android.gms.maps.model.internal.ICircleDelegate"
            android.os.IInterface r5 = r6.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x027a }
            boolean r0 = r5 instanceof X.AnonymousClass5U0     // Catch:{ RemoteException -> 0x027a }
            if (r0 == 0) goto L_0x00f0
            X.5U0 r5 = (X.AnonymousClass5U0) r5     // Catch:{ RemoteException -> 0x027a }
        L_0x00e5:
            r7.recycle()     // Catch:{ RemoteException -> 0x027a }
            X.4Se r22 = new X.4Se     // Catch:{ RemoteException -> 0x027a }
            r0 = r22
            r0.<init>(r5)     // Catch:{ RemoteException -> 0x027a }
            goto L_0x00f6
        L_0x00f0:
            X.3aA r5 = new X.3aA     // Catch:{ RemoteException -> 0x027a }
            r5.<init>(r6)     // Catch:{ RemoteException -> 0x027a }
            goto L_0x00e5
        L_0x00f6:
            int r21 = java.lang.Math.min(r11, r10)
            com.google.android.gms.maps.model.LatLng r15 = new com.google.android.gms.maps.model.LatLng
            r15.<init>(r3, r1)
            r6 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r0 = 0
            com.google.android.gms.maps.model.LatLng r10 = A00(r15, r8, r0)
            java.lang.String r20 = "point must not be null"
            r0 = r20
            X.C13710nw.A02(r10, r0)
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            double r2 = r10.A00
            double r13 = java.lang.Math.min(r0, r2)
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r2 = java.lang.Math.max(r0, r2)
            double r0 = r10.A01
            boolean r10 = java.lang.Double.isNaN(r6)
            if (r10 == 0) goto L_0x022a
            r6 = r0
        L_0x0127:
            r4 = r0
        L_0x0128:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            com.google.android.gms.maps.model.LatLng r12 = A00(r15, r8, r0)
            r0 = r20
            X.C13710nw.A02(r12, r0)
            double r0 = r12.A00
            double r10 = java.lang.Math.min(r13, r0)
            double r2 = java.lang.Math.max(r2, r0)
            double r0 = r12.A01
            boolean r12 = java.lang.Double.isNaN(r6)
            if (r12 == 0) goto L_0x01fe
            r6 = r0
        L_0x0149:
            r4 = r0
        L_0x014a:
            r0 = 4640537203540230144(0x4066800000000000, double:180.0)
            com.google.android.gms.maps.model.LatLng r12 = A00(r15, r8, r0)
            r0 = r20
            X.C13710nw.A02(r12, r0)
            double r0 = r12.A00
            double r10 = java.lang.Math.min(r10, r0)
            double r2 = java.lang.Math.max(r2, r0)
            double r0 = r12.A01
            boolean r12 = java.lang.Double.isNaN(r6)
            if (r12 == 0) goto L_0x01d2
            r6 = r0
        L_0x016b:
            r4 = r0
        L_0x016c:
            r0 = 4643457506423603200(0x4070e00000000000, double:270.0)
            com.google.android.gms.maps.model.LatLng r12 = A00(r15, r8, r0)
            r0 = r20
            X.C13710nw.A02(r12, r0)
            double r0 = r12.A00
            double r8 = java.lang.Math.min(r10, r0)
            double r1 = java.lang.Math.max(r2, r0)
            double r10 = r12.A01
            boolean r0 = java.lang.Double.isNaN(r6)
            if (r0 == 0) goto L_0x01aa
            r6 = r10
        L_0x018d:
            r4 = r10
        L_0x018e:
            boolean r0 = java.lang.Double.isNaN(r6)
            r3 = r0 ^ 1
            java.lang.String r0 = "no included points"
            X.C13710nw.A04(r0, r3)
            com.google.android.gms.maps.model.LatLng r3 = new com.google.android.gms.maps.model.LatLng
            r3.<init>(r8, r6)
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r1, r4)
            com.google.android.gms.maps.model.LatLngBounds r4 = new com.google.android.gms.maps.model.LatLngBounds
            r4.<init>(r3, r0)
            goto L_0x024a
        L_0x01aa:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r3 > 0) goto L_0x01cb
            if (r0 > 0) goto L_0x01b6
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x018e
        L_0x01b6:
            double r16 = r6 - r10
            r14 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r16 = r16 + r14
            double r16 = r16 % r14
            double r12 = r10 - r4
            double r12 = r12 + r14
            double r12 = r12 % r14
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x018d
            r6 = r10
            goto L_0x018e
        L_0x01cb:
            if (r0 <= 0) goto L_0x018e
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x01b6
            goto L_0x018e
        L_0x01d2:
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x01f6
            if (r12 > 0) goto L_0x01de
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x016c
        L_0x01de:
            double r18 = r6 - r0
            r16 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r18 = r18 + r16
            double r18 = r18 % r16
            double r13 = r0 - r4
            double r13 = r13 + r16
            double r13 = r13 % r16
            int r12 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x016b
            r6 = r0
            goto L_0x016c
        L_0x01f6:
            if (r12 <= 0) goto L_0x016c
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x01de
            goto L_0x016c
        L_0x01fe:
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x0222
            if (r12 > 0) goto L_0x020a
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x014a
        L_0x020a:
            double r18 = r6 - r0
            r16 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r18 = r18 + r16
            double r18 = r18 % r16
            double r13 = r0 - r4
            double r13 = r13 + r16
            double r13 = r13 % r16
            int r12 = (r18 > r13 ? 1 : (r18 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x0149
            r6 = r0
            goto L_0x014a
        L_0x0222:
            if (r12 <= 0) goto L_0x014a
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 > 0) goto L_0x020a
            goto L_0x014a
        L_0x022a:
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0128
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0128
            double r18 = r6 - r0
            r16 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r18 = r18 + r16
            double r18 = r18 % r16
            double r11 = r0 - r6
            double r11 = r11 + r16
            double r11 = r11 % r16
            int r10 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x0127
            r6 = r0
            goto L_0x0128
        L_0x024a:
            com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate r3 = X.AnonymousClass2R8.A00     // Catch:{ RemoteException -> 0x0273 }
            java.lang.String r0 = "CameraUpdateFactory is not initialized"
            X.C13710nw.A02(r3, r0)     // Catch:{ RemoteException -> 0x0273 }
            X.1e1 r3 = (X.C31361e1) r3     // Catch:{ RemoteException -> 0x0273 }
            r2 = 50
            android.os.Parcel r1 = r3.A01()     // Catch:{ RemoteException -> 0x0273 }
            X.C90334dy.A01(r1, r4)     // Catch:{ RemoteException -> 0x0273 }
            r0 = r21
            r1.writeInt(r0)     // Catch:{ RemoteException -> 0x0273 }
            r1.writeInt(r0)     // Catch:{ RemoteException -> 0x0273 }
            r1.writeInt(r2)     // Catch:{ RemoteException -> 0x0273 }
            r0 = 11
            com.google.android.gms.dynamic.IObjectWrapper r0 = X.C31361e1.A00(r1, r3, r0)     // Catch:{ RemoteException -> 0x0273 }
            X.2R9 r1 = new X.2R9     // Catch:{ RemoteException -> 0x0273 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0273 }
            goto L_0x0284
        L_0x0273:
            r1 = move-exception
            X.5Ab r0 = new X.5Ab
            r0.<init>(r1)
            throw r0
        L_0x027a:
            r1 = move-exception
            X.5Ab r0 = new X.5Ab
            r0.<init>(r1)
            throw r0
        L_0x0281:
            r22 = 0
            goto L_0x0289
        L_0x0284:
            r0 = r24
            r0.A0A(r1)
        L_0x0289:
            r1 = r22
            r0 = r23
            r0.A00 = r1
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3EO.ATK(X.2NT):void");
    }
}
