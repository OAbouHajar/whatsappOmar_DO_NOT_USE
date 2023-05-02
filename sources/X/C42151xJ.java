package X;

import org.apache.commons.io.IOUtils;

/* renamed from: X.1xJ  reason: invalid class name and case insensitive filesystem */
public class C42151xJ extends C42101xE {
    public C42151xJ(C16880tn r1) {
        super(r1);
    }

    public String A08(AnonymousClass013 r8) {
        StringBuilder sb = new StringBuilder();
        C42101xE.A00(super.A08(r8), IOUtils.LINE_SEPARATOR_UNIX, sb);
        for (C35121lP r1 : this.A00.A09) {
            String str = r1.A00;
            sb.append(str);
            C42101xE.A00(str, IOUtils.LINE_SEPARATOR_UNIX, sb);
            for (C35111lO r2 : r1.A01) {
                C42101xE.A00(r2.A02, " ", sb);
                C42101xE.A00(r2.A00, IOUtils.LINE_SEPARATOR_UNIX, sb);
            }
        }
        return sb.toString();
    }

    public void A09(C16740tZ r1, AnonymousClass21Q r2, AnonymousClass1GC r3) {
        AnonymousClass38D.A00(r1, r2, r3);
    }
}
