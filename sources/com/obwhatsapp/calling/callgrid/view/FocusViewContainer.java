package com.obwhatsapp.calling.callgrid.view;

import X.AnonymousClass006;
import X.AnonymousClass26E;
import X.AnonymousClass26d;
import X.C001300o;
import X.C004601z;
import X.C16080sP;
import X.C37921px;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;

public class FocusViewContainer extends ConstraintLayout implements AnonymousClass006 {
    public Rect A00;
    public FrameLayout A01;
    public LinearLayout A02;
    public WaTextView A03;
    public AnonymousClass26d A04;
    public AnonymousClass26E A05;
    public MenuBottomSheetViewModel A06;
    public C16080sP A07;
    public C52662eE A08;
    public boolean A09;
    public boolean A0A;

    public FocusViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public FocusViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FocusViewContainer(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A09) {
            this.A09 = true;
            C52652eD r1 = (C52652eD) ((C52642eC) generatedComponent());
            this.A04 = (AnonymousClass26d) r1.A05.A09.get();
            this.A07 = (C16080sP) r1.A07.AQ9.get();
        }
        LayoutInflater.from(context).inflate(R.layout.layout00d0, this, true);
        this.A03 = (WaTextView) C004601z.A0E(this, R.id.participant_name);
        this.A01 = (FrameLayout) C004601z.A0E(this, R.id.participant_view_container);
        this.A02 = (LinearLayout) C004601z.A0E(this, R.id.menu_list_layout);
        setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 30));
        this.A00 = new Rect();
    }

    public static /* synthetic */ void A00(FocusViewContainer focusViewContainer) {
        FrameLayout frameLayout = focusViewContainer.A01;
        frameLayout.setScaleX(1.0f);
        frameLayout.setScaleY(1.0f);
        frameLayout.setTranslationX(0.0f);
        frameLayout.setTranslationY(0.0f);
        focusViewContainer.A03.animate().alpha(1.0f);
        focusViewContainer.A02.animate().alpha(1.0f);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A08;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass26E getFocusViewHolder() {
        return this.A05;
    }

    public UserJid getVisiblePeerJid() {
        AnonymousClass26E r1;
        if (getVisibility() != 0 || (r1 = this.A05) == null || !r1.A06()) {
            return null;
        }
        C37921px r12 = r1.A06;
        if (!r12.A0E) {
            return r12.A0U;
        }
        return null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A00.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public void setMenuViewModel(C001300o r4, MenuBottomSheetViewModel menuBottomSheetViewModel) {
        this.A06 = menuBottomSheetViewModel;
        menuBottomSheetViewModel.A03.A0A(r4, new IDxObserverShape113S0100000_1_I0(this, 25));
    }
}
