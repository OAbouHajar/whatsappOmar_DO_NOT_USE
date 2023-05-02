package X;

import android.text.TextUtils;
import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.3yJ  reason: invalid class name and case insensitive filesystem */
public class C78573yJ extends C41591wD {
    public final /* synthetic */ C41571wB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78573yJ(C41571wB r2) {
        super(C41601wE.SEND_TEXT, r2);
        this.A00 = r2;
    }

    public void A00() {
        C41571wB r0 = this.A00;
        r0.A0L.Aed(r0.A03, r0.A08);
    }

    public void A01(CharSequence charSequence) {
        if (TextUtils.getTrimmedLength(charSequence) <= 0) {
            C41571wB r3 = this.A00;
            boolean z2 = r3.A0N;
            C41621wG r1 = r3.A0L;
            if (z2) {
                r1.A4q(125);
                r3.A06 = new C41611wF(r3);
                r3.A0A = false;
                return;
            }
            CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r1;
            creationModeBottomBar.A05.setEnabled(false);
            AnonymousClass4Y7.A01(creationModeBottomBar.A04, false, false);
            AnonymousClass4Y7.A01(creationModeBottomBar.A05, false, true);
            r3.A06 = new AnonymousClass35R(r3);
        }
    }
}
