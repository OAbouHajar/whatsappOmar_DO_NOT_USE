package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.1lp  reason: invalid class name and case insensitive filesystem */
public final class C35371lp extends C30671cl {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(43);
    public long A00;
    public C28401Vy A01;
    public final LinkedHashSet A02;

    public C35371lp(C30681cm r1, String str, String str2, BigDecimal bigDecimal, LinkedHashSet linkedHashSet, int i2, int i3) {
        this.A02 = linkedHashSet;
        AnonymousClass00B.A06(r1);
        this.A07 = r1;
        A07(i2);
        A06(i3);
        this.A0A = str;
        A09(str2);
        A0A(r1, bigDecimal);
    }

    public C35371lp(Parcel parcel) {
        A08(parcel);
        String readString = parcel.readString();
        int readInt = parcel.readInt();
        this.A02 = new LinkedHashSet();
        for (int i2 = 0; i2 < readInt; i2++) {
            this.A02.add(AnonymousClass173.A00(parcel));
        }
        A0A(this.A07, new BigDecimal(readString));
    }

    public void A0A(C30681cm r5, BigDecimal bigDecimal) {
        C28411Vz r1;
        if (bigDecimal != null && r5 != null) {
            LinkedHashSet linkedHashSet = r5.A05;
            LinkedHashSet linkedHashSet2 = this.A02;
            if (linkedHashSet2 != null) {
                Iterator it = linkedHashSet2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r1 = (C28411Vz) it.next();
                    if (linkedHashSet.contains(r1)) {
                        break;
                    }
                }
                this.A01 = new C28401Vy(bigDecimal, ((C35491m1) r1).A01);
            }
            r1 = C35481m0.A06;
            this.A01 = new C28401Vy(bigDecimal, ((C35491m1) r1).A01);
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ WALLET: ");
        sb.append(super.toString());
        sb.append(" balance: ");
        sb.append(this.A01);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A01.toString());
        LinkedHashSet linkedHashSet = this.A02;
        parcel.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((C28411Vz) it.next()).writeToParcel(parcel, i2);
        }
    }
}
