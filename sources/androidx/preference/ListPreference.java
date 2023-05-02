package androidx.preference;

import X.AnonymousClass0FI;
import X.AnonymousClass0NL;
import X.C014907d;
import X.C07550c5;
import X.C12460kR;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import com.obwhatsapp.R;

public class ListPreference extends DialogPreference {
    public String A00;
    public String A01;
    public boolean A02;
    public CharSequence[] A03;
    public CharSequence[] A04;

    public ListPreference(Context context) {
        this(context, (AttributeSet) null);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C014907d.A00(context, R.attr.attr0141, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0NL.A04, i2, i3);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.A03 = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(3);
        this.A04 = textArray2 == null ? obtainStyledAttributes.getTextArray(1) : textArray2;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            C07550c5 r0 = C07550c5.A00;
            if (r0 == null) {
                r0 = new C07550c5();
                C07550c5.A00 = r0;
            }
            this.A0D = r0;
            A04();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AnonymousClass0NL.A06, i2, i3);
        String string = obtainStyledAttributes2.getString(33);
        this.A00 = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    public Parcelable A01() {
        this.A0P = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.A0X) {
            return absSavedState;
        }
        AnonymousClass0FI r1 = new AnonymousClass0FI((Parcelable) absSavedState);
        r1.A00 = this.A01;
        return r1;
    }

    public CharSequence A02() {
        C12460kR r0 = this.A0D;
        if (r0 != null) {
            return r0.Aau(this);
        }
        Object A0T = A0T();
        CharSequence A022 = super.A02();
        String str = this.A00;
        if (str != null) {
            Object[] objArr = new Object[1];
            if (A0T == null) {
                A0T = "";
            }
            objArr[0] = A0T;
            String format = String.format(str, objArr);
            if (!TextUtils.equals(format, A022)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return A022;
    }

    public Object A03(TypedArray typedArray, int i2) {
        return typedArray.getString(i2);
    }

    public void A0D(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(AnonymousClass0FI.class)) {
            super.A0D(parcelable);
            return;
        }
        AnonymousClass0FI r3 = (AnonymousClass0FI) parcelable;
        super.A0D(r3.getSuperState());
        A0U(r3.A00);
    }

    public void A0I(CharSequence charSequence) {
        String charSequence2;
        super.A0I(charSequence);
        String str = this.A00;
        if (charSequence == null) {
            if (str != null) {
                charSequence2 = null;
            } else {
                return;
            }
        } else if (!charSequence.equals(str)) {
            charSequence2 = charSequence.toString();
        } else {
            return;
        }
        this.A00 = charSequence2;
    }

    public void A0J(Object obj) {
        String str = (String) obj;
        if (A0P()) {
            str = this.A0F.A01().getString(this.A0L, str);
        }
        A0U(str);
    }

    public int A0S(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.A04) == null) {
            return -1;
        }
        int length = charSequenceArr.length;
        do {
            length--;
            if (length < 0) {
                return -1;
            }
        } while (!this.A04[length].equals(str));
        return length;
    }

    public CharSequence A0T() {
        CharSequence[] charSequenceArr;
        int A0S = A0S(this.A01);
        if (A0S < 0 || (charSequenceArr = this.A03) == null) {
            return null;
        }
        return charSequenceArr[A0S];
    }

    public void A0U(String str) {
        boolean z2 = !TextUtils.equals(this.A01, str);
        if (z2 || !this.A02) {
            this.A01 = str;
            this.A02 = true;
            A0K(str);
            if (z2) {
                A04();
            }
        }
    }

    public void A0V(CharSequence[] charSequenceArr) {
        this.A03 = charSequenceArr;
    }
}
