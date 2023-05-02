package X;

import com.google.common.collect.Multisets;
import java.util.Iterator;

/* renamed from: X.3cq  reason: invalid class name and case insensitive filesystem */
public class C68073cq extends Multisets.EntrySet<E> {
    public final /* synthetic */ C105855Bl this$0;

    public C68073cq() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C68073cq(C105855Bl r1) {
        this();
        this.this$0 = r1;
    }

    public void clear() {
        multiset().clear();
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof C87494Wz)) {
            return false;
        }
        C87494Wz r4 = (C87494Wz) obj;
        return r4.getCount() > 0 && multiset().count(r4.getElement()) == r4.getCount();
    }

    public Iterator iterator() {
        return this.this$0.entryIterator();
    }

    public C109985Uo multiset() {
        return this.this$0;
    }

    public boolean remove(Object obj) {
        if (obj instanceof C87494Wz) {
            C87494Wz r5 = (C87494Wz) obj;
            Object element = r5.getElement();
            int count = r5.getCount();
            if (count != 0) {
                return multiset().setCount(element, count, 0);
            }
        }
        return false;
    }

    public int size() {
        return this.this$0.distinctElements();
    }
}
