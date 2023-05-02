package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Ya  reason: invalid class name and case insensitive filesystem */
public class C28851Ya {
    public static C36011mr A00() {
        AnonymousClass5T9 r0 = C36471nb.A00().A00;
        byte[] A9P = r0.A9P();
        return new C36011mr(new C36671nv(A9P, (byte) 5), new C30351cD(r0.generatePublicKey(A9P), (byte) 5));
    }

    public static C30351cD A01(byte[] bArr) {
        if (bArr.length >= 33) {
            byte b2 = bArr[0] & 255;
            if (b2 == 5) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 1, bArr2, 0, 32);
                return new C30351cD(bArr2, (byte) 5);
            }
            StringBuilder sb = new StringBuilder("Bad key type: ");
            sb.append(b2);
            throw new C31751ey(sb.toString());
        }
        throw new C31751ey("Invalid byte array");
    }

    public static C28861Yb A02(DeviceJid deviceJid) {
        AnonymousClass00B.A07(deviceJid, "Provided jid must not be null");
        String str = deviceJid.user;
        AnonymousClass00B.A07(str, "User part of provided jid must not be null");
        int i2 = 0;
        if (deviceJid instanceof AnonymousClass1ZY) {
            i2 = 1;
        }
        return new C28861Yb(i2, str, deviceJid.device);
    }

    public static DeviceJid A03(C28861Yb r3) {
        UserJid A02;
        try {
            boolean z2 = false;
            if (r3.A01 == 0) {
                z2 = true;
            }
            String str = r3.A02;
            if (z2) {
                A02 = AnonymousClass1ZT.A03(str);
            } else {
                A02 = UserJid.JID_FACTORY.A02(str, "lid");
                if (!(A02 instanceof AnonymousClass1ZX)) {
                    StringBuilder sb = new StringBuilder("invalid lid: ");
                    sb.append(str);
                    throw new AnonymousClass1W4(sb.toString());
                }
            }
            return DeviceJid.getFromUserJidAndDeviceId(A02, r3.A00);
        } catch (AnonymousClass1W4 unused) {
            StringBuilder sb2 = new StringBuilder("Invalid signal protocol address: ");
            sb2.append(r3);
            Log.e(sb2.toString());
            return null;
        }
    }

    public static List A04(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid A03 = A03((C28861Yb) it.next());
            if (A03 != null) {
                arrayList.add(A03);
            }
        }
        return arrayList;
    }

    public static boolean A05(C30351cD r2, byte[] bArr, byte[] bArr2) {
        if (r2.A00 == 5) {
            return C36471nb.A00().A01(r2.A01, bArr, bArr2);
        }
        throw new AssertionError("PublicKey type is invalid");
    }

    public static byte[] A06(C36671nv r4, byte[] bArr) {
        if (r4.A00 == 5) {
            C36471nb A00 = C36471nb.A00();
            byte[] bArr2 = r4.A01;
            if (bArr2 == null || bArr2.length != 32) {
                throw new IllegalArgumentException("Invalid private key length!");
            }
            AnonymousClass5T9 r1 = A00.A00;
            return r1.calculateSignature(r1.AFM(64), bArr2, bArr);
        }
        throw new AssertionError("PrivateKey type is invalid");
    }
}
