package com.obwhatsapp.backup.google;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass022;
import X.AnonymousClass027;
import X.AnonymousClass050;
import X.AnonymousClass0Rc;
import X.AnonymousClass12N;
import X.AnonymousClass12P;
import X.AnonymousClass12Q;
import X.AnonymousClass12U;
import X.AnonymousClass12W;
import X.AnonymousClass15P;
import X.AnonymousClass19Y;
import X.AnonymousClass1KN;
import X.AnonymousClass1NO;
import X.AnonymousClass1ZT;
import X.AnonymousClass29R;
import X.AnonymousClass29T;
import X.AnonymousClass2GK;
import X.AnonymousClass2GO;
import X.AnonymousClass2GQ;
import X.AnonymousClass2GY;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SD;
import X.AnonymousClass2SR;
import X.AnonymousClass2UF;
import X.AnonymousClass2YK;
import X.AnonymousClass3FU;
import X.AnonymousClass3KP;
import X.AnonymousClass3iI;
import X.AnonymousClass3ih;
import X.C005402i;
import X.C006602z;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16200sd;
import X.C16250si;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16980tz;
import X.C17250um;
import X.C18260wP;
import X.C18800xH;
import X.C19490yW;
import X.C19670yo;
import X.C19950zG;
import X.C19980zJ;
import X.C210912t;
import X.C23061Ai;
import X.C23071Aj;
import X.C28251Uz;
import X.C28921Zf;
import X.C32301g2;
import X.C434920f;
import X.C446524y;
import X.C49132Rg;
import X.C54932iV;
import X.C55862kX;
import X.C63273Gu;
import X.C71183ic;
import X.C71193id;
import X.C71203ie;
import X.C71213if;
import X.C71223ig;
import X.C812447k;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSCallbackShape221S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape415S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.WaLinearLayout;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class SettingsGoogleDrive extends C14530pL implements C28251Uz, AnonymousClass2GO {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public Button A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ProgressBar A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public SwitchCompat A0M;
    public SwitchCompat A0N;
    public WaLinearLayout A0O;
    public WaTextView A0P;
    public WaTextView A0Q;
    public WaTextView A0R;
    public C18800xH A0S;
    public C16200sd A0T;
    public AnonymousClass1KN A0U;
    public C19670yo A0V;
    public AnonymousClass12U A0W;
    public AnonymousClass12N A0X;
    public AnonymousClass12Q A0Y;
    public AnonymousClass3KP A0Z;
    public SettingsGoogleDriveViewModel A0a;
    public AnonymousClass19Y A0b;
    public AnonymousClass29R A0c;
    public AnonymousClass12W A0d;
    public C16980tz A0e;
    public C16260sj A0f;
    public C210912t A0g;
    public C16250si A0h;
    public C16490t9 A0i;
    public AnonymousClass12P A0j;
    public boolean A0k;
    public boolean A0l;
    public String[] A0m;
    public final ConditionVariable A0n;
    public final C32301g2 A0o;
    public volatile boolean A0p;

    public class AuthRequestDialogFragment extends Hilt_SettingsGoogleDrive_AuthRequestDialogFragment {
        public Dialog A1B(Bundle bundle) {
            AnonymousClass2SD r2 = new AnonymousClass2SD(A0u());
            r2.setTitle(R.string.str1550);
            r2.setIndeterminate(true);
            r2.setMessage(A0J(R.string.str154f));
            r2.setCancelable(true);
            r2.setOnCancelListener(new IDxCListenerShape161S0100000_2_I0(this, 3));
            return r2;
        }
    }

    public SettingsGoogleDrive() {
        this(0);
        this.A0o = new IDxSCallbackShape221S0100000_2_I0(this, 2);
        this.A0n = new ConditionVariable(false);
    }

    public SettingsGoogleDrive(int i2) {
        this.A0l = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 20));
    }

    public static /* synthetic */ void A02(AccountManagerFuture accountManagerFuture, AuthRequestDialogFragment authRequestDialogFragment, SettingsGoogleDrive settingsGoogleDrive) {
        try {
            Log.i("settings-gdrive/show-accounts/waiting-for-add-account-activity-to-return");
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (!bundle.containsKey("authAccount")) {
                Log.e("settings-gdrive/error-during-add-account/account-manager-returned-with-no-account-name");
            } else {
                settingsGoogleDrive.A3D(authRequestDialogFragment, String.valueOf(bundle.get("authAccount")));
            }
        } catch (OperationCanceledException e2) {
            Log.i("settings-gdrive/user-canceled-add-account-operation", e2);
        } catch (AuthenticatorException | IOException e3) {
            Log.e("settings-gdrive/error-during-add-account", e3);
        }
    }

    public static void A03(View view, int i2) {
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
    }

    public static /* synthetic */ void A09(View view, SettingsGoogleDrive settingsGoogleDrive) {
        int i2;
        if (view == settingsGoogleDrive.A04) {
            settingsGoogleDrive.A39();
            return;
        }
        if (view == settingsGoogleDrive.A09) {
            Log.i("settings-gdrive/toggle-network-pref");
            if (!AnonymousClass2GK.A0G(settingsGoogleDrive.A09)) {
                if (AnonymousClass2GK.A0H(settingsGoogleDrive.A09)) {
                    i2 = R.string.str157b;
                } else {
                    settingsGoogleDrive.A0N.toggle();
                    settingsGoogleDrive.A05.Acl(new RunnableRunnableShape0S0101000_I0((Object) settingsGoogleDrive, settingsGoogleDrive.A0N.isChecked() ? 1 : 0, 4));
                    return;
                }
            }
            i2 = R.string.str157a;
        } else if (view == settingsGoogleDrive.A07) {
            Log.i("settings-gdrive/show-freq-pref");
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 10);
            bundle.putString("title", settingsGoogleDrive.getString(R.string.str1563));
            bundle.putStringArray("items", settingsGoogleDrive.A0m);
            int A062 = settingsGoogleDrive.A09.A06();
            int i3 = 0;
            while (true) {
                int[] iArr = SettingsGoogleDriveViewModel.A0g;
                if (i3 < iArr.length) {
                    if (iArr[i3] == A062) {
                        break;
                    }
                    i3++;
                } else {
                    StringBuilder sb = new StringBuilder("settings-gdrive/get-backup-freq-index/");
                    sb.append(A062);
                    Log.e(sb.toString());
                    i3 = 0;
                    break;
                }
            }
            bundle.putInt("selected_item_index", i3);
            singleChoiceListDialogFragment.A0T(bundle);
            if (!settingsGoogleDrive.A3G()) {
                AnonymousClass050 r1 = new AnonymousClass050(settingsGoogleDrive.AGM());
                r1.A0C(singleChoiceListDialogFragment, (String) null);
                r1.A02();
                return;
            }
            return;
        } else if (view == settingsGoogleDrive.A08) {
            if (!AnonymousClass2GK.A0G(settingsGoogleDrive.A09)) {
                if (AnonymousClass2GK.A0H(settingsGoogleDrive.A09)) {
                    settingsGoogleDrive.Afg(R.string.str157b);
                } else {
                    settingsGoogleDrive.A0M.toggle();
                }
                SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = settingsGoogleDrive.A0a;
                boolean isChecked = settingsGoogleDrive.A0M.isChecked();
                settingsGoogleDriveViewModel.A0F.A0B(Boolean.valueOf(isChecked));
                settingsGoogleDriveViewModel.A0Z.A1J(isChecked);
                settingsGoogleDriveViewModel.A06();
                return;
            }
            i2 = R.string.str157a;
        } else {
            throw new IllegalArgumentException("Can't handle the click event for the pref view");
        }
        settingsGoogleDrive.Afg(i2);
    }

    public static /* synthetic */ void A0A(AuthRequestDialogFragment authRequestDialogFragment, SettingsGoogleDrive settingsGoogleDrive, String str) {
        boolean z2;
        String obj;
        SettingsGoogleDrive settingsGoogleDrive2 = settingsGoogleDrive;
        Account[] accountsByType = AccountManager.get(settingsGoogleDrive).getAccountsByType("com.google");
        int length = accountsByType.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z2 = false;
                break;
            } else if (TextUtils.equals(accountsByType[i2].name, str)) {
                z2 = true;
                break;
            } else {
                i2++;
            }
        }
        AnonymousClass00B.A06(str);
        if (z2) {
            settingsGoogleDrive.A3D(authRequestDialogFragment, str);
            return;
        }
        try {
            Bundle result = AccountManager.get(settingsGoogleDrive).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, settingsGoogleDrive2, (AccountManagerCallback) null, (Handler) null).getResult();
            if (!result.containsKey("authAccount")) {
                obj = "settings-gdrive/error-during-media-restore/account-manager-returned-with-no-account-name";
            } else if (!str.equals(result.get("authAccount"))) {
                StringBuilder sb = new StringBuilder();
                sb.append("settings-gdrive/error-during-media-restore/account-manager user added ");
                sb.append(result.get("authAccount"));
                sb.append(" instead of ");
                sb.append(str);
                obj = sb.toString();
            } else {
                settingsGoogleDrive.A0a.A08(false);
                settingsGoogleDrive.A3D(authRequestDialogFragment, str);
                return;
            }
            Log.e(obj);
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            Log.e("settings-gdrive/error-during-media-restore", e2);
        }
    }

    public static /* synthetic */ void A0T(SettingsGoogleDrive settingsGoogleDrive) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            i2 = R.string.str1243;
        } else {
            i2 = R.string.str1244;
            if (i3 < 33) {
                i2 = R.string.str1246;
            }
        }
        RequestPermissionActivity.A0K(settingsGoogleDrive, i2, R.string.str1245);
    }

    public static /* synthetic */ void A0p(SettingsGoogleDrive settingsGoogleDrive, AnonymousClass2YK r14) {
        int i2;
        if (r14 instanceof AnonymousClass3ih) {
            AnonymousClass3ih r142 = (AnonymousClass3ih) r14;
            int i3 = r142.A00;
            if (i3 != 0) {
                AnonymousClass2UF.A00 = null;
                if (i3 == 1) {
                    AnonymousClass29T.A00(settingsGoogleDrive, 605);
                    Bundle bundle = new Bundle();
                    bundle.putLong("backup_size", r142.A01);
                    bundle.putInt("backup_state", 1);
                    NotEnoughStorageDialogFragment notEnoughStorageDialogFragment = new NotEnoughStorageDialogFragment();
                    notEnoughStorageDialogFragment.A0T(bundle);
                    notEnoughStorageDialogFragment.A1G(settingsGoogleDrive.AGM(), (String) null);
                    return;
                } else if (i3 != 2) {
                    AnonymousClass29T.A00(settingsGoogleDrive, 605);
                    Intent A0d2 = C14750ph.A0d(settingsGoogleDrive, "action_backup_export");
                    A0d2.putExtra("backup_storage_needed", r142.A01);
                    C446524y.A00(settingsGoogleDrive.A0e.A00, A0d2);
                    return;
                } else {
                    AnonymousClass29T.A00(settingsGoogleDrive, 605);
                    i2 = R.string.str166b;
                }
            } else {
                String string = settingsGoogleDrive.getString(R.string.str089b);
                AnonymousClass2SD r0 = AnonymousClass2UF.A00;
                if (r0 != null) {
                    r0.setTitle(R.string.str089c);
                    AnonymousClass2UF.A00.setMessage(string);
                    return;
                }
                return;
            }
        } else if (r14 instanceof C71203ie) {
            settingsGoogleDrive.showDialog(606);
            String string2 = settingsGoogleDrive.getString(R.string.str0898, new Object[]{AnonymousClass2GQ.A03(settingsGoogleDrive.A01, 0), AnonymousClass2GQ.A03(settingsGoogleDrive.A01, ((C71203ie) r14).A00), settingsGoogleDrive.A01.A0L().format(0.0d)});
            AnonymousClass3KP r1 = settingsGoogleDrive.A0Z;
            if (r1 != null) {
                ((TextView) r1.findViewById(R.id.backup_export_info)).setText(string2);
                settingsGoogleDrive.setProgress(0);
                return;
            }
            return;
        } else if (r14 instanceof C71223ig) {
            C71223ig r143 = (C71223ig) r14;
            long j2 = r143.A00;
            long j3 = r143.A01;
            int i4 = (int) ((100 * j2) / j3);
            String string3 = settingsGoogleDrive.getString(R.string.str0898, new Object[]{AnonymousClass2GQ.A03(settingsGoogleDrive.A01, j2), AnonymousClass2GQ.A03(settingsGoogleDrive.A01, j3), settingsGoogleDrive.A01.A0L().format(((double) i4) / 100.0d)});
            if (settingsGoogleDrive.A0Z == null) {
                settingsGoogleDrive.showDialog(606);
            }
            AnonymousClass3KP r12 = settingsGoogleDrive.A0Z;
            if (r12 != null) {
                ((TextView) r12.findViewById(R.id.backup_export_info)).setText(string3);
                ((ProgressBar) settingsGoogleDrive.A0Z.findViewById(R.id.backup_export_progress)).setProgress(i4);
                return;
            }
            return;
        } else if (r14 instanceof C71213if) {
            settingsGoogleDrive.removeDialog(606);
            settingsGoogleDrive.A0Z = null;
            boolean z2 = ((C71213if) r14).A00;
            i2 = R.string.str089a;
            if (z2) {
                i2 = R.string.str089d;
            }
        } else if ((r14 instanceof C71183ic) || (r14 instanceof C71193id)) {
            settingsGoogleDrive.removeDialog(606);
            settingsGoogleDrive.A0Z = null;
            return;
        } else {
            return;
        }
        settingsGoogleDrive.Afg(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006e, code lost:
        r1.setClickable(r0);
        r0 = r13.A0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0073, code lost:
        if (r2 == null) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        r0.A08(true);
        ((android.widget.TextView) X.AnonymousClass00T.A05(r13, com.obwhatsapp.R.id.google_drive_backup_error_info)).setText(r2);
        X.AnonymousClass00T.A05(r13, com.obwhatsapp.R.id.cancel_error_view).setVisibility(0);
        X.AnonymousClass00T.A05(r13, com.obwhatsapp.R.id.cancel_error_view).setOnClickListener(r13.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0097, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0134, code lost:
        r0 = com.obwhatsapp.R.string.str0971;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0145, code lost:
        r2 = r13.getString(r0);
        r0 = 37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x014b, code lost:
        r3 = new com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0((java.lang.Object) r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0152, code lost:
        r0.A08(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0155, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0156, code lost:
        r1 = new java.lang.StringBuilder("settings-gdrive/display-media-restore-error failed to display error ");
        r1.append(X.AnonymousClass2GK.A04(r7));
        r1.append(" since Activity is about to finish.");
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0171, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0032, code lost:
        r1.append(r0);
        r1.append(X.AnonymousClass2GK.A04(r7));
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (r13.A3G() != false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("settings-gdrive/display-media-restore-error/");
        r1.append(X.AnonymousClass2GK.A04(r7));
        com.whatsapp.util.Log.i(r1.toString());
        r1 = X.AnonymousClass00T.A05(r13, com.obwhatsapp.R.id.google_drive_backup_error_text_views);
        r1.setOnClickListener(r3);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006b, code lost:
        if (r3 == null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006d, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A0r(com.obwhatsapp.backup.google.SettingsGoogleDrive r13, X.AnonymousClass2YJ r14) {
        /*
            java.lang.String r0 = "settings-gdrive/media-restore-error/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r7 = r14.A00
            java.lang.String r0 = X.AnonymousClass2GK.A04(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass00B.A01()
            X.0rz r0 = r13.A09
            java.lang.String r4 = r0.A0M()
            java.lang.String r9 = "settings-gdrive/display-media-restore-error/"
            r3 = 0
            r8 = 1
            r6 = 0
            switch(r7) {
                case 10: goto L_0x0043;
                case 11: goto L_0x0098;
                case 12: goto L_0x00a3;
                case 13: goto L_0x00b5;
                case 14: goto L_0x00bf;
                case 15: goto L_0x00c4;
                case 16: goto L_0x0043;
                case 17: goto L_0x0043;
                case 18: goto L_0x0134;
                case 19: goto L_0x0134;
                case 20: goto L_0x012e;
                case 21: goto L_0x0098;
                case 22: goto L_0x0172;
                case 23: goto L_0x0138;
                case 24: goto L_0x002a;
                case 25: goto L_0x0142;
                case 26: goto L_0x002a;
                case 27: goto L_0x002a;
                case 28: goto L_0x0098;
                case 29: goto L_0x0098;
                case 30: goto L_0x0098;
                case 31: goto L_0x0098;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/unhandled-error/"
        L_0x0032:
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass2GK.A04(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0043:
            r2 = r3
        L_0x0044:
            boolean r0 = r13.A3G()
            if (r0 != 0) goto L_0x0156
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r0 = X.AnonymousClass2GK.A04(r7)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131363883(0x7f0a082b, float:1.8347587E38)
            android.view.View r1 = X.AnonymousClass00T.A05(r13, r0)
            r1.setOnClickListener(r3)
            r0 = 0
            if (r3 == 0) goto L_0x006e
            r0 = 1
        L_0x006e:
            r1.setClickable(r0)
            com.obwhatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r13.A0a
            if (r2 == 0) goto L_0x0152
            r0.A08(r8)
            r0 = 2131363881(0x7f0a0829, float:1.8347583E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r13, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r2)
            r1 = 2131362575(0x7f0a030f, float:1.8344934E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r13, r1)
            r0.setVisibility(r6)
            android.view.View r1 = X.AnonymousClass00T.A05(r13, r1)
            android.view.View$OnClickListener r0 = r13.A01
            r1.setOnClickListener(r0)
            return
        L_0x0098:
            r0 = 2131888495(0x7f12096f, float:1.9411627E38)
            java.lang.String r2 = r13.getString(r0)
            r0 = 34
            goto L_0x014b
        L_0x00a3:
            r1 = 2131888494(0x7f12096e, float:1.9411625E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r6] = r4
            java.lang.String r2 = r13.getString(r1, r0)
            r0 = 2
            com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0 r3 = new com.facebook.redex.ViewOnClickCListenerShape2S1100000_I0
            r3.<init>(r0, r4, r13)
            goto L_0x0044
        L_0x00b5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/unexpected/"
            goto L_0x0032
        L_0x00bf:
            r0 = 2131888500(0x7f120974, float:1.9411637E38)
            goto L_0x0145
        L_0x00c4:
            android.os.Bundle r1 = r14.A01
            r4 = -1
            if (r1 == 0) goto L_0x00fd
            java.lang.String r0 = "total_bytes_to_be_downloaded"
            long r2 = r1.getLong(r0, r4)
            java.lang.String r0 = "total_bytes_downloaded"
            long r4 = r1.getLong(r0, r4)
            long r0 = r2 - r4
            r11 = 0
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x00ff
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ff
            r4 = 2131888498(0x7f120972, float:1.9411633E38)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            X.013 r2 = r13.A01
            java.lang.String r0 = X.AnonymousClass2GQ.A03(r2, r0)
            r3[r6] = r0
            java.lang.String r2 = r13.getString(r4, r3)
        L_0x00f5:
            r0 = 4
            com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0 r3 = new com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0
            r3.<init>(r13, r0, r14)
            goto L_0x0044
        L_0x00fd:
            r2 = -1
        L_0x00ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r7)
            java.lang.String r0 = " total: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " download: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " downloaded cannot be more than total."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 2131888499(0x7f120973, float:1.9411635E38)
            java.lang.String r2 = r13.getString(r0)
            goto L_0x00f5
        L_0x012e:
            java.lang.String r0 = "settings-gdrive/display-media-restore-error/unexpected-error/failed-to-authenticate-with-whatsapp-servers"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0134:
            r0 = 2131888497(0x7f120971, float:1.941163E38)
            goto L_0x0145
        L_0x0138:
            r0 = 2131888501(0x7f120975, float:1.941164E38)
            java.lang.String r2 = r13.getString(r0)
            r0 = 27
            goto L_0x014b
        L_0x0142:
            r0 = 2131888496(0x7f120970, float:1.9411629E38)
        L_0x0145:
            java.lang.String r2 = r13.getString(r0)
            r0 = 37
        L_0x014b:
            com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0 r3 = new com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0
            r3.<init>((java.lang.Object) r13, (int) r0)
            goto L_0x0044
        L_0x0152:
            r0.A08(r6)
            return
        L_0x0156:
            java.lang.String r0 = "settings-gdrive/display-media-restore-error failed to display error "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass2GK.A04(r7)
            r1.append(r0)
            java.lang.String r0 = " since Activity is about to finish."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0172:
            java.lang.String r1 = "Unexpected error: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.SettingsGoogleDrive.A0r(com.obwhatsapp.backup.google.SettingsGoogleDrive, X.2YJ):void");
    }

    public void A1q() {
        if (!this.A0l) {
            this.A0l = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A0e = (C16980tz) r1.AQB.get();
            this.A0i = (C16490t9) r1.AQz.get();
            this.A0j = (AnonymousClass12P) r1.ARD.get();
            this.A0T = (C16200sd) r1.A7h.get();
            this.A0S = (C18800xH) r1.A1Z.get();
            this.A0d = (AnonymousClass12W) r1.AEM.get();
            this.A0g = (C210912t) r1.ADW.get();
            this.A0h = (C16250si) r1.AFP.get();
            this.A0U = (AnonymousClass1KN) r1.A1T.get();
            this.A0b = (AnonymousClass19Y) r1.A4r.get();
            this.A0W = (AnonymousClass12U) r1.AB5.get();
            this.A0f = (C16260sj) r1.AQe.get();
            this.A0V = (C19670yo) r1.AB4.get();
            this.A0Y = (AnonymousClass12Q) r1.AB8.get();
            this.A0X = (AnonymousClass12N) r1.AB7.get();
        }
    }

    public final void A35() {
        Log.i("settings-gdrive/cancel-backup");
        this.A0a.A09.A09(false);
        this.A0W.A03();
        if (AnonymousClass2GK.A0K(this.A0C)) {
            try {
                for (AnonymousClass0Rc r0 : (List) ((AnonymousClass022) this.A0j.get()).A03().get()) {
                    if (!r0.A03.A00()) {
                        ((AnonymousClass022) this.A0j.get()).A0A("com.obwhatsapp.backup.google.google-backup-worker");
                        return;
                    }
                }
            } catch (InterruptedException | ExecutionException unused) {
                Log.e("settings-gdrive/cancel-backup couldn't get work info for BackupWorker.");
            }
        }
    }

    public final void A36() {
        AnonymousClass12W r0 = this.A0d;
        C32301g2 r1 = this.A0o;
        if (r0.A04(r1) && this.A0d.A03(r1)) {
            this.A0W.A05(10);
            this.A0a.A05.A09(false);
            this.A0a.A0B.A09(false);
            AnonymousClass2GY r2 = new AnonymousClass2GY();
            r2.A04 = Long.valueOf(System.currentTimeMillis());
            r2.A03 = 0;
            C210912t r10 = this.A0g;
            C14730pf r9 = this.A06;
            r10.A01(new AnonymousClass3FU(this, this, this.A0S, this.A0f, this.A01, r9, r10, new C63273Gu(this, r2)), 3000);
        }
    }

    public final void A37() {
        String A0M2 = this.A09.A0M();
        if (A0M2 == null) {
            A39();
            return;
        }
        this.A05.Acl(new RunnableRunnableShape0S1200000_I0(new AuthRequestDialogFragment(), A0M2, this, 6));
    }

    public final void A38() {
        WaTextView waTextView;
        int i2;
        if (this.A0T.A04()) {
            boolean A1f = this.A0T.A03.A1f();
            int A062 = this.A09.A06();
            waTextView = this.A0R;
            if (A062 != 0) {
                i2 = R.string.str1571;
                if (A1f) {
                    i2 = R.string.str1572;
                }
            } else {
                i2 = R.string.str156f;
                if (A1f) {
                    i2 = R.string.str1570;
                }
            }
        } else {
            waTextView = this.A0R;
            i2 = R.string.str156e;
        }
        waTextView.setText(i2);
    }

    public final void A39() {
        int i2;
        AnonymousClass00B.A01();
        if (!A3G()) {
            if (AnonymousClass2GK.A0G(this.A09)) {
                Log.i("settings-gdrive/account-selector/backup/running");
                i2 = R.string.str1579;
            } else if (AnonymousClass2GK.A0H(this.A09)) {
                Log.i("settings-gdrive/account-selector/restore/running");
                i2 = R.string.str157d;
            } else {
                int i3 = 0;
                if (this.A0f.A03("android.permission.GET_ACCOUNTS") != 0 || !this.A0b.A00()) {
                    C54932iV r3 = new C54932iV(this);
                    r3.A01 = R.drawable.permission_contacts_small;
                    r3.A0K = new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
                    r3.A06 = R.string.str11b2;
                    r3.A09 = R.string.str11b1;
                    Ag3(r3.A00(), 150);
                    return;
                }
                String A0M2 = this.A09.A0M();
                Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
                int length = accountsByType.length;
                if (length > 0) {
                    StringBuilder sb = new StringBuilder("settings-gdrive/account-selector/starting-account-picker/num-accounts/");
                    sb.append(length);
                    Log.i(sb.toString());
                    int i4 = -1;
                    int i5 = length + 1;
                    String[] strArr = new String[i5];
                    do {
                        strArr[i3] = accountsByType[i3].name;
                        if (A0M2 != null && A0M2.equals(strArr[i3])) {
                            i4 = i3;
                        }
                        i3++;
                    } while (i3 < length);
                    strArr[i5 - 1] = getString(R.string.str09ce);
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_id", 17);
                    bundle.putString("title", getString(R.string.str09cf));
                    bundle.putInt("selected_item_index", i4);
                    bundle.putStringArray("multi_line_list_items_key", strArr);
                    singleChoiceListDialogFragment.A0T(bundle);
                    if (AGM().A0B("account-picker") == null) {
                        AnonymousClass050 r0 = new AnonymousClass050(AGM());
                        r0.A0C(singleChoiceListDialogFragment, "account-picker");
                        r0.A02();
                        return;
                    }
                    return;
                }
                Log.i("settings-gdrive/account-selector/no-account-found/start-add-account-activity");
                A3A();
                return;
            }
            Afg(i2);
        }
    }

    public final void A3A() {
        this.A05.Acl(new RunnableRunnableShape0S0300000_I0(this, AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), new AuthRequestDialogFragment(), 16));
    }

    public final void A3B() {
        this.A0W.A05(10);
        Intent A0d2 = C14750ph.A0d(this, "action_backup");
        A0d2.putExtra("backup_mode", "user_initiated");
        C446524y.A00(this, A0d2);
    }

    public final void A3C() {
        A38();
        SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A0a;
        AnonymousClass027 r1 = settingsGoogleDriveViewModel.A0N;
        C16200sd r2 = settingsGoogleDriveViewModel.A0P;
        r1.A0B(Boolean.valueOf(r2.A04()));
        if (r2.A04()) {
            settingsGoogleDriveViewModel.A0A.A0B(Boolean.valueOf(r2.A03.A1f()));
        }
    }

    public final void A3D(AuthRequestDialogFragment authRequestDialogFragment, String str) {
        AnonymousClass00B.A00();
        StringBuilder sb = new StringBuilder("settings-gdrive/auth-request account being used is ");
        sb.append(AnonymousClass2GK.A0B(str));
        Log.i(sb.toString());
        this.A0p = false;
        this.A05.A0K(new RunnableRunnableShape3S0200000_I0_1(this, 6, authRequestDialogFragment));
        ConditionVariable conditionVariable = this.A0n;
        conditionVariable.close();
        this.A05.Acl(new RunnableRunnableShape0S1200000_I0(authRequestDialogFragment, str, this, 8));
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        C28921Zf r3 = new C28921Zf("settings-gdrive/fetch-auth-token");
        conditionVariable.block(AnonymousClass1NO.A0L);
        this.A05.A0K(new RunnableRunnableShape3S0200000_I0_1(this, 7, r3));
    }

    public final void A3E(String str) {
        StringBuilder sb = new StringBuilder("setting-gdrive/activity-result/account-picker accountName is ");
        sb.append(AnonymousClass2GK.A0B(str));
        Log.i(sb.toString());
        if (str != null) {
            this.A05.Acl(new RunnableRunnableShape0S1200000_I0(new AuthRequestDialogFragment(), str, this, 5));
        } else if (this.A09.A0M() == null) {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            this.A0a.A09(0);
        }
    }

    public final void A3F(String str, String str2) {
        this.A0n.open();
        DialogFragment dialogFragment = (DialogFragment) AGM().A0B("auth_request_dialog");
        if (dialogFragment != null) {
            dialogFragment.A1D();
        }
        if (str != null) {
            SettingsGoogleDriveViewModel settingsGoogleDriveViewModel = this.A0a;
            C15860rz r1 = settingsGoogleDriveViewModel.A0Z;
            if (!TextUtils.equals(r1.A0M(), str2)) {
                r1.A0s(str2);
                AnonymousClass12U r2 = settingsGoogleDriveViewModel.A0U;
                synchronized (r2.A0O) {
                    r2.A00 = null;
                }
                StringBuilder sb = new StringBuilder("gdrive-setting-view-model/update-account-name new accountName is ");
                sb.append(AnonymousClass2GK.A0B(str2));
                Log.i(sb.toString());
                settingsGoogleDriveViewModel.A02.A0B(str2);
                settingsGoogleDriveViewModel.A07();
                Intent A0d2 = C14750ph.A0d(this, "action_fetch_backup_info");
                A0d2.putExtra("account_name", str2);
                C446524y.A00(this, A0d2);
            } else {
                StringBuilder sb2 = new StringBuilder("gdrive-setting-view-model/update-account-name account unchanged, token received for ");
                sb2.append(AnonymousClass2GK.A0B(str2));
                Log.i(sb2.toString());
            }
        }
        this.A05.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 32));
    }

    public final boolean A3G() {
        return AnonymousClass29T.A03(this) || this.A0k;
    }

    public void APk(int i2) {
        String str;
        switch (i2) {
            case 12:
                str = "settings-gdrive/cancel-media-restore-dialog/user-decided-not-to-cancel";
                break;
            case 13:
                str = "settings-gdrive/perform-backup user declined to perform Google Drive backup over cellular (when the settings say Wi-Fi only)";
                break;
            case 15:
                str = "settings-gdrive/user-declined-to-restore-media-over-cellular";
                break;
            case 16:
                str = "settings-gdrive/user-declined-to-backup-over-cellular";
                break;
            case 18:
                str = "settings-gdrive/user-declined-to-cancel-encrypted-backup";
                break;
            default:
                StringBuilder sb = new StringBuilder("unexpected dialog box: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
        Log.i(str);
    }

    public void APl(int i2) {
        StringBuilder sb = new StringBuilder("unexpected dialog box: ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public void APm(int i2) {
        switch (i2) {
            case 12:
                this.A0W.A03();
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                this.A0V.A01();
                A3B();
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                this.A0a.A09(0);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                this.A0V.A02();
                return;
            case 16:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                this.A0V.A01();
                return;
            case 18:
                Log.i("settings-gdrive/user-confirmed-cancel-encrypted-backup");
                A35();
                return;
            default:
                StringBuilder sb = new StringBuilder("unexpected dialog box: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    public void APr(int i2) {
        StringBuilder sb = new StringBuilder("settings-gdrive/dialogId-");
        sb.append(i2);
        sb.append("-dismissed");
        Log.i(sb.toString());
    }

    public void AXG(String[] strArr, int i2, int i3) {
        String str;
        if (i2 == 10) {
            int[] iArr = SettingsGoogleDriveViewModel.A0g;
            if (i3 > iArr.length) {
                StringBuilder sb = new StringBuilder("settings-gdrive/change-freq/unexpected-choice/");
                sb.append(i3);
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder("settings-gdrive/change-freq/index:");
                sb2.append(i3);
                sb2.append("/value:");
                sb2.append(iArr[i3]);
                Log.i(sb2.toString());
                int A062 = this.A09.A06();
                int i4 = iArr[i3];
                if (!this.A0a.A09(i4)) {
                    str = "settings-gdrive/change-freq failed to set the new frequency.";
                } else {
                    if (i4 != 0) {
                        if (A062 == 0 && !AnonymousClass2GK.A0G(this.A09) && !AnonymousClass2GK.A0H(this.A09)) {
                            this.A04.performClick();
                        }
                    } else if (((SharedPreferences) this.A09.A01.get()).getLong("gdrive_next_prompt_for_setup_timestamp", -1) < System.currentTimeMillis() + 2592000000L) {
                        this.A09.A0l(System.currentTimeMillis() + 2592000000L);
                    }
                    A38();
                    return;
                }
            }
            Log.e(str);
        } else if (i2 != 17) {
            StringBuilder sb3 = new StringBuilder("unexpected dialog box: ");
            sb3.append(i2);
            throw new IllegalStateException(sb3.toString());
        } else if (strArr[i3].equals(getString(R.string.str09ce))) {
            A3A();
        } else {
            A3E(strArr[i3]);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        StringBuilder sb = new StringBuilder("settings-gdrive/activity-result request: ");
        sb.append(i2);
        sb.append(" result: ");
        sb.append(i3);
        Log.i(sb.toString());
        super.onActivityResult(i2, i3, intent);
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    String str = null;
                    String stringExtra = intent != null ? intent.getStringExtra("authAccount") : null;
                    if (i3 == -1) {
                        str = stringExtra;
                    }
                    A3E(str);
                    return;
                } else if (i2 != 150) {
                    if (i2 == 151 && i3 == -1) {
                        if (this.A09.A08() == 23) {
                            this.A0W.A05(10);
                        }
                        if (AnonymousClass2GK.A0H(this.A09) || AnonymousClass2GK.A0G(this.A09)) {
                            C19670yo r3 = this.A0V;
                            r3.A0Y.Acl(new RunnableRunnableShape3S0100000_I0_2(r3, 6));
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i3 == -1) {
                    A39();
                    return;
                } else {
                    return;
                }
            } else if (i3 == -1) {
                AnonymousClass00B.A06(intent);
                A3F(intent.getStringExtra("authtoken"), intent.getStringExtra("authAccount"));
                return;
            } else {
                DialogFragment dialogFragment = (DialogFragment) AGM().A0B("auth_request_dialog");
                if (dialogFragment != null) {
                    dialogFragment.A1D();
                    return;
                }
                return;
            }
        } else if (i3 == -1) {
            A3C();
            String A0M2 = this.A09.A0M();
            if (A0M2 == null || this.A09.A0I(A0M2) == -1) {
                this.A05.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 27));
                return;
            } else if (this.A09.A1m(A0M2) && !this.A09.A1f()) {
                C16040sK r0 = this.A01;
                r0.A0B();
                AnonymousClass1ZT r2 = r0.A05;
                if (r2 != null) {
                    this.A0X.A02(new AnonymousClass3iI(this));
                    Intent A0d2 = C14750ph.A0d(this, "action_delete");
                    A0d2.putExtra("account_name", this.A09.A0M());
                    A0d2.putExtra("jid_user", r2.user);
                    this.A05.Acl(new RunnableRunnableShape3S0200000_I0_1(this, 2, A0d2));
                    return;
                }
                return;
            } else if (this.A09.A1m(A0M2) || !this.A09.A1f()) {
                return;
            }
        } else {
            return;
        }
        A36();
    }

    public void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(C14750ph.A04(this));
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        this.A0a = (SettingsGoogleDriveViewModel) new C006602z(this).A01(SettingsGoogleDriveViewModel.class);
        this.A0c = new IDxSListenerShape415S0100000_2_I0(this, 0);
        setTitle(R.string.str1529);
        setContentView((int) R.layout.layout0055);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        this.A06 = AnonymousClass00T.A05(this, R.id.google_drive_backup_error_info_view);
        this.A04 = findViewById(R.id.settings_gdrive_change_account_view);
        this.A0E = (TextView) AnonymousClass00T.A05(this, R.id.settings_gdrive_account_name_summary);
        this.A0A = (Button) findViewById(R.id.google_drive_backup_now_btn);
        this.A0G = (TextView) findViewById(R.id.google_drive_backup_now_btn_info);
        this.A0H = (TextView) AnonymousClass00T.A05(this, R.id.gdrive_backup_general_info);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.google_drive_progress);
        this.A0D = progressBar;
        C812447k.A00(progressBar, AnonymousClass00T.A00(this, R.color.color0541));
        this.A0B = (ImageView) findViewById(R.id.cancel_download);
        this.A0C = (ImageView) findViewById(R.id.resume_download);
        this.A07 = findViewById(R.id.settings_gdrive_change_frequency_view);
        this.A0F = (TextView) findViewById(R.id.settings_gdrive_backup_options_summary);
        this.A09 = findViewById(R.id.settings_gdrive_network_settings_view);
        this.A0N = (SwitchCompat) findViewById(R.id.gdrive_network_setting);
        this.A08 = findViewById(R.id.settings_gdrive_backup_include_video);
        this.A05 = findViewById(R.id.settings_gdrive_password_protect_backups);
        this.A0P = (WaTextView) findViewById(R.id.settings_gdrive_password_protect_backups_value);
        this.A0R = (WaTextView) findViewById(R.id.settings_gdrive_backup_encryption_info);
        this.A0Q = (WaTextView) findViewById(R.id.settings_encrypted_backup_info);
        this.A0O = (WaLinearLayout) findViewById(R.id.gdrive_backup_e2e_encrypted);
        this.A0M = (SwitchCompat) findViewById(R.id.include_video_setting);
        this.A0L = (TextView) AnonymousClass00T.A05(this, R.id.include_video_settings_summary);
        this.A0K = (TextView) AnonymousClass00T.A05(this, R.id.local_backup_time);
        this.A0J = (TextView) AnonymousClass00T.A05(this, R.id.gdrive_backup_time);
        this.A0I = (TextView) AnonymousClass00T.A05(this, R.id.gdrive_backup_size);
        int A002 = C434920f.A00(this, R.attr.attr0451, R.color.color070f);
        AnonymousClass2SR.A08((ImageView) findViewById(R.id.last_backup_icon), A002);
        AnonymousClass2SR.A08((ImageView) findViewById(R.id.gdrive_icon), A002);
        AnonymousClass2SR.A08((ImageView) findViewById(R.id.backup_settings_icon), A002);
        int[] iArr = SettingsGoogleDriveViewModel.A0f;
        int length = iArr.length;
        this.A0m = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 == R.string.str1557) {
                this.A0m[i2] = getString(R.string.str1557, new Object[]{getString(R.string.str014f)});
            } else {
                this.A0m[i2] = getString(i3);
            }
        }
        this.A05.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 5));
        this.A0U.A0B.A0C(1729);
        this.A0a.A0H.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 4));
        this.A0a.A0b.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 11));
        this.A0a.A0O.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 13));
        this.A0a.A0I.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 28));
        this.A0a.A0F.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 25));
        this.A0a.A02.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 30));
        this.A0a.A04.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 29));
        this.A0a.A0L.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 22));
        this.A0a.A0J.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 21));
        this.A0a.A0K.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 26));
        this.A0a.A09.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 17));
        this.A0a.A0M.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 23));
        this.A0a.A0B.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 19));
        this.A0a.A06.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 15));
        this.A0a.A07.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 16));
        this.A0a.A05.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 14));
        this.A0a.A08.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 2));
        this.A0a.A0D.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 3));
        this.A0a.A0E.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 12));
        this.A0a.A0C.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 20));
        this.A0a.A0N.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 24));
        this.A0a.A0A.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 18));
        SwitchCompat switchCompat = this.A0N;
        boolean z2 = false;
        if (this.A09.A07() == 1) {
            z2 = true;
        }
        switchCompat.setChecked(z2);
        TextView textView = this.A0H;
        boolean A003 = C14730pf.A00();
        int i4 = R.string.str155c;
        if (A003) {
            i4 = R.string.str155b;
        }
        textView.setText(i4);
        A3C();
        this.A03 = new ViewOnClickCListenerShape7S0100000_I0((Object) this, 30);
        this.A00 = new ViewOnClickCListenerShape7S0100000_I0((Object) this, 36);
        this.A01 = new ViewOnClickCListenerShape7S0100000_I0((Object) this, 29);
        this.A0A.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 32));
        ViewOnClickCListenerShape7S0100000_I0 viewOnClickCListenerShape7S0100000_I0 = new ViewOnClickCListenerShape7S0100000_I0((Object) this, 33);
        this.A0B.setOnClickListener(this.A00);
        this.A0C.setOnClickListener(new ViewOnClickCListenerShape7S0100000_I0((Object) this, 28));
        this.A04.setOnClickListener(viewOnClickCListenerShape7S0100000_I0);
        this.A0a.A07();
        this.A09.setOnClickListener(viewOnClickCListenerShape7S0100000_I0);
        this.A07.setOnClickListener(viewOnClickCListenerShape7S0100000_I0);
        this.A08.setOnClickListener(viewOnClickCListenerShape7S0100000_I0);
        this.A0a.A03.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 27));
        bindService(C14750ph.A0d(this, (String) null), this.A0a.A00, 1);
        if (!this.A0V.A0A()) {
            Log.i("settings-gdrive/create google drive access not allowed.");
            finish();
        }
        if ((bundle == null || !bundle.getBoolean("intent_already_parsed", false)) && (intent = getIntent()) != null && intent.getAction() != null) {
            onNewIntent(intent);
        }
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 == 600) {
            return AnonymousClass2UF.A00(this);
        }
        if (i2 == 602) {
            return AnonymousClass2UF.A01(this);
        }
        if (i2 == 605) {
            AnonymousClass2SD r1 = new AnonymousClass2SD(this);
            AnonymousClass2UF.A00 = r1;
            r1.setTitle(R.string.str0d82);
            AnonymousClass2UF.A00.setMessage(getString(R.string.str152a));
            AnonymousClass2UF.A00.setIndeterminate(true);
            AnonymousClass2UF.A00.setCancelable(false);
            return AnonymousClass2UF.A00;
        } else if (i2 != 606) {
            return super.onCreateDialog(i2);
        } else {
            AnonymousClass3KP r12 = new AnonymousClass3KP(this, this.A0a);
            this.A0Z = r12;
            return r12;
        }
    }

    public void onDestroy() {
        this.A0k = true;
        this.A0a.A0e.set(false);
        unbindService(this.A0a.A00);
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return super.onKeyDown(i2, keyEvent);
    }

    public void onNewIntent(Intent intent) {
        C55862kX r1;
        int i2;
        super.onNewIntent(intent);
        String action = intent.getAction();
        StringBuilder sb = new StringBuilder("settings-gdrive/new-intent/action/");
        sb.append(action);
        Log.i(sb.toString());
        if (action != null) {
            String str = "action_perform_backup_over_cellular";
            if (!action.equals(str)) {
                str = "action_perform_media_restore_over_cellular";
                if (!action.equals(str)) {
                    StringBuilder sb2 = new StringBuilder("settings-gdrive/new-intent/unexpected-action/");
                    sb2.append(intent.getAction());
                    Log.e(sb2.toString());
                    return;
                }
                r1 = new C55862kX(15);
                i2 = R.string.str09d4;
            } else {
                r1 = new C55862kX(16);
                i2 = R.string.str09d3;
            }
            r1.A02(getString(i2));
            r1.A07(false);
            r1.A05(getString(R.string.str09e3));
            r1.A03(getString(R.string.str0e1f));
            PromptDialogFragment A002 = r1.A00();
            AnonymousClass050 r0 = new AnonymousClass050(AGM());
            r0.A0C(A002, str);
            r0.A02();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onPause() {
        AnonymousClass12W r0 = this.A0d;
        AnonymousClass29R r1 = this.A0c;
        if (r1 != null) {
            r0.A07.remove(r1);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        AnonymousClass12W r0 = this.A0d;
        AnonymousClass29R r1 = this.A0c;
        if (r1 != null) {
            r0.A07.add(r1);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }
}
