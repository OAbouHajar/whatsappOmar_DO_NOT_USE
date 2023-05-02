package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.3cu  reason: invalid class name and case insensitive filesystem */
public class C68113cu extends C105965By<E> {
    public final /* synthetic */ Set val$set1;
    public final /* synthetic */ Set val$set2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68113cu(Set set, Set set2) {
        super((C68103ct) null);
        this.val$set1 = set;
        this.val$set2 = set2;
    }

    public boolean contains(Object obj) {
        return this.val$set1.contains(obj) && this.val$set2.contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return this.val$set1.containsAll(collection) && this.val$set2.containsAll(collection);
    }

    public boolean isEmpty() {
        return Collections.disjoint(this.val$set2, this.val$set1);
    }

    public C28031Ub iterator() {
        return new C67593c3(this);
    }

    public int size() {
        int i2 = 0;
        for (Object contains : this.val$set1) {
            if (this.val$set2.contains(contains)) {
                i2++;
            }
        }
        return i2;
    }
}
