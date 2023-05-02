package X;

import android.app.Activity;
import com.facebook.redex.IDxUnblockerShape10S0400000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.UnblockDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.19g  reason: invalid class name and case insensitive filesystem */
public class C227819g {
    public final AnonymousClass01Y A00;
    public final C16000sG A01;
    public final C16080sP A02;
    public final C18310wU A03;
    public final C18290wS A04;

    public C227819g(AnonymousClass01Y r1, C16000sG r2, C16080sP r3, C18310wU r4, C18290wS r5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
    }

    public void A00(Activity activity, AnonymousClass1ZI r18, UserJid userJid, C35301lh r20, boolean z2, boolean z3) {
        Activity activity2 = activity;
        boolean z4 = false;
        UserJid userJid2 = userJid;
        if (userJid != null) {
            z4 = true;
        }
        int i2 = R.string.str0fcb;
        if (z3) {
            i2 = R.string.str0fcd;
        }
        Object[] objArr = new Object[1];
        C35301lh r12 = r20;
        objArr[0] = z4 ? this.A02.A08(this.A01.A0A(userJid2)) : r20 == null ? null : r12.A00;
        String string = activity2.getString(i2, objArr);
        IDxUnblockerShape10S0400000_2_I0 iDxUnblockerShape10S0400000_2_I0 = null;
        AnonymousClass1ZI r8 = r18;
        if (z4) {
            iDxUnblockerShape10S0400000_2_I0 = new IDxUnblockerShape10S0400000_2_I0(this, r8, activity2, userJid2, 1);
        } else if (this.A04.A03().AB4() != null) {
            iDxUnblockerShape10S0400000_2_I0 = new IDxUnblockerShape10S0400000_2_I0(this, r12, activity2, r8, 2);
        }
        ((C14600pS) activity2).Afc(UnblockDialogFragment.A01(iDxUnblockerShape10S0400000_2_I0, string, 0, z2));
    }
}
