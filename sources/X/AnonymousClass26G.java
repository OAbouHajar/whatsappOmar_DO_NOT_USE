package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.obwhatsapp.calling.views.VoipCallControlRingingDotsIndicator;
import com.obwhatsapp.components.Button;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;

/* renamed from: X.26G  reason: invalid class name */
public class AnonymousClass26G extends AnonymousClass26H {
    public AnonymousClass26I A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final C30521cU A04;
    public final VoipCallControlRingingDotsIndicator A05;
    public final Button A06;
    public final AnonymousClass2OY A07;
    public final AnonymousClass2Ao A08;
    public final AnonymousClass01V A09;
    public final Runnable A0A = new RunnableRunnableShape5S0100000_I0_4((Object) this, 2);

    public AnonymousClass26G(View view, ParticipantsListViewModel participantsListViewModel, C16080sP r10, AnonymousClass2OY r11, AnonymousClass2Ao r12, AnonymousClass01V r13, AnonymousClass013 r14, C25781Lc r15) {
        super(view, participantsListViewModel);
        this.A01 = C004601z.A0E(view, R.id.name);
        this.A09 = r13;
        this.A07 = r11;
        this.A08 = r12;
        this.A04 = new C30521cU(view, r10, r14, r15, (int) R.id.name);
        this.A02 = (ImageView) C004601z.A0E(view, R.id.avatar);
        this.A03 = (ImageView) C004601z.A0E(view, R.id.connect_icon);
        this.A06 = (Button) C004601z.A0E(view, R.id.ring_btn);
        this.A05 = (VoipCallControlRingingDotsIndicator) C004601z.A0E(view, R.id.ringing_dots);
    }

    public static void A00(View view, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(C04240Lt.A00(0.0f, 0.0f, 0.6f, 1.0f));
        alphaAnimation.setDuration(750);
        alphaAnimation.setRepeatCount(1);
        alphaAnimation.setRepeatMode(2);
        view.startAnimation(alphaAnimation);
    }

    public boolean A06() {
        return this.A00 != null;
    }

    public void A08() {
        this.A01.clearAnimation();
        this.A02.clearAnimation();
        this.A05.clearAnimation();
    }

    public final void A09() {
        this.A02.setAlpha(0.3f);
        this.A01.setAlpha(0.3f);
        this.A05.setVisibility(8);
        View view = this.A06;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().setDuration(500).alpha(1.0f).start();
        }
        if (AnonymousClass2JP.A06(this.A09.A0P())) {
            view = this.A0H;
        }
        view.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 32));
        View view2 = this.A0H;
        C62043Bk.A04(view2, view2.getResources().getString(R.string.str1ac2, new Object[]{this.A04.A02.getText()}), (String) null);
    }

    public final void A0A() {
        this.A06.setVisibility(8);
        VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator = this.A05;
        voipCallControlRingingDotsIndicator.setVisibility(0);
        View view = this.A0H;
        view.setContentDescription(view.getResources().getString(R.string.str1ad4, new Object[]{this.A04.A02.getText()}));
        ParticipantsListViewModel participantsListViewModel = this.A00;
        if (!(participantsListViewModel == null || participantsListViewModel.A07.A04().A03 == null)) {
            voipCallControlRingingDotsIndicator.postDelayed(new RunnableRunnableShape5S0100000_I0_4((Object) this, 3), 2000);
        }
        AnonymousClass3NP r2 = new AnonymousClass3NP(voipCallControlRingingDotsIndicator);
        r2.setRepeatCount(-1);
        r2.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(this, 4));
        voipCallControlRingingDotsIndicator.startAnimation(r2);
    }
}
