package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.facebook.redex.IDxProviderShape156S0100000_2_I0;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0rz  reason: invalid class name and case insensitive filesystem */
public class C15860rz {
    public static final String A05;
    public final C17010u2 A00;
    public final AnonymousClass01D A01;
    public final Object A02 = new Object();
    public final Object A03 = new Object();
    public final Object A04 = new Object();

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass01S.A07);
        sb.append("_light");
        A05 = sb.toString();
    }

    public C15860rz(C17010u2 r4, C17020u3 r5) {
        this.A00 = r4;
        this.A01 = new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(r5, 20));
    }

    public static List A00() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass01Q("security_notifications", 1));
        arrayList.add(new AnonymousClass01Q("input_enter_send", 1));
        arrayList.add(new AnonymousClass01Q("interface_font_size", 2));
        arrayList.add(new AnonymousClass01Q("settings_language", 2));
        arrayList.add(new AnonymousClass01Q("conversation_sound", 1));
        arrayList.add(new AnonymousClass01Q("autodownload_wifi_mask", 0));
        arrayList.add(new AnonymousClass01Q("autodownload_cellular_mask", 0));
        arrayList.add(new AnonymousClass01Q("autodownload_roaming_mask", 0));
        arrayList.add(new AnonymousClass01Q("voip_low_data_usage", 1));
        arrayList.add(new AnonymousClass01Q("gdrive_backup_filters", 3));
        return arrayList;
    }

    public int A01() {
        return ((SharedPreferences) this.A01.get()).getInt("adv_current_key_index", -1);
    }

    public int A02() {
        return ((SharedPreferences) this.A01.get()).getInt("adv_raw_id", -1);
    }

    public int A03() {
        return ((SharedPreferences) this.A01.get()).getInt("autodownload_cellular_mask", 1);
    }

    public int A04() {
        return ((SharedPreferences) this.A01.get()).getInt("backup_restore_state", 0);
    }

    public int A05() {
        return ((SharedPreferences) this.A01.get()).getInt("delete_chat_count", 0);
    }

    public int A06() {
        try {
            return Integer.parseInt(((SharedPreferences) this.A01.get()).getString("interface_gdrive_backup_frequency", String.valueOf(0)));
        } catch (NumberFormatException e2) {
            Log.e("wa-shared-preferences/get-backup-freq", e2);
            return 0;
        }
    }

    public int A07() {
        try {
            return Integer.parseInt(((SharedPreferences) this.A01.get()).getString("interface_gdrive_backup_network_setting", String.valueOf(0)));
        } catch (NumberFormatException e2) {
            Log.w("wa-shared-preferences/get-backup-network-settings", e2);
            return 0;
        }
    }

    public int A08() {
        return ((SharedPreferences) this.A01.get()).getInt("gdrive_error_code", 10);
    }

    public int A09() {
        return ((SharedPreferences) this.A01.get()).getInt("gdrive_state", 0);
    }

    public int A0A() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.A01.get();
        int i2 = 1;
        if (Build.VERSION.SDK_INT >= 29) {
            i2 = -1;
        }
        return sharedPreferences.getInt("night_mode", i2);
    }

    public int A0B() {
        return ((SharedPreferences) this.A01.get()).getInt("migrate_from_other_app_attempt_count", 0);
    }

    public int A0C() {
        return ((SharedPreferences) this.A01.get()).getInt("privacy_profile_photo", 0);
    }

    public int A0D() {
        return ((SharedPreferences) this.A01.get()).getInt("gdrive_successive_backup_failed_count", 0);
    }

    public int A0E() {
        int i2 = ((SharedPreferences) this.A01.get()).getInt("reg_attempts_generate_code", 0) + 1;
        A0K().putInt("reg_attempts_generate_code", i2).apply();
        return i2;
    }

    public int A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder("gdrive_old_media_encryption_status:");
        sb.append(str);
        return ((SharedPreferences) this.A01.get()).getInt(sb.toString(), 0);
    }

    public long A0G() {
        return ((SharedPreferences) this.A01.get()).getLong("block_list_receive_time", 0);
    }

    public long A0H(String str) {
        if (str == null) {
            Log.w("wa-shared-preferences/get-backup-timestamp accountName passed is null.");
            return 0;
        }
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_timestamp:");
        sb.append(str);
        return ((SharedPreferences) this.A01.get()).getLong(sb.toString(), 0);
    }

    public long A0I(String str) {
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        return ((SharedPreferences) this.A01.get()).getLong(sb.toString(), -1);
    }

    public long A0J(String str) {
        return ((SharedPreferences) this.A01.get()).getLong(str, -1);
    }

    public final SharedPreferences.Editor A0K() {
        return ((SharedPreferences) this.A01.get()).edit();
    }

    public Integer A0L() {
        int i2;
        AnonymousClass01D r3 = this.A01;
        if (((SharedPreferences) r3.get()).getBoolean("need_to_get_groups", false)) {
            i2 = 3;
        } else if (!((SharedPreferences) r3.get()).contains("get_groups_params")) {
            return null;
        } else {
            i2 = ((SharedPreferences) r3.get()).getInt("get_groups_params", 0);
        }
        return Integer.valueOf(i2);
    }

    public String A0M() {
        return ((SharedPreferences) this.A01.get()).getString("gdrive_account_name", (String) null);
    }

    public String A0N() {
        String string = ((SharedPreferences) this.A01.get()).getString("perf_device_id", (String) null);
        if (string != null) {
            return string;
        }
        String obj = UUID.randomUUID().toString();
        A0K().putString("perf_device_id", obj).apply();
        return obj;
    }

    public String A0O() {
        return ((SharedPreferences) this.A01.get()).getString("cc", "");
    }

    public String A0P() {
        return ((SharedPreferences) this.A01.get()).getString("registration_jid", (String) null);
    }

    public String A0Q() {
        return ((SharedPreferences) this.A01.get()).getString("ph", "");
    }

    public String A0R(String str) {
        StringBuilder sb = new StringBuilder("dc_user_postcode_");
        sb.append(str);
        return ((SharedPreferences) this.A01.get()).getString(sb.toString(), (String) null);
    }

    public String A0S(String str) {
        StringBuilder sb = new StringBuilder("downloadable_category_local_info_json_");
        sb.append(str);
        return ((SharedPreferences) this.A01.get()).getString(sb.toString(), (String) null);
    }

    public Map A0T() {
        List<AnonymousClass01Q> A002 = A00();
        HashMap hashMap = new HashMap();
        for (AnonymousClass01Q r0 : A002) {
            Object obj = r0.A00;
            AnonymousClass00B.A06(obj);
            String str = (String) obj;
            Object obj2 = r0.A01;
            AnonymousClass00B.A06(obj2);
            int intValue = ((Number) obj2).intValue();
            AnonymousClass01D r4 = this.A01;
            if (((SharedPreferences) r4.get()).contains(str)) {
                if (intValue == 0) {
                    hashMap.put(str, Integer.valueOf(((SharedPreferences) r4.get()).getInt(str, 0)));
                } else if (intValue == 1) {
                    hashMap.put(str, Boolean.valueOf(((SharedPreferences) r4.get()).getBoolean(str, false)));
                } else if (intValue == 2) {
                    String string = ((SharedPreferences) r4.get()).getString(str, (String) null);
                    if (string != null) {
                        hashMap.put(str, string);
                    }
                } else if (intValue == 3) {
                    Set<String> stringSet = ((SharedPreferences) r4.get()).getStringSet(str, new HashSet());
                    if (stringSet != null && !stringSet.isEmpty()) {
                        hashMap.put(str, stringSet);
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Unexpected key type: ");
                    sb.append(str);
                    sb.append(" ");
                    sb.append(intValue);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return hashMap;
    }

    public void A0U() {
        A0K().remove("gdrive_already_downloaded_bytes").remove("gdrive_restore_overwrite_local_files").remove("gdrive_restore_start_timestamp").remove("gdrive_media_restore_network_setting").remove("gdrive_approx_media_download_size").apply();
    }

    public void A0V() {
        Log.i("wa-shared-preferences/cleangcmregsettings");
        A0K().remove("c2dm_reg_id").remove("c2dm_app_vers").remove("saved_gcm_token_server_unreg").apply();
    }

    public void A0W() {
        A0K().remove("pref_fail_too_many").remove("pref_no_route_sms").remove("pref_no_route_voice").remove("pref_fail_too_many_attempts").remove("pref_fail_too_many_guesses").apply();
    }

    public void A0X() {
        A0K().remove("block_list_receive_time").apply();
    }

    public void A0Y() {
        A0K().remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        A0K().remove("registration_wipe_info_timestamp").apply();
    }

    public void A0Z() {
        A0K().remove("business_activity_report_expiration_timestamp").remove("business_activity_report_size").remove("business_activity_report_name").remove("business_activity_report_url").remove("business_activity_report_direct_url").remove("business_activity_report_media_key").remove("business_activity_report_file_sha").remove("business_activity_report_file_enc_sha").remove("business_activity_report_timestamp").remove("business_activity_report_state").apply();
    }

    public void A0a() {
        A0K().remove("gdpr_report_expiration_timestamp").remove("gdpr_report_timestamp").remove("gdpr_report_state").apply();
    }

    public void A0b() {
        A0K().putInt("video_transcode_compliance_v5", Build.VERSION.SDK_INT).apply();
    }

    public void A0c() {
        A0K().putBoolean("wac_consent_shown", true).apply();
    }

    public void A0d(int i2) {
        ((SharedPreferences) this.A01.get()).edit().putInt("autoconf_type", i2).apply();
    }

    public void A0e(int i2) {
        StringBuilder sb = new StringBuilder("wa-shared-preferences/set-backup-restore-state/");
        sb.append(i2);
        Log.i(sb.toString());
        A0K().putInt("backup_restore_state", i2).apply();
    }

    public void A0f(int i2) {
        A0K().putInt("business_activity_report_state", i2).apply();
    }

    public void A0g(int i2) {
        A0K().putInt("external_dir_migration_stage", i2).commit();
    }

    public void A0h(int i2) {
        A0K().putInt("gdpr_report_state", i2).apply();
    }

    public void A0i(int i2) {
        StringBuilder sb = new StringBuilder("wa-shared-preferences/getgroupsparams ");
        sb.append(i2);
        Log.i(sb.toString());
        A0K().remove("need_to_get_groups").putInt("get_groups_params", i2).apply();
    }

    public void A0j(int i2) {
        StringBuilder sb = new StringBuilder("wa-shared-preferences/set-gdrive-state/");
        sb.append(i2);
        Log.i(sb.toString());
        A0K().putInt("gdrive_state", i2).apply();
    }

    public void A0k(int i2) {
        ((SharedPreferences) this.A01.get()).edit().putInt("flash_call_eligible", i2).apply();
    }

    public void A0l(long j2) {
        StringBuilder sb = new StringBuilder("wa-shared-prefs/save-gdrive-user-prompt-again-timestamp/");
        sb.append(j2);
        sb.append(" ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        sb.append(simpleDateFormat.format(instance.getTime()));
        Log.i(sb.toString());
        A14("gdrive_next_prompt_for_setup_timestamp", j2);
    }

    public void A0m(long j2) {
        A0K().putLong("block_list_receive_time", j2).apply();
    }

    public void A0n(String str) {
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb = new StringBuilder("smb_business_direct_connection_public_key_");
        sb.append(str);
        A0K.remove(sb.toString()).apply();
    }

    public void A0o(String str) {
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb = new StringBuilder("galaxy_biz_public_key_");
        sb.append(str);
        A0K.remove(sb.toString()).apply();
    }

    public void A0p(String str) {
        ((SharedPreferences) this.A01.get()).edit().putString("pref_autoconf_feo2_query_status", str).apply();
    }

    public void A0q(String str) {
        ((SharedPreferences) this.A01.get()).edit().putString("pref_autoconf_status", str).apply();
    }

    public void A0r(String str) {
        A0K().putString("block_list_v2_dhash", str).apply();
    }

    public void A0s(String str) {
        A0K().putString("gdrive_account_name", str).apply();
    }

    public void A0t(String str) {
        ((SharedPreferences) this.A01.get()).edit().putString("pref_primary_flash_call_status", str).apply();
    }

    public void A0u(String str) {
        A0K().putString("registration_code", str).apply();
    }

    public void A0v(String str) {
        A0K().putString("registration_jid", str).remove("registration_wipe_type").remove("registration_wipe_token").remove("registration_wipe_wait").remove("registration_wipe_expiry").remove("registration_wipe_server_time").apply();
        A0K().remove("registration_wipe_info_timestamp").apply();
    }

    public void A0w(String str) {
        ((SharedPreferences) this.A01.get()).edit().putString("pref_secondary_flash_call_status", str).apply();
    }

    public void A0x(String str) {
        A14(str, System.currentTimeMillis());
    }

    public void A0y(String str) {
        ((SharedPreferences) this.A01.get()).edit().putString("pref_wa_old_status", str).apply();
    }

    public void A0z(String str, int i2) {
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb = new StringBuilder("gdrive_old_media_encryption_status:");
        sb.append(str);
        A0K.putInt(sb.toString(), i2).apply();
        if (i2 == 1) {
            SharedPreferences.Editor A0K2 = A0K();
            StringBuilder sb2 = new StringBuilder("gdrive_old_media_encryption_start_time:");
            sb2.append(str);
            A0K2.putLong(sb2.toString(), System.currentTimeMillis()).apply();
        }
    }

    public void A10(String str, long j2) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-media-size account name is null");
            return;
        }
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_media_size:");
        sb.append(str);
        A0K.putLong(sb.toString(), j2).apply();
    }

    public void A11(String str, long j2) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("wa-shared-preferences/set-backup-timestamp last successful backup timestamp is set to ");
            sb.append(j2);
            sb.append(" but accountName associated is null, ignoring.");
            Log.e(sb.toString());
            return;
        }
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb2 = new StringBuilder("gdrive_last_successful_backup_timestamp:");
        sb2.append(str);
        A0K.putLong(sb2.toString(), j2).apply();
    }

    public void A12(String str, long j2) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-total-backup-size account name is null");
            return;
        }
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        A0K.putLong(sb.toString(), j2).apply();
    }

    public void A13(String str, long j2) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-video-size account name is null");
            return;
        }
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_video_size:");
        sb.append(str);
        A0K.putLong(sb.toString(), j2).apply();
    }

    public void A14(String str, long j2) {
        A0K().putLong(str, j2).apply();
    }

    public void A15(String str, String str2) {
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb = new StringBuilder("dc_location_name_");
        sb.append(str);
        A0K.putString(sb.toString(), str2).apply();
    }

    public void A16(String str, String str2) {
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb = new StringBuilder("dc_user_postcode_");
        sb.append(str);
        A0K.putString(sb.toString(), str2).apply();
    }

    public void A17(String str, String str2) {
        SharedPreferences.Editor A0K = A0K();
        if (str == null) {
            A0K.remove("my_current_status");
        } else {
            A0K.putString("my_current_status", str);
            if (!TextUtils.isEmpty(str2)) {
                A0K.putString("my_current_status_hash", str2);
                A0K.apply();
            }
        }
        A0K.remove("my_current_status_hash");
        A0K.apply();
    }

    public void A18(String str, String str2) {
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb = new StringBuilder("downloadable_category_local_info_json_");
        sb.append(str);
        A0K.putString(sb.toString(), str2).apply();
    }

    public void A19(String str, String str2) {
        A0K().putString("cc", str).putString("ph", str2).apply();
    }

    public void A1A(String str, String str2) {
        A0K().putString(str, str2).apply();
    }

    public void A1B(String str, String str2, long j2, long j3, long j4, long j5) {
        A0K().putString("registration_wipe_type", str).putString("registration_wipe_token", str2).putLong("registration_wipe_wait", j2).putLong("registration_wipe_expiry", j3).putLong("registration_wipe_server_time", j4).apply();
        A14("registration_wipe_info_timestamp", j5);
    }

    public void A1C(String str, boolean z2) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("wa-shared-preferences/set-encrypted is set to ");
            sb.append(z2);
            sb.append(" but accountName associated is null, ignoring.");
            Log.e(sb.toString());
            return;
        }
        SharedPreferences.Editor A0K = A0K();
        StringBuilder sb2 = new StringBuilder("gdrive_last_successful_backup_encrypted:");
        sb2.append(str);
        A0K.putBoolean(sb2.toString(), z2).apply();
    }

    public void A1D(JSONObject jSONObject) {
        StringBuilder sb;
        SharedPreferences.Editor A0K = A0K();
        for (AnonymousClass01Q r0 : A00()) {
            Object obj = r0.A00;
            AnonymousClass00B.A06(obj);
            String str = (String) obj;
            Object obj2 = r0.A01;
            AnonymousClass00B.A06(obj2);
            int intValue = ((Number) obj2).intValue();
            if (jSONObject.has(str)) {
                if (intValue == 0) {
                    try {
                        A0K.putInt(str, jSONObject.getInt(str));
                    } catch (JSONException e2) {
                        e = e2;
                        sb = new StringBuilder();
                        sb.append("wa-shared-preferences/set-local-settings/error-while-inserting ");
                        sb.append(str);
                        sb.append(":");
                        sb.append(((SharedPreferences) this.A01.get()).getInt(str, 0));
                    }
                } else if (intValue == 1) {
                    try {
                        A0K.putBoolean(str, jSONObject.getBoolean(str));
                    } catch (JSONException e3) {
                        e = e3;
                        sb = new StringBuilder();
                        sb.append("wa-shared-preferences/set-local-settings/error-while-inserting ");
                        sb.append(str);
                        sb.append(":");
                        sb.append(((SharedPreferences) this.A01.get()).getBoolean(str, false));
                    }
                } else if (intValue == 2) {
                    try {
                        A0K.putString(str, jSONObject.getString(str));
                    } catch (JSONException e4) {
                        e = e4;
                        sb = new StringBuilder();
                        sb.append("wa-shared-preferences/set-local-settings/error-while-inserting ");
                        sb.append(str);
                        sb.append(":");
                        sb.append(((SharedPreferences) this.A01.get()).getString(str, (String) null));
                    }
                } else if (intValue == 3) {
                    try {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        HashSet hashSet = new HashSet(jSONArray.length());
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            hashSet.add(jSONArray.get(i2));
                        }
                        A0K.putStringSet(str, hashSet);
                    } catch (JSONException e5) {
                        e = e5;
                        sb = new StringBuilder();
                        sb.append("wa-shared-preferences/set-local-settings/error-while-inserting ");
                        sb.append(str);
                        sb.append(":");
                        sb.append(((SharedPreferences) this.A01.get()).getStringSet(str, (Set) null));
                        Log.e(sb.toString(), e);
                    }
                }
            }
        }
        A0K.apply();
    }

    public void A1E(boolean z2) {
        SharedPreferences.Editor remove = A0K().remove("external_dir_migration_attempt_n").remove("ext_dir_migration_rescan_time").remove("ext_dir_migration_move_time").remove("ext_dir_migration_start_time");
        if (!z2) {
            remove.remove("external_dir_migration_stage");
        }
        remove.commit();
    }

    public void A1F(boolean z2) {
        A0K().putBoolean("registration_biz_registered_on_device", z2).apply();
    }

    public void A1G(boolean z2) {
        ((SharedPreferences) this.A01.get()).edit().putBoolean("pref_flash_call_education_screen_displayed", z2).apply();
    }

    public void A1H(boolean z2) {
        A0K().putBoolean("future_proof_processing_needed", z2).apply();
    }

    public void A1I(boolean z2) {
        A0K().putBoolean("gdrive_restore_overwrite_local_files", z2).apply();
    }

    public void A1J(boolean z2) {
        A0K().putBoolean("gdrive_include_videos_in_backup", z2).apply();
    }

    public void A1K(boolean z2) {
        A0K().putBoolean("net_new_jid", z2).apply();
    }

    public void A1L(boolean z2) {
        A0K().putBoolean("new_jid", z2).apply();
    }

    public void A1M(boolean z2) {
        A0K().putBoolean("live_location_is_new_user", z2).apply();
    }

    public void A1N(boolean z2) {
        A0K().putBoolean("nearby_location_new_user", z2).apply();
    }

    public void A1O(boolean z2) {
        A0K().putBoolean("encrypted_backup_enabled", z2).apply();
    }

    public void A1P(boolean z2) {
        A0K().putBoolean("encrypted_backup_using_encryption_key", z2).apply();
    }

    public void A1Q(boolean z2) {
        ((SharedPreferences) this.A01.get()).edit().putBoolean("pref_prefer_sms_over_flash", z2).apply();
    }

    public void A1R(boolean z2) {
        A0K().putBoolean("payment_background_batch_require_fetch", z2).apply();
    }

    public void A1S(boolean z2) {
        StringBuilder sb = new StringBuilder("wa-shared-prefs/setshouldgetprekeydigest/");
        sb.append(z2);
        Log.i(sb.toString());
        synchronized (this.A02) {
            A0K().putBoolean("need_to_get_pre_key_digest", z2).apply();
        }
    }

    public void A1T(boolean z2) {
        StringBuilder sb = new StringBuilder("wa-shared-prefs/setsignalprotocolstoreisnew/");
        sb.append(z2);
        Log.i(sb.toString());
        synchronized (this.A03) {
            A0K().putBoolean("signal_protocol_store_is_new", z2).apply();
        }
    }

    public void A1U(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        A0K().putBoolean("pref_fail_too_many", z2).putBoolean("pref_no_route_sms", z3).putBoolean("pref_no_route_voice", z4).putBoolean("pref_fail_too_many_attempts", z5).putBoolean("pref_fail_too_many_guesses", z6).apply();
    }

    public void A1V(byte[] bArr) {
        A0K().putString("token_used_during_reg", Base64.encodeToString(bArr, 3)).apply();
    }

    public boolean A1W() {
        return ((SharedPreferences) this.A01.get()).getBoolean("input_enter_send", true);
    }

    public boolean A1X() {
        return ((SharedPreferences) this.A01.get()).getBoolean("gdrive_restore_overwrite_local_files", false);
    }

    public boolean A1Y() {
        return ((SharedPreferences) this.A01.get()).getBoolean("security_notifications", false);
    }

    public boolean A1Z() {
        return ((SharedPreferences) this.A01.get()).getBoolean("migrate_from_consumer_app_directly", false);
    }

    public boolean A1a() {
        return ((SharedPreferences) this.A01.get()).getBoolean("gdrive_include_videos_in_backup", false);
    }

    public boolean A1b() {
        return ((SharedPreferences) this.A01.get()).getBoolean("archive_v2_enabled", false);
    }

    public boolean A1c() {
        return ((SharedPreferences) this.A01.get()).getBoolean("notify_new_message_for_archived_chats", false);
    }

    public boolean A1d() {
        return ((SharedPreferences) this.A01.get()).getBoolean("companion_reg_opt_in_enabled", false);
    }

    public boolean A1e() {
        return ((SharedPreferences) this.A01.get()).getBoolean("detect_device_foldable", false);
    }

    public boolean A1f() {
        return ((SharedPreferences) this.A01.get()).getBoolean("encrypted_backup_enabled", false);
    }

    public boolean A1g() {
        return ((SharedPreferences) this.A01.get()).getBoolean("encrypted_backup_using_encryption_key", false);
    }

    public boolean A1h() {
        return ((SharedPreferences) this.A01.get()).getBoolean("privacy_fingerprint_enabled", false);
    }

    public boolean A1i() {
        return ((SharedPreferences) this.A01.get()).getBoolean("read_receipts_enabled", true);
    }

    public boolean A1j() {
        return Build.VERSION.SDK_INT == ((SharedPreferences) this.A01.get()).getInt("video_transcode_compliance_v5", -1);
    }

    public boolean A1k() {
        boolean z2;
        synchronized (this.A03) {
            z2 = ((SharedPreferences) this.A01.get()).getBoolean("signal_protocol_store_is_new", false);
        }
        return z2;
    }

    public boolean A1l(int i2) {
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            A0K().putString("interface_gdrive_backup_frequency", String.valueOf(i2)).apply();
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("wa-shared-preferences/set-backup-freq/");
        sb.append(i2);
        Log.e(sb.toString());
        return false;
    }

    public boolean A1m(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_encrypted:");
        sb.append(str);
        return ((SharedPreferences) this.A01.get()).getBoolean(sb.toString(), false);
    }

    public boolean A1n(String str, long j2) {
        long A0J = A0J(str);
        return A0J == -1 || System.currentTimeMillis() > A0J + j2;
    }

    public byte[] A1o() {
        return Base64.decode(((SharedPreferences) this.A01.get()).getString("token_used_during_reg", ""), 3);
    }
}
