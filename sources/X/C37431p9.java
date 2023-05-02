package X;

import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.1p9  reason: invalid class name and case insensitive filesystem */
public class C37431p9 {
    public static String A00(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            arrayList.add(deviceJid instanceof AnonymousClass1ZY ? DeviceJid.buildRawString(deviceJid.user, deviceJid.getServer(), 0, deviceJid.device) : deviceJid.getRawString());
        }
        Collections.sort(arrayList);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA256");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                instance.update(((String) it2.next()).getBytes());
            }
            byte[] digest = instance.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder sb = new StringBuilder("2:");
            sb.append(Base64.encodeToString(bArr, 2));
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
