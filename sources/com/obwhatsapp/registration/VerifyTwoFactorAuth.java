package com.obwhatsapp.registration;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass12L;
import X.AnonymousClass130;
import X.AnonymousClass15P;
import X.AnonymousClass15W;
import X.AnonymousClass1BN;
import X.AnonymousClass1KO;
import X.AnonymousClass1KP;
import X.AnonymousClass1KQ;
import X.AnonymousClass2FL;
import X.AnonymousClass2JN;
import X.AnonymousClass2Rf;
import X.AnonymousClass37J;
import X.AnonymousClass39H;
import X.AnonymousClass3MF;
import X.C001000l;
import X.C004601z;
import X.C005702l;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
import X.C14860ps;
import X.C14870pt;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16260sj;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16980tz;
import X.C17130ua;
import X.C17220uj;
import X.C17250um;
import X.C18000vz;
import X.C18260wP;
import X.C19380yL;
import X.C19490yW;
import X.C19760yx;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C28961Zl;
import X.C32241fu;
import X.C46522Er;
import X.C47112Hq;
import X.C49132Rg;
import X.C57102q8;
import X.C63723Lg;
import X.C87424Ws;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCObserverShape305S0100000_2_I0;
import com.facebook.redex.IDxECallbackShape271S0100000_2_I0;
import com.facebook.redex.IDxSInterfaceShape356S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S2101000_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

public class VerifyTwoFactorAuth extends C14530pL implements C46522Er {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public CountDownTimer A06;
    public ProgressBar A07;
    public TextView A08;
    public C005702l A09;
    public CodeInputField A0A;
    public AnonymousClass1KO A0B;
    public C17130ua A0C;
    public C16980tz A0D;
    public C19380yL A0E;
    public C16260sj A0F;
    public AnonymousClass1KQ A0G;
    public AnonymousClass15W A0H;
    public C87424Ws A0I;
    public AnonymousClass39H A0J;
    public AnonymousClass1KP A0K;
    public C19760yx A0L;
    public AnonymousClass12L A0M;
    public AnonymousClass2FL A0N;
    public AnonymousClass1BN A0O;
    public AnonymousClass37J A0P;
    public AnonymousClass130 A0Q;
    public C17220uj A0R;
    public C14860ps A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public final Handler A0c;
    public final C18000vz A0d;
    public final Runnable A0e;

    public class ConfirmResetCode extends Hilt_VerifyTwoFactorAuth_ConfirmResetCode {
        public static ConfirmResetCode A01(int i2, long j2) {
            ConfirmResetCode confirmResetCode = new ConfirmResetCode();
            Bundle bundle = new Bundle();
            bundle.putInt("wipeStatus", i2);
            bundle.putLong("timeToWaitInMillis", j2);
            confirmResetCode.A0T(bundle);
            return confirmResetCode;
        }

        public Dialog A1B(Bundle bundle) {
            int millis;
            AnonymousClass013 r1;
            int i2;
            Bundle bundle2 = this.A05;
            int i3 = bundle2.getInt("wipeStatus");
            long j2 = bundle2.getLong("timeToWaitInMillis");
            C32241fu r11 = new C32241fu(A0u());
            View inflate = LayoutInflater.from(A0u()).inflate(R.layout.layout05c0, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(R.id.two_fa_help_dialog_text);
            View findViewById = inflate.findViewById(16908313);
            View findViewById2 = inflate.findViewById(16908314);
            View findViewById3 = inflate.findViewById(16908315);
            View findViewById4 = inflate.findViewById(R.id.spacer);
            findViewById.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 4));
            findViewById2.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 3));
            if (i3 == 1) {
                long millis2 = TimeUnit.DAYS.toMillis(1);
                if (j2 > millis2) {
                    millis = (int) (j2 / millis2);
                    r1 = this.A02;
                    i2 = 3;
                } else {
                    long millis3 = TimeUnit.HOURS.toMillis(1);
                    if (j2 > millis3) {
                        millis = (int) (j2 / millis3);
                        r1 = this.A02;
                        i2 = 2;
                    } else {
                        long millis4 = TimeUnit.MINUTES.toMillis(1);
                        if (j2 > millis4) {
                            millis = (int) (j2 / millis4);
                            r1 = this.A02;
                            i2 = 1;
                        } else {
                            millis = (int) (j2 / TimeUnit.SECONDS.toMillis(1));
                            r1 = this.A02;
                            i2 = 0;
                        }
                    }
                }
                textView.setText(A0K(R.string.str1849, C28961Zl.A02(r1, millis, i2)));
            } else if (i3 == 2 || i3 == 3) {
                textView.setText(R.string.str184b);
                findViewById3.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 5));
                findViewById3.setVisibility(0);
                findViewById4.setVisibility(0);
            }
            r11.setView(inflate);
            return r11.create();
        }
    }

    public class ConfirmWipe extends Hilt_VerifyTwoFactorAuth_ConfirmWipe {
        public static ConfirmWipe A01(int i2) {
            ConfirmWipe confirmWipe = new ConfirmWipe();
            Bundle A0D = C13690nt.A0D();
            A0D.putInt("wipeStatus", i2);
            confirmWipe.A0T(A0D);
            return confirmWipe;
        }

        public Dialog A1B(Bundle bundle) {
            int i2;
            int i3 = this.A05.getInt("wipeStatus");
            C001000l A0C = A0C();
            C32241fu A00 = C32241fu.A00(A0C);
            C13680ns.A1H(A00, A0C, 91, R.string.str184a);
            C13690nt.A1E(A00);
            if (i3 == 1 || i3 == 2) {
                i2 = R.string.str184f;
            } else {
                if (i3 == 3) {
                    i2 = R.string.str184e;
                }
                return A00.create();
            }
            A00.A01(i2);
            return A00.create();
        }
    }

    public VerifyTwoFactorAuth() {
        this(0);
        this.A0c = new Handler(Looper.getMainLooper());
        this.A0e = new RunnableRunnableShape13S0100000_I0_12(this, 40);
        this.A0d = new IDxCObserverShape305S0100000_2_I0(this, 2);
    }

    public VerifyTwoFactorAuth(int i2) {
        this.A0Z = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 81));
    }

    public void A1q() {
        if (!this.A0Z) {
            this.A0Z = true;
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
            this.A0D = (C16980tz) r1.AQB.get();
            this.A0C = (C17130ua) r1.AN9.get();
            this.A0B = (AnonymousClass1KO) r1.ALY.get();
            this.A0R = (C17220uj) r1.A9x.get();
            this.A0H = (AnonymousClass15W) r1.AOC.get();
            this.A0G = (AnonymousClass1KQ) r1.AAL.get();
            this.A0L = (C19760yx) r1.AKx.get();
            this.A0O = (AnonymousClass1BN) r1.AAp.get();
            this.A0F = (C16260sj) r1.AQe.get();
            this.A0S = (C14860ps) r1.API.get();
            this.A0M = (AnonymousClass12L) r1.APo.get();
            this.A0E = (C19380yL) r1.AQd.get();
            this.A0Q = (AnonymousClass130) r1.AMn.get();
            this.A0K = (AnonymousClass1KP) r1.AKw.get();
        }
    }

    public void A2S(int i2) {
        if (i2 == R.string.str185c) {
            if (this.A0A.isEnabled()) {
                InputMethodManager A0Q2 = this.A08.A0Q();
                AnonymousClass00B.A06(A0Q2);
                A0Q2.toggleSoftInput(1, 0);
            }
        } else if (i2 == R.string.str13a9 || i2 == R.string.str13cd || i2 == R.string.str1859) {
            this.A0L.A08();
            startActivity(C14750ph.A06(this));
            finish();
        }
    }

    public final int A35() {
        if ((this.A03 + (this.A05 * 1000)) - this.A05.A00() <= 0) {
            String str = this.A0X;
            if ("offline".equals(str)) {
                return 2;
            }
            if ("full".equals(str)) {
                return 3;
            }
        }
        return 1;
    }

    public final void A36(int i2, String str, boolean z2) {
        int i3 = i2;
        this.A01 = i2;
        String str2 = str;
        this.A0V = str;
        this.A0a = z2;
        int i4 = 33;
        if (i2 != 1) {
            i4 = 34;
            if (i2 != 2) {
                i4 = 31;
            }
        }
        this.A00 = i4;
        C16320sq r1 = this.A05;
        AnonymousClass37J r2 = new AnonymousClass37J(this.A09, this.A0K, this, this.A0W, this.A0T, this.A0U, str2, i3);
        this.A0P = r2;
        r1.Ack(r2, new String[0]);
    }

    public final void A37(long j2) {
        CountDownTimer start;
        long j3 = j2;
        if (j2 < 1000) {
            getPreferences(0).edit().remove("code_retry_time").apply();
            CountDownTimer countDownTimer = this.A06;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                start = null;
            } else {
                return;
            }
        } else {
            getPreferences(0).edit().putLong("code_retry_time", this.A05.A00() + j2).apply();
            this.A0B.A01(this.A0A);
            this.A0A.setEnabled(false);
            this.A07.setProgress(0);
            this.A08.setText(R.string.str1837);
            this.A08.setVisibility(0);
            start = new C63723Lg(this, j3, j2).start();
        }
        this.A06 = start;
    }

    public void A38(C47112Hq r12) {
        this.A0X = r12.A07;
        this.A0W = r12.A06;
        this.A05 = r12.A02;
        this.A02 = r12.A01;
        this.A04 = r12.A00;
        long A002 = this.A05.A00();
        this.A03 = A002;
        this.A09.A1B(this.A0X, this.A0W, this.A05, this.A02, this.A04, A002);
    }

    public void A39(String str, String str2) {
        this.A0L.A0C(this.A0T, this.A0U, str2);
        C14860ps r2 = this.A0S;
        r2.A0A.Aco(new RunnableRunnableShape0S2101000_I0(r2, str, (String) null, 5, 1));
        this.A0O.A04("2fa", "successful");
        if (this.A0I.A02) {
            AnonymousClass2JN.A0G(this, this.A0E, this.A0L, false);
        } else if (!this.A0Y) {
            Log.i("VerifyTwoFactorAuth/removeProgressDialog/");
            this.A0L.A0A(2);
            A2X(C14750ph.A05(this), true);
            return;
        } else {
            this.A0L.A0D();
        }
        finish();
    }

    public final void A3A(boolean z2) {
        AnonymousClass2FL r1 = this.A0N;
        if (r1 != null) {
            r1.A06(true);
        }
        if (z2) {
            this.A02 = -1;
            this.A09.A1B(this.A0X, this.A0W, this.A05, -1, this.A04, this.A03);
        }
        this.A0c.removeCallbacks(this.A0e);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        C16320sq r6 = this.A05;
        this.A0J = new AnonymousClass39H(this.A0C, this.A01, this.A0G, this.A0D, this.A0R, r6);
        setTitle(R.string.str185b);
        this.A0I = new C87424Ws(this, this.A09);
        Intent intent = getIntent();
        if (intent.getExtras() != null && intent.getBooleanExtra("changenumber", false)) {
            this.A0Y = true;
        }
        setContentView((int) R.layout.layout005a);
        this.A0O.A01("2fa");
        AnonymousClass2JN.A0H(this.A00, this, this.A01, false, false);
        this.A0A = (CodeInputField) C004601z.A0E(this.A00, R.id.code);
        this.A07 = (ProgressBar) C004601z.A0E(this.A00, R.id.progress_bar_code_input_blocked);
        this.A08 = (TextView) C004601z.A0E(this.A00, R.id.description_bottom);
        this.A0A.A08(new IDxECallbackShape271S0100000_2_I0(this, 2), new IDxSInterfaceShape356S0100000_2_I0(this, 0), (String) null, getString(R.string.str0041, new Object[]{6}), '*', '*', 6);
        this.A0A.setPasswordTransformationEnabled(true);
        this.A0A.setEnabled(true);
        this.A07.setProgress(100);
        this.A0T = this.A09.A0O();
        this.A0U = this.A09.A0Q();
        this.A0X = ((SharedPreferences) this.A09.A01.get()).getString("registration_wipe_type", (String) null);
        this.A0W = ((SharedPreferences) this.A09.A01.get()).getString("registration_wipe_token", (String) null);
        this.A05 = ((SharedPreferences) this.A09.A01.get()).getLong("registration_wipe_wait", -1);
        this.A02 = ((SharedPreferences) this.A09.A01.get()).getLong("registration_wipe_expiry", -1);
        this.A04 = ((SharedPreferences) this.A09.A01.get()).getLong("registration_wipe_server_time", -1);
        this.A03 = this.A09.A0J("registration_wipe_info_timestamp");
        if (this.A02 > 0) {
            A3A(false);
            this.A0c.postDelayed(this.A0e, 0);
        }
        if (bundle != null && !bundle.getBoolean("shouldShowTheForgetPinDialog", false)) {
            A2e("forgotPinDialogTag");
        }
    }

    public Dialog onCreateDialog(int i2) {
        if (i2 == 109) {
            C16320sq r12 = this.A05;
            return AnonymousClass2JN.A03(this, this.A0B, this.A07, this.A08, this.A0F, this.A0H, this.A0K, r12);
        } else if (i2 == 124) {
            return AnonymousClass2JN.A04(this, this.A0B, this.A01, this.A0H, new RunnableRunnableShape13S0100000_I0_12(this, 38), this.A0T, this.A0U);
        } else if (i2 == 125) {
            return AnonymousClass2JN.A05(this, this.A0B, this.A0H, this.A0T, this.A0U);
        } else {
            switch (i2) {
                case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                    ProgressDialog progressDialog = new ProgressDialog(this);
                    progressDialog.setMessage(getString(R.string.str13d6));
                    progressDialog.setIndeterminate(true);
                    progressDialog.setCancelable(false);
                    return progressDialog;
                case 32:
                    C32241fu r4 = new C32241fu(this);
                    r4.A06(getString(R.string.str1372, new Object[]{getString(R.string.str053b)}));
                    r4.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 118));
                    return r4.create();
                case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                    ProgressDialog progressDialog2 = new ProgressDialog(this);
                    progressDialog2.setMessage(getString(R.string.str1856));
                    progressDialog2.setIndeterminate(true);
                    progressDialog2.setCancelable(false);
                    return progressDialog2;
                case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                    ProgressDialog progressDialog3 = new ProgressDialog(this);
                    progressDialog3.setMessage(getString(R.string.str1851));
                    progressDialog3.setIndeterminate(true);
                    progressDialog3.setCancelable(false);
                    return progressDialog3;
                default:
                    return super.onCreateDialog(i2);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.str13df);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        AnonymousClass37J r1 = this.A0P;
        if (r1 != null) {
            r1.A06(true);
        }
        A3A(false);
        CountDownTimer countDownTimer = this.A06;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A06 = null;
        }
        this.A0b = false;
        this.A07.A03(this.A0d);
        this.A0J.A00();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        StringBuilder sb = new StringBuilder("register-2fa +");
        sb.append(this.A0T);
        sb.append(this.A0U);
        String obj = sb.toString();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A0M.A02("verify-2fa");
            this.A0J.A01(this, this.A0M, obj);
            return true;
        } else if (itemId != 1) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0L.A08();
            startActivity(C14750ph.A01(this));
            finishAffinity();
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.A06 == null) {
            long j2 = getPreferences(0).getLong("code_retry_time", -1);
            if (j2 != -1) {
                A37(j2 - this.A05.A00());
            }
        }
        this.A0A.requestFocus();
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.description);
        textEmojiLabel.A07 = new AnonymousClass3MF();
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A08));
        textEmojiLabel.setText(AnonymousClass2JN.A08(new RunnableRunnableShape13S0100000_I0_12(this, 39), getString(R.string.str185a), "forgot-pin"));
    }

    public void onSaveInstanceState(Bundle bundle) {
        boolean z2 = false;
        if (AGM().A0B("forgotPinDialogTag") != null) {
            z2 = true;
        }
        bundle.putBoolean("shouldShowTheForgetPinDialog", z2);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        if (this.A0b) {
            this.A0b = true;
            try {
                this.A07.A02(this.A0d);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public void onStop() {
        super.onStop();
        Log.i("VerifyTwoFactorAuth/removeProgressDialog/");
        C005702l r0 = this.A09;
        if (r0 != null) {
            r0.dismiss();
            this.A09 = null;
        }
        this.A0b = true;
        this.A07.A03(this.A0d);
    }
}
