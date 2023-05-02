package com.obwhatsapp.calling;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass2Wj;
import X.AnonymousClass3OP;
import X.C004601z;
import X.C14710pd;
import X.C15830rv;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C17240ul;
import X.C216014s;
import X.C23061Ai;
import X.C25781Lc;
import X.C30341cC;
import X.C30521cU;
import X.C52142dD;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C57382r3;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxDCompatShape22S0100000_2_I0;
import com.facebook.redex.IDxLAdapterShape0S0110000_2_I0;
import com.facebook.redex.IDxLAdapterShape2S0100000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;

public class CallDetailsLayout extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public int A01;
    public Typeface A02;
    public FrameLayout A03;
    public TextView A04;
    public TextView A05;
    public C15900s5 A06;
    public C30521cU A07;
    public PeerAvatarLayout A08;
    public C16000sG A09;
    public C16080sP A0A;
    public AnonymousClass01V A0B;
    public C15860rz A0C;
    public AnonymousClass013 A0D;
    public C16070sO A0E;
    public C14710pd A0F;
    public C17240ul A0G;
    public C25781Lc A0H;
    public C216014s A0I;
    public C23061Ai A0J;
    public C52662eE A0K;
    public boolean A0L;

    public CallDetailsLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CallDetailsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallDetailsLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0L) {
            this.A0L = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A0F = (C14710pd) r1.A05.get();
            this.A0J = (C23061Ai) r1.AC0.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A0I = (C216014s) r1.AMr.get();
            this.A09 = (C16000sG) r1.A4x.get();
            this.A0B = (AnonymousClass01V) r1.AOi.get();
            this.A0A = (C16080sP) r1.AQ9.get();
            this.A0D = (AnonymousClass013) r1.AR8.get();
            this.A0G = (C17240ul) r1.ABK.get();
            this.A0H = new C25781Lc();
            this.A0E = (C16070sO) r1.ABY.get();
            this.A0C = (C15860rz) r1.AQh.get();
        }
        LayoutInflater.from(context).inflate(R.layout.layout00cd, this, true);
        this.A05 = (TextView) findViewById(R.id.name);
        this.A07 = new C30521cU((View) this, this.A0A, this.A0D, this.A0H, (int) R.id.name);
        this.A04 = (TextView) findViewById(R.id.call_status);
        this.A08 = (PeerAvatarLayout) findViewById(R.id.peer_avatar_layout);
        this.A03 = (FrameLayout) findViewById(R.id.peer_avatar_container);
        this.A01 = getResources().getColor(R.color.color0792);
        this.A02 = Typeface.create("sans-serif", 0);
        C004601z.A0j(this.A04, new IDxDCompatShape22S0100000_2_I0(this, 5));
    }

    public static final ObjectAnimator A00(View view, String str, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, new float[]{f2});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(125);
        return ofFloat;
    }

    public static final void A01(View view, Integer num, Integer num2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int intValue = num.intValue();
        Integer valueOf = Integer.valueOf(num2 == null ? marginLayoutParams.bottomMargin : num2.intValue());
        if (marginLayoutParams.topMargin != intValue || marginLayoutParams.bottomMargin != valueOf.intValue()) {
            marginLayoutParams.topMargin = intValue;
            marginLayoutParams.bottomMargin = valueOf.intValue();
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public void A02(GroupJid groupJid) {
        C16010sH A022;
        if (groupJid != null) {
            PeerAvatarLayout peerAvatarLayout = this.A08;
            if (peerAvatarLayout.getVisibility() != 8 && (A022 = C30341cC.A02(this.A09, this.A0G, groupJid, this.A0I)) != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(A022);
                C57382r3 r1 = peerAvatarLayout.A02;
                List list = r1.A00;
                list.clear();
                list.addAll(arrayList);
                r1.A01();
            }
        }
    }

    public final void A03(CallState callState, boolean z2, boolean z3) {
        boolean z4;
        TextView textView;
        ObjectAnimator objectAnimator;
        String str;
        int i2 = 0;
        CallState callState2 = callState;
        if (!C30341cC.A0M(this.A0C, this.A0F) || !z2) {
            z4 = true;
            if ((!(Voip.A09(callState2) || callState2 == CallState.CALLING || callState2 == CallState.PRE_ACCEPT_RECEIVED) || z2) && this.A00 != 1) {
                z4 = false;
            }
            textView = this.A05;
            A01(textView, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.dimen04b4)), Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.dimen04b2)));
        } else {
            textView = this.A05;
            A01(textView, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.dimen0508)), Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.dimen0507)));
            z4 = false;
        }
        FrameLayout frameLayout = this.A03;
        if (frameLayout.getVisibility() == 0) {
            if (!z4) {
                Log.i("voip/CallDetailsLayout/animateAvatarLayout");
                if (callState2 == CallState.NONE) {
                    str = "voip/CallDetailsLayout/animateAvatarLayout return directly, no call is going on";
                } else {
                    int i3 = this.A00;
                    if (i3 == 1) {
                        StringBuilder sb = new StringBuilder("voip/CallDetailsLayout/animateAvatarLayout return directly, avatarAnimationState: ");
                        sb.append(i3);
                        str = sb.toString();
                    } else if (frameLayout.getVisibility() == 8) {
                        str = "voip/CallDetailsLayout/animateAvatarLayout return directly, peerAvatarLayout.getVisibility() == View.GONE ";
                    } else {
                        PeerAvatarLayout peerAvatarLayout = this.A08;
                        int height = peerAvatarLayout.getHeight();
                        if (height == 0) {
                            peerAvatarLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        }
                        this.A00 = 1;
                        int i4 = 3;
                        boolean z5 = z3;
                        if (z3) {
                            i4 = 1;
                        }
                        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[i4];
                        if (z3) {
                            objectAnimator = A00(this, "alpha", 0.0f);
                        } else if (!z2) {
                            peerAvatarLayout.animate().alpha(0.0f).setDuration(200).setListener(new IDxLAdapterShape2S0100000_1_I0(this, 0)).start();
                        } else {
                            for (int i5 = 0; i5 < peerAvatarLayout.getChildCount(); i5++) {
                                LinearLayout linearLayout = ((AnonymousClass3OP) peerAvatarLayout.getChildAt(i5)).A01;
                                height = linearLayout.getMeasuredHeight();
                                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                                scaleAnimation.setInterpolator(new DecelerateInterpolator());
                                scaleAnimation.setDuration(125);
                                linearLayout.startAnimation(scaleAnimation);
                            }
                            float f2 = (float) (-height);
                            objectAnimatorArr[0] = A00(peerAvatarLayout, "translationY", f2);
                            objectAnimatorArr[1] = A00(textView, "translationY", f2);
                            i2 = 2;
                            objectAnimator = A00(this.A04, "translationY", f2);
                        }
                        objectAnimatorArr[i2] = objectAnimator;
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(objectAnimatorArr);
                        animatorSet.start();
                        animatorSet.addListener(new IDxLAdapterShape0S0110000_2_I0(this, 1, z5));
                    }
                }
                Log.i(str);
            }
            frameLayout.setVisibility(i2);
        } else {
            if (!z4) {
                i2 = 8;
            }
            frameLayout.setVisibility(i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen04b5);
        if (z4) {
            dimensionPixelSize = (dimensionPixelSize + getResources().getDimensionPixelSize(R.dimen.dimen00ed)) - getResources().getDimensionPixelSize(R.dimen.dimen00ee);
        }
        A01(this, Integer.valueOf(dimensionPixelSize), (Integer) null);
    }

    public void A04(CallState callState, boolean z2, boolean z3, boolean z4) {
        if (!z3 && ((callState != CallState.ACTIVE && callState != CallState.CONNECTED_LONELY && callState != CallState.ACCEPT_SENT) || z4)) {
            A03(callState, z2, true);
            setAlpha(1.0f);
            setVisibility(0);
            setBackgroundColor(0);
        } else if (this.A00 != 1) {
            setVisibility(8);
            this.A03.setVisibility(8);
        }
    }

    public void A05(String str, String str2) {
        TextView textView = this.A04;
        int i2 = 0;
        if (str == null) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        textView.setText(str);
        textView.setContentDescription(str2);
    }

    public void A06(List list) {
        PeerAvatarLayout peerAvatarLayout = this.A08;
        if (peerAvatarLayout.getVisibility() != 8) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < list.size() && i2 < 7) {
                arrayList.add(this.A09.A0A((C15830rv) list.get(i2)));
                i2++;
            }
            C57382r3 r1 = peerAvatarLayout.A02;
            List list2 = r1.A00;
            list2.clear();
            list2.addAll(arrayList);
            r1.A01();
        }
    }

    public boolean A07(CallInfo callInfo) {
        if (callInfo.isGroupCall) {
            if (callInfo.videoEnabled) {
                return true;
            }
            if (C30341cC.A02(this.A09, this.A0G, callInfo.groupJid, this.A0I) == null) {
                return true;
            }
        }
        return C30341cC.A0M(this.A0C, this.A0F) && !Voip.A09(callInfo.callState) && callInfo.videoEnabled;
    }

    public void clearAnimation() {
        PeerAvatarLayout peerAvatarLayout = this.A08;
        peerAvatarLayout.clearAnimation();
        peerAvatarLayout.setTranslationY(0.0f);
        peerAvatarLayout.setAlpha(1.0f);
        TextView textView = this.A04;
        textView.clearAnimation();
        textView.setTranslationY(0.0f);
        TextView textView2 = this.A05;
        textView2.clearAnimation();
        textView2.setTranslationY(0.0f);
        for (int i2 = 0; i2 < peerAvatarLayout.getChildCount(); i2++) {
            ThumbnailButton thumbnailButton = ((AnonymousClass3OP) peerAvatarLayout.getChildAt(i2)).A02;
            thumbnailButton.clearAnimation();
            thumbnailButton.setScaleX(1.0f);
            thumbnailButton.setScaleY(1.0f);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0K;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0K = r0;
        }
        return r0.generatedComponent();
    }

    public String getNameViewContentDescription() {
        TextView textView = this.A05;
        if (textView.getContentDescription() != null) {
            return textView.getContentDescription().toString();
        }
        return null;
    }

    public void setCallDetailsDescription(List list, CallInfo callInfo) {
        String A002;
        String str;
        setFocusable(true);
        C004601z.A0d(this.A03, 1);
        GroupJid groupJid = callInfo.groupJid;
        C16000sG r7 = this.A09;
        C16080sP r6 = this.A0A;
        String A092 = C30341cC.A09(r7, r6, this.A0G, groupJid, this.A0I);
        if (A092 != null) {
            A002 = A092;
        } else {
            Context context = getContext();
            AnonymousClass2Wj A022 = C52142dD.A02(r7, r6, list, 3, false);
            A002 = A022 == null ? null : A022.A00(context);
        }
        if (Voip.A09(callInfo.callState)) {
            Context context2 = getContext();
            boolean z2 = callInfo.videoEnabled;
            int i2 = R.string.str1ac0;
            if (z2) {
                i2 = R.string.str1abf;
            }
            str = context2.getString(i2);
            C004601z.A0d(this.A04, 2);
            if (A092 != null) {
                TextView textView = this.A05;
                Context context3 = getContext();
                UserJid peerJid = callInfo.getPeerJid();
                AnonymousClass00B.A06(peerJid);
                textView.setContentDescription(context3.getString(R.string.str0c53, new Object[]{str, r6.A0C(r7.A0A(peerJid)), A002}));
                return;
            }
        } else if (!callInfo.isGroupCall || (!callInfo.isInLonelyState() && callInfo.callState != CallState.CALLING)) {
            Context context4 = getContext();
            boolean z3 = callInfo.videoEnabled;
            int i3 = R.string.str011d;
            if (z3) {
                i3 = R.string.str19b6;
            }
            str = context4.getString(i3);
            TextView textView2 = this.A04;
            C004601z.A0d(textView2, 1);
            textView2.setFocusable(true);
        } else {
            TextView textView3 = this.A05;
            Context context5 = getContext();
            boolean z4 = callInfo.videoEnabled;
            int i4 = R.string.str1ad2;
            if (z4) {
                i4 = R.string.str1ad1;
            }
            textView3.setContentDescription(context5.getString(i4, new Object[]{A002}));
            C004601z.A0d(this.A04, 2);
            return;
        }
        this.A05.setContentDescription(getContext().getString(R.string.str1a9c, new Object[]{str, A002}));
    }
}
