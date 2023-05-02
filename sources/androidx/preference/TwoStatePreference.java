package androidx.preference;

import X.AnonymousClass000;
import X.AnonymousClass0FL;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;

public abstract class TwoStatePreference extends Preference {
    public CharSequence A00;
    public CharSequence A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public TwoStatePreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    public Parcelable A01() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        AnonymousClass0FL r1 = new AnonymousClass0FL((Parcelable) absSavedState);
        r1.A00 = this.A02;
        return r1;
    }

    public Object A03(TypedArray typedArray, int i2) {
        return Boolean.valueOf(typedArray.getBoolean(i2, false));
    }

    public void A07() {
        boolean z2 = !this.A02;
        A0Q(Boolean.valueOf(z2));
        A0T(z2);
    }

    public void A0D(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(AnonymousClass0FL.class)) {
            super.A0D(parcelable);
            return;
        }
        AnonymousClass0FL r3 = (AnonymousClass0FL) parcelable;
        super.A0D(r3.getSuperState());
        A0T(r3.A00);
    }

    public void A0J(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean A1X = AnonymousClass000.A1X(obj);
        if (A0P()) {
            A1X = this.A0F.A01().getBoolean(this.A0L, A1X);
        }
        A0T(A1X);
    }

    public boolean A0O() {
        boolean z2 = this.A04;
        boolean z3 = this.A02;
        if (z2) {
            if (z3) {
                return true;
            }
        } else if (!z3) {
            return true;
        }
        return A0N() ^ true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(android.view.View r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x0021
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r0 = r3.A02
            r2 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.CharSequence r0 = r3.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0022
            java.lang.CharSequence r0 = r3.A01
        L_0x0015:
            r4.setText(r0)
        L_0x0018:
            int r0 = r4.getVisibility()
            if (r2 == r0) goto L_0x0021
            r4.setVisibility(r2)
        L_0x0021:
            return
        L_0x0022:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0031
            java.lang.CharSequence r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0031
            java.lang.CharSequence r0 = r3.A00
            goto L_0x0015
        L_0x0031:
            java.lang.CharSequence r1 = r3.A02()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003f
            r4.setText(r1)
            goto L_0x0018
        L_0x003f:
            r2 = 8
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.A0S(android.view.View):void");
    }

    public void A0T(boolean z2) {
        boolean z3 = true;
        if (this.A02 == z2) {
            z3 = false;
            if (this.A03) {
                return;
            }
        }
        this.A02 = z2;
        this.A03 = true;
        if (A0P()) {
            boolean z4 = !z2;
            if (A0P()) {
                z4 = this.A0F.A01().getBoolean(this.A0L, z4);
            }
            if (z2 != z4) {
                SharedPreferences.Editor A002 = this.A0F.A00();
                A002.putBoolean(this.A0L, z2);
                if (!this.A0F.A09) {
                    A002.apply();
                }
            }
        }
        if (z3) {
            A0L(A0O());
            A04();
        }
    }
}
