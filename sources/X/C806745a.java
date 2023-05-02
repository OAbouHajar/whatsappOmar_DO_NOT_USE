package X;

/* renamed from: X.45a  reason: invalid class name and case insensitive filesystem */
public final class C806745a {
    public static final AnonymousClass41R A00(C31201dg r4) {
        String str;
        AnonymousClass41R r3 = AnonymousClass41R.LIST;
        String A0J = r4.A0J(96);
        C31201dg A0G = r4.A0G(94);
        if (A0J == null || A0G == null) {
            return r3;
        }
        if (A0J.equals("grid")) {
            if (A0G.A01 == 16373) {
                return AnonymousClass41R.GRID;
            }
            str = "CollectionLayoutTypeUtils: requested \"grid\" layout_config_type, but provided layout_config doesn't match bk.types.GridCollectionLayoutConfig";
        } else if (!A0J.equals("staggered_grid")) {
            return r3;
        } else {
            if (A0G.A01 == 16483) {
                return AnonymousClass41R.STAGGERED_GRID;
            }
            str = "CollectionLayoutTypeUtils: requested \"staggered_grid\" layout_config_type, but provided layout_config doesn't match bk.types.StaggeredGridCollectionLayoutConfig";
        }
        throw AnonymousClass000.A0T(str);
    }
}
