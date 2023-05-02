package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass01Y;
import X.AnonymousClass04N;
import X.AnonymousClass1KR;
import X.AnonymousClass1US;
import X.AnonymousClass1Vt;
import X.AnonymousClass1W2;
import X.AnonymousClass1WN;
import X.AnonymousClass1yL;
import X.AnonymousClass1yP;
import X.AnonymousClass22J;
import X.AnonymousClass22N;
import X.AnonymousClass22O;
import X.AnonymousClass29C;
import X.AnonymousClass2S7;
import X.AnonymousClass2r2;
import X.AnonymousClass31E;
import X.AnonymousClass3BG;
import X.AnonymousClass3SZ;
import X.AnonymousClass477;
import X.AnonymousClass4HJ;
import X.AnonymousClass4K6;
import X.AnonymousClass4ML;
import X.AnonymousClass4PT;
import X.AnonymousClass4Q9;
import X.AnonymousClass5P4;
import X.AnonymousClass5ST;
import X.AnonymousClass5T6;
import X.C001000l;
import X.C13680ns;
import X.C13690nt;
import X.C14550pN;
import X.C14570pP;
import X.C14600pS;
import X.C14750ph;
import X.C15830rv;
import X.C15860rz;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16740tZ;
import X.C18090w8;
import X.C18890xQ;
import X.C19840z5;
import X.C19980zJ;
import X.C227919h;
import X.C28381Vw;
import X.C30011bb;
import X.C30341cC;
import X.C30511cT;
import X.C32241fu;
import X.C35021lF;
import X.C35361lo;
import X.C35421lu;
import X.C35651mH;
import X.C37831po;
import X.C37921px;
import X.C38641rB;
import X.C38771rO;
import X.C39461sW;
import X.C41261vV;
import X.C41271vW;
import X.C42821yj;
import X.C450626x;
import X.C455529g;
import X.C50082Xw;
import X.C54472hZ;
import X.C55902kd;
import X.C57002pe;
import X.C57362qz;
import X.C59852z8;
import X.C59882zE;
import X.C59892zJ;
import X.C59902zK;
import X.C602430q;
import X.C615339h;
import X.C616739v;
import X.C62583Ed;
import X.C62593Ee;
import X.C64923Se;
import X.C64953Sh;
import X.C65083Su;
import X.C71473kR;
import X.C71553kc;
import X.C71623kj;
import X.C72103lZ;
import X.C72243ln;
import X.C73183nR;
import X.C73203nT;
import X.C82684Dt;
import X.C86374Sl;
import X.C87584Xn;
import X.C93494jI;
import X.C93504jJ;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.Log;
import android.view.View;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.Conversation;
import com.obwhatsapp.IntentChooserBottomSheetDialogFragment;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.SingleSelectionDialogFragment;
import com.obwhatsapp.blocklist.UnblockDialogFragment;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet;
import com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.obwhatsapp.calling.calllink.view.CallLinkActivity;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.community.ManageGroupsInCommunityActivity;
import com.obwhatsapp.companiondevice.AndroidTabletBetaUpsellBottomSheet;
import com.obwhatsapp.companiondevice.LinkedDevicesActivity;
import com.obwhatsapp.companiondevice.LinkedDevicesDetailDialogFragment;
import com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.List;

public class ViewOnClickCListenerShape5S0200000_I1 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape5S0200000_I1(Context context, Intent intent, int i2) {
        this.A02 = i2;
        if (i2 != 0) {
            this.A00 = context;
            this.A01 = intent;
            return;
        }
        this.A00 = context;
        this.A01 = intent;
    }

    public ViewOnClickCListenerShape5S0200000_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void onClick(View view) {
        AnonymousClass29C r0;
        String A03;
        C35421lu r02;
        View view2 = view;
        switch (this.A02) {
            case 0:
                try {
                    ((Context) this.A00).startActivity((Intent) this.A01);
                    return;
                } catch (ActivityNotFoundException e2) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e2);
                    return;
                }
            case 1:
                Intent A0B = C13690nt.A0B(((C18890xQ) this.A01).A00());
                Activity activity = ((AnonymousClass2S7) this.A00).A01;
                activity.startActivity(A0B);
                activity.finish();
                return;
            case 2:
                C35021lF r4 = (C35021lF) this.A01;
                IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = ((AnonymousClass2r2) this.A00).A01;
                if (intentChooserBottomSheetDialogFragment.A06 == null) {
                    intentChooserBottomSheetDialogFragment.A0D().startActivityForResult(r4.A07, intentChooserBottomSheetDialogFragment.A00);
                } else {
                    AnonymousClass01A A08 = intentChooserBottomSheetDialogFragment.A0G().A08(intentChooserBottomSheetDialogFragment.A06.intValue());
                    AnonymousClass00B.A06(A08);
                    A08.startActivityForResult(r4.A07, intentChooserBottomSheetDialogFragment.A00);
                }
                Integer num = r4.A03;
                if (num != null) {
                    intentChooserBottomSheetDialogFragment.A05.A02(num.intValue());
                }
                intentChooserBottomSheetDialogFragment.A1C();
                return;
            case 3:
            case 4:
                ((AnonymousClass22J) this.A00).AIU(this.A01);
                return;
            case 5:
                ((C14550pN) this.A01).Afc(new AndroidTabletBetaUpsellBottomSheet());
                ((C62593Ee) this.A00).A04.A0x("android_tablet_banner_first_displayed");
                return;
            case 6:
                ((Context) this.A01).startActivity(C13680ns.A0A("https://faq.whatsapp.com/335178174377229"));
                C15860rz r2 = ((C62583Ed) this.A00).A02.A00;
                C13680ns.A1S(r2, "biz_shop_sunset_banner_clicked", C13690nt.A01(C13680ns.A0B(r2), "biz_shop_sunset_banner_clicked") + 1);
                return;
            case 9:
                try {
                    ((Context) this.A00).startActivity((Intent) this.A01);
                    return;
                } catch (ActivityNotFoundException unused) {
                    com.whatsapp.util.Log.e("BusinessComplianceAdapter/Call action feature is not supported.");
                    return;
                }
            case 10:
                Context context = view2.getContext();
                Intent A0A = C13680ns.A0A(C13680ns.A0h("mailto:", ((C71473kR) this.A01).A01));
                if (A0A.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(A0A);
                    return;
                }
                return;
            case 11:
                C71623kj r42 = (C71623kj) this.A00;
                UserJid userJid = (UserJid) this.A01;
                int A002 = r42.A00();
                if (A002 != -1) {
                    C71553kc r22 = (C71553kc) ((C50082Xw) r42.A06.A00.get(A002));
                    AnonymousClass4K6 AAj = r42.A05.AAj(A002);
                    View view3 = r42.A0H;
                    r42.A01.A09(C19980zJ.A02(view3), C14750ph.A0Y(view3.getContext(), userJid, (Integer) null, (Integer) null, r22.A02, r22.A00, AAj == null ? null : AAj.A01), 3000);
                    return;
                }
                return;
            case 12:
                Activity activity2 = (Activity) this.A00;
                PackageManager packageManager = activity2.getPackageManager();
                Intent A0B2 = C13690nt.A0B(((C18890xQ) this.A01).A00());
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(A0B2, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
                if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                    activity2.startActivity(A0B2);
                }
                activity2.finish();
                return;
            case 13:
                C615339h r23 = (C615339h) this.A00;
                C72243ln r3 = (C72243ln) this.A01;
                View view4 = r23.A03;
                AnonymousClass1US r03 = r3.A08;
                C19840z5 r43 = r23.A0I;
                Activity A022 = C19980zJ.A02(view4);
                C16000sG r6 = r43.A01;
                String str = r03.A0B;
                C16010sH A003 = C16000sG.A00(r6, C15830rv.A02(str));
                UserJid nullable = UserJid.getNullable(str);
                AnonymousClass00B.A06(nullable);
                r43.A04.A00(new C41261vV(new C41271vW(nullable, "directory", "whatsapp", System.currentTimeMillis(), System.currentTimeMillis())));
                r43.A02.A09(C16000sG.A00(r6, C15830rv.A02(str)));
                r43.A00.A07(A022, C14750ph.A0q().A0v(A022, A003));
                r3.A05.ATh();
                return;
            case 14:
                C615339h r62 = (C615339h) this.A00;
                C72243ln r5 = (C72243ln) this.A01;
                r62.A0H.A02(r62.A03, r5.A06, r5.A07, r5.A08.A0B);
                r5.A05.AVI(r5.A0A ? C13680ns.A0Y() : null, r62.A00(r5));
                return;
            case 15:
                ((Dialog) this.A00).dismiss();
                ((AnonymousClass5ST) this.A01).AT8();
                return;
            case 16:
                ((AnonymousClass5ST) this.A00).AT6();
                ((Dialog) this.A01).dismiss();
                return;
            case 17:
                C59852z8 r52 = (C59852z8) this.A00;
                C72103lZ r44 = (C72103lZ) this.A01;
                AnonymousClass4HJ r04 = r44.A00;
                C450626x r32 = r04.A01;
                C35651mH r24 = r04.A00;
                C450626x.A00(r24, r32, 58);
                r24.A00 = System.currentTimeMillis();
                r32.A01(r24);
                r52.A06.A02(r52.A0H, (AnonymousClass5P4) null, (AnonymousClass5T6) null, r44.A03);
                return;
            case 18:
                ((C65083Su) this.A00).A00.APx(!((AnonymousClass4PT) this.A01).A00());
                return;
            case 19:
                ((C65083Su) this.A00).A00.AS2(!((AnonymousClass4PT) this.A01).A00());
                return;
            case 20:
                ((C65083Su) this.A00).A00.AUA(!((AnonymousClass4PT) this.A01).A00());
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                C37921px r1 = (C37921px) this.A01;
                AnonymousClass4Q9 r05 = ((C59882zE) this.A00).A03;
                if (r05 != null) {
                    CallGridViewModel callGridViewModel = r05.A00.A05;
                    AnonymousClass00B.A06(callGridViewModel);
                    callGridViewModel.A0F(r1);
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                C59892zJ r06 = (C59892zJ) this.A00;
                r06.A09.A01(r06.A08.A0C(), (C16010sH) this.A01, 16, true);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                C59892zJ r07 = (C59892zJ) this.A00;
                r07.A09.A01(r07.A08.A0C(), (C16010sH) this.A01, 16, false);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                C59902zK r12 = (C59902zK) this.A00;
                r12.A08.A06(r12.A07.A0D(), (C37831po) C13690nt.A0Z(Collections.unmodifiableList(((C616739v) this.A01).A04)), 3);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = (GroupCallParticipantPickerSheet) this.A00;
                PointF pointF = (PointF) this.A01;
                if (groupCallParticipantPickerSheet.A04.getVisibility() != 0 && pointF.y < groupCallParticipantPickerSheet.A03.getY()) {
                    groupCallParticipantPickerSheet.A08.A0M(5);
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                C64923Se r08 = (C64923Se) this.A00;
                r08.A05.A01(r08.A0H.getContext(), (C16010sH) this.A01, 16, false);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                C64923Se r09 = (C64923Se) this.A00;
                r09.A05.A01(r09.A0H.getContext(), (C16010sH) this.A01, 16, true);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                C15830rv r33 = (C15830rv) this.A01;
                CallsHistoryFragmentV2 callsHistoryFragmentV2 = ((C64923Se) this.A00).A04.A00;
                Context A0u = callsHistoryFragmentV2.A0u();
                if (A0u == null) {
                    com.whatsapp.util.Log.w("voip/CallsFragment no context registered to start conversation");
                    return;
                } else {
                    C54472hZ.A00(C14750ph.A0q().A0x(A0u, r33), callsHistoryFragmentV2);
                    return;
                }
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                C37831po r34 = (C37831po) this.A01;
                CallsHistoryFragmentV2 callsHistoryFragmentV22 = ((C64953Sh) this.A00).A05.A00;
                C001000l A0C = callsHistoryFragmentV22.A0C();
                if (A0C == null) {
                    com.whatsapp.util.Log.w("voip/CallsFragment no activity registered to join ongoing call");
                    return;
                } else {
                    callsHistoryFragmentV22.A0F.A06(A0C, r34, 3);
                    return;
                }
            case 30:
                CallLinkActivity callLinkActivity = (CallLinkActivity) this.A00;
                C93504jJ r010 = (C93504jJ) this.A01;
                callLinkActivity.A07.A07(callLinkActivity, r010.A05, 16, r010.A06);
                return;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                ((CallLinkActivity) this.A00).A3A((C93504jJ) this.A01);
                return;
            case 32:
                C93494jI r011 = (C93494jI) this.A01;
                ((C14550pN) this.A00).Afc(SingleSelectionDialogFragment.A02(1, r011.A04, r011.A03, r011.A05));
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                ((C73183nR) this.A00).A02.AIU(this.A01);
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                ((C73203nT) this.A00).A03.AIU(this.A01);
                return;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                ((AnonymousClass04N) this.A00).accept(this.A01);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                C39461sW r8 = (C39461sW) this.A01;
                ManageGroupsInCommunityActivity manageGroupsInCommunityActivity = ((C82684Dt) this.A00).A00;
                if (manageGroupsInCommunityActivity.AIm()) {
                    return;
                }
                if (C13690nt.A0k(manageGroupsInCommunityActivity.A07.A0o).size() <= 2) {
                    manageGroupsInCommunityActivity.Afj(new Object[]{r8.A03}, R.string.str04e7, R.string.str04e8);
                    return;
                }
                Object[] objArr = {r8.A03};
                IDxCListenerShape29S0200000_2_I1 iDxCListenerShape29S0200000_2_I1 = new IDxCListenerShape29S0200000_2_I1(r8, 6, manageGroupsInCommunityActivity);
                IDxCListenerShape23S0000000_2_I1 iDxCListenerShape23S0000000_2_I1 = new IDxCListenerShape23S0000000_2_I1(7);
                LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
                Bundle A004 = C87584Xn.A00(objArr, R.string.str0507, R.string.str0507, R.string.str0505, R.string.str0508, R.string.str0394, -1);
                C87584Xn.A01(A004, "title_params_values", "title_params_types", new Object[0]);
                legacyMessageDialogFragment.A00 = iDxCListenerShape29S0200000_2_I1;
                legacyMessageDialogFragment.A01 = iDxCListenerShape23S0000000_2_I1;
                legacyMessageDialogFragment.A0T(A004);
                C13680ns.A1J(legacyMessageDialogFragment, manageGroupsInCommunityActivity);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                LinkedDevicesActivity linkedDevicesActivity = ((AnonymousClass3SZ) this.A00).A05.A00;
                LinkedDevicesSharedViewModel linkedDevicesSharedViewModel = linkedDevicesActivity.A05;
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment = new LinkedDevicesDetailDialogFragment();
                linkedDevicesDetailDialogFragment.A0A = (AnonymousClass4ML) this.A01;
                linkedDevicesDetailDialogFragment.A04 = linkedDevicesSharedViewModel;
                linkedDevicesActivity.A04 = linkedDevicesDetailDialogFragment;
                linkedDevicesDetailDialogFragment.A00 = linkedDevicesActivity;
                C13680ns.A1J(linkedDevicesDetailDialogFragment, linkedDevicesActivity);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                LinkedDevicesActivity linkedDevicesActivity2 = ((AnonymousClass3SZ) this.A00).A05.A00;
                LinkedDevicesSharedViewModel linkedDevicesSharedViewModel2 = linkedDevicesActivity2.A05;
                LinkedDevicesDetailDialogFragment linkedDevicesDetailDialogFragment2 = new LinkedDevicesDetailDialogFragment();
                linkedDevicesDetailDialogFragment2.A07 = (AnonymousClass1WN) this.A01;
                linkedDevicesDetailDialogFragment2.A04 = linkedDevicesSharedViewModel2;
                linkedDevicesActivity2.A04 = linkedDevicesDetailDialogFragment2;
                linkedDevicesDetailDialogFragment2.A00 = linkedDevicesActivity2;
                C13680ns.A1J(linkedDevicesDetailDialogFragment2, linkedDevicesActivity2);
                return;
            case 39:
                Context context2 = (Context) this.A00;
                C32241fu A005 = C32241fu.A00(context2);
                A005.A01(R.string.str05fa);
                A005.A08((DialogInterface.OnClickListener) null, context2.getString(R.string.str0394));
                A005.setPositiveButton(R.string.str05f5, (DialogInterface.OnClickListener) this.A01);
                A005.A02(R.string.str05fb);
                A005.A00();
                return;
            case 40:
                C57362qz r25 = (C57362qz) this.A00;
                C55902kd r13 = (C55902kd) this.A01;
                if (r13.A03) {
                    r25.A00.A38(r13);
                    return;
                }
                return;
            case 41:
                C57002pe r012 = (C57002pe) this.A00;
                r012.A00();
                r012.A03.setChecked(true);
                ((StatusPrivacyBottomSheetDialogFragment) this.A01).A1N(0);
                return;
            case 42:
                C57002pe r013 = (C57002pe) this.A00;
                StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = (StatusPrivacyBottomSheetDialogFragment) this.A01;
                r013.A00();
                r013.A01.setChecked(true);
                if (statusPrivacyBottomSheetDialogFragment.A04.A01.size() == 0) {
                    statusPrivacyBottomSheetDialogFragment.A1O(false);
                    return;
                } else {
                    statusPrivacyBottomSheetDialogFragment.A1N(1);
                    return;
                }
            case 43:
                C57002pe r014 = (C57002pe) this.A00;
                r014.A00();
                r014.A02.setChecked(true);
                ((StatusPrivacyBottomSheetDialogFragment) this.A01).A1N(2);
                return;
            case 44:
                C30511cT r53 = (C30511cT) this.A00;
                Activity activity3 = (Activity) this.A01;
                activity3.startActivity(C14750ph.A0R(activity3, r53.A0G.A0E), C455529g.A05(activity3, r53.A0K.findViewById(R.id.transition_start), r53.A0O.A00(R.string.str1dd7)));
                return;
            case 45:
                C602430q r35 = (C602430q) this.A00;
                C16740tZ r26 = (C16740tZ) this.A01;
                if (r35.A01 == null || C14570pP.A1W(r35)) {
                    C86374Sl r14 = r35.A0I;
                    if (r14 == null || ((r0 = r35.A0D) != null && r0.A0C())) {
                        r35.A0B.onClick(view2);
                        return;
                    }
                    r14.A00(r26.A11);
                    r35.A1R();
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                C30011bb r63 = (C30011bb) this.A00;
                C38771rO r54 = (C38771rO) this.A01;
                List A13 = r54.A13();
                if (A13.isEmpty()) {
                    com.whatsapp.util.Log.e(AnonymousClass000.A0f(r54.A11, AnonymousClass000.A0r("call logs are empty, message.key=")));
                    return;
                }
                Object A0Z = C13690nt.A0Z(A13);
                AnonymousClass00B.A07(A0Z, "null call log");
                C37831po r15 = (C37831po) A0Z;
                Activity A006 = AnonymousClass22N.A00(r63.getContext());
                if (!(A006 instanceof C001000l) || !r15.A0A()) {
                    r63.A0W.A01(A006, C16000sG.A00(r63.A0a, r54.A11.A00), 8, r54.A16());
                    return;
                } else {
                    C30341cC.A0F((C001000l) A006, r63.A0a, r15, 8);
                    return;
                }
            case 47:
                C30011bb r27 = (C30011bb) this.A00;
                C16740tZ A0H = r27.A0w.A0H((AnonymousClass1Vt) this.A01);
                AnonymousClass1yP A023 = AnonymousClass22O.A02(r27);
                if (A0H != null && A023 != null) {
                    C42821yj r28 = ((Conversation) A023).A00;
                    r28.A0i(A0H, r28.A22.getResources().getDimensionPixelSize(R.dimen.dimen0277));
                    return;
                }
                return;
            case 48:
                ((AnonymousClass31E) this.A00).A09.A02(((C16740tZ) this.A01).A0L.A01());
                return;
            case 49:
                AnonymousClass31E r29 = (AnonymousClass31E) this.A00;
                C16740tZ r45 = (C16740tZ) this.A01;
                AnonymousClass1Vt r36 = r45.A0L;
                AnonymousClass1W2 r015 = r36.A0A;
                if (r015 == null || (r02 = r015.A02) == null) {
                    AnonymousClass01Y r16 = r29.A0V;
                    AnonymousClass00B.A06(r36);
                    if (r16.A0V(UserJid.of(r36.A0D))) {
                        ((C14600pS) r29.getContext()).Afc(UnblockDialogFragment.A01(new IDxUnblockerShape77S0200000_2_I1(r45, 2, r29), C13680ns.A0d(r29.getContext(), r29.A0d.A08(r29.A0a.A0A(r45.A0L.A0D)), new Object[1], 0, R.string.str0fcb), 0, false));
                        return;
                    }
                    Intent A024 = r29.A1J.A02(r29.getContext(), true, false);
                    A024.putExtra("extra_payment_preset_amount", r29.A07.A00().A9F(r29.A0K, r45.A0L.A08));
                    A024.putExtra("referral_screen", "chat");
                    C15830rv r55 = r45.A11.A00;
                    String str2 = "extra_jid";
                    if (r55 instanceof GroupJid) {
                        A024.putExtra(str2, r55.getRawString());
                        A03 = C16030sJ.A03(r45.A0L.A0D);
                        str2 = "extra_receiver_jid";
                    } else {
                        A03 = C16030sJ.A03(r45.A0L.A0D);
                    }
                    A024.putExtra(str2, A03);
                    A024.putExtra("extra_payment_note", r45.A0I());
                    A024.putExtra("extra_conversation_message_type", 1);
                    if (r45.A0y()) {
                        List list = r45.A0q;
                        AnonymousClass00B.A06(list);
                        A024.putStringArrayListExtra("extra_mentioned_jids", C13680ns.A0n(C16030sJ.A06(list)));
                    }
                    C35361lo A012 = r45.A0L.A01();
                    if (A012 != null) {
                        A024.putExtra("extra_payment_background", A012);
                    }
                    if (r45 instanceof C38641rB) {
                        C38641rB r46 = (C38641rB) r45;
                        A024.putExtra("extra_payment_sticker", r46.A1A());
                        A024.putExtra("extra_payment_sticker_send_origin", r46.A03);
                    }
                    C13690nt.A0u(A024, r29);
                    return;
                }
                C18090w8 r10 = r29.A08;
                C227919h r9 = r29.A1J;
                C15830rv r17 = r36.A0C;
                if (r17 == null) {
                    r17 = r36.A0D;
                }
                C28381Vw r7 = new C28381Vw(r17, r02.A02, false);
                C15830rv r37 = r7.A00;
                AnonymousClass00B.A06(r37);
                Context context3 = r29.getContext();
                String str3 = r45.A0L.A0A.A02.A01;
                Intent A013 = (!r10.A07() || !r10.A0D((String) null)) ? r9.A01(context3) : r9.A00(context3);
                if (A013 != null) {
                    AnonymousClass1yL.A00(A013, r7);
                    A013.putExtra("extra_order_id", str3);
                    A013.putExtra("extra_order_discount_program_name", (String) null);
                    A013.putExtra("extra_order_type", (String) null);
                    A013.putExtra("extra_transaction_type", "p2m");
                    A013.putExtra("extra_payment_config_id", (String) null);
                    A013.putExtra("referral_screen", "order_details");
                    A013.setFlags(603979776);
                    AnonymousClass477.A00(context3, A013, r37);
                    return;
                }
                return;
            default:
                AnonymousClass3BG r38 = (AnonymousClass3BG) this.A00;
                Intent intent = (Intent) this.A01;
                AnonymousClass1KR r47 = r38.A0B;
                C16010sH r016 = r38.A0G;
                r47.A05((Integer) null, r38.A0I, C16030sJ.A03(r016 == null ? null : (UserJid) C16010sH.A03(r016)), 3, r38.A01, r38.A00);
                if (r38.A0G.A0H()) {
                    r47.A01(r38.A0C, 8);
                }
                r38.A03.A06(r38.A04, intent);
                return;
        }
    }
}
