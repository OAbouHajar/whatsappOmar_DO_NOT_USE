package com.obwhatsapp;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass01J;
import X.AnonymousClass01V;
import X.AnonymousClass01Y;
import X.AnonymousClass04o;
import X.AnonymousClass11G;
import X.AnonymousClass13G;
import X.AnonymousClass152;
import X.AnonymousClass156;
import X.AnonymousClass15G;
import X.AnonymousClass15I;
import X.AnonymousClass15X;
import X.AnonymousClass15Z;
import X.AnonymousClass195;
import X.AnonymousClass1A9;
import X.AnonymousClass1BL;
import X.AnonymousClass1BN;
import X.AnonymousClass1BQ;
import X.AnonymousClass1BU;
import X.AnonymousClass1DY;
import X.AnonymousClass1FI;
import X.AnonymousClass1KT;
import X.AnonymousClass1KW;
import X.AnonymousClass1KZ;
import X.AnonymousClass1L1;
import X.AnonymousClass1L3;
import X.AnonymousClass1PN;
import X.AnonymousClass1Pc;
import X.AnonymousClass1TS;
import X.AnonymousClass2RQ;
import X.AnonymousClass2TA;
import X.AnonymousClass38W;
import X.AnonymousClass3AS;
import X.AnonymousClass3Q6;
import X.AnonymousClass4CU;
import X.AnonymousClass4CZ;
import X.AnonymousClass5wS;
import X.C14710pd;
import X.C14870pt;
import X.C15800rs;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16070sO;
import X.C16080sP;
import X.C16150sX;
import X.C16180sb;
import X.C16220sf;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16760tb;
import X.C16820th;
import X.C16980tz;
import X.C17020u3;
import X.C17030uP;
import X.C17050uS;
import X.C17060uT;
import X.C17070uU;
import X.C17080uV;
import X.C17090uW;
import X.C17110uY;
import X.C17140ub;
import X.C17150uc;
import X.C17160ud;
import X.C17170ue;
import X.C17190ug;
import X.C17200uh;
import X.C17220uj;
import X.C17230uk;
import X.C17240ul;
import X.C17250um;
import X.C17270uo;
import X.C18040w3;
import X.C18090w8;
import X.C18290wS;
import X.C18450wi;
import X.C18550ws;
import X.C18560wt;
import X.C18630x0;
import X.C18640x1;
import X.C18720x9;
import X.C18750xC;
import X.C18890xQ;
import X.C19000xb;
import X.C19060xh;
import X.C19220xx;
import X.C19230xz;
import X.C19380yL;
import X.C19580yf;
import X.C19780yz;
import X.C19980zJ;
import X.C19990zK;
import X.C206711d;
import X.C211613a;
import X.C217415g;
import X.C218115n;
import X.C218315p;
import X.C222617g;
import X.C23061Ai;
import X.C23071Aj;
import X.C23081Ak;
import X.C23091Al;
import X.C24511Gf;
import X.C25651Kp;
import X.C25681Ks;
import X.C25691Kt;
import X.C25731Kx;
import X.C25781Lc;
import X.C25791Ld;
import X.C26771Pb;
import X.C26841Pl;
import X.C26861Pn;
import X.C28011Tz;
import X.C49132Rg;
import X.C50132Yc;
import X.C50162Yf;
import X.C50712aK;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import X.C61713Aa;
import X.C82274Ce;
import X.C82314Ci;
import X.C82374Co;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.obwhatsapp.biz.cart.view.fragment.Hilt_CartFragment;
import com.obwhatsapp.biz.catalog.view.Hilt_PostcodeChangeBottomSheet;
import com.obwhatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.obwhatsapp.biz.order.view.fragment.Hilt_OrderDetailFragment;
import com.obwhatsapp.biz.order.view.fragment.OrderDetailFragment;
import com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.obwhatsapp.businessdirectory.view.custom.Hilt_FilterBottomSheetDialogFragment;
import com.obwhatsapp.businessdirectory.view.fragment.Hilt_LocationOptionPickerFragment;
import com.obwhatsapp.businessdirectory.view.fragment.LocationOptionPickerFragment;
import com.obwhatsapp.calling.callgrid.view.Hilt_MenuBottomSheet;
import com.obwhatsapp.community.AboutCommunityBottomSheetFragment;
import com.obwhatsapp.community.CommunitySubgroupsBottomSheet;
import com.obwhatsapp.community.Hilt_AboutCommunityBottomSheetFragment;
import com.obwhatsapp.community.Hilt_CommunitySubgroupsBottomSheet;
import com.obwhatsapp.community.Hilt_JoinGroupBottomSheetFragment;
import com.obwhatsapp.community.Hilt_NewCommunityAdminBottomSheetFragment;
import com.obwhatsapp.community.JoinGroupBottomSheetFragment;
import com.obwhatsapp.community.NewCommunityAdminBottomSheetFragment;
import com.obwhatsapp.contact.picker.statusprivacy.Hilt_StatusPrivacyBottomSheetDialogFragment;
import com.obwhatsapp.contact.picker.statusprivacy.StatusPrivacyBottomSheetDialogFragment;
import com.obwhatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet;
import com.obwhatsapp.conversation.conversationrow.Hilt_E2EEDescriptionBottomSheet;
import com.obwhatsapp.conversation.conversationrow.messagerating.Hilt_MessageRatingFragment;
import com.obwhatsapp.conversation.conversationrow.messagerating.MessageRatingFragment;
import com.obwhatsapp.conversation.selectlist.Hilt_SelectListBottomSheet;
import com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;
import com.obwhatsapp.ephemeral.Hilt_EphemeralDmKicBottomSheetDialog;
import com.obwhatsapp.ephemeral.Hilt_ViewOnceNuxBottomSheet;
import com.obwhatsapp.ephemeral.Hilt_ViewOnceSecondaryNuxBottomSheet;
import com.obwhatsapp.ephemeral.ViewOnceNuxBottomSheet;
import com.obwhatsapp.ephemeral.ViewOnceSecondaryNuxBottomSheet;
import com.obwhatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment;
import com.obwhatsapp.group.ui.Hilt_GroupJoinRequestReasonBottomSheetFragment;
import com.obwhatsapp.languageselector.Hilt_LanguageSelectorBottomSheet;
import com.obwhatsapp.languageselector.LanguageSelectorBottomSheet;
import com.obwhatsapp.permissions.Hilt_NotificationPermissionBottomSheet;
import com.obwhatsapp.permissions.Hilt_RequestPermissionsBottomSheet;
import com.obwhatsapp.permissions.NotificationPermissionBottomSheet;
import com.obwhatsapp.permissions.RequestPermissionsBottomSheet;
import com.obwhatsapp.privacy.usernotice.Hilt_UserNoticeBottomSheetDialogFragment;
import com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;
import com.obwhatsapp.qrcode.contactqr.Hilt_ScannedCodeDialogFragment;
import com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment;
import com.obwhatsapp.reactions.Hilt_ReactionsBottomSheetDialogFragment;
import com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment;
import com.obwhatsapp.registration.Hilt_RequestOtpCodeBottomSheetFragment;
import com.obwhatsapp.registration.Hilt_VerificationCodeBottomSheet;
import com.obwhatsapp.registration.RequestOtpCodeBottomSheetFragment;
import com.obwhatsapp.registration.VerificationCodeBottomSheet;
import com.obwhatsapp.wabloks.commerce.ui.view.ExtensionsBottomsheetBaseContainer;
import com.obwhatsapp.wabloks.commerce.ui.view.Hilt_ExtensionsBottomsheetBaseContainer;

public abstract class Hilt_RoundedBottomSheetDialogFragment extends BottomSheetDialogFragment implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1K();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        LayoutInflater A0v = super.A0v(bundle);
        return A0v.cloneInContext(new C54452hX(A0v, (AnonymousClass01A) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C54442hW.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A0V = r0
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C54442hW.A00(r0)
            r2 = 0
            if (r0 != r4) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C52772eQ.A00(r0, r1, r2)
            r3.A1K()
            r3.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.Hilt_RoundedBottomSheetDialogFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1K();
        A1J();
    }

    public void A1J() {
        C17060uT r1;
        Hilt_SelectListBottomSheet hilt_SelectListBottomSheet;
        if (this instanceof Hilt_ExtensionsBottomsheetBaseContainer) {
            Hilt_ExtensionsBottomsheetBaseContainer hilt_ExtensionsBottomsheetBaseContainer = (Hilt_ExtensionsBottomsheetBaseContainer) this;
            if (!hilt_ExtensionsBottomsheetBaseContainer.A02) {
                hilt_ExtensionsBottomsheetBaseContainer.A02 = true;
                ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer = (ExtensionsBottomsheetBaseContainer) hilt_ExtensionsBottomsheetBaseContainer;
                C16150sX r12 = ((C17050uS) ((C17060uT) hilt_ExtensionsBottomsheetBaseContainer.generatedComponent())).A0b;
                extensionsBottomsheetBaseContainer.A00 = (C17070uU) r12.ABg.get();
                extensionsBottomsheetBaseContainer.A01 = (C17080uV) r12.APK.get();
                extensionsBottomsheetBaseContainer.A05 = (AnonymousClass5wS) r12.A25.get();
                extensionsBottomsheetBaseContainer.A06 = (C14710pd) r12.A05.get();
            }
        } else if (this instanceof Hilt_VerificationCodeBottomSheet) {
            Hilt_VerificationCodeBottomSheet hilt_VerificationCodeBottomSheet = (Hilt_VerificationCodeBottomSheet) this;
            if (!hilt_VerificationCodeBottomSheet.A02) {
                hilt_VerificationCodeBottomSheet.A02 = true;
                VerificationCodeBottomSheet verificationCodeBottomSheet = (VerificationCodeBottomSheet) hilt_VerificationCodeBottomSheet;
                C16150sX r13 = ((C17050uS) ((C17060uT) hilt_VerificationCodeBottomSheet.generatedComponent())).A0b;
                verificationCodeBottomSheet.A00 = (C17070uU) r13.ABg.get();
                verificationCodeBottomSheet.A01 = (C17080uV) r13.APK.get();
                verificationCodeBottomSheet.A03 = (C16490t9) r13.AQz.get();
                verificationCodeBottomSheet.A02 = (AnonymousClass013) r13.AR8.get();
                verificationCodeBottomSheet.A01 = (C15860rz) r13.AQh.get();
                verificationCodeBottomSheet.A00 = (C19380yL) r13.AQd.get();
            }
        } else if (this instanceof Hilt_RequestOtpCodeBottomSheetFragment) {
            Hilt_RequestOtpCodeBottomSheetFragment hilt_RequestOtpCodeBottomSheetFragment = (Hilt_RequestOtpCodeBottomSheetFragment) this;
            if (!hilt_RequestOtpCodeBottomSheetFragment.A02) {
                hilt_RequestOtpCodeBottomSheetFragment.A02 = true;
                RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment = (RequestOtpCodeBottomSheetFragment) hilt_RequestOtpCodeBottomSheetFragment;
                C17050uS r2 = (C17050uS) ((C17060uT) hilt_RequestOtpCodeBottomSheetFragment.generatedComponent());
                C16150sX r14 = r2.A0b;
                requestOtpCodeBottomSheetFragment.A00 = (C17070uU) r14.ABg.get();
                requestOtpCodeBottomSheetFragment.A01 = (C17080uV) r14.APK.get();
                requestOtpCodeBottomSheetFragment.A0A = (AnonymousClass013) r14.AR8.get();
                C16150sX r15 = r2.A0Y.A1s;
                requestOtpCodeBottomSheetFragment.A0B = new AnonymousClass3AS((C14870pt) r15.AB3.get(), (C16440t3) r15.AP2.get(), (C26841Pl) r15.A0G.get());
            }
        } else if (this instanceof Hilt_ReactionsBottomSheetDialogFragment) {
            Hilt_ReactionsBottomSheetDialogFragment hilt_ReactionsBottomSheetDialogFragment = (Hilt_ReactionsBottomSheetDialogFragment) this;
            if (!hilt_ReactionsBottomSheetDialogFragment.A02) {
                hilt_ReactionsBottomSheetDialogFragment.A02 = true;
                ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = (ReactionsBottomSheetDialogFragment) hilt_ReactionsBottomSheetDialogFragment;
                C16150sX r22 = ((C17050uS) ((C17060uT) hilt_ReactionsBottomSheetDialogFragment.generatedComponent())).A0b;
                reactionsBottomSheetDialogFragment.A00 = (C17070uU) r22.ABg.get();
                reactionsBottomSheetDialogFragment.A01 = (C17080uV) r22.APK.get();
                reactionsBottomSheetDialogFragment.A02 = (C14870pt) r22.AB3.get();
                reactionsBottomSheetDialogFragment.A03 = (C16040sK) r22.ADr.get();
                reactionsBottomSheetDialogFragment.A0M = (C16320sq) r22.ARB.get();
                reactionsBottomSheetDialogFragment.A0F = (C15810rt) r22.A43.get();
                reactionsBottomSheetDialogFragment.A04 = (C16760tb) r22.APV.get();
                reactionsBottomSheetDialogFragment.A01 = (C19980zJ) r22.A0P.get();
                reactionsBottomSheetDialogFragment.A08 = (C17160ud) r22.A4t.get();
                reactionsBottomSheetDialogFragment.A09 = (C16000sG) r22.A4x.get();
                reactionsBottomSheetDialogFragment.A0A = (C16080sP) r22.AQ9.get();
                reactionsBottomSheetDialogFragment.A0D = (AnonymousClass013) r22.AR8.get();
                reactionsBottomSheetDialogFragment.A0K = (C25791Ld) r22.AFY.get();
                reactionsBottomSheetDialogFragment.A0E = (C16820th) r22.A3B.get();
                reactionsBottomSheetDialogFragment.A07 = (C17230uk) r22.A4I.get();
                reactionsBottomSheetDialogFragment.A0B = (AnonymousClass152) r22.A51.get();
                reactionsBottomSheetDialogFragment.A0G = (AnonymousClass1FI) r22.AIq.get();
            }
        } else if (this instanceof Hilt_ScannedCodeDialogFragment) {
            Hilt_ScannedCodeDialogFragment hilt_ScannedCodeDialogFragment = (Hilt_ScannedCodeDialogFragment) this;
            if (!hilt_ScannedCodeDialogFragment.A02) {
                hilt_ScannedCodeDialogFragment.A02 = true;
                ScannedCodeDialogFragment scannedCodeDialogFragment = (ScannedCodeDialogFragment) hilt_ScannedCodeDialogFragment;
                C16150sX r23 = ((C17050uS) ((C17060uT) hilt_ScannedCodeDialogFragment.generatedComponent())).A0b;
                scannedCodeDialogFragment.A00 = (C17070uU) r23.ABg.get();
                scannedCodeDialogFragment.A01 = (C17080uV) r23.APK.get();
                scannedCodeDialogFragment.A0F = (C16440t3) r23.AP2.get();
                scannedCodeDialogFragment.A04 = (C16040sK) r23.ADr.get();
                scannedCodeDialogFragment.A0Q = (C16320sq) r23.ARB.get();
                scannedCodeDialogFragment.A0K = (C16490t9) r23.AQz.get();
                scannedCodeDialogFragment.A0J = (C17250um) r23.A7e.get();
                scannedCodeDialogFragment.A05 = (C15900s5) r23.ALm.get();
                scannedCodeDialogFragment.A0C = (C17200uh) r23.A52.get();
                scannedCodeDialogFragment.A06 = (C16000sG) r23.A4x.get();
                scannedCodeDialogFragment.A0E = (AnonymousClass01V) r23.AOi.get();
                scannedCodeDialogFragment.A0A = (C16080sP) r23.AQ9.get();
                scannedCodeDialogFragment.A0H = (AnonymousClass013) r23.AR8.get();
                scannedCodeDialogFragment.A07 = (C17140ub) r23.A4y.get();
                scannedCodeDialogFragment.A0N = new C25781Lc();
                scannedCodeDialogFragment.A0O = (C25681Ks) r23.A0Q.get();
                scannedCodeDialogFragment.A0P = (C25691Kt) r23.A0R.get();
                scannedCodeDialogFragment.A0D = (C19230xz) r23.A5B.get();
                scannedCodeDialogFragment.A09 = (C17030uP) r23.APp.get();
                scannedCodeDialogFragment.A0G = (C16260sj) r23.AQe.get();
                scannedCodeDialogFragment.A08 = (AnonymousClass156) r23.ADH.get();
            }
        } else if (this instanceof Hilt_UserNoticeBottomSheetDialogFragment) {
            Hilt_UserNoticeBottomSheetDialogFragment hilt_UserNoticeBottomSheetDialogFragment = (Hilt_UserNoticeBottomSheetDialogFragment) this;
            if (!hilt_UserNoticeBottomSheetDialogFragment.A02) {
                hilt_UserNoticeBottomSheetDialogFragment.A02 = true;
                UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = (UserNoticeBottomSheetDialogFragment) hilt_UserNoticeBottomSheetDialogFragment;
                C16150sX r24 = ((C17050uS) ((C17060uT) hilt_UserNoticeBottomSheetDialogFragment.generatedComponent())).A0b;
                userNoticeBottomSheetDialogFragment.A00 = (C17070uU) r24.ABg.get();
                userNoticeBottomSheetDialogFragment.A01 = (C17080uV) r24.APK.get();
                userNoticeBottomSheetDialogFragment.A09 = (C14870pt) r24.AB3.get();
                userNoticeBottomSheetDialogFragment.A0A = (AnonymousClass01V) r24.AOi.get();
                userNoticeBottomSheetDialogFragment.A0C = (AnonymousClass13G) r24.APh.get();
                userNoticeBottomSheetDialogFragment.A0D = (C19220xx) r24.APi.get();
                userNoticeBottomSheetDialogFragment.A0B = (AnonymousClass1PN) r24.APc.get();
            }
        } else if (this instanceof Hilt_RequestPermissionsBottomSheet) {
            Hilt_RequestPermissionsBottomSheet hilt_RequestPermissionsBottomSheet = (Hilt_RequestPermissionsBottomSheet) this;
            if (hilt_RequestPermissionsBottomSheet instanceof Hilt_NotificationPermissionBottomSheet) {
                Hilt_NotificationPermissionBottomSheet hilt_NotificationPermissionBottomSheet = (Hilt_NotificationPermissionBottomSheet) hilt_RequestPermissionsBottomSheet;
                if (!hilt_NotificationPermissionBottomSheet.A02) {
                    hilt_NotificationPermissionBottomSheet.A02 = true;
                    NotificationPermissionBottomSheet notificationPermissionBottomSheet = (NotificationPermissionBottomSheet) hilt_NotificationPermissionBottomSheet;
                    C16150sX r4 = ((C17050uS) ((C17060uT) hilt_NotificationPermissionBottomSheet.generatedComponent())).A0b;
                    notificationPermissionBottomSheet.A00 = (C17070uU) r4.ABg.get();
                    notificationPermissionBottomSheet.A01 = (C17080uV) r4.APK.get();
                    notificationPermissionBottomSheet.A06 = (AnonymousClass1BN) r4.AAp.get();
                    AnonymousClass01J r3 = r4.AQh;
                    notificationPermissionBottomSheet.A04 = (C15860rz) r3.get();
                    notificationPermissionBottomSheet.A05 = (AnonymousClass013) r4.AR8.get();
                    notificationPermissionBottomSheet.A01 = (C14870pt) r4.AB3.get();
                    notificationPermissionBottomSheet.A00 = (C19980zJ) r4.A0P.get();
                    notificationPermissionBottomSheet.A03 = (AnonymousClass01V) r4.AOi.get();
                    notificationPermissionBottomSheet.A02 = (C23071Aj) r4.AQb.get();
                    C16440t3 r0 = (C16440t3) r4.AP2.get();
                    C18450wi.A0H(r0, 0);
                    notificationPermissionBottomSheet.A00 = r0;
                    C16490t9 r02 = (C16490t9) r4.AQz.get();
                    C18450wi.A0H(r02, 0);
                    notificationPermissionBottomSheet.A02 = r02;
                    C15860rz r03 = (C15860rz) r3.get();
                    C18450wi.A0H(r03, 0);
                    notificationPermissionBottomSheet.A01 = r03;
                }
            } else if (!hilt_RequestPermissionsBottomSheet.A02) {
                hilt_RequestPermissionsBottomSheet.A02 = true;
                RequestPermissionsBottomSheet requestPermissionsBottomSheet = (RequestPermissionsBottomSheet) hilt_RequestPermissionsBottomSheet;
                C16150sX r25 = ((C17050uS) ((C17060uT) hilt_RequestPermissionsBottomSheet.generatedComponent())).A0b;
                requestPermissionsBottomSheet.A00 = (C17070uU) r25.ABg.get();
                requestPermissionsBottomSheet.A01 = (C17080uV) r25.APK.get();
                requestPermissionsBottomSheet.A06 = (AnonymousClass1BN) r25.AAp.get();
                requestPermissionsBottomSheet.A04 = (C15860rz) r25.AQh.get();
                requestPermissionsBottomSheet.A05 = (AnonymousClass013) r25.AR8.get();
                requestPermissionsBottomSheet.A01 = (C14870pt) r25.AB3.get();
                requestPermissionsBottomSheet.A00 = (C19980zJ) r25.A0P.get();
                requestPermissionsBottomSheet.A03 = (AnonymousClass01V) r25.AOi.get();
                requestPermissionsBottomSheet.A02 = (C23071Aj) r25.AQb.get();
            }
        } else if (this instanceof Hilt_LanguageSelectorBottomSheet) {
            Hilt_LanguageSelectorBottomSheet hilt_LanguageSelectorBottomSheet = (Hilt_LanguageSelectorBottomSheet) this;
            if (!hilt_LanguageSelectorBottomSheet.A02) {
                hilt_LanguageSelectorBottomSheet.A02 = true;
                LanguageSelectorBottomSheet languageSelectorBottomSheet = (LanguageSelectorBottomSheet) hilt_LanguageSelectorBottomSheet;
                C16150sX r26 = ((C17050uS) ((C17060uT) hilt_LanguageSelectorBottomSheet.generatedComponent())).A0b;
                languageSelectorBottomSheet.A00 = (C17070uU) r26.ABg.get();
                languageSelectorBottomSheet.A01 = (C17080uV) r26.APK.get();
                languageSelectorBottomSheet.A00 = (C16040sK) r26.ADr.get();
                languageSelectorBottomSheet.A03 = (C19060xh) r26.A01.get();
                languageSelectorBottomSheet.A01 = (AnonymousClass01V) r26.AOi.get();
                languageSelectorBottomSheet.A02 = (AnonymousClass013) r26.AR8.get();
                languageSelectorBottomSheet.A06 = (C26861Pn) r26.ADF.get();
            }
        } else if (this instanceof Hilt_GroupJoinRequestReasonBottomSheetFragment) {
            Hilt_GroupJoinRequestReasonBottomSheetFragment hilt_GroupJoinRequestReasonBottomSheetFragment = (Hilt_GroupJoinRequestReasonBottomSheetFragment) this;
            if (!hilt_GroupJoinRequestReasonBottomSheetFragment.A02) {
                hilt_GroupJoinRequestReasonBottomSheetFragment.A02 = true;
                GroupJoinRequestReasonBottomSheetFragment groupJoinRequestReasonBottomSheetFragment = (GroupJoinRequestReasonBottomSheetFragment) hilt_GroupJoinRequestReasonBottomSheetFragment;
                C16150sX r27 = ((C17050uS) ((C17060uT) hilt_GroupJoinRequestReasonBottomSheetFragment.generatedComponent())).A0b;
                groupJoinRequestReasonBottomSheetFragment.A00 = (C17070uU) r27.ABg.get();
                groupJoinRequestReasonBottomSheetFragment.A01 = (C17080uV) r27.APK.get();
                groupJoinRequestReasonBottomSheetFragment.A06 = (C17250um) r27.A7e.get();
                groupJoinRequestReasonBottomSheetFragment.A00 = (C16760tb) r27.APV.get();
                groupJoinRequestReasonBottomSheetFragment.A03 = (C16080sP) r27.AQ9.get();
                groupJoinRequestReasonBottomSheetFragment.A02 = (C16000sG) r27.A4x.get();
                groupJoinRequestReasonBottomSheetFragment.A05 = (AnonymousClass013) r27.AR8.get();
                groupJoinRequestReasonBottomSheetFragment.A04 = (AnonymousClass01V) r27.AOi.get();
                groupJoinRequestReasonBottomSheetFragment.A07 = (C17020u3) r27.AMG.get();
            }
        } else if (this instanceof Hilt_ViewOnceSecondaryNuxBottomSheet) {
            Hilt_ViewOnceSecondaryNuxBottomSheet hilt_ViewOnceSecondaryNuxBottomSheet = (Hilt_ViewOnceSecondaryNuxBottomSheet) this;
            if (!hilt_ViewOnceSecondaryNuxBottomSheet.A02) {
                hilt_ViewOnceSecondaryNuxBottomSheet.A02 = true;
                ViewOnceSecondaryNuxBottomSheet viewOnceSecondaryNuxBottomSheet = (ViewOnceSecondaryNuxBottomSheet) hilt_ViewOnceSecondaryNuxBottomSheet;
                C16150sX r28 = ((C17050uS) ((C17060uT) hilt_ViewOnceSecondaryNuxBottomSheet.generatedComponent())).A0b;
                viewOnceSecondaryNuxBottomSheet.A00 = (C17070uU) r28.ABg.get();
                viewOnceSecondaryNuxBottomSheet.A01 = (C17080uV) r28.APK.get();
                viewOnceSecondaryNuxBottomSheet.A02 = (C15860rz) r28.AQh.get();
                viewOnceSecondaryNuxBottomSheet.A05 = (C17220uj) r28.A9x.get();
                viewOnceSecondaryNuxBottomSheet.A03 = (C16490t9) r28.AQz.get();
                viewOnceSecondaryNuxBottomSheet.A04 = (C18040w3) r28.AR0.get();
                viewOnceSecondaryNuxBottomSheet.A01 = (C19980zJ) r28.A0P.get();
            }
        } else if (this instanceof Hilt_ViewOnceNuxBottomSheet) {
            Hilt_ViewOnceNuxBottomSheet hilt_ViewOnceNuxBottomSheet = (Hilt_ViewOnceNuxBottomSheet) this;
            if (!hilt_ViewOnceNuxBottomSheet.A02) {
                hilt_ViewOnceNuxBottomSheet.A02 = true;
                ViewOnceNuxBottomSheet viewOnceNuxBottomSheet = (ViewOnceNuxBottomSheet) hilt_ViewOnceNuxBottomSheet;
                C16150sX r29 = ((C17050uS) ((C17060uT) hilt_ViewOnceNuxBottomSheet.generatedComponent())).A0b;
                viewOnceNuxBottomSheet.A00 = (C17070uU) r29.ABg.get();
                viewOnceNuxBottomSheet.A01 = (C17080uV) r29.APK.get();
                viewOnceNuxBottomSheet.A03 = (C14710pd) r29.A05.get();
                viewOnceNuxBottomSheet.A04 = (C16490t9) r29.AQz.get();
                viewOnceNuxBottomSheet.A06 = C16150sX.A0x(r29);
                viewOnceNuxBottomSheet.A01 = (C19980zJ) r29.A0P.get();
                viewOnceNuxBottomSheet.A07 = (C17220uj) r29.A9x.get();
                viewOnceNuxBottomSheet.A05 = (C18040w3) r29.AR0.get();
                viewOnceNuxBottomSheet.A02 = (C15860rz) r29.AQh.get();
            }
        } else if (this instanceof Hilt_EphemeralDmKicBottomSheetDialog) {
            Hilt_EphemeralDmKicBottomSheetDialog hilt_EphemeralDmKicBottomSheetDialog = (Hilt_EphemeralDmKicBottomSheetDialog) this;
            if (!hilt_EphemeralDmKicBottomSheetDialog.A02) {
                hilt_EphemeralDmKicBottomSheetDialog.A02 = true;
                EphemeralDmKicBottomSheetDialog ephemeralDmKicBottomSheetDialog = (EphemeralDmKicBottomSheetDialog) hilt_EphemeralDmKicBottomSheetDialog;
                C16150sX r210 = ((C17050uS) ((C17060uT) hilt_EphemeralDmKicBottomSheetDialog.generatedComponent())).A0b;
                ephemeralDmKicBottomSheetDialog.A00 = (C17070uU) r210.ABg.get();
                ephemeralDmKicBottomSheetDialog.A01 = (C17080uV) r210.APK.get();
                ephemeralDmKicBottomSheetDialog.A0D = (C16440t3) r210.AP2.get();
                ephemeralDmKicBottomSheetDialog.A0N = (C16320sq) r210.ARB.get();
                ephemeralDmKicBottomSheetDialog.A0H = (C16490t9) r210.AQz.get();
                ephemeralDmKicBottomSheetDialog.A01 = (C19980zJ) r210.A0P.get();
                ephemeralDmKicBottomSheetDialog.A0M = (C17220uj) r210.A9x.get();
                ephemeralDmKicBottomSheetDialog.A0L = (C222617g) r210.A8a.get();
                ephemeralDmKicBottomSheetDialog.A0F = (C16460t6) r210.A5k.get();
                ephemeralDmKicBottomSheetDialog.A0G = C16150sX.A0j(r210);
                ephemeralDmKicBottomSheetDialog.A0I = (C18040w3) r210.AR0.get();
                ephemeralDmKicBottomSheetDialog.A0K = C16150sX.A0x(r210);
                ephemeralDmKicBottomSheetDialog.A0E = (C15860rz) r210.AQh.get();
                ephemeralDmKicBottomSheetDialog.A0C = (C15800rs) r210.A5c.get();
            }
        } else {
            if (this instanceof Hilt_SelectListBottomSheet) {
                Hilt_SelectListBottomSheet hilt_SelectListBottomSheet2 = (Hilt_SelectListBottomSheet) this;
                if (!hilt_SelectListBottomSheet2.A02) {
                    hilt_SelectListBottomSheet2.A02 = true;
                    r1 = (C17060uT) hilt_SelectListBottomSheet2.generatedComponent();
                    hilt_SelectListBottomSheet = hilt_SelectListBottomSheet2;
                } else {
                    return;
                }
            } else if (this instanceof Hilt_MessageRatingFragment) {
                Hilt_MessageRatingFragment hilt_MessageRatingFragment = (Hilt_MessageRatingFragment) this;
                if (!hilt_MessageRatingFragment.A02) {
                    hilt_MessageRatingFragment.A02 = true;
                    MessageRatingFragment messageRatingFragment = (MessageRatingFragment) hilt_MessageRatingFragment;
                    C16150sX r16 = ((C17050uS) ((C17060uT) hilt_MessageRatingFragment.generatedComponent())).A0b;
                    messageRatingFragment.A00 = (C17070uU) r16.ABg.get();
                    messageRatingFragment.A01 = (C17080uV) r16.APK.get();
                    messageRatingFragment.A00 = (C14870pt) r16.AB3.get();
                    return;
                }
                return;
            } else if (this instanceof Hilt_E2EEDescriptionBottomSheet) {
                Hilt_E2EEDescriptionBottomSheet hilt_E2EEDescriptionBottomSheet = (Hilt_E2EEDescriptionBottomSheet) this;
                if (!hilt_E2EEDescriptionBottomSheet.A02) {
                    hilt_E2EEDescriptionBottomSheet.A02 = true;
                    E2EEDescriptionBottomSheet e2EEDescriptionBottomSheet = (E2EEDescriptionBottomSheet) hilt_E2EEDescriptionBottomSheet;
                    C16150sX r17 = ((C17050uS) ((C17060uT) hilt_E2EEDescriptionBottomSheet.generatedComponent())).A0b;
                    e2EEDescriptionBottomSheet.A00 = (C17070uU) r17.ABg.get();
                    e2EEDescriptionBottomSheet.A01 = (C17080uV) r17.APK.get();
                    e2EEDescriptionBottomSheet.A02 = (C16490t9) r17.AQz.get();
                    e2EEDescriptionBottomSheet.A01 = (C19980zJ) r17.A0P.get();
                    e2EEDescriptionBottomSheet.A03 = (AnonymousClass1BL) r17.AJE.get();
                    return;
                }
                return;
            } else if (this instanceof Hilt_StatusPrivacyBottomSheetDialogFragment) {
                Hilt_StatusPrivacyBottomSheetDialogFragment hilt_StatusPrivacyBottomSheetDialogFragment = (Hilt_StatusPrivacyBottomSheetDialogFragment) this;
                if (!hilt_StatusPrivacyBottomSheetDialogFragment.A02) {
                    hilt_StatusPrivacyBottomSheetDialogFragment.A02 = true;
                    StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment = (StatusPrivacyBottomSheetDialogFragment) hilt_StatusPrivacyBottomSheetDialogFragment;
                    C16150sX r211 = ((C17050uS) ((C17060uT) hilt_StatusPrivacyBottomSheetDialogFragment.generatedComponent())).A0b;
                    statusPrivacyBottomSheetDialogFragment.A00 = (C17070uU) r211.ABg.get();
                    statusPrivacyBottomSheetDialogFragment.A01 = (C17080uV) r211.APK.get();
                    statusPrivacyBottomSheetDialogFragment.A05 = (AnonymousClass11G) r211.ANN.get();
                    statusPrivacyBottomSheetDialogFragment.A06 = (C14710pd) r211.A05.get();
                    statusPrivacyBottomSheetDialogFragment.A03 = (AnonymousClass013) r211.AR8.get();
                    statusPrivacyBottomSheetDialogFragment.A08 = C16150sX.A17(r211);
                    statusPrivacyBottomSheetDialogFragment.A09 = (AnonymousClass1L1) r211.ANR.get();
                    statusPrivacyBottomSheetDialogFragment.A07 = (AnonymousClass1BU) r211.ANA.get();
                    statusPrivacyBottomSheetDialogFragment.A0A = C17270uo.A00(r211.A5z);
                    return;
                }
                return;
            } else if (this instanceof Hilt_NewCommunityAdminBottomSheetFragment) {
                Hilt_NewCommunityAdminBottomSheetFragment hilt_NewCommunityAdminBottomSheetFragment = (Hilt_NewCommunityAdminBottomSheetFragment) this;
                if (!hilt_NewCommunityAdminBottomSheetFragment.A02) {
                    hilt_NewCommunityAdminBottomSheetFragment.A02 = true;
                    NewCommunityAdminBottomSheetFragment newCommunityAdminBottomSheetFragment = (NewCommunityAdminBottomSheetFragment) hilt_NewCommunityAdminBottomSheetFragment;
                    C16150sX r18 = ((C17050uS) ((C17060uT) hilt_NewCommunityAdminBottomSheetFragment.generatedComponent())).A0b;
                    newCommunityAdminBottomSheetFragment.A00 = (C17070uU) r18.ABg.get();
                    newCommunityAdminBottomSheetFragment.A01 = (C17080uV) r18.APK.get();
                    newCommunityAdminBottomSheetFragment.A02 = (C17110uY) r18.ADT.get();
                    newCommunityAdminBottomSheetFragment.A00 = (C23071Aj) r18.AQb.get();
                    newCommunityAdminBottomSheetFragment.A01 = new AnonymousClass3Q6((C17230uk) r18.A4I.get());
                    return;
                }
                return;
            } else if (this instanceof Hilt_JoinGroupBottomSheetFragment) {
                Hilt_JoinGroupBottomSheetFragment hilt_JoinGroupBottomSheetFragment = (Hilt_JoinGroupBottomSheetFragment) this;
                if (!hilt_JoinGroupBottomSheetFragment.A02) {
                    hilt_JoinGroupBottomSheetFragment.A02 = true;
                    JoinGroupBottomSheetFragment joinGroupBottomSheetFragment = (JoinGroupBottomSheetFragment) hilt_JoinGroupBottomSheetFragment;
                    C17050uS r212 = (C17050uS) ((C17060uT) hilt_JoinGroupBottomSheetFragment.generatedComponent());
                    C16150sX r32 = r212.A0b;
                    joinGroupBottomSheetFragment.A00 = (C17070uU) r32.ABg.get();
                    joinGroupBottomSheetFragment.A01 = (C17080uV) r32.APK.get();
                    joinGroupBottomSheetFragment.A0X = (C16440t3) r32.AP2.get();
                    joinGroupBottomSheetFragment.A0R = (C18890xQ) r32.APS.get();
                    joinGroupBottomSheetFragment.A0P = (C14870pt) r32.AB3.get();
                    joinGroupBottomSheetFragment.A0N = (C19980zJ) r32.A0P.get();
                    joinGroupBottomSheetFragment.A0W = (C17200uh) r32.A52.get();
                    joinGroupBottomSheetFragment.A0U = (C17160ud) r32.A4t.get();
                    joinGroupBottomSheetFragment.A0Z = (AnonymousClass013) r32.AR8.get();
                    joinGroupBottomSheetFragment.A0a = (C218115n) r32.AH2.get();
                    joinGroupBottomSheetFragment.A0Y = (C15860rz) r32.AQh.get();
                    joinGroupBottomSheetFragment.A0b = (C217415g) r32.AGv.get();
                    joinGroupBottomSheetFragment.A0O = (AnonymousClass4CZ) r212.A0I.get();
                    return;
                }
                return;
            } else if (this instanceof Hilt_CommunitySubgroupsBottomSheet) {
                Hilt_CommunitySubgroupsBottomSheet hilt_CommunitySubgroupsBottomSheet = (Hilt_CommunitySubgroupsBottomSheet) this;
                if (!hilt_CommunitySubgroupsBottomSheet.A02) {
                    hilt_CommunitySubgroupsBottomSheet.A02 = true;
                    CommunitySubgroupsBottomSheet communitySubgroupsBottomSheet = (CommunitySubgroupsBottomSheet) hilt_CommunitySubgroupsBottomSheet;
                    C17050uS r213 = (C17050uS) ((C17060uT) hilt_CommunitySubgroupsBottomSheet.generatedComponent());
                    C16150sX r33 = r213.A0b;
                    communitySubgroupsBottomSheet.A00 = (C17070uU) r33.ABg.get();
                    communitySubgroupsBottomSheet.A01 = (C17080uV) r33.APK.get();
                    communitySubgroupsBottomSheet.A05 = (C16040sK) r33.ADr.get();
                    communitySubgroupsBottomSheet.A0K = (C16980tz) r33.AQB.get();
                    communitySubgroupsBottomSheet.A0J = (C16440t3) r33.AP2.get();
                    communitySubgroupsBottomSheet.A0W = (C14710pd) r33.A05.get();
                    communitySubgroupsBottomSheet.A04 = (C14870pt) r33.AB3.get();
                    communitySubgroupsBottomSheet.A0Z = (C19990zK) r33.AEZ.get();
                    communitySubgroupsBottomSheet.A0h = (C16320sq) r33.ARB.get();
                    communitySubgroupsBottomSheet.A0N = (C15810rt) r33.A43.get();
                    communitySubgroupsBottomSheet.A06 = (C15900s5) r33.ALm.get();
                    C49132Rg r214 = r213.A0Y;
                    communitySubgroupsBottomSheet.A0X = r214.A0I();
                    communitySubgroupsBottomSheet.A0I = (C17200uh) r33.A52.get();
                    communitySubgroupsBottomSheet.A0R = (C18550ws) r33.ADB.get();
                    communitySubgroupsBottomSheet.A0c = (C218315p) r33.AIL.get();
                    communitySubgroupsBottomSheet.A0E = (C17160ud) r33.A4t.get();
                    communitySubgroupsBottomSheet.A0F = (C16000sG) r33.A4x.get();
                    communitySubgroupsBottomSheet.A01 = (C25731Kx) r33.A54.get();
                    communitySubgroupsBottomSheet.A0O = (C18560wt) r33.A5j.get();
                    communitySubgroupsBottomSheet.A0G = (C16080sP) r33.AQ9.get();
                    communitySubgroupsBottomSheet.A0M = (AnonymousClass013) r33.AR8.get();
                    communitySubgroupsBottomSheet.A0d = (AnonymousClass1DY) r33.A3w.get();
                    communitySubgroupsBottomSheet.A0b = (C18290wS) r33.AIB.get();
                    communitySubgroupsBottomSheet.A09 = (AnonymousClass01Y) r33.A1w.get();
                    communitySubgroupsBottomSheet.A0Y = (C17240ul) r33.ABK.get();
                    communitySubgroupsBottomSheet.A0S = (C19780yz) r33.ADI.get();
                    communitySubgroupsBottomSheet.A0g = new C25781Lc();
                    communitySubgroupsBottomSheet.A0e = (C16220sf) r33.A3y.get();
                    communitySubgroupsBottomSheet.A0f = r33.A1d();
                    communitySubgroupsBottomSheet.A0B = (AnonymousClass1L3) r33.A4N.get();
                    communitySubgroupsBottomSheet.A0T = (AnonymousClass15G) r33.AEe.get();
                    communitySubgroupsBottomSheet.A0U = (AnonymousClass15X) r33.AMk.get();
                    communitySubgroupsBottomSheet.A0L = (C15860rz) r33.AQh.get();
                    communitySubgroupsBottomSheet.A0A = (C17230uk) r33.A4I.get();
                    communitySubgroupsBottomSheet.A0Q = (AnonymousClass195) r33.ACz.get();
                    communitySubgroupsBottomSheet.A0a = (C18090w8) r33.AI6.get();
                    communitySubgroupsBottomSheet.A08 = (C17150uc) r33.A34.get();
                    communitySubgroupsBottomSheet.A0D = C16150sX.A0K(r33);
                    communitySubgroupsBottomSheet.A0P = (C16070sO) r33.ABY.get();
                    communitySubgroupsBottomSheet.A07 = (AnonymousClass15Z) r33.AOg.get();
                    communitySubgroupsBottomSheet.A0V = new C19580yf();
                    communitySubgroupsBottomSheet.A02 = (C50162Yf) r214.A0Z.get();
                    communitySubgroupsBottomSheet.A03 = (C50712aK) r214.A0e.get();
                    return;
                }
                return;
            } else if (this instanceof Hilt_AboutCommunityBottomSheetFragment) {
                Hilt_AboutCommunityBottomSheetFragment hilt_AboutCommunityBottomSheetFragment = (Hilt_AboutCommunityBottomSheetFragment) this;
                if (!hilt_AboutCommunityBottomSheetFragment.A02) {
                    hilt_AboutCommunityBottomSheetFragment.A02 = true;
                    AboutCommunityBottomSheetFragment aboutCommunityBottomSheetFragment = (AboutCommunityBottomSheetFragment) hilt_AboutCommunityBottomSheetFragment;
                    C17050uS r215 = (C17050uS) ((C17060uT) hilt_AboutCommunityBottomSheetFragment.generatedComponent());
                    C16150sX r34 = r215.A0b;
                    aboutCommunityBottomSheetFragment.A00 = (C17070uU) r34.ABg.get();
                    aboutCommunityBottomSheetFragment.A01 = (C17080uV) r34.APK.get();
                    aboutCommunityBottomSheetFragment.A04 = (C14710pd) r34.A05.get();
                    aboutCommunityBottomSheetFragment.A07 = (C17110uY) r34.ADT.get();
                    aboutCommunityBottomSheetFragment.A06 = (C17220uj) r34.A9x.get();
                    aboutCommunityBottomSheetFragment.A03 = (AnonymousClass01V) r34.AOi.get();
                    aboutCommunityBottomSheetFragment.A02 = (AnonymousClass1L3) r34.A4N.get();
                    aboutCommunityBottomSheetFragment.A01 = (C17230uk) r34.A4I.get();
                    aboutCommunityBottomSheetFragment.A00 = (C50132Yc) r215.A0H.get();
                    return;
                }
                return;
            } else if (this instanceof Hilt_MenuBottomSheet) {
                Hilt_MenuBottomSheet hilt_MenuBottomSheet = (Hilt_MenuBottomSheet) this;
                if (!hilt_MenuBottomSheet.A02) {
                    hilt_MenuBottomSheet.A02 = true;
                    r1 = (C17060uT) hilt_MenuBottomSheet.generatedComponent();
                    hilt_SelectListBottomSheet = hilt_MenuBottomSheet;
                } else {
                    return;
                }
            } else if (this instanceof Hilt_LocationOptionPickerFragment) {
                Hilt_LocationOptionPickerFragment hilt_LocationOptionPickerFragment = (Hilt_LocationOptionPickerFragment) this;
                if (!hilt_LocationOptionPickerFragment.A02) {
                    hilt_LocationOptionPickerFragment.A02 = true;
                    LocationOptionPickerFragment locationOptionPickerFragment = (LocationOptionPickerFragment) hilt_LocationOptionPickerFragment;
                    C17050uS r216 = (C17050uS) ((C17060uT) hilt_LocationOptionPickerFragment.generatedComponent());
                    C16150sX r19 = r216.A0b;
                    locationOptionPickerFragment.A00 = (C17070uU) r19.ABg.get();
                    locationOptionPickerFragment.A01 = (C17080uV) r19.APK.get();
                    locationOptionPickerFragment.A01 = new AnonymousClass38W((C25651Kp) r216.A0Y.A1s.A2m.get());
                    return;
                }
                return;
            } else if (this instanceof Hilt_FilterBottomSheetDialogFragment) {
                Hilt_FilterBottomSheetDialogFragment hilt_FilterBottomSheetDialogFragment = (Hilt_FilterBottomSheetDialogFragment) this;
                if (!hilt_FilterBottomSheetDialogFragment.A02) {
                    hilt_FilterBottomSheetDialogFragment.A02 = true;
                    FilterBottomSheetDialogFragment filterBottomSheetDialogFragment = (FilterBottomSheetDialogFragment) hilt_FilterBottomSheetDialogFragment;
                    C17050uS r217 = (C17050uS) ((C17060uT) hilt_FilterBottomSheetDialogFragment.generatedComponent());
                    C16150sX r110 = r217.A0b;
                    filterBottomSheetDialogFragment.A00 = (C17070uU) r110.ABg.get();
                    filterBottomSheetDialogFragment.A01 = (C17080uV) r110.APK.get();
                    filterBottomSheetDialogFragment.A00 = (C82374Co) r217.A0W.get();
                    return;
                }
                return;
            } else if (this instanceof Hilt_OrderDetailFragment) {
                Hilt_OrderDetailFragment hilt_OrderDetailFragment = (Hilt_OrderDetailFragment) this;
                if (!hilt_OrderDetailFragment.A02) {
                    hilt_OrderDetailFragment.A02 = true;
                    OrderDetailFragment orderDetailFragment = (OrderDetailFragment) hilt_OrderDetailFragment;
                    C17050uS r35 = (C17050uS) ((C17060uT) hilt_OrderDetailFragment.generatedComponent());
                    C16150sX r218 = r35.A0b;
                    orderDetailFragment.A00 = (C17070uU) r218.ABg.get();
                    orderDetailFragment.A01 = (C17080uV) r218.APK.get();
                    orderDetailFragment.A0G = (C16440t3) r218.AP2.get();
                    orderDetailFragment.A03 = (C16040sK) r218.ADr.get();
                    orderDetailFragment.A0H = (C16980tz) r218.AQB.get();
                    orderDetailFragment.A0Q = (C16320sq) r218.ARB.get();
                    orderDetailFragment.A09 = (AnonymousClass1Pc) r218.AGi.get();
                    orderDetailFragment.A04 = (C16760tb) r218.APV.get();
                    orderDetailFragment.A0N = (C18630x0) r218.A1m.get();
                    orderDetailFragment.A0M = (C17190ug) r218.AEu.get();
                    orderDetailFragment.A0I = (AnonymousClass013) r218.AR8.get();
                    orderDetailFragment.A0J = (C16490t9) r218.AQz.get();
                    orderDetailFragment.A0B = r35.A01();
                    orderDetailFragment.A0A = (C26771Pb) r218.AGn.get();
                    orderDetailFragment.A0F = (AnonymousClass15I) r218.A3r.get();
                    orderDetailFragment.A07 = (C23081Ak) r218.A3Z.get();
                    orderDetailFragment.A06 = (C17170ue) r218.A3W.get();
                    orderDetailFragment.A05 = (C17150uc) r218.A34.get();
                    orderDetailFragment.A0P = (AnonymousClass1TS) r218.AGj.get();
                    orderDetailFragment.A01 = (C82274Ce) r35.A0C.get();
                    orderDetailFragment.A02 = (C82314Ci) r35.A0N.get();
                    orderDetailFragment.A0O = (C23091Al) r218.A3f.get();
                    return;
                }
                return;
            } else if (this instanceof Hilt_PostcodeChangeBottomSheet) {
                Hilt_PostcodeChangeBottomSheet hilt_PostcodeChangeBottomSheet = (Hilt_PostcodeChangeBottomSheet) this;
                if (!hilt_PostcodeChangeBottomSheet.A02) {
                    hilt_PostcodeChangeBottomSheet.A02 = true;
                    PostcodeChangeBottomSheet postcodeChangeBottomSheet = (PostcodeChangeBottomSheet) hilt_PostcodeChangeBottomSheet;
                    C16150sX r111 = ((C17050uS) ((C17060uT) hilt_PostcodeChangeBottomSheet.generatedComponent())).A0b;
                    postcodeChangeBottomSheet.A00 = (C17070uU) r111.ABg.get();
                    postcodeChangeBottomSheet.A01 = (C17080uV) r111.APK.get();
                    postcodeChangeBottomSheet.A01 = (C14870pt) r111.AB3.get();
                    postcodeChangeBottomSheet.A02 = (C17090uW) r111.ADM.get();
                    postcodeChangeBottomSheet.A06 = (AnonymousClass01V) r111.AOi.get();
                    postcodeChangeBottomSheet.A07 = (C23061Ai) r111.AC0.get();
                    return;
                }
                return;
            } else if (this instanceof Hilt_CartFragment) {
                Hilt_CartFragment hilt_CartFragment = (Hilt_CartFragment) this;
                if (!hilt_CartFragment.A02) {
                    hilt_CartFragment.A02 = true;
                    CartFragment cartFragment = (CartFragment) hilt_CartFragment;
                    C17050uS r219 = (C17050uS) ((C17060uT) hilt_CartFragment.generatedComponent());
                    C16150sX r42 = r219.A0b;
                    cartFragment.A00 = (C17070uU) r42.ABg.get();
                    cartFragment.A01 = (C17080uV) r42.APK.get();
                    cartFragment.A0e = (C16440t3) r42.AP2.get();
                    AnonymousClass01J r5 = r42.A05;
                    cartFragment.A0l = (C14710pd) r5.get();
                    cartFragment.A0v = (C23061Ai) r42.AC0.get();
                    cartFragment.A0E = (C14870pt) r42.AB3.get();
                    cartFragment.A0B = (C16300so) r42.A5p.get();
                    cartFragment.A0x = (C16320sq) r42.ARB.get();
                    cartFragment.A0G = (C16040sK) r42.ADr.get();
                    cartFragment.A0D = (C16180sb) r42.A8b.get();
                    cartFragment.A0j = (C17250um) r42.A7e.get();
                    cartFragment.A0H = (C16760tb) r42.APV.get();
                    cartFragment.A0i = (C206711d) r42.AKp.get();
                    cartFragment.A0I = (C19000xb) r42.AQX.get();
                    cartFragment.A0q = (C18630x0) r42.A1m.get();
                    cartFragment.A0O = (C24511Gf) r42.A3U.get();
                    cartFragment.A0N = (AnonymousClass1KT) r42.A3V.get();
                    cartFragment.A0p = (C17190ug) r42.AEu.get();
                    cartFragment.A0w = (AnonymousClass1A9) r42.AE7.get();
                    cartFragment.A0d = (AnonymousClass01V) r42.AOi.get();
                    cartFragment.A0c = (C16080sP) r42.AQ9.get();
                    cartFragment.A0g = (AnonymousClass013) r42.AR8.get();
                    cartFragment.A0Z = (AnonymousClass01Y) r42.A1w.get();
                    cartFragment.A0a = (C17140ub) r42.A4y.get();
                    cartFragment.A0S = (C28011Tz) r42.AJV.get();
                    cartFragment.A0V = (C23081Ak) r42.A3Z.get();
                    cartFragment.A0T = (C18640x1) r42.A3X.get();
                    cartFragment.A0k = (AnonymousClass1BQ) r42.A7f.get();
                    cartFragment.A0M = (AnonymousClass1KZ) r42.A3c.get();
                    cartFragment.A0b = (C17030uP) r42.APp.get();
                    cartFragment.A0f = (C15860rz) r42.AQh.get();
                    cartFragment.A0Y = new C61713Aa(0);
                    AnonymousClass01J r112 = r42.A34;
                    cartFragment.A0L = (C17150uc) r112.get();
                    cartFragment.A0U = (C17170ue) r42.A3W.get();
                    cartFragment.A0r = (C17020u3) r42.AMG.get();
                    cartFragment.A0o = (C18720x9) r42.AB0.get();
                    cartFragment.A0C = (AnonymousClass4CU) r219.A01.get();
                    cartFragment.A0P = new AnonymousClass2RQ((C17150uc) r112.get(), (C14710pd) r5.get());
                    cartFragment.A0u = (C18750xC) r42.A3g.get();
                    cartFragment.A0s = (AnonymousClass1KW) r42.A3e.get();
                    cartFragment.A0t = (C23091Al) r42.A3f.get();
                    return;
                }
                return;
            } else if (this instanceof Hilt_IntentChooserBottomSheetDialogFragment) {
                Hilt_IntentChooserBottomSheetDialogFragment hilt_IntentChooserBottomSheetDialogFragment = (Hilt_IntentChooserBottomSheetDialogFragment) this;
                if (!hilt_IntentChooserBottomSheetDialogFragment.A02) {
                    hilt_IntentChooserBottomSheetDialogFragment.A02 = true;
                    IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = (IntentChooserBottomSheetDialogFragment) hilt_IntentChooserBottomSheetDialogFragment;
                    C16150sX r113 = ((C17050uS) ((C17060uT) hilt_IntentChooserBottomSheetDialogFragment.generatedComponent())).A0b;
                    intentChooserBottomSheetDialogFragment.A00 = (C17070uU) r113.ABg.get();
                    intentChooserBottomSheetDialogFragment.A01 = (C17080uV) r113.APK.get();
                    intentChooserBottomSheetDialogFragment.A04 = (C14710pd) r113.A05.get();
                    intentChooserBottomSheetDialogFragment.A05 = (C211613a) r113.A1E.get();
                    return;
                }
                return;
            } else if (!this.A02) {
                this.A02 = true;
                r1 = (C17060uT) generatedComponent();
                hilt_SelectListBottomSheet = (RoundedBottomSheetDialogFragment) this;
            } else {
                return;
            }
            C16150sX r220 = ((C17050uS) r1).A0b;
            hilt_SelectListBottomSheet.A00 = (C17070uU) r220.ABg.get();
            hilt_SelectListBottomSheet.A01 = (C17080uV) r220.APK.get();
        }
    }

    public final void A1K() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
