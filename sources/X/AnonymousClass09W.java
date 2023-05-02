package X;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.09W  reason: invalid class name */
public class AnonymousClass09W extends FrameLayout implements AnonymousClass09X, AnonymousClass09Y, AnonymousClass09Z {
    public static final double A0n = Math.log(2.0d);
    public double A00;
    public double A01;
    public double A02 = 0.5d;
    public double A03 = 0.5d;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public int A0C = -987675;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H = System.nanoTime();
    public long A0I = SystemClock.uptimeMillis();
    public long A0J;
    public long A0K;
    public Context A0L;
    public AnonymousClass074 A0M;
    public AnonymousClass0P5 A0N;
    public AnonymousClass0VB A0O;
    public C12170jx A0P;
    public C05140Pl A0Q;
    public C10500hE A0R;
    public AnonymousClass0PH A0S;
    public C13450m3 A0T = C13450m3.A00;
    public Queue A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final BroadcastReceiver A0e = new AnonymousClass0AE(this);
    public final ComponentCallbacks A0f = new C06660Xd(this);
    public final Matrix A0g = new Matrix();
    public final Matrix A0h = new Matrix();
    public final Paint A0i = new Paint(2);
    public final RectF A0j = new RectF();
    public final EnumSet A0k = EnumSet.of(AnonymousClass0KL.A00);
    public final float[] A0l = new float[2];
    public final float[] A0m = new float[4];

    public AnonymousClass09W(Context context, AnonymousClass0P5 r6) {
        super(context);
        setWillNotDraw(false);
        this.A0L = context;
        this.A0N = r6;
        boolean z2 = r6.A04;
        r6.A04 = z2;
        this.A0C = z2 ? -15789542 : -987675;
        AnonymousClass0PH r1 = new AnonymousClass0PH(context, this);
        this.A0S = r1;
        Matrix matrix = this.A0h;
        r1.A0J = matrix;
        r1.A08 = 0.87f;
        this.A0Y = this.A0L.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.A0d = true;
        C10500hE r0 = new C10500hE(this, this);
        this.A0R = r0;
        r0.A06 = matrix;
        C007803p.A0A.add(new WeakReference(this));
        C007803p.A02(false);
    }

    public static double A00(double d2) {
        int i2;
        if (d2 < 0.0d) {
            i2 = 1;
        } else {
            i2 = 0;
            if (d2 > 1.0d) {
                i2 = -1;
            }
        }
        return d2 + ((double) i2);
    }

    private void A01() {
        C06080Ud r1 = this.A0M.A0V;
        if (r1.A04) {
            r1.A01(false);
        }
        if (this.A0W) {
            Context context = this.A0L;
            context.unregisterComponentCallbacks(this.A0f);
            try {
                context.unregisterReceiver(this.A0e);
            } catch (IllegalArgumentException unused) {
            }
            this.A0W = false;
        }
        this.A0M.A06();
        for (AnonymousClass0V3 A032 : AnonymousClass0V3.A0Q) {
            A032.A03();
        }
    }

    private void A02(Bundle bundle) {
        if (bundle != null && bundle.containsKey("zoom")) {
            AnonymousClass074 r2 = this.A0M;
            A0D((int) Math.min(Math.max((float) bundle.getInt("zoom"), r2.A01), r2.A00), bundle.getFloat("scale"));
            this.A02 = bundle.getDouble("xVisibleCenter") - ((double) (((long) (0 - this.A0M.A05)) / (this.A0J << 1)));
            double d2 = bundle.getDouble("yVisibleCenter");
            AnonymousClass074 r0 = this.A0M;
            this.A03 = d2 - ((double) (((long) (r0.A06 - r0.A04)) / (this.A0J << 1)));
            this.A0A = bundle.getFloat("rotation");
            Matrix matrix = this.A0g;
            float f2 = this.A0B;
            matrix.setScale(f2, f2);
            matrix.postRotate(this.A0A);
            matrix.invert(this.A0h);
            this.A0c = false;
        }
    }

    public double A03(double d2, long j2) {
        double d3 = this.A01 * (((double) this.A0J) / ((double) j2));
        double d4 = 1.0d - d3;
        return d2 < d3 ? d3 : d2 > d4 ? d4 : d2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.A0H == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r5 = this;
            X.074 r2 = r5.A0M
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x000b
            X.0IY r1 = r2.A0H
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r4 = 1
            if (r0 == 0) goto L_0x0018
            X.0Ud r1 = r2.A0V
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0018
            r1.A01(r4)
        L_0x0018:
            boolean r0 = r5.A0W
            if (r0 != 0) goto L_0x0031
            android.content.Context r3 = r5.A0L
            android.content.ComponentCallbacks r0 = r5.A0f
            r3.registerComponentCallbacks(r0)
            android.content.BroadcastReceiver r2 = r5.A0e
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3.registerReceiver(r2, r0)
            r5.A0W = r4
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09W.A04():void");
    }

    public final void A05() {
        int size = this.A0M.A0X.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A0M.A0X.get(i2);
        }
        AnonymousClass0X2.A01(new C03340Id());
    }

    public final void A06() {
        this.A0b = false;
        this.A0M.A0S.A06();
    }

    public final void A07() {
        AnonymousClass074 r4 = this.A0M;
        AnonymousClass0S2 r1 = r4.A0U.A0A;
        if (r1.A03 == -1) {
            r1.A03 = 1;
        }
        this.A0b = true;
        r4.A06();
        C10500hE r12 = this.A0R;
        r12.A0D.removeCallbacks(r12);
        r12.A0B = false;
        r12.A07 = false;
        r12.A08 = true;
        r12.A0E.forceFinished(true);
        r12.A01 = 0.0f;
        r12.A00 = 0.0f;
    }

    public final void A08() {
        AnonymousClass0S2 r1 = this.A0M.A0U.A0A;
        if (r1.A03 == -1) {
            r1.A03 = 1;
        }
        C10500hE r2 = this.A0R;
        View view = r2.A0D;
        view.removeCallbacks(r2);
        r2.A08 = false;
        r2.A07 = true;
        view.postOnAnimation(r2);
    }

    public final void A09() {
        RectF rectF = this.A0j;
        rectF.left = 0.0f;
        rectF.right = (float) this.A0F;
        rectF.top = 0.0f;
        rectF.bottom = (float) this.A0D;
        Matrix matrix = this.A0h;
        matrix.mapRect(rectF);
        float[] fArr = this.A0m;
        float f2 = this.A04;
        fArr[0] = -f2;
        float f3 = -this.A05;
        fArr[1] = f3;
        fArr[2] = f2;
        fArr[3] = f3;
        matrix.mapVectors(fArr);
        float max = Math.max(Math.abs(fArr[0]), Math.abs(fArr[2]));
        float max2 = Math.max(Math.abs(fArr[1]), Math.abs(fArr[3]));
        float f4 = (float) this.A0J;
        this.A00 = (double) (max / f4);
        this.A01 = (double) (max2 / f4);
    }

    public void A0A(double d2, double d3) {
        this.A02 = A00(d2);
        this.A03 = A03(d3, this.A0J);
    }

    public void A0B(float f2, float f3, float f4) {
        if (this.A0Y) {
            C06540Wn r0 = this.A0M.A0S;
            float[] fArr = this.A0l;
            r0.A0A(fArr, f3, f4);
            float f5 = fArr[0];
            float f6 = fArr[1];
            Matrix matrix = this.A0g;
            matrix.postRotate(f2 - this.A0A, f3, f4);
            matrix.invert(this.A0h);
            this.A0A = f2 % 360.0f;
            A09();
            A0C(f3, f4, f5, f6);
        }
    }

    public final void A0C(float f2, float f3, float f4, float f5) {
        float[] fArr = this.A0l;
        fArr[0] = this.A04 - f2;
        fArr[1] = this.A05 - f3;
        this.A0h.mapVectors(fArr);
        long j2 = this.A0J;
        double d2 = (double) j2;
        this.A02 = A00(((double) f4) + (((double) fArr[0]) / d2));
        this.A03 = A03(((double) f5) + (((double) fArr[1]) / d2), j2);
    }

    public final void A0D(int i2, float f2) {
        this.A0G = i2;
        this.A0B = f2;
        int i3 = 1 << i2;
        this.A0E = i3;
        this.A0J = (long) (i3 * this.A0M.A0O);
    }

    public final void A0E(Bundle bundle) {
        AnonymousClass0P5 r0 = this.A0N;
        AnonymousClass074 r3 = new AnonymousClass074(r0, this);
        this.A0M = r3;
        AnonymousClass0YG r4 = r0.A01;
        if (r4 == null) {
            float f2 = r3.A01;
            A0D((int) f2, (f2 % 1.0f) + 1.0f);
        } else {
            float min = Math.min(Math.max(r4.A02, r3.A01), r3.A00);
            A0D((int) min, (min % 1.0f) + 1.0f);
            AnonymousClass020 r2 = r4.A03;
            if (r2 != null) {
                this.A02 = C06540Wn.A01(r2.A01);
                this.A03 = C06540Wn.A00(r2.A00);
            }
            this.A0A = r4.A00;
        }
        this.A0Q = r3.A0T;
        Matrix matrix = this.A0g;
        float f3 = this.A0B;
        matrix.setScale(f3, f3);
        matrix.postRotate(this.A0A);
        matrix.invert(this.A0h);
        A02(bundle);
    }

    public final void A0F(Bundle bundle) {
        if (!this.A0c) {
            bundle.putDouble("xVisibleCenter", this.A02 + ((double) (((long) (0 - this.A0M.A05)) / (this.A0J << 1))));
            double d2 = this.A03;
            AnonymousClass074 r0 = this.A0M;
            bundle.putDouble("yVisibleCenter", d2 + ((double) (((long) (r0.A06 - r0.A04)) / (this.A0J << 1))));
            bundle.putInt("zoom", this.A0G);
            bundle.putFloat("scale", this.A0B);
            bundle.putFloat("rotation", this.A0A);
            this.A0c = true;
        }
    }

    public void A0G(C12830l2 r2) {
        Queue queue;
        if (!this.A0Z || ((queue = this.A0U) != null && !queue.isEmpty())) {
            Queue queue2 = this.A0U;
            if (queue2 == null) {
                queue2 = new LinkedList();
                this.A0U = queue2;
            }
            queue2.add(r2);
            return;
        }
        r2.ATJ(this.A0M);
    }

    public boolean A0H(float f2, float f3, float f4) {
        C06540Wn r0 = this.A0M.A0S;
        float[] fArr = this.A0l;
        r0.A0A(fArr, f3, f4);
        float f5 = fArr[0];
        float f6 = fArr[1];
        AnonymousClass074 r2 = this.A0M;
        float min = Math.min(Math.max(f2, r2.A01), r2.A00);
        float f7 = (min % 1.0f) + 1.0f;
        int i2 = this.A0G;
        float f8 = f7 / this.A0B;
        this.A06 = f8;
        A0D((int) min, f7);
        Matrix matrix = this.A0g;
        matrix.postScale(f8, f8, f3, f4);
        matrix.invert(this.A0h);
        A09();
        A0C(f3, f4, f5, f6);
        return this.A0G != i2;
    }

    public final boolean A0I(float f2, float f3, float f4) {
        float f5 = this.A0B * f2;
        int i2 = this.A0G;
        while (f5 > 2.0f) {
            f5 /= 2.0f;
            i2++;
        }
        while (f5 < 1.0f) {
            f5 *= 2.0f;
            i2--;
        }
        if (A0H((((float) i2) + f5) - 1.0f, f3, f4)) {
            this.A0M.A04();
        }
        return this.A06 != 1.0f;
    }

    public EnumSet getCurrentAttribution() {
        return this.A0k;
    }

    @Deprecated
    public final AnonymousClass074 getMap() {
        return this.A0M;
    }

    public final AnonymousClass0P5 getMapOptions() {
        return this.A0N;
    }

    public float getPixelSize() {
        return (float) this.A0J;
    }

    public float getTileScale() {
        return this.A0B;
    }

    public float getZoom() {
        return (((float) this.A0G) + this.A0B) - 1.0f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0M != null) {
            A04();
            this.A0K = System.nanoTime();
            if (!this.A0a) {
                C03310Ia r3 = this.A0M.A0U.A02;
                r3.A01.set(0);
                r3.A00.set(0);
                r3.A01.set(0);
                this.A0a = true;
                return;
            }
            return;
        }
        throw new RuntimeException("MapView.onCreate() must be called!");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        List list = this.A0M.A0X;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0VB r1 = (AnonymousClass0VB) list.get(i2);
            if (r1 instanceof AnonymousClass0IX) {
                ((AnonymousClass0IX) r1).A0F();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass074 r2 = this.A0M;
        AnonymousClass0IY r1 = r2.A0H;
        if (r1 != null) {
            r1.A0E.A01();
            r1.A02();
        }
        List list = r2.A0X;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0VB r12 = (AnonymousClass0VB) list.get(i2);
            if (r12 instanceof AnonymousClass0IX) {
                ((AnonymousClass0IX) r12).A0F();
            }
        }
        AnonymousClass0X2.A01(new C03340Id());
        A01();
    }

    public void onDraw(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.onDraw(canvas);
        canvas.drawColor(this.A0C);
        this.A0V = true;
        int size = this.A0M.A0X.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0VB r1 = (AnonymousClass0VB) this.A0M.A0X.get(i2);
            if (r1.A04) {
                r1.A0D(canvas);
                if (r1 instanceof AnonymousClass0IZ) {
                    boolean z2 = this.A0V;
                    boolean z3 = false;
                    if (((AnonymousClass0IX) r1).A06 == 0) {
                        z3 = true;
                    }
                    this.A0V = z3 & z2;
                }
            }
        }
        if (this.A0V) {
            AnonymousClass074 r12 = this.A0M;
            C12810l0 r0 = r12.A0C;
            if (r0 != null) {
                r0.ATI();
                r12.A0C = null;
            }
            if (this.A0a) {
                C03430Im r13 = this.A0M.A0U;
                new C11260iS(r13.A02, this.A0N.A02);
                this.A0a = false;
            }
        }
        long nanoTime2 = System.nanoTime();
        String str = this.A0N.A02;
        AnonymousClass0V3.A0C.A04(nanoTime2 - nanoTime);
        if (this.A0H > 0) {
            new C11270iT(this, str, nanoTime2);
            this.A0H = 0;
        }
        if (this.A0K > 0) {
            new C11280iU(this, str, nanoTime2);
            this.A0K = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00bd, code lost:
        if (r1 != false) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            long r7 = java.lang.System.nanoTime()
            super.onLayout(r10, r11, r12, r13, r14)
            int r0 = r9.getWidth()
            r9.A0F = r0
            int r3 = r9.getHeight()
            r9.A0D = r3
            int r2 = r9.A0F
            float r0 = (float) r2
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r9.A04 = r0
            float r0 = (float) r3
            float r0 = r0 / r1
            r9.A05 = r0
            int r0 = java.lang.Math.max(r3, r2)
            double r2 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 * r0
            X.074 r4 = r9.A0M
            int r0 = r4.A0O
            double r0 = (double) r0
            double r2 = r2 / r0
            double r1 = java.lang.Math.ceil(r2)
            int r0 = (int) r1
            double r0 = (double) r0
            double r2 = java.lang.Math.log(r0)
            double r0 = A0n
            double r2 = r2 / r0
            double r1 = java.lang.Math.ceil(r2)
            float r0 = (float) r1
            r9.A07 = r0
            float r1 = r4.A01
            X.09W r0 = r4.A0R
            float r0 = r0.A07
            float r2 = java.lang.Math.max(r1, r0)
            r4.A01 = r2
            int r0 = r9.A0G
            float r1 = (float) r0
            float r0 = r9.A0B
            float r1 = r1 + r0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r4
            r3 = 0
            r6 = 1
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c0
            int r0 = (int) r2
            float r2 = r2 % r4
            float r2 = r2 + r4
            r9.A0D(r0, r2)
            r1 = 1
        L_0x0063:
            r9.A09()
            boolean r0 = r9.A0Z
            if (r0 != 0) goto L_0x00bd
            int r0 = r9.A0G
            float r2 = (float) r0
            float r0 = r9.A0B
            float r2 = r2 + r0
            float r2 = r2 - r4
            X.074 r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            boolean r0 = r9.A0H(r2, r1, r0)
            if (r0 == 0) goto L_0x0086
            X.074 r0 = r9.A0M
            r0.A04()
        L_0x0086:
            double r4 = r9.A02
            double r0 = r9.A03
            r9.A0A(r4, r0)
            float r2 = r9.A0A
            X.074 r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            r9.A0B(r2, r1, r0)
            r9.A0Z = r6
        L_0x009e:
            X.074 r0 = r9.A0M
            r0.A04()
        L_0x00a3:
            X.074 r0 = r9.A0M
            java.util.List r0 = r0.A0X
            int r1 = r0.size()
        L_0x00ab:
            if (r3 >= r1) goto L_0x00c2
            X.074 r0 = r9.A0M
            java.util.List r0 = r0.A0X
            java.lang.Object r0 = r0.get(r3)
            X.0VB r0 = (X.AnonymousClass0VB) r0
            r0.A03()
            int r3 = r3 + 1
            goto L_0x00ab
        L_0x00bd:
            if (r1 == 0) goto L_0x00a3
            goto L_0x009e
        L_0x00c0:
            r1 = 0
            goto L_0x0063
        L_0x00c2:
            java.util.Queue r0 = r9.A0U
            if (r0 == 0) goto L_0x00d0
            X.0Ie r1 = new X.0Ie
            r1.<init>(r9)
            android.os.Handler r0 = X.AnonymousClass0X2.A02
            r0.post(r1)
        L_0x00d0:
            X.0V3 r2 = X.AnonymousClass0V3.A0E
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r7
            r2.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09W.onLayout(boolean, int, int, int, int):void");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("zoom")) {
                if (bundle.containsKey("parentBundle")) {
                    super.onRestoreInstanceState(bundle.getParcelable("parentBundle"));
                }
                A02(bundle);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        boolean z2 = this.A0c;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (z2) {
            return onSaveInstanceState;
        }
        Bundle bundle = new Bundle();
        A0F(bundle);
        bundle.putParcelable("parentBundle", onSaveInstanceState);
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0392, code lost:
        if (r9 != 0.0f) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        if (java.lang.Math.abs(r8 - r5.A01) <= r1) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (java.lang.Math.abs(r8 - r5.A0A) <= r11) goto L_0x026a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0355 A[Catch:{ all -> 0x0468 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0399 A[Catch:{ all -> 0x0468 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x039a A[Catch:{ all -> 0x0468 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            long r16 = java.lang.System.nanoTime()
            r0 = r20
            X.0PH r5 = r0.A0S     // Catch:{ all -> 0x0468 }
            r15 = r21
            int r1 = r15.getActionMasked()     // Catch:{ all -> 0x0468 }
            int r12 = r15.getPointerCount()     // Catch:{ all -> 0x0468 }
            long r2 = r15.getEventTime()     // Catch:{ all -> 0x0468 }
            float r7 = r15.getX()     // Catch:{ all -> 0x0468 }
            float r8 = r15.getY()     // Catch:{ all -> 0x0468 }
            boolean r0 = r5.A0Q     // Catch:{ all -> 0x0468 }
            java.lang.String r10 = "longPressTimeout"
            r9 = 2
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L_0x004d
            if (r1 != r9) goto L_0x0046
            if (r12 > r4) goto L_0x0046
            float r0 = r5.A09     // Catch:{ all -> 0x0468 }
            float r0 = r7 - r0
            float r13 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0468 }
            int r0 = r5.A0R     // Catch:{ all -> 0x0468 }
            float r11 = (float) r0     // Catch:{ all -> 0x0468 }
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0046
            float r0 = r5.A0A     // Catch:{ all -> 0x0468 }
            float r0 = r8 - r0
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0468 }
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x026a
        L_0x0046:
            r5.A0Q = r6     // Catch:{ all -> 0x0468 }
            android.os.Handler r0 = X.AnonymousClass0X2.A02     // Catch:{ all -> 0x0468 }
            r0.removeCallbacksAndMessages(r10)     // Catch:{ all -> 0x0468 }
        L_0x004d:
            if (r1 == r9) goto L_0x026a
            if (r1 != 0) goto L_0x00e4
            r5.A0N = r6     // Catch:{ all -> 0x0468 }
            r5.A0M = r6     // Catch:{ all -> 0x0468 }
            boolean r0 = r5.A0O     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x007f
            long r0 = r5.A0G     // Catch:{ all -> 0x0468 }
            long r12 = r2 - r0
            int r0 = r5.A0E     // Catch:{ all -> 0x0468 }
            long r0 = (long) r0     // Catch:{ all -> 0x0468 }
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x007f
            float r0 = r5.A00     // Catch:{ all -> 0x0468 }
            float r0 = r7 - r0
            float r11 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0468 }
            int r0 = r5.A0D     // Catch:{ all -> 0x0468 }
            float r1 = (float) r0     // Catch:{ all -> 0x0468 }
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            float r0 = r5.A01     // Catch:{ all -> 0x0468 }
            float r0 = r8 - r0
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0468 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
        L_0x007f:
            r5.A0O = r6     // Catch:{ all -> 0x0468 }
            r5.A00 = r7     // Catch:{ all -> 0x0468 }
            r5.A01 = r8     // Catch:{ all -> 0x0468 }
            r5.A0G = r2     // Catch:{ all -> 0x0468 }
        L_0x0087:
            r5.A09 = r7     // Catch:{ all -> 0x0468 }
            r5.A0A = r8     // Catch:{ all -> 0x0468 }
            r5.A0Q = r4     // Catch:{ all -> 0x0468 }
            X.0hV r12 = r5.A0T     // Catch:{ all -> 0x0468 }
            long r2 = r5.A0S     // Catch:{ all -> 0x0468 }
            android.os.Handler r11 = X.AnonymousClass0X2.A02     // Catch:{ all -> 0x0468 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0468 }
            long r0 = r0 + r2
            r11.postAtTime(r12, r10, r0)     // Catch:{ all -> 0x0468 }
            android.view.VelocityTracker r0 = r5.A0K     // Catch:{ all -> 0x0468 }
            if (r0 != 0) goto L_0x00bd
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()     // Catch:{ all -> 0x0468 }
            r5.A0K = r0     // Catch:{ all -> 0x0468 }
        L_0x00a5:
            android.view.VelocityTracker r0 = r5.A0K     // Catch:{ all -> 0x0468 }
            r0.addMovement(r15)     // Catch:{ all -> 0x0468 }
            X.09Y r10 = r5.A0L     // Catch:{ all -> 0x0468 }
            X.09W r10 = (X.AnonymousClass09W) r10     // Catch:{ all -> 0x0468 }
            r10.A0X = r6     // Catch:{ all -> 0x0468 }
            X.074 r0 = r10.A0M     // Catch:{ all -> 0x0468 }
            java.util.List r6 = r0.A0X     // Catch:{ all -> 0x0468 }
            int r0 = r6.size()     // Catch:{ all -> 0x0468 }
            int r5 = r0 + -1
            r3 = 0
            r2 = 0
            goto L_0x00c1
        L_0x00bd:
            r0.clear()     // Catch:{ all -> 0x0468 }
            goto L_0x00a5
        L_0x00c1:
            if (r5 < 0) goto L_0x00da
            java.lang.Object r1 = r6.get(r5)     // Catch:{ all -> 0x0468 }
            X.0VB r1 = (X.AnonymousClass0VB) r1     // Catch:{ all -> 0x0468 }
            boolean r0 = r1.A04     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x00d7
            int r0 = r1.A00(r7, r8)     // Catch:{ all -> 0x0468 }
            if (r0 == r9) goto L_0x00db
            if (r0 <= r2) goto L_0x00d7
            r3 = r1
            r2 = r0
        L_0x00d7:
            int r5 = r5 + -1
            goto L_0x00c1
        L_0x00da:
            r1 = r3
        L_0x00db:
            r10.A0O = r1     // Catch:{ all -> 0x0468 }
            if (r1 == 0) goto L_0x045c
            r1.A08(r7, r8)     // Catch:{ all -> 0x0468 }
            goto L_0x045c
        L_0x00e4:
            if (r1 != r4) goto L_0x0243
            r5.A0F = r6     // Catch:{ all -> 0x0468 }
            long r0 = r5.A0I     // Catch:{ all -> 0x0468 }
            long r9 = r2 - r0
            int r0 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x0468 }
            long r0 = (long) r0     // Catch:{ all -> 0x0468 }
            int r6 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0141
            X.09Y r7 = r5.A0L     // Catch:{ all -> 0x0468 }
            X.09W r7 = (X.AnonymousClass09W) r7     // Catch:{ all -> 0x0468 }
            r7.A06()     // Catch:{ all -> 0x0468 }
            X.0Pl r0 = r7.A0Q     // Catch:{ all -> 0x0468 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x0118
            X.074 r6 = r7.A0M     // Catch:{ all -> 0x0468 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.076 r3 = new X.076     // Catch:{ all -> 0x0468 }
            r3.<init>()     // Catch:{ all -> 0x0468 }
            r3.A02 = r0     // Catch:{ all -> 0x0468 }
            r2 = 200(0xc8, float:2.8E-43)
            r1 = 0
            com.facebook.redex.IDxCCallbackShape281S0100000_I0 r0 = new com.facebook.redex.IDxCCallbackShape281S0100000_I0     // Catch:{ all -> 0x0468 }
            r0.<init>(r7, r1)     // Catch:{ all -> 0x0468 }
            r6.A0A(r3, r0, r2)     // Catch:{ all -> 0x0468 }
        L_0x0118:
            boolean r0 = r5.A0O     // Catch:{ all -> 0x0468 }
            r0 = r0 ^ 1
            r5.A0O = r0     // Catch:{ all -> 0x0468 }
            X.09Y r3 = r5.A0L     // Catch:{ all -> 0x0468 }
            float r2 = r5.A09     // Catch:{ all -> 0x0468 }
            float r1 = r5.A0A     // Catch:{ all -> 0x0468 }
            X.09W r3 = (X.AnonymousClass09W) r3     // Catch:{ all -> 0x0468 }
            r3.A06()     // Catch:{ all -> 0x0468 }
            boolean r0 = r3.A0X     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x0138
            X.0hE r0 = r3.A0R     // Catch:{ all -> 0x0468 }
            boolean r0 = r0.A07     // Catch:{ all -> 0x0468 }
            if (r0 != 0) goto L_0x0138
            X.074 r0 = r3.A0M     // Catch:{ all -> 0x0468 }
            r0.A04()     // Catch:{ all -> 0x0468 }
        L_0x0138:
            X.0VB r0 = r3.A0O     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x045c
            r0.A09(r2, r1)     // Catch:{ all -> 0x0468 }
            goto L_0x045c
        L_0x0141:
            boolean r0 = r5.A0O     // Catch:{ all -> 0x0468 }
            java.lang.String r6 = "clickTimeout"
            if (r0 == 0) goto L_0x01a9
            long r0 = r5.A0G     // Catch:{ all -> 0x0468 }
            long r10 = r2 - r0
            int r0 = r5.A0E     // Catch:{ all -> 0x0468 }
            long r0 = (long) r0     // Catch:{ all -> 0x0468 }
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x01a9
            float r0 = r5.A00     // Catch:{ all -> 0x0468 }
            float r7 = r7 - r0
            float r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0468 }
            int r0 = r5.A0D     // Catch:{ all -> 0x0468 }
            float r1 = (float) r0     // Catch:{ all -> 0x0468 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a9
            float r0 = r5.A01     // Catch:{ all -> 0x0468 }
            float r8 = r8 - r0
            float r0 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0468 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a9
            android.os.Handler r0 = X.AnonymousClass0X2.A02     // Catch:{ all -> 0x0468 }
            r0.removeCallbacksAndMessages(r6)     // Catch:{ all -> 0x0468 }
            X.09Y r6 = r5.A0L     // Catch:{ all -> 0x0468 }
            float r2 = r5.A00     // Catch:{ all -> 0x0468 }
            float r1 = r5.A01     // Catch:{ all -> 0x0468 }
            X.09W r6 = (X.AnonymousClass09W) r6     // Catch:{ all -> 0x0468 }
            r6.A06()     // Catch:{ all -> 0x0468 }
            X.0Pl r0 = r6.A0Q     // Catch:{ all -> 0x0468 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x0118
            int r2 = (int) r2     // Catch:{ all -> 0x0468 }
            int r0 = (int) r1     // Catch:{ all -> 0x0468 }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ all -> 0x0468 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0468 }
            X.074 r3 = r6.A0M     // Catch:{ all -> 0x0468 }
            r0 = 1065353216(0x3f800000, float:1.0)
            X.076 r2 = new X.076     // Catch:{ all -> 0x0468 }
            r2.<init>()     // Catch:{ all -> 0x0468 }
            r2.A02 = r0     // Catch:{ all -> 0x0468 }
            int r0 = r1.x     // Catch:{ all -> 0x0468 }
            float r0 = (float) r0     // Catch:{ all -> 0x0468 }
            r2.A03 = r0     // Catch:{ all -> 0x0468 }
            int r0 = r1.y     // Catch:{ all -> 0x0468 }
            float r0 = (float) r0     // Catch:{ all -> 0x0468 }
            r2.A04 = r0     // Catch:{ all -> 0x0468 }
            r1 = 200(0xc8, float:2.8E-43)
            com.facebook.redex.IDxCCallbackShape281S0100000_I0 r0 = new com.facebook.redex.IDxCCallbackShape281S0100000_I0     // Catch:{ all -> 0x0468 }
            r0.<init>(r6, r4)     // Catch:{ all -> 0x0468 }
            r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0468 }
            goto L_0x0118
        L_0x01a9:
            boolean r0 = r5.A0N     // Catch:{ all -> 0x0468 }
            if (r0 != 0) goto L_0x01c2
            boolean r0 = r5.A0Q     // Catch:{ all -> 0x0468 }
            if (r0 != 0) goto L_0x01c2
            X.0hV r8 = r5.A0U     // Catch:{ all -> 0x0468 }
            int r0 = r5.A0E     // Catch:{ all -> 0x0468 }
            long r2 = (long) r0     // Catch:{ all -> 0x0468 }
            android.os.Handler r7 = X.AnonymousClass0X2.A02     // Catch:{ all -> 0x0468 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0468 }
            long r0 = r0 + r2
            r7.postAtTime(r8, r6, r0)     // Catch:{ all -> 0x0468 }
            goto L_0x0118
        L_0x01c2:
            long r0 = r5.A0H     // Catch:{ all -> 0x0468 }
            long r2 = r2 - r0
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x0468 }
            long r0 = (long) r0     // Catch:{ all -> 0x0468 }
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x01e6
            boolean r0 = r5.A0M     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x01e6
            X.09Y r1 = r5.A0L     // Catch:{ all -> 0x0468 }
            X.09W r1 = (X.AnonymousClass09W) r1     // Catch:{ all -> 0x0468 }
            X.0Pl r0 = r1.A0Q     // Catch:{ all -> 0x0468 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x01e6
            r0 = 0
            r1.A0b = r0     // Catch:{ all -> 0x0468 }
            X.0hE r0 = r1.A0R     // Catch:{ all -> 0x0468 }
            r0.A09 = r4     // Catch:{ all -> 0x0468 }
            r1.A08()     // Catch:{ all -> 0x0468 }
        L_0x01e6:
            boolean r0 = r5.A0N     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x0118
            android.view.VelocityTracker r0 = r5.A0K     // Catch:{ all -> 0x0468 }
            r0.addMovement(r15)     // Catch:{ all -> 0x0468 }
            android.view.VelocityTracker r1 = r5.A0K     // Catch:{ all -> 0x0468 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)     // Catch:{ all -> 0x0468 }
            android.view.VelocityTracker r0 = r5.A0K     // Catch:{ all -> 0x0468 }
            float r3 = r0.getXVelocity()     // Catch:{ all -> 0x0468 }
            android.view.VelocityTracker r0 = r5.A0K     // Catch:{ all -> 0x0468 }
            float r6 = r0.getYVelocity()     // Catch:{ all -> 0x0468 }
            float r1 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x0468 }
            float r0 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0468 }
            float r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x0468 }
            float r0 = r5.A07     // Catch:{ all -> 0x0468 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0118
            X.09Y r1 = r5.A0L     // Catch:{ all -> 0x0468 }
            float r2 = r5.A08     // Catch:{ all -> 0x0468 }
            float r3 = r3 * r2
            float r2 = r2 * r6
            X.09W r1 = (X.AnonymousClass09W) r1     // Catch:{ all -> 0x0468 }
            X.0Pl r0 = r1.A0Q     // Catch:{ all -> 0x0468 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x0118
            r0 = 0
            r1.A0b = r0     // Catch:{ all -> 0x0468 }
            X.0hE r0 = r1.A0R     // Catch:{ all -> 0x0468 }
            int r7 = r1.A0F     // Catch:{ all -> 0x0468 }
            int r8 = r1.A0D     // Catch:{ all -> 0x0468 }
            int r9 = (int) r3     // Catch:{ all -> 0x0468 }
            int r10 = (int) r2     // Catch:{ all -> 0x0468 }
            android.widget.OverScroller r6 = r0.A0E     // Catch:{ all -> 0x0468 }
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0468 }
            r0.A0A = r4     // Catch:{ all -> 0x0468 }
            r1.A08()     // Catch:{ all -> 0x0468 }
            goto L_0x0118
        L_0x0243:
            r0 = 5
            if (r1 != r0) goto L_0x024a
            r5.A0I = r2     // Catch:{ all -> 0x0468 }
            goto L_0x045c
        L_0x024a:
            r0 = 6
            if (r1 != r0) goto L_0x0259
            if (r12 != r9) goto L_0x045c
            r5.A0H = r2     // Catch:{ all -> 0x0468 }
            boolean r0 = r5.A0P     // Catch:{ all -> 0x0468 }
            if (r0 != 0) goto L_0x045c
            r5.A0M = r6     // Catch:{ all -> 0x0468 }
            goto L_0x045c
        L_0x0259:
            r0 = 3
            if (r1 != r0) goto L_0x045c
            r5.A0F = r6     // Catch:{ all -> 0x0468 }
            android.view.VelocityTracker r0 = r5.A0K     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x045c
            r0.recycle()     // Catch:{ all -> 0x0468 }
            r0 = 0
            r5.A0K = r0     // Catch:{ all -> 0x0468 }
            goto L_0x045c
        L_0x026a:
            r1 = 0
            r11 = 0
            r10 = 0
        L_0x026d:
            if (r1 >= r12) goto L_0x027c
            float r0 = r15.getX(r1)     // Catch:{ all -> 0x0468 }
            float r11 = r11 + r0
            float r0 = r15.getY(r1)     // Catch:{ all -> 0x0468 }
            float r10 = r10 + r0
            int r1 = r1 + 1
            goto L_0x026d
        L_0x027c:
            float r3 = (float) r12     // Catch:{ all -> 0x0468 }
            float r11 = r11 / r3
            float r10 = r10 / r3
            r2 = 0
            r9 = 0
        L_0x0281:
            if (r2 >= r12) goto L_0x0298
            float r0 = r15.getX(r2)     // Catch:{ all -> 0x0468 }
            float r0 = r0 - r11
            double r13 = (double) r0     // Catch:{ all -> 0x0468 }
            float r0 = r15.getY(r2)     // Catch:{ all -> 0x0468 }
            float r0 = r0 - r10
            double r0 = (double) r0     // Catch:{ all -> 0x0468 }
            double r0 = java.lang.Math.hypot(r13, r0)     // Catch:{ all -> 0x0468 }
            float r13 = (float) r0     // Catch:{ all -> 0x0468 }
            float r9 = r9 + r13
            int r2 = r2 + 1
            goto L_0x0281
        L_0x0298:
            float r9 = r9 / r3
            r5.A0B = r11     // Catch:{ all -> 0x0468 }
            r5.A0C = r10     // Catch:{ all -> 0x0468 }
            android.graphics.Matrix r1 = r5.A0J     // Catch:{ all -> 0x0468 }
            if (r1 == 0) goto L_0x02ae
            float[] r0 = r5.A0V     // Catch:{ all -> 0x0468 }
            r0[r6] = r11     // Catch:{ all -> 0x0468 }
            r0[r4] = r10     // Catch:{ all -> 0x0468 }
            r1.mapPoints(r0)     // Catch:{ all -> 0x0468 }
            r11 = r0[r6]     // Catch:{ all -> 0x0468 }
            r10 = r0[r4]     // Catch:{ all -> 0x0468 }
        L_0x02ae:
            int r1 = r5.A0F     // Catch:{ all -> 0x0468 }
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r12 == r1) goto L_0x02da
            r5.A02 = r9     // Catch:{ all -> 0x0468 }
            r5.A06 = r0     // Catch:{ all -> 0x0468 }
            if (r12 <= r4) goto L_0x02d1
            float r0 = r15.getY(r4)     // Catch:{ all -> 0x0468 }
            float r8 = r8 - r0
            double r0 = (double) r8     // Catch:{ all -> 0x0468 }
            float r2 = r15.getX(r4)     // Catch:{ all -> 0x0468 }
            float r7 = r7 - r2
            double r2 = (double) r7     // Catch:{ all -> 0x0468 }
            double r0 = java.lang.Math.atan2(r0, r2)     // Catch:{ all -> 0x0468 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x0468 }
            float r2 = (float) r0     // Catch:{ all -> 0x0468 }
            r5.A05 = r2     // Catch:{ all -> 0x0468 }
        L_0x02d1:
            android.view.VelocityTracker r0 = r5.A0K     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x03f5
            r0.clear()     // Catch:{ all -> 0x0468 }
            goto L_0x03f5
        L_0x02da:
            float r2 = r5.A06     // Catch:{ all -> 0x0468 }
            if (r12 <= r4) goto L_0x035c
            float r3 = r5.A02     // Catch:{ all -> 0x0468 }
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x02e8
            float r19 = r9 / r3
            goto L_0x02ea
        L_0x02e8:
            r19 = 1065353216(0x3f800000, float:1.0)
        L_0x02ea:
            float r18 = r19 / r2
            float r0 = r18 - r0
            float r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0468 }
            double r0 = (double) r0     // Catch:{ all -> 0x0468 }
            r13 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            r13 = 0
            if (r2 <= 0) goto L_0x02fe
            r13 = 1
        L_0x02fe:
            boolean r0 = r5.A0P     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x0333
            float r0 = r15.getY(r4)     // Catch:{ all -> 0x0468 }
            float r8 = r8 - r0
            double r2 = (double) r8     // Catch:{ all -> 0x0468 }
            float r0 = r15.getX(r4)     // Catch:{ all -> 0x0468 }
            float r7 = r7 - r0
            double r0 = (double) r7     // Catch:{ all -> 0x0468 }
            double r0 = java.lang.Math.atan2(r2, r0)     // Catch:{ all -> 0x0468 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x0468 }
            float r2 = (float) r0     // Catch:{ all -> 0x0468 }
            int r0 = r5.A0F     // Catch:{ all -> 0x0468 }
            if (r0 == r12) goto L_0x031d
            r5.A05 = r2     // Catch:{ all -> 0x0468 }
        L_0x031d:
            float r0 = r5.A05     // Catch:{ all -> 0x0468 }
            float r3 = r2 - r0
            r0 = 1127481344(0x43340000, float:180.0)
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x032b
            float r3 = r3 - r1
            goto L_0x0336
        L_0x032b:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0336
            float r3 = r3 + r1
            goto L_0x0336
        L_0x0333:
            r0 = 0
            goto L_0x0347
        L_0x0336:
            r5.A05 = r2     // Catch:{ all -> 0x0468 }
            float r0 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x0468 }
            double r0 = (double) r0     // Catch:{ all -> 0x0468 }
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x0333
            r0 = 0
            r5.A0I = r0     // Catch:{ all -> 0x0468 }
        L_0x0347:
            float r2 = r5.A02     // Catch:{ all -> 0x0468 }
            float r9 = r9 - r2
            float r3 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x0468 }
            int r2 = r5.A0R     // Catch:{ all -> 0x0468 }
            float r2 = (float) r2     // Catch:{ all -> 0x0468 }
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0357
            r5.A0I = r0     // Catch:{ all -> 0x0468 }
        L_0x0357:
            r0 = r18
            r2 = r19
            goto L_0x035d
        L_0x035c:
            r13 = 0
        L_0x035d:
            float r1 = r5.A03     // Catch:{ all -> 0x0468 }
            float r7 = r11 - r1
            float r1 = r5.A04     // Catch:{ all -> 0x0468 }
            float r9 = r10 - r1
            boolean r1 = r5.A0N     // Catch:{ all -> 0x0468 }
            if (r1 != 0) goto L_0x0387
            float r3 = r5.A0B     // Catch:{ all -> 0x0468 }
            float r1 = r5.A09     // Catch:{ all -> 0x0468 }
            float r3 = r3 - r1
            float r3 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x0468 }
            int r1 = r5.A0R     // Catch:{ all -> 0x0468 }
            float r8 = (float) r1     // Catch:{ all -> 0x0468 }
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0394
            float r3 = r5.A0C     // Catch:{ all -> 0x0468 }
            float r1 = r5.A0A     // Catch:{ all -> 0x0468 }
            float r3 = r3 - r1
            float r1 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x0468 }
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0394
            goto L_0x0396
        L_0x0387:
            boolean r1 = r5.A0M     // Catch:{ all -> 0x0468 }
            if (r1 != 0) goto L_0x0396
            r3 = 0
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0394
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0396
        L_0x0394:
            r1 = 1
            goto L_0x0397
        L_0x0396:
            r1 = 0
        L_0x0397:
            if (r13 == 0) goto L_0x039a
            goto L_0x039f
        L_0x039a:
            r5.A0M = r6     // Catch:{ all -> 0x0468 }
            if (r1 == 0) goto L_0x03d3
            goto L_0x03d6
        L_0x039f:
            X.09Y r7 = r5.A0L     // Catch:{ all -> 0x0468 }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            float r8 = r5.A0B     // Catch:{ all -> 0x0468 }
            float r3 = r5.A0C     // Catch:{ all -> 0x0468 }
            X.09W r7 = (X.AnonymousClass09W) r7     // Catch:{ all -> 0x0468 }
            X.0Pl r0 = r7.A0Q     // Catch:{ all -> 0x0468 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x03cf
            r7.A07()     // Catch:{ all -> 0x0468 }
            r7.A08 = r8     // Catch:{ all -> 0x0468 }
            r7.A09 = r3     // Catch:{ all -> 0x0468 }
            boolean r0 = r7.A0I(r1, r8, r3)     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x03cc
            boolean r0 = r7.A0d     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x03cc
            X.0hE r3 = r7.A0R     // Catch:{ all -> 0x0468 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            r3.A01 = r1     // Catch:{ all -> 0x0468 }
            r0 = 0
            r3.A05 = r0     // Catch:{ all -> 0x0468 }
        L_0x03cc:
            r7.invalidate()     // Catch:{ all -> 0x0468 }
        L_0x03cf:
            r5.A06 = r2     // Catch:{ all -> 0x0468 }
            r5.A0M = r4     // Catch:{ all -> 0x0468 }
        L_0x03d3:
            r5.A0N = r6     // Catch:{ all -> 0x0468 }
            goto L_0x03f5
        L_0x03d6:
            X.09Y r6 = r5.A0L     // Catch:{ all -> 0x0468 }
            float r2 = r5.A0B     // Catch:{ all -> 0x0468 }
            float r1 = r5.A0C     // Catch:{ all -> 0x0468 }
            float r8 = r5.A08     // Catch:{ all -> 0x0468 }
            float r7 = r7 * r8
            float r8 = r8 * r9
            X.09W r6 = (X.AnonymousClass09W) r6     // Catch:{ all -> 0x0468 }
            X.0VB r0 = r6.A0O     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x03fc
            boolean r0 = r0.A0C(r2, r1, r7, r8)     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x03fc
        L_0x03ec:
            android.view.VelocityTracker r0 = r5.A0K     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x03f3
            r0.addMovement(r15)     // Catch:{ all -> 0x0468 }
        L_0x03f3:
            r5.A0N = r4     // Catch:{ all -> 0x0468 }
        L_0x03f5:
            r5.A03 = r11     // Catch:{ all -> 0x0468 }
            r5.A04 = r10     // Catch:{ all -> 0x0468 }
            r5.A0F = r12     // Catch:{ all -> 0x0468 }
            goto L_0x045c
        L_0x03fc:
            X.0Pl r0 = r6.A0Q     // Catch:{ all -> 0x0468 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0468 }
            if (r0 == 0) goto L_0x03ec
            r6.requestDisallowInterceptTouchEvent(r4)     // Catch:{ all -> 0x0468 }
            r6.A07()     // Catch:{ all -> 0x0468 }
            double r0 = r6.A02     // Catch:{ all -> 0x0468 }
            long r2 = r6.A0J     // Catch:{ all -> 0x0468 }
            float r9 = (float) r2     // Catch:{ all -> 0x0468 }
            float r13 = r7 / r9
            double r13 = (double) r13     // Catch:{ all -> 0x0468 }
            double r0 = r0 - r13
            double r0 = A00(r0)     // Catch:{ all -> 0x0468 }
            r6.A02 = r0     // Catch:{ all -> 0x0468 }
            double r0 = r6.A03     // Catch:{ all -> 0x0468 }
            float r9 = r8 / r9
            double r13 = (double) r9     // Catch:{ all -> 0x0468 }
            double r0 = r0 - r13
            double r0 = r6.A03(r0, r2)     // Catch:{ all -> 0x0468 }
            r6.A03 = r0     // Catch:{ all -> 0x0468 }
            r6.invalidate()     // Catch:{ all -> 0x0468 }
            X.074 r9 = r6.A0M     // Catch:{ all -> 0x0468 }
            X.0kx r0 = r9.A09     // Catch:{ all -> 0x0468 }
            if (r0 != 0) goto L_0x0434
            java.util.ArrayList r0 = r9.A0W     // Catch:{ all -> 0x0468 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0468 }
            if (r0 != 0) goto L_0x0459
        L_0x0434:
            float r0 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0468 }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0446
            float r0 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x0468 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0459
        L_0x0446:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0468 }
            long r0 = r6.A0I     // Catch:{ all -> 0x0468 }
            long r13 = r2 - r0
            r7 = 200(0xc8, double:9.9E-322)
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0459
            r9.A04()     // Catch:{ all -> 0x0468 }
            r6.A0I = r2     // Catch:{ all -> 0x0468 }
        L_0x0459:
            r6.A0X = r4     // Catch:{ all -> 0x0468 }
            goto L_0x03ec
        L_0x045c:
            X.0V3 r2 = X.AnonymousClass0V3.A0N
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r16
            r2.A04(r0)
            return r4
        L_0x0468:
            r3 = move-exception
            X.0V3 r2 = X.AnonymousClass0V3.A0N
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r16
            r2.A04(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09W.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            A04();
        } else {
            A01();
        }
    }

    public final void setMapEventHandler(C13450m3 r1) {
        if (r1 == null) {
            r1 = C13450m3.A00;
        }
        this.A0T = r1;
    }

    public void setOnFirstTileLoadedCallback(C12170jx r1) {
        this.A0P = r1;
    }
}
