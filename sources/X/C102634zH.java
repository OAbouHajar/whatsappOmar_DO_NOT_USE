package X;

import android.os.Parcel;

/* renamed from: X.4zH  reason: invalid class name and case insensitive filesystem */
public class C102634zH implements C53862gQ {
    public C102634zH(Parcel parcel) {
        Object readValue = parcel.readValue(Class.class.getClassLoader());
        AnonymousClass00B.A06(readValue);
        parcel.readParcelable(((Class) readValue).getClassLoader());
        AnonymousClass00B.A06((Object) null);
    }

    public String A53(String str, Object obj) {
        throw AnonymousClass000.A0W("get");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw AnonymousClass000.A0W("equals");
    }

    public int hashCode() {
        return AnonymousClass3K2.A07((Object) null, C13680ns.A1b());
    }
}
