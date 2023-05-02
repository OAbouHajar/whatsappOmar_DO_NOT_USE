package X;

import com.obwhatsapp.support.ReportSpamDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.52t  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1037952t implements AnonymousClass1WE {
    public final /* synthetic */ C55442jc A00;
    public final /* synthetic */ C15830rv A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C1037952t(C55442jc r1, C15830rv r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void accept(Object obj) {
        C55442jc r2 = this.A00;
        C15830rv r3 = this.A01;
        String str = this.A02;
        Boolean bool = (Boolean) obj;
        C14600pS r1 = r2.A03;
        if (!r1.AIm()) {
            if (r2.A01) {
                str = "triggered_block";
            }
            r1.Afc(ReportSpamDialogFragment.A01(r3, (UserJid) null, (C41701wR) null, str, 1, bool.booleanValue(), true, true, true, true, false));
        }
    }
}
