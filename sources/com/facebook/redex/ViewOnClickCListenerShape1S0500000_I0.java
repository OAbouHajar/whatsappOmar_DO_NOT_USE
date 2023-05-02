package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01Y;
import X.AnonymousClass1NO;
import X.AnonymousClass1Vt;
import X.AnonymousClass2SE;
import X.AnonymousClass33L;
import X.C14600pS;
import X.C14750ph;
import X.C14870pt;
import X.C15860rz;
import X.C16010sH;
import X.C18310wU;
import X.C19980zJ;
import X.C228019i;
import X.C28371Vv;
import X.C31621el;
import X.C35081lL;
import X.C86184Rn;
import X.C90994fC;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.BlockConfirmationDialogFragment;
import com.obwhatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public class ViewOnClickCListenerShape1S0500000_I0 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public ViewOnClickCListenerShape1S0500000_I0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.A05 = i2;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
    }

    public final void onClick(View view) {
        switch (this.A05) {
            case 0:
                View view2 = (View) this.A00;
                C16010sH r5 = (C16010sH) this.A01;
                AnonymousClass01Y r4 = (AnonymousClass01Y) this.A02;
                C14600pS r3 = (C14600pS) this.A03;
                Activity activity = (Activity) this.A04;
                AnonymousClass00B.A06(r5);
                UserJid userJid = (UserJid) r5.A08(UserJid.class);
                AnonymousClass00B.A06(userJid);
                boolean A0V = r4.A0V(userJid);
                String str = "block_header_chat";
                boolean A0H = r5.A0H();
                if (A0V) {
                    if (A0H) {
                        str = "chat";
                    }
                    r4.A0J(activity, r5, str, false);
                    return;
                } else if (A0H) {
                    view2.getContext().startActivity(C14750ph.A0a(view2.getContext(), userJid, "chat", false, false, false));
                    return;
                } else {
                    r3.Afc(BlockConfirmationDialogFragment.A01(userJid, str, false, false, true, false));
                    return;
                }
            case 1:
                C228019i r11 = (C228019i) this.A00;
                TextView textView = (TextView) this.A01;
                AnonymousClass2SE r10 = (AnonymousClass2SE) this.A02;
                AnonymousClass1Vt r8 = (AnonymousClass1Vt) this.A03;
                UserJid userJid2 = (UserJid) this.A04;
                if (r11.A00.A0O()) {
                    r11.A05(textView, r8, true);
                    C18310wU r12 = r11.A0A;
                    String str2 = r8.A0K;
                    C86184Rn r6 = new C86184Rn(textView, r8, userJid2, r10, r11);
                    r12.A0H(new AnonymousClass33L(r12.A05.A00, r12.A0B, r6, r12, r12.A01), new C28371Vv("account", new C35081lL[]{new C35081lL("action", "cancel-payment-request"), new C35081lL("request-id", str2)}), "set", AnonymousClass1NO.A0L);
                    return;
                }
                return;
            case 2:
                C31621el r0 = (C31621el) this.A00;
                AnonymousClass013 r62 = (AnonymousClass013) this.A01;
                C19980zJ r52 = (C19980zJ) this.A02;
                Context context = (Context) this.A03;
                C14870pt r32 = (C14870pt) this.A04;
                if (r0 != null) {
                    String str3 = r0.A01;
                    if (!TextUtils.isEmpty(str3)) {
                        r52.A06(context, new Intent("android.intent.action.VIEW", Uri.parse(str3.replace("%@", r62.A06()))));
                        return;
                    }
                }
                r32.A09(R.string.str1665, 0);
                return;
            default:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                View view3 = (View) this.A01;
                ViewGroup viewGroup = (ViewGroup) this.A02;
                Object obj = this.A03;
                int[] iArr = (int[]) this.A04;
                view3.performHapticFeedback(1, 2);
                if (((SharedPreferences) messageReplyActivity.A09.A01.get()).getInt("status_reactions_nux_shown_count", 0) <= 2) {
                    C15860rz r1 = messageReplyActivity.A09;
                    r1.A0K().putInt("status_reactions_nux_shown_count", ((SharedPreferences) r1.A01.get()).getInt("status_reactions_nux_shown_count", 0) + 1).apply();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                AnimatorSet animatorSet2 = new AnimatorSet();
                View view4 = view3;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view4, View.SCALE_X, new float[]{1.5f});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view4, View.SCALE_Y, new float[]{1.5f});
                ofFloat.setDuration(500);
                ofFloat2.setDuration(500);
                Interpolator interpolator = MessageReplyActivity.A1I;
                ofFloat.setInterpolator(interpolator);
                ofFloat2.setInterpolator(interpolator);
                animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2});
                AnimatorSet animatorSet3 = new AnimatorSet();
                View view5 = view3;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view5, View.SCALE_X, new float[]{0.0f});
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view5, View.SCALE_Y, new float[]{0.0f});
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view5, View.ALPHA, new float[]{0.0f});
                ofFloat3.setDuration(200);
                ofFloat4.setDuration(200);
                ofFloat5.setDuration(200);
                Interpolator interpolator2 = MessageReplyActivity.A1H;
                ofFloat3.setInterpolator(interpolator2);
                ofFloat4.setInterpolator(interpolator2);
                ofFloat5.setInterpolator(interpolator2);
                animatorSet3.playTogether(new Animator[]{ofFloat3, ofFloat4, ofFloat5});
                AnimatorSet animatorSet4 = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    if (viewGroup.getChildAt(i2).getId() != view3.getId()) {
                        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(viewGroup.getChildAt(i2), View.ALPHA, new float[]{0.0f});
                        ofFloat6.setDuration(250);
                        ofFloat6.setInterpolator(interpolator);
                        arrayList.add(ofFloat6);
                    }
                }
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(obj, View.ALPHA, new float[]{0.0f});
                ofFloat7.setDuration(250);
                ofFloat7.setInterpolator(interpolator);
                arrayList.add(ofFloat7);
                animatorSet4.playTogether(arrayList);
                animatorSet.playTogether(new Animator[]{animatorSet2, animatorSet4});
                animatorSet.playSequentially(new Animator[]{animatorSet2, animatorSet3});
                animatorSet.addListener(new C90994fC(animatorSet, messageReplyActivity, iArr));
                animatorSet.start();
                return;
        }
    }
}
