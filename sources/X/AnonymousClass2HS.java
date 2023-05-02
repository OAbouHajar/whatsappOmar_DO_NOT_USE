package X;

import com.whatsapp.util.Log;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.2HS  reason: invalid class name */
public class AnonymousClass2HS implements Comparator {
    public HashMap A00;
    public final AnonymousClass2HU[] A01;

    public AnonymousClass2HS(AnonymousClass2HU[] r1) {
        this.A01 = r1;
    }

    public final int A00(C37781pj r3) {
        if (A01().containsKey(r3)) {
            return ((Number) A01().get(r3)).intValue();
        }
        StringBuilder sb = new StringBuilder("EmojiPickerComparator/found an emoji that doesn't exist in emoji picker ");
        sb.append(r3.toString());
        Log.e(sb.toString());
        return 0;
    }

    public final synchronized HashMap A01() {
        HashMap hashMap;
        hashMap = this.A00;
        if (hashMap == null) {
            hashMap = new HashMap();
            int i2 = 0;
            for (AnonymousClass2HU r0 : this.A01) {
                for (Object put : (List) r0.A03.get()) {
                    hashMap.put(put, Integer.valueOf(i2));
                    i2++;
                }
            }
            this.A00 = hashMap;
        }
        return hashMap;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((C37781pj) obj) - A00((C37781pj) obj2);
    }
}
