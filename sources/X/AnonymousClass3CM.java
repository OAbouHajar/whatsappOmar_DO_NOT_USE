package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3CM  reason: invalid class name */
public class AnonymousClass3CM implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        AnonymousClass1Vt r13;
        Parcel parcel2 = parcel;
        int readInt = parcel2.readInt();
        int readInt2 = parcel2.readInt();
        long readLong = parcel2.readLong();
        String readString = parcel2.readString();
        int readInt3 = parcel2.readInt();
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        UserJid nullable = UserJid.getNullable(parcel2.readString());
        UserJid nullable2 = UserJid.getNullable(parcel2.readString());
        String readString4 = parcel2.readString();
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        String readString7 = parcel2.readString();
        ArrayList readArrayList = parcel2.readArrayList(C35411lt.class.getClassLoader());
        UserJid nullable3 = UserJid.getNullable(parcel2.readString());
        boolean A1O = AnonymousClass000.A1O(parcel2.readInt());
        long readLong2 = parcel2.readLong();
        String readString8 = parcel2.readString();
        String readString9 = parcel2.readString();
        int readInt4 = parcel2.readInt();
        boolean A1R = AnonymousClass000.A1R(parcel2.readInt(), 1);
        C35361lo r2 = (C35361lo) parcel2.readParcelable(C35361lo.class.getClassLoader());
        int readInt5 = parcel2.readInt();
        int readInt6 = parcel2.readInt();
        byte[] bArr = new byte[readInt6];
        if (readInt6 > 0) {
            parcel2.readByteArray(bArr);
        }
        int readInt7 = parcel2.readInt();
        AnonymousClass1W2 r1 = (AnonymousClass1W2) parcel2.readParcelable(AnonymousClass1W2.class.getClassLoader());
        C28411Vz A00 = AnonymousClass173.A00(parcel2);
        if (readInt == 5) {
            AnonymousClass1Vt r15 = new AnonymousClass1Vt(readString9, 5, readInt4, 0, readLong2);
            r15.A0R = bArr;
            r15.A0L = readString4;
            r15.A0C = nullable3;
            r15.A0Q = A1O;
            r15.A0P = A1R;
            r15.A07 = A00;
            return new AnonymousClass2H9(r15);
        }
        C28401Vy A002 = C28401Vy.A00(readString2, readInt3);
        if (readInt != 4) {
            r13 = new AnonymousClass1Vt(A00, A002, nullable, nullable2, readString, readString3, readString5, readString6, readString7, (String) null, readString9, readInt, readInt2, readInt4, readInt7, readInt5, readLong2, readLong);
            r13.A0L = readString4;
            if (readArrayList != null) {
                ArrayList A0i = C13690nt.A0i(readArrayList.size());
                Iterator it = readArrayList.iterator();
                while (it.hasNext()) {
                    A0i.add(((C35411lt) it.next()).A00);
                }
                r13.A0N = A0i;
            }
            r13.A0C = nullable3;
            r13.A0Q = A1O;
            r13.A0A = r1;
            r13.A07 = A00;
        } else {
            r13 = AnonymousClass1W1.A00(readLong2);
        }
        r13.A0M = readString8;
        r13.A0P = A1R;
        r13.A05(r2);
        return new AnonymousClass2H9(r13);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new AnonymousClass2H9[i2];
    }
}
