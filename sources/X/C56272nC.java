package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2nC  reason: invalid class name and case insensitive filesystem */
public class C56272nC extends BroadcastReceiver {
    public final AnonymousClass01V A00;
    public final C16260sj A01;
    public final C15860rz A02;
    public final AnonymousClass1KP A03;
    public final C47062Hi A04;
    public final C16320sq A05;
    public final Object A06 = C13690nt.A0Y();
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public volatile boolean A0B = false;

    public C56272nC(AnonymousClass01V r2, C16260sj r3, C15860rz r4, AnonymousClass1KP r5, C47062Hi r6, AnonymousClass2FQ r7, C16320sq r8, String str, String str2, String str3) {
        this.A07 = str;
        this.A05 = r8;
        this.A08 = str2;
        this.A09 = str3;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A0A = C13690nt.A0h(r7);
    }

    public void onReceive(Context context, Intent intent) {
        boolean z2;
        if (!this.A0B) {
            synchronized (this.A06) {
                if (!this.A0B) {
                    AnonymousClass2IF.A01(context);
                    this.A0B = true;
                }
            }
        }
        Log.i("flashcall/receiving-incoming-call");
        Intent intent2 = intent;
        if (TelephonyManager.EXTRA_STATE_RINGING.equals(intent2.getStringExtra("state")) && intent2.hasExtra("incoming_number")) {
            String stringExtra = intent2.getStringExtra("incoming_number");
            AnonymousClass2FQ r11 = (AnonymousClass2FQ) this.A0A.get();
            if (r11 != null) {
                if (TextUtils.isEmpty(stringExtra)) {
                    Log.i("flashcall/Could not retrieve incoming call phone number");
                    this.A04.A02 = true;
                } else {
                    String replaceAll = stringExtra.replaceAll("\\D", "");
                    String str = this.A07;
                    Matcher matcher = Pattern.compile(str).matcher(replaceAll);
                    String replaceAll2 = str.replaceAll("\\D", "");
                    int length = replaceAll.length();
                    int i2 = length - 7;
                    int lastIndexOf = replaceAll.lastIndexOf(replaceAll2, i2 - 1);
                    if (!matcher.matches() || length < replaceAll2.length() + 7 || lastIndexOf == -1 || !replaceAll.substring(lastIndexOf, i2).equals(replaceAll2)) {
                        Log.i("flashcall/incoming phone number does not match CLI");
                        this.A04.A01 = true;
                    } else {
                        Log.i("flashcall/incoming phone number matches CLI");
                        VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) r11;
                        verifyPhoneNumber.A1K = true;
                        verifyPhoneNumber.A3J();
                        if (verifyPhoneNumber.A09.A00() == 8) {
                            verifyPhoneNumber.A3D();
                            verifyPhoneNumber.A0v.A01();
                            Log.i("verifyphonenumber/receive-primary-flash-call/valid-phone-number");
                            verifyPhoneNumber.A3U(R.string.str198c);
                        } else {
                            Log.i("verifyphonenumber/receive-secondary-flash-call");
                        }
                        Log.i("flashcall/sending code for verification");
                        C47062Hi r10 = this.A04;
                        if (!this.A01.A0A()) {
                            Log.i("flashcall/Cannot end call");
                        } else {
                            int i3 = Build.VERSION.SDK_INT;
                            AnonymousClass01V r0 = this.A00;
                            if (i3 >= 28) {
                                TelecomManager A0L = r0.A0L();
                                if (A0L != null) {
                                    A0L.endCall();
                                    Log.i("flashcall/End call successful");
                                }
                            } else {
                                TelephonyManager A0N = r0.A0N();
                                if (A0N != null) {
                                    try {
                                        Method declaredMethod = A0N.getClass().getDeclaredMethod("getITelephony", new Class[0]);
                                        declaredMethod.setAccessible(true);
                                        Object invoke = declaredMethod.invoke(A0N, new Object[0]);
                                        invoke.getClass().getDeclaredMethod("endCall", new Class[0]).invoke(invoke, new Object[0]);
                                        Log.i("flashcall/End call successful");
                                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                                        Log.i("flashcall/Cannot end call", e2);
                                    }
                                }
                            }
                            z2 = true;
                            r10.A00 = Boolean.valueOf(z2);
                            C16320sq r1 = this.A05;
                            String str2 = this.A08;
                            String str3 = this.A09;
                            AnonymousClass00B.A06(str3);
                            r1.Ack(new AnonymousClass374(this.A02, (AnonymousClass1NE) null, C47052Hh.AUTO_DETECTED, this.A03, r10, r11, str2, str3, "flash", (String) null, (String) null, false), replaceAll);
                            return;
                        }
                        z2 = false;
                        r10.A00 = Boolean.valueOf(z2);
                        C16320sq r12 = this.A05;
                        String str22 = this.A08;
                        String str32 = this.A09;
                        AnonymousClass00B.A06(str32);
                        r12.Ack(new AnonymousClass374(this.A02, (AnonymousClass1NE) null, C47052Hh.AUTO_DETECTED, this.A03, r10, r11, str22, str32, "flash", (String) null, (String) null, false), replaceAll);
                        return;
                    }
                }
                VerifyPhoneNumber verifyPhoneNumber2 = (VerifyPhoneNumber) r11;
                verifyPhoneNumber2.A1K = false;
                verifyPhoneNumber2.A3J();
                if (verifyPhoneNumber2.A09.A00() == 8) {
                    verifyPhoneNumber2.A3D();
                    verifyPhoneNumber2.A0v.A01();
                    Log.i("verifyphonenumber/receive-primary-flash-call/invalid-phone-number");
                    verifyPhoneNumber2.A3a(verifyPhoneNumber2.A15.A00(), verifyPhoneNumber2.A15.A01());
                    return;
                }
                Log.i("verifyphonenumber/receive-secondary-flash-call");
            }
        }
    }
}
