package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.1lh  reason: invalid class name and case insensitive filesystem */
public class C35301lh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(71);
    public Object A00;
    public final C53862gQ A01;
    public final Class A02;
    public final String A03;

    public C35301lh(C53862gQ r1, Class cls, Object obj, String str) {
        this.A03 = str;
        this.A01 = r1;
        this.A02 = cls;
        this.A00 = obj;
    }

    public C35301lh(Parcel parcel) {
        C53862gQ r0;
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A03 = readString;
        int readInt = parcel.readInt();
        if (readInt == 1) {
            r0 = new C53852gP();
        } else if (readInt == 2) {
            r0 = new C102624zG();
        } else if (readInt == 3) {
            r0 = new C102634zH(parcel);
        } else {
            throw new AssertionError("[PrivacyPolicy] Unknown executor read from parcel");
        }
        this.A01 = r0;
        Object readValue = parcel.readValue(Class.class.getClassLoader());
        AnonymousClass00B.A06(readValue);
        Class cls = (Class) readValue;
        this.A02 = cls;
        this.A00 = parcel.readValue(cls.getClassLoader());
    }

    public boolean A00() {
        boolean isEmpty;
        Object obj = this.A00;
        if (obj == null) {
            return true;
        }
        Class<String> cls = this.A02;
        if (cls == String.class) {
            isEmpty = ((String) obj).isEmpty();
        } else if (cls.isArray()) {
            return Array.getLength(obj) == 0;
        } else {
            if (obj instanceof Collection) {
                isEmpty = ((Collection) obj).isEmpty();
            } else if (obj instanceof Map) {
                isEmpty = ((Map) obj).isEmpty();
            } else {
                throw new UnsupportedOperationException("empty check not implemented for class type");
            }
        }
        return isEmpty;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C35301lh r5 = (C35301lh) obj;
            if (!this.A03.equals(r5.A03) || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02) || !C34901l3.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A01, this.A02, this.A00});
    }

    public String toString() {
        String A53 = this.A01.A53(this.A03, this.A00);
        return A53 == null ? "null" : A53;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3;
        parcel.writeString(this.A03);
        C53862gQ r1 = this.A01;
        if (r1 instanceof C53852gP) {
            i3 = 1;
        } else if (r1 instanceof C102624zG) {
            i3 = 2;
        } else if (r1 instanceof C102634zH) {
            parcel.writeInt(3);
            throw new NullPointerException("getClass");
        } else {
            throw new AssertionError("[PrivacyPolicy] Unknown executor written to parcel");
        }
        parcel.writeInt(i3);
        parcel.writeValue(this.A02);
        parcel.writeValue(this.A00);
    }
}
