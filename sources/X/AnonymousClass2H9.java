package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2H9  reason: invalid class name */
public class AnonymousClass2H9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass3CM();
    public final AnonymousClass1Vt A00;

    public AnonymousClass2H9(AnonymousClass1Vt r1) {
        this.A00 = r1;
    }

    public int describeContents() {
        return 0;
    }

    public synchronized void writeToParcel(Parcel parcel, int i2) {
        AnonymousClass1Vt r3 = this.A00;
        parcel.writeInt(r3.A03);
        parcel.writeInt(r3.A02);
        parcel.writeLong(r3.A06);
        parcel.writeString(r3.A0I);
        C28401Vy r0 = r3.A08;
        parcel.writeInt(r0 != null ? r0.A00.scale() : 0);
        C28401Vy r02 = r3.A08;
        parcel.writeString(r02 != null ? r02.A00.toString() : null);
        parcel.writeString(r3.A0K);
        UserJid userJid = r3.A0E;
        parcel.writeString(userJid == null ? null : userJid.getRawString());
        UserJid userJid2 = r3.A0D;
        parcel.writeString(userJid2 == null ? null : userJid2.getRawString());
        parcel.writeString(r3.A0L);
        parcel.writeString(r3.A0H);
        parcel.writeString(r3.A0J);
        parcel.writeString(r3.A0F);
        ArrayList arrayList = r3.A0N;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C35411lt((C35401ls) it.next()));
            }
            parcel.writeList(arrayList2);
        } else {
            parcel.writeList((List) null);
        }
        parcel.writeString(C16030sJ.A03(r3.A0C));
        int i3 = 1;
        int i4 = 0;
        if (r3.A0Q) {
            i4 = 1;
        }
        parcel.writeInt(i4);
        parcel.writeLong(r3.A05);
        parcel.writeString(r3.A0M);
        parcel.writeString(r3.A0G);
        parcel.writeInt(r3.A04);
        if (!r3.A0P) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeParcelable(r3.A0B, 0);
        parcel.writeInt(r3.A00);
        byte[] bArr = r3.A0R;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(r3.A0R);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(r3.A01);
        parcel.writeParcelable(r3.A0A, 0);
        r3.A07.writeToParcel(parcel, i2);
    }
}
