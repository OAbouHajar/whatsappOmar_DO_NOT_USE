package X;

import java.util.ListIterator;

/* renamed from: X.3cA  reason: invalid class name and case insensitive filesystem */
public class C67663cA extends C1048457d implements ListIterator {
    public final /* synthetic */ C67683cC this$1;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cC, X.5Bk] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67663cA(X.C67683cC r1) {
        /*
            r0 = this;
            r0.this$1 = r1
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67663cA.<init>(X.3cC):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3cC, X.5Bk] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C67663cA(X.C67683cC r2, int r3) {
        /*
            r1 = this;
            r1.this$1 = r2
            java.util.List r0 = r2.getListDelegate()
            java.util.ListIterator r0 = r0.listIterator(r3)
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67663cA.<init>(X.3cC, int):void");
    }

    private ListIterator getDelegateListIterator() {
        return (ListIterator) getDelegateIterator();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3cC, java.util.AbstractCollection] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.3cC, X.5Bk] */
    public void add(Object obj) {
        boolean isEmpty = this.this$1.isEmpty();
        getDelegateListIterator().add(obj);
        ? r1 = this.this$1;
        C67723cH.access$208(r1.this$0);
        if (isEmpty) {
            r1.addToMap();
        }
    }

    public boolean hasPrevious() {
        return getDelegateListIterator().hasPrevious();
    }

    public int nextIndex() {
        return getDelegateListIterator().nextIndex();
    }

    public Object previous() {
        return getDelegateListIterator().previous();
    }

    public int previousIndex() {
        return getDelegateListIterator().previousIndex();
    }

    public void set(Object obj) {
        getDelegateListIterator().set(obj);
    }
}
