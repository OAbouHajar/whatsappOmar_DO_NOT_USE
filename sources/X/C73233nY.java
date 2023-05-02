package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.3nY  reason: invalid class name and case insensitive filesystem */
public final class C73233nY extends C82594Dk {
    public final List A00;
    public final Map A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73233nY(List list, Map map) {
        super(list);
        C18450wi.A0J(list, map);
        this.A00 = list;
        this.A01 = map;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C73233nY) {
                C73233nY r5 = (C73233nY) obj;
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
        StringBuilder A0r = AnonymousClass000.A0r("CategoryGroupsWithChildItems(catalogCategoryGroups=");
        A0r.append(this.A00);
        A0r.append(", parentCategoryToChildItemMap=");
        return AnonymousClass3K2.A0k(this.A01, A0r);
    }
}
