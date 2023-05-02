package X;

import java.security.Permission;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.5BK  reason: invalid class name */
public class AnonymousClass5BK extends Permission {
    public final Set actions;

    public AnonymousClass5BK(String str) {
        super(str);
        HashSet A0o = C13680ns.A0o();
        this.actions = A0o;
        A0o.add(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnonymousClass5BK) && this.actions.equals(((AnonymousClass5BK) obj).actions);
    }

    public String getActions() {
        return this.actions.toString();
    }

    public int hashCode() {
        return this.actions.hashCode();
    }

    public boolean implies(Permission permission) {
        if (!(permission instanceof AnonymousClass5BK)) {
            return false;
        }
        AnonymousClass5BK r4 = (AnonymousClass5BK) permission;
        return getName().equals(r4.getName()) || this.actions.containsAll(r4.actions);
    }
}
