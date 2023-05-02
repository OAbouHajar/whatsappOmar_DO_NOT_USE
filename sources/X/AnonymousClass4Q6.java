package X;

import java.util.List;

/* renamed from: X.4Q6  reason: invalid class name */
public class AnonymousClass4Q6 {
    public final List A00;

    public AnonymousClass4Q6(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        for (Object next : this.A00) {
            A0o.append(System.getProperty("line.separator"));
            AnonymousClass000.A1I(next, A0o);
        }
        return String.format("GetCategoriesResponse{categoryResponses=%s}", AnonymousClass000.A1a(A0o));
    }
}
