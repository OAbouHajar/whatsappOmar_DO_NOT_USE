package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.4XR  reason: invalid class name */
public class AnonymousClass4XR {
    public final SharedPreferences A00;

    public AnonymousClass4XR(SharedPreferences sharedPreferences) {
        this.A00 = sharedPreferences;
    }

    public long A00() {
        long j2 = this.A00.getLong("com.obwhatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time", -1);
        System.currentTimeMillis();
        return j2;
    }

    public long A01() {
        return this.A00.getLong("com.obwhatsapp.registration.VerifyPhoneNumber.call_countdown_end_time", -1);
    }

    public String A02(String str, String str2) {
        SharedPreferences sharedPreferences = this.A00;
        sharedPreferences.edit();
        if (!str.equals(sharedPreferences.getString("com.obwhatsapp.registration.VerifyPhoneNumber.sms_cc", (String) null)) || !str2.equals(sharedPreferences.getString("com.obwhatsapp.registration.VerifyPhoneNumber.sms_phone_number", (String) null))) {
            return null;
        }
        return sharedPreferences.getString("com.obwhatsapp.registration.VerifyPhoneNumber.sms_code", (String) null);
    }

    public void A03() {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.remove("com.obwhatsapp.registration.VerifyPhoneNumber.code_verification_retry_time");
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/clear-code-verification-retry-time/error");
        }
    }

    public void A04() {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.remove("com.obwhatsapp.registration.VerifyPhoneNumber.sms_code");
        edit.remove("com.obwhatsapp.registration.VerifyPhoneNumber.sms_cc");
        edit.remove("com.obwhatsapp.registration.VerifyPhoneNumber.sms_phone_number");
        if (!edit.commit()) {
            Log.w("VerifyPhoneNumberPrefs/savedcode/clear/commit failed");
        }
    }

    public void A05() {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.remove("com.obwhatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time");
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/clear-sms-retry-time/error");
        }
    }

    public void A06() {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.remove("com.obwhatsapp.registration.VerifyPhoneNumber.call_countdown_end_time");
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/clear-voice-retry-time/error");
        }
    }

    public void A07(long j2) {
        StringBuilder A0r = AnonymousClass000.A0r("VerifyPhoneNumberPrefs/save-sms-retry-time/");
        A0r.append(j2);
        C13680ns.A1V(A0r);
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putLong("com.obwhatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time", j2);
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/save-sms-retry-time/error");
        }
    }

    public void A08(long j2) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putLong("com.obwhatsapp.registration.VerifyPhoneNumber.call_countdown_end_time", j2);
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/save-voice-retry-time/error");
        }
    }

    public void A09(long j2) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putLong("com.obwhatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time", j2);
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/save-voice-retry-time/error");
        }
    }

    public void A0A(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString("com.obwhatsapp.registration.VerifyPhoneNumber.sms_code", str);
        edit.putString("com.obwhatsapp.registration.VerifyPhoneNumber.sms_cc", str2);
        edit.putString("com.obwhatsapp.registration.VerifyPhoneNumber.sms_phone_number", str3);
        if (!edit.commit()) {
            Log.w("VerifyPhoneNumberPrefs/savedcode/save/commit failed");
        }
    }
}
