package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.288  reason: invalid class name */
public class AnonymousClass288 {
    public static String A00(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }

    public static List A01(MessageDigest messageDigest, List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C16010sH r1 = (C16010sH) it.next();
            if (!A04(r1.A0E) && A02(r1, messageDigest, list)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public static boolean A02(C16010sH r6, MessageDigest messageDigest, List list) {
        C15830rv r2 = r6.A0E;
        AnonymousClass00B.A06(r2);
        if (!r2.equals(C34791ks.A00)) {
            StringBuilder sb = new StringBuilder();
            sb.append(r2.user);
            sb.append("WA_ADD_NOTIF");
            String obj = sb.toString();
            messageDigest.reset();
            messageDigest.update(obj.getBytes());
            byte[] digest = messageDigest.digest();
            for (int i2 = 0; i2 < list.size(); i2++) {
                byte[] bArr = (byte[]) list.get(i2);
                if (digest.length >= bArr.length) {
                    int i3 = 0;
                    while (i3 < bArr.length) {
                        if (digest[i3] == bArr[i3]) {
                            i3++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A03(C16010sH r1, boolean z2) {
        C34751ko r0 = r1.A0D;
        if (r0 == null || TextUtils.isEmpty(r0.A01)) {
            return true;
        }
        C15830rv r02 = r1.A0E;
        return r02 == null ? !z2 : A04(r02);
    }

    public static boolean A04(Jid jid) {
        return jid == null || !jid.isProtocolCompliant() || C16030sJ.A0P(jid);
    }
}
