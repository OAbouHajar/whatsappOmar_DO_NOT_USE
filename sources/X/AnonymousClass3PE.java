package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxObjectShape26S0000000_2_I1;

/* renamed from: X.3PE  reason: invalid class name */
public class AnonymousClass3PE extends C018308o {
    public static final Parcelable.Creator CREATOR = new IDxObjectShape26S0000000_2_I1(2);
    public CharSequence A00;
    public boolean A01;

    public AnonymousClass3PE(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A01 = C13690nt.A1R(parcel.readInt());
    }

    public AnonymousClass3PE(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("TextInputLayout.SavedState{");
        AnonymousClass000.A1G(this, A0r);
        A0r.append(" error=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("}", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        TextUtils.writeToParcel(this.A00, parcel, i2);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
