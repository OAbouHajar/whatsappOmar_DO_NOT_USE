package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.SharedPreferences;
import android.view.animation.Animation;
import com.facebook.redex.IDxSListenerShape276S0100000_2_I0;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;

/* renamed from: X.2Jp  reason: invalid class name and case insensitive filesystem */
public class C47592Jp {
    public ObjectAnimator A00;
    public AnonymousClass4MD A01;
    public C47582Jo A02;
    public AnonymousClass5QT A03;
    public C47602Jq A04;
    public final AnonymousClass1MH A05;
    public final AnonymousClass1MF A06;
    public final AnonymousClass1CX A07;
    public final AnonymousClass5QT A08 = new IDxSListenerShape276S0100000_2_I0(this, 0);
    public final AnonymousClass1M9 A09;
    public final C26161Mo A0A;
    public final AnonymousClass1MG A0B;
    public final C34331k5 A0C = new ViewOnClickCListenerShape1S0100000_I0_1(this, 37);

    public C47592Jp(AnonymousClass1MH r3, AnonymousClass1MF r4, AnonymousClass1CX r5, AnonymousClass1M9 r6, C26161Mo r7, AnonymousClass1MG r8) {
        this.A07 = r5;
        this.A06 = r4;
        this.A0B = r8;
        this.A05 = r3;
        this.A0A = r7;
        this.A09 = r6;
    }

    public void A00() {
        if (this.A01.A00.getVisibility() == 0) {
            ((SharedPreferences) this.A05.A0A.A01.getValue()).edit().putBoolean("pref_avatar_sticker_onboarding_shown", true).apply();
            this.A01.A00.setVisibility(8);
            Animation animation = this.A01.A00.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
        }
    }

    public void A01(int i2) {
        this.A01.A01.setVisibility(i2);
        if (i2 != 0) {
            A00();
        } else if (this.A01.A00.getVisibility() != 0) {
            C15220qW r4 = this.A05.A0A.A01;
            if (!((SharedPreferences) r4.getValue()).getBoolean("pref_avatar_sticker_onboarding_shown", false)) {
                ((SharedPreferences) r4.getValue()).edit().putBoolean("pref_avatar_sticker_onboarding_shown", true).apply();
                this.A01.A00.setVisibility(0);
                ObjectAnimator objectAnimator = this.A00;
                if (objectAnimator == null) {
                    objectAnimator = ObjectAnimator.ofPropertyValuesHolder(this.A01.A00, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.4f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.4f}), PropertyValuesHolder.ofFloat("alpha", new float[]{0.4f, 0.0f})});
                    this.A00 = objectAnimator;
                }
                objectAnimator.setDuration(1500);
                this.A00.setRepeatCount(-1);
                this.A00.setRepeatMode(1);
                this.A00.start();
                return;
            }
            this.A01.A00.setVisibility(8);
        }
    }
}
