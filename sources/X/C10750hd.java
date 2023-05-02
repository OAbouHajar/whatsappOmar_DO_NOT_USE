package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: X.0hd  reason: invalid class name and case insensitive filesystem */
public final class C10750hd implements Iterator, C23861Dq {
    public int A00;
    public final /* synthetic */ ViewGroup A01;

    public C10750hd(ViewGroup viewGroup) {
        this.A01 = viewGroup;
    }

    public boolean hasNext() {
        return this.A00 < this.A01.getChildCount();
    }

    public /* bridge */ /* synthetic */ Object next() {
        ViewGroup viewGroup = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    public void remove() {
        ViewGroup viewGroup = this.A01;
        int i2 = this.A00 - 1;
        this.A00 = i2;
        viewGroup.removeViewAt(i2);
    }
}
