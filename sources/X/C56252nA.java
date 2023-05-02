package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.redex.IDxFListenerShape313S0100000_2_I1;
import com.google.android.gms.common.api.Status;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2nA  reason: invalid class name and case insensitive filesystem */
public class C56252nA extends BroadcastReceiver {
    public boolean A00;
    public final C15860rz A01;
    public final Object A02 = C13690nt.A0Y();
    public final WeakReference A03;
    public volatile boolean A04 = false;

    public C56252nA(C15860rz r2, VerifyPhoneNumber verifyPhoneNumber) {
        this.A03 = C13690nt.A0h(verifyPhoneNumber);
        this.A01 = r2;
    }

    public void onReceive(Context context, Intent intent) {
        SharedPreferences.Editor editor;
        String A0h;
        String str;
        String str2;
        if (!this.A04) {
            synchronized (this.A02) {
                if (!this.A04) {
                    AnonymousClass2IF.A01(context);
                    this.A04 = true;
                }
            }
        }
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Log.i("smsretrieverreceiver/text/intent");
            if (this.A00) {
                str2 = "smsretrieverreceiver/already received";
            } else {
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A03.get();
                if (verifyPhoneNumber == null) {
                    str2 = "receivedtextreceiver/activity is null";
                } else if (verifyPhoneNumber.AIm()) {
                    str2 = "smsretrieverreceiver/destroyed";
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        str = "smsretrieverreceiver/bundle-null";
                    } else {
                        Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        if (status == null) {
                            str = "smsretrieverreceiver/status-null";
                        } else {
                            int i2 = status.A01;
                            if (i2 == 0) {
                                String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                                if (string == null) {
                                    AnonymousClass2JN.A0K(this.A01, "null-sms-message");
                                    return;
                                }
                                String string2 = verifyPhoneNumber.getString(R.string.str1cf7);
                                StringBuilder A0r = AnonymousClass000.A0r("(?:WhatsApp|");
                                A0r.append(Pattern.quote(string2));
                                Matcher matcher = Pattern.compile(AnonymousClass000.A0h(").*?([0-9]{3})-([0-9]{3})", A0r)).matcher(string);
                                if (!matcher.find()) {
                                    A0h = null;
                                } else {
                                    StringBuilder A0o = AnonymousClass000.A0o();
                                    A0o.append(matcher.group(1));
                                    A0h = AnonymousClass000.A0h(matcher.group(2), A0o);
                                }
                                if (C29501aj.A00(A0h, -1) != -1) {
                                    this.A00 = true;
                                    verifyPhoneNumber.A3p(A0h);
                                } else {
                                    Log.w("verifysms/smsretriever/no-code");
                                    AnonymousClass2JN.A0K(this.A01, "server-send-mismatch-empty");
                                }
                                editor = this.A01.A0K().putInt("sms_retriever_retry_count", 0);
                            } else if (i2 == 15) {
                                C15860rz r5 = this.A01;
                                int A012 = C13690nt.A01(C13680ns.A0B(r5), "sms_retriever_retry_count");
                                if (A012 < 2) {
                                    C14210on A013 = new AnonymousClass3WT((Activity) verifyPhoneNumber).A01(new C65673Wd(), 1);
                                    C98854t5 r0 = new C98854t5(this, A012);
                                    Executor executor = C14500pH.A00;
                                    A013.A06(r0, executor);
                                    A013.A05(new IDxFListenerShape313S0100000_2_I1(this, 0), executor);
                                    return;
                                }
                                AnonymousClass2JN.A0K(r5, "timeout-waiting-for-sms");
                                editor = r5.A0K().putInt("sms_retriever_retry_count", 0);
                            } else {
                                return;
                            }
                            editor.apply();
                            return;
                        }
                    }
                    Log.e(str);
                    return;
                }
            }
            Log.i(str2);
        }
    }
}
