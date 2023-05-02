package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.wabloks.ui.PrivacyNotice.PrivacyNoticeDialogFragment;
import java.util.List;

/* renamed from: X.19j  reason: invalid class name and case insensitive filesystem */
public class C228119j {
    public final AnonymousClass01D A00;
    public final AnonymousClass01D A01;
    public final AnonymousClass01D A02;
    public final AnonymousClass01D A03;
    public final List A04;

    public C228119j(AnonymousClass01D r2, AnonymousClass01D r3, AnonymousClass01D r4, AnonymousClass01D r5, AnonymousClass01D r6) {
        this.A02 = r2;
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = r6;
        this.A04 = ((C228319l) r3.get()).A03;
    }

    public final void A00(Context context, Intent intent) {
        if (((C228419m) this.A01.get()).A00()) {
            ((C19980zJ) this.A00.get()).A09(C19980zJ.A00(context), intent, 475);
            return;
        }
        this.A02.get();
        Activity A012 = C19980zJ.A01(context, C001000l.class);
        AnonymousClass00B.A06(A012);
        new PrivacyNoticeDialogFragment().A1G(((C001000l) A012).AGM(), "TOSFragmentOuter");
    }
}
