package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.support.v4.view.MotionEventCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.Conversation;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1bd  reason: invalid class name and case insensitive filesystem */
public abstract class C30031bd extends C30041be implements C30051bf {
    public static Rect A0d = new Rect();
    public static Drawable A0e;
    public static Drawable A0f;
    public static final Rect A0g = new Rect();
    public static final Rect A0h = new Rect();
    public static final Rect A0i = new Rect();
    public float A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05;
    public int A06;
    public int A07;
    public Paint A08;
    public Rect A09 = new Rect();
    public Drawable A0A;
    public Drawable A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public C16300so A0F;
    public AnonymousClass1L8 A0G;
    public C56942pD A0H;
    public C56882ox A0I;
    public AnonymousClass01V A0J;
    public AnonymousClass013 A0K;
    public C26101Mi A0L;
    public C14710pd A0M;
    public AnonymousClass1P7 A0N;
    public C16740tZ A0O;
    public AnonymousClass1PD A0P;
    public C18050w4 A0Q;
    public boolean A0R = true;
    public boolean A0S;
    public boolean A0T;
    public final int A0U;
    public final Drawable A0V;
    public final Drawable A0W;
    public final Drawable A0X;
    public final Drawable A0Y;
    public final Drawable A0Z;
    public final Drawable A0a;
    public final AnonymousClass1YG A0b;
    public final C616339r A0c;

    public C30031bd(Context context, AnonymousClass1YG r8, C16740tZ r9) {
        super(context);
        C616339r r0;
        this.A0b = r8;
        this.A0O = r9;
        if (r8 != null) {
            r0 = r8.AAz();
        } else {
            AnonymousClass1L8 r02 = this.A0G;
            r0 = r02 != null ? r02.A02 : null;
        }
        this.A0c = r0;
        Drawable BubbleStyle = yo.BubbleStyle(context, 1, R.drawable.balloon_outgoing_normal);
        AnonymousClass00B.A06(BubbleStyle);
        this.A0a = BubbleStyle;
        Drawable BubbleStyle2 = yo.BubbleStyle(context, 2, R.drawable.balloon_outgoing_normal_ext);
        AnonymousClass00B.A06(BubbleStyle2);
        this.A0Z = BubbleStyle2;
        Drawable BubbleStyle3 = yo.BubbleStyle(context, 0, R.drawable.balloon_incoming_normal);
        AnonymousClass00B.A06(BubbleStyle3);
        this.A0Y = BubbleStyle3;
        Drawable BubbleStyle4 = yo.BubbleStyle(context, 3, R.drawable.balloon_incoming_normal_ext);
        AnonymousClass00B.A06(BubbleStyle4);
        this.A0X = BubbleStyle4;
        Drawable A042 = AnonymousClass00T.A04(context, R.drawable.balloon_centered_normal);
        AnonymousClass00B.A06(A042);
        this.A0V = A042;
        Drawable A043 = AnonymousClass00T.A04(getContext(), R.drawable.balloon_centered_pressed);
        AnonymousClass00B.A06(A043);
        this.A0W = A043;
        BubbleStyle.getPadding(A0i);
        BubbleStyle3.getPadding(A0h);
        BubbleStyle3.getPadding(A0g);
        boolean z2 = r9.A11.A02;
        if (LayoutInflater.from(getContext()).inflate(A0k() ? getCenteredLayoutId() : z2 ? getOutgoingLayoutId() : getIncomingLayoutId(), this, true) != null) {
            C30011bb r6 = (C30011bb) this;
            Conversation.AddDoubleTapToLike(r6);
            r6.A0D = Conversation.setPicO(r6, r9);
            r6.A0U = (int) (((double) ViewConfiguration.get(context).getScaledTouchSlop()) * 1.8d);
            if (A0e == null) {
                A0e = AnonymousClass00T.A04(r6.getContext(), R.drawable.ic_action_reply).mutate();
            }
            if (A0f == null) {
                A0f = AnonymousClass00T.A04(r6.getContext(), R.drawable.forward_background).mutate();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("rootview for conversationRow is null, rightLayout=");
        sb.append(z2);
        throw new RuntimeException(sb.toString());
    }

    private int getBubbleSwipeOffset() {
        View view = this.A0D;
        if (view != null) {
            return (int) view.getTranslationX();
        }
        return 0;
    }

    private float getBubbleWidth() {
        int i2;
        if (A0k()) {
            i2 = 0;
        } else {
            Rect rect = this.A0O.A11.A02 ? A0i : A0h;
            i2 = rect.right + rect.left;
        }
        return (float) (Conversation.getBubbleWidth(this, getContentWidth()) + i2);
    }

    private int getGlowContentBottom() {
        C56942pD r0 = this.A0H;
        return (r0 == null || r0.getVisibility() != 0) ? this.A02 : this.A0H.getBottom();
    }

    private int getSwipeReplyActivationThreshold() {
        return getWidth() / 6;
    }

    public Point A0h(int i2, int i3) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.dimen0762);
        View view = this.A0D;
        int measuredWidth = view.getMeasuredWidth();
        int left = view.getLeft();
        return new Point((!(this instanceof AnonymousClass31B) || !this.A0S ? this.A0O.A11.A02 != (this.A0K.A0T() ^ true) : (this.A0K.A0T() ^ true)) ? left + dimensionPixelOffset : ((left + measuredWidth) - i2) - dimensionPixelOffset, (((int) view.getY()) + view.getMeasuredHeight()) - getReactionsViewVerticalOverlap());
    }

    public void A0i(C28381Vw r4) {
        AnonymousClass3NI r2 = new AnonymousClass3NI(this);
        r2.setDuration(2400);
        r2.setInterpolator(new AccelerateInterpolator());
        startAnimation(r2);
    }

    public boolean A0j() {
        C30011bb r2 = (C30011bb) this;
        AnonymousClass1yP A012 = AnonymousClass22O.A01(r2.getContext());
        if (A012 == null || ((com.obwhatsapp.Conversation) A012).A00.A2A.A07() || !r2.A1K() || r2.getMessageCount() != 1) {
            return false;
        }
        C14710pd r6 = r2.A0M;
        return C38621r6.A0X(r2.A0a, r2.A0c, r2.A0z, r6, r2.A1A, r2.A1B, r2.getFMessage(), r2.A1b) && r2.A0D != null;
    }

    public boolean A0k() {
        if ((this instanceof AnonymousClass313) || (this instanceof AnonymousClass315) || (this instanceof C601230e) || (this instanceof AnonymousClass30R) || (this instanceof AnonymousClass31G) || (this instanceof AnonymousClass30U) || (this instanceof AnonymousClass30T) || (this instanceof AnonymousClass30V) || (this instanceof AnonymousClass30S)) {
            return true;
        }
        C616339r r0 = this.A0c;
        if (r0 != null) {
            return r0.A05();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005e, code lost:
        if (r0 != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0072, code lost:
        if (r0 != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0080, code lost:
        if (r0 != false) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0l() {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.AnonymousClass30Y
            if (r0 == 0) goto L_0x001b
            X.0tZ r0 = r2.getFMessage()
            boolean r0 = X.C26701Ou.A00(r0)
            if (r0 != 0) goto L_0x0019
            X.0tZ r0 = r2.getFMessage()
            boolean r1 = X.C38621r6.A0s(r0)
            r0 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            return r0
        L_0x001b:
            boolean r0 = r2 instanceof X.AnonymousClass31K
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.AnonymousClass31D
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.AnonymousClass2QF
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.AnonymousClass30Q
            if (r0 != 0) goto L_0x0083
            boolean r0 = r2 instanceof X.AnonymousClass30X
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.AnonymousClass30W
            if (r0 != 0) goto L_0x0083
            boolean r0 = r2 instanceof X.C600930a
            if (r0 != 0) goto L_0x0083
            boolean r0 = r2 instanceof X.AnonymousClass31J
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.AnonymousClass2Uj
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.AnonymousClass31L
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.AnonymousClass31I
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.C603030w
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.C602930v
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.AnonymousClass31B
            if (r0 != 0) goto L_0x0088
            boolean r0 = r2 instanceof X.C602430q
            if (r0 == 0) goto L_0x0067
            r1 = r2
            X.30q r1 = (X.C602430q) r1
            boolean r0 = r1 instanceof X.C601830k
            X.0tZ r1 = r1.A0O
            if (r0 == 0) goto L_0x0062
        L_0x0060:
            X.0tY r1 = (X.C16730tY) r1
        L_0x0062:
            boolean r0 = X.C38621r6.A0s(r1)
            return r0
        L_0x0067:
            boolean r0 = r2 instanceof X.AnonymousClass318
            if (r0 == 0) goto L_0x0075
            r1 = r2
            X.318 r1 = (X.AnonymousClass318) r1
            boolean r0 = r1 instanceof X.C601630i
            X.0tZ r1 = r1.A0O
            if (r0 == 0) goto L_0x0062
            goto L_0x0060
        L_0x0075:
            boolean r0 = r2 instanceof X.AnonymousClass2Q5
            if (r0 == 0) goto L_0x008b
            r1 = r2
            X.2Q5 r1 = (X.AnonymousClass2Q5) r1
            boolean r0 = r1 instanceof X.AnonymousClass2Q3
            X.0tZ r1 = r1.A0O
            if (r0 == 0) goto L_0x0062
            goto L_0x0060
        L_0x0083:
            X.0tZ r1 = r2.getFMessage()
            goto L_0x0062
        L_0x0088:
            X.0tZ r1 = r2.A0O
            goto L_0x0062
        L_0x008b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30031bd.A0l():boolean");
    }

    public final boolean A0m(MotionEvent motionEvent) {
        this.A07 = (int) motionEvent.getX();
        boolean z2 = false;
        this.A0T = false;
        if (this.A06 == 2) {
            this.A06 = 1;
            post(new RunnableRunnableShape7S0100000_I0_6(this, 29));
            invalidate();
            z2 = true;
        }
        View view = this.A0D;
        this.A05 = (int) view.getTranslationX();
        view.animate().cancel();
        return z2;
    }

    public final boolean A0n(MotionEvent motionEvent) {
        int x2 = (int) motionEvent.getX();
        if (this.A06 != 1 && Math.abs(x2 - this.A07) > this.A0U) {
            this.A06 = 1;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            cancelLongPress();
            setPressed(false);
        }
        if (this.A06 != 1) {
            return false;
        }
        int max = Math.max(0, ((this.A05 + x2) - this.A07) - this.A0U);
        float max2 = (float) Math.max(0, max - (getWidth() / 6));
        int min = Math.min(max, getWidth() / 6);
        double d2 = (double) max2;
        int width = min + ((int) (d2 / (((0.75d * d2) / ((double) (getWidth() / 6))) + 1.0d)));
        float f2 = (float) width;
        this.A0D.setTranslationX(f2);
        C56942pD r0 = this.A0H;
        if (r0 != null) {
            r0.setTranslationX(f2);
        }
        if (width > getWidth() / 6 && !this.A0T) {
            try {
                if (Settings.System.getInt(getContext().getContentResolver(), "haptic_feedback_enabled") != 0) {
                    C41631wI.A02(this.A0J);
                }
            } catch (Settings.SettingNotFoundException e2) {
                Log.e("swipetoreply/vibrate", e2);
            }
            this.A0T = true;
        }
        invalidate();
        return true;
    }

    public boolean A0o(C16740tZ r4) {
        if (!(this instanceof AnonymousClass2Uj)) {
            return (r4.A07 & 1) == 1;
        }
        List<C16740tZ> list = ((AnonymousClass2Uj) this).A05;
        if (list == null) {
            return false;
        }
        for (C16740tZ r0 : list) {
            if ((r0.A07 & 1) == 1) {
                return true;
            }
        }
        return false;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public int getBubbleAlpha() {
        return MotionEventCompat.ACTION_MASK;
    }

    public abstract int getBubbleMarginStart();

    public abstract int getCenteredLayoutId();

    public int getContentWidth() {
        return this.A0D.getMeasuredWidth();
    }

    public C16740tZ getFMessage() {
        return this.A0O;
    }

    public abstract int getIncomingLayoutId();

    public int getMainChildMaxWidth() {
        return 0;
    }

    public abstract int getOutgoingLayoutId();

    public int getReactionsViewVerticalOverlap() {
        return getResources().getDimensionPixelOffset(R.dimen.dimen0767);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0342, code lost:
        if (r16 == false) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0344, code lost:
        r11.draw(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x017e, code lost:
        if (r6.A0c.A09() != false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02c4, code lost:
        if (r16 == false) goto L_0x0180;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0335  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r6 = r17
            boolean r0 = r6.A0S
            r8 = 0
            r7 = r18
            if (r0 == 0) goto L_0x0065
            android.graphics.drawable.Drawable r0 = r6.A0B
            if (r0 != 0) goto L_0x001a
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131230865(0x7f080091, float:1.8077795E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r6.A0B = r0
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r6.A0A
            if (r0 != 0) goto L_0x002b
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131230864(0x7f080090, float:1.8077793E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r6.A0A = r0
        L_0x002b:
            android.graphics.drawable.Drawable r3 = r6.A0B
            int r2 = r6.getPaddingTop()
            android.graphics.drawable.Drawable r0 = r6.A0B
            int r0 = r0.getIntrinsicHeight()
            int r2 = r2 - r0
            int r1 = r6.getWidth()
            int r0 = r6.getPaddingTop()
            r3.setBounds(r8, r2, r1, r0)
            android.graphics.drawable.Drawable r0 = r6.A0B
            r0.draw(r7)
            android.graphics.drawable.Drawable r4 = r6.A0A
            int r3 = r6.A02
            int r2 = r6.getWidth()
            int r1 = r6.A02
            android.graphics.drawable.Drawable r0 = r6.A0A
            int r0 = r0.getIntrinsicHeight()
            int r1 = r1 + r0
            r4.setBounds(r8, r3, r2, r1)
            android.graphics.drawable.Drawable r0 = r6.A0A
            r0.draw(r7)
        L_0x0061:
            super.onDraw(r7)
            return
        L_0x0065:
            float r0 = r6.A00
            r4 = 0
            r3 = 1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
            android.content.Context r1 = r6.getContext()
            r0 = 2131100041(0x7f060189, float:1.7812452E38)
            int r2 = X.AnonymousClass00T.A00(r1, r0)
            int r0 = r2 >> 24
            float r1 = (float) r0
            float r0 = r6.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r1 = r0 << 24
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            r2 = r2 | r1
            android.graphics.Paint r0 = r6.A08
            if (r0 != 0) goto L_0x0091
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r3)
            r6.A08 = r0
        L_0x0091:
            r0.setColor(r2)
            int r2 = r6.A03
            android.graphics.Rect r10 = A0i
            int r0 = r10.top
            int r2 = r2 - r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166954(0x7f0706ea, float:1.7948168E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r2 = r2 - r0
            float r5 = (float) r2
            int r0 = r6.getWidth()
            float r2 = (float) r0
            int r9 = r6.getGlowContentBottom()
            int r0 = r10.bottom
            int r9 = r9 + r0
            android.content.Context r0 = r6.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r0 = (int) r1
            int r0 = java.lang.Math.max(r3, r0)
            int r9 = r9 + r0
            float r1 = (float) r9
            android.graphics.Paint r0 = r6.A08
            r10 = 0
            r9 = r7
            r11 = r5
            r12 = r2
            r13 = r1
            r14 = r0
            r9.drawRect(r10, r11, r12, r13, r14)
        L_0x00d7:
            boolean r0 = r6.isSelected()
            if (r0 != 0) goto L_0x00f3
            android.view.View r0 = r6.A0E
            if (r0 == 0) goto L_0x00e7
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0110
        L_0x00e7:
            boolean r0 = r6.isPressed()
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0110
        L_0x00f3:
            X.39r r5 = r6.A0c
            boolean r0 = r5.A0A()
            if (r0 == 0) goto L_0x0110
            int r0 = r6.getWidth()
            float r2 = (float) r0
            int r0 = r6.getHeight()
            float r1 = (float) r0
            android.graphics.Paint r0 = r5.A00
            r11 = 0
            r10 = 0
            r9 = r7
            r12 = r2
            r13 = r1
            r14 = r0
            r9.drawRect(r10, r11, r12, r13, r14)
        L_0x0110:
            X.0tZ r2 = r6.A0O
            int r1 = r2.A0C
            r0 = -1
            if (r1 == r0) goto L_0x035f
            r0 = 6
            if (r1 != r0) goto L_0x0120
            byte r1 = r2.A10
            r0 = 8
            if (r1 != r0) goto L_0x035f
        L_0x0120:
            byte r1 = r2.A10
            r0 = 21
            if (r1 == r0) goto L_0x035f
            r0 = 22
            if (r1 == r0) goto L_0x035f
            r0 = 36
            if (r1 == r0) goto L_0x035f
            float r0 = r6.getBubbleWidth()
            int r14 = (int) r0
            boolean r0 = r6.A0k()
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 1065353216(0x3f800000, float:1.0)
            r5 = 2
            if (r0 == 0) goto L_0x025b
            int r12 = r6.getWidth()
            int r12 = r12 - r14
            android.graphics.Rect r13 = A0g
            int r1 = r13.left
            int r0 = r1 << 1
            int r12 = r12 - r0
            int r12 = r12 / r5
            android.graphics.Rect r2 = r6.A09
            int r11 = r6.A03
            int r0 = r13.top
            int r11 = r11 - r0
            int r14 = r14 + r12
            int r1 = r1 / r5
            int r14 = r14 + r1
            int r1 = r6.A02
            int r0 = r13.bottom
            int r1 = r1 + r0
            r2.set(r12, r11, r14, r1)
            boolean r0 = r6.isPressed()
            if (r0 == 0) goto L_0x0257
            android.graphics.drawable.Drawable r11 = r6.A0W
        L_0x0165:
            int r0 = r6.getBubbleMarginStart()
            r2.offset(r0, r8)
            if (r11 == 0) goto L_0x0190
            boolean r0 = r6.A0R
            if (r0 == 0) goto L_0x0190
            r11.setDither(r3)
            r11.setBounds(r2)
            X.39r r0 = r6.A0c
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0344
        L_0x0180:
            r7.save()
            float r0 = r2.exactCenterX()
            r7.scale(r10, r9, r0, r4)
            r11.draw(r7)
            r7.restore()
        L_0x0190:
            int r0 = r6.A06
            if (r0 <= 0) goto L_0x0061
            int r0 = r6.getBubbleSwipeOffset()
            float r2 = (float) r0
            int r0 = r6.getWidth()
            int r0 = r0 / 6
            float r0 = (float) r0
            float r2 = r2 / r0
            int r1 = r6.getBubbleSwipeOffset()
            int r0 = r6.getWidth()
            int r0 = r0 / 6
            int r12 = java.lang.Math.min(r1, r0)
            android.view.View r8 = r6.A0D
            int r11 = r8.getTop()
            int r3 = r8.getBottom()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131166875(0x7f07069b, float:1.7948008E38)
            float r0 = r1.getDimension(r0)
            int r15 = (int) r0
            android.graphics.drawable.Drawable r0 = A0f
            android.graphics.Rect r13 = A0d
            r0.getPadding(r13)
            android.graphics.drawable.Drawable r14 = A0f
            android.graphics.drawable.Drawable r0 = A0e
            int r0 = r0.getIntrinsicWidth()
            int r10 = r12 - r0
            int r10 = r10 - r15
            int r0 = r13.right
            int r10 = r10 - r0
            int r11 = r11 + r3
            int r11 = r11 / r5
            android.graphics.drawable.Drawable r0 = A0e
            int r0 = r0.getIntrinsicHeight()
            int r0 = r0 / r5
            int r3 = r11 - r0
            int r3 = r3 - r15
            int r1 = r12 + r15
            int r0 = r13.right
            int r1 = r1 - r0
            android.graphics.drawable.Drawable r0 = A0e
            int r0 = r0.getIntrinsicHeight()
            int r0 = r0 / r5
            int r0 = r0 + r11
            int r0 = r0 + r15
            r14.setBounds(r10, r3, r1, r0)
            android.graphics.drawable.Drawable r10 = A0e
            int r0 = r10.getIntrinsicWidth()
            int r3 = r12 - r0
            int r0 = r13.right
            int r3 = r3 - r0
            android.graphics.drawable.Drawable r0 = A0e
            int r0 = r0.getIntrinsicHeight()
            int r0 = r0 / r5
            int r1 = r11 - r0
            int r0 = r13.right
            int r12 = r12 - r0
            android.graphics.drawable.Drawable r0 = A0e
            int r0 = r0.getIntrinsicHeight()
            int r0 = r0 / r5
            int r11 = r11 + r0
            r10.setBounds(r3, r1, r12, r11)
            android.graphics.drawable.Drawable r3 = A0f
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r2
            float r1 = java.lang.Math.min(r9, r0)
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r1 = (int) r1
            r3.setAlpha(r1)
            android.graphics.drawable.Drawable r0 = A0e
            r0.setAlpha(r1)
            android.graphics.drawable.Drawable r0 = A0f
            r0.draw(r7)
            android.graphics.drawable.Drawable r0 = A0e
            r0.draw(r7)
            X.2ox r1 = r6.A0I
            if (r1 == 0) goto L_0x024e
            float r0 = r8.getTranslationX()
            r1.setTranslationX(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            float r2 = r2 * r0
            float r9 = r9 - r2
            float r0 = java.lang.Math.max(r4, r9)
            r1.setAlpha(r0)
        L_0x024e:
            int r0 = r6.A06
            if (r0 != r5) goto L_0x0061
            r6.invalidate()
            goto L_0x0061
        L_0x0257:
            android.graphics.drawable.Drawable r11 = r6.A0V
            goto L_0x0165
        L_0x025b:
            X.0tZ r0 = r6.A0O
            X.1Vw r0 = r0.A11
            boolean r0 = r0.A02
            r13 = 3
            if (r0 == 0) goto L_0x02de
            X.39r r0 = r6.A0c
            boolean r16 = r0.A06()
            android.graphics.Rect r2 = r6.A09
            if (r16 == 0) goto L_0x02dc
            int r12 = r6.getWidth()
            int r12 = r12 - r14
        L_0x0273:
            int r11 = r6.A03
            android.graphics.Rect r15 = A0i
            int r0 = r15.top
            int r11 = r11 - r0
            if (r16 == 0) goto L_0x0280
            int r14 = r6.getWidth()
        L_0x0280:
            int r1 = r6.A02
            int r0 = r15.bottom
            int r1 = r1 + r0
            r2.set(r12, r11, r14, r1)
            int r0 = r6.A01
            if (r0 == r5) goto L_0x02cb
            if (r0 == r13) goto L_0x02cb
            boolean r0 = r6.isPressed()
            if (r0 == 0) goto L_0x02c8
            android.content.Context r1 = r6.getContext()
            r0 = 2131230944(0x7f0800e0, float:1.8077955E38)
        L_0x029b:
            android.graphics.drawable.Drawable r11 = X.AnonymousClass00T.A04(r1, r0)
            X.AnonymousClass00B.A06(r11)
        L_0x02a2:
            int r1 = r6.getBubbleMarginStart()
            if (r16 == 0) goto L_0x02a9
            int r1 = -r1
        L_0x02a9:
            int r1 = com.obwhatsapp.yo.Conversation.getBubbleMargin(r6, r1)
            int r0 = r6.getBubbleSwipeOffset()
            int r1 = r1 + r0
            r2.offset(r1, r8)
            if (r11 == 0) goto L_0x0190
            int r0 = r6.getBubbleAlpha()
            r11.setAlpha(r0)
            r11.setDither(r3)
            r11.setBounds(r2)
            if (r16 != 0) goto L_0x0344
            goto L_0x0180
        L_0x02c8:
            android.graphics.drawable.Drawable r11 = r6.A0a
            goto L_0x02a2
        L_0x02cb:
            boolean r0 = r6.isPressed()
            if (r0 == 0) goto L_0x02d9
            android.content.Context r1 = r6.getContext()
            r0 = 2131230945(0x7f0800e1, float:1.8077957E38)
            goto L_0x029b
        L_0x02d9:
            android.graphics.drawable.Drawable r11 = r6.A0Z
            goto L_0x02a2
        L_0x02dc:
            r12 = 0
            goto L_0x0273
        L_0x02de:
            X.013 r0 = r6.A0K
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            r16 = r0 ^ 1
            android.graphics.Rect r2 = r6.A09
            if (r16 == 0) goto L_0x035d
            int r12 = r6.getWidth()
            int r12 = r12 - r14
        L_0x02f1:
            int r11 = r6.A03
            android.graphics.Rect r15 = A0h
            int r0 = r15.top
            int r11 = r11 - r0
            if (r16 == 0) goto L_0x02fe
            int r14 = r6.getWidth()
        L_0x02fe:
            int r1 = r6.A02
            int r0 = r15.bottom
            int r1 = r1 + r0
            r2.set(r12, r11, r14, r1)
            int r0 = r6.A01
            if (r0 == r5) goto L_0x034c
            if (r0 == r13) goto L_0x034c
            boolean r0 = r6.isPressed()
            if (r0 == 0) goto L_0x0349
            android.content.Context r1 = r6.getContext()
            r0 = 2131230935(0x7f0800d7, float:1.8077937E38)
        L_0x0319:
            android.graphics.drawable.Drawable r11 = X.AnonymousClass00T.A04(r1, r0)
            X.AnonymousClass00B.A06(r11)
        L_0x0320:
            int r1 = r6.getBubbleMarginStart()
            if (r16 == 0) goto L_0x0327
            int r1 = -r1
        L_0x0327:
            int r1 = com.obwhatsapp.yo.Conversation.getBubbleMargin(r6, r1)
            int r0 = r6.getBubbleSwipeOffset()
            int r1 = r1 + r0
            r2.offset(r1, r8)
            if (r11 == 0) goto L_0x0190
            int r0 = r6.getBubbleAlpha()
            r11.setAlpha(r0)
            r11.setBounds(r2)
            r11.setDither(r3)
            if (r16 != 0) goto L_0x0180
        L_0x0344:
            r11.draw(r7)
            goto L_0x0190
        L_0x0349:
            android.graphics.drawable.Drawable r11 = r6.A0Y
            goto L_0x0320
        L_0x034c:
            boolean r0 = r6.isPressed()
            if (r0 == 0) goto L_0x035a
            android.content.Context r1 = r6.getContext()
            r0 = 2131230936(0x7f0800d8, float:1.8077939E38)
            goto L_0x0319
        L_0x035a:
            android.graphics.drawable.Drawable r11 = r6.A0X
            goto L_0x0320
        L_0x035d:
            r12 = 0
            goto L_0x02f1
        L_0x035f:
            android.graphics.Rect r5 = r6.A09
            int r4 = r6.A03
            android.graphics.Rect r3 = A0i
            int r0 = r3.top
            int r4 = r4 - r0
            int r2 = r6.getWidth()
            int r1 = r6.A02
            int r0 = r3.bottom
            int r1 = r1 + r0
            r5.set(r8, r4, r2, r1)
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30031bd.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean A0m;
        if (A0j()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                A0m = A0m(motionEvent);
            } else if (actionMasked == 2) {
                A0m = A0n(motionEvent);
            }
            if (A0m) {
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.A04 = (int) motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bd, code lost:
        if (r0.A06() == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0115, code lost:
        if (r2 != null) goto L_0x0117;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r3 = r10.getPaddingTop()
            android.view.View r0 = r10.A0C
            r6 = 8
            if (r0 == 0) goto L_0x003a
            int r0 = r0.getVisibility()
            if (r0 == r6) goto L_0x003a
            android.view.View r0 = r10.A0C
            android.view.ViewGroup$LayoutParams r7 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            int r0 = r7.topMargin
            int r3 = r3 + r0
            android.view.View r0 = r10.A0C
            int r5 = r0.getMeasuredWidth()
            android.view.View r0 = r10.A0C
            int r4 = r0.getMeasuredHeight()
            int r0 = r10.getMeasuredWidth()
            int r0 = r0 - r5
            int r2 = r0 >> 1
            android.view.View r1 = r10.A0C
            int r5 = r5 + r2
            int r0 = r3 + r4
            r1.layout(r2, r3, r5, r0)
            int r0 = r7.bottomMargin
            int r4 = r4 + r0
            int r3 = r3 + r4
        L_0x003a:
            android.view.View r2 = r10.A0D
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r0 = r4.topMargin
            int r3 = r3 + r0
            X.0tZ r5 = r10.A0O
            int r1 = r5.A0C
            r0 = 6
            if (r1 != r0) goto L_0x0192
            byte r0 = r5.A10
            if (r0 == r6) goto L_0x0192
        L_0x0050:
            int r1 = r10.getMeasuredWidth()
            int r0 = r2.getMeasuredWidth()
            int r1 = r1 - r0
            int r1 = r1 >> 1
        L_0x005b:
            int r4 = r2.getMeasuredWidth()
            int r4 = r4 + r1
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 + r3
            r2.layout(r1, r3, r4, r0)
            boolean r6 = r10 instanceof X.AnonymousClass31J
            if (r6 != 0) goto L_0x00a0
            X.1YG r0 = r10.A0b
            if (r0 == 0) goto L_0x00a0
            int r1 = r0.AAs()
            if (r1 == 0) goto L_0x0079
            r0 = 2
            if (r1 != r0) goto L_0x00a0
        L_0x0079:
            X.0tZ r0 = r10.getFMessage()
            boolean r0 = r10.A0o(r0)
            if (r0 == 0) goto L_0x00a0
            X.2pD r0 = r10.A0H
            if (r0 == 0) goto L_0x00a0
            int r5 = r0.getMeasuredWidth()
            X.2pD r0 = r10.A0H
            int r4 = r0.getMeasuredHeight()
            android.graphics.Point r0 = r10.A0h(r5, r4)
            X.2pD r3 = r10.A0H
            int r1 = r0.x
            int r0 = r0.y
            int r5 = r5 + r1
            int r4 = r4 + r0
            r3.layout(r1, r0, r5, r4)
        L_0x00a0:
            X.2ox r0 = r10.A0I
            if (r0 == 0) goto L_0x00f2
            android.view.ViewGroup$LayoutParams r8 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            X.0tZ r0 = r10.getFMessage()
            X.1Vw r0 = r0.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x018a
            X.39r r0 = r10.A0c
            if (r0 == 0) goto L_0x00bf
            boolean r0 = r0.A06()
            r3 = 1
            if (r0 != 0) goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            X.2ox r0 = r10.A0I
            int r0 = r0.getMeasuredHeight()
            int r9 = r0 >> 1
            int r1 = r2.getTop()
            int r0 = r2.getBottom()
            int r1 = r1 + r0
            int r7 = r1 >> 1
            X.2ox r5 = r10.A0I
            if (r3 == 0) goto L_0x0171
            int r4 = r2.getLeft()
            X.2ox r0 = r10.A0I
            int r0 = r0.getMeasuredWidth()
            int r4 = r4 - r0
            int r0 = r8.leftMargin
            int r4 = r4 - r0
            int r3 = r7 - r9
            int r1 = r2.getLeft()
            int r0 = r8.leftMargin
            int r1 = r1 - r0
        L_0x00ee:
            int r7 = r7 + r9
            r5.layout(r4, r3, r1, r7)
        L_0x00f2:
            r2 = r10
            if (r6 == 0) goto L_0x014a
            X.31J r2 = (X.AnonymousClass31J) r2
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x016a
            android.view.View r1 = r2.A01
            if (r1 == 0) goto L_0x016a
            android.view.View r0 = r2.A0D
            int r2 = r0.getTop()
            int r0 = r1.getPaddingTop()
            int r2 = r2 + r0
        L_0x010a:
            r10.A03 = r2
            r3 = r10
            if (r6 == 0) goto L_0x0123
            X.31J r3 = (X.AnonymousClass31J) r3
            android.view.View r2 = r3.A01
            android.view.View r0 = r3.A0D
            if (r2 == 0) goto L_0x0145
        L_0x0117:
            int r1 = r0.getTop()
            int r0 = r2.getBottom()
            int r1 = r1 + r0
        L_0x0120:
            r10.A02 = r1
            return
        L_0x0123:
            boolean r0 = r10 instanceof X.AnonymousClass31I
            if (r0 == 0) goto L_0x0143
            X.31I r3 = (X.AnonymousClass31I) r3
            boolean r0 = r3.A01
            if (r0 == 0) goto L_0x0140
            X.0tZ r1 = r3.A0O
            X.0tZ r0 = r1.A0D()
            if (r0 != 0) goto L_0x0140
            X.1uH r0 = r1.A0N
            if (r0 != 0) goto L_0x0140
            android.view.View r2 = r3.A03
            if (r2 == 0) goto L_0x0140
            android.view.View r0 = r3.A0D
            goto L_0x0117
        L_0x0140:
            android.view.View r0 = r3.A0D
            goto L_0x0145
        L_0x0143:
            android.view.View r0 = r10.A0D
        L_0x0145:
            int r1 = r0.getBottom()
            goto L_0x0120
        L_0x014a:
            boolean r0 = r10 instanceof X.AnonymousClass31I
            if (r0 == 0) goto L_0x0167
            X.31I r2 = (X.AnonymousClass31I) r2
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0164
            android.view.View r1 = r2.A03
            if (r1 == 0) goto L_0x0164
            android.view.View r0 = r2.A0D
            int r2 = r0.getTop()
            int r0 = r1.getPaddingTop()
            int r2 = r2 + r0
            goto L_0x010a
        L_0x0164:
            android.view.View r0 = r2.A0D
            goto L_0x016c
        L_0x0167:
            android.view.View r0 = r10.A0D
            goto L_0x016c
        L_0x016a:
            android.view.View r0 = r2.A0D
        L_0x016c:
            int r2 = r0.getTop()
            goto L_0x010a
        L_0x0171:
            int r4 = r2.getRight()
            int r0 = r8.leftMargin
            int r4 = r4 + r0
            int r3 = r7 - r9
            int r1 = r2.getRight()
            X.2ox r0 = r10.A0I
            int r0 = r0.getMeasuredWidth()
            int r1 = r1 + r0
            int r0 = r8.leftMargin
            int r1 = r1 + r0
            goto L_0x00ee
        L_0x018a:
            X.013 r0 = r10.A0K
            boolean r3 = r0.A0T()
            goto L_0x00c0
        L_0x0192:
            boolean r0 = r10.A0k()
            if (r0 != 0) goto L_0x0050
            X.39r r0 = r10.A0c
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x01c5
            X.1Vw r0 = r5.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x01c5
            X.013 r0 = r10.A0K
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b9
            int r0 = r10.getPaddingLeft()
            int r1 = r4.rightMargin
        L_0x01b6:
            int r1 = r1 + r0
            goto L_0x005b
        L_0x01b9:
            int r1 = r10.getMeasuredWidth()
            int r0 = r10.getPaddingRight()
            int r1 = r1 - r0
            int r0 = r4.leftMargin
            goto L_0x01de
        L_0x01c5:
            X.1Vw r0 = r5.A11
            boolean r1 = r0.A02
            X.013 r0 = r10.A0K
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            if (r1 != r0) goto L_0x01e6
            int r1 = r10.getMeasuredWidth()
            int r0 = r10.getPaddingRight()
            int r1 = r1 - r0
            int r0 = r4.rightMargin
        L_0x01de:
            int r1 = r1 - r0
            int r0 = r2.getMeasuredWidth()
            int r1 = r1 - r0
            goto L_0x005b
        L_0x01e6:
            int r0 = r10.getPaddingLeft()
            int r1 = r4.leftMargin
            goto L_0x01b6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30031bd.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int makeMeasureSpec;
        int mainChildMaxWidth;
        int i5 = i3;
        int i6 = i2;
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        View view = this.A0C;
        int i7 = Integer.MIN_VALUE;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0C.getLayoutParams();
            int i8 = marginLayoutParams.height;
            if (i8 < 0) {
                i8 = mode2 != 0 ? View.MeasureSpec.makeMeasureSpec(size2 - paddingTop, Integer.MIN_VALUE) : i5;
            }
            int i9 = marginLayoutParams.width;
            if (i9 < 0) {
                if (mode != 0) {
                    int i10 = paddingLeft;
                    if (!this.A0c.A04()) {
                        i10 = 0;
                    }
                    int i11 = ((size - i10) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
                    int i12 = Integer.MIN_VALUE;
                    if (i9 == -1) {
                        i12 = 1073741824;
                    }
                    i9 = View.MeasureSpec.makeMeasureSpec(i11, i12);
                } else {
                    i9 = i6;
                }
            }
            this.A0C.measure(i9, i8);
            paddingTop = paddingTop + this.A0C.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        int i13 = i6;
        C56942pD r0 = this.A0H;
        int i14 = 0;
        if (r0 == null || r0.getVisibility() == 8) {
            i4 = 0;
        } else {
            int mode3 = View.MeasureSpec.getMode(i6);
            int size3 = View.MeasureSpec.getSize(i6);
            int mode4 = View.MeasureSpec.getMode(i5);
            int size4 = View.MeasureSpec.getSize(i5);
            int paddingLeft2 = getPaddingLeft() + getPaddingRight();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A0H.getLayoutParams();
            int i15 = marginLayoutParams2.height;
            int i16 = Integer.MIN_VALUE;
            if (i15 >= 0) {
                i5 = i15;
            } else if (mode4 != 0) {
                i5 = View.MeasureSpec.makeMeasureSpec(size4 - paddingTop, Integer.MIN_VALUE);
            }
            int i17 = marginLayoutParams2.width;
            if (i17 >= 0) {
                i13 = i17;
            } else if (mode3 != 0) {
                C616339r r02 = this.A0c;
                if (r02 == null || r02.A04()) {
                    i14 = paddingLeft2;
                }
                int i18 = ((size3 - i14) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
                if (i17 == -1) {
                    i16 = 1073741824;
                }
                i13 = View.MeasureSpec.makeMeasureSpec(i18, i16);
            }
            this.A0H.measure(i13, i5);
            i4 = this.A0H.getMeasuredHeight();
            if (i4 != 0) {
                paddingTop += i4 - getReactionsViewVerticalOverlap();
            }
        }
        View view2 = this.A0D;
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        int i19 = marginLayoutParams3.height;
        if (i19 >= 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 + i4, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(mode2 != 0 ? size2 - paddingTop : size2 + i4, mode2);
        }
        if (mode != 0) {
            int i20 = ((size - paddingLeft) - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin;
            int i21 = marginLayoutParams3.width;
            if (i21 >= 0 && i21 < i20) {
                i20 = i21;
            }
            if (!this.A0S && (mainChildMaxWidth = getMainChildMaxWidth()) != 0 && i20 > mainChildMaxWidth) {
                i20 = mainChildMaxWidth;
            }
            if (marginLayoutParams3.width >= 0) {
                i7 = 1073741824;
            }
            i6 = View.MeasureSpec.makeMeasureSpec(i20, i7);
        } else {
            int i22 = marginLayoutParams3.width;
            if (i22 >= 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i22, 1073741824);
            }
        }
        view2.measure(i6, makeMeasureSpec);
        C56882ox r1 = this.A0I;
        if (r1 != null && (r1.A02.getVisibility() == 0 || r1.A01.getVisibility() == 0)) {
            C56882ox r9 = this.A0I;
            int measuredHeight = view2.getMeasuredHeight();
            r9.setOrientation(1);
            r9.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (r9.getMeasuredHeight() > measuredHeight) {
                r9.setOrientation(0);
                r9.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            int measuredWidth = size - ((view2.getMeasuredWidth() + getPaddingLeft()) + getPaddingRight());
            C56882ox r03 = this.A0I;
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) r03.getLayoutParams();
            int measuredWidth2 = r03.getMeasuredWidth() + marginLayoutParams4.leftMargin + marginLayoutParams4.rightMargin;
            if (measuredWidth < measuredWidth2) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getMeasuredWidth() - (measuredWidth2 - measuredWidth), View.MeasureSpec.getMode(i6)), makeMeasureSpec);
            }
        }
        setMeasuredDimension(size, paddingTop + view2.getMeasuredHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r1 != 3) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.A0j()
            if (r0 == 0) goto L_0x0015
            int r1 = r8.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L_0x0098
            if (r1 == r3) goto L_0x0027
            r0 = 2
            if (r1 == r0) goto L_0x009d
            r0 = 3
            if (r1 == r0) goto L_0x0027
        L_0x0015:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L_0x0022
            float r0 = r8.getY()
            int r0 = (int) r0
            r7.A04 = r0
        L_0x0022:
            boolean r0 = super.onTouchEvent(r8)
            return r0
        L_0x0027:
            int r0 = r7.A06
            if (r0 != r3) goto L_0x0015
            r0 = 2
            r7.A06 = r0
            X.1YG r4 = r7.A0b
            if (r4 == 0) goto L_0x0058
            int r1 = r7.getBubbleSwipeOffset()
            int r0 = r7.getWidth()
            int r0 = r0 / 6
            if (r1 <= r0) goto L_0x0058
            boolean r1 = r4.AJU()
            boolean r2 = r4.AJH()
            X.0tZ r0 = r7.getFMessage()
            r4.AeT(r0)
            if (r1 == 0) goto L_0x0058
            X.0tZ r1 = r7.getFMessage()
            r0 = r2 ^ 1
            r4.AW7(r1, r0)
        L_0x0058:
            android.view.View r0 = r7.A0D
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            r6 = 0
            android.view.ViewPropertyAnimator r4 = r0.translationX(r6)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r5 = r4.setInterpolator(r0)
            r4 = 16
            com.facebook.redex.IDxLAdapterShape3S0100000_2_I0 r0 = new com.facebook.redex.IDxLAdapterShape3S0100000_2_I0
            r0.<init>(r7, r4)
            r5.setListener(r0)
            X.2pD r0 = r7.A0H
            if (r0 == 0) goto L_0x0094
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.ViewPropertyAnimator r1 = r0.translationX(r6)
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
        L_0x0094:
            r7.invalidate()
            return r3
        L_0x0098:
            boolean r0 = r7.A0m(r8)
            goto L_0x00a1
        L_0x009d:
            boolean r0 = r7.A0n(r8)
        L_0x00a1:
            if (r0 == 0) goto L_0x0015
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30031bd.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDrawCenteredBubble(boolean z2) {
        this.A0R = z2;
    }

    public void setFMessage(C16740tZ r1) {
        this.A0O = r1;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
