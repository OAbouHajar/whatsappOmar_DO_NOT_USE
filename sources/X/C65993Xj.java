package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Xj  reason: invalid class name and case insensitive filesystem */
public final class C65993Xj extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92944iO();
    public byte[] A00;
    public final Uri A01;
    public final Map A02;

    public C65993Xj(Uri uri, Bundle bundle, byte[] bArr) {
        this.A01 = uri;
        HashMap A0x = AnonymousClass000.A0x();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        Iterator it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            A0x.put(A0m, bundle.getParcelable(A0m));
        }
        this.A02 = A0x;
        this.A00 = bArr;
    }

    public final String toString() {
        String str;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder A0r = AnonymousClass000.A0r("DataItemParcelable[");
        A0r.append("@");
        A0r.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.A00;
        String valueOf = String.valueOf(bArr == null ? "null" : Integer.valueOf(bArr.length));
        StringBuilder A0g = C13690nt.A0g(valueOf.length() + 8);
        A0g.append(",dataSz=");
        A0r.append(AnonymousClass000.A0h(valueOf, A0g));
        Map map = this.A02;
        A0r.append(C13680ns.A0i(", numAssets=", C13690nt.A0g(23), map.size()));
        String valueOf2 = String.valueOf(this.A01);
        StringBuilder A0g2 = C13690nt.A0g(valueOf2.length() + 6);
        A0g2.append(", uri=");
        A0r.append(AnonymousClass000.A0h(valueOf2, A0g2));
        if (!isLoggable) {
            str = "]";
        } else {
            A0r.append("]\n  assets: ");
            Iterator A0I = C13700nu.A0I(map);
            while (A0I.hasNext()) {
                String A0m = AnonymousClass000.A0m(A0I);
                String valueOf3 = String.valueOf(map.get(A0m));
                StringBuilder A0g3 = C13690nt.A0g(C13680ns.A06(A0m) + 7 + valueOf3.length());
                A0g3.append("\n    ");
                AnonymousClass3K4.A13(A0g3, A0m);
                A0r.append(AnonymousClass000.A0h(valueOf3, A0g3));
            }
            str = "\n  ]";
        }
        return AnonymousClass000.A0h(str, A0r);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A09(parcel, this.A01, 2, i2, false);
        Bundle A0D = C13690nt.A0D();
        A0D.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        Iterator A0y = AnonymousClass000.A0y(this.A02);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0y);
            A0D.putParcelable((String) A0z.getKey(), new DataItemAssetParcelable((AnonymousClass5ME) A0z.getValue()));
        }
        C32251fv.A02(A0D, parcel, 4);
        C32251fv.A0D(parcel, this.A00, 5, false);
        C32251fv.A05(parcel, A002);
    }
}
