package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.1lc  reason: invalid class name and case insensitive filesystem */
public class C35251lc implements Parcelable {
    public static final Map A0F;
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(75);
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public final C28411Vz A04;
    public final C35221lZ A05;
    public final C35211lY A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final boolean A0D;
    public final byte[] A0E;

    static {
        HashMap hashMap = new HashMap();
        A0F = hashMap;
        hashMap.put(1, new HashSet(Arrays.asList(new Integer[]{2, 5, 6, 3, 4})));
        hashMap.put(2, new HashSet(Arrays.asList(new Integer[]{5, 6, 3, 4})));
        hashMap.put(5, new HashSet(Arrays.asList(new Integer[]{2, 6, 3, 4})));
        hashMap.put(6, new HashSet(Arrays.asList(new Integer[]{2, 5, 3, 4})));
    }

    public C35251lc(C28411Vz r2, C35221lZ r3, C35211lY r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, byte[] bArr, long j2, boolean z2) {
        this.A0E = bArr;
        this.A0A = str;
        this.A06 = r4;
        this.A09 = str2;
        this.A0B = str3;
        this.A04 = r2;
        this.A07 = str4;
        this.A08 = str5;
        this.A05 = r3;
        this.A03 = str6;
        this.A02 = str7;
        this.A01 = str8;
        this.A00 = j2;
        this.A0D = z2;
        this.A0C = list;
    }

    public C35251lc(Parcel parcel) {
        this.A0E = parcel.createByteArray();
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A0A = readString;
        Parcelable readParcelable = parcel.readParcelable(C35211lY.class.getClassLoader());
        AnonymousClass00B.A06(readParcelable);
        this.A06 = (C35211lY) readParcelable;
        String readString2 = parcel.readString();
        AnonymousClass00B.A06(readString2);
        this.A09 = readString2;
        this.A0B = parcel.readString();
        this.A04 = AnonymousClass173.A00(parcel);
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        Parcelable readParcelable2 = parcel.readParcelable(C35221lZ.class.getClassLoader());
        AnonymousClass00B.A06(readParcelable2);
        this.A05 = (C35221lZ) readParcelable2;
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A0D = parcel.readInt() != 1 ? false : true;
        ArrayList arrayList = new ArrayList();
        this.A0C = arrayList;
        parcel.readList(arrayList, C35231la.class.getClassLoader());
    }

    public static int A00(String str) {
        if ("pending".equals(str)) {
            return 1;
        }
        if ("processing".equals(str)) {
            return 2;
        }
        if ("completed".equals(str)) {
            return 3;
        }
        if ("canceled".equals(str)) {
            return 4;
        }
        if ("partially_shipped".equals(str)) {
            return 5;
        }
        if ("shipped".equals(str)) {
            return 6;
        }
        StringBuilder sb = new StringBuilder("CheckoutInfoContent/getOrderStatus can not recognise order status: ");
        sb.append(str);
        Log.w(sb.toString());
        return 0;
    }

    public int A01() {
        String str = this.A0B;
        if ("digital-goods".equals(str)) {
            return 1;
        }
        return "physical-goods".equals(str) ? 2 : 0;
    }

    public C35431lv A02(C35211lY r6) {
        long abs = Math.abs(r6.A01);
        int i2 = r6.A00;
        C28411Vz r4 = this.A04;
        if (i2 <= 0) {
            i2 = 1;
        }
        return new C35431lv(r4, i2, abs);
    }

    public String A03(AnonymousClass013 r4) {
        String A042 = A04(r4, this.A06);
        if (A042 != null) {
            return A042;
        }
        C28411Vz r2 = this.A04;
        AnonymousClass00B.A06(r2);
        return r2.A9I(r4, BigDecimal.ZERO, 0);
    }

    public String A04(AnonymousClass013 r6, C35211lY r7) {
        if (r7 == null || r7.A01 == 0) {
            return null;
        }
        C35431lv A022 = A02(r7);
        C28411Vz r2 = this.A04;
        AnonymousClass00B.A06(r2);
        return r2.A9I(r6, A022.A02.A00, 0);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByteArray(this.A0E);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A06, i2);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0B);
        this.A04.writeToParcel(parcel, i2);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A05, i2);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeList(this.A0C);
    }
}
