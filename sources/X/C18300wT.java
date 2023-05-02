package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0wT  reason: invalid class name and case insensitive filesystem */
public class C18300wT {
    public SharedPreferences A00;
    public final C16440t3 A01;
    public final AnonymousClass1Vo A02 = AnonymousClass1Vo.A00("PaymentSharedPrefs", "infra", "COMMON");
    public final C17020u3 A03;

    public C18300wT(C16440t3 r4, C17020u3 r5) {
        this.A01 = r4;
        this.A03 = r5;
    }

    public static final String A00(Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put(((Jid) entry.getKey()).getRawString(), entry.getValue());
            }
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder("PAY: PaymentSharedPrefs/getRawFromJidsWithExpiration/exception: ");
            sb.append(e2);
            Log.e(sb.toString());
        }
        return jSONObject.toString();
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A00("com.obwhatsapp_payment_preferences");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public C35281lf A02() {
        String string = A01().getString("payment_step_up_info", (String) null);
        if (string != null) {
            return C35281lf.A01(string);
        }
        return null;
    }

    public Boolean A03() {
        if (A01().contains("payment_is_first_send")) {
            return Boolean.valueOf(A01().getBoolean("payment_is_first_send", false));
        }
        return null;
    }

    public String A04() {
        return A01().getString("payments_setup_country_specific_info", "");
    }

    public String A05() {
        return A01().getString("payments_sent_payment_with_account", "");
    }

    public String A06() {
        JSONObject jSONObject;
        String string = A01().getString("payment_trusted_device_elo_wallet_store", (String) null);
        if (string != null) {
            jSONObject = new JSONObject(string);
        } else {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException unused) {
                this.A02.A06("Failed to get the wallet_id");
                return null;
            }
        }
        return jSONObject.getString("wallet_id");
    }

    public final Map A07(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                long A002 = this.A01.A00();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    UserJid nullable = UserJid.getNullable(next);
                    long j2 = jSONObject.getLong(next);
                    if (nullable != null && j2 >= A002) {
                        hashMap.put(nullable, Long.valueOf(j2));
                    }
                }
            } catch (JSONException e2) {
                StringBuilder sb = new StringBuilder("PAY: PaymentSharedPrefs/getJidsWithExpirationFromRaw/exception: ");
                sb.append(e2);
                Log.e(sb.toString());
            }
        }
        return hashMap;
    }

    public void A08() {
        A01().edit().remove("payment_step_up_info").apply();
    }

    public void A09() {
        A01().edit().putBoolean("payments_resume_onboarding_banner_started", true).apply();
    }

    public void A0A() {
        long A002 = this.A01.A00();
        A0F(A002);
        AnonymousClass1Vo r2 = this.A02;
        StringBuilder sb = new StringBuilder("setIsPaymentAccountRecoverableTimeMs to: ");
        sb.append(A002);
        r2.A06(sb.toString());
    }

    public void A0B(int i2) {
        A01().edit().putInt("payments_upi_transactions_sync_status", i2).apply();
    }

    public void A0C(int i2, long j2) {
        A01().edit().putLong((i2 == 0 || i2 == 1) ? "payments_enabled_till" : "merchant_payments_enabled_till", j2).apply();
    }

    public void A0D(int i2, String str) {
        A01().edit().putInt("personal".equals(str) ? "payment_dyi_report_state" : "business_payment_dyi_report_state", i2).apply();
    }

    public void A0E(long j2) {
        A01().edit().putLong("payments_upi_last_transactions_sync_time", j2).apply();
    }

    public void A0F(long j2) {
        A01().edit().putLong("payment_account_recoverable_time_ms", j2).apply();
    }

    public void A0G(String str) {
        SharedPreferences.Editor remove;
        String str2;
        SharedPreferences.Editor edit = A01().edit();
        if ("personal".equals(str)) {
            remove = edit.remove("payment_dyi_report_state").remove("payment_dyi_report_timestamp");
            str2 = "payment_dyi_report_expiration_timestamp";
        } else {
            remove = edit.remove("business_payment_dyi_report_state").remove("business_payment_dyi_report_timestamp");
            str2 = "business_payment_dyi_report_expiration_timestamp";
        }
        remove.remove(str2).apply();
    }

    public void A0H(String str) {
        A01().edit().putString("payments_setup_country_specific_info", str).apply();
    }

    public void A0I(String str) {
        A01().edit().putString("payments_block_list", str).apply();
    }

    public void A0J(String str) {
        A01().edit().putString("payments_sent_payment_with_account", str).apply();
    }

    public void A0K(String str) {
        A01().edit().putString("payments_support_phone_number", str).apply();
    }

    public void A0L(String str, long j2) {
        A01().edit().putLong("personal".equals(str) ? "payment_dyi_report_timestamp" : "business_payment_dyi_report_timestamp", j2).apply();
    }

    public void A0M(boolean z2) {
        SharedPreferences.Editor remove;
        String str;
        SharedPreferences.Editor edit = A01().edit();
        if (z2) {
            remove = edit.remove("payments_setup_completed_steps").remove("payments_merchant_setup_completed_steps").remove("payments_methods_last_sync_time").remove("payments_card_can_receive_payment").remove("payments_all_transactions_last_sync_time").remove("payments_pending_transactions_last_sync_time").remove("payments_nagged_transactions").remove("payments_sent_payment_with_account").remove("payments_sandbox").remove("payments_invitee_jids").remove("payments_inviter_jids").remove("payments_enabled_till").remove("merchant_payments_enabled_till").remove("payments_support_phone_number").remove("payments_device_id").remove("payments_network_id_map").remove("payment_trusted_device_credential").remove("payment_trusted_device_credential_encrypted_aes").remove("payments_trusted_device_credential_network_map").remove("payment_kyc_info").remove("payment_step_up_info").remove("payment_dyi_report_expiration_timestamp").remove("payment_dyi_report_timestamp").remove("payment_dyi_report_state").remove("payments_invitee_jids_with_expiry").remove("payments_inviter_jids_with_expiry").remove("payment_usync_triggered").remove("payments_has_willow_account").remove("payment_incentive_offer_details").remove("payment_incentive_user_claim_info").remove("payment_incentive_tooltip_viewed").remove("payments_last_two_factor_nudge_time").remove("payments_two_factor_nudge_count").remove("payments_upi_pin_primer_dialog_shown").remove("payment_trusted_device_elo_wallet_store").remove("payment_account_recovered").remove("payments_home_account_recovery_banner_dismissed").remove("payments_upi_transactions_sync_status").remove("payments_upi_last_transactions_sync_time").remove("payments_resume_onboarding_banner_started").remove("payment_account_recoverable").remove("payment_account_recoverable_time_ms").remove("is_payment_account_created").remove("has_p2mlite_account").remove("payments_home_scan_to_pay_banner_dismissed").remove("payments_home_recovery_2fa_upsell_banner_impression").remove("payments_home_recovery_upin_upsell_banner_impression").remove("payments_home_recovery_2fa_upsell_banner_display").remove("payments_home_recovery_upin_upsell_banner_display").remove("payments_home_recovery_2fa_upsell_banner_impression_update_timestamp");
            str = "payments_home_recovery_upin_upsell_banner_impression_update_timestamp";
        } else {
            remove = edit.remove("payments_merchant_setup_completed_steps").remove("payment_smb_upsell_view_count").remove("business_payment_dyi_report_expiration_timestamp").remove("business_payment_dyi_report_timestamp");
            str = "business_payment_dyi_report_state";
        }
        remove.remove(str).apply();
    }

    public void A0N(boolean z2) {
        A01().edit().putBoolean("payments_has_unseen_requests", z2).apply();
    }

    public void A0O(boolean z2) {
        A01().edit().putBoolean("payments_sandbox", z2).apply();
    }

    public boolean A0P() {
        return A01().getBoolean("payment_account_recovered", false);
    }

    public boolean A0Q() {
        return this.A01.A00() - A01().getLong("payments_methods_last_sync_time", 0) > TimeUnit.HOURS.toMillis(1);
    }
}
