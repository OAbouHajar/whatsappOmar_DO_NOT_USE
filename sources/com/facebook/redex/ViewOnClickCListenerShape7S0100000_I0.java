package com.facebook.redex;

import X.AnonymousClass050;
import X.AnonymousClass267;
import X.AnonymousClass2GK;
import X.AnonymousClass2WB;
import X.AnonymousClass2WD;
import X.AnonymousClass2WE;
import X.AnonymousClass2WF;
import X.AnonymousClass2WP;
import X.AnonymousClass2WT;
import X.AnonymousClass2Xz;
import X.AnonymousClass2YL;
import X.AnonymousClass4NR;
import X.AnonymousClass5F3;
import X.AnonymousClass5F4;
import X.C001000l;
import X.C005402i;
import X.C108565Om;
import X.C108575On;
import X.C14570pP;
import X.C14750ph;
import X.C14780pk;
import X.C17090uW;
import X.C18450wi;
import X.C19980zJ;
import X.C32131fh;
import X.C434920f;
import X.C448125q;
import X.C49302Si;
import X.C62173By;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.DialogFragment;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.avatar.home.AvatarHomeActivity;
import com.obwhatsapp.avatar.home.AvatarHomeViewModel;
import com.obwhatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.obwhatsapp.backup.google.PromptDialogFragment;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.backup.google.SettingsGoogleDrive;
import com.obwhatsapp.biz.cart.view.fragment.CartFragment;
import com.obwhatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.obwhatsapp.biz.catalog.view.activity.ProductListActivity;
import com.obwhatsapp.biz.catalog.view.widgets.QuantitySelector;
import com.obwhatsapp.bottomsheet.LockableBottomSheetBehavior;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class ViewOnClickCListenerShape7S0100000_I0 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape7S0100000_I0(AnonymousClass267 r1, int i2) {
        this.A01 = i2;
        if (6 - i2 != 0) {
            this.A00 = r1;
        } else {
            this.A00 = r1;
        }
    }

    public ViewOnClickCListenerShape7S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        SearchView searchView;
        switch (this.A01) {
            case 0:
                EditText editText = (EditText) this.A00;
                editText.setSelection(editText.getText().length());
                return;
            case 1:
            case 2:
            case 9:
                ((Activity) this.A00).finish();
                return;
            case 3:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                C14780pk A3A = homeActivity.A3A(HomeActivity.A02(homeActivity.A01, homeActivity.A03));
                if (A3A != null) {
                    A3A.AeZ(true);
                    return;
                }
                return;
            case 4:
                ((HomeActivity) this.A00).A3U(true);
                return;
            case 5:
                C49302Si r1 = (C49302Si) this.A00;
                r1.A36(r1.A0J);
                r1.A0J = null;
                return;
            case 6:
                ((AnonymousClass267) this.A00).A05(true);
                return;
            case 7:
                AnonymousClass267 r3 = (AnonymousClass267) this.A00;
                int inputType = r3.A02.A0k.getInputType();
                int i2 = 3;
                WaImageView waImageView = r3.A03;
                if (inputType == 3) {
                    waImageView.setImageResource(R.drawable.ic_action_dialpad);
                    searchView = r3.A02;
                    i2 = 1;
                } else {
                    waImageView.setImageResource(R.drawable.ic_action_keypad);
                    searchView = r3.A02;
                }
                searchView.setInputType(i2);
                return;
            case 8:
                Log.i("acceptlink/confirmation/ok");
                ((Activity) this.A00).finish();
                return;
            case 10:
                AvatarHomeViewModel avatarHomeViewModel = (AvatarHomeViewModel) ((AvatarHomeActivity) this.A00).A0L.getValue();
                Log.i("AvatarHomeViewModel/onAvatarPreviewTryAgainClicked");
                avatarHomeViewModel.A00.A0B(new AnonymousClass2WP(AnonymousClass2WT.A00, false, false, false));
                AnonymousClass4NR r5 = avatarHomeViewModel.A03;
                r5.A02.Aco(new RunnableRunnableShape3S0300000_I1(r5, new AnonymousClass5F4(avatarHomeViewModel), new AnonymousClass5F3(avatarHomeViewModel), 39));
                return;
            case 11:
                AvatarHomeActivity avatarHomeActivity = (AvatarHomeActivity) this.A00;
                C17090uW r12 = avatarHomeActivity.A09;
                if (r12 != null) {
                    r12.Act(avatarHomeActivity, Uri.parse("https://faq.whatsapp.com/general/account-and-profile/how-to-use-avatars-on-whatsapp/"));
                    return;
                } else {
                    C18450wi.A0O("linkLauncher");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            case 12:
                AvatarHomeViewModel avatarHomeViewModel2 = (AvatarHomeViewModel) ((AvatarHomeActivity) this.A00).A0L.getValue();
                Log.i("onDeleteAvatarClicked");
                avatarHomeViewModel2.A06.A02(6);
                avatarHomeViewModel2.A07.A0B(AnonymousClass2WF.A00);
                return;
            case 13:
                AvatarHomeViewModel avatarHomeViewModel3 = (AvatarHomeViewModel) ((AvatarHomeActivity) this.A00).A0L.getValue();
                Log.i("AvatarHomeViewModel/onFabEditAvatarClicked");
                avatarHomeViewModel3.A06.A02(5);
                avatarHomeViewModel3.A07.A0B(AnonymousClass2WD.A00);
                return;
            case 14:
                AvatarHomeViewModel avatarHomeViewModel4 = (AvatarHomeViewModel) ((AvatarHomeActivity) this.A00).A0L.getValue();
                Log.i("AvatarHomeViewModel/onNewUserCreateAvatarClicked");
                avatarHomeViewModel4.A06.A02(2);
                avatarHomeViewModel4.A07.A0B(AnonymousClass2WD.A00);
                return;
            case 15:
                Log.i("AvatarHomeViewModel/onBrowserStickersClicked");
                ((AvatarHomeViewModel) ((AvatarHomeActivity) this.A00).A0L.getValue()).A07.A0B(AnonymousClass2WE.A00);
                return;
            case 16:
                AvatarHomeActivity avatarHomeActivity2 = (AvatarHomeActivity) this.A00;
                LockableBottomSheetBehavior lockableBottomSheetBehavior = avatarHomeActivity2.A0G;
                if (lockableBottomSheetBehavior == null) {
                    return;
                }
                if (lockableBottomSheetBehavior.A0B == 5) {
                    lockableBottomSheetBehavior.A0M(4);
                    C434920f.A08(avatarHomeActivity2.getWindow(), false);
                    C434920f.A03(avatarHomeActivity2, R.color.color064b);
                    C005402i AGK = avatarHomeActivity2.AGK();
                    if (AGK != null) {
                        AGK.A07();
                        return;
                    }
                    return;
                }
                lockableBottomSheetBehavior.A0M(5);
                avatarHomeActivity2.A36();
                return;
            case 17:
                AvatarHomeViewModel avatarHomeViewModel5 = (AvatarHomeViewModel) ((AvatarHomeActivity) this.A00).A0L.getValue();
                Log.i("AvatarHomeViewModel/onCreateProfilePhotoClicked");
                avatarHomeViewModel5.A06.A02(18);
                avatarHomeViewModel5.A07.A0B(AnonymousClass2WB.A00);
                return;
            case 18:
                AnonymousClass2YL.A03(view, (AnonymousClass2YL) this.A00);
                return;
            case 19:
                GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = (GoogleDriveNewUserSetupActivity) this.A00;
                String A0M = googleDriveNewUserSetupActivity.A09.A0M();
                StringBuilder sb = new StringBuilder("gdrive-new-user-setup/done-clicked account is ");
                sb.append(AnonymousClass2GK.A0B(A0M));
                sb.append(" and backup frequency is ");
                sb.append(googleDriveNewUserSetupActivity.A00);
                Log.i(sb.toString());
                int i3 = googleDriveNewUserSetupActivity.A00;
                if (i3 == -1) {
                    Log.i(String.format("gdrive-new-user-setup/done-clicked/show-toast \"%s\"", new Object[]{googleDriveNewUserSetupActivity.getString(R.string.str0996)}));
                    googleDriveNewUserSetupActivity.A05.A09(R.string.str0996, 1);
                    return;
                } else if (i3 == 0 || A0M != null) {
                    Log.i("gdrive-new-user-setup/done-clicked/setup-finished");
                    googleDriveNewUserSetupActivity.A09.A1l(googleDriveNewUserSetupActivity.A00);
                    googleDriveNewUserSetupActivity.A05.Acl(new RunnableRunnableShape3S0100000_I0_2(googleDriveNewUserSetupActivity, 12));
                    googleDriveNewUserSetupActivity.setResult(-1);
                    googleDriveNewUserSetupActivity.finish();
                    return;
                } else {
                    Log.i("gdrive-new-user-setup/done-clicked/show-account-selector");
                    googleDriveNewUserSetupActivity.A36();
                    return;
                }
            case 20:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                restoreFromBackupActivity.startActivity(new Intent("android.intent.action.VIEW", restoreFromBackupActivity.A0A.A00()));
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                Log.i("restore>RestoreFromBackupActivity/show-skip-gdrive-restore-dialog/user clicked skip restore, showing confirm skip dialog");
                ((RestoreFromBackupActivity) this.A00).A3L(11);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                RestoreFromBackupActivity restoreFromBackupActivity2 = (RestoreFromBackupActivity) this.A00;
                Log.i("restore>RestoreFromBackupActivity/show-import-skip-dialog");
                restoreFromBackupActivity2.setResult(4);
                restoreFromBackupActivity2.A3H();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-google-backup/user clicked skip restore, showing confirm skip dialog");
                ((RestoreFromBackupActivity) this.A00).A3L(11);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                RestoreFromBackupActivity restoreFromBackupActivity3 = (RestoreFromBackupActivity) this.A00;
                restoreFromBackupActivity3.A0H.A05(10);
                restoreFromBackupActivity3.A3I();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                RestoreFromBackupActivity.A0p((RestoreFromBackupActivity) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                Log.i("restore>RestoreFromBackupActivity/show-restore-ui-for-local-backup/user clicked skip restore, showing confirm skip dialog");
                ((RestoreFromBackupActivity) this.A00).A3L(10);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                SettingsGoogleDrive.A0T((SettingsGoogleDrive) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                SettingsGoogleDrive settingsGoogleDrive = (SettingsGoogleDrive) this.A00;
                if (settingsGoogleDrive.A0a.A0d.get()) {
                    if (settingsGoogleDrive.A0a.A0e.get()) {
                        settingsGoogleDrive.A0Y.A03();
                    }
                    settingsGoogleDrive.A0V.A03();
                    return;
                }
                settingsGoogleDrive.onNewIntent(new Intent("action_perform_media_restore_over_cellular"));
                return;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                C001000l r4 = (C001000l) this.A00;
                Bundle bundle = new Bundle();
                bundle.putInt("dialog_id", 12);
                bundle.putCharSequence("message", r4.getString(R.string.str0966));
                bundle.putString("positive_button", r4.getString(R.string.str1da7));
                bundle.putString("negative_button", r4.getString(R.string.str0394));
                PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                promptDialogFragment.A0T(bundle);
                AnonymousClass050 r13 = new AnonymousClass050(r4.AGM());
                r13.A0C(promptDialogFragment, (String) null);
                r13.A02();
                return;
            case 30:
                ((SettingsGoogleDrive) this.A00).A36();
                return;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                ((SettingsGoogleDrive) this.A00).A39();
                return;
            case 32:
                SettingsGoogleDrive settingsGoogleDrive2 = (SettingsGoogleDrive) this.A00;
                if (settingsGoogleDrive2.A09.A06() == 0 || !C62173By.A08(settingsGoogleDrive2.A09)) {
                    settingsGoogleDrive2.A36();
                    return;
                } else {
                    settingsGoogleDrive2.A37();
                    return;
                }
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                SettingsGoogleDrive.A09(view, (SettingsGoogleDrive) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                C14570pP r42 = (C14570pP) this.A00;
                r42.A05.Acl(new RunnableRunnableShape3S0200000_I0_1(r42, 4, new SettingsGoogleDrive.AuthRequestDialogFragment()));
                return;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                ((SettingsGoogleDrive) this.A00).A37();
                return;
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                SettingsGoogleDrive settingsGoogleDrive3 = (SettingsGoogleDrive) this.A00;
                if (settingsGoogleDrive3.A09.A1f()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("dialog_id", 18);
                    bundle2.putString("title", settingsGoogleDrive3.getString(R.string.str0796));
                    bundle2.putCharSequence("message", settingsGoogleDrive3.getString(R.string.str0795));
                    bundle2.putBoolean("cancelable", false);
                    bundle2.putString("positive_button", settingsGoogleDrive3.getString(R.string.str0794));
                    bundle2.putString("negative_button", settingsGoogleDrive3.getString(R.string.str0793));
                    PromptDialogFragment promptDialogFragment2 = new PromptDialogFragment();
                    promptDialogFragment2.A0T(bundle2);
                    AnonymousClass050 r14 = new AnonymousClass050(settingsGoogleDrive3.AGM());
                    r14.A0C(promptDialogFragment2, (String) null);
                    r14.A02();
                    return;
                }
                settingsGoogleDrive3.A35();
                return;
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                C14570pP r32 = (C14570pP) this.A00;
                r32.A05.Acl(new RunnableRunnableShape3S0100000_I0_2(r32, 28));
                return;
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                ((AnonymousClass2Xz) this.A00).A04(5);
                return;
            case 39:
                AnonymousClass2Xz r0 = (AnonymousClass2Xz) this.A00;
                C19980zJ r43 = r0.A0R;
                ContactInfoActivity contactInfoActivity = r0.A0d;
                r43.A08(contactInfoActivity, new C14750ph().A0x(contactInfoActivity, r0.A03()).putExtra("args_conversation_screen_entry_point", 1).putExtra("extra_show_search_on_create", true), "ContactInfoActivity");
                return;
            case 40:
                ((PostcodeChangeBottomSheet) this.A00).A1N();
                return;
            case 41:
                PostcodeChangeBottomSheet postcodeChangeBottomSheet = (PostcodeChangeBottomSheet) this.A00;
                if (postcodeChangeBottomSheet.A04.getText().toString().length() == 6) {
                    postcodeChangeBottomSheet.A09.AV2(postcodeChangeBottomSheet.A04.getText().toString());
                    return;
                }
                return;
            case 42:
                C32131fh r33 = (C32131fh) this.A00;
                UserJid userJid = r33.A0K;
                C18450wi.A0H(userJid, 0);
                r33.Afc(CartFragment.A01(userJid, (String) null, 0));
                return;
            case 43:
                ((ProductListActivity) this.A00).A0E.A05();
                return;
            case 44:
                ProductListActivity productListActivity = (ProductListActivity) this.A00;
                productListActivity.A0A.A04(productListActivity.A0H, (Integer) null, (String) null, 40);
                UserJid userJid2 = productListActivity.A0E.A08;
                C18450wi.A0H(userJid2, 0);
                productListActivity.Afc(CartFragment.A01(userJid2, (String) null, 3));
                return;
            case 45:
                QuantitySelector quantitySelector = (QuantitySelector) this.A00;
                if (!quantitySelector.A0A) {
                    long j2 = quantitySelector.A01;
                    long j3 = quantitySelector.A00;
                    if (j2 < j3) {
                        if (quantitySelector.A0B) {
                            int i4 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                            quantitySelector.A01 = j2 + 1;
                            if (i4 == 0) {
                                quantitySelector.A00();
                            } else {
                                quantitySelector.A03();
                            }
                            Handler handler = quantitySelector.A0D;
                            handler.removeCallbacksAndMessages((Object) null);
                            handler.postDelayed(new RunnableRunnableShape4S0100000_I0_3(quantitySelector, 5), 2000);
                        } else {
                            quantitySelector.A01 = j2 + 1;
                            quantitySelector.A03();
                        }
                        C108575On r2 = quantitySelector.A05;
                        if (r2 != null) {
                            r2.AVX(quantitySelector.A01);
                            return;
                        }
                        return;
                    }
                    C108565Om r02 = quantitySelector.A04;
                    if (r02 != null) {
                        r02.ASc(j3);
                        return;
                    }
                    return;
                }
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                QuantitySelector quantitySelector2 = (QuantitySelector) this.A00;
                if (!quantitySelector2.A0A) {
                    quantitySelector2.A00();
                    Handler handler2 = quantitySelector2.A0D;
                    handler2.removeCallbacksAndMessages((Object) null);
                    handler2.postDelayed(new RunnableRunnableShape4S0100000_I0_3(quantitySelector2, 5), 2000);
                    return;
                }
                return;
            case 47:
                QuantitySelector quantitySelector3 = (QuantitySelector) this.A00;
                if (!quantitySelector3.A0A) {
                    quantitySelector3.A01--;
                    quantitySelector3.A03();
                    if (quantitySelector3.A0B) {
                        int i5 = (quantitySelector3.A01 > 0 ? 1 : (quantitySelector3.A01 == 0 ? 0 : -1));
                        Handler handler3 = quantitySelector3.A0D;
                        if (i5 > 0) {
                            handler3.removeCallbacksAndMessages((Object) null);
                            handler3.postDelayed(new RunnableRunnableShape4S0100000_I0_3(quantitySelector3, 5), 2000);
                        } else {
                            handler3.removeCallbacksAndMessages((Object) null);
                            quantitySelector3.A04(quantitySelector3.A01, quantitySelector3.A00);
                        }
                    }
                    C108575On r22 = quantitySelector3.A05;
                    if (r22 != null) {
                        r22.AVX(quantitySelector3.A01);
                        return;
                    }
                    return;
                }
                return;
            case 48:
                ((C448125q) this.A00).A00();
                return;
            default:
                ((DialogFragment) this.A00).A1C();
                return;
        }
    }
}
