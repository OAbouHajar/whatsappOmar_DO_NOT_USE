package com.google.android.gms.common.api;

import X.AnonymousClass000;
import X.AnonymousClass3CL;
import X.AnonymousClass3YL;
import X.C13690nt;
import X.C15700rh;
import X.C57892s9;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i3, intent);
            if (booleanExtra) {
                AnonymousClass3CL A01 = AnonymousClass3CL.A01(this);
                if (i3 == -1) {
                    Handler handler = A01.A06;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i3 == 0) {
                    A01.A04(new C15700rh(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i2 == 2) {
            this.A00 = 0;
            setResult(i3, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle A0E = C13690nt.A0E(this);
            if (A0E == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) A0E.get("pending_intent");
                Object obj = A0E.get("error_code");
                if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.A00 = 1;
                        return;
                    } catch (ActivityNotFoundException e2) {
                        if (A0E.getBoolean("notify_manager", true)) {
                            AnonymousClass3CL.A01(this).A04(new C15700rh(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String obj2 = pendingIntent.toString();
                            StringBuilder A0g = C13690nt.A0g(obj2.length() + 36);
                            A0g.append("Activity not found while launching ");
                            A0g.append(obj2);
                            String A0h = AnonymousClass000.A0h(".", A0g);
                            if (Build.FINGERPRINT.contains("generic")) {
                                A0h = A0h.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", A0h, e2);
                        }
                        this.A00 = 1;
                    } catch (IntentSender.SendIntentException e3) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e3);
                        finish();
                        return;
                    }
                } else if (obj != null) {
                    int A0D = AnonymousClass000.A0D(obj);
                    Dialog A002 = C57892s9.A00(this, this, new AnonymousClass3YL(this, C57892s9.A00.A01(this, "d", A0D), 2), A0D);
                    if (A002 != null) {
                        C57892s9.A01(this, A002, this, "GooglePlayServicesErrorDialog");
                    }
                    this.A00 = 1;
                    return;
                } else {
                    str = "Activity started without resolution";
                }
            }
            Log.e("GoogleApiActivity", str);
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }
}
