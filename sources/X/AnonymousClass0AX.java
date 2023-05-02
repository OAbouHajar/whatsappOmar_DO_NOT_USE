package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* renamed from: X.0AX  reason: invalid class name */
public abstract class AnonymousClass0AX extends Drawable.ConstantState {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07 = 0;
    public int A08 = 0;
    public int A09;
    public int A0A;
    public int A0B;
    public ColorStateList A0C;
    public Resources A0D;
    public ColorFilter A0E;
    public PorterDuff.Mode A0F;
    public Rect A0G;
    public SparseArray A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P = false;
    public boolean A0Q = true;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W = false;
    public Drawable[] A0X;
    public final C02220Al A0Y;

    public AnonymousClass0AX(Resources resources, AnonymousClass0AX r7, C02220Al r8) {
        this.A0Y = r8;
        Rect rect = null;
        this.A0D = resources != null ? resources : r7 != null ? r7.A0D : null;
        int i2 = resources != null ? resources.getDisplayMetrics().densityDpi : r7 != null ? r7.A06 : 0;
        i2 = i2 == 0 ? 160 : i2;
        this.A06 = i2;
        if (r7 != null) {
            this.A00 = r7.A00;
            this.A01 = r7.A01;
            this.A0L = true;
            this.A0J = true;
            this.A0W = r7.A0W;
            this.A0P = r7.A0P;
            this.A0Q = r7.A0Q;
            this.A0U = r7.A0U;
            this.A09 = r7.A09;
            this.A07 = r7.A07;
            this.A08 = r7.A08;
            this.A0I = r7.A0I;
            this.A0E = r7.A0E;
            this.A0R = r7.A0R;
            this.A0C = r7.A0C;
            this.A0F = r7.A0F;
            this.A0S = r7.A0S;
            this.A0T = r7.A0T;
            if (r7.A06 == i2) {
                if (r7.A0N) {
                    Rect rect2 = r7.A0G;
                    this.A0G = rect2 != null ? new Rect(rect2) : rect;
                    this.A0N = true;
                }
                if (r7.A0K) {
                    this.A05 = r7.A05;
                    this.A02 = r7.A02;
                    this.A04 = r7.A04;
                    this.A03 = r7.A03;
                    this.A0K = true;
                }
            }
            if (r7.A0M) {
                this.A0B = r7.A0B;
                this.A0M = true;
            }
            if (r7.A0O) {
                this.A0V = r7.A0V;
                this.A0O = true;
            }
            Drawable[] drawableArr = r7.A0X;
            this.A0X = new Drawable[drawableArr.length];
            int i3 = r7.A0A;
            this.A0A = i3;
            SparseArray sparseArray = r7.A0H;
            this.A0H = sparseArray != null ? sparseArray.clone() : new SparseArray(i3);
            int i4 = this.A0A;
            for (int i5 = 0; i5 < i4; i5++) {
                if (drawableArr[i5] != null) {
                    Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                    if (constantState != null) {
                        this.A0H.put(i5, constantState);
                    } else {
                        this.A0X[i5] = drawableArr[i5];
                    }
                }
            }
            return;
        }
        this.A0X = new Drawable[10];
        this.A0A = 0;
    }

    public final int A00(Drawable drawable) {
        int i2 = this.A0A;
        if (i2 >= this.A0X.length) {
            A05(i2, i2 + 10);
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.A0Y);
        this.A0X[i2] = drawable;
        this.A0A++;
        this.A01 = drawable.getChangingConfigurations() | this.A01;
        this.A0M = false;
        this.A0O = false;
        this.A0G = null;
        this.A0N = false;
        this.A0K = false;
        this.A0L = false;
        return i2;
    }

    public final Drawable A01(int i2) {
        int indexOfKey;
        Drawable drawable = this.A0X[i2];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.A0H;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.A0H.valueAt(indexOfKey)).newDrawable(this.A0D);
        if (Build.VERSION.SDK_INT >= 23) {
            C018208n.A0D(this.A09, newDrawable);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.A0Y);
        this.A0X[i2] = mutate;
        this.A0H.removeAt(indexOfKey);
        if (this.A0H.size() == 0) {
            this.A0H = null;
        }
        return mutate;
    }

    public void A02() {
        this.A0K = true;
        A03();
        int i2 = this.A0A;
        Drawable[] drawableArr = this.A0X;
        this.A02 = -1;
        this.A05 = -1;
        this.A03 = 0;
        this.A04 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.A05) {
                this.A05 = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.A02) {
                this.A02 = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.A04) {
                this.A04 = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.A03) {
                this.A03 = minimumHeight;
            }
        }
    }

    public final void A03() {
        SparseArray sparseArray = this.A0H;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = this.A0H.keyAt(i2);
                Drawable[] drawableArr = this.A0X;
                Drawable newDrawable = ((Drawable.ConstantState) this.A0H.valueAt(i2)).newDrawable(this.A0D);
                if (Build.VERSION.SDK_INT >= 23) {
                    C018208n.A0D(this.A09, newDrawable);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.A0Y);
                drawableArr[keyAt] = mutate;
            }
            this.A0H = null;
        }
    }

    public abstract void A04();

    public void A05(int i2, int i3) {
        Drawable[] drawableArr = new Drawable[i3];
        Drawable[] drawableArr2 = this.A0X;
        if (drawableArr2 != null) {
            System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
        }
        this.A0X = drawableArr;
    }

    public final void A06(Resources resources) {
        if (resources != null) {
            this.A0D = resources;
            int i2 = resources.getDisplayMetrics().densityDpi;
            if (i2 == 0) {
                i2 = 160;
            }
            int i3 = this.A06;
            this.A06 = i2;
            if (i3 != i2) {
                this.A0K = false;
                this.A0N = false;
            }
        }
    }

    public final boolean A07(int i2, int i3) {
        int i4 = this.A0A;
        Drawable[] drawableArr = this.A0X;
        boolean z2 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean A0D2 = Build.VERSION.SDK_INT >= 23 ? C018208n.A0D(i2, drawableArr[i5]) : false;
                if (i5 == i3) {
                    z2 = A0D2;
                }
            }
        }
        this.A09 = i2;
        return z2;
    }

    public boolean canApplyTheme() {
        boolean A022;
        int i2 = this.A0A;
        Drawable[] drawableArr = this.A0X;
        for (int i3 = 0; i3 < i2; i3++) {
            Drawable drawable = drawableArr[i3];
            if (drawable != null) {
                A022 = C018208n.A0E(drawable);
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.A0H.get(i3);
                if (constantState != null) {
                    A022 = AnonymousClass0VG.A02(constantState);
                } else {
                    continue;
                }
            }
            if (A022) {
                return true;
            }
        }
        return false;
    }

    public int getChangingConfigurations() {
        return this.A00 | this.A01;
    }
}
