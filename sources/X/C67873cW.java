package X;

import java.util.Comparator;

/* renamed from: X.3cW  reason: invalid class name and case insensitive filesystem */
public final class C67873cW extends C18390wc {
    public final Comparator comparator;

    public C67873cW(Comparator comparator2) {
        this.comparator = comparator2;
    }

    public C67873cW add(Object obj) {
        super.add(obj);
        return this;
    }

    public C67873cW add(Object... objArr) {
        super.add(objArr);
        return this;
    }

    public C67873cW addAll(Iterable iterable) {
        super.addAll(iterable);
        return this;
    }

    public C67943cd build() {
        C67943cd construct = C67943cd.construct(this.comparator, this.size, this.contents);
        this.size = construct.size();
        this.forceCopy = true;
        return construct;
    }
}
