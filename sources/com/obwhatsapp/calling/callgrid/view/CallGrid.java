package com.obwhatsapp.calling.callgrid.view;

import X.AnonymousClass006;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01J;
import X.AnonymousClass05T;
import X.AnonymousClass071;
import X.AnonymousClass26E;
import X.AnonymousClass26d;
import X.AnonymousClass2ZV;
import X.AnonymousClass2ZW;
import X.AnonymousClass2ZX;
import X.AnonymousClass2ZY;
import X.AnonymousClass2ZZ;
import X.AnonymousClass3FK;
import X.AnonymousClass4DV;
import X.AnonymousClass4DW;
import X.AnonymousClass4DX;
import X.AnonymousClass4Q9;
import X.AnonymousClass5MW;
import X.AnonymousClass5SU;
import X.C004601z;
import X.C005502j;
import X.C005602k;
import X.C101024wa;
import X.C14710pd;
import X.C16150sX;
import X.C17140ub;
import X.C17200uh;
import X.C23651Cv;
import X.C26801Pf;
import X.C26811Ph;
import X.C37921px;
import X.C49132Rg;
import X.C49872Wg;
import X.C50022Xi;
import X.C50042Xk;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C57772rm;
import X.C59882zE;
import X.C64493Qn;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class CallGrid extends FrameLayout implements AnonymousClass006 {
    public Parcelable A00;
    public C23651Cv A01;
    public AnonymousClass5MW A02;
    public AnonymousClass26d A03;
    public C50042Xk A04;
    public CallGridViewModel A05;
    public C26801Pf A06;
    public C26811Ph A07;
    public C17140ub A08;
    public C17200uh A09;
    public AnonymousClass013 A0A;
    public C14710pd A0B;
    public C52662eE A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final View A0I;
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final View A0M;
    public final FrameLayout A0N;
    public final TextView A0O;
    public final AnonymousClass05T A0P;
    public final LinearLayoutManager A0Q;
    public final AnonymousClass071 A0R;
    public final AnonymousClass071 A0S;
    public final RecyclerView A0T;
    public final RecyclerView A0U;
    public final AnonymousClass4DV A0V;
    public final AnonymousClass4Q9 A0W;
    public final C57772rm A0X;
    public final CallGridLayoutManager A0Y;
    public final C50022Xi A0Z;
    public final FocusViewContainer A0a;
    public final PipViewContainer A0b;
    public final AnonymousClass5SU A0c;

    public CallGrid(Context context) {
        this(context, (AttributeSet) null);
    }

    public CallGrid(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CallGrid(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A0D) {
            this.A0D = true;
            C52652eD r2 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r1 = r2.A07;
            AnonymousClass01J r3 = r1.A05;
            this.A0B = (C14710pd) r3.get();
            C49132Rg r22 = r2.A05;
            this.A03 = (AnonymousClass26d) r22.A09.get();
            this.A04 = new C50042Xk((AnonymousClass2ZZ) r22.A1Q.get(), (AnonymousClass2ZY) r22.A1R.get(), (AnonymousClass2ZX) r22.A1S.get(), (AnonymousClass2ZW) r22.A1T.get(), (AnonymousClass2ZV) r22.A1U.get(), (C14710pd) r3.get());
            this.A09 = (C17200uh) r1.A52.get();
            this.A08 = (C17140ub) r1.A4y.get();
            this.A01 = (C23651Cv) r1.A1k.get();
            this.A0A = (AnonymousClass013) r1.AR8.get();
            this.A06 = (C26801Pf) r1.APr.get();
            this.A07 = (C26811Ph) r1.APs.get();
        }
        this.A0S = new IDxSListenerShape34S0100000_2_I0(this, 4);
        this.A0R = new IDxSListenerShape34S0100000_2_I0(this, 5);
        this.A0P = new CallGrid$$ExternalSyntheticLambda0(this);
        AnonymousClass3FK r32 = new AnonymousClass3FK(this);
        this.A0c = r32;
        AnonymousClass4Q9 r23 = new AnonymousClass4Q9(this);
        this.A0W = r23;
        LayoutInflater.from(context).inflate(R.layout.layout00cf, this, true);
        AnonymousClass26d r0 = this.A03;
        r0.A04 = r32;
        r0.A03 = r23;
        C50042Xk r02 = this.A04;
        r02.A04 = r32;
        r02.A03 = r23;
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(this, R.id.call_grid_recycler_view);
        this.A0U = recyclerView;
        recyclerView.setAdapter(this.A03);
        RecyclerView recyclerView2 = (RecyclerView) C004601z.A0E(this, R.id.call_grid_h_scroll_recycler_view);
        this.A0T = recyclerView2;
        recyclerView2.setAdapter(this.A04);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen083e);
        recyclerView2.A0m(new C50022Xi(dimensionPixelSize, 3, !this.A0A.A0T(), true));
        this.A04.A00 = dimensionPixelSize;
        this.A0M = C004601z.A0E(this, R.id.call_grid_top_scrolling_peek_overlay);
        this.A0I = C004601z.A0E(this, R.id.call_grid_bottom_scrolling_peek_overlay);
        this.A0J = C004601z.A0E(this, R.id.left_gradient);
        this.A0L = C004601z.A0E(this, R.id.right_gradient);
        View A0E2 = C004601z.A0E(this, R.id.call_grid_participant_count_container);
        this.A0K = A0E2;
        this.A0O = (TextView) C004601z.A0E(this, R.id.call_grid_participant_count);
        A0E2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{AnonymousClass00T.A00(getContext(), R.color.color0097), AnonymousClass00T.A00(getContext(), R.color.color0792)}));
        boolean z2 = !this.A0A.A0T();
        View view = this.A0J;
        if (z2) {
            view.setRotation(0.0f);
            this.A0L.setRotation(180.0f);
        } else {
            view.setRotation(180.0f);
            this.A0L.setRotation(0.0f);
        }
        A06();
        AnonymousClass4DX r5 = new AnonymousClass4DX(this);
        C57772rm r24 = new C57772rm();
        this.A0X = r24;
        r24.A00 = new AnonymousClass4DW(this);
        r24.A00 = false;
        CallGridLayoutManager callGridLayoutManager = new CallGridLayoutManager(r24);
        this.A0Y = callGridLayoutManager;
        callGridLayoutManager.A02 = r5;
        callGridLayoutManager.A12((String) null);
        if (0 != callGridLayoutManager.A01) {
            callGridLayoutManager.A01 = 0;
            callGridLayoutManager.A0D();
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.A0Q = linearLayoutManager;
        recyclerView2.setLayoutManager(linearLayoutManager);
        recyclerView2.setItemAnimator((C005502j) null);
        new C64493Qn().A02(recyclerView2);
        recyclerView.setLayoutManager(callGridLayoutManager);
        recyclerView.setItemAnimator(r24);
        C50022Xi r03 = new C50022Xi(getResources().getDimensionPixelSize(R.dimen.dimen083d), 0, !this.A0A.A0T(), false);
        this.A0Z = r03;
        recyclerView.A0m(r03);
        this.A0G = false;
        PipViewContainer pipViewContainer = (PipViewContainer) C004601z.A0E(this, R.id.pip_view_container);
        this.A0b = pipViewContainer;
        pipViewContainer.A05 = new C101024wa(this);
        this.A0a = (FocusViewContainer) C004601z.A0E(this, R.id.focus_view_container);
        this.A0V = new AnonymousClass4DV();
        this.A0N = (FrameLayout) C004601z.A0E(this, R.id.lonely_state_container);
    }

    public static /* synthetic */ void A02(CallGrid callGrid) {
        int size = callGrid.A03.A0E.size();
        StringBuilder sb = new StringBuilder("CallGrid/updateGridLayoutMode, nTiles: ");
        sb.append(size);
        Log.i(sb.toString());
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass26E r2 = (AnonymousClass26E) callGrid.A0U.A0D(i2);
            if (r2 instanceof C59882zE) {
                int i3 = 0;
                if (size > 2) {
                    i3 = 2;
                    if (size <= 8) {
                        i3 = 1;
                    }
                }
                r2.A09(i3);
            }
        }
        callGrid.A07();
        if (callGrid.A05 != null && callGrid.A0G && callGrid.A04.A0E.size() > 0) {
            callGrid.A05.A0H(callGrid.getVisibleParticipantJids());
        }
    }

    public static /* synthetic */ void A03(CallGrid callGrid, C49872Wg r4) {
        boolean z2 = false;
        if (r4.A00 == 2) {
            z2 = true;
        }
        callGrid.A0F = z2;
        callGrid.setupLonelyStateContainerMargins(callGrid.A0G);
    }

    public static /* synthetic */ void A04(CallGrid callGrid, boolean z2) {
        StringBuilder sb = new StringBuilder("CallGrid/onAvSwitched, isVideoEnabled: ");
        sb.append(z2);
        Log.i(sb.toString());
        callGrid.A0G = z2;
        callGrid.A0Y.A06 = z2;
        callGrid.A0X.A0D = z2;
        callGrid.setupLonelyStateContainerMargins(z2);
    }

    /* access modifiers changed from: private */
    public List getVisibleParticipantJids() {
        AnonymousClass00B.A0F(this.A0G);
        RecyclerView recyclerView = this.A0U;
        boolean z2 = false;
        if (recyclerView.getLayoutManager() != null) {
            z2 = true;
        }
        AnonymousClass00B.A0F(z2);
        ArrayList arrayList = new ArrayList();
        FocusViewContainer focusViewContainer = this.A0a;
        if (focusViewContainer.getVisiblePeerJid() != null) {
            arrayList.add(focusViewContainer.getVisiblePeerJid());
        }
        for (int i2 = 0; i2 <= recyclerView.getLayoutManager().A06(); i2++) {
            AnonymousClass26E r1 = (AnonymousClass26E) recyclerView.A0D(i2);
            if (r1 != null && r1.A06() && !r1.A06.A0E) {
                arrayList.add(r1.A06.A0U);
            }
        }
        LinearLayoutManager linearLayoutManager = this.A0Q;
        int A19 = linearLayoutManager.A19();
        int A1B = linearLayoutManager.A1B();
        for (int i3 = A19; i3 <= A1B; i3++) {
            AnonymousClass26E r2 = (AnonymousClass26E) this.A0T.A0D(i3);
            if (r2 != null && r2.A06()) {
                if (i3 == A19 || i3 == A1B) {
                    Rect rect = new Rect();
                    View view = r2.A0H;
                    view.getGlobalVisibleRect(rect);
                    if (rect.width() < view.getWidth() / 3) {
                    }
                }
                arrayList.add(r2.A06.A0U);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public void setMargins(Rect rect) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = rect.left;
            marginLayoutParams.topMargin = rect.top;
            marginLayoutParams.bottomMargin = rect.bottom;
            marginLayoutParams.rightMargin = rect.right;
            setLayoutParams(marginLayoutParams);
        }
    }

    private void setShouldInvalidateItemDecorations(boolean z2) {
        this.A0H = z2;
    }

    private void setupLonelyStateContainerMargins(boolean z2) {
        int i2;
        Resources resources;
        int i3;
        FrameLayout frameLayout = this.A0N;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        Resources resources2 = getResources();
        if (z2) {
            i2 = resources2.getDimensionPixelSize(R.dimen.dimen08a7);
            if (!this.A0F) {
                resources = getResources();
                i3 = R.dimen.dimen0504;
            }
            resources = getResources();
            i3 = R.dimen.dimen0505;
        } else {
            i2 = resources2.getDimensionPixelSize(R.dimen.dimen0505);
            resources = getResources();
            i3 = R.dimen.dimen0505;
        }
        marginLayoutParams.setMargins(i2, 0, i2, resources.getDimensionPixelSize(i3));
        frameLayout.setLayoutParams(marginLayoutParams);
    }

    public final C005602k A05(C37921px r5) {
        int i2;
        RecyclerView recyclerView;
        AnonymousClass26d r2 = this.A03;
        int i3 = 0;
        while (true) {
            List list = r2.A0E;
            if (i2 >= list.size()) {
                break;
            } else if (!r5.A0U.equals(((C37921px) list.get(i2)).A0U)) {
                i3 = i2 + 1;
            } else if (i2 >= 0) {
                recyclerView = this.A0U;
            }
        }
        C50042Xk r22 = this.A04;
        i2 = 0;
        while (true) {
            List list2 = r22.A0E;
            if (i2 >= list2.size()) {
                return null;
            }
            if (!r5.A0U.equals(((C37921px) list2.get(i2)).A0U)) {
                i2++;
            } else if (i2 < 0) {
                return null;
            } else {
                recyclerView = this.A0T;
            }
        }
        return recyclerView.A0D(i2);
    }

    public final void A06() {
        View view = this.A0J;
        RecyclerView recyclerView = this.A0T;
        int i2 = 0;
        int i3 = 8;
        if (recyclerView.canScrollHorizontally(-1)) {
            i3 = 0;
        }
        view.setVisibility(i3);
        View view2 = this.A0L;
        if (!recyclerView.canScrollHorizontally(1)) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4.A0U.canScrollVertically(-1) == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r4 = this;
            android.view.View r2 = r4.A0M
            boolean r0 = r4.A0G
            r3 = 0
            if (r0 != 0) goto L_0x0011
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0U
            r0 = -1
            boolean r1 = r1.canScrollVertically(r0)
            r0 = 0
            if (r1 != 0) goto L_0x0013
        L_0x0011:
            r0 = 8
        L_0x0013:
            r2.setVisibility(r0)
            android.view.View r2 = r4.A0I
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x0029
            androidx.recyclerview.widget.RecyclerView r1 = r4.A0U
            r0 = 1
            boolean r0 = r1.canScrollVertically(r0)
            if (r0 == 0) goto L_0x0029
        L_0x0025:
            r2.setVisibility(r3)
            return
        L_0x0029:
            r3 = 8
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callgrid.view.CallGrid.A07():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x028b, code lost:
        if (r2.A06.A0U.equals(r3.A0U) != false) goto L_0x028d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0184  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.util.List r12, boolean r13) {
        /*
            r11 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r12)
            r6 = 0
            r4 = r6
            r3 = r6
            r2 = 0
        L_0x0009:
            int r0 = r5.size()
            if (r2 >= r0) goto L_0x0022
            java.lang.Object r1 = r5.get(r2)
            X.1px r1 = (X.C37921px) r1
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x001a
            r3 = r1
        L_0x001a:
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x001f
            r4 = r1
        L_0x001f:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0022:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0044
            com.obwhatsapp.calling.callgrid.view.CallGridLayoutManager r0 = r11.A0Y
            int r2 = r0.A06
            int r1 = r5.size()
            boolean r0 = r11.A0E
            int r0 = X.C89574cT.A01(r1, r0)
            if (r2 != r0) goto L_0x0044
            com.obwhatsapp.calling.callgrid.view.FocusViewContainer r0 = r11.A0a
            X.26E r0 = r0.A05
            if (r0 == 0) goto L_0x0271
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0271
        L_0x0044:
            androidx.recyclerview.widget.RecyclerView r2 = r11.A0U
            r2.setItemAnimator(r6)
            if (r4 == 0) goto L_0x0294
            com.obwhatsapp.calling.callgrid.view.PipViewContainer r8 = r11.A0b
            com.whatsapp.jid.UserJid r7 = r4.A0U
            X.26E r1 = r8.A04
            if (r1 == 0) goto L_0x0259
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0259
            X.1px r0 = r1.A06
            com.whatsapp.jid.UserJid r0 = r0.A0U
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0259
            android.graphics.Rect r7 = r8.getGlobalVisibleRect()
        L_0x0067:
            if (r3 == 0) goto L_0x01db
            r5.remove(r3)
            if (r4 == 0) goto L_0x018d
            com.whatsapp.jid.UserJid r1 = r3.A0U
            com.whatsapp.jid.UserJid r0 = r4.A0U
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x018d
            com.obwhatsapp.calling.callgrid.view.PipViewContainer r3 = r11.A0b
            r0 = 8
            r3.setVisibility(r0)
            android.animation.ValueAnimator r0 = r3.A00
            if (r0 == 0) goto L_0x008e
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x008e
            android.animation.ValueAnimator r0 = r3.A00
            r0.cancel()
        L_0x008e:
            X.26E r1 = r3.A04
            if (r1 == 0) goto L_0x009b
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x009b
            r1.A08()
        L_0x009b:
            r3.A04 = r6
            r3.removeAllViews()
        L_0x00a0:
            X.02k r0 = r11.A05(r4)
            if (r0 == 0) goto L_0x00ab
            X.26E r0 = (X.AnonymousClass26E) r0
            r0.A08()
        L_0x00ab:
            com.obwhatsapp.calling.callgrid.view.FocusViewContainer r6 = r11.A0a
            r3 = 8
            X.26E r1 = r6.A05
            if (r1 == 0) goto L_0x00d4
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x00d4
            X.1px r0 = r1.A06
            com.whatsapp.jid.UserJid r1 = r4.A0U
            com.whatsapp.jid.UserJid r0 = r0.A0U
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00cf
            boolean r1 = r4.A07
            X.26E r0 = r6.A05
            X.1px r0 = r0.A06
            boolean r0 = r0.A07
            if (r1 == r0) goto L_0x010a
        L_0x00cf:
            X.26E r0 = r6.A05
            r0.A08()
        L_0x00d4:
            android.widget.FrameLayout r9 = r6.A01
            r9.removeAllViews()
            X.26d r8 = r6.A04
            boolean r1 = r4.A07
            r0 = 2
            if (r1 == 0) goto L_0x00e1
            r0 = 6
        L_0x00e1:
            X.02k r1 = r8.A00(r6, r0)
            X.26E r1 = (X.AnonymousClass26E) r1
            r6.A05 = r1
            boolean r0 = r1 instanceof X.AnonymousClass26F
            if (r0 == 0) goto L_0x00f2
            X.26F r1 = (X.AnonymousClass26F) r1
            r1.A0H()
        L_0x00f2:
            X.26E r0 = r6.A05
            android.view.View r1 = r0.A0H
            int r0 = r4.hashCode()
            r1.setId(r0)
            X.26E r0 = r6.A05
            android.view.View r8 = r0.A0H
            r1 = -1
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r1, r1)
            r9.addView(r8, r0)
        L_0x010a:
            X.26E r0 = r6.A05
            if (r0 == 0) goto L_0x0111
            r0.A0G(r4)
        L_0x0111:
            boolean r0 = r4.A0E
            com.obwhatsapp.WaTextView r8 = r6.A03
            if (r0 == 0) goto L_0x0184
            android.content.Context r1 = r8.getContext()
            r0 = 2131893160(0x7f121ba8, float:1.9421089E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0122:
            r8.setText(r0)
            int r0 = r6.getVisibility()
            if (r0 == r3) goto L_0x012f
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x0151
        L_0x012f:
            android.view.ViewPropertyAnimator r0 = r6.animate()
            r0.cancel()
            r0 = 0
            r6.setVisibility(r0)
            int r0 = r7.width()
            if (r0 == 0) goto L_0x0151
            int r0 = r7.height()
            if (r0 == 0) goto L_0x0151
            android.widget.FrameLayout r3 = r6.A01
            r1 = 0
            com.facebook.redex.IDxCListenerShape83S0200000_1_I0 r0 = new com.facebook.redex.IDxCListenerShape83S0200000_1_I0
            r0.<init>(r7, r1, r6)
            r3.addOnLayoutChangeListener(r0)
        L_0x0151:
            if (r13 != 0) goto L_0x029b
            X.02W r0 = r2.getLayoutManager()
            if (r0 == 0) goto L_0x015f
            android.os.Parcelable r0 = r0.A0f()
            r11.A00 = r0
        L_0x015f:
            X.26d r0 = r11.A03
            r0.A0L(r5)
            boolean r0 = r11.A0H
            if (r0 == 0) goto L_0x0176
            r2.A0N()
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A05
            if (r0 == 0) goto L_0x0176
            X.2OJ r1 = r0.A0U
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.A0B(r0)
        L_0x0176:
            android.os.Parcelable r1 = r11.A00
            if (r1 == 0) goto L_0x0183
            X.02W r0 = r2.getLayoutManager()
            if (r0 == 0) goto L_0x0183
            r0.A0p(r1)
        L_0x0183:
            return
        L_0x0184:
            X.0sP r1 = r6.A07
            X.0sH r0 = r4.A0T
            java.lang.String r0 = r1.A08(r0)
            goto L_0x0122
        L_0x018d:
            X.02k r0 = r11.A05(r3)
            if (r0 == 0) goto L_0x0198
            X.26E r0 = (X.AnonymousClass26E) r0
            r0.A08()
        L_0x0198:
            com.obwhatsapp.calling.callgrid.view.PipViewContainer r8 = r11.A0b
            r0 = 0
            r8.setVisibility(r0)
            X.26E r10 = r8.A04
            if (r10 == 0) goto L_0x01d7
            boolean r9 = r8.A0A
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x01d1
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x01d1
            r1 = 1
        L_0x01ad:
            int r0 = r10.A02
            if (r1 != r0) goto L_0x01d7
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x01cb
            X.1px r0 = r10.A06
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.jid.UserJid r1 = r3.A0U
            com.whatsapp.jid.UserJid r0 = r0.A0U
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01cb
            X.26E r0 = r8.A04
            r0.A08()
        L_0x01cb:
            X.26E r0 = r8.A04
            r0.A0G(r3)
            goto L_0x0203
        L_0x01d1:
            r1 = 7
            if (r9 == 0) goto L_0x01ad
            r1 = 8
            goto L_0x01ad
        L_0x01d7:
            r8.A04(r3)
            goto L_0x0203
        L_0x01db:
            com.obwhatsapp.calling.callgrid.view.PipViewContainer r3 = r11.A0b
            r0 = 8
            r3.setVisibility(r0)
            android.animation.ValueAnimator r0 = r3.A00
            if (r0 == 0) goto L_0x01f1
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x01f1
            android.animation.ValueAnimator r0 = r3.A00
            r0.cancel()
        L_0x01f1:
            X.26E r1 = r3.A04
            if (r1 == 0) goto L_0x01fe
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x01fe
            r1.A08()
        L_0x01fe:
            r3.A04 = r6
            r3.removeAllViews()
        L_0x0203:
            if (r4 != 0) goto L_0x00a0
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r11.A05
            X.027 r0 = r0.A08
            java.lang.Object r0 = r0.A01()
            if (r0 != 0) goto L_0x0151
            com.obwhatsapp.calling.callgrid.view.FocusViewContainer r4 = r11.A0a
            r3 = 8
            X.26E r1 = r4.A05
            if (r1 == 0) goto L_0x0220
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0220
            r1.A08()
        L_0x0220:
            r4.A05 = r6
            android.widget.FrameLayout r0 = r4.A01
            r0.removeAllViews()
            android.widget.LinearLayout r0 = r4.A02
            r0.removeAllViews()
            int r0 = r4.getVisibility()
            if (r0 == r3) goto L_0x0151
            android.view.ViewPropertyAnimator r0 = r4.animate()
            r0.cancel()
            r0 = 1
            r4.A0A = r0
            android.view.ViewPropertyAnimator r1 = r4.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r3 = r1.alpha(r0)
            r0 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r1 = r3.setDuration(r0)
            com.facebook.redex.IDxLAdapterShape0S0110000_2_I0 r0 = new com.facebook.redex.IDxLAdapterShape0S0110000_2_I0
            r0.<init>(r4)
            android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
            r0.start()
            goto L_0x0151
        L_0x0259:
            X.02k r1 = r11.A05(r4)
            if (r1 == 0) goto L_0x0294
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0067
            android.view.View r0 = r1.A0H
            r0.getGlobalVisibleRect(r7)
            goto L_0x0067
        L_0x0271:
            if (r4 != 0) goto L_0x0044
            if (r3 == 0) goto L_0x028d
            com.obwhatsapp.calling.callgrid.view.PipViewContainer r0 = r11.A0b
            X.26E r2 = r0.A04
            if (r2 == 0) goto L_0x028d
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x028d
            com.whatsapp.jid.UserJid r1 = r3.A0U
            X.1px r0 = r2.A06
            com.whatsapp.jid.UserJid r0 = r0.A0U
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
        L_0x028d:
            androidx.recyclerview.widget.RecyclerView r2 = r11.A0U
            X.2rm r0 = r11.A0X
            r2.setItemAnimator(r0)
        L_0x0294:
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            goto L_0x0067
        L_0x029b:
            X.2Xk r0 = r11.A04
            r0.A0L(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.callgrid.view.CallGrid.A08(java.util.List, boolean):void");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0C;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public FocusViewContainer getFocusViewContainer() {
        return this.A0a;
    }

    public FrameLayout getLonelyState() {
        return this.A0N;
    }

    public PipViewContainer getPipViewContainer() {
        return this.A0b;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        PipViewContainer pipViewContainer = this.A0b;
        pipViewContainer.A01 = new Point(i2, i3);
        if (pipViewContainer.isLayoutRequested()) {
            pipViewContainer.post(new RunnableRunnableShape4S0100000_I0_3(pipViewContainer, 44));
        } else {
            pipViewContainer.A02();
        }
        int measuredHeight = (int) (0.04d * ((double) getMeasuredHeight()));
        StringBuilder sb = new StringBuilder("CallGrid/onSizeChanged, scrolling peek height: ");
        sb.append(measuredHeight);
        Log.i(sb.toString());
        View view = this.A0M;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        View view2 = this.A0I;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams.height = measuredHeight;
        layoutParams2.height = measuredHeight;
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public void setCallGridListener(AnonymousClass5MW r1) {
        this.A02 = r1;
    }
}
