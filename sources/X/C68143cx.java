package X;

import java.util.NoSuchElementException;

/* renamed from: X.3cx  reason: invalid class name and case insensitive filesystem */
public class C68143cx extends C28031Ub {
    public boolean done;
    public final /* synthetic */ Object val$value;

    public C68143cx(Object obj) {
        this.val$value = obj;
    }

    public boolean hasNext() {
        return !this.done;
    }

    public Object next() {
        if (!this.done) {
            this.done = true;
            return this.val$value;
        }
        throw new NoSuchElementException();
    }
}
