package X;

import com.facebook.redex.IDxRCallbackShape49S0200000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1K4  reason: invalid class name */
public class AnonymousClass1K4 extends C25251Jb {
    public final AnonymousClass1K3 A00;

    public AnonymousClass1K4(AnonymousClass1K3 r4) {
        super("wa.action.shops.TOSaccept");
        this.A00 = r4;
    }

    public /* bridge */ /* synthetic */ Object A8l(C14950q3 r15, C99354tt r16, C14970q5 r17) {
        C14960q4 r2 = (C14960q4) r17;
        if (!r16.A00.equals("wa.action.shops.TOSaccept")) {
            return null;
        }
        int intValue = ((Number) r15.A00.get(0)).intValue();
        PrivacyNoticeDialogFragment privacyNoticeDialogFragment = (PrivacyNoticeDialogFragment) ((AnonymousClass02C) r2.A00.A02.A00().get(R.id.bloks_host_fragment_manager)).A0B("TOSFragmentOuter");
        if (privacyNoticeDialogFragment != null) {
            AnonymousClass4J5 r4 = (AnonymousClass4J5) privacyNoticeDialogFragment.A03.get();
            AnonymousClass4QU r3 = new AnonymousClass4QU(privacyNoticeDialogFragment);
            AnonymousClass01D r1 = r4.A00;
            String A02 = ((C17190ug) r1.get()).A02();
            C32461gQ r5 = new C32461gQ("iq");
            r5.A02(new C35081lL("id", A02));
            r5.A02(new C35081lL("xmlns", "urn:xmpp:whatsapp:account"));
            r5.A02(new C35081lL("type", "set"));
            r5.A02(new C35081lL((Jid) C34791ks.A00, "to"));
            C32461gQ r22 = new C32461gQ("shops_notice");
            r22.A02(new C35081lL("tos_version", intValue));
            r5.A03(r22.A01());
            ((C17190ug) r1.get()).A0G(new IDxRCallbackShape49S0200000_2_I0(r3, 8, r4), r5.A01(), A02, 249, 32000);
            return null;
        }
        Log.e("Bloks: Invalid fragment tag");
        return null;
    }
}
