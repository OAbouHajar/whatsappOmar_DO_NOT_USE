package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.conversation.conversationrow.ConversationRowMediaControlView;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;

/* renamed from: X.2Q7  reason: invalid class name */
public abstract class AnonymousClass2Q7 extends AnonymousClass2Q8 {
    public C615139f A00;
    public C16260sj A01;
    public C26681Os A02;
    public C809846j A03;
    public AnonymousClass1HE A04;
    public C24551Gj A05;
    public C209212c A06;
    public C26691Ot A07;
    public final C34331k5 A08 = new ViewOnClickCListenerShape1S0100000_I0_1(this, 28);
    public final C34331k5 A09 = new ViewOnClickCListenerShape1S0100000_I0_1(this, 26);
    public final C34331k5 A0A = new ViewOnClickCListenerShape1S0100000_I0_1(this, 27);
    public final C34331k5 A0B = new ViewOnClickCListenerShape1S0100000_I0_1(this, 29);
    public final AnonymousClass1ZQ A0C;

    public AnonymousClass2Q7(Context context, AnonymousClass1YG r4, C16730tY r5) {
        super(context, r4, r5);
        this.A0C = C47612Jr.A00(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0121, code lost:
        if (r25 != false) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0c(android.view.View r20, android.view.View r21, X.C33741j5 r22, X.C33741j5 r23, boolean r24, boolean r25, boolean r26) {
        /*
            r6 = r20
            int r8 = r6.getWidth()
            r15 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r7 = 1
            r1 = 8
            r0 = 0
            r10 = r22
            int r2 = r10.A01()
            r5 = r21
            r9 = r23
            r13 = r26
            if (r24 == 0) goto L_0x00d1
            if (r2 != 0) goto L_0x0023
            int r2 = r9.A01()
            if (r2 == 0) goto L_0x00cc
        L_0x0023:
            r2 = 150(0x96, double:7.4E-322)
            if (r25 == 0) goto L_0x00cd
            r16 = 1056964608(0x3f000000, float:0.5)
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 1056964608(0x3f000000, float:0.5)
            r20 = 1056964608(0x3f000000, float:0.5)
            r21 = 1
            r22 = 1056964608(0x3f000000, float:0.5)
            r19 = 1
            android.view.animation.ScaleAnimation r14 = new android.view.animation.ScaleAnimation
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            android.view.animation.AlphaAnimation r12 = new android.view.animation.AlphaAnimation
            r12.<init>(r15, r4)
            android.view.animation.AnimationSet r11 = new android.view.animation.AnimationSet
            r11.<init>(r7)
            r11.addAnimation(r14)
            r11.addAnimation(r12)
            r11.setDuration(r2)
            r5.startAnimation(r11)
        L_0x0050:
            r5.setVisibility(r1)
            android.view.View r7 = r10.A02()
            android.view.View r9 = r9.A02()
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r7.setVisibility(r0)
            r9.setVisibility(r0)
            r1 = 0
            r9.setContentDescription(r1)
            r1 = 2131230969(0x7f0800f9, float:1.8078006E38)
            if (r26 == 0) goto L_0x006f
            r1 = 2131231960(0x7f0804d8, float:1.8080016E38)
        L_0x006f:
            r9.setImageResource(r1)
            if (r25 == 0) goto L_0x0125
            android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
            r1.<init>(r4, r15)
            r4 = 300(0x12c, double:1.48E-321)
            r1.setDuration(r4)
            r1.setStartOffset(r2)
            r7.startAnimation(r1)
            r9.startAnimation(r1)
        L_0x0087:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r1, r0)
            int r4 = r6.getMeasuredWidth()
            android.graphics.drawable.Drawable r1 = r6.getBackground()
            boolean r0 = r1 instanceof X.AnonymousClass3LF
            if (r0 != 0) goto L_0x00a6
            X.3LF r0 = new X.3LF
            r0.<init>(r1, r13)
            r6.setBackground(r0)
        L_0x00a6:
            android.graphics.drawable.Drawable r3 = r6.getBackground()
            X.3LF r3 = (X.AnonymousClass3LF) r3
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            int r0 = java.lang.Math.max(r8, r4)
            r1.width = r0
            X.3NM r2 = new X.3NM
            r2.<init>(r3, r8, r4)
            r1 = 2
            com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0 r0 = new com.obwhatsapp.IDxLAdapterShape11S0200000_2_I0
            r0.<init>(r3, r1, r6)
            r2.setAnimationListener(r0)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r6.startAnimation(r2)
        L_0x00cc:
            return
        L_0x00cd:
            r5.clearAnimation()
            goto L_0x0050
        L_0x00d1:
            if (r2 != r1) goto L_0x00d9
            int r2 = r9.A01()
            if (r2 == r1) goto L_0x00cc
        L_0x00d9:
            r5.setVisibility(r0)
            if (r25 == 0) goto L_0x010d
            r17 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r2 = new android.view.animation.ScaleAnimation
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 1056964608(0x3f000000, float:0.5)
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 1
            r22 = 1056964608(0x3f000000, float:0.5)
            r23 = 1
            r24 = 1056964608(0x3f000000, float:0.5)
            r16 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            android.view.animation.AlphaAnimation r3 = new android.view.animation.AlphaAnimation
            r3.<init>(r4, r15)
            android.view.animation.AnimationSet r4 = new android.view.animation.AnimationSet
            r4.<init>(r7)
            r4.addAnimation(r2)
            r4.addAnimation(r3)
            r2 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r2)
            r5.startAnimation(r4)
        L_0x010d:
            android.view.View r2 = r10.A01
            if (r2 == 0) goto L_0x0114
            r2.clearAnimation()
        L_0x0114:
            r10.A03(r1)
            android.view.View r2 = r9.A01
            if (r2 == 0) goto L_0x011e
            r2.clearAnimation()
        L_0x011e:
            r9.A03(r1)
            if (r25 == 0) goto L_0x012b
            goto L_0x0087
        L_0x0125:
            r7.clearAnimation()
            r9.clearAnimation()
        L_0x012b:
            r6.clearAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Q7.A0c(android.view.View, android.view.View, X.1j5, X.1j5, boolean, boolean, boolean):void");
    }

    public static void A0d(ConversationRowMediaControlView conversationRowMediaControlView, boolean z2, boolean z3) {
        A0c(conversationRowMediaControlView, conversationRowMediaControlView.A00, conversationRowMediaControlView.A05, conversationRowMediaControlView.A04, z2, z3, false);
    }

    public int A0p(int i2) {
        if (!TextUtils.isEmpty(getFMessage().A13()) || (!(this instanceof AnonymousClass31L) && !(this instanceof C602930v) && !(this instanceof AnonymousClass31B) && !(this instanceof C602430q))) {
            return super.A0p(i2);
        }
        boolean A022 = C42881yp.A02(i2, 13);
        int bubbleTick = yo.getBubbleTick("message_got_read_receipt_from_target_onmedia");
        if (A022) {
            return bubbleTick;
        }
        boolean A023 = C42881yp.A02(i2, 5);
        int bubbleTick2 = yo.getBubbleTick("message_got_receipt_from_target_onmedia");
        if (A023) {
            return bubbleTick2;
        }
        return i2 == 4 ? yo.getBubbleTick("message_got_receipt_from_server_onmedia") : yo.getBubbleTick("message_unsent_onmedia");
    }

    public abstract void A0z();

    public void A1N(View view, TextEmojiLabel textEmojiLabel, String str) {
        if (textEmojiLabel != null) {
            C16730tY fMessage = getFMessage();
            Resources resources = getResources();
            if (!TextUtils.isEmpty(str)) {
                textEmojiLabel.setVisibility(0);
                setMessageText(str, textEmojiLabel, fMessage);
                TextView textView = this.A0E;
                int secondaryTextColor = getSecondaryTextColor();
                this.A04.setPadding(resources.getDimensionPixelSize(R.dimen.dimen0246), 0, resources.getDimensionPixelSize(R.dimen.dimen0246), resources.getDimensionPixelSize(R.dimen.dimen0244));
                ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = 0;
            } else {
                textEmojiLabel.setVisibility(8);
                TextView textView2 = this.A0E;
                int A002 = AnonymousClass00T.A00(getContext(), R.color.color01a5);
                ViewGroup viewGroup = this.A04;
                viewGroup.setPadding(resources.getDimensionPixelSize(R.dimen.dimen0247), 0, resources.getDimensionPixelSize(R.dimen.dimen0247), 0);
                viewGroup.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                if (view != null) {
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin = (-viewGroup.getMeasuredHeight()) - getResources().getDimensionPixelSize(R.dimen.dimen0245);
                }
            }
            ImageView imageView = this.A09;
            if (imageView != null) {
                imageView.setImageDrawable(getKeepDrawable());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005c, code lost:
        if (r0.A04 == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1O(X.C16740tZ r19) {
        /*
            r18 = this;
            r2 = r19
            X.1uH r0 = r2.A0N
            r1 = r18
            if (r0 == 0) goto L_0x0076
            android.view.ViewGroup r6 = r1.getExternalAdContentHolder()
            if (r6 == 0) goto L_0x0075
            r15 = 0
            X.1xL r0 = X.C42171xL.A00(r15, r2)
            r3 = 0
            r6.setVisibility(r3)
            X.39f r3 = r1.A00
            if (r3 != 0) goto L_0x0053
            android.content.Context r9 = r1.getContext()
            X.0uW r10 = r1.A0K
            X.1Mg r14 = r1.A12
            X.1Ld r5 = r1.A1d
            X.0uk r11 = r1.A0Y
            X.0pt r8 = r1.A0J
            X.0sq r7 = r1.A1e
            X.0ua r4 = r1.A0O
            X.188 r3 = r1.A0y
            X.4NE r12 = new X.4NE
            r12.<init>(r8, r4, r3, r7)
            X.46j r13 = r1.A03
            X.1Gj r3 = r1.A05
            X.39f r8 = new X.39f
            r17 = r5
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.A00 = r8
            com.obwhatsapp.webpagepreview.WebPagePreviewView r5 = r8.A0C
            r4 = -1
            r3 = -2
            r6.addView(r5, r4, r3)
            X.39f r3 = r1.A00
            com.obwhatsapp.webpagepreview.WebPagePreviewView r4 = r3.A0C
            android.view.View$OnLongClickListener r3 = r1.A1n
            r4.setOnLongClickListener(r3)
        L_0x0053:
            X.1ZQ r4 = r1.A0C
            boolean r3 = r4 instanceof X.AnonymousClass1ZP
            if (r3 == 0) goto L_0x005e
            boolean r3 = r0.A04
            r10 = 1
            if (r3 != 0) goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            X.39f r5 = r1.A00
            X.1Os r3 = r1.A02
            boolean r11 = r3.A00(r2)
            X.1Os r3 = r1.A02
            boolean r12 = r3.A01(r2)
            r13 = 0
            r8 = r4
            r9 = r0
            r7 = r2
            r6 = r1
            r5.A02(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0075:
            return
        L_0x0076:
            android.view.ViewGroup r2 = r1.getExternalAdContentHolder()
            if (r2 == 0) goto L_0x0075
            X.39f r0 = r1.A00
            if (r0 == 0) goto L_0x0088
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r0.A0C
            r2.removeView(r0)
            r0 = 0
            r1.A00 = r0
        L_0x0088:
            r0 = 8
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Q7.A1O(X.0tZ):void");
    }

    public boolean A1P() {
        C16750ta r1;
        C16730tY fMessage = getFMessage();
        C25791Ld r2 = this.A1d;
        if (fMessage.A11.A02 || (r1 = fMessage.A02) == null) {
            return false;
        }
        r1.A0W = true;
        r2.A0D(fMessage);
        A0t();
        return true;
    }

    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    public C16730tY getFMessage() {
        return (C16730tY) this.A0O;
    }

    public Drawable getKeepDrawable() {
        return TextUtils.isEmpty(getFMessage().A13()) ? AnonymousClass2SR.A02(getContext(), R.drawable.keep, R.color.color090b) : super.getKeepDrawable();
    }

    public int getVideoOriginForFieldstats() {
        AnonymousClass1YG r0 = this.A0b;
        if (r0 != null) {
            int AAs = r0.AAs();
            if (AAs != 0) {
                if (AAs == 1) {
                    return 3;
                }
                if (AAs != 2) {
                    return 5;
                }
            }
            return 1;
        }
        return 5;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C16730tY);
        this.A0O = r2;
    }
}
