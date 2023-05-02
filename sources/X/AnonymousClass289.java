package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape32S0300000_2_I0;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.obwhatsapp.BoundedLinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.components.CircularRevealView;
import com.obwhatsapp.conversation.ConversationAttachmentContentView;
import java.lang.ref.WeakReference;

/* renamed from: X.289  reason: invalid class name */
public class AnonymousClass289 extends PopupWindow {
    public int A00;
    public int A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02 = new IDxLListenerShape144S0100000_2_I0(this, 11);
    public boolean A03;
    public boolean A04;
    public final int A05;
    public final View A06;
    public final FrameLayout.LayoutParams A07;
    public final FrameLayout A08;
    public final BoundedLinearLayout A09;
    public final C14870pt A0A;
    public final CircularRevealView A0B;
    public final ConversationAttachmentContentView A0C;
    public final AnonymousClass01V A0D;
    public final C23061Ai A0E;
    public final WeakReference A0F;

    public AnonymousClass289(Activity activity, View view, C14870pt r10, C55472jf r11, AnonymousClass01V r12, C15830rv r13, C23061Ai r14, boolean z2) {
        super(activity);
        this.A0A = r10;
        this.A0E = r14;
        this.A06 = view;
        this.A0F = new WeakReference(activity);
        this.A0D = r12;
        C64343Nt r6 = new C64343Nt(activity, activity, this);
        this.A08 = r6;
        r6.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        activity.getLayoutInflater().inflate(R.layout.layout0077, r6, true);
        CircularRevealView circularRevealView = (CircularRevealView) C004601z.A0E(r6, R.id.paper_clip_layout);
        this.A0B = circularRevealView;
        this.A09 = (BoundedLinearLayout) C004601z.A0E(r6, R.id.content);
        this.A07 = (FrameLayout.LayoutParams) circularRevealView.getLayoutParams();
        this.A05 = circularRevealView.getResources().getDimensionPixelSize(R.dimen.dimen0071);
        circularRevealView.setVisibility(0);
        setContentView(r6);
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(0);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setTouchInterceptor(new IDxTListenerShape32S0300000_2_I0(activity, this, r12, 0));
        ConversationAttachmentContentView conversationAttachmentContentView = (ConversationAttachmentContentView) C004601z.A0E(circularRevealView, R.id.conversation_content_view);
        this.A0C = conversationAttachmentContentView;
        conversationAttachmentContentView.A0K = r13;
        conversationAttachmentContentView.A0D = r11;
        conversationAttachmentContentView.A0Q = z2;
        conversationAttachmentContentView.A04();
    }

    public static final AnimationSet A00(int i2, boolean z2, boolean z3) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        float f4 = 0.0f;
        if (z3) {
            f3 = 0.0f;
            f4 = 1.0f;
        }
        float f5 = (float) i2;
        float f6 = 0.0f;
        if (z2) {
            f6 = 1.0f;
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(f3, f4, f3, f4, 0, f5, 1, f6);
        if (!z3) {
            f2 = 1.0f;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, 1.0f - f2);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(300);
        return animationSet;
    }

    public static /* synthetic */ void A01(AnonymousClass289 r2) {
        r2.A0B.A02(false);
        super.dismiss();
    }

    public final int A03(Activity activity) {
        this.A08.measure(0, 0);
        View view = this.A06;
        view.measure(0, 0);
        if (!C23061Ai.A00(view) || (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode())) {
            return -(view.getMeasuredHeight() + this.A0C.A01(view));
        }
        return 0;
    }

    public void A04() {
        A05();
        this.A0B.A02(false);
        super.dismiss();
    }

    public final void A05() {
        if (this.A04) {
            this.A04 = false;
            this.A08.getViewTreeObserver().removeOnGlobalLayoutListener(this.A02);
        }
    }

    public final void A06() {
        int[] iArr = new int[2];
        this.A06.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        CircularRevealView circularRevealView = this.A0B;
        circularRevealView.getLocationOnScreen(iArr2);
        int i2 = 0;
        int i3 = (iArr[0] + this.A00) - iArr2[0];
        if (this.A03) {
            i2 = this.A08.getMeasuredHeight();
        }
        circularRevealView.A01 = i3;
        circularRevealView.A02 = i2;
    }

    public void A07(Activity activity) {
        Resources resources = activity.getResources();
        int[] iArr = new int[2];
        View view = this.A06;
        view.getLocationOnScreen(iArr);
        boolean z2 = C87594Xo.A01(AnonymousClass01V.A02(this.A08.getContext())).y - (iArr[1] + view.getHeight()) < activity.getResources().getDimensionPixelSize(R.dimen.dimen0078) || (Build.VERSION.SDK_INT >= 24 && activity.isInMultiWindowMode());
        this.A00 = view.getWidth() / 2;
        if (z2) {
            A08(activity, 300, A03(activity), true);
        } else {
            A08(activity, 300, resources.getDimensionPixelSize(R.dimen.dimen007c), false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0039, code lost:
        r0 = (r0 = r12.getRootWindowInsets()).getDisplayCutout();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(android.app.Activity r20, int r21, int r22, boolean r23) {
        /*
            r19 = this;
            r10 = r19
            r11 = r23
            r10.A03 = r11
            r18 = r20
            android.view.WindowManager r0 = r18.getWindowManager()
            android.view.Display r17 = r0.getDefaultDisplay()
            android.view.WindowManager r0 = r18.getWindowManager()
            android.graphics.Point r13 = X.C87594Xo.A01(r0)
            r9 = 0
            r0 = 2
            int[] r1 = new int[r0]
            android.view.View r12 = r10.A06
            r12.getLocationOnScreen(r1)
            r0 = 1
            r15 = r1[r0]
            int r0 = r12.getHeight()
            int r15 = r15 + r0
            r0 = r1[r9]
            r10.A01 = r0
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r8 < r0) goto L_0x016f
            android.view.WindowInsets r0 = r12.getRootWindowInsets()
            if (r0 == 0) goto L_0x016f
            android.view.DisplayCutout r0 = r0.getDisplayCutout()
            if (r0 == 0) goto L_0x016f
            int r16 = r0.getSafeInsetTop()
        L_0x0043:
            r7 = 8388661(0x800035, float:1.1755018E-38)
            r6 = -1
            com.obwhatsapp.BoundedLinearLayout r5 = r10.A09
            r14 = r22
            if (r23 != 0) goto L_0x0128
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5.A00 = r0
            r5.A01 = r0
            com.obwhatsapp.components.CircularRevealView r4 = r10.A0B
            int r2 = r4.getPaddingLeft()
            int r1 = r4.getPaddingTop()
            int r0 = r4.getPaddingRight()
            r4.setPadding(r2, r1, r0, r9)
            com.obwhatsapp.conversation.ConversationAttachmentContentView r3 = r10.A0C
            r3.A07 = r9
            android.widget.FrameLayout$LayoutParams r1 = r10.A07
            r1.height = r6
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            int r0 = r13.y
            int r0 = r0 + r16
            int r15 = r15 + r22
            int r0 = r0 - r15
            r2.height = r0
            r10.showAtLocation(r12, r7, r9, r15)
        L_0x007d:
            r4.forceLayout()
            r2 = r21
            r4.A04 = r2
            if (r23 == 0) goto L_0x010e
            r5.measure(r9, r9)
            int r12 = r5.getMeasuredWidth()
            int r13 = r13.x
            android.content.res.Resources r7 = r18.getResources()
            r0 = 2131166354(0x7f070492, float:1.794695E38)
            int r8 = r7.getDimensionPixelSize(r0)
            android.content.res.Resources r7 = r18.getResources()
            r0 = 2131166356(0x7f070494, float:1.7946955E38)
            int r0 = r7.getDimensionPixelSize(r0)
            int r8 = r8 + r0
            android.content.res.Resources r7 = r18.getResources()
            r0 = 2131166355(0x7f070493, float:1.7946953E38)
            int r0 = r7.getDimensionPixelSize(r0)
            int r8 = r8 + r0
            float r8 = (float) r8
            android.content.res.Resources r7 = r18.getResources()
            r0 = 2131166353(0x7f070491, float:1.7946949E38)
            float r0 = r7.getDimension(r0)
            float r8 = r8 + r0
            float r7 = (float) r13
            r0 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 * r0
            float r7 = r7 - r8
            int r8 = (int) r7
            int r7 = r17.getRotation()
            r0 = 1
            if (r7 == r0) goto L_0x00d3
            int r7 = r17.getRotation()
            r0 = 3
            if (r7 != r0) goto L_0x00fc
        L_0x00d3:
            if (r8 <= r12) goto L_0x00fc
            r1.width = r8
            r1.rightMargin = r9
            r1.leftMargin = r9
        L_0x00db:
            r1 = 2131231381(0x7f080295, float:1.8078841E38)
            r0 = r18
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00T.A04(r0, r1)
            r5.setBackground(r0)
        L_0x00e7:
            r4.setVisibility(r9)
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            X.4kn r0 = new X.4kn
            r0.<init>(r10, r2, r11)
            r1.addOnGlobalLayoutListener(r0)
            if (r21 <= 0) goto L_0x00fb
            r3.A07(r2, r11)
        L_0x00fb:
            return
        L_0x00fc:
            r1.width = r6
            android.content.res.Resources r6 = r18.getResources()
            r0 = 2131165299(0x7f070073, float:1.7944811E38)
            int r0 = r6.getDimensionPixelSize(r0)
            r1.rightMargin = r0
            r1.leftMargin = r0
            goto L_0x00db
        L_0x010e:
            r1.width = r6
            r1 = 2131099728(0x7f060050, float:1.7811817E38)
            r0 = r18
            int r0 = X.AnonymousClass00T.A00(r0, r1)
            r4.setBackgroundColor(r0)
            r1 = 2131099709(0x7f06003d, float:1.7811779E38)
            r0 = r18
            int r0 = X.AnonymousClass00T.A00(r0, r1)
            r4.A03 = r0
            goto L_0x00e7
        L_0x0128:
            com.obwhatsapp.conversation.ConversationAttachmentContentView r3 = r10.A0C
            int r0 = r3.A01(r12)
            r5.A00 = r0
            int r0 = r3.A00(r12)
            r5.A01 = r0
            com.obwhatsapp.components.CircularRevealView r4 = r10.A0B
            int r15 = r4.getPaddingLeft()
            int r2 = r4.getPaddingTop()
            int r1 = r4.getPaddingRight()
            int r0 = r10.A05
            r4.setPadding(r15, r2, r1, r0)
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            r0 = -2
            r1.height = r0
            android.widget.FrameLayout$LayoutParams r1 = r10.A07
            r1.height = r0
            android.content.res.Resources r2 = r3.getResources()
            r0 = 2131165298(0x7f070072, float:1.794481E38)
            int r0 = r2.getDimensionPixelOffset(r0)
            r3.A07 = r0
            r0 = 19
            if (r8 < r0) goto L_0x016a
            r10.showAsDropDown(r12, r9, r14, r7)
            goto L_0x007d
        L_0x016a:
            r10.showAsDropDown(r12, r9, r14)
            goto L_0x007d
        L_0x016f:
            r16 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass289.A08(android.app.Activity, int, int, boolean):void");
    }

    public void dismiss() {
        if (isShowing()) {
            A06();
            int[] iArr = new int[2];
            this.A06.getLocationOnScreen(iArr);
            AnimationSet A002 = A00(this.A00 + iArr[0], this.A03, false);
            CircularRevealView circularRevealView = this.A0B;
            circularRevealView.A04 = 300;
            circularRevealView.A0E = false;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 18 || !this.A03) {
                if (!circularRevealView.A0C) {
                    circularRevealView.A02(true);
                }
                if (i2 < 21 && !this.A03) {
                    this.A09.startAnimation(A002);
                }
            } else if (!circularRevealView.A0C) {
                circularRevealView.A01(A002);
            }
        }
        A05();
        this.A0A.A0L(new RunnableRunnableShape7S0100000_I0_6(this, 11), 300);
    }
}
