package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2IZ  reason: invalid class name */
public class AnonymousClass2IZ {
    public final HashSet A00 = new HashSet();
    public final LinkedHashMap A01 = new LinkedHashMap();
    public final /* synthetic */ AnonymousClass1HO A02;

    public AnonymousClass2IZ(AnonymousClass1HO r2) {
        this.A02 = r2;
    }

    public synchronized void A00() {
        Iterator it = this.A01.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            HashSet hashSet = this.A00;
            if (!hashSet.contains(entry.getKey())) {
                break;
            }
            it.remove();
            hashSet.remove(entry.getKey());
            this.A02.A00.A01((C16740tZ) entry.getValue());
        }
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("[pending:");
        sb.append(this.A01.size());
        sb.append(" ready:");
        sb.append(this.A00.size());
        sb.append("]");
        return sb.toString();
    }
}
