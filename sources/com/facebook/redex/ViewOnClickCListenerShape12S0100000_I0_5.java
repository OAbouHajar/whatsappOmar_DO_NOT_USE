package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass02C;
import X.AnonymousClass12W;
import X.AnonymousClass1WS;
import X.AnonymousClass1ZT;
import X.AnonymousClass29T;
import X.AnonymousClass2DE;
import X.AnonymousClass2DT;
import X.AnonymousClass2GY;
import X.AnonymousClass348;
import X.AnonymousClass3FU;
import X.C101504xQ;
import X.C1033951f;
import X.C1034351j;
import X.C1034751n;
import X.C13680ns;
import X.C14550pN;
import X.C14730pf;
import X.C14750ph;
import X.C15860rz;
import X.C16030sJ;
import X.C16040sK;
import X.C16220sf;
import X.C16620tM;
import X.C17190ug;
import X.C19980zJ;
import X.C210912t;
import X.C28371Vv;
import X.C28381Vw;
import X.C32301g2;
import X.C34791ks;
import X.C35081lL;
import X.C38701rH;
import X.C453428a;
import X.C49142Rh;
import X.C49152Ri;
import X.C62053Bl;
import X.C63073Ga;
import X.C74453qZ;
import X.C87584Xn;
import X.C88094Zw;
import X.C88104Zx;
import X.C91484fz;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.SingleSelectionDialogFragment;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.components.WaSwitchView;
import com.obwhatsapp.registration.RequestOtpCodeBottomSheetFragment;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import com.obwhatsapp.registration.VerifyTwoFactorAuth;
import com.obwhatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity;
import com.obwhatsapp.report.BusinessActivityReportViewModel;
import com.obwhatsapp.report.DeleteReportConfirmationDialogFragment;
import com.obwhatsapp.report.ReportActivity;
import com.obwhatsapp.search.SearchFragment;
import com.obwhatsapp.search.SearchViewModel;
import com.obwhatsapp.search.views.TokenizedSearchInput;
import com.obwhatsapp.search.views.itemviews.VoiceNoteProfileAvatarView;
import com.obwhatsapp.settings.PhotoQualityConfirmationDialogFragment;
import com.obwhatsapp.settings.SettingsAccount;
import com.obwhatsapp.settings.SettingsChat;
import com.obwhatsapp.settings.SettingsCompanionLogoutDialog;
import com.obwhatsapp.settings.SettingsDataUsageActivity;
import com.obwhatsapp.settings.SettingsPrivacy;
import com.obwhatsapp.settings.VideoQualityConfirmationDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

public class ViewOnClickCListenerShape12S0100000_I0_5 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape12S0100000_I0_5(TokenizedSearchInput tokenizedSearchInput, int i2) {
        this.A01 = i2;
        switch (i2) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                this.A00 = tokenizedSearchInput;
                return;
            default:
                this.A00 = tokenizedSearchInput;
                return;
        }
    }

    public ViewOnClickCListenerShape12S0100000_I0_5(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        boolean z2;
        C38701rH r7;
        switch (this.A01) {
            case 0:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A00;
                verifyPhoneNumber.Afc(RequestOtpCodeBottomSheetFragment.A01(verifyPhoneNumber.A39(), verifyPhoneNumber.A0B, verifyPhoneNumber.A0C, verifyPhoneNumber.A0D, verifyPhoneNumber.A48()));
                return;
            case 1:
                Log.i("VerifyPhoneNumber/clicked voice call button");
                ((VerifyPhoneNumber) this.A00).A3B();
                return;
            case 2:
                VerifyPhoneNumber verifyPhoneNumber2 = (VerifyPhoneNumber) this.A00;
                Log.i("verifyvoice/retryverify");
                String code = verifyPhoneNumber2.A0V.getCode();
                verifyPhoneNumber2.A0Q.setVisibility(4);
                verifyPhoneNumber2.A3q(code);
                return;
            case 3:
                ((DialogFragment) this.A00).A1C();
                return;
            case 4:
                ((VerifyTwoFactorAuth) ((AnonymousClass01A) this.A00).A0C()).A36(1, (String) null, false);
                return;
            case 5:
                VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) ((AnonymousClass01A) this.A00).A0C();
                verifyTwoFactorAuth.Afb(VerifyTwoFactorAuth.ConfirmWipe.A01(verifyTwoFactorAuth.A35()), (String) null);
                return;
            case 6:
                ((OldDeviceSecureAccountActivity) this.A00).navigateTo2FactorAuthSetup(view);
                return;
            case 7:
                ((Activity) this.A00).finish();
                return;
            case 8:
                ReportActivity reportActivity = (ReportActivity) this.A00;
                if (reportActivity.A05.A0O()) {
                    DeleteReportConfirmationDialogFragment deleteReportConfirmationDialogFragment = new DeleteReportConfirmationDialogFragment();
                    deleteReportConfirmationDialogFragment.A00 = new C1033951f(reportActivity);
                    reportActivity.Afb(deleteReportConfirmationDialogFragment, (String) null);
                    return;
                }
                return;
            case 9:
                BusinessActivityReportViewModel businessActivityReportViewModel = ((ReportActivity) this.A00).A0L;
                if (businessActivityReportViewModel.A03.A0O()) {
                    businessActivityReportViewModel.A01.A0B(1);
                    C63073Ga r9 = businessActivityReportViewModel.A0D;
                    if (r9.A04.A0A()) {
                        C17190ug r8 = r9.A06;
                        String A02 = r8.A02();
                        C28371Vv r4 = new C28371Vv("p2b", new C35081lL[]{new C35081lL("action", "request"), new C35081lL("lang", r9.A05.A06())});
                        C16040sK r0 = r9.A03;
                        r0.A0B();
                        AnonymousClass1ZT r02 = r0.A05;
                        AnonymousClass00B.A06(r02);
                        r8.A0B(r9, new C28371Vv(r4, "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("from", r02.getRawString()), new C35081lL("xmlns", "w:biz:p2b_report"), new C35081lL("type", "get"), new C35081lL("smax_id", "33"), new C35081lL("id", A02)}), A02, 267, 32000);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    StringBuilder sb = new StringBuilder("app/sendRequestReport success:");
                    sb.append(z2);
                    Log.i(sb.toString());
                    return;
                }
                return;
            case 10:
                ((SearchFragment) this.A00).A1L.A0X(true);
                return;
            case 11:
                ((TokenizedSearchInput) this.A00).setFocus(1);
                return;
            case 12:
                ((TokenizedSearchInput) this.A00).setFocus(0);
                return;
            case 13:
                SearchViewModel searchViewModel = ((TokenizedSearchInput) this.A00).A0C;
                if (searchViewModel != null) {
                    searchViewModel.A0l.A06("user_grid_view_choice", Boolean.valueOf(!searchViewModel.A0b()));
                    return;
                }
                return;
            case 14:
                ((TokenizedSearchInput) this.A00).setFocus(2);
                return;
            case 15:
                ((TokenizedSearchInput) this.A00).setFocus(3);
                return;
            case 16:
                SearchViewModel searchViewModel2 = ((TokenizedSearchInput) this.A00).A0C;
                searchViewModel2.A0G();
                searchViewModel2.A0Y(true);
                return;
            case 17:
                C49142Rh r03 = (C49142Rh) this.A00;
                r03.A07.A00(r03.A09);
                return;
            case 18:
                C49152Ri r42 = (C49152Ri) this.A00;
                if (RequestPermissionActivity.A0X(r42.getContext(), r42.A04) && (r7 = r42.A09) != null) {
                    if (C62053Bl.A04(r42.getContext(), r42.A00, r7, new C1034351j(r42), r42.A0A, r42.A0B)) {
                        if (r42.A05.A0E(C16620tM.A02, 931) && r42.A03.A0C()) {
                            AnonymousClass2DE.A0A(r42.A03, r42.A0C);
                        }
                        if (r42 instanceof C49142Rh) {
                            C49142Rh r43 = (C49142Rh) r42;
                            AnonymousClass2DT A002 = r43.A04.A00(C19980zJ.A00(r43.getContext()), r43.A09, false);
                            A002.A0D(r43.A09);
                            boolean z3 = r43.A0D;
                            A002.A0G(z3);
                            if (z3 && A002.A0w) {
                                VoiceNoteProfileAvatarView voiceNoteProfileAvatarView = r43.A0A;
                                int i2 = AnonymousClass2DT.A0x;
                                C28381Vw r04 = r43.A09.A11;
                                boolean z4 = r04.A02;
                                boolean A0L = C16030sJ.A0L(r04.A00);
                                int i3 = 1;
                                if (i2 != 0) {
                                    i3 = 2;
                                    if (i2 != 1) {
                                        if (i2 == 2) {
                                            i3 = 3;
                                        } else {
                                            throw AnonymousClass000.A0T(C13680ns.A0c(i2, "Unsupported FastPlaybackPlayerState "));
                                        }
                                    }
                                }
                                voiceNoteProfileAvatarView.A01(i3, true, z4, A0L);
                            }
                            r43.A02();
                            return;
                        }
                        AnonymousClass348 r44 = (AnonymousClass348) r42;
                        AnonymousClass2DT A003 = r44.A01.A00(C19980zJ.A00(r44.getContext()), r44.A09, false);
                        A003.A0L = new C101504xQ(r44);
                        A003.A0D(r44.A09);
                        A003.A0G(false);
                        r44.A02();
                        return;
                    }
                    return;
                }
                return;
            case 19:
                Context context = (Context) this.A00;
                Intent intent = new Intent();
                intent.setClassName(context.getPackageName(), "com.obwhatsapp.account.delete.DeleteAccountActivity");
                context.startActivity(intent);
                return;
            case 20:
                C14550pN r5 = (C14550pN) this.A00;
                if (r5.A0C.A0E(C16620tM.A02, 2489)) {
                    new SettingsCompanionLogoutDialog().A1G(r5.AGM(), (String) null);
                    return;
                } else if (!AnonymousClass29T.A03(r5)) {
                    AnonymousClass02C AGM = r5.AGM();
                    IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(r5, 98);
                    C91484fz r2 = C91484fz.A00;
                    LegacyMessageDialogFragment legacyMessageDialogFragment = new LegacyMessageDialogFragment();
                    Bundle A004 = C87584Xn.A00(new Object[0], -1, 0, R.string.str1cf9, R.string.str1ba6, R.string.str0de3, -1);
                    legacyMessageDialogFragment.A00 = iDxCListenerShape128S0100000_2_I1;
                    legacyMessageDialogFragment.A01 = r2;
                    legacyMessageDialogFragment.A0T(A004);
                    C453428a.A00(legacyMessageDialogFragment, AGM);
                    return;
                } else {
                    return;
                }
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                SettingsAccount settingsAccount = (SettingsAccount) this.A00;
                C74453qZ r1 = new C74453qZ();
                r1.A00 = 11;
                settingsAccount.A01.A04(r1);
                Intent intent2 = new Intent();
                intent2.setClassName(settingsAccount.getPackageName(), "com.obwhatsapp.settings.SettingsPrivacy");
                settingsAccount.startActivity(intent2);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                Context context2 = (Context) this.A00;
                Intent intent3 = new Intent();
                intent3.setClassName(context2.getPackageName(), "com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity");
                context2.startActivity(intent3);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                Context context3 = (Context) this.A00;
                Intent intent4 = new Intent();
                intent4.setClassName(context3.getPackageName(), "com.obwhatsapp.report.ReportActivity");
                context3.startActivity(intent4);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                Context context4 = (Context) this.A00;
                context4.startActivity(C14750ph.A00(context4));
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                Context context5 = (Context) this.A00;
                Intent intent5 = new Intent();
                intent5.setClassName(context5.getPackageName(), "com.obwhatsapp.settings.SettingsSecurity");
                context5.startActivity(intent5);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                ((WaSwitchView) this.A00).A02.toggle();
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                SettingsChat settingsChat = (SettingsChat) this.A00;
                settingsChat.A02.toggle();
                boolean isChecked = settingsChat.A02.isChecked();
                C16220sf r3 = settingsChat.A0E;
                int i4 = 1;
                if (isChecked) {
                    i4 = 2;
                }
                AnonymousClass1WS A07 = r3.A07("individual_chat_defaults");
                if (i4 != A07.A01) {
                    A07.A01 = i4;
                    r3.A0K(A07);
                }
                if (isChecked) {
                    settingsChat.A05.Acl(new RunnableRunnableShape14S0100000_I0_13((Object) settingsChat.A04, 26));
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                Context context6 = (Context) this.A00;
                Intent intent6 = new Intent();
                intent6.setClassName(context6.getPackageName(), "com.obwhatsapp.settings.SettingsChatHistory");
                context6.startActivity(intent6);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                SettingsChat settingsChat2 = (SettingsChat) this.A00;
                settingsChat2.A01.toggle();
                C15860rz r12 = settingsChat2.A09;
                r12.A0K().putBoolean("input_enter_send", settingsChat2.A01.isChecked()).apply();
                return;
            case 30:
                SettingsChat settingsChat3 = (SettingsChat) this.A00;
                AnonymousClass12W r05 = settingsChat3.A06;
                C32301g2 r13 = settingsChat3.A0K;
                if (r05.A04(r13) && settingsChat3.A06.A03(r13)) {
                    AnonymousClass2GY r22 = new AnonymousClass2GY();
                    r22.A04 = Long.valueOf(System.currentTimeMillis());
                    r22.A03 = 0;
                    C210912t r92 = settingsChat3.A08;
                    C14730pf r82 = settingsChat3.A06;
                    SettingsChat settingsChat4 = settingsChat3;
                    r92.A01(new AnonymousClass3FU(settingsChat3, settingsChat4, settingsChat3.A03, settingsChat3.A07, settingsChat3.A01, r82, r92, new C1034751n(r22, settingsChat3)), 3000);
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                Context context7 = (Context) this.A00;
                Intent className = new Intent().setClassName(context7.getPackageName(), "com.obwhatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity");
                className.putExtra("chat_jid", (String) null);
                context7.startActivity(className);
                return;
            case 32:
                SettingsChat settingsChat5 = (SettingsChat) this.A00;
                settingsChat5.A0A.A01(settingsChat5);
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                Context context8 = (Context) this.A00;
                Intent intent7 = new Intent();
                intent7.setClassName(context8.getPackageName(), "com.obwhatsapp.migration.transfer.ui.DeviceTransferActivity");
                intent7.putExtra("is_donor", true);
                context8.startActivity(intent7);
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                SettingsChat settingsChat6 = (SettingsChat) this.A00;
                settingsChat6.Afc(SingleSelectionDialogFragment.A02(1, R.string.str1547, settingsChat6.A35(settingsChat6.A0J), R.array.notification_template_part_time));
                return;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                Context context9 = (Context) this.A00;
                Intent intent8 = new Intent();
                intent8.setClassName(context9.getPackageName(), "com.obwhatsapp.backup.google.SettingsGoogleDrive");
                context9.startActivity(intent8);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                SettingsDataUsageActivity settingsDataUsageActivity = (SettingsDataUsageActivity) this.A00;
                settingsDataUsageActivity.A0D.toggle();
                C15860rz r14 = settingsDataUsageActivity.A09;
                r14.A0K().putBoolean("voip_low_data_usage", settingsDataUsageActivity.A0D.isChecked()).apply();
                return;
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                ((SettingsDataUsageActivity) this.A00).A39("autodownload_roaming_mask");
                return;
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                Context context10 = (Context) this.A00;
                Intent intent9 = new Intent();
                intent9.setClassName(context10.getPackageName(), "com.obwhatsapp.settings.SettingsNetworkUsage");
                context10.startActivity(intent9);
                return;
            case 39:
                Context context11 = (Context) this.A00;
                Intent intent10 = new Intent();
                intent10.setClassName(context11.getPackageName(), "com.obwhatsapp.settings.SettingsUserProxyActivity");
                context11.startActivity(intent10);
                return;
            case 40:
                ((SettingsDataUsageActivity) this.A00).A39("autodownload_cellular_mask");
                return;
            case 41:
                ((SettingsDataUsageActivity) this.A00).A39("autodownload_wifi_mask");
                return;
            case 42:
                SettingsDataUsageActivity settingsDataUsageActivity2 = (SettingsDataUsageActivity) this.A00;
                C88094Zw r32 = settingsDataUsageActivity2.A0F;
                int i5 = ((SharedPreferences) r32.A01.A01.get()).getInt("photo_quality", 0);
                String[] A0U = r32.A02.A0U(C88094Zw.A03);
                PhotoQualityConfirmationDialogFragment photoQualityConfirmationDialogFragment = new PhotoQualityConfirmationDialogFragment();
                photoQualityConfirmationDialogFragment.A0T(SingleSelectionDialogFragment.A01(A0U, 6, i5, R.string.str159f));
                settingsDataUsageActivity2.Afc(photoQualityConfirmationDialogFragment);
                return;
            case 43:
                SettingsDataUsageActivity settingsDataUsageActivity3 = (SettingsDataUsageActivity) this.A00;
                C88104Zx r33 = settingsDataUsageActivity3.A0H;
                int i6 = ((SharedPreferences) r33.A01.A01.get()).getInt("video_quality", 0);
                String[] A0U2 = r33.A02.A0U(C88104Zx.A03);
                VideoQualityConfirmationDialogFragment videoQualityConfirmationDialogFragment = new VideoQualityConfirmationDialogFragment();
                videoQualityConfirmationDialogFragment.A0T(SingleSelectionDialogFragment.A01(A0U2, 5, i6, R.string.str15e3));
                settingsDataUsageActivity3.Afc(videoQualityConfirmationDialogFragment);
                return;
            case 44:
                SettingsPrivacy settingsPrivacy = (SettingsPrivacy) this.A00;
                settingsPrivacy.A3C(7, 0);
                Intent intent11 = new Intent();
                intent11.setClassName(settingsPrivacy.getPackageName(), "com.obwhatsapp.location.LiveLocationPrivacyActivity");
                settingsPrivacy.startActivity(intent11);
                return;
            case 45:
                SettingsPrivacy settingsPrivacy2 = (SettingsPrivacy) this.A00;
                settingsPrivacy2.A3C(3, 0);
                Intent intent12 = new Intent();
                intent12.setClassName(settingsPrivacy2.getPackageName(), "com.obwhatsapp.group.GroupAddPrivacyActivity");
                settingsPrivacy2.startActivityForResult(intent12, 1);
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                SettingsPrivacy settingsPrivacy3 = (SettingsPrivacy) this.A00;
                settingsPrivacy3.A3C(6, 0);
                Intent intent13 = new Intent();
                intent13.setClassName(settingsPrivacy3.getPackageName(), "com.obwhatsapp.blocklist.BlockList");
                settingsPrivacy3.startActivity(intent13);
                return;
            case 47:
                SettingsPrivacy settingsPrivacy4 = (SettingsPrivacy) this.A00;
                settingsPrivacy4.A3C(0, 0);
                settingsPrivacy4.startActivityForResult(new Intent().setClassName(settingsPrivacy4, "com.obwhatsapp.lastseen.TrustedContactsPresencePrivacyActivity"), 3);
                return;
            case 48:
                SettingsPrivacy settingsPrivacy5 = (SettingsPrivacy) this.A00;
                settingsPrivacy5.A3C(1, 0);
                settingsPrivacy5.startActivityForResult(new Intent().setClassName(settingsPrivacy5, "com.obwhatsapp.profile.ProfilePhotoPrivacyActivity"), 4);
                return;
            default:
                SettingsPrivacy settingsPrivacy6 = (SettingsPrivacy) this.A00;
                settingsPrivacy6.A3C(11, 0);
                Intent intent14 = new Intent();
                intent14.setClassName(settingsPrivacy6.getPackageName(), "com.obwhatsapp.authentication.AppAuthSettingsActivity");
                settingsPrivacy6.startActivity(intent14);
                return;
        }
    }
}
