package X;

import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3cr  reason: invalid class name and case insensitive filesystem */
public class C68083cr extends Multisets.ElementSet<E> {
    public final /* synthetic */ C105855Bl this$0;

    public C68083cr() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C68083cr(C105855Bl r1) {
        this();
        this.this$0 = r1;
    }

    public void clear() {
        multiset().clear();
    }

    public boolean contains(Object obj) {
        return multiset().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return multiset().containsAll(collection);
    }

    public boolean isEmpty() {
        return multiset().isEmpty();
    }

    public Iterator iterator() {
        return this.this$0.elementIterator();
    }

    public C109985Uo multiset() {
        return this.this$0;
    }

    public boolean remove(Object obj) {
        return AnonymousClass000.A1Q(multiset().remove(obj, Integer.MAX_VALUE));
    }

    public int size() {
        return multiset().entrySet().size();
    }
}
