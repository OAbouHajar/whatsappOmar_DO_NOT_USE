package com.whatsapp.voipcalling;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass01X;
import X.AnonymousClass02C;
import X.AnonymousClass050;
import X.AnonymousClass090;
import X.AnonymousClass0LL;
import X.AnonymousClass1OL;
import X.AnonymousClass1ZH;
import X.AnonymousClass2JP;
import X.AnonymousClass2PE;
import X.AnonymousClass2Tr;
import X.AnonymousClass3CD;
import X.AnonymousClass3D1;
import X.AnonymousClass3NB;
import X.AnonymousClass4FS;
import X.AnonymousClass4SA;
import X.C001000l;
import X.C001500q;
import X.C004601z;
import X.C005502j;
import X.C006602z;
import X.C101164wp;
import X.C14710pd;
import X.C14750ph;
import X.C15860rz;
import X.C16000sG;
import X.C16080sP;
import X.C17240ul;
import X.C19380yL;
import X.C216014s;
import X.C23111An;
import X.C30341cC;
import X.C45902Bo;
import X.C49582Tw;
import X.C49592Tx;
import X.C52302dW;
import X.C62043Bk;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape246S0100000_2_I0;
import com.google.android.material.button.MaterialButton;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.obwhatsapp.calling.controls.viewmodel.BottomSheetViewModel;
import com.obwhatsapp.calling.controls.viewmodel.CallControlButtonsViewModel;
import com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantView;
import com.obwhatsapp.calling.videoparticipant.VideoCallParticipantViewLayout;
import com.obwhatsapp.calling.views.VoipCallControlBottomSheetDragIndicator;
import com.obwhatsapp.calling.views.VoipCallFooter;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class VoipCallControlBottomSheetV2 extends Hilt_VoipCallControlBottomSheetV2 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public FrameLayout A0B;
    public NestedScrollView A0C;
    public RecyclerView A0D;
    public MaterialButton A0E;
    public MaterialButton A0F;
    public AnonymousClass1OL A0G;
    public AnonymousClass2Tr A0H;
    public C49582Tw A0I;
    public BottomSheetViewModel A0J;
    public CallControlButtonsViewModel A0K;
    public ParticipantsListViewModel A0L;
    public C49592Tx A0M;
    public C23111An A0N;
    public VoipCallControlBottomSheetDragIndicator A0O;
    public VoipCallFooter A0P;
    public C16000sG A0Q;
    public C16080sP A0R;
    public AnonymousClass01V A0S;
    public C19380yL A0T;
    public C15860rz A0U;
    public AnonymousClass013 A0V;
    public C14710pd A0W;
    public C17240ul A0X;
    public C216014s A0Y;
    public AnonymousClass2PE A0Z;
    public boolean A0a;
    public boolean A0b;

    public static /* synthetic */ int A01(VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        C001000l A0C2;
        if (Build.VERSION.SDK_INT >= 24 && (A0C2 = voipCallControlBottomSheetV2.A0C()) != null && A0C2.isInMultiWindowMode()) {
            return 0;
        }
        int identifier = voipCallControlBottomSheetV2.A03().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return voipCallControlBottomSheetV2.A03().getDimensionPixelSize(identifier);
        }
        return 25;
    }

    public static VoipCallControlBottomSheetV2 A02(boolean z2) {
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = new VoipCallControlBottomSheetV2();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_video_call", z2);
        voipCallControlBottomSheetV2.A0T(bundle);
        return voipCallControlBottomSheetV2;
    }

    public static /* synthetic */ void A03(DialogInterface dialogInterface, VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2) {
        VoipActivityV2 voipActivityV2;
        CallInfo A3B;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV22 = voipCallControlBottomSheetV2;
        AnonymousClass2PE r0 = voipCallControlBottomSheetV2.A0Z;
        if (!(r0 == null || (A3B = voipActivityV2.A3B()) == null || A3B.callState == CallState.LINK)) {
            UserJid peerJid = A3B.getPeerJid();
            AnonymousClass00B.A06(peerJid);
            boolean z2 = A3B.videoEnabled;
            int i2 = -1;
            if (A3B.isPeerRequestingUpgrade()) {
                i2 = 2;
            }
            (voipActivityV2 = r0.A00).A42(peerJid, i2, z2);
        }
        View view = voipCallControlBottomSheetV2.A0A;
        AnonymousClass00B.A04(view);
        view.setVisibility(0);
        Dialog dialog = (Dialog) dialogInterface;
        View A002 = AnonymousClass0LL.A00(dialog, R.id.design_bottom_sheet);
        voipCallControlBottomSheetV2.A07 = A002;
        voipCallControlBottomSheetV2.A0H = new AnonymousClass2Tr(A002, voipCallControlBottomSheetV2.A09, voipCallControlBottomSheetV2.A0U, voipCallControlBottomSheetV2.A0W, voipCallControlBottomSheetV22);
        voipCallControlBottomSheetV2.A0M.Add(voipCallControlBottomSheetV2.A07);
        voipCallControlBottomSheetV2.A0M.AAL().A0A(voipCallControlBottomSheetV2, new IDxObserverShape113S0100000_1_I0(voipCallControlBottomSheetV2, 70));
        voipCallControlBottomSheetV2.A07.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(voipCallControlBottomSheetV2.A0M, 34));
        voipCallControlBottomSheetV2.A0L.A04.A0A(voipCallControlBottomSheetV2, new IDxObserverShape115S0100000_2_I0((Object) voipCallControlBottomSheetV2, 311));
        voipCallControlBottomSheetV2.A0J.A06.A0A(voipCallControlBottomSheetV2, new IDxObserverShape115S0100000_2_I0((Object) voipCallControlBottomSheetV2, 313));
        voipCallControlBottomSheetV2.A0J.A0B.A0A(voipCallControlBottomSheetV2, new IDxObserverShape113S0100000_1_I0(voipCallControlBottomSheetV2, 67));
        voipCallControlBottomSheetV2.A0J.A0C.A0A(voipCallControlBottomSheetV2, new IDxObserverShape113S0100000_1_I0(voipCallControlBottomSheetV2, 68));
        voipCallControlBottomSheetV2.A0J.A03.A0A(voipCallControlBottomSheetV2, new IDxObserverShape115S0100000_2_I0((Object) voipCallControlBottomSheetV2, 310));
        voipCallControlBottomSheetV2.A0J.A05.A0A(voipCallControlBottomSheetV2, new IDxObserverShape115S0100000_2_I0((Object) voipCallControlBottomSheetV2, 309));
        voipCallControlBottomSheetV2.A0J.A04.A0A(voipCallControlBottomSheetV2, new IDxObserverShape115S0100000_2_I0((Object) voipCallControlBottomSheetV2.A0H, 312));
        voipCallControlBottomSheetV2.A0K.A01.A0A(voipCallControlBottomSheetV2, new IDxObserverShape113S0100000_1_I0(voipCallControlBottomSheetV2, 69));
        AnonymousClass0LL.A00(dialog, R.id.touch_outside).setOnTouchListener(new AnonymousClass3D1(voipCallControlBottomSheetV2));
        if (Build.VERSION.SDK_INT >= 21) {
            voipCallControlBottomSheetV2.A1L();
        }
        AnonymousClass2PE r02 = voipCallControlBottomSheetV2.A0Z;
        CallInfo A3B2 = r02 != null ? r02.A00.A3B() : null;
        AnonymousClass2PE r1 = voipCallControlBottomSheetV2.A0Z;
        if (r1 != null) {
            r1.A00(true);
        }
        if (A3B2 != null) {
            voipCallControlBottomSheetV2.A0N.A02(A3B2.callId, "voip_call_control_bottom_sheet_onshown");
        }
    }

    public void A0k() {
        super.A0k();
        Log.i("voip/VoipCallControlBottomSheetV2 onDetach");
        this.A0b = false;
        RecyclerView recyclerView = this.A0D;
        if (recyclerView != null) {
            recyclerView.setAdapter((AnonymousClass01X) null);
        }
        this.A0H = null;
        this.A07 = null;
        this.A0Z = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Resources.Theme theme = A1A().getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.attr0579, typedValue, true);
        this.A05 = typedValue.data;
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(R.attr.attr0578, typedValue2, true);
        this.A04 = typedValue2.data;
        TypedValue typedValue3 = new TypedValue();
        theme.resolveAttribute(R.attr.attr0577, typedValue3, true);
        this.A01 = typedValue3.getFloat();
        TypedValue typedValue4 = new TypedValue();
        theme.resolveAttribute(R.attr.attr0576, typedValue4, true);
        this.A03 = typedValue4.data;
        TypedValue typedValue5 = new TypedValue();
        theme.resolveAttribute(R.attr.attr0575, typedValue5, true);
        this.A00 = typedValue5.getFloat();
        Context context = A1A().getContext();
        boolean z2 = this.A0a;
        int i2 = R.color.color05d2;
        if (z2) {
            i2 = R.color.color05d5;
        }
        this.A06 = AnonymousClass00T.A00(context, i2);
        View inflate = layoutInflater.inflate(R.layout.layout05f0, viewGroup, false);
        others.set_VoipCallBottomSheetBK(inflate);
        AnonymousClass00B.A04(inflate);
        this.A0A = inflate;
        this.A09 = C004601z.A0E(inflate, R.id.call_upgrade_row);
        Dialog dialog = this.A03;
        AnonymousClass00B.A06(dialog);
        dialog.setOnShowListener(new IDxSListenerShape246S0100000_2_I0(this, 4));
        this.A03.setOnKeyListener(new AnonymousClass3CD(this));
        Window window = this.A03.getWindow();
        if (window != null) {
            window.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
            window.setDimAmount(0.0f);
            if (AnonymousClass2JP.A06(this.A0S.A0P())) {
                window.addFlags(8);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                AnonymousClass2PE r0 = this.A0Z;
                CallInfo A3B = r0 != null ? r0.A00.A3B() : null;
                int A002 = AnonymousClass00T.A00(this.A03.getContext(), R.color.color0792);
                window.setNavigationBarColor((A3B == null || !A3B.videoEnabled) ? AnonymousClass00T.A00(this.A03.getContext(), R.color.color07e2) : this.A06);
            }
        }
        this.A0D = (RecyclerView) C004601z.A0E(this.A0A, R.id.participant_list);
        this.A0C = (NestedScrollView) C004601z.A0E(this.A0A, R.id.participant_list_nested_scroll_view);
        C004601z.A0d(this.A0D, 2);
        RecyclerView recyclerView = this.A0D;
        A0u();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.A0D.setAdapter(this.A0I);
        this.A0D.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 35));
        View.OnClickListener onClickListener = null;
        this.A0D.setItemAnimator((C005502j) null);
        VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator = (VoipCallControlBottomSheetDragIndicator) C004601z.A0E(this.A0A, R.id.call_controls_sheet_drag_indicator);
        this.A0O = voipCallControlBottomSheetDragIndicator;
        voipCallControlBottomSheetDragIndicator.setOnClickListener(new C101164wp(this));
        View A0E2 = C004601z.A0E(this.A09, R.id.upgrade_cancel);
        AnonymousClass2PE r02 = this.A0Z;
        if (r02 != null) {
            onClickListener = r02.A00.A0H;
        }
        A0E2.setOnClickListener(onClickListener);
        C62043Bk.A04(A0E2, A0J(R.string.str0394), A0J(R.string.str1ab3));
        this.A0B = (FrameLayout) C004601z.A0E(this.A0A, R.id.call_controls_btns_container);
        this.A08 = C004601z.A0E(this.A0A, R.id.call_control_buttons_guideline);
        this.A0B.setFocusable(true);
        this.A0B.setTag(0);
        this.A0A.setVisibility(8);
        return this.A0A;
    }

    public void A16(Context context) {
        CallInfo A3B;
        super.A16(context);
        Log.i("voip/VoipCallControlBottomSheetV2 onAttach");
        try {
            this.A02 = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            VoipActivityV2 voipActivityV2 = (VoipActivityV2) ((AnonymousClass1ZH) context);
            AnonymousClass2PE r0 = voipActivityV2.A1c;
            if (r0 == null) {
                r0 = new AnonymousClass2PE(voipActivityV2);
                voipActivityV2.A1c = r0;
            }
            this.A0Z = r0;
            C001500q r2 = (C001500q) context;
            ParticipantsListViewModel participantsListViewModel = (ParticipantsListViewModel) new C006602z(r2).A01(ParticipantsListViewModel.class);
            this.A0L = participantsListViewModel;
            participantsListViewModel.A01 = this.A0Z;
            this.A0J = (BottomSheetViewModel) new C006602z(r2).A01(BottomSheetViewModel.class);
            this.A0K = (CallControlButtonsViewModel) new C006602z(r2).A01(CallControlButtonsViewModel.class);
            C49582Tw r1 = this.A0I;
            r1.A0B = new AnonymousClass4FS(this);
            r1.A02 = this.A0L;
            AnonymousClass2PE r02 = this.A0Z;
            if (r02 != null && (A3B = r02.A00.A3B()) != null) {
                this.A0N.A02(A3B.callId, "voip_call_control_bottom_sheet_onattach");
            }
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context);
            sb.append(" must implement VoipCallControlBottomSheet$HostProvider");
            throw new ClassCastException(sb.toString());
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        this.A0a = C30341cC.A0M(this.A0U, this.A0W);
        Bundle bundle2 = this.A05;
        boolean z2 = false;
        if (bundle2 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Arguments must not be null", z2);
        if (bundle2 != null) {
            boolean z3 = bundle2.getBoolean("is_video_call", false);
            int i2 = R.style.style0396;
            if (z3) {
                i2 = R.style.style0395;
            }
            A1E(0, i2);
        }
    }

    public void A1G(AnonymousClass02C r4, String str) {
        CallGridViewModel callGridViewModel;
        AnonymousClass2PE r0 = this.A0Z;
        if (r0 != null) {
            VoipActivityV2 voipActivityV2 = r0.A00;
            if (!(!voipActivityV2.A22 && voipActivityV2.A1L == null && ((callGridViewModel = voipActivityV2.A0t) == null || callGridViewModel.A08.A01() == null))) {
                Log.i("voip/VoipCallControlBottomSheetV2 bottom sheet action is disabled");
                return;
            }
        }
        if (this.A0b) {
            Log.i("voip/VoipCallControlBottomSheetV2 show after attached");
            AnonymousClass2Tr r02 = this.A0H;
            if (r02 != null && r02.A09()) {
                Dialog dialog = this.A03;
                if (!(dialog == null || dialog.getWindow() == null)) {
                    View decorView = this.A03.getWindow().getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
                }
                this.A0H.A02(4);
                this.A0H.A06(true);
                return;
            }
            return;
        }
        this.A0b = true;
        Log.i("voip/VoipCallControlBottomSheetV2 attaching bottom sheet");
        AnonymousClass01A A0B2 = r4.A0B(str);
        AnonymousClass050 r03 = new AnonymousClass050(r4);
        if (A0B2 != null) {
            r03.A07(A0B2);
        }
        r03.A0C(this, str);
        r03.A04();
    }

    public final void A1L() {
        View view = this.A07;
        if (view != null && view.getContext() != null) {
            View view2 = this.A07;
            view2.setElevation(view2.getContext().getResources().getDimension(R.dimen.dimen0100));
            this.A07.setClipToOutline(true);
            this.A07.setOutlineProvider(new AnonymousClass3NB(this));
        }
    }

    public final void A1M() {
        Dialog dialog = this.A03;
        if (dialog != null && dialog.getWindow() != null) {
            View decorView = this.A03.getWindow().getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 256 | 4);
        }
    }

    public final void A1N() {
        AnonymousClass2Tr r1;
        int i2;
        boolean z2;
        AnonymousClass2Tr r12 = this.A0H;
        if (r12 != null) {
            if (r12.A08()) {
                z2 = false;
            } else if (!r12.A0F.A0J) {
                return;
            } else {
                if (r12.A09()) {
                    Dialog dialog = this.A03;
                    if (!(dialog == null || dialog.getWindow() == null)) {
                        View decorView = this.A03.getWindow().getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -5);
                    }
                    r12 = this.A0H;
                    z2 = true;
                } else {
                    A1M();
                    r1 = this.A0H;
                    if (r1.A0F.A0J) {
                        i2 = 5;
                        r1.A02(i2);
                    }
                    return;
                }
            }
            r12.A06(z2);
            r1 = this.A0H;
            i2 = 4;
            r1.A02(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r0 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1O(float r6) {
        /*
            r5 = this;
            X.2Tr r1 = r5.A0H
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000f
            boolean r0 = r1.A06
            if (r0 == 0) goto L_0x000f
            boolean r0 = r1.A08
            r1 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            android.app.Dialog r0 = r5.A03
            if (r0 == 0) goto L_0x004a
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x004e
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            com.obwhatsapp.calling.controls.viewmodel.BottomSheetViewModel r0 = r5.A0J
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x004e
        L_0x0027:
            android.app.Dialog r0 = r5.A03
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r4 == 0) goto L_0x0047
            boolean r0 = r5.A1T()
            if (r0 == 0) goto L_0x004b
            float r1 = r5.A01
        L_0x003f:
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            float r1 = r1 * r6
            int r3 = java.lang.Math.round(r1)
        L_0x0047:
            r2.setAlpha(r3)
        L_0x004a:
            return
        L_0x004b:
            float r1 = r5.A00
            goto L_0x003f
        L_0x004e:
            r4 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A1O(float):void");
    }

    public final void A1P(float f2) {
        BottomSheetViewModel bottomSheetViewModel;
        Dialog dialog;
        Window window;
        if (Build.VERSION.SDK_INT >= 21 && this.A0a && (bottomSheetViewModel = this.A0J) != null && bottomSheetViewModel.A02 && (dialog = this.A03) != null && (window = dialog.getWindow()) != null) {
            window.setNavigationBarColor(AnonymousClass090.A06(this.A06, (int) (f2 * 255.0f)));
        }
    }

    public final void A1Q(int i2) {
        CallInfo A3B;
        AnonymousClass2PE r0 = this.A0Z;
        if (r0 == null || (A3B = r0.A00.A3B()) == null || this.A0Z == null || A0u() == null) {
            Log.w("voip/VoipCallControlBottomSheetV2/failed to get call info when build call action intent");
            return;
        }
        boolean equals = "com.obwhatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN".equals(this.A0Z.A00.getIntent().getAction());
        Intent intent = null;
        if (i2 != 0) {
            Context A0u = A0u();
            if (i2 != 1) {
                intent = new Intent();
                intent.setClassName(A0u.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
                intent.setAction("com.obwhatsapp.intent.action.JOIN_CALL_LINK");
                intent.putExtra("isTaskRoot", false);
            } else {
                String str = A3B.callId;
                intent = new Intent();
                intent.setClassName(A0u.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
                intent.setAction("com.obwhatsapp.intent.action.REJECT_CALL_FROM_VOIP_UI");
                intent.putExtra("pendingCall", equals);
                intent.putExtra("call_id", str);
            }
            intent.setFlags(268435456);
        } else {
            ConnectivityManager A0H2 = this.A0S.A0H();
            NetworkInfo activeNetworkInfo = A0H2 != null ? A0H2.getActiveNetworkInfo() : null;
            int i3 = 7;
            if (!A3B.isCallFull()) {
                i3 = 3;
                if (activeNetworkInfo != null) {
                    int i4 = 3;
                    if (equals) {
                        i4 = 10;
                    }
                    intent = new C14750ph().A11(A0u(), A3B.callId, i4, true);
                }
            }
            VoipErrorDialogFragment A022 = VoipErrorDialogFragment.A02(new C52302dW(), i3);
            C001000l A0C2 = A0C();
            if (A0C2 != null) {
                A022.A1G(A0C2.AGM(), (String) null);
            }
        }
        this.A0T.A03(27, A3B.callId);
        C001000l A0C3 = A0C();
        if (A0C3 != null && intent != null) {
            A0C3.startActivity(intent);
        }
    }

    public void A1R(int i2, float f2) {
        View view;
        float f3 = f2;
        AnonymousClass2PE r1 = this.A0Z;
        if (r1 != null) {
            float f4 = 0.0f;
            if (f2 <= 0.0f) {
                VoipActivityV2 voipActivityV2 = r1.A00;
                f4 = ((float) voipActivityV2.A0R.getHeight()) * f2;
                int i3 = i2;
                if (!voipActivityV2.A20) {
                    VideoCallParticipantViewLayout videoCallParticipantViewLayout = voipActivityV2.A17;
                    int translationY = videoCallParticipantViewLayout.A0M ? i3 : (int) (f4 - voipActivityV2.A0R.getTranslationY());
                    VideoCallParticipantView videoCallParticipantView = videoCallParticipantViewLayout.A0Q;
                    if (videoCallParticipantView.A03 == 1) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) videoCallParticipantView.getLayoutParams();
                        StringBuilder sb = new StringBuilder("VideoCallParticipantViewLayout/movePiPViewWithOutAnimation xOffset: ");
                        sb.append(0);
                        sb.append(", yOffset: ");
                        sb.append(translationY);
                        Log.i(sb.toString());
                        AnonymousClass013 r12 = videoCallParticipantViewLayout.A0H;
                        C45902Bo.A09(videoCallParticipantView, r12, r12.A0T() ^ true ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin, marginLayoutParams.topMargin, r12.A0T() ^ true ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin, marginLayoutParams.bottomMargin);
                        marginLayoutParams.topMargin += translationY;
                        videoCallParticipantView.setLayoutParams(marginLayoutParams);
                    }
                } else if (voipActivityV2.A1m) {
                    voipActivityV2.A3d(f3);
                } else if (voipActivityV2.A01 == 3) {
                    AnonymousClass4SA r0 = voipActivityV2.A0r;
                    r0.A01 = f3;
                    r0.A00();
                }
                VoipInCallNotifBanner voipInCallNotifBanner = voipActivityV2.A0s;
                if (voipInCallNotifBanner != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) voipInCallNotifBanner.getLayoutParams();
                    StringBuilder sb2 = new StringBuilder("VoipCallNewParticipantBanner/moveBannerYPosition yOffset: ");
                    sb2.append(i3);
                    Log.i(sb2.toString());
                    marginLayoutParams2.bottomMargin -= i2;
                    voipInCallNotifBanner.setLayoutParams(marginLayoutParams2);
                }
                view = voipActivityV2.A0R;
            } else {
                view = r1.A00.A0R;
            }
            view.setTranslationY(f4);
        }
        A1P(Math.min(1.0f, Math.max(0.0f, (f2 + 1.0f) / 0.7f)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.A0H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1S() {
        /*
            r2 = this;
            boolean r0 = r2.A0b
            if (r0 == 0) goto L_0x000f
            X.2Tr r0 = r2.A0H
            if (r0 == 0) goto L_0x000f
            boolean r1 = r0.A08()
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A1S():boolean");
    }

    public boolean A1T() {
        BottomSheetViewModel bottomSheetViewModel = this.A0J;
        return bottomSheetViewModel != null && ((Boolean) bottomSheetViewModel.A0B.A01()).booleanValue();
    }

    public boolean A1U() {
        AnonymousClass2Tr r1;
        int i2;
        if (!this.A0b || (r1 = this.A0H) == null) {
            return false;
        }
        if (r1.A08 || (i2 = r1.A02) == 0) {
            i2 = r1.A0F.A0B;
        }
        return i2 == 2 || i2 == 1;
    }

    public boolean A1V() {
        int A19 = A19();
        return A19 != 0 ? A19 == R.style.style0395 : this.A05.getBoolean("is_video_call", false);
    }
}
