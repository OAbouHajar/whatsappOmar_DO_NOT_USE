package X;

import java.util.Iterator;
import java.util.ListIterator;

/* renamed from: X.3cO  reason: invalid class name and case insensitive filesystem */
public class C67793cO extends C34641kb<E> {
    public final transient int length;
    public final transient int offset;
    public final /* synthetic */ C34641kb this$0;

    public C67793cO(C34641kb r1, int i2, int i3) {
        this.this$0 = r1;
        this.offset = i2;
        this.length = i3;
    }

    public Object get(int i2) {
        C29031Zu.A01(i2, this.length);
        return this.this$0.get(i2 + this.offset);
    }

    public Object[] internalArray() {
        return this.this$0.internalArray();
    }

    public int internalArrayEnd() {
        return this.this$0.internalArrayStart() + this.offset + this.length;
    }

    public int internalArrayStart() {
        return this.this$0.internalArrayStart() + this.offset;
    }

    public boolean isPartialView() {
        return true;
    }

    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
        return super.listIterator(i2);
    }

    public int size() {
        return this.length;
    }

    public C34641kb subList(int i2, int i3) {
        C29031Zu.A03(i2, i3, this.length);
        C34641kb r1 = this.this$0;
        int i4 = this.offset;
        return r1.subList(i2 + i4, i3 + i4);
    }
}
