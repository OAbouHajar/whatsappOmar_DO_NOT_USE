package X;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1t8  reason: invalid class name and case insensitive filesystem */
public class C39831t8 {
    public long A00;
    public final Map A01;

    public C39831t8() {
        this.A00 = 0;
        this.A01 = new HashMap();
    }

    public C39831t8(Parcel parcel) {
        this.A00 = parcel.readLong();
        HashMap hashMap = new HashMap();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            hashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        this.A01 = hashMap;
    }
}
