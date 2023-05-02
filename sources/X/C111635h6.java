package X;

import java.util.List;

/* renamed from: X.5h6  reason: invalid class name and case insensitive filesystem */
public class C111635h6 extends C25251Jb {
    public AnonymousClass69Y A00;

    public C111635h6(AnonymousClass69Y r4) {
        super("bk.action.qpl.userflow.AnnotateV2", "bk.action.qpl.userflow.EndFlowCancelV2", "bk.action.qpl.userflow.EndFlowFailureV2", "bk.action.qpl.userflow.EndFlowSuccessV2", "bk.action.qpl.userflow.MarkErrorV2", "bk.action.qpl.userflow.MarkPointV2", "bk.action.qpl.userflow.StartFlowV2");
        this.A00 = r4;
    }

    public /* bridge */ /* synthetic */ Object A8l(C14950q3 r13, C99354tt r14, C14970q5 r15) {
        String str = r14.A00;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1507852311:
                if (str.equals("bk.action.qpl.userflow.AnnotateV2")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1330718402:
                if (str.equals("bk.action.qpl.userflow.EndFlowFailureV2")) {
                    c2 = 1;
                    break;
                }
                break;
            case -921635786:
                if (str.equals("bk.action.qpl.userflow.MarkErrorV2")) {
                    c2 = 2;
                    break;
                }
                break;
            case -782725013:
                if (str.equals("bk.action.qpl.userflow.StartFlowV2")) {
                    c2 = 3;
                    break;
                }
                break;
            case 136195447:
                if (str.equals("bk.action.qpl.userflow.EndFlowSuccessV2")) {
                    c2 = 4;
                    break;
                }
                break;
            case 156743102:
                if (str.equals("bk.action.qpl.userflow.MarkPointV2")) {
                    c2 = 5;
                    break;
                }
                break;
            case 959076350:
                if (str.equals("bk.action.qpl.userflow.EndFlowCancelV2")) {
                    c2 = 6;
                    break;
                }
                break;
        }
        C14970q5 r7 = r15;
        switch (c2) {
            case 0:
                AnonymousClass69Y r4 = this.A00;
                List list = r13.A00;
                r4.A4t(r15, C110115dX.A0j(list, 2), AnonymousClass000.A0D(list.get(0)), AnonymousClass000.A0D(list.get(1)));
                return null;
            case 1:
                AnonymousClass69Y r6 = this.A00;
                List list2 = r13.A00;
                r6.A8U(r7, AnonymousClass000.A0n(list2, 2), AnonymousClass000.A0n(list2, 3), AnonymousClass000.A0D(list2.get(0)), AnonymousClass000.A0D(list2.get(1)));
                return null;
            case 2:
                AnonymousClass69Y r62 = this.A00;
                List list3 = r13.A00;
                r62.AKc(r7, AnonymousClass000.A0n(list3, 2), AnonymousClass000.A0n(list3, 3), AnonymousClass000.A0D(list3.get(0)), AnonymousClass000.A0D(list3.get(1)));
                return null;
            case 3:
                List list4 = r13.A00;
                C31201dg r2 = (C31201dg) list4.get(2);
                boolean equals = "cancel".equals(r2.A0J(35));
                String A0J = r2.A0J(36);
                if (A0J == null) {
                    A0J = "WaBloks";
                }
                this.A00.AgD(r7, A0J, AnonymousClass000.A0D(C13690nt.A0Z(list4)), AnonymousClass000.A0D(list4.get(1)), equals);
                return null;
            case 4:
                AnonymousClass69Y r3 = this.A00;
                List list5 = r13.A00;
                r3.A8V(r15, AnonymousClass000.A0D(list5.get(0)), AnonymousClass000.A0D(list5.get(1)));
                return null;
            case 5:
                AnonymousClass69Y r63 = this.A00;
                List list6 = r13.A00;
                r63.AKd(r7, AnonymousClass000.A0n(list6, 2), C110115dX.A0j(list6, 3), AnonymousClass000.A0D(list6.get(0)), AnonymousClass000.A0D(list6.get(1)));
                return null;
            case 6:
                AnonymousClass69Y r42 = this.A00;
                List list7 = r13.A00;
                r42.A8T(r15, AnonymousClass000.A0n(list7, 2), AnonymousClass000.A0D(list7.get(0)), AnonymousClass000.A0D(list7.get(1)));
                return null;
            default:
                return null;
        }
    }
}
