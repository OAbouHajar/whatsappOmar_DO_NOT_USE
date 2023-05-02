package X;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.obwhatsapp.calling.views.VoipCallControlRingingDotsIndicator;

/* renamed from: X.26H  reason: invalid class name */
public abstract class AnonymousClass26H extends C005602k {
    public final ParticipantsListViewModel A00;

    public AnonymousClass26H(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view);
        this.A00 = participantsListViewModel;
    }

    public void A07(AnonymousClass26J r19) {
        Resources resources;
        int i2;
        String string;
        AnonymousClass26J r4 = r19;
        if (this instanceof C449226g) {
            C449226g r3 = (C449226g) this;
            boolean z2 = r4 instanceof C72983n5;
            AnonymousClass00B.A0B("unknown view state type", z2);
            ParticipantsListViewModel participantsListViewModel = r3.A00;
            boolean z3 = false;
            if (participantsListViewModel != null) {
                z3 = true;
            }
            AnonymousClass00B.A0B("view model is null", z3);
            if (z2 && participantsListViewModel != null) {
                WaTextView waTextView = r3.A01;
                AnonymousClass2Wj r1 = ((C72983n5) r4).A00;
                View view = r3.A0H;
                waTextView.setText(r1.A00(view.getContext()));
                Resources resources2 = view.getResources();
                C448926b r8 = participantsListViewModel.A07;
                C16050sL r7 = r8.A04().A03;
                String A09 = C30341cC.A09(r3.A02, r3.A03, r3.A04, r7, r3.A05);
                if (A09 == null) {
                    A09 = resources2.getString(R.string.str0a3f);
                    boolean z4 = r8.A04().A0F;
                    int i3 = R.string.str033a;
                    if (z4) {
                        i3 = R.string.str0339;
                    }
                    string = resources2.getString(i3);
                } else {
                    boolean z5 = r8.A04().A0F;
                    int i4 = R.string.str1a44;
                    if (z5) {
                        i4 = R.string.str19c4;
                    }
                    string = resources2.getString(i4, new Object[]{A09});
                }
                TextEmojiLabel textEmojiLabel = r3.A00;
                textEmojiLabel.setText(A09);
                textEmojiLabel.setContentDescription(string);
                view.post(new RunnableRunnableShape5S0100000_I0_4((Object) r3, 4));
                return;
            }
            return;
        }
        AnonymousClass26G r32 = (AnonymousClass26G) this;
        boolean z6 = r4 instanceof AnonymousClass26I;
        AnonymousClass00B.A0B("Unknown list item type", z6);
        if (z6) {
            VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator = r32.A05;
            voipCallControlRingingDotsIndicator.removeCallbacks(r32.A0A);
            r32.A00 = (AnonymousClass26I) r4;
            View view2 = r32.A0H;
            C004601z.A0j(view2, (AnonymousClass05M) null);
            view2.setClickable(false);
            AnonymousClass26I r42 = r32.A00;
            if (!(r42.A00 == 11 && r42.A04 && r32.A06.getVisibility() == 0)) {
                r32.A06.setVisibility(8);
            }
            ImageView imageView = r32.A03;
            imageView.setVisibility(8);
            voipCallControlRingingDotsIndicator.setVisibility(8);
            r32.A08();
            view2.setTag(r32.A00.A02);
            AnonymousClass26I r0 = r32.A00;
            if (r0 != null) {
                r32.A08.A03(r32.A02, r32.A07, r0.A01, true);
            }
            AnonymousClass26I r12 = r32.A00;
            if (r12.A03) {
                r32.A04.A03();
                ImageView imageView2 = r32.A02;
                imageView2.setOnClickListener((View.OnClickListener) null);
                C004601z.A0d(imageView2, 2);
                return;
            }
            boolean z7 = r12.A04;
            C30521cU r72 = r32.A04;
            r72.A0A(r12.A01);
            int i5 = r12.A00;
            if (i5 == 1) {
                r32.A01.setAlpha(1.0f);
                r32.A02.setAlpha(1.0f);
                if (!z7) {
                    AnimationSet animationSet = new AnimationSet(false);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                    alphaAnimation.setDuration(500);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                    scaleAnimation.setDuration(500);
                    scaleAnimation.setInterpolator(C04240Lt.A00(0.2f, 1.65f, 0.55f, 1.0f));
                    animationSet.addAnimation(scaleAnimation);
                    animationSet.addAnimation(alphaAnimation);
                    imageView.startAnimation(animationSet);
                    imageView.setVisibility(0);
                }
                resources = view2.getResources();
                i2 = R.string.str1ab5;
            } else if (i5 == 11 || !z7) {
                r32.A02.setAlpha(0.3f);
                r32.A01.setAlpha(0.3f);
                if (z7) {
                    r32.A09();
                    return;
                } else {
                    resources = view2.getResources();
                    i2 = R.string.str1ac1;
                }
            } else {
                r32.A0A();
                return;
            }
            view2.setContentDescription(resources.getString(i2, new Object[]{r72.A02.getText()}));
        }
    }
}
