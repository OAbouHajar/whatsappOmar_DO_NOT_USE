package com.google.android.gms.auth.api.signin;

import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C107825Lo;
import X.C13680ns;
import X.C15710ri;
import X.C32251fv;
import X.C92274hI;
import X.C98074r3;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoogleSignInAccount extends C15710ri implements ReflectedParcelable {
    public static C107825Lo A0D = C98074r3.A00;
    public static final Parcelable.Creator CREATOR = new C92274hI();
    public long A00;
    public Uri A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public Set A0B = C13680ns.A0o();
    public final int A0C;

    public GoogleSignInAccount(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i2, long j2) {
        this.A0C = i2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = uri;
        this.A06 = str5;
        this.A00 = j2;
        this.A07 = str6;
        this.A0A = list;
        this.A08 = str7;
        this.A09 = str8;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.A07.equals(this.A07)) {
                        HashSet hashSet = new HashSet(googleSignInAccount.A0A);
                        hashSet.addAll(googleSignInAccount.A0B);
                        HashSet hashSet2 = new HashSet(this.A0A);
                        hashSet2.addAll(this.A0B);
                        if (hashSet.equals(hashSet2)) {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.A07.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.A0A);
        hashSet.addAll(this.A0B);
        return AnonymousClass3K2.A06(hashSet, hashCode);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A0C);
        boolean A1R = AnonymousClass3K3.A1R(parcel, this.A02);
        C32251fv.A0A(parcel, this.A03, 3, A1R);
        C32251fv.A0A(parcel, this.A04, 4, A1R);
        C32251fv.A0A(parcel, this.A05, 5, A1R);
        C32251fv.A09(parcel, this.A01, 6, i2, A1R);
        C32251fv.A0A(parcel, this.A06, 7, A1R);
        C32251fv.A07(parcel, 8, this.A00);
        C32251fv.A0A(parcel, this.A07, 9, A1R);
        C32251fv.A0C(parcel, this.A0A, 10, A1R);
        C32251fv.A0A(parcel, this.A08, 11, A1R);
        C32251fv.A0A(parcel, this.A09, 12, A1R);
        C32251fv.A05(parcel, A002);
    }
}
