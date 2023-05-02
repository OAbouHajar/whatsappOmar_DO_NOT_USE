package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5Bw  reason: invalid class name */
public class AnonymousClass5Bw extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ C105935Bu this$0;

    public AnonymousClass5Bw(C105935Bu r1) {
        this.this$0 = r1;
    }

    public void clear() {
        this.this$0.clear();
    }

    public boolean contains(Object obj) {
        C105935Bu r1 = this.this$0;
        Map delegateOrNull = r1.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().contains(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int access$500 = r1.indexOf(entry.getKey());
        return access$500 != -1 && AnonymousClass45Q.A00(this.this$0.value(access$500), entry.getValue());
    }

    public Iterator iterator() {
        return this.this$0.entrySetIterator();
    }

    public boolean remove(Object obj) {
        C105935Bu r1 = this.this$0;
        Map delegateOrNull = r1.delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (!r1.needsAllocArrays()) {
                int access$700 = r1.hashTableMask();
                Object key = entry.getKey();
                Object value = entry.getValue();
                C105935Bu r0 = this.this$0;
                int remove = C90864ey.remove(key, value, access$700, r0.requireTable(), r0.requireEntries(), r0.requireKeys(), r0.requireValues());
                if (remove != -1) {
                    this.this$0.moveLastEntry(remove, access$700);
                    C105935Bu r02 = this.this$0;
                    C105935Bu.access$1210(r02);
                    r02.incrementModCount();
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        return this.this$0.size();
    }
}
