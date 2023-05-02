package X;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1tK  reason: invalid class name and case insensitive filesystem */
public class C39951tK {
    public final Map A00;
    public final Map A01;

    public C39951tK() {
        this.A01 = new HashMap();
        this.A00 = new HashMap();
    }

    public C39951tK(Parcel parcel) {
        HashMap hashMap = new HashMap();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            hashMap.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        this.A01 = hashMap;
        HashMap hashMap2 = new HashMap();
        int readInt2 = parcel.readInt();
        for (int i3 = 0; i3 < readInt2; i3++) {
            hashMap2.put(Integer.valueOf(parcel.readInt()), parcel.readString());
        }
        this.A00 = hashMap2;
    }
}
