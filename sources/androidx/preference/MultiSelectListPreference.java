package androidx.preference;

import X.AnonymousClass0FJ;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.HashSet;
import java.util.Set;

public class MultiSelectListPreference extends DialogPreference {
    public Set A00 = new HashSet();
    public CharSequence[] A01;
    public CharSequence[] A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r1 = 2130968897(0x7f040141, float:1.754646E38)
            r0 = 16842897(0x1010091, float:2.3693964E-38)
            int r2 = X.C014907d.A00(r4, r1, r0)
            r1 = 0
            r3.<init>(r4, r5, r2, r1)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.A00 = r0
            int[] r0 = X.AnonymousClass0NL.A05
            android.content.res.TypedArray r2 = r4.obtainStyledAttributes(r5, r0, r2, r1)
            r0 = 2
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L_0x0026
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L_0x0026:
            r3.A01 = r0
            r0 = 3
            r1 = 1
            java.lang.CharSequence[] r0 = r2.getTextArray(r0)
            if (r0 != 0) goto L_0x0034
            java.lang.CharSequence[] r0 = r2.getTextArray(r1)
        L_0x0034:
            r3.A02 = r0
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public Parcelable A01() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        AnonymousClass0FJ r1 = new AnonymousClass0FJ((Parcelable) absSavedState);
        r1.A00 = this.A00;
        return r1;
    }

    public Object A03(TypedArray typedArray, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public void A0D(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(AnonymousClass0FJ.class)) {
            super.A0D(parcelable);
            return;
        }
        AnonymousClass0FJ r3 = (AnonymousClass0FJ) parcelable;
        super.A0D(r3.getSuperState());
        A0S(r3.A00);
    }

    public void A0J(Object obj) {
        Set<String> set = (Set) obj;
        if (A0P()) {
            set = this.A0F.A01().getStringSet(this.A0L, set);
        }
        A0S(set);
    }

    public void A0S(Set set) {
        Set set2 = this.A00;
        set2.clear();
        set2.addAll(set);
        if (A0P()) {
            Set<String> set3 = null;
            if (A0P()) {
                set3 = this.A0F.A01().getStringSet(this.A0L, (Set) null);
            }
            if (!set.equals(set3)) {
                SharedPreferences.Editor A002 = this.A0F.A00();
                A002.putStringSet(this.A0L, set);
                if (!this.A0F.A09) {
                    A002.apply();
                }
            }
        }
        A04();
    }
}
