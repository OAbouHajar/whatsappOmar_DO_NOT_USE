package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1sa  reason: invalid class name and case insensitive filesystem */
public class C39501sa {
    public static String A00(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jid) it.next()).getRawString());
        }
        return TextUtils.join(",", arrayList);
    }

    public static List A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C16030sJ.A08(UserJid.class, Arrays.asList(str.split(",")));
    }
}
