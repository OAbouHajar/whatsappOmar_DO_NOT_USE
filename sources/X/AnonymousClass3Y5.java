package X;

import android.os.Parcel;

/* renamed from: X.3Y5  reason: invalid class name */
public class AnonymousClass3Y5 extends C15710ri {
    public static final C92484hd CREATOR = new C92484hd();
    public C107815Ln A00;
    public C65983Xi A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Class A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass3Y5(C66073Xr r3, String str, String str2, int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        this.A05 = i2;
        this.A02 = i3;
        this.A09 = z2;
        this.A03 = i4;
        this.A0A = z3;
        this.A07 = str;
        this.A04 = i5;
        AnonymousClass3YI r1 = null;
        if (str2 == null) {
            this.A06 = null;
            this.A08 = null;
        } else {
            this.A06 = AnonymousClass3YP.class;
            this.A08 = str2;
        }
        if (r3 == null || (r1 = r3.A01) != null) {
            this.A00 = r1;
            return;
        }
        throw AnonymousClass000.A0V("There was no converter wrapped in this ConverterWrapper.");
    }

    public AnonymousClass3Y5(Class cls, String str, int i2, int i3, int i4, boolean z2, boolean z3) {
        this.A05 = 1;
        this.A02 = i2;
        this.A09 = z2;
        this.A03 = i3;
        this.A0A = z3;
        this.A07 = str;
        this.A04 = i4;
        this.A06 = cls;
        this.A08 = cls == null ? null : cls.getCanonicalName();
        this.A00 = null;
    }

    public static AnonymousClass3Y5 A03(String str, int i2) {
        return new AnonymousClass3Y5((Class) null, str, 7, 7, i2, true, true);
    }

    public final String toString() {
        C13930oJ r2 = new C13930oJ(this);
        r2.A00(Integer.valueOf(this.A05), "versionCode");
        r2.A00(Integer.valueOf(this.A02), "typeIn");
        r2.A00(Boolean.valueOf(this.A09), "typeInArray");
        r2.A00(Integer.valueOf(this.A03), "typeOut");
        r2.A00(Boolean.valueOf(this.A0A), "typeOutArray");
        r2.A00(this.A07, "outputFieldName");
        r2.A00(Integer.valueOf(this.A04), "safeParcelFieldId");
        String str = this.A08;
        if (str == null) {
            str = null;
        }
        r2.A00(str, "concreteTypeName");
        Class cls = this.A06;
        if (cls != null) {
            r2.A00(cls.getCanonicalName(), "concreteType.class");
        }
        C107815Ln r0 = this.A00;
        if (r0 != null) {
            r2.A00(r0.getClass().getCanonicalName(), "converterName");
        }
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        C66073Xr r1;
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A05);
        C32251fv.A06(parcel, 2, this.A02);
        C32251fv.A08(parcel, 3, this.A09);
        C32251fv.A06(parcel, 4, this.A03);
        C32251fv.A08(parcel, 5, this.A0A);
        C32251fv.A0A(parcel, this.A07, 6, false);
        C32251fv.A06(parcel, 7, this.A04);
        String str = this.A08;
        if (str == null) {
            str = null;
        }
        C32251fv.A0A(parcel, str, 8, false);
        C107815Ln r2 = this.A00;
        if (r2 == null) {
            r1 = null;
        } else if (r2 instanceof AnonymousClass3YI) {
            r1 = new C66073Xr((AnonymousClass3YI) r2);
        } else {
            throw AnonymousClass000.A0T("Unsupported safe parcelable field converter class.");
        }
        C32251fv.A09(parcel, r1, 9, i2, false);
        C32251fv.A05(parcel, A002);
    }
}
