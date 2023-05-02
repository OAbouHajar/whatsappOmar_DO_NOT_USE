package androidx.preference;

import X.AnonymousClass0FH;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.AbsSavedState;

public class EditTextPreference extends DialogPreference {
    public String A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130968928(0x7f040160, float:1.7546523E38)
            r0 = 16842898(0x1010092, float:2.3693967E-38)
            int r1 = X.C014907d.A00(r4, r1, r0)
            r2 = 0
            r3.<init>(r4, r5, r1, r2)
            int[] r0 = X.AnonymousClass0NL.A03
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r0, r1, r2)
            boolean r0 = r1.getBoolean(r2, r2)
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L_0x002e
            X.0c4 r0 = X.C07540c4.A00
            if (r0 != 0) goto L_0x0029
            X.0c4 r0 = new X.0c4
            r0.<init>()
            X.C07540c4.A00 = r0
        L_0x0029:
            r3.A0D = r0
            r3.A04()
        L_0x002e:
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public Parcelable A01() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        AnonymousClass0FH r1 = new AnonymousClass0FH((Parcelable) absSavedState);
        r1.A00 = this.A00;
        return r1;
    }

    public Object A03(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public void A0D(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(AnonymousClass0FH.class)) {
            super.A0D(parcelable);
            return;
        }
        AnonymousClass0FH r3 = (AnonymousClass0FH) parcelable;
        super.A0D(r3.getSuperState());
        A0S(r3.A00);
    }

    public void A0J(Object obj) {
        String str = (String) obj;
        if (A0P()) {
            str = this.A0F.A01().getString(this.A0L, str);
        }
        A0S(str);
    }

    public boolean A0O() {
        return TextUtils.isEmpty(this.A00) || (A0N() ^ true);
    }

    public void A0S(String str) {
        boolean A0O = A0O();
        this.A00 = str;
        A0K(str);
        boolean A0O2 = A0O();
        if (A0O2 != A0O) {
            A0L(A0O2);
        }
        A04();
    }
}
