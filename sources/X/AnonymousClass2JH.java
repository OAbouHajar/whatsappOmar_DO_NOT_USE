package X;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.widget.AbsListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.redex.IDxSListenerShape436S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape166S0100000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.emoji.EmojiPopupFooter;
import com.obwhatsapp.yo.Conversation;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;

/* renamed from: X.2JH  reason: invalid class name */
public class AnonymousClass2JH extends AnonymousClass2JI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ViewGroup A05;
    public AnonymousClass5RN A06;
    public AnonymousClass3BH A07;
    public EmojiPopupFooter A08;
    public AnonymousClass4EI A09 = new AnonymousClass4EI(true);
    public C108705Pa A0A;
    public C614338w A0B;
    public AnonymousClass29I A0C;
    public AnonymousClass1M4 A0D;
    public Runnable A0E;
    public final View.OnClickListener A0F;
    public final View A0G;
    public final AbsListView.OnScrollListener A0H;
    public final ImageButton A0I;
    public final AnonymousClass5RN A0J;
    public final WaEditText A0K;
    public final AnonymousClass013 A0L;
    public final C206711d A0M;
    public final C17250um A0N;
    public final AnonymousClass1BQ A0O;
    public final C14710pd A0P;
    public final C17020u3 A0Q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass2JH(android.app.Activity r13, android.widget.ImageButton r14, X.C16300so r15, X.C15430qs r16, com.obwhatsapp.WaEditText r17, X.AnonymousClass01V r18, X.C15860rz r19, X.AnonymousClass013 r20, X.C206711d r21, X.C17250um r22, X.AnonymousClass1BQ r23, X.C14710pd r24, X.C17020u3 r25, X.C23061Ai r26) {
        /*
            r12 = this;
            r8 = r16
            r5 = r12
            r6 = r13
            r11 = r26
            r7 = r15
            r9 = r18
            r10 = r19
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2 = 1
            X.4EI r0 = new X.4EI
            r0.<init>(r2)
            r12.A09 = r0
            r4 = 2131231382(0x7f080296, float:1.8078843E38)
            int r4 = com.obwhatsapp.yo.Conversation.eswitch()
            r12.A00 = r4
            r0 = 2131231383(0x7f080297, float:1.8078845E38)
            r12.A03 = r0
            r1 = 4
            com.facebook.redex.IDxCListenerShape203S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape203S0100000_2_I0
            r0.<init>(r12, r1)
            r12.A0J = r0
            r1 = 5
            com.facebook.redex.IDxSListenerShape252S0100000_2_I0 r0 = new com.facebook.redex.IDxSListenerShape252S0100000_2_I0
            r0.<init>(r12, r1)
            r12.A0H = r0
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r3 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r3.<init>((java.lang.Object) r12, (int) r2)
            r12.A0F = r3
            android.view.View r8 = (android.view.View) r8
            r12.A0G = r8
            r0 = r24
            r12.A0P = r0
            r0 = r22
            r12.A0N = r0
            r0 = r21
            r12.A0M = r0
            r0 = r20
            r12.A0L = r0
            r0 = r23
            r12.A0O = r0
            r0 = r25
            r12.A0Q = r0
            r12.A0I = r14
            r0 = r17
            r12.A0K = r0
            android.view.ViewTreeObserver r2 = r8.getViewTreeObserver()
            r1 = 14
            com.facebook.redex.IDxLListenerShape144S0100000_2_I0 r0 = new com.facebook.redex.IDxLListenerShape144S0100000_2_I0
            r0.<init>(r12, r1)
            r2.addOnGlobalLayoutListener(r0)
            if (r14 == 0) goto L_0x007a
            r0 = 2131100874(0x7f0604ca, float:1.7814142E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A02(r13, r4, r0)
            r14.setImageDrawable(r0)
            r14.setOnClickListener(r3)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JH.<init>(android.app.Activity, android.widget.ImageButton, X.0so, X.0qs, com.obwhatsapp.WaEditText, X.01V, X.0rz, X.013, X.11d, X.0um, X.1BQ, X.0pd, X.0u3, X.1Ai):void");
    }

    public static final void A00(RelativeLayout relativeLayout) {
        if (C45902Bo.A01) {
            relativeLayout.setLayoutDirection(3);
        }
    }

    public static /* synthetic */ void A01(AnonymousClass2JH r2) {
        r2.A00 = r2.A03.getResources().getConfiguration().keyboard != 1 ? false : C23061Ai.A00(r2.A0G) ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r4 = this;
            super.A04()
            X.1BQ r1 = r4.A0O
            r0 = 0
            r1.A00 = r0
            r2 = r4
            boolean r0 = r4 instanceof X.C47572Jn
            if (r0 == 0) goto L_0x0035
            X.2Jn r2 = (X.C47572Jn) r2
            X.39R r0 = r2.A0D
            if (r0 == 0) goto L_0x001a
            boolean r1 = r0.A01()
            r0 = 2
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r2.A0H(r0)
        L_0x001e:
            X.3BH r2 = r4.A07
            if (r2 == 0) goto L_0x0034
            android.view.View r1 = r2.A0D
            r0 = 8
            r1.setVisibility(r0)
            androidx.viewpager.widget.ViewPager r0 = r2.A0K
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.A0G
            r1.removeGlobalOnLayoutListener(r0)
        L_0x0034:
            return
        L_0x0035:
            int r0 = r4.A01
            if (r0 == 0) goto L_0x001e
            android.widget.ImageButton r3 = r4.A0I
            if (r3 == 0) goto L_0x001e
            android.app.Activity r2 = r4.A03
            int r1 = r4.A00
            r0 = 2131100874(0x7f0604ca, float:1.7814142E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A02(r2, r1, r0)
            r3.setImageDrawable(r0)
            r0 = 2131893377(0x7f121c81, float:1.9421529E38)
            java.lang.String r0 = r2.getString(r0)
            r3.setContentDescription(r0)
            android.view.View$OnClickListener r0 = r4.A0F
            r3.setOnClickListener(r0)
            r0 = 0
            r4.A01 = r0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JH.A04():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        if (r1.A0F.A01() == false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1.A00 != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r7 = this;
            r4 = 0
            r7.A02 = r4
            r7.A05()
            X.0qs r3 = r7.A05
            r3.setKeyboardPopup(r7)
            X.3BH r0 = r7.A07
            if (r0 != 0) goto L_0x0012
            r7.A0A()
        L_0x0012:
            r1 = r7
            boolean r0 = r7 instanceof X.C47572Jn
            if (r0 == 0) goto L_0x00e7
            X.2Jn r1 = (X.C47572Jn) r1
            X.4EI r0 = r1.A09
            boolean r0 = r0.A00
            r2 = 0
            if (r0 == 0) goto L_0x0025
            int r5 = r1.A00
            r0 = 1
            if (r5 == 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r1.A0D(r0)
            X.4EI r6 = r1.A09
            boolean r0 = r6 instanceof X.C74113ps
            if (r0 == 0) goto L_0x0063
            X.3ps r6 = (X.C74113ps) r6
            boolean r0 = r6.A00
            r5 = 8
            if (r0 != 0) goto L_0x0039
            r2 = 8
        L_0x0039:
            X.4OB r0 = r1.A0B
            X.4KZ r0 = r0.A01
            android.widget.ImageView r0 = r0.A02
            r0.setVisibility(r2)
            X.3Fe r0 = r1.A0C
            if (r0 == 0) goto L_0x004d
            X.4SE r0 = r0.A01
            android.widget.ImageView r0 = r0.A09
            r0.setVisibility(r2)
        L_0x004d:
            X.39R r0 = r1.A0D
            if (r0 == 0) goto L_0x0058
            X.4NH r0 = r0.A02
            android.view.View r0 = r0.A02
            r0.setVisibility(r2)
        L_0x0058:
            X.2Jp r2 = r1.A0A
            if (r2 == 0) goto L_0x0063
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x00d1
            r2.A01(r5)
        L_0x0063:
            X.3BH r6 = r7.A07
            android.os.HandlerThread r0 = X.AnonymousClass3BH.A0T
            if (r0 != 0) goto L_0x0095
            java.lang.String r1 = "Emoji Thread"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            X.AnonymousClass3BH.A0T = r0
            r0.start()
            android.content.Context r0 = r6.A09
            android.content.Context r5 = r0.getApplicationContext()
            X.0um r2 = r6.A0O
            android.os.HandlerThread r0 = X.AnonymousClass3BH.A0T
            android.os.Looper r1 = r0.getLooper()
            X.2nf r0 = new X.2nf
            r0.<init>(r5, r1, r2)
            X.AnonymousClass3BH.A0V = r0
            android.os.Looper r1 = r5.getMainLooper()
            X.2nc r0 = new X.2nc
            r0.<init>(r1)
            X.AnonymousClass3BH.A0U = r0
        L_0x0095:
            androidx.viewpager.widget.ViewPager r0 = r6.A0K
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r6.A0G
            r1.addOnGlobalLayoutListener(r0)
            r7.A0B()
            r1 = -1
            int r0 = r7.A03(r1)
            r7.A01 = r0
            r7.setHeight(r0)
            r7.setWidth(r1)
            android.view.View r3 = (android.view.View) r3
            r1 = 48
            r0 = 1000000(0xf4240, float:1.401298E-39)
            r7.showAtLocation(r3, r1, r4, r0)
            r7.AcT()
            com.obwhatsapp.WaEditText r3 = r7.A0K
            if (r3 == 0) goto L_0x00d0
            r0 = 1
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r2 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1
            r2.<init>(r7, r0)
            r1 = 1
            com.facebook.redex.IDxMFunctionShape409S0100000_2_I0 r0 = new com.facebook.redex.IDxMFunctionShape409S0100000_2_I0
            r0.<init>(r3, r1)
            r7.A07(r0, r3, r2)
        L_0x00d0:
            return
        L_0x00d1:
            boolean r0 = r1.A0L()
            if (r0 == 0) goto L_0x00e0
            X.1Mm r0 = r1.A0F
            boolean r1 = r0.A01()
            r0 = 0
            if (r1 != 0) goto L_0x00e2
        L_0x00e0:
            r0 = 8
        L_0x00e2:
            r2.A01(r0)
            goto L_0x0063
        L_0x00e7:
            X.4EI r0 = r7.A09
            boolean r0 = r0.A00
            r7.A0D(r0)
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JH.A06():void");
    }

    public void A0A() {
        Activity activity = this.A03;
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        boolean z2 = true;
        Conversation.setEmPopup(activity.getLayoutInflater().inflate(R.layout.layout0252, relativeLayout, true));
        ViewGroup viewGroup = (ViewGroup) relativeLayout.findViewById(R.id.emoji_view);
        this.A05 = viewGroup;
        viewGroup.getLayoutParams().height = -1;
        this.A05.setVisibility(0);
        setContentView(relativeLayout);
        A00(relativeLayout);
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new BitmapDrawable());
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setAnimationStyle(0);
        View findViewById = this.A05.findViewById(R.id.fallback_divider);
        int i2 = 8;
        if (Build.VERSION.SDK_INT < 21) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
        C14710pd r16 = this.A0P;
        C16300so r15 = this.A04;
        C17250um r13 = this.A0N;
        C206711d r12 = this.A0M;
        AnonymousClass013 r11 = this.A0L;
        C15860rz r10 = this.A07;
        C17020u3 r9 = this.A0Q;
        ViewGroup viewGroup2 = this.A05;
        View view = this.A0G;
        C206711d r21 = r12;
        AnonymousClass013 r20 = r11;
        C15860rz r19 = r10;
        C16300so r18 = r15;
        AbsListView.OnScrollListener onScrollListener = this.A0H;
        ViewGroup viewGroup3 = viewGroup2;
        View view2 = view;
        AnonymousClass3BH r132 = new AnonymousClass3BH(activity, view2, viewGroup3, onScrollListener, r18, r19, r20, r21, r13, r16, r9);
        this.A07 = r132;
        r132.A02 = this.A0J;
        EmojiPopupFooter emojiPopupFooter = (EmojiPopupFooter) this.A05.findViewById(R.id.footer_toolbar);
        this.A08 = emojiPopupFooter;
        emojiPopupFooter.setClickable(true);
        A0D(true);
        View findViewById2 = this.A05.findViewById(R.id.gif_tab);
        View findViewById3 = this.A05.findViewById(R.id.emoji_tab);
        View findViewById4 = this.A05.findViewById(R.id.search_button);
        findViewById2.setVisibility(8);
        findViewById3.setVisibility(8);
        if (this instanceof C47572Jn) {
            C47572Jn r4 = (C47572Jn) this;
            r4.A0O.A00 = new C102304yj(findViewById4, r4);
        } else {
            this.A0O.A00 = new IDxSListenerShape436S0100000_2_I0(findViewById4, 0);
        }
        AnonymousClass1BQ r1 = this.A0O;
        if (r1.A02) {
            i2 = 0;
        }
        findViewById4.setVisibility(i2);
        r1.A01();
        findViewById4.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 38));
        this.A05.findViewById(R.id.delete_symbol_tb).setVisibility(0);
        setTouchInterceptor(new IDxTListenerShape166S0100000_1_I0(this, 0));
        AccessibilityManager A0P2 = this.A06.A0P();
        if (A0P2 == null || !A0P2.isTouchExplorationEnabled()) {
            z2 = false;
        }
        setFocusable(z2);
    }

    public void A0B() {
        ImageButton imageButton;
        if (this.A01 != 1 && (imageButton = this.A0I) != null) {
            Activity activity = this.A03;
            imageButton.setImageDrawable(AnonymousClass2SR.A02(activity, this.A03, R.color.color04ca));
            imageButton.setContentDescription(activity.getString(R.string.str0bef));
            imageButton.setOnClickListener(this.A0F);
            this.A01 = 1;
        }
    }

    public void A0C(AnonymousClass5RN r3) {
        this.A06 = r3;
        AnonymousClass3BH r1 = this.A07;
        if (r1 != null) {
            r1.A02 = this.A0J;
        }
    }

    public void A0D(boolean z2) {
        ImageView imageView = this.A07.A0J;
        if (imageView != null) {
            int i2 = 8;
            if (z2) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public void AcT() {
        if (this.A08.getVisibility() != 0) {
            this.A08.setVisibility(0);
        }
        Animation animation = this.A08.getAnimation();
        if (animation instanceof AnonymousClass3NN) {
            animation.cancel();
        }
        this.A08.setTopOffset(0);
    }
}
