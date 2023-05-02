package X;

import android.text.TextUtils;
import com.obwhatsapp.textstatuscomposer.bottombar.CreationModeBottomBar;

/* renamed from: X.1wD  reason: invalid class name and case insensitive filesystem */
public abstract class C41591wD {
    public final C41601wE A00;
    public final /* synthetic */ C41571wB A01;

    public C41591wD(C41601wE r1, C41571wB r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        if (this instanceof C41611wF) {
            CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) ((C41611wF) this).A00.A0L;
            creationModeBottomBar.A01();
            creationModeBottomBar.A03(0);
            AnonymousClass4Y7.A01(creationModeBottomBar.A04, true, false);
            AnonymousClass4Y7.A01(creationModeBottomBar.A05, false, false);
            return;
        }
        CreationModeBottomBar creationModeBottomBar2 = (CreationModeBottomBar) ((AnonymousClass35R) this).A00.A0L;
        creationModeBottomBar2.A05.setEnabled(false);
        AnonymousClass4Y7.A01(creationModeBottomBar2.A05, false, false);
        AnonymousClass4Y7.A01(creationModeBottomBar2.A04, false, false);
    }

    public void A01(CharSequence charSequence) {
        C41571wB r7;
        if (this instanceof C41611wF) {
            C41611wF r1 = (C41611wF) this;
            if (TextUtils.getTrimmedLength(charSequence) > 0) {
                r7 = r1.A00;
                C41621wG r6 = r7.A0L;
                int i2 = r7.A03;
                String str = r7.A08;
                CreationModeBottomBar creationModeBottomBar = (CreationModeBottomBar) r6;
                creationModeBottomBar.A05.setEnabled(true);
                creationModeBottomBar.A05.setImageDrawable(new C447725m(AnonymousClass00T.A04(creationModeBottomBar.getContext(), i2), creationModeBottomBar.A0C));
                creationModeBottomBar.A05.setContentDescription(str);
                AnonymousClass4Y7.A01(creationModeBottomBar.A05, true, true);
                AnonymousClass4Y7.A01(creationModeBottomBar.A04, false, true);
            } else {
                return;
            }
        } else {
            AnonymousClass35R r12 = (AnonymousClass35R) this;
            if (TextUtils.getTrimmedLength(charSequence) > 0) {
                r7 = r12.A00;
                C41621wG r62 = r7.A0L;
                int i3 = r7.A03;
                String str2 = r7.A08;
                CreationModeBottomBar creationModeBottomBar2 = (CreationModeBottomBar) r62;
                creationModeBottomBar2.A05.setEnabled(true);
                creationModeBottomBar2.A05.setImageDrawable(new C447725m(AnonymousClass00T.A04(creationModeBottomBar2.getContext(), i3), creationModeBottomBar2.A0C));
                creationModeBottomBar2.A05.setContentDescription(str2);
                AnonymousClass4Y7.A01(creationModeBottomBar2.A04, false, true);
                AnonymousClass4Y7.A01(creationModeBottomBar2.A05, true, true);
            } else {
                return;
            }
        }
        r7.A06 = new C78573yJ(r7);
    }
}
