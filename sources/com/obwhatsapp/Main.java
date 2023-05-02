package com.obwhatsapp;

import X.AnonymousClass01D;
import X.AnonymousClass129;
import X.AnonymousClass1RE;
import X.AnonymousClass29T;
import X.AnonymousClass2RY;
import X.AnonymousClass2RZ;
import X.AnonymousClass2S1;
import X.C004201v;
import X.C14750ph;
import X.C15480r5;
import X.C16040sK;
import X.C16250si;
import X.C16900tq;
import X.C16980tz;
import X.C17240ul;
import X.C18890xQ;
import X.C18900xR;
import X.C19240y6;
import X.C19590yg;
import X.C19710ys;
import X.C19760yx;
import X.C32241fu;
import X.C47702Kb;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.obwhatsapp.companionmode.CompanionStateHolder$CompanionLogoutStateReceiver;
import com.obwhatsapp.yo.yo;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import java.net.URISyntaxException;

public class Main extends C47702Kb {
    public AnonymousClass129 A00;
    public AnonymousClass2S1 A01;
    public C18900xR A02;
    public C18890xQ A03;
    public C19590yg A04;
    public C15480r5 A05;
    public C19710ys A06;
    public AnonymousClass1RE A07;
    public C16250si A08;
    public C16900tq A09;
    public C17240ul A0A;
    public C19240y6 A0B;
    public WhatsAppLibLoader A0C;
    public C19760yx A0D;
    public AnonymousClass01D A0E;
    public boolean A0F;

    public final void A39() {
        if (!isFinishing()) {
            Intent intent = getIntent();
            if (intent != null && !"android.intent.action.MAIN".equals(intent.getAction()) && (intent.getFlags() & 67108864) != 0 && ((SharedPreferences) this.A09.A01.get()).getInt("shortcut_version", 0) == 0) {
                Log.i("main/recreate_shortcut");
                String string = getString(R.string.str1bd4);
                Intent A042 = C14750ph.A04(this);
                A042.addFlags(268435456);
                A042.addFlags(67108864);
                Intent intent2 = new Intent();
                try {
                    intent2.putExtra("android.intent.extra.shortcut.INTENT", Intent.parseUri(A042.toUri(0), 0));
                } catch (URISyntaxException e2) {
                    StringBuilder sb = new StringBuilder("RegisterName/remove-shortcut cannot parse shortcut uri ");
                    sb.append(e2.getMessage());
                    Log.e(sb.toString(), e2);
                }
                intent2.putExtra("android.intent.extra.shortcut.NAME", string);
                intent2.setAction("com.android.launcher.action.UNINSTALL_SHORTCUT");
                sendBroadcast(intent2);
                AnonymousClass2RZ.A00(this, getString(R.string.str1bd4));
                this.A09.A0K().putInt("shortcut_version", 1).apply();
            }
            if (this.A0F && !isFinishing()) {
                Intent a2 = yo.a2(C14750ph.A02(this));
                a2.putExtra("show_payment_account_recovery", getIntent().getBooleanExtra("show_payment_account_recovery", false));
                startActivity(a2);
                overridePendingTransition(0, 0);
            }
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        Intent intent;
        C004201v.A01("Main/onCreate");
        try {
            this.A02.A09("Main");
            this.A02.A0A("Main", "onCreate", "_start");
            this.A02.A08("main_onCreate");
            super.onCreate(bundle);
            setTitle(R.string.str1cf5);
            if (!this.A0C.A03()) {
                Log.i("aborting due to native libraries missing");
                intent = new Intent();
                intent.setClassName(getPackageName(), "com.obwhatsapp.corruptinstallation.CorruptInstallationActivity");
            } else {
                if (C18900xR.A00()) {
                    Log.w("main/device-not-supported");
                    setTheme(R.style.style0302);
                    Afc(new DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment());
                } else {
                    AnonymousClass1RE r10 = this.A07;
                    C16980tz r1 = r10.A03;
                    PackageManager packageManager = r1.A00.getPackageManager();
                    ComponentName componentName = r10.A01;
                    if (componentName == null) {
                        componentName = new ComponentName(r1.A00, CompanionStateHolder$CompanionLogoutStateReceiver.class);
                        r10.A01 = componentName;
                    }
                    if (packageManager.getComponentEnabledSetting(componentName) == 1) {
                        intent = new Intent();
                        intent.setClassName(getPackageName(), "com.obwhatsapp.companionmode.registration.CompanionPostLogoutActivity");
                    } else {
                        int A002 = this.A09.A00();
                        C16040sK r0 = this.A01;
                        r0.A0B();
                        Me me = r0.A00;
                        if (me == null && A002 == 0) {
                            if (!isFinishing()) {
                                startActivity(C14750ph.A0n(this, getIntent().getBooleanExtra("show_registration_first_dlg", false)));
                                finishAffinity();
                            }
                        } else if (A002 != 6) {
                            if (me != null) {
                                C16900tq r02 = this.A09;
                                r02.A04();
                                if (!r02.A01) {
                                    AnonymousClass2RY r03 = this.A00;
                                    if (r03.A07.A03(r03.A06)) {
                                        int A052 = this.A08.A05();
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("main/create/backupfilesfound ");
                                        sb.append(A052);
                                        Log.i(sb.toString());
                                        if (A052 > 0) {
                                            AnonymousClass29T.A01(this, 105);
                                        } else {
                                            A38(false);
                                        }
                                    }
                                }
                            }
                            this.A0F = true;
                            A36();
                        } else if (!isFinishing()) {
                            intent = new Intent();
                            intent.setClassName(getPackageName(), "com.obwhatsapp.account.delete.DeleteAccountConfirmation");
                        }
                    }
                }
                this.A02.A0A("Main", "onCreate", "_end");
                this.A02.A07("main_onCreate");
                C004201v.A00();
            }
            startActivity(intent);
            finish();
            this.A02.A0A("Main", "onCreate", "_end");
            this.A02.A07("main_onCreate");
            C004201v.A00();
        } catch (Throwable th) {
            this.A02.A0A("Main", "onCreate", "_end");
            this.A02.A07("main_onCreate");
            C004201v.A00();
            throw th;
        }
    }

    public Dialog onCreateDialog(int i2) {
        setTheme(R.style.style0302);
        if (i2 != 0) {
            return super.onCreateDialog(i2);
        }
        Log.i("main/dialog/upgrade");
        this.A02.A06("upgrade");
        C32241fu r3 = new C32241fu(this);
        r3.A02(R.string.str18b4);
        r3.A01(R.string.str18b3);
        r3.A07(false);
        r3.setPositiveButton(R.string.str1ba6, new IDxCListenerShape127S0100000_2_I0(this, 13));
        r3.setNegativeButton(R.string.str0c13, new IDxCListenerShape127S0100000_2_I0(this, 12));
        return r3.create();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        super.onStart();
        this.A0F = true;
    }

    public void onStop() {
        super.onStop();
        this.A0F = false;
    }
}
