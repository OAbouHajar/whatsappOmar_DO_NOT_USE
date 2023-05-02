package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import com.facebook.redex.IDxSListenerShape277S0100000_2_I1;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;

/* renamed from: X.39R  reason: invalid class name */
public class AnonymousClass39R {
    public ObjectAnimator A00;
    public C47582Jo A01;
    public AnonymousClass4NH A02;
    public AnonymousClass3H7 A03;
    public AnonymousClass5QT A04;
    public AnonymousClass33c A05;
    public final AnonymousClass1MH A06;
    public final AnonymousClass1MI A07;
    public final C212613k A08;
    public final AnonymousClass18G A09;
    public final AnonymousClass1MF A0A;
    public final AnonymousClass14W A0B;
    public final AnonymousClass1CX A0C;
    public final AnonymousClass5QT A0D = new IDxSListenerShape277S0100000_2_I1(this, 0);
    public final AnonymousClass1M9 A0E;
    public final C26161Mo A0F;
    public final AnonymousClass1MG A0G;
    public final C41791wf A0H;
    public final C34331k5 A0I = new ViewOnClickCListenerShape5S0100000_I1_1(this, 27);

    public AnonymousClass39R(AnonymousClass1MH r3, AnonymousClass1MI r4, C212613k r5, AnonymousClass18G r6, AnonymousClass1MF r7, AnonymousClass14W r8, AnonymousClass1CX r9, AnonymousClass1M9 r10, C26161Mo r11, AnonymousClass1MG r12, C41791wf r13) {
        this.A08 = r5;
        this.A0H = r13;
        this.A0B = r8;
        this.A0C = r9;
        this.A06 = r3;
        this.A0A = r7;
        this.A09 = r6;
        this.A0G = r12;
        this.A0F = r11;
        this.A07 = r4;
        this.A0E = r10;
    }

    public void A00() {
        this.A02.A02.setVisibility(0);
        boolean z2 = C13680ns.A0B(this.A06.A05).getBoolean("sticker_store_onboarding_badge_shown", false);
        AnonymousClass4NH r0 = this.A02;
        if (!z2) {
            r0.A01.setVisibility(0);
            ObjectAnimator objectAnimator = this.A00;
            if (objectAnimator == null) {
                objectAnimator = ObjectAnimator.ofPropertyValuesHolder(this.A02.A01, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.4f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.4f}), PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f})});
                this.A00 = objectAnimator;
            }
            objectAnimator.setDuration(1500);
            this.A00.setRepeatCount(-1);
            this.A00.setRepeatMode(1);
            this.A00.start();
            return;
        }
        r0.A01.setVisibility(8);
    }

    public boolean A01() {
        C26161Mo r0;
        if (this.A0E.A00 && (r0 = this.A0F) != null) {
            AnonymousClass027 r1 = r0.A03;
            return r1.A01() != null && !C13690nt.A0k(r1).isEmpty();
        }
    }
}
