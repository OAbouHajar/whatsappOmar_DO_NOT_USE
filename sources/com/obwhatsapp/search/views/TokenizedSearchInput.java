package com.obwhatsapp.search.views;

import X.AnonymousClass006;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass05M;
import X.AnonymousClass090;
import X.AnonymousClass34J;
import X.AnonymousClass3A6;
import X.AnonymousClass4F6;
import X.C001300o;
import X.C004601z;
import X.C16000sG;
import X.C16080sP;
import X.C16150sX;
import X.C34901l3;
import X.C35031lG;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C57082q6;
import X.C85264Nt;
import X.C87594Xo;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape211S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape240S0100000_2_I0;
import com.facebook.redex.IDxKListenerShape254S0100000_2_I0;
import com.facebook.redex.IDxUListenerShape140S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.search.SearchViewModel;
import com.obwhatsapp.text.FinalBackspaceAwareEntry;
import com.whatsapp.jid.UserJid;

public class TokenizedSearchInput extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public int A01;
    public View.OnClickListener A02;
    public View.OnKeyListener A03;
    public TextView.OnEditorActionListener A04;
    public AnonymousClass05M A05;
    public C001300o A06;
    public C16000sG A07;
    public C16080sP A08;
    public AnonymousClass01V A09;
    public AnonymousClass013 A0A;
    public UserJid A0B;
    public SearchViewModel A0C;
    public C35031lG A0D;
    public AnonymousClass4F6 A0E;
    public C52662eE A0F;
    public Integer A0G;
    public Runnable A0H;
    public Runnable A0I;
    public String A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final View.OnFocusChangeListener A0N;
    public final View A0O;
    public final Chip A0P;
    public final Chip A0Q;
    public final Chip A0R;
    public final WaImageButton A0S;
    public final WaImageView A0T;
    public final FinalBackspaceAwareEntry A0U;

    public TokenizedSearchInput(Context context) {
        this(context, (AttributeSet) null);
    }

    public TokenizedSearchInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TokenizedSearchInput(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0L) {
            this.A0L = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A07 = (C16000sG) r1.A4x.get();
            this.A08 = (C16080sP) r1.AQ9.get();
            this.A0A = (AnonymousClass013) r1.AR8.get();
            this.A09 = (AnonymousClass01V) r1.AOi.get();
        }
        this.A0M = false;
        this.A0J = "";
        this.A0G = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A0E = new AnonymousClass4F6(this);
        this.A04 = new IDxAListenerShape211S0100000_2_I0(this, 4);
        this.A03 = new IDxKListenerShape254S0100000_2_I0(this, 3);
        this.A02 = new ViewOnClickCListenerShape12S0100000_I0_5(this, 16);
        this.A05 = new C57082q6(this);
        this.A0N = new IDxCListenerShape240S0100000_2_I0(this, 2);
        LayoutInflater from = LayoutInflater.from(context);
        setOrientation(0);
        setGravity(16);
        from.inflate(R.layout.layout0523, this, true);
        this.A0R = (Chip) C004601z.A0E(this, R.id.type_token);
        this.A0P = (Chip) C004601z.A0E(this, R.id.chat_token);
        this.A0Q = (Chip) C004601z.A0E(this, R.id.smart_filter_token);
        this.A0U = (FinalBackspaceAwareEntry) C004601z.A0E(this, R.id.search_input);
        this.A0T = (WaImageView) C004601z.A0E(this, R.id.search_clear_btn);
        this.A0O = C004601z.A0E(this, R.id.focus_dummy);
        this.A0S = (WaImageButton) C004601z.A0E(this, R.id.grid_list_toggle);
    }

    public static /* synthetic */ void A00(View view, TokenizedSearchInput tokenizedSearchInput) {
        SearchViewModel searchViewModel = tokenizedSearchInput.A0C;
        if (searchViewModel != null) {
            if (view == tokenizedSearchInput.A0R) {
                searchViewModel.A0R(0);
            } else if (view == tokenizedSearchInput.A0P) {
                searchViewModel.A0E();
            } else if (view == tokenizedSearchInput.A0Q) {
                searchViewModel.A0F();
            }
        }
        tokenizedSearchInput.postDelayed(new RunnableRunnableShape14S0100000_I0_13((Object) tokenizedSearchInput, 19), 100);
    }

    public static /* synthetic */ void A05(TokenizedSearchInput tokenizedSearchInput) {
        SearchViewModel searchViewModel = tokenizedSearchInput.A0C;
        if (searchViewModel != null) {
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0U;
            finalBackspaceAwareEntry.setSelection(searchViewModel.A0D().length());
            finalBackspaceAwareEntry.sendAccessibilityEvent(8);
            tokenizedSearchInput.setFocus(0);
        }
    }

    public static /* synthetic */ void A07(TokenizedSearchInput tokenizedSearchInput, Boolean bool) {
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            tokenizedSearchInput.setFocus(0);
            FinalBackspaceAwareEntry finalBackspaceAwareEntry = tokenizedSearchInput.A0U;
            finalBackspaceAwareEntry.requestFocus();
            finalBackspaceAwareEntry.A04(false);
            return;
        }
        tokenizedSearchInput.setFocus(4);
        tokenizedSearchInput.A0U.clearFocus();
        tokenizedSearchInput.A0O.requestFocus();
        InputMethodManager A0Q2 = tokenizedSearchInput.A09.A0Q();
        if (A0Q2 != null) {
            A0Q2.hideSoftInputFromWindow(tokenizedSearchInput.getWindowToken(), 2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r4 != 4) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setFocus(int r4) {
        /*
            r3 = this;
            com.obwhatsapp.search.SearchViewModel r0 = r3.A0C
            if (r0 == 0) goto L_0x0032
            int r0 = r3.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            boolean r0 = X.C34901l3.A00(r1, r0)
            if (r0 != 0) goto L_0x0032
            r2 = 1
            if (r4 == 0) goto L_0x003d
            if (r4 == r2) goto L_0x0033
            r0 = 2
            if (r4 == r0) goto L_0x0033
            r0 = 3
            if (r4 == r0) goto L_0x0033
            r0 = 4
            if (r4 == r0) goto L_0x0027
        L_0x0022:
            com.obwhatsapp.search.SearchViewModel r0 = r3.A0C
            r0.A0Y(r2)
        L_0x0027:
            r3.A00 = r4
            r3.A0F()
            r3.A0D()
            r3.A0E()
        L_0x0032:
            return
        L_0x0033:
            com.obwhatsapp.text.FinalBackspaceAwareEntry r1 = r3.A0U
            r0 = 0
            r1.setSelection(r0)
            r1.setCursorVisible(r0)
            goto L_0x0022
        L_0x003d:
            com.obwhatsapp.text.FinalBackspaceAwareEntry r0 = r3.A0U
            r0.setCursorVisible(r2)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.search.views.TokenizedSearchInput.setFocus(int):void");
    }

    public ColorStateList A08(boolean z2) {
        int A002 = AnonymousClass00T.A00(getContext(), R.color.color06b9);
        int A003 = AnonymousClass00T.A00(getContext(), R.color.color06b8);
        if (!z2) {
            A002 = A003;
        }
        return ColorStateList.valueOf(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r3.A0D != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r3 = this;
            com.obwhatsapp.WaImageView r2 = r3.A0T
            com.whatsapp.jid.UserJid r0 = r3.A0B
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = r3.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r0 = r3.A0G
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x001b
            X.1lG r1 = r3.A0D
            r0 = 1
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r0 = r0 ^ 1
            r2.setEnabled(r0)
            com.obwhatsapp.WaImageButton r1 = r3.A0S
            boolean r0 = r3.A0K
            r1.setEnabled(r0)
            boolean r0 = r3.A0M
            if (r0 == 0) goto L_0x0030
            r3.A0A()
            return
        L_0x0030:
            java.lang.Runnable r0 = r3.A0I
            if (r0 == 0) goto L_0x0037
            r3.removeCallbacks(r0)
        L_0x0037:
            java.lang.Runnable r0 = r3.A0H
            if (r0 == 0) goto L_0x003e
            r3.removeCallbacks(r0)
        L_0x003e:
            r0 = 17
            com.facebook.redex.RunnableRunnableShape14S0100000_I0_13 r2 = new com.facebook.redex.RunnableRunnableShape14S0100000_I0_13
            r2.<init>((java.lang.Object) r3, (int) r0)
            r3.A0I = r2
            r0 = 50
            r3.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.search.views.TokenizedSearchInput.A09():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == 8) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
            r6 = this;
            com.obwhatsapp.search.SearchViewModel r0 = r6.A0C
            if (r0 == 0) goto L_0x003e
            int r0 = r6.A01
            com.obwhatsapp.WaImageButton r5 = r6.A0S
            if (r0 == 0) goto L_0x0064
            r0 = 2131231928(0x7f0804b8, float:1.807995E38)
            r5.setImageResource(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131893703(0x7f121dc7, float:1.942219E38)
        L_0x0017:
            java.lang.String r0 = r1.getString(r0)
            r5.setContentDescription(r0)
            int r4 = r5.getVisibility()
            boolean r0 = r6.A0K
            r3 = 4
            r2 = 8
            if (r0 == 0) goto L_0x0058
            r1 = 0
        L_0x002a:
            boolean r0 = r6.A0M
            if (r0 == 0) goto L_0x0034
            r5.setVisibility(r1)
            r6.A0B()
        L_0x0034:
            if (r4 != r2) goto L_0x003f
            if (r1 != r2) goto L_0x0049
        L_0x0038:
            r5.setVisibility(r1)
            r6.A0B()
        L_0x003e:
            return
        L_0x003f:
            if (r4 == r2) goto L_0x0038
            if (r1 != r2) goto L_0x0038
            r5.setVisibility(r3)
            r6.A0B()
        L_0x0049:
            r0 = 28
            com.facebook.redex.RunnableRunnableShape0S0101000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0101000_I0
            r2.<init>((java.lang.Object) r6, (int) r1, (int) r0)
            r6.A0H = r2
            r0 = 50
            r6.postDelayed(r2, r0)
            return
        L_0x0058:
            com.obwhatsapp.search.SearchViewModel r0 = r6.A0C
            boolean r0 = r0.A0Z()
            r1 = 8
            if (r0 == 0) goto L_0x002a
            r1 = 4
            goto L_0x002a
        L_0x0064:
            r0 = 2131231927(0x7f0804b7, float:1.8079949E38)
            r5.setImageResource(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131893702(0x7f121dc6, float:1.9422188E38)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.search.views.TokenizedSearchInput.A0A():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r3.A0D != null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
            r3 = this;
            com.whatsapp.jid.UserJid r0 = r3.A0B
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r3.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0019
            java.lang.Integer r0 = r3.A0G
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0019
            X.1lG r0 = r3.A0D
            r2 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            com.obwhatsapp.WaImageView r1 = r3.A0T
            r0 = 0
            if (r2 == 0) goto L_0x0020
            r0 = 4
        L_0x0020:
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.search.views.TokenizedSearchInput.A0B():void");
    }

    public final void A0C() {
        FinalBackspaceAwareEntry finalBackspaceAwareEntry;
        String string;
        if (this.A0B == null || this.A0G.intValue() == 0) {
            finalBackspaceAwareEntry = this.A0U;
            string = getContext().getString(R.string.str14a4);
        } else {
            finalBackspaceAwareEntry = this.A0U;
            string = "";
        }
        finalBackspaceAwareEntry.setHint(string);
    }

    public final void A0D() {
        UserJid userJid = this.A0B;
        Chip chip = this.A0P;
        if (userJid == null) {
            chip.setVisibility(8);
        } else if (chip.getVisibility() == 8) {
            A0G(chip);
        } else {
            boolean z2 = true;
            boolean z3 = false;
            if (this.A00 == 2) {
                z3 = true;
            }
            chip.setChipBackgroundColor(A08(z3));
            if (this.A00 != 2) {
                z2 = false;
            }
            A0H(chip, z2);
        }
    }

    public final void A0E() {
        C35031lG r0 = this.A0D;
        if (r0 == null) {
            this.A0Q.setVisibility(8);
            return;
        }
        Chip chip = this.A0Q;
        chip.setText(r0.A02);
        AnonymousClass34J.A00(getContext(), chip, this.A0D.A00, R.color.color090b);
        boolean z2 = true;
        boolean z3 = false;
        if (this.A00 == 3) {
            z3 = true;
        }
        chip.setChipBackgroundColor(A08(z3));
        if (this.A00 != 3) {
            z2 = false;
        }
        A0H(chip, z2);
        if (chip.getVisibility() == 8) {
            A0G(chip);
        }
    }

    public final void A0F() {
        C85264Nt r0 = (C85264Nt) AnonymousClass3A6.A00().get(this.A0G.intValue());
        if (r0 == null) {
            this.A0R.setVisibility(8);
            return;
        }
        Chip chip = this.A0R;
        chip.setText(r0.A05);
        AnonymousClass3A6.A01(getContext(), chip, this.A0G.intValue(), R.color.color090b);
        boolean z2 = false;
        boolean z3 = false;
        if (this.A00 == 1) {
            z3 = true;
        }
        chip.setChipBackgroundColor(A08(z3));
        if (this.A00 == 1) {
            z2 = true;
        }
        A0H(chip, z2);
        if (chip.getVisibility() == 8) {
            A0G(chip);
        }
    }

    public final void A0G(Chip chip) {
        int color = getResources().getColor(R.color.color0099);
        int color2 = getResources().getColor(R.color.color06b8);
        int A052 = AnonymousClass090.A05(color, color2);
        if (this.A0M) {
            chip.setScaleX(1.0f);
            chip.setScaleY(1.0f);
            chip.setAlpha(1.0f);
            chip.setVisibility(0);
            chip.setChipBackgroundColor(ColorStateList.valueOf(color2));
            return;
        }
        ColorStateList valueOf = ColorStateList.valueOf(A052);
        chip.setScaleX(0.92f);
        chip.setScaleY(0.92f);
        chip.setAlpha(0.0f);
        chip.setChipBackgroundColor(valueOf);
        chip.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(chip, "scaleX", new float[]{0.92f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(chip, "scaleY", new float[]{0.92f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(chip, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.setDuration(100);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(A052), Integer.valueOf(color2)});
        ofObject.addUpdateListener(new IDxUListenerShape140S0100000_2_I0(chip, 23));
        ofObject.setDuration(100);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(ofObject).after(animatorSet);
        animatorSet2.start();
    }

    public void A0H(Chip chip, boolean z2) {
        Context context;
        float f2;
        if (z2) {
            chip.setChipStrokeColor(ColorStateList.valueOf(AnonymousClass00T.A00(getContext(), R.color.color06ba)));
            context = getContext();
            f2 = 1.0f;
        } else {
            chip.setChipStrokeColor((ColorStateList) null);
            context = getContext();
            f2 = 0.0f;
        }
        chip.setChipStrokeWidth((float) C87594Xo.A00(context, f2));
    }

    public void A0I(String str) {
        if (!C34901l3.A00(this.A0J, str)) {
            if (this.A00 != 0 && !TextUtils.isEmpty(str)) {
                setFocus(0);
            }
            this.A0J = str;
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0F;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0F = r0;
        }
        return r0.generatedComponent();
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        int max = Math.max(getResources().getDimensionPixelSize(R.dimen.dimen06d2), (int) Math.floor(((double) getWidth()) * 0.3d));
        this.A0R.setMaxWidth(max);
        this.A0P.setMaxWidth(max);
    }

    public void setNoAnimateForTestsOnly(boolean z2) {
        this.A0M = z2;
    }
}
