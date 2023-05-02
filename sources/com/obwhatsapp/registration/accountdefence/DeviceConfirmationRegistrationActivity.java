package com.obwhatsapp.registration.accountdefence;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass12L;
import X.AnonymousClass15P;
import X.AnonymousClass1BZ;
import X.AnonymousClass1ZW;
import X.AnonymousClass2JN;
import X.AnonymousClass2Rf;
import X.AnonymousClass3MF;
import X.C001500q;
import X.C004601z;
import X.C005402i;
import X.C005702l;
import X.C006602z;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C17110uY;
import X.C17220uj;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C26831Pk;
import X.C28961Zl;
import X.C32241fu;
import X.C49132Rg;
import X.C51062au;
import X.C57102q8;
import X.C62333Dd;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxObserverShape113S0100000_1_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class DeviceConfirmationRegistrationActivity extends C14530pL {
    public ProgressDialog A00;
    public C51062au A01;
    public TextEmojiLabel A02;
    public TextEmojiLabel A03;
    public TextEmojiLabel A04;
    public AnonymousClass1BZ A05;
    public NewDeviceConfirmationRegistrationViewModel A06;
    public C17220uj A07;
    public C17110uY A08;
    public boolean A09;
    public boolean A0A;

    public DeviceConfirmationRegistrationActivity() {
        this(0);
    }

    public DeviceConfirmationRegistrationActivity(int i2) {
        this.A09 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 82));
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A08 = (C17110uY) r2.ADT.get();
            this.A07 = (C17220uj) r2.A9x.get();
            this.A05 = (AnonymousClass1BZ) r2.A5N.get();
            this.A01 = (C51062au) r1.A1F.get();
        }
    }

    public final void A35() {
        Log.i("DeviceConfirmationRegistrationActivity/removeProgressDialog/");
        ProgressDialog progressDialog = this.A00;
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        this.A00 = null;
    }

    public final void A36(TextEmojiLabel textEmojiLabel, Runnable runnable, String str) {
        SpannableStringBuilder A062 = this.A08.A06(new RunnableRunnableShape13S0100000_I0_12((Object) runnable, 46), textEmojiLabel.getText().toString(), str);
        textEmojiLabel.A07 = new AnonymousClass3MF();
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A08));
        textEmojiLabel.setText(A062);
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout002c);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(this).hasPermanentMenuKey()) {
            Aem(toolbar);
            C005402i x2 = x();
            if (x2 != null) {
                x2.A0N(false);
                x2.A0Q(false);
            }
        }
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = (NewDeviceConfirmationRegistrationViewModel) new C006602z((AnonymousClass04o) new C62333Dd(this), (C001500q) this).A01(NewDeviceConfirmationRegistrationViewModel.class);
        this.A06 = newDeviceConfirmationRegistrationViewModel;
        this.A06.A00(newDeviceConfirmationRegistrationViewModel);
        if (bundle == null && (intent = getIntent()) != null) {
            boolean hasExtra = intent.hasExtra("sms_retry_time");
            boolean hasExtra2 = intent.hasExtra("voice_retry_time");
            long longExtra = intent.getLongExtra("sms_retry_time", 0);
            long longExtra2 = intent.getLongExtra("voice_retry_time", 0);
            this.A0A = getIntent().getBooleanExtra("change_number", false);
            boolean booleanExtra = getIntent().getBooleanExtra("use_sms_retriever", false);
            NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel2 = this.A06;
            boolean z2 = this.A0A;
            if (hasExtra) {
                C26831Pk r9 = newDeviceConfirmationRegistrationViewModel2.A0E.A06;
                StringBuilder sb = new StringBuilder("AccountDefenceLocalDataRepository/saveSmsRetryTime/");
                sb.append(longExtra);
                Log.i(sb.toString());
                SharedPreferences.Editor edit = r9.A01.A00("AccountDefenceLocalDataRepository_prefs").edit();
                edit.putLong("com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.sms_retry_time", longExtra);
                if (!edit.commit()) {
                    Log.e("AccountDefenceLocalDataRepositoryAccountDefenceLocalDataRepository/saveSmsRetryTime/error");
                }
            }
            if (hasExtra2) {
                C26831Pk r7 = newDeviceConfirmationRegistrationViewModel2.A0E.A06;
                StringBuilder sb2 = new StringBuilder("AccountDefenceLocalDataRepository/saveVoiceRetryTime/");
                sb2.append(longExtra2);
                Log.i(sb2.toString());
                SharedPreferences.Editor edit2 = r7.A01.A00("AccountDefenceLocalDataRepository_prefs").edit();
                edit2.putLong("com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.voice_retry_time", longExtra2);
                if (!edit2.commit()) {
                    Log.e("AccountDefenceLocalDataRepositoryAccountDefenceLocalDataRepository/saveVoiceRetryTime/error");
                }
            }
            newDeviceConfirmationRegistrationViewModel2.A03 = z2;
            newDeviceConfirmationRegistrationViewModel2.A04 = booleanExtra;
        }
        this.A06.A0I.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 55));
        this.A06.A0H.A0A(this, new IDxObserverShape113S0100000_1_I0(this, 54));
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel3 = this.A06;
        int A002 = newDeviceConfirmationRegistrationViewModel3.A0C.A00();
        StringBuilder sb3 = new StringBuilder("NewDeviceConfirmationRegistrationViewModel/validateRegistrationState/registration state is ");
        sb3.append(A002);
        Log.i(sb3.toString());
        if (A002 != 14) {
            newDeviceConfirmationRegistrationViewModel3.A0I.A0B(1);
        }
        this.A03 = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.device_confirmation_learn_more);
        this.A04 = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.device_confirmation_resend_notice);
        this.A02 = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.device_confirmation_second_code);
        TextEmojiLabel textEmojiLabel = this.A03;
        NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel4 = this.A06;
        String str = newDeviceConfirmationRegistrationViewModel4.A01;
        AnonymousClass00B.A06(str);
        String str2 = newDeviceConfirmationRegistrationViewModel4.A00;
        AnonymousClass00B.A06(str2);
        String A0E = AnonymousClass2JN.A0E(str2, str);
        AnonymousClass00B.A06(A0E);
        textEmojiLabel.setText(getString(R.string.device_confirmation_learn_more_message, new Object[]{this.A01.A0H(A0E.replace(' ', 160))}));
        A36(this.A03, new RunnableRunnableShape13S0100000_I0_12((Object) this, 43), "device-confirmation-learn-more");
        A36(this.A04, new RunnableRunnableShape13S0100000_I0_12((Object) this, 41), "device-confirmation-resend-notice");
        A36(this.A02, new RunnableRunnableShape13S0100000_I0_12((Object) this, 47), "confirm-with-second-code");
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r3;
        int i3;
        int i4;
        switch (i2) {
            case 11:
                View inflate = getLayoutInflater().inflate(R.layout.layout0060, (ViewGroup) null);
                C32241fu r32 = new C32241fu(this);
                r32.setView(inflate);
                r32.A02(R.string.str144f);
                r32.setPositiveButton(R.string.str14e7, new IDxCListenerShape127S0100000_2_I0(this, 119));
                r32.setNegativeButton(R.string.str0394, new IDxCListenerShape127S0100000_2_I0(this, 121));
                C005702l create = r32.create();
                A36((TextEmojiLabel) inflate.findViewById(R.id.message), new RunnableRunnableShape13S0100000_I0_12((Object) this, 45), "send-device-confirmation-dialog-learn-more");
                return create;
            case 12:
                View inflate2 = getLayoutInflater().inflate(R.layout.layout022f, (ViewGroup) null);
                C32241fu r2 = new C32241fu(this);
                TextView textView = (TextView) inflate2.findViewById(R.id.verification_complete_message);
                if (textView != null) {
                    textView.setText(R.string.str1450);
                }
                r2.setView(inflate2);
                return r2.create();
            case 13:
                r3 = new C32241fu(this);
                r3.A01(R.string.str1448);
                i3 = R.string.str0e87;
                i4 = 122;
                break;
            case 14:
                r3 = new C32241fu(this);
                r3.A02(R.string.str144a);
                r3.A01(R.string.str1449);
                i3 = R.string.str0e87;
                i4 = 123;
                break;
            case 15:
                long A022 = this.A06.A0E.A06.A02();
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = A022 > currentTimeMillis ? A022 - currentTimeMillis : -1;
                View inflate3 = getLayoutInflater().inflate(R.layout.layout0060, (ViewGroup) null);
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(inflate3, R.id.message);
                C32241fu r6 = new C32241fu(this);
                r6.setView(inflate3);
                r6.setTitle(getString(R.string.str144c, new Object[]{C28961Zl.A08(this.A01, j2)}));
                r6.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 124));
                C005702l create2 = r6.create();
                textEmojiLabel.setText(R.string.str144b);
                A36(textEmojiLabel, new RunnableRunnableShape13S0100000_I0_12((Object) this, 44), "send-device-confirmation-too-recent-dialog-learn-more");
                return create2;
            case 16:
                r3 = new C32241fu(this);
                r3.A02(R.string.str13e1);
                r3.A01(R.string.str13e0);
                r3.A07(false);
                i3 = R.string.str0e89;
                i4 = 120;
                break;
            case 17:
                NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = this.A06;
                String str = newDeviceConfirmationRegistrationViewModel.A01;
                AnonymousClass00B.A06(str);
                String str2 = newDeviceConfirmationRegistrationViewModel.A00;
                AnonymousClass00B.A06(str2);
                String A0E = AnonymousClass2JN.A0E(str2, str);
                AnonymousClass00B.A06(A0E);
                String string = getString(R.string.device_confirmation_dialog_description_learn_more, new Object[]{this.A01.A0H(A0E.replace(' ', 160))});
                r3 = new C32241fu(this);
                r3.A06(AnonymousClass1ZW.A01(string, new Object[0]));
                i3 = R.string.str0e89;
                i4 = 125;
                break;
            default:
                return super.onCreateDialog(i2);
        }
        r3.setPositiveButton(i3, new IDxCListenerShape127S0100000_2_I0(this, i4));
        return r3.create();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2, 0, R.string.str13df);
        if (!this.A0A) {
            menu.add(0, 1, 0, R.string.str1369);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId == 2) {
                NewDeviceConfirmationRegistrationViewModel newDeviceConfirmationRegistrationViewModel = this.A06;
                AnonymousClass12L r2 = newDeviceConfirmationRegistrationViewModel.A0D;
                r2.A02("device-confirm");
                newDeviceConfirmationRegistrationViewModel.A0A.A01(this, r2, "device-confirm");
            }
            return super.onOptionsItemSelected(menuItem);
        }
        this.A06.A05();
        return true;
    }
}
