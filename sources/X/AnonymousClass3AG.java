package X;

import android.content.Context;

/* renamed from: X.3AG  reason: invalid class name */
public final class AnonymousClass3AG {
    public static final AnonymousClass3AG A00 = new AnonymousClass3AG();

    public final C85144Nh A00(Context context, C31201dg r14) {
        String str;
        AnonymousClass41B r0;
        int i2;
        int i3;
        int i4;
        float A01;
        int i5;
        float A012;
        Integer valueOf;
        Integer valueOf2;
        C31201dg A0G = r14.A0G(94);
        if (A0G != null) {
            int A002 = C806845b.A00(r14);
            int i6 = A0G.A01;
            if (i6 == 16373) {
                r0 = AnonymousClass41B.SIMPLE;
            } else if (i6 == 16483) {
                r0 = AnonymousClass41B.STAGGERED;
            } else {
                str = C13680ns.A0c(i6, "GridCommonUtils: Grid type is unknown for style ");
            }
            int ordinal = r0.ordinal();
            int A0A = A0G.A0A(ordinal != 0 ? 40 : 41, -1);
            if (A0A != -1) {
                if (ordinal != 0) {
                    i2 = 36;
                    i3 = 35;
                } else {
                    i2 = 38;
                    i3 = 36;
                }
                C25401Jq r3 = new C25401Jq(i2, i3);
                int A0D = AnonymousClass000.A0D(r3.first);
                int A0D2 = AnonymousClass000.A0D(r3.second);
                String A0J = A0G.A0J(A0D);
                if (A0J == null) {
                    A01 = 0.0f;
                } else {
                    try {
                        A01 = C62163Bx.A01(A0J);
                    } catch (AnonymousClass40K unused) {
                        C29691b2.A00("GridCommonUtils", C13680ns.A0h("Invalid pixel format for grid spacing ", A0J));
                        i4 = (int) 0.0f;
                    }
                }
                i4 = (int) A01;
                String A0J2 = A0G.A0J(A0D2);
                if (A0J2 == null) {
                    A012 = 0.0f;
                } else {
                    try {
                        A012 = C62163Bx.A01(A0J2);
                    } catch (AnonymousClass40K unused2) {
                        C29691b2.A00("GridCommonUtils", C13680ns.A0h("Invalid pixel format for grid spacing ", A0J2));
                        i5 = (int) 0.0f;
                    }
                }
                i5 = (int) A012;
                if (A002 == 1) {
                    valueOf = Integer.valueOf(i5);
                    valueOf2 = Integer.valueOf(i4);
                } else {
                    valueOf = Integer.valueOf(i4);
                    valueOf2 = Integer.valueOf(i5);
                }
                C25401Jq r1 = new C25401Jq(valueOf, valueOf2);
                int A0D3 = AnonymousClass000.A0D(r1.first);
                int A0D4 = AnonymousClass000.A0D(r1.second);
                C31201dg A0G2 = A0G.A0G(ordinal != 0 ? 38 : 40);
                return new C85144Nh(A0G2 == null ? AnonymousClass000.A0J() : C87554Xj.A01(A0G2).A00(C806945c.A00(context)), A0G, A002, A0A, A0D3, A0D4);
            }
            str = "GridCommonUtils: span-count is required for grids";
        } else {
            str = "GridCommonUtils: grid layout config should be defined";
        }
        throw AnonymousClass000.A0T(str);
    }
}
