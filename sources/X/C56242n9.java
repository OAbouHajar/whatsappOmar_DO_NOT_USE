package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2n9  reason: invalid class name and case insensitive filesystem */
public class C56242n9 extends BroadcastReceiver {
    public boolean A00;
    public final C15860rz A01;
    public final Object A02 = C13690nt.A0Y();
    public final WeakReference A03;
    public volatile boolean A04 = false;

    public C56242n9(C15860rz r2, VerifyPhoneNumber verifyPhoneNumber) {
        this.A03 = C13690nt.A0h(verifyPhoneNumber);
        this.A01 = r2;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        if (!this.A04) {
            synchronized (this.A02) {
                if (!this.A04) {
                    AnonymousClass2IF.A01(context);
                    this.A04 = true;
                }
            }
        }
        Log.i("receivedtextreceiver/text/intent");
        if (this.A00) {
            str = "receivedtextreceiver/already received";
        } else {
            VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A03.get();
            if (verifyPhoneNumber == null) {
                str = "receivedtextreceiver/activity is null";
            } else if (verifyPhoneNumber.AIm()) {
                str = "receivedtextreceiver/destroyed";
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    str = "receivedtextreceiver/bundle-null";
                } else {
                    Object[] objArr = (Object[]) extras.get("pdus");
                    if (objArr == null) {
                        str = "receivedtextreceiver/pdus-null";
                    } else {
                        StringBuilder A0r = AnonymousClass000.A0r("receivedtextreceiver/pdus-length/");
                        A0r.append(r5);
                        C13680ns.A1V(A0r);
                        String string = verifyPhoneNumber.getString(R.string.str1cf7);
                        StringBuilder A0r2 = AnonymousClass000.A0r("(?:WhatsApp|");
                        A0r2.append(Pattern.quote(string));
                        Pattern compile = Pattern.compile(AnonymousClass000.A0h(").*?([0-9]{3})-([0-9]{3})", A0r2));
                        for (Object obj : objArr) {
                            String str2 = null;
                            try {
                                SmsMessage createFromPdu = C15450qv.A04() ? SmsMessage.createFromPdu((byte[]) obj, extras.getString("format")) : SmsMessage.createFromPdu((byte[]) obj);
                                if (createFromPdu != null) {
                                    try {
                                        str2 = createFromPdu.getMessageBody();
                                        StringBuilder A0o = AnonymousClass000.A0o();
                                        A0o.append("verifysms/getMessageBody ");
                                        Log.i(AnonymousClass000.A0h(str2, A0o));
                                        StringBuilder A0o2 = AnonymousClass000.A0o();
                                        A0o2.append("verifysms/displayMessageBody ");
                                        Log.i(AnonymousClass000.A0h(createFromPdu.getDisplayMessageBody(), A0o2));
                                        StringBuilder A0o3 = AnonymousClass000.A0o();
                                        A0o3.append("verifysms/displayOriginatingAddress ");
                                        Log.i(AnonymousClass000.A0h(createFromPdu.getDisplayOriginatingAddress(), A0o3));
                                        StringBuilder A0o4 = AnonymousClass000.A0o();
                                        A0o4.append("verifysms/emailBody ");
                                        Log.i(AnonymousClass000.A0h(createFromPdu.getEmailBody(), A0o4));
                                        StringBuilder A0o5 = AnonymousClass000.A0o();
                                        A0o5.append("verifysms/emailFrom ");
                                        Log.i(AnonymousClass000.A0h(createFromPdu.getEmailFrom(), A0o5));
                                        StringBuilder A0o6 = AnonymousClass000.A0o();
                                        A0o6.append("verifysms/getOriginatingAddress ");
                                        Log.i(AnonymousClass000.A0h(createFromPdu.getOriginatingAddress(), A0o6));
                                        StringBuilder A0o7 = AnonymousClass000.A0o();
                                        A0o7.append("verifysms/getPseudoSubject ");
                                        Log.i(AnonymousClass000.A0h(createFromPdu.getPseudoSubject(), A0o7));
                                        StringBuilder A0o8 = AnonymousClass000.A0o();
                                        A0o8.append("verifysms/getServiceCenterAddress ");
                                        Log.i(AnonymousClass000.A0h(createFromPdu.getServiceCenterAddress(), A0o8));
                                    } catch (NullPointerException e2) {
                                        Log.e("verifysms", e2);
                                    }
                                    if (str2 == null) {
                                        Log.i("receivedtextreceiver/message-null");
                                    } else {
                                        Log.i(C13680ns.A0h("verifysms/text-receiver/", str2));
                                        Matcher matcher = compile.matcher(str2);
                                        if (matcher.find()) {
                                            StringBuilder A0o9 = AnonymousClass000.A0o();
                                            A0o9.append(matcher.group(1));
                                            String A0h = AnonymousClass000.A0h(matcher.group(2), A0o9);
                                            if (A0h != null) {
                                                if (C29501aj.A00(A0h, -1) != -1) {
                                                    this.A00 = true;
                                                    abortBroadcast();
                                                    verifyPhoneNumber.A3p(A0h);
                                                } else {
                                                    Log.w("verifysms/text-receiver/no-code");
                                                    AnonymousClass2JN.A0K(this.A01, "server-send-mismatch-empty");
                                                }
                                            }
                                        }
                                        Log.w("verifysms/text-receiver/not_sms_verification");
                                    }
                                }
                            } catch (OutOfMemoryError e3) {
                                Log.e("verifysms/text/out-of-memory ", e3);
                            }
                        }
                        return;
                    }
                }
            }
        }
        Log.i(str);
    }
}
