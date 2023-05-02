package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.facebook.redex.IDxEListenerShape385S0100000_1_I0;
import com.facebook.redex.IDxRCallbackShape295S0100000_2_I0;
import com.facebook.redex.IDxRCallbackShape82S0200000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.location.LocationPicker;

/* renamed from: X.2jx  reason: invalid class name and case insensitive filesystem */
public class C55562jx extends C55572jy {
    public float A00;
    public float A01;
    public int A02 = 2;
    public long A03;
    public SensorManager A04;
    public Display A05;
    public AnonymousClass074 A06;
    public AnonymousClass0IU A07;
    public AnonymousClass0KX A08 = AnonymousClass0KX.BOTTOM_RIGHT;
    public C06060Ub A09;
    public C17090uW A0A;
    public AnonymousClass01V A0B;
    public boolean A0C;
    public final SensorEventListener A0D = new IDxEListenerShape385S0100000_1_I0(this, 0);
    public final C12830l2 A0E = new IDxRCallbackShape295S0100000_2_I0(this, 1);
    public final float[] A0F = new float[3];
    public final float[] A0G = new float[16];
    public final float[] A0H = new float[3];

    public C55562jx(Context context, AnonymousClass0P5 r4) {
        super(context, r4);
        this.A08 = r4.A00;
        this.A04 = this.A0B.A0D();
        this.A05 = this.A0B.A0O().getDefaultDisplay();
        setupInfoButtonForFacebookMap(getContext());
    }

    private void setupInfoButtonForFacebookMap(Context context) {
        A0G(new IDxRCallbackShape82S0200000_2_I0(context, 1, this));
    }

    public AnonymousClass074 A0J(C12830l2 r2) {
        AnonymousClass00B.A01();
        AnonymousClass074 r0 = this.A06;
        if (r0 != null) {
            r2.ATJ(r0);
            return this.A06;
        }
        A0G(r2);
        return null;
    }

    public void A0K() {
        SensorManager sensorManager = this.A04;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            boolean z2 = false;
            if (defaultSensor != null) {
                z2 = true;
            }
            this.A0C = z2;
            if (defaultSensor != null) {
                sensorManager.registerListener(this.A0D, defaultSensor, 16000);
            }
        }
    }

    public void A0L() {
        int i2 = this.A02;
        if (i2 != 0) {
            if (i2 == 1) {
                setLocationMode(0);
                return;
            } else if (i2 != 2) {
                return;
            }
        }
        setLocationMode(1);
    }

    public void A0M(int i2) {
        LocationPicker locationPicker;
        ImageView imageView;
        int i3;
        if (this instanceof AnonymousClass32e) {
            AnonymousClass32e r0 = (AnonymousClass32e) this;
            if (i2 != 0) {
                locationPicker = r0.A00;
                imageView = locationPicker.A0N.A0T;
                if (i2 != 1) {
                    i3 = R.drawable.btn_myl;
                } else {
                    imageView.setImageResource(R.drawable.btn_myl_active);
                    locationPicker.A0N.A0u = true;
                    return;
                }
            } else {
                locationPicker = r0.A00;
                imageView = locationPicker.A0N.A0T;
                i3 = R.drawable.btn_compass_mode_tilt;
            }
            imageView.setImageResource(i3);
            locationPicker.A0N.A0u = false;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A02 != 2) {
            this.A02 = 2;
            A0M(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A02;
    }

    public Location getMyLocation() {
        AnonymousClass074 A0J = A0J(this.A0E);
        if (A0J == null || !A0J.A0N || A0J.A0H == null) {
            return null;
        }
        return A0J.A0V.A00;
    }

    public void setInfoButtonPosition(AnonymousClass0KX r1) {
        this.A08 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r4 != null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLocationMode(int r9) {
        /*
            r8 = this;
            X.0l2 r0 = r8.A0E
            X.074 r5 = r8.A0J(r0)
            if (r5 != 0) goto L_0x000b
            r8.A02 = r9
        L_0x000a:
            return
        L_0x000b:
            X.0YG r7 = r5.A02()
            if (r9 == 0) goto L_0x001d
            r6 = 1
            r1 = 2
            if (r9 == r6) goto L_0x0065
            if (r9 != r1) goto L_0x000a
            r8.A02 = r1
            r8.A0M(r1)
            return
        L_0x001d:
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x000a
            float r0 = r7.A02
            r8.A01 = r0
            r0 = 0
            r8.A0M(r0)
            android.location.Location r0 = r8.getMyLocation()
            if (r0 == 0) goto L_0x0060
            double r2 = r0.getLatitude()
            double r0 = r0.getLongitude()
            X.020 r4 = new X.020
            r4.<init>(r2, r0)
        L_0x003c:
            float r3 = r8.A00
            float r1 = r8.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r2 = java.lang.Math.max(r1, r0)
            r1 = 1
            X.0YG r0 = new X.0YG
            r0.<init>(r4, r2, r1, r3)
            X.076 r0 = X.AnonymousClass0T2.A00(r0)
            r5.A08(r0)
        L_0x0053:
            r0 = 9
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r2 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r2.<init>(r8, r0, r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.postDelayed(r2, r0)
            return
        L_0x0060:
            X.020 r4 = r7.A03
            if (r4 == 0) goto L_0x0053
            goto L_0x003c
        L_0x0065:
            android.location.Location r0 = r8.getMyLocation()
            if (r0 == 0) goto L_0x008f
            double r2 = r0.getLatitude()
            double r0 = r0.getLongitude()
            X.020 r4 = new X.020
            r4.<init>(r2, r0)
            r8.A02 = r6
            r1 = 1
        L_0x007b:
            r8.A0M(r1)
            float r3 = r7.A02
            r2 = 1
            r1 = 0
            X.0YG r0 = new X.0YG
            r0.<init>(r4, r3, r2, r1)
            X.076 r0 = X.AnonymousClass0T2.A00(r0)
            r5.A08(r0)
            return
        L_0x008f:
            X.020 r4 = r7.A03
            r8.A02 = r1
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55562jx.setLocationMode(int):void");
    }
}
