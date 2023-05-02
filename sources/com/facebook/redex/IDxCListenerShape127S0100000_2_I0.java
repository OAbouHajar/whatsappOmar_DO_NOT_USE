package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass05J;
import X.AnonymousClass1ZF;
import X.AnonymousClass1yV;
import X.AnonymousClass291;
import X.AnonymousClass29S;
import X.AnonymousClass29T;
import X.AnonymousClass2AS;
import X.AnonymousClass2EA;
import X.AnonymousClass2F3;
import X.AnonymousClass2KS;
import X.AnonymousClass2R7;
import X.AnonymousClass2RY;
import X.AnonymousClass2Sv;
import X.AnonymousClass2VO;
import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.AnonymousClass47O;
import X.AnonymousClass51M;
import X.AnonymousClass5PJ;
import X.AnonymousClass5SB;
import X.AnonymousClass5SC;
import X.C000900k;
import X.C001000l;
import X.C001100m;
import X.C004101u;
import X.C1033651c;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14550pN;
import X.C14570pP;
import X.C14750ph;
import X.C14860ps;
import X.C15830rv;
import X.C16010sH;
import X.C16050sL;
import X.C16740tZ;
import X.C17240ul;
import X.C19980zJ;
import X.C24561Gk;
import X.C26841Pl;
import X.C26851Pm;
import X.C34841kx;
import X.C41551w9;
import X.C42821yj;
import X.C49712Vf;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment;
import com.obwhatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.obwhatsapp.Main;
import com.obwhatsapp.MuteDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.obwhatsapp.calling.callhistory.CallLogActivity;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.community.CommunityExitDialogFragment;
import com.obwhatsapp.companiondevice.LinkedDevicesActivity;
import com.obwhatsapp.companiondevice.WifiSpeedBumpDialogFragment;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.group.GroupSettingsLayoutV1$AdminSettingsDialogFragment;
import com.obwhatsapp.jobqueue.job.SendStatusPrivacyListJob;
import com.obwhatsapp.migration.export.ui.ExportMigrationActivity;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.registration.ChangeNumber;
import com.obwhatsapp.registration.EULA;
import com.obwhatsapp.registration.RegisterName;
import com.obwhatsapp.registration.RegisterPhone;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity;
import com.obwhatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel;
import com.obwhatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment;
import com.obwhatsapp.settings.SettingsCompanionLogoutDialog;
import com.obwhatsapp.status.playback.MessageReplyActivity;
import com.obwhatsapp.status.posting.FirstStatusConfirmationDialogFragment;
import com.obwhatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.obwhatsapp.twofactor.SetEmailFragment;
import com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.DocumentWarningDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.wawebrtc.MediaCodecVideoEncoder;

public class IDxCListenerShape127S0100000_2_I0 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape127S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.A01) {
            case 8:
                AnonymousClass29T.A00((Activity) this.A00, 500);
                return;
            case 9:
                DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment = (DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment) this.A00;
                C001000l A0C = displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A0C();
                if (A0C != null) {
                    int i3 = displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A06;
                    boolean z2 = true;
                    if (i3 == 0 || i3 == 1 || i3 == 7 || i3 == 8 || i3 == 9) {
                        z2 = false;
                    }
                    if (z2) {
                        Log.i(C13680ns.A0c(i3, "companionmodeincorrectaccess/registration in progress state="));
                        A0C.startActivity(C14750ph.A01(A0C));
                        A0C.setResult(0);
                        A0C.finishAffinity();
                        return;
                    }
                    Log.i(C13680ns.A0c(i3, "companionmodeincorrectaccess/deregister state="));
                    displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A05.Aco(new RunnableRunnableShape1S0100000_I0((Object) displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment, 30));
                    displayExceptionDialogFactory$CompanionModeIncorrectAccessFragment.A00.A08(0, R.string.str0c9b);
                    return;
                }
                return;
            case 10:
                DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) this.A00;
                Log.i("loggedout/ok/tos");
                displayExceptionDialogFactory$LoginFailedDialogFragment.A02.A01();
                C001000l A0C2 = displayExceptionDialogFactory$LoginFailedDialogFragment.A0C();
                if (A0C2 != null) {
                    displayExceptionDialogFactory$LoginFailedDialogFragment.A02.A0A(0);
                    A0C2.startActivity(C14750ph.A01(A0C2));
                    A0C2.setResult(0);
                    A0C2.finishAffinity();
                    return;
                }
                return;
            case 11:
            case 134:
                ((DialogFragment) this.A00).A1D();
                return;
            case 12:
                Main main = (Main) this.A00;
                try {
                    boolean createNewFile = main.A03.A02.A07("OBWhatsApp.upgrade").createNewFile();
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("upgrade sentinel file created; success=");
                    A0o.append(createNewFile);
                    C13680ns.A1V(A0o);
                } catch (IOException e2) {
                    Log.e("upgrade/sentinel/fail", e2);
                }
                AnonymousClass29T.A00(main, 0);
                main.A39();
                return;
            case 13:
                Activity activity = (Activity) this.A00;
                activity.startActivity(C13700nu.A02("android.intent.action.VIEW").setDataAndType((Uri) null, "application/vnd.android.package-archive").setFlags(1));
                AnonymousClass29T.A00(activity, 0);
                activity.finish();
                return;
            case 14:
                ((MuteDialogFragment) this.A00).A00 = i2;
                return;
            case 15:
                AnonymousClass29T.A00((Activity) this.A00, 115);
                return;
            case 16:
                Activity activity2 = ((AnonymousClass2RY) this.A00).A01;
                AnonymousClass29T.A00(activity2, 103);
                AnonymousClass29T.A01(activity2, 106);
                return;
            case 17:
                AnonymousClass2RY r2 = (AnonymousClass2RY) this.A00;
                AnonymousClass29T.A00(r2.A01, 106);
                Log.i("restore>VerifyMessageStoreHelper/dialog/checknorestore/skiprestore");
                r2.A00 = false;
                r2.A03(false, false);
                return;
            case 18:
                AnonymousClass2RY r22 = (AnonymousClass2RY) this.A00;
                AnonymousClass29T.A00(r22.A01, 107);
                r22.A00 = false;
                r22.A03(false, false);
                return;
            case 19:
                AnonymousClass2RY r23 = (AnonymousClass2RY) this.A00;
                AnonymousClass29T.A00(r23.A01, 107);
                if (r23.A07.A03(r23.A06)) {
                    r23.A02();
                    return;
                }
                return;
            case 20:
                AnonymousClass2RY r24 = (AnonymousClass2RY) this.A00;
                AnonymousClass29T.A00(r24.A01, 103);
                r24.A00 = true;
                r24.A03(true, false);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                AnonymousClass2RY r25 = (AnonymousClass2RY) this.A00;
                AnonymousClass29T.A00(r25.A01, 106);
                Log.i("restore>VerifyMessageStoreHelper/dialog/checknorestore/restore");
                r25.A00 = true;
                r25.A03(true, false);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                ((AnonymousClass2RY) this.A00).A01.finish();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                AnonymousClass2RY r26 = (AnonymousClass2RY) this.A00;
                AnonymousClass29T.A00(r26.A01, 105);
                Log.i("restore>VerifyMessageStoreHelper/dialog/restoreduetoerror/restore");
                r26.A00 = true;
                r26.A03(true, false);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                Activity activity3 = ((AnonymousClass2RY) this.A00).A01;
                AnonymousClass29T.A00(activity3, 105);
                Log.i("restore>VerifyMessageStoreHelper/dialog/restoreduetoerror/skiprestore");
                AnonymousClass29T.A01(activity3, 106);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                ((Context) this.A00).startActivity(C13700nu.A02("android.settings.INTERNAL_STORAGE_SETTINGS"));
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                ((DialogInterface.OnCancelListener) this.A00).onCancel(dialogInterface);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                AnonymousClass29T.A00((Activity) this.A00, 106);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                AnonymousClass3K4.A0y(this.A00);
                return;
            case 30:
                ((C001100m) this.A00).startActivityForResult(C13700nu.A02("android.settings.LOCATION_SOURCE_SETTINGS"), 35);
                dialogInterface.dismiss();
                return;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                ((DirectorySetLocationMapActivity) this.A00).A35();
                return;
            case 32:
                AnonymousClass2R7 r3 = (AnonymousClass2R7) this.A00;
                r3.A07.startActivityForResult(C13700nu.A02("android.settings.LOCATION_SOURCE_SETTINGS"), 0);
                AnonymousClass29T.A00(r3.A07, 2);
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                AnonymousClass29T.A00((Activity) this.A00, 2);
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                AnonymousClass29T.A00(callLogActivity, 1);
                callLogActivity.A37(true);
                return;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                CallLogActivity callLogActivity2 = (CallLogActivity) this.A00;
                AnonymousClass29T.A00(callLogActivity2, 1);
                callLogActivity2.A37(false);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                AnonymousClass29T.A00((Activity) this.A00, 4);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                AnonymousClass29T.A00((Activity) this.A00, 6);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                AnonymousClass29T.A00(listChatInfoActivity, 6);
                C16010sH r32 = listChatInfoActivity.A0K;
                C17240ul r27 = listChatInfoActivity.A0H;
                C34841kx A3M = listChatInfoActivity.A3M();
                Jid A08 = r32.A08(UserJid.class);
                AnonymousClass00B.A06(A08);
                r27.A0M(A3M, Collections.singletonList(A08));
                listChatInfoActivity.A0b.remove(r32);
                listChatInfoActivity.A3P();
                listChatInfoActivity.A3T();
                return;
            case 39:
                CommunityExitDialogFragment communityExitDialogFragment = (CommunityExitDialogFragment) this.A00;
                Context A0u = communityExitDialogFragment.A0u();
                if (A0u != null) {
                    C19980zJ r4 = communityExitDialogFragment.A00;
                    C16050sL r33 = communityExitDialogFragment.A05;
                    Intent A09 = C13680ns.A09();
                    A09.setClassName(A0u.getPackageName(), "com.obwhatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity");
                    A09.putExtra("parent_group_jid", r33.getRawString());
                    r4.A06(A0u, A09);
                    return;
                }
                return;
            case 40:
            case 41:
            case 65:
            case 66:
            case 132:
                AnonymousClass3K4.A0z(this.A00);
                return;
            case 42:
                ((AnonymousClass2AS) this.A00).A05();
                return;
            case 43:
            case 78:
            case 79:
                ((Runnable) this.A00).run();
                return;
            case 44:
                ((AnonymousClass2VO) this.A00).A01.run();
                return;
            case 45:
                ((AnonymousClass2VO) this.A00).A00.run();
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                LinkedDevicesActivity linkedDevicesActivity = (LinkedDevicesActivity) this.A00;
                linkedDevicesActivity.startActivity(C13690nt.A0B(linkedDevicesActivity.A0I.A05("download-and-installation", "about-linked-devices")));
                return;
            case 47:
                C001100m r34 = (C001100m) this.A00;
                r34.startActivityForResult(C13680ns.A09().setClassName(r34.getPackageName(), "com.obwhatsapp.companiondevice.optin.ui.ForcedOptInActivity"), 100);
                return;
            case 48:
                C49712Vf r0 = ((WifiSpeedBumpDialogFragment) this.A00).A00.A00;
                r0.A05.A05(r0.A08.A01());
                return;
            case 49:
                ContactPickerFragment.A04((ContactPickerFragment) this.A00);
                return;
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                AnonymousClass29T.A00(contactPickerFragment.A0C(), 1);
                contactPickerFragment.A1e((C16010sH) null);
                return;
            case 51:
                ContactPickerFragment contactPickerFragment2 = (ContactPickerFragment) this.A00;
                AnonymousClass29T.A00(contactPickerFragment2.A0C(), 1);
                AnonymousClass05J r02 = contactPickerFragment2.A0J;
                if (r02 != null) {
                    r02.A05();
                    return;
                }
                return;
            case 52:
                AnonymousClass29T.A00(((AnonymousClass01A) this.A00).A0C(), 3);
                return;
            case 53:
                ContactPickerFragment.A03((ContactPickerFragment) this.A00);
                return;
            case 54:
                AnonymousClass29T.A00(((AnonymousClass01A) this.A00).A0C(), 2);
                return;
            case 55:
                C42821yj r28 = (C42821yj) this.A00;
                r28.A3r.A01(1);
                AnonymousClass1yV r42 = r28.A22;
                Intent A092 = C13680ns.A09();
                A092.setClassName(((Context) r42).getPackageName(), "com.obwhatsapp.greenalert.GreenAlertActivity");
                A092.putExtra("page", 0);
                r42.startActivity(A092);
                return;
            case 56:
                ((C42821yj) this.A00).A3r.A01(2);
                return;
            case 57:
                AnonymousClass29T.A00(((AnonymousClass2KS) this.A00).A03, 8);
                return;
            case 58:
                AnonymousClass29T.A00(((AnonymousClass2KS) this.A00).A03, 17);
                return;
            case 59:
                AnonymousClass2KS r43 = (AnonymousClass2KS) this.A00;
                C000900k r35 = r43.A03;
                AnonymousClass29T.A00(r35, 9);
                try {
                    r35.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(AnonymousClass000.A0h(C24561Gk.A01(r43.A0M.A01(r43.A0X)), AnonymousClass000.A0r("tel:")))));
                    return;
                } catch (ActivityNotFoundException unused) {
                    r43.A07.A09(R.string.str00a0, 0);
                    return;
                }
            case 60:
                AnonymousClass29T.A00(((AnonymousClass2KS) this.A00).A03, 9);
                return;
            case 61:
                AnonymousClass29T.A00(((AnonymousClass2KS) this.A00).A03, 7);
                return;
            case 62:
                C000900k r1 = ((AnonymousClass2KS) this.A00).A03;
                r1.startActivity(C13700nu.A02("android.settings.LOCATION_SOURCE_SETTINGS"));
                AnonymousClass29T.A00(r1, 2);
                return;
            case 63:
                AnonymousClass2KS r29 = (AnonymousClass2KS) this.A00;
                r29.A0H.A00.A0m(true);
                AnonymousClass29T.A00(r29.A03, 17);
                return;
            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                AnonymousClass29T.A00(((AnonymousClass2KS) this.A00).A03, 12);
                return;
            case 67:
                ((AnonymousClass5PJ) this.A00).A6E();
                dialogInterface.dismiss();
                return;
            case 68:
                dialogInterface.dismiss();
                ((AnonymousClass5PJ) this.A00).A6E();
                dialogInterface.dismiss();
                return;
            case 69:
                AnonymousClass29T.A00((Activity) this.A00, 6);
                return;
            case 70:
                AnonymousClass29T.A00((Activity) this.A00, 5);
                return;
            case 71:
                GroupSettingsLayoutV1$AdminSettingsDialogFragment groupSettingsLayoutV1$AdminSettingsDialogFragment = (GroupSettingsLayoutV1$AdminSettingsDialogFragment) this.A00;
                if (groupSettingsLayoutV1$AdminSettingsDialogFragment.A02.A0A()) {
                    groupSettingsLayoutV1$AdminSettingsDialogFragment.A1R(groupSettingsLayoutV1$AdminSettingsDialogFragment.A0D[0]);
                } else {
                    groupSettingsLayoutV1$AdminSettingsDialogFragment.A00.A09(R.string.str0474, 0);
                }
                groupSettingsLayoutV1$AdminSettingsDialogFragment.A1C();
                return;
            case AnonymousClass2EA.A02:
                dialogInterface.dismiss();
                ((Activity) this.A00).finish();
                return;
            case 73:
                AnonymousClass291 r36 = (AnonymousClass291) this.A00;
                r36.A0E.startActivityForResult(C13700nu.A02("android.settings.LOCATION_SOURCE_SETTINGS"), 0);
                AnonymousClass29T.A00(r36.A0E, 2);
                return;
            case 74:
                AnonymousClass291 r210 = (AnonymousClass291) this.A00;
                AnonymousClass29T.A00(r210.A0E, 0);
                C15830rv r12 = r210.A0c;
                if (r12 != null) {
                    r210.A1K.A0O(r12);
                    return;
                }
                return;
            case 75:
                C14550pN r37 = (C14550pN) this.A00;
                r37.A09.A1M(true);
                r37.A05.Acl(new RunnableRunnableShape10S0100000_I0_9((Object) r37, 22));
                return;
            case 76:
                AnonymousClass29S r38 = (AnonymousClass29S) this.A00;
                r38.A0Y.startActivityForResult(C13700nu.A02("android.settings.LOCATION_SOURCE_SETTINGS"), 0);
                AnonymousClass29T.A00(r38.A0Y, 2);
                return;
            case CallsPrivacy.NOINTERNET_CALLING /*77*/:
                ExportMigrationActivity exportMigrationActivity = (ExportMigrationActivity) this.A00;
                exportMigrationActivity.A0I.A00(exportMigrationActivity.A0J, 9);
                return;
            case 80:
                C14570pP r39 = (C14570pP) this.A00;
                r39.A05.Acl(new RunnableRunnableShape11S0100000_I0_10((Object) r39, 37));
                r39.startActivity(C14750ph.A04(r39));
                r39.finish();
                return;
            case 81:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                AnonymousClass3K3.A0z(popupNotification, popupNotification.A0Q, popupNotification.A0q);
                AnonymousClass29T.A00(popupNotification, 106);
                return;
            case 82:
                AnonymousClass29T.A00((Activity) this.A00, 106);
                return;
            case 83:
                AnonymousClass01A r310 = (AnonymousClass01A) this.A00;
                Context A02 = r310.A02();
                Intent A093 = C13680ns.A09();
                A093.setClassName(A02.getPackageName(), "com.obwhatsapp.companiondevice.LinkedDevicesActivity");
                r310.A0r(A093);
                return;
            case 84:
                AnonymousClass29T.A00((Activity) this.A00, 1);
                return;
            case 85:
                ((ChangeNumber) this.A00).A39();
                return;
            case 86:
                EULA eula = (EULA) this.A00;
                AnonymousClass29T.A00(eula, 8);
                eula.A00 = 0;
                return;
            case 87:
                AnonymousClass29T.A01((Activity) this.A00, 7);
                return;
            case 88:
                AnonymousClass29T.A00((Activity) this.A00, 1);
                return;
            case 89:
                EULA eula2 = (EULA) this.A00;
                AnonymousClass29T.A00(eula2, 6);
                if (C004101u.A0A()) {
                    AnonymousClass29T.A01(eula2, 8);
                    return;
                } else {
                    eula2.A00 = 0;
                    return;
                }
            case 90:
                AnonymousClass29T.A00((Activity) this.A00, 2);
                return;
            case 91:
                AnonymousClass29T.A01((Activity) this.A00, 5);
                return;
            case 92:
                AnonymousClass29T.A00((Activity) this.A00, 9);
                return;
            case 93:
                AnonymousClass29T.A00((Activity) this.A00, 22);
                return;
            case 94:
                RegisterName registerName = (RegisterName) this.A00;
                registerName.A3A();
                AnonymousClass29T.A00(registerName, 1);
                return;
            case 95:
                AnonymousClass2F3 r13 = (AnonymousClass2F3) this.A00;
                r13.A35(0);
                AnonymousClass29T.A00(r13, 21);
                return;
            case 96:
                RegisterPhone registerPhone = (RegisterPhone) this.A00;
                AnonymousClass29T.A00(registerPhone, 21);
                registerPhone.A09.A19(AnonymousClass2F3.A0V, AnonymousClass2F3.A0W);
                if (AnonymousClass2F3.A0Y || AnonymousClass2F3.A0X != null || registerPhone.A0Y || !C26851Pm.A00(registerPhone.A08, AnonymousClass2F3.A0T)) {
                    AnonymousClass47O.A00(registerPhone.A07, registerPhone);
                    return;
                }
                registerPhone.A35(0);
                registerPhone.A2X(C14750ph.A0D(registerPhone, registerPhone.A02, registerPhone.A03, false), true);
                return;
            case 97:
                AnonymousClass29T.A00((Activity) this.A00, 125);
                return;
            case 98:
                Log.i("registername/dialog/cant-connect/button/cancel");
                AnonymousClass29T.A00((Activity) this.A00, 109);
                return;
            case 99:
                AnonymousClass29T.A00((Activity) this.A00, 604);
                return;
            case 100:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A00;
                AnonymousClass29T.A00(verifyPhoneNumber, 41);
                verifyPhoneNumber.A3L();
                return;
            case 101:
                AnonymousClass29T.A00((Activity) this.A00, 27);
                return;
            case 102:
                AnonymousClass29T.A00((Activity) this.A00, 38);
                return;
            case 103:
                VerifyPhoneNumber verifyPhoneNumber2 = (VerifyPhoneNumber) this.A00;
                AnonymousClass29T.A00(verifyPhoneNumber2, 31);
                verifyPhoneNumber2.A0f.A00(verifyPhoneNumber2, "how-to-register");
                return;
            case 104:
                VerifyPhoneNumber verifyPhoneNumber3 = (VerifyPhoneNumber) this.A00;
                AnonymousClass29T.A00(verifyPhoneNumber3, 31);
                verifyPhoneNumber3.A3L();
                return;
            case 105:
                VerifyPhoneNumber verifyPhoneNumber4 = (VerifyPhoneNumber) this.A00;
                AnonymousClass29T.A00(verifyPhoneNumber4, 27);
                verifyPhoneNumber4.A3W(0);
                verifyPhoneNumber4.A11.A0A(1);
                StringBuilder A0r = AnonymousClass000.A0r("+");
                A0r.append(verifyPhoneNumber4.A1C);
                String A0h = AnonymousClass000.A0h(verifyPhoneNumber4.A1D, A0r);
                verifyPhoneNumber4.A1D = null;
                verifyPhoneNumber4.A0k.A01(verifyPhoneNumber4, AnonymousClass000.A0h(A0h, AnonymousClass000.A0r("verify-tma ")));
                return;
            case 106:
                AnonymousClass29T.A00((Activity) this.A00, 39);
                return;
            case 107:
                AnonymousClass29T.A00((Activity) this.A00, 36);
                return;
            case AnonymousClass2EA.A03:
                AnonymousClass29T.A00((Activity) this.A00, 37);
                return;
            case 109:
                VerifyPhoneNumber verifyPhoneNumber5 = (VerifyPhoneNumber) this.A00;
                verifyPhoneNumber5.A17.A04(verifyPhoneNumber5.A38(), "ad_timeout");
                AnonymousClass29T.A00(verifyPhoneNumber5, 45);
                verifyPhoneNumber5.A3L();
                return;
            case 110:
                VerifyPhoneNumber verifyPhoneNumber6 = (VerifyPhoneNumber) this.A00;
                AnonymousClass29T.A00(verifyPhoneNumber6, 28);
                verifyPhoneNumber6.A3W(0);
                verifyPhoneNumber6.A11.A0A(1);
                String str = verifyPhoneNumber6.A1D;
                if (str == null) {
                    str = "";
                }
                verifyPhoneNumber6.A1D = null;
                verifyPhoneNumber6.A0k.A01(verifyPhoneNumber6, AnonymousClass000.A0h(str, AnonymousClass000.A0r("verify-tmg ")));
                return;
            case 111:
                AnonymousClass29T.A00((Activity) this.A00, 29);
                return;
            case 112:
                VerifyPhoneNumber verifyPhoneNumber7 = (VerifyPhoneNumber) this.A00;
                AnonymousClass29T.A00(verifyPhoneNumber7, 30);
                verifyPhoneNumber7.A3L();
                return;
            case 113:
                VerifyPhoneNumber verifyPhoneNumber8 = (VerifyPhoneNumber) this.A00;
                AnonymousClass29T.A00(verifyPhoneNumber8, 21);
                verifyPhoneNumber8.A3L();
                return;
            case 114:
                VerifyPhoneNumber verifyPhoneNumber9 = (VerifyPhoneNumber) this.A00;
                AnonymousClass29T.A00(verifyPhoneNumber9, 28);
                verifyPhoneNumber9.A3L();
                return;
            case 115:
                AnonymousClass29T.A00((Activity) this.A00, 26);
                return;
            case 116:
                VerifyPhoneNumber verifyPhoneNumber10 = (VerifyPhoneNumber) this.A00;
                AnonymousClass29T.A00(verifyPhoneNumber10, 34);
                verifyPhoneNumber10.A3L();
                return;
            case 117:
                AnonymousClass29T.A00((Activity) this.A00, 40);
                return;
            case 118:
                AnonymousClass29T.A00((Activity) this.A00, 32);
                return;
            case 119:
                DeviceConfirmationRegistrationActivity deviceConfirmationRegistrationActivity = (DeviceConfirmationRegistrationActivity) this.A00;
                AnonymousClass29T.A00(deviceConfirmationRegistrationActivity, 11);
                NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = deviceConfirmationRegistrationActivity.A06;
                C13680ns.A1P(newDeviceConfirmationRegistrationViewModel.A0H, 2);
                C26841Pl r311 = newDeviceConfirmationRegistrationViewModel.A0E;
                String str2 = newDeviceConfirmationRegistrationViewModel.A00;
                AnonymousClass00B.A06(str2);
                String str3 = newDeviceConfirmationRegistrationViewModel.A01;
                AnonymousClass00B.A06(str3);
                r311.A07.Acl(new RunnableRunnableShape0S2200000_I0(r311, new C1033651c(newDeviceConfirmationRegistrationViewModel), str3, str2, 2));
                return;
            case 120:
                DeviceConfirmationRegistrationActivity deviceConfirmationRegistrationActivity2 = (DeviceConfirmationRegistrationActivity) this.A00;
                NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel2 = deviceConfirmationRegistrationActivity2.A06;
                Log.i("NewDeviceConfirmationRegistrationViewModel/onRegistrationTimedOutDialogClick");
                newDeviceConfirmationRegistrationViewModel2.A0F.A04("device_confirm", "ad_timeout");
                newDeviceConfirmationRegistrationViewModel2.A05();
                AnonymousClass29T.A00(deviceConfirmationRegistrationActivity2, 16);
                return;
            case 121:
                AnonymousClass29T.A00((Activity) this.A00, 11);
                dialogInterface.dismiss();
                return;
            case 122:
                AnonymousClass29T.A00((Activity) this.A00, 13);
                return;
            case 123:
                AnonymousClass29T.A00((Activity) this.A00, 14);
                return;
            case 124:
                AnonymousClass29T.A00((Activity) this.A00, 15);
                return;
            case 125:
                AnonymousClass29T.A00((Activity) this.A00, 17);
                return;
            case 126:
                AnonymousClass01A r03 = (AnonymousClass01A) this.A00;
                Context A022 = r03.A02();
                Context A023 = r03.A02();
                String str4 = DeviceConfirmationRegAlertDialogFragment.A06.A02;
                Intent A094 = C13680ns.A09();
                A094.setClassName(A023.getPackageName(), "com.obwhatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity");
                A094.putExtra("server_token", str4);
                A022.startActivity(A094);
                return;
            case 127:
                IDxRCallbackShape457S0100000_2_I1 iDxRCallbackShape457S0100000_2_I1 = new IDxRCallbackShape457S0100000_2_I1(this, 0);
                DeviceConfirmationRegAlertDialogFragment deviceConfirmationRegAlertDialogFragment = (DeviceConfirmationRegAlertDialogFragment) this.A00;
                new AnonymousClass51M(deviceConfirmationRegAlertDialogFragment.A05, C13690nt.A0h(iDxRCallbackShape457S0100000_2_I1)).A00(DeviceConfirmationRegAlertDialogFragment.A06.A02, false);
                Context A024 = deviceConfirmationRegAlertDialogFragment.A02();
                Context A025 = deviceConfirmationRegAlertDialogFragment.A02();
                Intent A095 = C13680ns.A09();
                A095.setClassName(A025.getPackageName(), "com.obwhatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity");
                A024.startActivity(A095);
                return;
            case 128:
                SettingsCompanionLogoutDialog settingsCompanionLogoutDialog = (SettingsCompanionLogoutDialog) this.A00;
                settingsCompanionLogoutDialog.A02.Aco(new RunnableRunnableShape14S0100000_I0_13((Object) settingsCompanionLogoutDialog, 29));
                settingsCompanionLogoutDialog.A00.A08(0, R.string.str0c9b);
                return;
            case 129:
                MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                AnonymousClass29T.A00(messageReplyActivity, 106);
                messageReplyActivity.A36();
                return;
            case 130:
                AnonymousClass29T.A00((Activity) this.A00, 17);
                return;
            case 131:
                MessageReplyActivity messageReplyActivity2 = (MessageReplyActivity) this.A00;
                messageReplyActivity2.A3C(true);
                AnonymousClass29T.A00(messageReplyActivity2, 17);
                return;
            case 133:
                FirstStatusConfirmationDialogFragment firstStatusConfirmationDialogFragment = (FirstStatusConfirmationDialogFragment) this.A00;
                if (!firstStatusConfirmationDialogFragment.A02.A0G()) {
                    firstStatusConfirmationDialogFragment.A02.A0F((Collection) null, 0);
                    firstStatusConfirmationDialogFragment.A01.A00(new SendStatusPrivacyListJob((Collection) null, 0));
                }
                C001000l A0C3 = firstStatusConfirmationDialogFragment.A0C();
                if (A0C3 instanceof C41551w9) {
                    ((C41551w9) A0C3).AXh();
                }
                firstStatusConfirmationDialogFragment.A1C();
                return;
            case 135:
                StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = (StorageUsageDeleteMessagesDialogFragment) this.A00;
                Collection collection = storageUsageDeleteMessagesDialogFragment.A05 ? storageUsageDeleteMessagesDialogFragment.A03 : storageUsageDeleteMessagesDialogFragment.A04;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (!storageUsageDeleteMessagesDialogFragment.A06) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        C16740tZ A0V = C13680ns.A0V(it);
                        if (!A0V.A0x) {
                            linkedHashSet.add(A0V);
                        }
                    }
                } else {
                    linkedHashSet.addAll(collection);
                }
                storageUsageDeleteMessagesDialogFragment.A02.Acl(new RunnableRunnableShape11S0200000_I0_9(storageUsageDeleteMessagesDialogFragment, 7, linkedHashSet));
                return;
            case 136:
                SetEmailFragment setEmailFragment = (SetEmailFragment) ((AnonymousClass01A) this.A00).A09();
                Log.i("setemailfragment/do-skip");
                C13700nu.A0T(setEmailFragment.A03);
                setEmailFragment.A06.A35();
                return;
            case 137:
                SettingsTwoFactorAuthActivity settingsTwoFactorAuthActivity = (SettingsTwoFactorAuthActivity) ((AnonymousClass01A) this.A00).A0C();
                settingsTwoFactorAuthActivity.Afq(R.string.str183f);
                settingsTwoFactorAuthActivity.A0A.postDelayed(settingsTwoFactorAuthActivity.A0B, C14860ps.A0D);
                C14860ps r211 = settingsTwoFactorAuthActivity.A08;
                Log.i("twofactorauthmanager/disable-two-factor-auth");
                r211.A04("", (String) null);
                return;
            case 138:
                ((AnonymousClass5SB) this.A00).ATt();
                return;
            case 139:
            case 140:
                ((AnonymousClass5SC) this.A00).ATt();
                return;
            case 141:
                DocumentWarningDialogFragment.A02((DocumentWarningDialogFragment) this.A00);
                return;
            case 142:
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT:
                ((VoipErrorDialogFragment) this.A00).A03.A00();
                return;
            case 143:
            case 145:
                ((VoipErrorDialogFragment) this.A00).A03.A01(dialogInterface);
                return;
            case 146:
                C001000l A0D = ((AnonymousClass01A) this.A00).A0D();
                if (A0D instanceof AnonymousClass1ZF) {
                    ((AnonymousClass1ZF) A0D).finish();
                    return;
                }
                return;
            default:
                ((AnonymousClass2Sv) this.A00).AOW();
                return;
        }
    }
}
