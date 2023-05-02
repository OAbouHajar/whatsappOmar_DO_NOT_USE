package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.redex.IDxSListenerShape78S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.mediacomposer.MediaComposerFragment;
import com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.obwhatsapp.mediacomposer.doodle.ColorPickerView;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import com.obwhatsapp.mediacomposer.doodle.shapepicker.ShapePickerView;
import com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView;

/* renamed from: X.2Ra  reason: invalid class name */
public class AnonymousClass2Ra implements C456229t {
    public int A00 = 0;
    public Activity A01;
    public View A02;
    public AnonymousClass4XG A03;
    public C109925Uh A04;
    public C53742gD A05;
    public C53752gE A06;
    public boolean A07;
    public boolean A08 = false;
    public final Rect A09 = new Rect();
    public final Handler A0A;
    public final AnonymousClass013 A0B;
    public final C14710pd A0C;
    public final MediaComposerFragment A0D;
    public final ColorPickerComponent A0E;
    public final AnonymousClass2Yn A0F;
    public final C455929m A0G;
    public final DoodleView A0H;
    public final AnonymousClass39P A0I;
    public final C49102Rb A0J;
    public final C614138u A0K;
    public final C85984Qt A0L;
    public final AnonymousClass3CW A0M;
    public final C456229t A0N;
    public final C455729k A0O;
    public final C88254aC A0P;
    public final C49112Rc A0Q;
    public final AnonymousClass39G A0R;
    public final C23061Ai A0S;
    public final AnonymousClass01T A0T;
    public final boolean A0U;
    public final boolean A0V;

    public AnonymousClass2Ra(Activity activity, GestureDetector.OnGestureListener onGestureListener, View view, C001300o r36, C001500q r37, AnonymousClass01V r38, AnonymousClass013 r39, C17250um r40, C14710pd r41, AnonymousClass4XG r42, MediaComposerFragment mediaComposerFragment, AnonymousClass2Yn r44, C26211Mt r45, C26221Mu r46, C456229t r47, AnonymousClass1PJ r48, C49112Rc r49, AnonymousClass1MF r50, AnonymousClass14W r51, AnonymousClass1CX r52, C23061Ai r53, C16320sq r54, boolean z2, boolean z3) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A0A = handler;
        C14710pd r12 = r41;
        this.A0C = r12;
        Activity activity2 = activity;
        this.A01 = activity2;
        C23061Ai r8 = r53;
        this.A0S = r8;
        AnonymousClass013 r25 = r39;
        this.A0B = r25;
        View view2 = view;
        this.A02 = view2;
        AnonymousClass4XG r11 = r42;
        this.A03 = r11;
        this.A0N = r47;
        C49112Rc r9 = r49;
        this.A0Q = r9;
        this.A0U = z2;
        MediaComposerFragment mediaComposerFragment2 = mediaComposerFragment;
        this.A0D = mediaComposerFragment2;
        AnonymousClass2Yn r10 = r44;
        this.A0F = r10;
        this.A0V = z3;
        C004601z.A0E(view2, R.id.doodle_decoration).setVisibility(0);
        Resources resources = activity2.getResources();
        C455829l.A03 = resources.getDimension(R.dimen.dimen032c);
        C455829l.A05 = resources.getDimension(r12.A0E(C16620tM.A02, 2591) ? R.dimen.dimen032f : R.dimen.dimen032e);
        C455829l.A08 = resources.getDimension(R.dimen.dimen032b);
        C455829l.A04 = resources.getDimension(R.dimen.dimen032d);
        C455829l.A07 = resources.getDimension(R.dimen.dimen032a);
        C455829l.A06 = resources.getDimension(R.dimen.dimen0329);
        DoodleView doodleView = (DoodleView) this.A02.findViewById(R.id.doodle_view);
        this.A0H = doodleView;
        AnonymousClass39P r4 = doodleView.A0H;
        this.A0I = r4;
        C455729k r3 = doodleView.A0J;
        this.A0O = r3;
        C455929m r13 = doodleView.A0G;
        this.A0G = r13;
        C88254aC r15 = new C88254aC(new AnonymousClass4EV(this));
        this.A0P = r15;
        C49102Rb r16 = new C49102Rb(r13, doodleView.A0I, r3, r15, doodleView.getResources().getDisplayMetrics().density);
        this.A0J = r16;
        this.A0L = new C85984Qt(r13, r3);
        AnonymousClass01V r132 = r38;
        AnonymousClass39G r152 = new AnonymousClass39G(handler, this.A02.findViewById(R.id.trash), r132, r25, new AnonymousClass3L6());
        this.A0R = r152;
        C614138u r1 = new C614138u(new AnonymousClass4EU(this), r4, new AnonymousClass39N(handler, (ViewGroup) this.A02.findViewById(R.id.media_guidelines), r132), r152);
        this.A0K = r1;
        ColorPickerComponent colorPickerComponent = (ColorPickerComponent) this.A02.findViewById(R.id.color_picker_component);
        this.A0E = colorPickerComponent;
        colorPickerComponent.A04(r11, new C102754zT(r10, this, r9), doodleView);
        AnonymousClass3G8 r43 = new AnonymousClass3G8(this, new RunnableRunnableShape1S0300000_I0_1(this, r9, r11, 25));
        this.A04 = r43;
        AnonymousClass3CW r153 = new AnonymousClass3CW(onGestureListener, r43, doodleView, r1, new AnonymousClass4EW(), r3);
        this.A0M = r153;
        doodleView.setControllers(r153, r16);
        doodleView.setDoodleViewListener(this.A04);
        C001300o r154 = r36;
        AnonymousClass1MF r26 = r50;
        AnonymousClass1PJ r24 = r48;
        C26221Mu r23 = r46;
        AnonymousClass013 r17 = r25;
        C14710pd r19 = r12;
        MediaComposerFragment mediaComposerFragment3 = mediaComposerFragment2;
        C49112Rc r252 = r9;
        Activity activity3 = activity2;
        this.A0T = new AnonymousClass01T((Object) null, new C1050758c(activity3, r154, r37, r17, r40, r19, mediaComposerFragment3, this, r45, r23, r24, r252, r26, r51, r52, r8, r54));
        this.A07 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        if (r13.A0Q.A02 == 0) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r13 = this;
            com.obwhatsapp.mediacomposer.doodle.DoodleView r4 = r13.A0H
            boolean r0 = r4.A04()
            if (r0 == 0) goto L_0x0093
            X.2Rb r8 = r13.A0J
            r2 = 1
            r8.A02 = r2
            X.4XG r3 = r13.A03
            r3.A05()
            r13.A02()
            X.29k r1 = r13.A0O
            r0 = 0
            r1.A01 = r0
            com.obwhatsapp.mediacomposer.doodle.ColorPickerComponent r1 = r13.A0E
            r5 = 0
            r1.A05(r5)
            r3.A03()
            r0 = 2
            int[] r10 = new int[r0]
            float r0 = r4.getScaleX()
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x004e
            float r0 = r4.getScaleY()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x004e
            boolean r0 = r13.A0V
            if (r0 == 0) goto L_0x0094
            X.2Rc r3 = r13.A0Q
            int r0 = r3.A02
            if (r0 == 0) goto L_0x0094
            com.obwhatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r3.A0H
            int r0 = r0.getPaddingLeft()
            r10[r5] = r0
            int r0 = r3.A02
            r10[r2] = r0
        L_0x004e:
            android.app.Activity r5 = r13.A01
            X.2Yn r6 = r13.A0F
            X.4Qt r9 = r13.A0L
            X.4ET r7 = new X.4ET
            r7.<init>(r4)
            boolean r11 = r13.A0U
            boolean r0 = r13.A0V
            if (r0 == 0) goto L_0x0066
            X.2Rc r0 = r13.A0Q
            int r0 = r0.A02
            r12 = 1
            if (r0 != 0) goto L_0x0067
        L_0x0066:
            r12 = 0
        L_0x0067:
            X.2gD r4 = new X.2gD
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A05 = r4
            com.obwhatsapp.mediacomposer.doodle.ColorPickerView r0 = r1.A05
            int r0 = r0.getHeight()
            r4.A01 = r0
            X.2gD r1 = r13.A05
            com.facebook.redex.IDxDListenerShape157S0100000_1_I0 r0 = new com.facebook.redex.IDxDListenerShape157S0100000_1_I0
            r0.<init>(r13, r2)
            r1.setOnDismissListener(r0)
            X.2Rc r2 = r13.A0Q
            r1 = 0
            int r0 = r6.A00
            r2.A09(r0, r1)
            X.2gD r2 = r13.A05
            r1 = 2
            com.facebook.redex.IDxSListenerShape246S0100000_2_I0 r0 = new com.facebook.redex.IDxSListenerShape246S0100000_2_I0
            r0.<init>(r13, r1)
            r2.setOnShowListener(r0)
        L_0x0093:
            return
        L_0x0094:
            r4.getLocationOnScreen(r10)
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Ra.A00():void");
    }

    public void A01() {
        if (this.A0H.A04()) {
            A04();
            C49112Rc r5 = this.A0Q;
            r5.A04();
            r5.A08(0);
            AnonymousClass4XG r3 = this.A03;
            r3.A04();
            C455729k r2 = this.A0O;
            int i2 = 4;
            if (!r2.A03.A00.isEmpty()) {
                i2 = 0;
            }
            r5.A0H.setUndoButtonVisibility(i2);
            r3.A05();
            A02();
            this.A0J.A02 = false;
            ColorPickerComponent colorPickerComponent = this.A0E;
            colorPickerComponent.A05(true);
            r3.A00();
            ColorPickerView colorPickerView = colorPickerComponent.A05;
            colorPickerView.A01();
            colorPickerView.invalidate();
            r2.A01 = null;
        }
    }

    public final void A02() {
        if (A08()) {
            AnonymousClass2Ur r2 = (AnonymousClass2Ur) this.A0T.get();
            ShapePickerView shapePickerView = r2.A0R;
            shapePickerView.setVisibility(8);
            r2.A0Y.A01(shapePickerView);
            if (shapePickerView.A02()) {
                shapePickerView.invalidate();
            }
            if (r2.A04) {
                r2.A0E.A1D();
            }
            TitleBarView titleBarView = this.A0Q.A0H;
            titleBarView.setToolbarExtraVisibility(8);
            int i2 = 4;
            if (!this.A0O.A03.A00.isEmpty()) {
                i2 = 0;
            }
            titleBarView.setUndoButtonVisibility(i2);
            this.A03.A04();
            A04();
        }
    }

    public final void A03() {
        if (A08()) {
            AnonymousClass2Ur r4 = (AnonymousClass2Ur) this.A0T.get();
            boolean z2 = this.A07;
            r4.A0U.A03(z2);
            r4.A0T.A03(z2);
            r4.A0Z.A0B(Boolean.valueOf(z2));
            ShapePickerRecyclerView shapePickerRecyclerView = r4.A0Q;
            boolean z3 = false;
            if (r4.A03.A06.getVisibility() == 0) {
                z3 = true;
            }
            shapePickerRecyclerView.A12(z2, z3);
        }
    }

    public final void A04() {
        C49112Rc r2 = this.A0Q;
        int i2 = 0;
        if (r2.A00() == 2) {
            C455829l r1 = this.A0O.A01;
            if (r1 == null || (!r1.A0K() && !r1.A0J())) {
                this.A0E.A05(true);
                this.A03.A00();
                r2.A08(0);
                A01();
            } else {
                this.A0E.A00();
            }
        }
        if (A08()) {
            ColorPickerComponent colorPickerComponent = this.A0E;
            colorPickerComponent.A05.clearAnimation();
            colorPickerComponent.A05(false);
        } else {
            if (!(!this.A0O.A03.A00.isEmpty())) {
                i2 = 4;
            }
            r2.A0H.setUndoButtonVisibility(i2);
        }
        boolean A0T2 = this.A0B.A0T();
        TitleBarView titleBarView = r2.A0H;
        RelativeLayout relativeLayout = titleBarView.A07;
        ImageView imageView = titleBarView.A02;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.addRule(A0T2 ^ true ? 1 : 0, imageView.getId());
        relativeLayout.setLayoutParams(layoutParams);
    }

    public void A05(RectF rectF) {
        AnonymousClass39P r2 = this.A0I;
        r2.A07 = rectF;
        AnonymousClass470.A00(r2.A09, rectF, (float) r2.A02);
        DoodleView doodleView = this.A0H;
        r2.A08 = doodleView.getResources().getDisplayMetrics();
        C455929m r0 = this.A0G;
        r0.A02();
        doodleView.requestLayout();
        r0.A01();
    }

    public void A06(C455829l r4) {
        this.A0H.A03(r4);
        if (!A08()) {
            boolean A0J2 = r4.A0J();
            C49112Rc r1 = this.A0Q;
            int i2 = 0;
            if (A0J2) {
                i2 = 2;
            }
            r1.A08(i2);
            r1.A01 = this.A0F.A00;
        }
    }

    public final void A07(AnonymousClass32z r14) {
        String str;
        float textSize;
        int color;
        int i2;
        int i3;
        A02();
        this.A03.A05();
        int i4 = 0;
        this.A0J.A02 = false;
        C49112Rc r3 = this.A0Q;
        TitleBarView titleBarView = r3.A0H;
        titleBarView.A0C.A01(0);
        titleBarView.A0B.A01(0);
        ColorPickerComponent colorPickerComponent = this.A0E;
        colorPickerComponent.A05(false);
        C23061Ai r0 = this.A0S;
        DoodleView doodleView = this.A0H;
        r0.A02(doodleView);
        int[] iArr = {titleBarView.getPaddingLeft(), titleBarView.getPaddingTop(), titleBarView.getPaddingRight(), titleBarView.getPaddingBottom()};
        boolean A0E2 = this.A0C.A0E(C16620tM.A02, 2918);
        int i5 = R.layout.layout023f;
        if (A0E2) {
            i5 = R.layout.layout0240;
        }
        C55602k1 r9 = (C55602k1) LayoutInflater.from(this.A02.getContext()).inflate(i5, (ViewGroup) null).findViewById(R.id.main);
        if (r14 == null) {
            str = "";
            textSize = 0.0f;
            color = this.A0F.A00;
            i2 = this.A00;
        } else {
            str = r14.A06;
            textSize = r14.A08.getTextSize();
            color = r14.A01.getColor();
            i2 = r14.A03;
        }
        AnonymousClass4MW r10 = new AnonymousClass4MW(str, textSize, color, i2);
        this.A00 = r10.A02;
        Activity activity = this.A01;
        if (this.A0V && (i3 = r3.A02) != 0 && !this.A07) {
            i4 = i3;
        }
        C53752gE r6 = new C53752gE(activity, this, r9, r10, iArr, i4);
        this.A06 = r6;
        ColorPickerView colorPickerView = colorPickerComponent.A05;
        r6.A02.A03.A00 = colorPickerView.getHeight();
        C53752gE r4 = this.A06;
        boolean z2 = false;
        if (colorPickerView.getVisibility() == 0) {
            z2 = true;
        }
        r4.A02.A03.A06 = !z2;
        if (r14 != null) {
            this.A0O.A04(r14);
            doodleView.invalidate();
        }
        this.A06.setOnShowListener(new IDxSListenerShape78S0200000_2_I0(r10, 2, this));
        r3.A09(r10.A01, r10.A00);
        this.A06.setOnDismissListener(new AnonymousClass3CC(this, r14, r10));
    }

    public final boolean A08() {
        AnonymousClass01T r1 = this.A0T;
        return r1.A00() && ((AnonymousClass2Ur) r1.get()).A0R.getVisibility() == 0;
    }

    public boolean A09(float f2, float f3) {
        if (A08()) {
            return true;
        }
        DoodleView doodleView = this.A0H;
        if (doodleView.A0H.A07 == null) {
            return false;
        }
        if (doodleView.A09.A02) {
            return true;
        }
        C455729k r1 = doodleView.A0J;
        return (r1.A02 == null && r1.A00(doodleView.A0I.A00(f2, f3)) == null) ? false : true;
    }

    public void AX9(C455829l r2) {
        if (r2 instanceof AnonymousClass331) {
            this.A0N.AX9(r2);
        } else {
            A06(r2);
        }
    }
}
