package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.3nZ  reason: invalid class name and case insensitive filesystem */
public final class C73243nZ extends C82594Dk {
    public final List A00;
    public final Map A01;

    public C73243nZ(List list, Map map) {
        super(list);
        this.A00 = list;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73243nZ) {
                C73243nZ r5 = (C73243nZ) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A01, AnonymousClass3K3.A0H(this.A00));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CategoryGroupsWithLoadingChildItems(catalogCategoryGroups=");
        A0r.append(this.A00);
        A0r.append(", parentCategoryToChildItemMap=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
