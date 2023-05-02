package X;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: X.0WR  reason: invalid class name */
public class AnonymousClass0WR {
    public static AnonymousClass0BG A0K;
    public static final Interpolator A0L = new AccelerateDecelerateInterpolator();
    public static final C06220Uu A0M = new C06220Uu(64);
    public static final Object A0N = new Object();
    public static final ArrayList A0O = AnonymousClass000.A0u();
    public static final ArrayList A0P = AnonymousClass000.A0u();
    public static final ArrayList A0Q = AnonymousClass000.A0u();
    public static final ArrayList A0R = AnonymousClass000.A0u();
    public static final ArrayList A0S = AnonymousClass000.A0u();
    public float A00;
    public float A01;
    public int A02 = 0;
    public int A03;
    public int A04 = 0;
    public int A05 = 0;
    public long A06;
    public long A07 = 300;
    public long A08 = -1;
    public long A09;
    public Interpolator A0A = A0L;
    public ArrayList A0B = null;
    public ArrayList A0C = null;
    public boolean A0D = true;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public float[] A0I = new float[2];
    public float[] A0J = new float[2];

    public static AnonymousClass0WR A00(float f2, float f3) {
        AnonymousClass0WR r4 = (AnonymousClass0WR) A0M.A00();
        if (r4 == null) {
            r4 = new AnonymousClass0WR();
        }
        r4.A03 = 2;
        float[] fArr = r4.A0I;
        fArr[0] = 0.0f;
        float[] fArr2 = r4.A0J;
        fArr2[0] = f2;
        fArr[1] = 1.0f;
        fArr2[1] = f3;
        r4.A0E = false;
        return r4;
    }

    public void A01() {
        ArrayList arrayList;
        if (this.A04 != 0 || A0R.contains(this) || A0P.contains(this)) {
            if (this.A0F && (arrayList = this.A0B) != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass074 r2 = (AnonymousClass074) this.A0B.get(i2);
                    if (this == r2.A0J) {
                        r2.A0J = null;
                    } else if (this == r2.A0K) {
                        r2.A0K = null;
                    } else if (this == r2.A0L) {
                        r2.A0L = null;
                    } else if (this == r2.A0I) {
                        r2.A0I = null;
                    }
                    A02();
                    if (r2.A0J == null && r2.A0K == null && r2.A0L == null && r2.A0I == null) {
                        r2.A0M = false;
                        AnonymousClass077 r0 = r2.A07;
                        if (r0 != null) {
                            r2.A07 = null;
                            r0.AO4();
                        }
                        r2.A04();
                    }
                }
            }
            A04();
        }
    }

    public void A02() {
        ArrayList arrayList = this.A0B;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.A0C;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.A09 = 0;
        this.A08 = -1;
        this.A02 = 0;
        this.A0H = false;
        this.A06 = 0;
        this.A04 = 0;
        this.A0F = false;
        this.A0G = false;
        this.A0E = false;
        this.A07 = 300;
        this.A05 = 0;
        this.A0A = A0L;
        this.A00 = 0.0f;
        this.A0D = true;
        A0M.A02(this);
    }

    public void A03() {
        AnonymousClass0BG r0;
        if (Looper.myLooper() != null) {
            this.A02 = 0;
            this.A04 = 0;
            this.A0G = true;
            this.A0H = false;
            A0R.add(this);
            long currentAnimationTimeMillis = (!this.A0E || this.A04 == 0) ? 0 : AnimationUtils.currentAnimationTimeMillis() - this.A09;
            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            if (this.A04 != 1) {
                this.A08 = currentAnimationTimeMillis;
                int i2 = 0;
                if (this.A0E) {
                    i2 = 2;
                }
                this.A04 = i2;
            }
            this.A09 = currentAnimationTimeMillis2 - currentAnimationTimeMillis;
            this.A0E = true;
            A08(currentAnimationTimeMillis2);
            this.A0F = true;
            ArrayList arrayList = this.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.get(i3);
                }
            }
            synchronized (A0N) {
                r0 = A0K;
                if (r0 == null) {
                    r0 = new AnonymousClass0BG();
                    A0K = r0;
                }
            }
            r0.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    public final void A04() {
        A0O.remove(this);
        A0R.remove(this);
        A0P.remove(this);
        this.A04 = 0;
        this.A0G = false;
        if (this.A0F) {
            this.A0F = false;
            ArrayList arrayList = this.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    AnonymousClass074 r2 = (AnonymousClass074) this.A0B.get(i2);
                    if (this == r2.A0J) {
                        r2.A0J = null;
                    } else if (this == r2.A0K) {
                        r2.A0K = null;
                    } else if (this == r2.A0L) {
                        r2.A0L = null;
                    } else if (this == r2.A0I) {
                        r2.A0I = null;
                    }
                    A02();
                    if (r2.A0M && r2.A0J == null && r2.A0K == null && r2.A0L == null && r2.A0I == null) {
                        r2.A0M = false;
                        AnonymousClass077 r0 = r2.A07;
                        if (r0 != null) {
                            r2.A07 = null;
                            r0.ARM();
                        }
                        r2.A04();
                    }
                }
            }
        }
    }

    public void A05(long j2) {
        if (j2 >= 0) {
            this.A07 = j2;
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Animators cannot have negative duration: ");
        A0r.append(j2);
        throw AnonymousClass000.A0T(A0r.toString());
    }

    public void A06(AnonymousClass074 r2) {
        ArrayList arrayList = this.A0B;
        if (arrayList == null) {
            arrayList = AnonymousClass000.A0u();
            this.A0B = arrayList;
        }
        arrayList.add(r2);
    }

    public void A07(AnonymousClass075 r2) {
        ArrayList arrayList = this.A0C;
        if (arrayList == null) {
            arrayList = AnonymousClass000.A0u();
            this.A0C = arrayList;
        }
        arrayList.add(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r3 >= 1.0f) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(long r12) {
        /*
            r11 = this;
            int r0 = r11.A04
            r9 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0011
            r11.A04 = r5
            long r2 = r11.A08
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d8
            r11.A09 = r12
        L_0x0011:
            long r6 = r11.A07
            r8 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d4
            long r0 = r11.A09
            long r12 = r12 - r0
            float r3 = (float) r12
            float r0 = (float) r6
            float r3 = r3 / r0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00d1
        L_0x0023:
            int r4 = r11.A02
            int r1 = r11.A05
            if (r4 < r1) goto L_0x00b6
            r0 = -1
            if (r1 == r0) goto L_0x00b6
            float r3 = java.lang.Math.min(r3, r8)
        L_0x0030:
            int r1 = r11.A03
            r7 = 2
            r2 = 0
            r4 = 1
            if (r1 != r7) goto L_0x006f
            boolean r0 = r11.A0D
            if (r0 == 0) goto L_0x0046
            r11.A0D = r2
            float[] r0 = r11.A0J
            r1 = r0[r4]
            r0 = r0[r2]
            float r1 = r1 - r0
            r11.A01 = r1
        L_0x0046:
            android.view.animation.Interpolator r0 = r11.A0A
            float r6 = r0.getInterpolation(r3)
            float[] r0 = r11.A0J
            r2 = r0[r2]
            float r0 = r11.A01
        L_0x0052:
            float r6 = r6 * r0
        L_0x0053:
            float r2 = r2 + r6
        L_0x0054:
            r11.A00 = r2
            java.util.ArrayList r0 = r11.A0C
            if (r0 == 0) goto L_0x00e2
            r2 = 0
            int r1 = r0.size()
        L_0x005f:
            if (r2 >= r1) goto L_0x00e2
            java.util.ArrayList r0 = r11.A0C
            java.lang.Object r0 = r0.get(r2)
            X.075 r0 = (X.AnonymousClass075) r0
            r0.AMU(r11)
            int r2 = r2 + 1
            goto L_0x005f
        L_0x006f:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x008b
            android.view.animation.Interpolator r0 = r11.A0A
            float r6 = r0.getInterpolation(r3)
            float[] r0 = r11.A0I
            r1 = r0[r2]
            float r6 = r6 - r1
            r0 = r0[r4]
            float r0 = r0 - r1
            float r6 = r6 / r0
            float[] r0 = r11.A0J
            r2 = r0[r2]
            r0 = r0[r4]
            float r0 = r0 - r2
            goto L_0x0052
        L_0x008b:
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00b0
            android.view.animation.Interpolator r0 = r11.A0A
            float r6 = r0.getInterpolation(r3)
            float[] r0 = r11.A0I
            int r4 = r11.A03
            int r3 = r4 + -2
            r2 = r0[r3]
            float r6 = r6 - r2
            int r1 = r4 + -1
            r0 = r0[r1]
            float r0 = r0 - r2
            float r6 = r6 / r0
            float[] r0 = r11.A0J
            r2 = r0[r3]
            r1 = r0[r1]
            int r4 = r4 - r7
            r0 = r0[r4]
            float r1 = r1 - r0
            float r6 = r6 * r1
            goto L_0x0053
        L_0x00b0:
            float[] r0 = r11.A0J
            int r1 = r1 - r4
            r2 = r0[r1]
            goto L_0x0054
        L_0x00b6:
            java.util.ArrayList r2 = r11.A0B
            if (r2 == 0) goto L_0x00c7
            int r1 = r2.size()
            r0 = 0
        L_0x00bf:
            if (r0 >= r1) goto L_0x00c7
            r2.get(r0)
            int r0 = r0 + 1
            goto L_0x00bf
        L_0x00c7:
            int r0 = (int) r3
            int r4 = r4 + r0
            r11.A02 = r4
            float r3 = r3 % r8
            long r0 = r11.A09
            long r0 = r0 + r6
            r11.A09 = r0
        L_0x00d1:
            r5 = 0
            goto L_0x0030
        L_0x00d4:
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0023
        L_0x00d8:
            long r0 = r12 - r2
            r11.A09 = r0
            r0 = -1
            r11.A08 = r0
            goto L_0x0011
        L_0x00e2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WR.A08(long):boolean");
    }
}
