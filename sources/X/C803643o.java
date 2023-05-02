package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.43o  reason: invalid class name and case insensitive filesystem */
public final class C803643o extends Exception {
    public static final long serialVersionUID = 3026362227162912146L;
    public final String message;
    public final List throwables;

    public C803643o(List list) {
        this.throwables = Collections.unmodifiableList(C13680ns.A0n(list));
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(list.size());
        A0o.append(" exceptions occurred: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0o.append(((Throwable) it.next()).getMessage());
            A0o.append(";");
        }
        this.message = A0o.toString();
    }

    public String getMessage() {
        return this.message;
    }
}
