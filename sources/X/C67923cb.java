package X;

import java.util.Comparator;

/* renamed from: X.3cb  reason: invalid class name and case insensitive filesystem */
public class C67923cb extends C67863cV {
    public static final C67923cb INSTANCE = new C67923cb();
    public static final long serialVersionUID = 0;

    public C67923cb() {
        super(C17930vs.of(), 0, (Comparator) null);
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
