package com.facebook.redex;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

public class IDxEListenerShape385S0100000_1_I0 implements SensorEventListener {
    public Object A00;
    public final int A01;

    public IDxEListenerShape385S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0251, code lost:
        if (r5 != 3) goto L_0x0253;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0132, code lost:
        if (r3 != 3) goto L_0x0134;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A01
            r7 = r19
            if (r0 == 0) goto L_0x016e
            java.lang.Object r4 = r1.A00
            X.2jz r4 = (X.C55582jz) r4
            X.2NT r0 = r4.A08
            if (r0 == 0) goto L_0x0283
            android.location.Location r0 = r4.A06
            if (r0 == 0) goto L_0x0283
            r8 = 0
            r5 = 3
            float[] r1 = r4.A0F     // Catch:{ IllegalArgumentException -> 0x001e }
            float[] r0 = r7.values     // Catch:{ IllegalArgumentException -> 0x001e }
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r0)     // Catch:{ IllegalArgumentException -> 0x001e }
            goto L_0x002d
        L_0x001e:
            float[] r2 = r7.values
            int r0 = r2.length
            if (r0 <= r5) goto L_0x002d
            float[] r1 = r4.A0E
            java.lang.System.arraycopy(r2, r8, r1, r8, r5)
            float[] r0 = r4.A0F
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1)
        L_0x002d:
            android.view.Display r0 = r4.A07
            int r3 = r0.getRotation()
            long r6 = java.lang.System.currentTimeMillis()
            android.location.Location r0 = r4.A06
            long r0 = r0.getTime()
            long r6 = r6 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            r11 = 0
            r10 = 2
            r9 = 1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x011d
            android.location.Location r0 = r4.A06
            boolean r0 = r0.hasBearing()
            if (r0 == 0) goto L_0x011d
            android.location.Location r0 = r4.A06
            float r0 = r0.getSpeed()
            double r0 = (double) r0
            r6 = 4606228376254955242(0x3fec9c4da9003eea, double:0.89408)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x011d
            android.location.Location r0 = r4.A06
            float r2 = r0.getBearing()
        L_0x0065:
            float r12 = r4.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r4.A04
            long r0 = r7 - r5
            float r5 = (float) r0
            r0 = 1137180672(0x43c80000, float:400.0)
            float r5 = r5 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x007b
            r5 = 1065353216(0x3f800000, float:1.0)
        L_0x007b:
            r4.A04 = r7
            float r6 = r2 - r12
            float r1 = java.lang.Math.abs(r6)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f9
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            float r5 = r5 * r6
            float r2 = r12 + r5
        L_0x0092:
            r4.A00 = r2
            if (r3 == 0) goto L_0x00f4
            if (r3 == r10) goto L_0x00f4
            float[] r0 = r4.A0G
            r0 = r0[r10]
        L_0x009c:
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            double r1 = java.lang.Math.abs(r0)
            float r0 = (float) r1
            r4.A02 = r0
            int r0 = r4.A03
            if (r0 != 0) goto L_0x0283
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0283
            android.location.Location r0 = r4.A06
            double r2 = r0.getLatitude()
            android.location.Location r0 = r4.A06
            double r0 = r0.getLongitude()
            com.google.android.gms.maps.model.LatLng r6 = new com.google.android.gms.maps.model.LatLng
            r6.<init>(r2, r0)
            float r5 = r4.A00
            double r0 = (double) r5
            com.google.android.gms.maps.model.LatLng r3 = X.C55582jz.A00(r6, r0)
            float r1 = r4.A02
            r0 = 1116143616(0x42870000, float:67.5)
            float r0 = java.lang.Math.min(r1, r0)
            float r2 = java.lang.Math.max(r0, r11)
            float r1 = r4.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r1 = java.lang.Math.max(r1, r0)
            java.lang.String r0 = "location must not be null."
            X.C13710nw.A02(r3, r0)
            com.google.android.gms.maps.model.CameraPosition r0 = new com.google.android.gms.maps.model.CameraPosition
            r0.<init>(r3, r1, r2, r5)
            r4.A0A = r9
            X.2NT r2 = r4.A08
            X.2R9 r1 = X.AnonymousClass2R8.A00(r0)
            X.5RJ r0 = r4.A0D
            r2.A0B(r1, r0)
            return
        L_0x00f4:
            float[] r0 = r4.A0G
            r0 = r0[r9]
            goto L_0x009c
        L_0x00f9:
            r13 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = (double) r1
            double r13 = r13 - r0
            r6 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r0 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0092
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0116
            float r2 = r2 + r1
            float r2 = r2 - r12
            float r2 = r2 % r1
            float r5 = r5 * r2
            float r12 = r12 + r5
        L_0x0111:
            float r12 = r12 + r1
            float r2 = r12 % r1
            goto L_0x0092
        L_0x0116:
            float r0 = r1 - r2
            float r0 = r0 + r12
            float r0 = r0 % r1
            float r5 = r5 * r0
            float r12 = r12 - r5
            goto L_0x0111
        L_0x011d:
            float[] r1 = r4.A0F
            float[] r0 = r4.A0G
            android.hardware.SensorManager.getOrientation(r1, r0)
            r0 = r0[r8]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r2 = (float) r0
            if (r3 == r9) goto L_0x016a
            if (r3 == r10) goto L_0x0167
            r0 = 1132920832(0x43870000, float:270.0)
            if (r3 == r5) goto L_0x016c
        L_0x0134:
            r5 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x013b
            float r2 = r2 + r5
        L_0x013b:
            android.location.Location r0 = r4.A06
            double r0 = r0.getLatitude()
            float r13 = (float) r0
            android.location.Location r0 = r4.A06
            double r0 = r0.getLongitude()
            float r14 = (float) r0
            android.location.Location r0 = r4.A06
            double r0 = r0.getAltitude()
            float r15 = (float) r0
            android.location.Location r0 = r4.A06
            long r16 = r0.getTime()
            android.hardware.GeomagneticField r12 = new android.hardware.GeomagneticField
            r12.<init>(r13, r14, r15, r16)
            float r0 = r12.getDeclination()
            float r2 = r2 + r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0065
            float r2 = r2 - r5
            goto L_0x0065
        L_0x0167:
            r0 = 1127481344(0x43340000, float:180.0)
            goto L_0x016c
        L_0x016a:
            r0 = 1119092736(0x42b40000, float:90.0)
        L_0x016c:
            float r2 = r2 + r0
            goto L_0x0134
        L_0x016e:
            java.lang.Object r3 = r1.A00
            X.2jx r3 = (X.C55562jx) r3
            X.0l2 r0 = r3.A0E
            X.074 r2 = r3.A0J(r0)
            if (r2 == 0) goto L_0x0283
            android.location.Location r11 = r3.getMyLocation()
            if (r11 == 0) goto L_0x0283
            r4 = 0
            r6 = 3
            float[] r1 = r3.A0G     // Catch:{ IllegalArgumentException -> 0x018a }
            float[] r0 = r7.values     // Catch:{ IllegalArgumentException -> 0x018a }
            android.hardware.SensorManager.getRotationMatrixFromVector(r1, r0)     // Catch:{ IllegalArgumentException -> 0x018a }
            goto L_0x0199
        L_0x018a:
            float[] r5 = r7.values
            int r0 = r5.length
            if (r0 <= r6) goto L_0x0199
            float[] r1 = r3.A0F
            java.lang.System.arraycopy(r5, r4, r1, r4, r6)
            float[] r0 = r3.A0G
            android.hardware.SensorManager.getRotationMatrixFromVector(r0, r1)
        L_0x0199:
            android.view.Display r0 = r3.A05
            int r5 = r0.getRotation()
            long r9 = java.lang.System.currentTimeMillis()
            long r0 = r11.getTime()
            long r9 = r9 - r0
            r7 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0238
            boolean r0 = r11.hasBearing()
            if (r0 == 0) goto L_0x0238
            float r0 = r11.getSpeed()
            double r7 = (double) r0
            r9 = 4606228376254955242(0x3fec9c4da9003eea, double:0.89408)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0238
            float r6 = r11.getBearing()
        L_0x01c6:
            float r9 = r3.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r4 = r3.A03
            long r0 = r7 - r4
            float r10 = (float) r0
            r0 = 1137180672(0x43c80000, float:400.0)
            float r10 = r10 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01dc
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x01dc:
            r3.A03 = r7
            float r4 = r6 - r9
            float r1 = java.lang.Math.abs(r4)
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0215
            r0 = 1114636288(0x42700000, float:60.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01f3
            float r10 = r10 * r4
            float r6 = r9 + r10
        L_0x01f3:
            r3.A00 = r6
            int r0 = r3.A02
            if (r0 != 0) goto L_0x0283
            X.020 r5 = X.C13680ns.A0P(r11)
            float r4 = r3.A00
            float r1 = r3.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r3 = java.lang.Math.max(r1, r0)
            r1 = 1
            X.0YG r0 = new X.0YG
            r0.<init>(r5, r3, r1, r4)
            X.076 r0 = X.AnonymousClass0T2.A00(r0)
            r2.A09(r0)
            return
        L_0x0215:
            r7 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r0 = (double) r1
            double r7 = r7 - r0
            r4 = 4633641066610819072(0x404e000000000000, double:60.0)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x01f3
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0231
            float r6 = r6 + r1
            float r6 = r6 - r9
            float r6 = r6 % r1
            float r10 = r10 * r6
            float r9 = r9 + r10
        L_0x022d:
            float r9 = r9 + r1
            float r6 = r9 % r1
            goto L_0x01f3
        L_0x0231:
            float r0 = r1 - r6
            float r0 = r0 + r9
            float r0 = r0 % r1
            float r10 = r10 * r0
            float r9 = r9 - r10
            goto L_0x022d
        L_0x0238:
            float[] r1 = r3.A0G
            float[] r0 = r3.A0H
            android.hardware.SensorManager.getOrientation(r1, r0)
            r0 = r0[r4]
            double r0 = (double) r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r4 = (float) r0
            r1 = 1
            r0 = 1119092736(0x42b40000, float:90.0)
            if (r5 == r1) goto L_0x0281
            r0 = 2
            if (r5 == r0) goto L_0x027f
            r0 = 1132920832(0x43870000, float:270.0)
            if (r5 == r6) goto L_0x0281
        L_0x0253:
            r0 = 0
            r5 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x025b
            float r4 = r4 + r5
        L_0x025b:
            double r0 = r11.getLatitude()
            float r13 = (float) r0
            double r0 = r11.getLongitude()
            float r14 = (float) r0
            double r0 = r11.getAltitude()
            float r15 = (float) r0
            long r16 = r11.getTime()
            android.hardware.GeomagneticField r12 = new android.hardware.GeomagneticField
            r12.<init>(r13, r14, r15, r16)
            float r6 = r12.getDeclination()
            float r6 = r6 + r4
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x01c6
            float r6 = r6 - r5
            goto L_0x01c6
        L_0x027f:
            r0 = 1127481344(0x43340000, float:180.0)
        L_0x0281:
            float r4 = r4 + r0
            goto L_0x0253
        L_0x0283:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxEListenerShape385S0100000_1_I0.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
