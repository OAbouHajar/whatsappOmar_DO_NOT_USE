package X;

import android.graphics.Matrix;
import java.util.ArrayList;

/* renamed from: X.07a  reason: invalid class name and case insensitive filesystem */
public class C014607a extends C014707b {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public String A08;
    public int[] A09;
    public final Matrix A0A;
    public final Matrix A0B;
    public final ArrayList A0C;

    public C014607a() {
        this.A0B = new Matrix();
        this.A0C = new ArrayList();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = new Matrix();
        this.A08 = null;
    }

    public C014607a(AnonymousClass00N r6, C014607a r7) {
        AnonymousClass07f r1;
        this.A0B = new Matrix();
        this.A0C = new ArrayList();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        Matrix matrix = new Matrix();
        this.A0A = matrix;
        this.A08 = null;
        this.A02 = r7.A02;
        this.A00 = r7.A00;
        this.A01 = r7.A01;
        this.A03 = r7.A03;
        this.A04 = r7.A04;
        this.A05 = r7.A05;
        this.A06 = r7.A06;
        this.A09 = r7.A09;
        String str = r7.A08;
        this.A08 = str;
        this.A07 = r7.A07;
        if (str != null) {
            r6.put(str, this);
        }
        matrix.set(r7.A0A);
        ArrayList arrayList = r7.A0C;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof C014607a) {
                this.A0C.add(new C014607a(r6, (C014607a) obj));
            } else {
                if (obj instanceof C015007e) {
                    r1 = new C015007e((C015007e) obj);
                } else if (obj instanceof AnonymousClass0GV) {
                    r1 = new AnonymousClass0GV((AnonymousClass0GV) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.A0C.add(r1);
                String str2 = r1.A02;
                if (str2 != null) {
                    r6.put(str2, r1);
                }
            }
        }
    }

    public boolean A00() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((C014707b) arrayList.get(i2)).A00()) {
                return true;
            }
            i2++;
        }
    }

    public boolean A01(int[] iArr) {
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i2 >= arrayList.size()) {
                return z2;
            }
            z2 |= ((C014707b) arrayList.get(i2)).A01(iArr);
            i2++;
        }
    }

    public final void A02() {
        Matrix matrix = this.A0A;
        matrix.reset();
        matrix.postTranslate(-this.A00, -this.A01);
        matrix.postScale(this.A03, this.A04);
        matrix.postRotate(this.A02, 0.0f, 0.0f);
        matrix.postTranslate(this.A05 + this.A00, this.A06 + this.A01);
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public void setPivotX(float f2) {
        if (f2 != this.A00) {
            this.A00 = f2;
            A02();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.A01) {
            this.A01 = f2;
            A02();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.A02) {
            this.A02 = f2;
            A02();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.A03) {
            this.A03 = f2;
            A02();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.A04) {
            this.A04 = f2;
            A02();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.A05) {
            this.A05 = f2;
            A02();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.A06) {
            this.A06 = f2;
            A02();
        }
    }
}
