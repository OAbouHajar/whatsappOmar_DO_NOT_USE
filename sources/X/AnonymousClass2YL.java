package X;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.IDxSConnectionShape327S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.facebook.redex.RunnableRunnableShape3S0100000_I0_2;
import com.facebook.redex.ViewOnClickCListenerShape7S0100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.backup.google.BaseNewUserSetupActivity$AuthRequestDialogFragment;
import com.obwhatsapp.backup.google.PromptDialogFragment;
import com.obwhatsapp.backup.google.SingleChoiceListDialogFragment;
import com.obwhatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S0100000_I0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2YL  reason: invalid class name */
public abstract class AnonymousClass2YL extends AnonymousClass2YM implements C28251Uz, AnonymousClass2GO {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public SwitchCompat A09;
    public SwitchCompat A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public C16200sd A0D;
    public C19670yo A0E;
    public AnonymousClass12U A0F;
    public AnonymousClass12N A0G;
    public AnonymousClass12Q A0H;
    public GoogleDriveNewUserSetupViewModel A0I;
    public AnonymousClass19Y A0J;
    public AnonymousClass12W A0K;
    public C16980tz A0L;
    public C16260sj A0M;
    public C210912t A0N;
    public C16490t9 A0O;
    public AnonymousClass124 A0P;
    public AnonymousClass12P A0Q;
    public boolean A0R;
    public String[] A0S;
    public final ServiceConnection A0T = new IDxSConnectionShape327S0100000_2_I0(this, 0);
    public final ConditionVariable A0U = new ConditionVariable(false);
    public final ConditionVariable A0V = new ConditionVariable(false);
    public final AtomicBoolean A0W = new AtomicBoolean();
    public volatile boolean A0X;

    public static /* synthetic */ void A02(AccountManagerFuture accountManagerFuture, BaseNewUserSetupActivity$AuthRequestDialogFragment baseNewUserSetupActivity$AuthRequestDialogFragment, AnonymousClass2YL r5) {
        try {
            Log.i("settings-gdrive/show-accounts/waiting-for-add-account-activity-to-return");
            Bundle bundle = (Bundle) accountManagerFuture.getResult();
            if (!bundle.containsKey("authAccount")) {
                Log.e("settings-gdrive/error-during-add-account/account-manager-returned-with-no-account-name");
            } else {
                r5.A3A(baseNewUserSetupActivity$AuthRequestDialogFragment, String.valueOf(bundle.get("authAccount")));
            }
        } catch (OperationCanceledException e2) {
            Log.i("settings-gdrive/user-canceled-add-account-operation", e2);
        } catch (AuthenticatorException | IOException e3) {
            Log.e("settings-gdrive/error-during-add-account", e3);
        }
    }

    public static /* synthetic */ void A03(View view, AnonymousClass2YL r6) {
        if (view == r6.A00) {
            r6.A36();
        } else if (view == r6.A04) {
            Log.i("settings-gdrive/toggle-network-pref");
            r6.A05.Acl(new RunnableRunnableShape0S0101000_I0((Object) r6, r6.A0A.isChecked() ? 1 : 0, 3));
        } else if (view == r6.A02) {
            Log.i("settings-gdrive/show-freq-pref");
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 10);
            bundle.putString("title", r6.getString(R.string.str1563));
            bundle.putStringArray("items", r6.A0S);
            int A062 = r6.A09.A06();
            int i2 = 0;
            while (true) {
                int[] iArr = GoogleDriveNewUserSetupViewModel.A06;
                if (i2 < iArr.length) {
                    if (iArr[i2] == A062) {
                        break;
                    }
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder("settings-gdrive/get-backup-freq-index/");
                    sb.append(A062);
                    Log.e(sb.toString());
                    i2 = 0;
                    break;
                }
            }
            bundle.putInt("selected_item_index", i2);
            singleChoiceListDialogFragment.A0T(bundle);
            if (!AnonymousClass29T.A03(r6) && !r6.A0R) {
                AnonymousClass050 r1 = new AnonymousClass050(r6.AGM());
                r1.A0C(singleChoiceListDialogFragment, (String) null);
                r1.A02();
            }
        } else if (view != r6.A03) {
            throw new IllegalArgumentException("Can't handle the click event for the pref view");
        } else if (AnonymousClass2GK.A0G(r6.A09)) {
            r6.Afg(R.string.str157a);
        } else {
            if (AnonymousClass2GK.A0H(r6.A09)) {
                r6.Afg(R.string.str157b);
            } else {
                r6.A09.toggle();
            }
            GoogleDriveNewUserSetupViewModel googleDriveNewUserSetupViewModel = r6.A0I;
            boolean isChecked = r6.A09.isChecked();
            googleDriveNewUserSetupViewModel.A02.A0B(Boolean.valueOf(isChecked));
            googleDriveNewUserSetupViewModel.A04.A1J(isChecked);
        }
    }

    public void A35() {
        this.A0I.A05(0);
    }

    public void A36() {
        int i2;
        AnonymousClass00B.A01();
        if (!AnonymousClass29T.A03(this) && !this.A0R) {
            if (AnonymousClass2GK.A0G(this.A09)) {
                Log.i("settings-gdrive/account-selector/backup/running");
                i2 = R.string.str1579;
            } else if (AnonymousClass2GK.A0H(this.A09)) {
                Log.i("settings-gdrive/account-selector/restore/running");
                i2 = R.string.str157d;
            } else {
                int i3 = 0;
                if (this.A0M.A03("android.permission.GET_ACCOUNTS") != 0 || !this.A0J.A00()) {
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
                A38();
                return;
            }
            Afg(i2);
        }
    }

    public final void A37() {
        WaTextView waTextView;
        int i2;
        if (this.A0D.A04()) {
            boolean A1f = this.A0D.A03.A1f();
            int A062 = this.A09.A06();
            waTextView = this.A0C;
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
            waTextView = this.A0C;
            i2 = R.string.str156e;
        }
        waTextView.setText(i2);
    }

    public final void A38() {
        this.A05.Acl(new RunnableRunnableShape0S0300000_I0(this, AccountManager.get(this).addAccount("com.google", (String) null, (String[]) null, (Bundle) null, this, (AccountManagerCallback) null, (Handler) null), new BaseNewUserSetupActivity$AuthRequestDialogFragment(), 15));
    }

    public final void A39() {
        A37();
        boolean A042 = this.A0D.A04();
        View view = this.A01;
        if (A042) {
            view.setVisibility(0);
            boolean A1f = this.A0D.A03.A1f();
            WaTextView waTextView = this.A0B;
            int i2 = R.string.str1552;
            if (A1f) {
                i2 = R.string.str1553;
            }
            waTextView.setText(i2);
            return;
        }
        view.setVisibility(8);
    }

    public final void A3A(BaseNewUserSetupActivity$AuthRequestDialogFragment baseNewUserSetupActivity$AuthRequestDialogFragment, String str) {
        AnonymousClass00B.A00();
        StringBuilder sb = new StringBuilder("settings-gdrive/auth-request account being used is ");
        sb.append(AnonymousClass2GK.A0B(str));
        Log.i(sb.toString());
        this.A0X = false;
        this.A05.A0K(new RunnableRunnableShape2S0200000_I0(baseNewUserSetupActivity$AuthRequestDialogFragment, 44, this));
        ConditionVariable conditionVariable = this.A0V;
        conditionVariable.close();
        this.A05.Acl(new RunnableRunnableShape0S1200000_I0(baseNewUserSetupActivity$AuthRequestDialogFragment, str, this, 3));
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        C28921Zf r3 = new C28921Zf("settings-gdrive/fetch-auth-token");
        conditionVariable.block(AnonymousClass1NO.A0L);
        this.A05.A0K(new RunnableRunnableShape2S0200000_I0(r3, 46, this));
    }

    public final void A3B(String str) {
        StringBuilder sb = new StringBuilder("setting-gdrive/activity-result/account-picker accountName is ");
        sb.append(AnonymousClass2GK.A0B(str));
        Log.i(sb.toString());
        if (str != null) {
            this.A05.Acl(new RunnableRunnableShape0S1200000_I0(new BaseNewUserSetupActivity$AuthRequestDialogFragment(), str, this, 4));
        } else if (this.A09.A0M() == null) {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            A35();
        }
    }

    public final void A3C(String str, String str2) {
        this.A0V.open();
        DialogFragment dialogFragment = (DialogFragment) AGM().A0B("auth_request_dialog");
        if (dialogFragment != null) {
            dialogFragment.A1D();
        }
        if (str != null) {
            GoogleDriveNewUserSetupViewModel googleDriveNewUserSetupViewModel = this.A0I;
            C15860rz r1 = googleDriveNewUserSetupViewModel.A04;
            if (!TextUtils.equals(r1.A0M(), str2)) {
                r1.A0s(str2);
                AnonymousClass12U r2 = googleDriveNewUserSetupViewModel.A03;
                synchronized (r2.A0O) {
                    r2.A00 = null;
                }
                StringBuilder sb = new StringBuilder("gdrive-new-user-view-model/update-account-name new accountName is ");
                sb.append(AnonymousClass2GK.A0B(str2));
                Log.i(sb.toString());
                googleDriveNewUserSetupViewModel.A00.A0B(str2);
                Intent A0d = C14750ph.A0d(this, "action_fetch_backup_info");
                A0d.putExtra("account_name", str2);
                C446524y.A00(this, A0d);
            } else {
                StringBuilder sb2 = new StringBuilder("gdrive-new-user-view-model/update-account-name account unchanged, token received for ");
                sb2.append(AnonymousClass2GK.A0B(str2));
                Log.i(sb2.toString());
            }
        }
        this.A05.Acl(new RunnableRunnableShape3S0100000_I0_2(this, 4));
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
                this.A0F.A03();
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                this.A0E.A01();
                this.A0F.A05(10);
                Intent A0d = C14750ph.A0d(this, "action_backup");
                A0d.putExtra("backup_mode", "user_initiated");
                C446524y.A00(this, A0d);
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                this.A0I.A05(0);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                this.A0E.A02();
                return;
            case 16:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                this.A0E.A01();
                return;
            case 18:
                Log.i("settings-gdrive/user-confirmed-cancel-encrypted-backup");
                Log.i("settings-gdrive/cancel-backup");
                this.A05.setVisibility(8);
                this.A0F.A03();
                if (AnonymousClass2GK.A0K(this.A0C)) {
                    try {
                        for (AnonymousClass0Rc r0 : (List) ((AnonymousClass022) this.A0Q.get()).A03().get()) {
                            if (!r0.A03.A00()) {
                                ((AnonymousClass022) this.A0Q.get()).A0A("com.obwhatsapp.backup.google.google-backup-worker");
                                return;
                            }
                        }
                        return;
                    } catch (InterruptedException | ExecutionException unused) {
                        Log.e("settings-gdrive/cancel-backup couldn't get work info for BackupWorker.");
                        return;
                    }
                } else {
                    return;
                }
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
            int[] iArr = GoogleDriveNewUserSetupViewModel.A06;
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
                if (!this.A0I.A05(i4)) {
                    str = "settings-gdrive/change-freq failed to set the new frequency.";
                } else {
                    if (i4 != 0) {
                        if (A062 == 0 && !AnonymousClass2GK.A0G(this.A09) && !AnonymousClass2GK.A0H(this.A09)) {
                            this.A00.performClick();
                        }
                    } else if (((SharedPreferences) this.A09.A01.get()).getLong("gdrive_next_prompt_for_setup_timestamp", -1) < System.currentTimeMillis() + 2592000000L) {
                        this.A09.A0l(System.currentTimeMillis() + 2592000000L);
                    }
                    A37();
                    return;
                }
            }
            Log.e(str);
        } else if (i2 != 17) {
            StringBuilder sb3 = new StringBuilder("unexpected dialog box: ");
            sb3.append(i2);
            throw new IllegalStateException(sb3.toString());
        } else if (strArr[i3].equals(getString(R.string.str09ce))) {
            A38();
        } else {
            A3B(strArr[i3]);
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
                    A3B(str);
                } else if (i2 == 150 && i3 == -1) {
                    A36();
                }
            } else if (i3 == -1) {
                AnonymousClass00B.A06(intent);
                A3C(intent.getStringExtra("authtoken"), intent.getStringExtra("authAccount"));
            } else {
                DialogFragment dialogFragment = (DialogFragment) AGM().A0B("auth_request_dialog");
                if (dialogFragment != null) {
                    dialogFragment.A1D();
                }
            }
        } else if (i3 == -1) {
            A39();
        }
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        this.A0I = (GoogleDriveNewUserSetupViewModel) new C006602z(this).A01(GoogleDriveNewUserSetupViewModel.class);
        setTitle(R.string.str1529);
        setContentView((int) R.layout.layout0055);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        this.A00 = findViewById(R.id.settings_gdrive_change_account_view);
        this.A06 = (TextView) AnonymousClass00T.A05(this, R.id.settings_gdrive_account_name_summary);
        this.A08 = (TextView) AnonymousClass00T.A05(this, R.id.gdrive_backup_general_info);
        this.A05 = (ImageView) findViewById(R.id.cancel_download);
        this.A02 = findViewById(R.id.settings_gdrive_change_frequency_view);
        this.A07 = (TextView) findViewById(R.id.settings_gdrive_backup_options_summary);
        this.A04 = findViewById(R.id.settings_gdrive_network_settings_view);
        this.A0A = (SwitchCompat) findViewById(R.id.gdrive_network_setting);
        this.A03 = findViewById(R.id.settings_gdrive_backup_include_video);
        this.A01 = findViewById(R.id.settings_gdrive_password_protect_backups);
        this.A0B = (WaTextView) findViewById(R.id.settings_gdrive_password_protect_backups_value);
        this.A0C = (WaTextView) findViewById(R.id.settings_gdrive_backup_encryption_info);
        this.A09 = (SwitchCompat) findViewById(R.id.include_video_setting);
        int A002 = C434920f.A00(this, R.attr.attr0451, R.color.color070f);
        AnonymousClass2SR.A08((ImageView) findViewById(R.id.last_backup_icon), A002);
        AnonymousClass2SR.A08((ImageView) findViewById(R.id.gdrive_icon), A002);
        AnonymousClass2SR.A08((ImageView) findViewById(R.id.backup_settings_icon), A002);
        int[] iArr = GoogleDriveNewUserSetupViewModel.A05;
        int length = iArr.length;
        this.A0S = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 == R.string.str1557) {
                this.A0S[i2] = getString(R.string.str1557, new Object[]{getString(R.string.str014f)});
            } else {
                this.A0S[i2] = getString(i3);
            }
        }
        this.A01.setOnClickListener(new ViewOnClickCListenerShape0S0100000_I0(this, 4));
        this.A0I.A02.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 6));
        this.A0I.A00.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 8));
        this.A0I.A01.A0A(this, new IDxObserverShape115S0100000_2_I0((Object) this, 7));
        TextView textView = this.A08;
        boolean A003 = C14730pf.A00();
        int i4 = R.string.str099a;
        if (A003) {
            i4 = R.string.str0999;
        }
        textView.setText(i4);
        A39();
        ViewOnClickCListenerShape7S0100000_I0 viewOnClickCListenerShape7S0100000_I0 = new ViewOnClickCListenerShape7S0100000_I0((Object) this, 18);
        this.A00.setOnClickListener(viewOnClickCListenerShape7S0100000_I0);
        this.A04.setOnClickListener(viewOnClickCListenerShape7S0100000_I0);
        this.A02.setOnClickListener(viewOnClickCListenerShape7S0100000_I0);
        this.A03.setOnClickListener(viewOnClickCListenerShape7S0100000_I0);
        bindService(C14750ph.A0d(this, (String) null), this.A0T, 1);
        if (!this.A0E.A0A()) {
            Log.i("settings-gdrive/create google drive access not allowed.");
            finish();
        }
        if ((bundle == null || !bundle.getBoolean("intent_already_parsed", false)) && (intent = getIntent()) != null && intent.getAction() != null) {
            onNewIntent(intent);
        }
    }

    public Dialog onCreateDialog(int i2) {
        return i2 != 600 ? i2 != 602 ? super.onCreateDialog(i2) : AnonymousClass2UF.A01(this) : AnonymousClass2UF.A00(this);
    }

    public void onDestroy() {
        this.A0R = true;
        this.A0W.set(false);
        unbindService(this.A0T);
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

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }
}
