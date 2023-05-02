package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0s6  reason: invalid class name and case insensitive filesystem */
public abstract class C15910s6 implements AnonymousClass0s7 {
    public static C16520tC A06 = A01(Integer.MIN_VALUE, 172800, "privatestats_token_first_delay_seconds", "privatestats_token_first_delay_seconds", 21600);
    public static C16520tC A07 = A01(43200, Integer.MAX_VALUE, "privatestats_token_max_expiry_seconds", "privatestats_token_max_expiry_seconds", 86400);
    public static C16520tC A08 = A01(1, 43200, "privatestats_token_prec_lead_seconds", "privatestats_token_prec_lead_seconds", 7200);
    public static C16520tC A09 = A01(2, Integer.MAX_VALUE, "privatestats_token_pre_redeem_count", "privatestats_token_pre_redeem_count", 388);
    public static final C15920s8 A0A = A00("abprops_encryption", "abprops_encryption", false);
    public static final C15920s8 A0B = A00("abprops_prefs_file_rollback_usage_enabled", "abprops_prefs_file_rollback_usage_enabled", false);
    public static final C15920s8 A0C = A00("abprops_rollback_enabled", "abprops_rollback_enabled", false);
    public static final C15920s8 A0D = A00("async_init_fts_migration", "async_init_fts_migration", false);
    public static final C15920s8 A0E = A00("async_init_md_migrations", "async_init_md_migrations", true);
    public static final C15920s8 A0F = A00("audio_data_for_notification", "audio_data_for_notification", true);
    public static final C15920s8 A0G = A00("bsp_system_message_enabled", "bsp_system_message_enabled", false);
    public static final C15920s8 A0H = A00("ctwa_first_business_reply_logging", "ctwa_first_business_reply_logging", false);
    public static final C15920s8 A0I = A00("delete_bad_gcm_token", "delete_bad_gcm_token", false);
    public static final C15920s8 A0J = A00("enhanced_storage_mgmt_sort_fw_score", "enhanced_storage_mgmt_sort_fw_score", false);
    public static final C15920s8 A0K;
    public static final C15920s8 A0L = A00("fbns_disabled_for_secondary", "fbns_disabled_for_secondary", false);
    public static final C15920s8 A0M = A00("fbns_enabled", "fbns_enabled", false);
    public static final C15920s8 A0N = A00("force_long_connect", "force_long_connect", false);
    public static final C15920s8 A0O = A00("frequently_forwarded_group_setting", "frequently_forwarded_group_setting", false);
    public static final C15920s8 A0P = A00("gif_search_v2", "gif_search_v2", false);
    public static final C15920s8 A0Q = A00("google_drive_enabled", "google_drive_enabled", true);
    public static final C15920s8 A0R = A00("group_message_notification_use_jid_instead_of_from_me", "group_message_notification_use_jid_instead_of_from_me", true);
    public static final C15920s8 A0S = A00("grp_uii_cleanup", "grp_uii_cleanup", false);
    public static final C15920s8 A0T = A00("disable_hfm_autodownload", "disable_hfm_autodownload", false);
    public static final C15920s8 A0U = A00("instrument_spam_report_enabled", "instrument_spam_report_enabled", true);
    public static final C15920s8 A0V = A00("linked_devices_re_auth_enabled", "linked_devices_re_auth_enabled", false);
    public static final C15920s8 A0W = A00("syncd_android_unsupported_mutation_enabled", "syncd_android_unsupported_mutation_enabled", false);
    public static final C15920s8 A0X = A00("syncd_clear_chat_delete_chat_enabled", "syncd_clear_chat_delete_chat_enabled", false);
    public static final C15920s8 A0Y = A00("syncd_one_time_cleanup_for_non_md_user", "syncd_one_time_cleanup_for_non_md_user", false);
    public static final C15920s8 A0Z = A00("syncd_patch_device_index_included", "syncd_patch_device_index_included", false);
    public static final C15920s8 A0a = A00("md_pin_chat_enabled", "md_pin_chat_enabled", false);
    public static final C15920s8 A0b = A00("md_voip_enabled", "md_voip_enabled", false);
    public static final C15920s8 A0c = A00("mms_forward_uploading_media_enabled", "mms_forward_uploading_media_enabled", false);
    public static final C15920s8 A0d = A00("mms_vcache_aggregation_enabled", "mms_vcache_aggregation_enabled", false);
    public static final C15920s8 A0e = A00("mute_always", "mute_always", false);
    public static final C15920s8 A0f = A00("notif_ch_override_off", "notif_ch_override_off", false);
    public static final C15920s8 A0g = A00("p2m_pay", "p2m_pay", false);
    public static final C15920s8 A0h = A00("p2p_pay", "p2p_pay", false);
    public static final C15920s8 A0i = A00("payments_cs_email_disabled", "payments_cs_email_disabled", false);
    public static final C15920s8 A0j = A00("payments_deeplink_signup_enabled", "payments_deeplink_signup_enabled", false);
    public static final C15920s8 A0k = A00("payments_disable_switch_psp", "payments_disable_switch_psp", false);
    public static final C15920s8 A0l = A00("novi_p2p", "novi_p2p", false);
    public static final C15920s8 A0m = A00("payments_request_messages", "payments_request_messages", true);
    public static final C15920s8 A0n = A00("payments_upi_qr_signing", "payments_upi_qr_signing", false);
    public static final C15920s8 A0o = A00("payments_upi_settings_privacy_banner_enabled", "payments_upi_settings_privacy_banner_enabled", true);
    public static final C15920s8 A0p = A00("payments_upi_enable_sim_swap_detection", "payments_upi_enable_sim_swap_detection", false);
    public static final C15920s8 A0q = A00("payments_upi_view_in_inbox", "payments_upi_view_in_inbox", false);
    public static final C15920s8 A0r = A00("payment_history_fts_enabled", "payment_history_fts_enabled", false);
    public static final C15920s8 A0s = A00("portal_optimization_enabled", "p_opt", false);
    public static final C15920s8 A0t = A00("profilo_enabled", "profilo_enabled", false);
    public static final C15920s8 A0u = A00("qr_scanning", "qr_scanning", false);
    public static final C15920s8 A0v = A00("quick_message_search_enabled", "quick_message_search_enabled", false);
    public static final C15920s8 A0w = A00("receipt_processing_dedup", "receipt_processing_dedup", true);
    public static final C15920s8 A0x = A00("receipt_processing_thread", "receipt_processing_thread", false);
    public static final C15920s8 A0y = A00("reg_log_advertiser_id", "reg_log_advertiser_id", false);
    public static final C15920s8 A0z = A00("smb_upsell_chat_banner_enabled", "smb_upsell_chat_banner_enabled", false);
    public static final C15920s8 A10 = A00("stella_contact_ranking_enabled", "stella_contact_ranking_enabled", false);
    public static final C15920s8 A11 = A00("stella_interop_enabled", "stella_interop_enabled", false);
    public static final C15920s8 A12 = A00("track_battery_metrics", "track_battery_metrics", false);
    public static final C15920s8 A13 = A00("wa_msys_crypto", "wa_msys_crypto", true);
    public static final C15920s8 A14 = A00("wa_msys_fingerprint", "wa_msys_fingerprint", false);
    public static final C29281aL A15;
    public static final C16520tC A16 = A01((Integer) null, (Integer) null, "abprops_revert_bg_crash_count", "abprops_revert_bg_crash_count", 10);
    public static final C16520tC A17 = A01((Integer) null, (Integer) null, "abprops_revert_fg_crash_count", "abprops_revert_fg_crash_count", 5);
    public static final C16520tC A18 = A01((Integer) null, (Integer) null, "announcement_toggle_time_hours", "announcement_toggle_time_hours", 72);
    public static final C16520tC A19 = A01((Integer) null, (Integer) null, "biz_block_reasons_version", "biz_block_reasons_version", 0);
    public static final C16520tC A1A = A01(256, (Integer) null, "broadcast_list_size_limit", "max_list_recipients", 256);
    public static final C16520tC A1B = A01((Integer) null, (Integer) null, "biz_profile_options", "biz_profile_options", 4);
    public static final C16520tC A1C = A01((Integer) null, (Integer) null, "max_keys", "max_keys", 812);
    public static final C16520tC A1D = A01((Integer) null, (Integer) null, "direct_db_migration_timeout_in_secs", "direct_db_migration_timeout_in_secs", 180);
    public static final C16520tC A1E = A01((Integer) null, (Integer) null, "gif_provider", "gif_provider", -1);
    public static final C16520tC A1F = A01((Integer) null, (Integer) null, "group_description_length", "group_description_length", 0);
    public static final C16520tC A1G = A01((Integer) null, (Integer) null, "hq_image_bw_threshold", "hq_image_bw_threshold", 75);
    public static final C16520tC A1H = A01((Integer) null, (Integer) null, "hq_image_max_edge", "hq_image_max_edge", 0);
    public static final C16520tC A1I = A01((Integer) null, (Integer) null, "hq_image_quality", "hq_image_quality", 0);
    public static final C16520tC A1J = A01((Integer) null, (Integer) null, "image_max_edge", "image_max_edge", 1600);
    public static final C16520tC A1K = A01(1024, (Integer) null, "image_max_kbytes", "image_max_kbytes", 1024);
    public static final C16520tC A1L = A01((Integer) null, (Integer) null, "image_quality", "image_quality", 80);
    public static final C16520tC A1M = A01((Integer) null, (Integer) null, "linked_devices_max_count", "linked_devices_max_count", 4);
    public static final C16520tC A1N = A01((Integer) null, (Integer) null, "md_mhfs_days", "md_mhfs_days", 732);
    public static final C16520tC A1O = A01((Integer) null, (Integer) null, "md_mhfs_limit", "md_mhfs_limit", 200);
    public static final C16520tC A1P = A01(0, 100, "md_mhfs_start_progress", "md_mhfs_start_progress", 70);
    public static final C16520tC A1Q = A01((Integer) null, (Integer) null, "md_mhrs_days", "md_mhrs_days", 90);
    public static final C16520tC A1R = A01(1, 5, "syncd_additional_mutations_for_key_catch_up", "syncd_additional_mutations_for_key_catch_up", 1);
    public static final C16520tC A1S = A01(100, 5000, "syncd_critical_contacts_limit", "syncd_critical_contacts_limit", 1000);
    public static final C16520tC A1T = A01(0, 7, "syncd_fatal_error_timeout_days", "syncd_fatal_error_timeout_days", 0);
    public static final C16520tC A1U = A01(100, 2000, "syncd_inline_mutations_max_count", "syncd_inline_mutations_max_count", 100);
    public static final C16520tC A1V = A01(0, 43200, "syncd_keep_alive_mins", "syncd_keep_alive_mins", 1440);
    public static final C16520tC A1W = A01(1, 90, "syncd_key_max_use_days", "syncd_key_max_use_days", 30);
    public static final C16520tC A1X = A01(15, 90, "syncd_key_stale_days", "syncd_key_stale_days", 31);
    public static final C16520tC A1Y = A01(10, 100, "syncd_patch_protobuf_max_size", "syncd_patch_protobuf_max_size", 10);
    public static final C16520tC A1Z = A01(0, 20, "syncd_sentinel_timeout_seconds", "syncd_sentinel_timeout_seconds", 3);
    public static final C16520tC A1a = A01(1, 15, "syncd_wait_for_key_timeout_days", "syncd_wait_for_key_timeout_days", 7);
    public static final C16520tC A1b = A01(10, 300, "critical_payload_download_and_applied_timeout_secs", "critical_payload_download_and_applied_timeout_secs", 120);
    public static final C16520tC A1c = A01(10, 300, "critical_payload_upload_timeout_secs", "critical_payload_upload_timeout_secs", 60);
    public static final C16520tC A1d = A01(0, (Integer) null, "media_limit_auto_download_mb", "media_max_autodownload", 32);
    public static final C16520tC A1e = A01((Integer) null, (Integer) null, "media_limit_auto_download_wifi_mb", "media_max_autodownload_wifi_mb", 100);
    public static final C16520tC A1f = A01(16, (Integer) null, "media_limit_mb", "media", 16);
    public static final C16520tC A1g = A01((Integer) null, (Integer) null, "mms_hot_content_time_span", "mms_hot_content_timespan_in_seconds", 0);
    public static final C16520tC A1h = A01((Integer) null, (Integer) null, "mms_vcard_autodownload_size_kb", "mms_vcard_autodownload_size_kb", 1024);
    public static final C16520tC A1i = A01((Integer) null, (Integer) null, "one_tap_calling_in_group_chat_size", "one_tap_calling_in_group_chat_size", 4);
    public static final C16520tC A1j = A01(0, 300, "overnight_alarms_jitter_limit_in_sec", "overnight_alarms_jitter_limit_in_sec", 0);
    public static final C16520tC A1k = A01((Integer) null, (Integer) null, "partial_pjpeg_bw_threshold", "partial_pjpeg_bw_threshold", 125);
    public static final C16520tC A1l = A01(257, (Integer) null, "participants_size_limit", "max_participants", 257);
    public static final C16520tC A1m = A01((Integer) null, (Integer) null, "payments_br_transaction_limit", "payments_transaction_limit", 1000);
    public static final C16520tC A1n = A01((Integer) null, (Integer) null, "payments_upi_first_day_max_transaction_limit", "payments_upi_first_day_max_transaction_limit", 5000);
    public static final C16520tC A1o = A01((Integer) null, (Integer) null, "payments_upi_generate_qr_amount_limit", "payments_upi_generate_qr_amount_limit", 5000);
    public static final C16520tC A1p = A01((Integer) null, (Integer) null, "payments_upi_intent_transaction_limit", "payments_upi_intent_transaction_limit", 2000);
    public static final C16520tC A1q = A01((Integer) null, (Integer) null, "payments_upi_transaction_limit", "payments_upi_transaction_limit", 5000);
    public static final C16520tC A1r = A01((Integer) null, (Integer) null, "payments_upi_transaction_limit_request", "payments_upi_transaction_limit_request", 5000);
    public static final C16520tC A1s = A01((Integer) null, (Integer) null, "ping_timeout_s", "ping_timeout_s", 32);
    public static final C16520tC A1t = A01(30, 180, "prekey_expiration_days", "prekey_expiration_days", 60);
    public static final C16520tC A1u = A01((Integer) null, (Integer) null, "ptt_playback_speed_hide_delay", "ptt_playback_speed_hide_delay", 1500);
    public static final C16520tC A1v = A01((Integer) null, (Integer) null, "shops_required_tos_version", "shops_required_tos_version", 0);
    public static final C16520tC A1w = A01((Integer) null, (Integer) null, "status_image_max_edge", "status_image_max_edge", 1280);
    public static final C16520tC A1x = A01((Integer) null, (Integer) null, "status_image_quality", "status_image_quality", 50);
    public static final C16520tC A1y = A01((Integer) null, (Integer) null, "status_video_max_duration", "status_video_max_duration", 45);
    public static final C16520tC A1z = A01(0, 20, "stella_addressbook_restriction_type", "stella_addressbook_restriction_type", 10);
    public static final C16520tC A20 = A01(25, (Integer) null, "subject_length_limit", "max_subject", 25);
    public static final C16520tC A21 = A01((Integer) null, (Integer) null, "sync_wifi_threshold_kb", "sync_wifi_threshold_kb", 5000);
    public static final C16520tC A22 = A01((Integer) null, (Integer) null, "template_doc_mime_types_int", "template_doc_mime_types", 0);
    public static final C16520tC A23 = A01((Integer) null, (Integer) null, "vcard_as_document_size_kb", "vcard_as_document_size_kb", 0);
    public static final C16520tC A24 = A01((Integer) null, (Integer) null, "vcard_max_size_kb", "vcard_max_size_kb", 1024);
    public static final C16520tC A25 = A01((Integer) null, (Integer) null, "video_max_bitrate", "video_max_bitrate", 5000);
    public static final C16520tC A26 = A01((Integer) null, (Integer) null, "vname_cert_staleness_threshold", "vname_cert_staleness_threshold", 43200);
    public static final C16520tC A27 = A01(0, 500, "web_max_size_kb", "web_max_size_kb", 100);
    public static final C16520tC A28 = A01((Integer) null, (Integer) null, "web_service_delay", "web_service_delay", 120);
    public static final AnonymousClass1Y5 A29;
    public static final AnonymousClass1Y5 A2A;
    public static final AnonymousClass1Y5 A2B;
    public static final AnonymousClass1Y5 A2C;
    public static final List A2D = new ArrayList();
    public static final List A2E = new ArrayList();
    public final SharedPreferences A00;
    public final AnonymousClass1CT A01;
    public final AnonymousClass1CS A02;
    public final AnonymousClass1CR A03;
    public final C16980tz A04;
    public final C226318r A05;

    static {
        AnonymousClass1Y5 r3 = new AnonymousClass1Y5("payments_cs_faq_url", "https://faq.whatsapp.com/payments");
        A2E.add(r3);
        A2B = r3;
        AnonymousClass1Y5 r32 = new AnonymousClass1Y5("payments_cs_email_address", (String) null);
        A2E.add(r32);
        A2A = r32;
        AnonymousClass1Y5 r33 = new AnonymousClass1Y5("payments_cs_phone_number", (String) null);
        A2E.add(r33);
        A2C = r33;
        AnonymousClass1Y5 r34 = new AnonymousClass1Y5("ephemeral_messages_allowed_values", "604800");
        A2E.add(r34);
        A29 = r34;
        C15920s8 r1 = new C15920s8("enable_export", "enable_export", true);
        A2D.add(r1);
        A0K = r1;
        C29281aL r12 = new C29281aL();
        A2E.add(r12);
        A15 = r12;
    }

    public C15910s6(AnonymousClass1CT r2, AnonymousClass1CS r3, AnonymousClass1CR r4, C16980tz r5, C226318r r6, C17020u3 r7) {
        SharedPreferences A002 = r7.A00("server_prop_preferences");
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = A002;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static C15920s8 A00(String str, String str2, boolean z2) {
        C15920s8 r1 = new C15920s8(str, str2, z2);
        A2E.add(r1);
        return r1;
    }

    public static C16520tC A01(Integer num, Integer num2, String str, String str2, int i2) {
        C16520tC r1 = new C16520tC(num, num2, str, str2, i2);
        A2E.add(r1);
        return r1;
    }

    public int A02(C16520tC r5) {
        int i2;
        synchronized (C15910s6.class) {
            i2 = this.A00.getInt(r5.A00, r5.A00);
        }
        return i2;
    }

    public String A03(AnonymousClass1Y5 r5) {
        String string;
        synchronized (C15910s6.class) {
            string = this.A00.getString(r5.A00, r5.A00);
        }
        return string;
    }

    public void A04(C16440t3 r10, String str, String str2, Map map, int i2, int i3, long j2) {
        boolean z2;
        ArrayList arrayList;
        SharedPreferences sharedPreferences = this.A00;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (C15910s6.class) {
            edit.putLong("groups_server_props_last_refresh_time", r10.A00());
            edit.putInt("server_props:last_version", i2);
            edit.putLong("server_props:refresh", Math.max(j2, 600000));
            z2 = false;
            if (i3 == 1 || !TextUtils.isEmpty(str)) {
                Iterator it = this.A02.A01().iterator();
                while (it.hasNext()) {
                    it.next();
                }
                for (C15930s9 A002 : A2E) {
                    A002.A00(edit, map);
                }
                AnonymousClass1CR r1 = this.A03;
                SharedPreferences.Editor edit2 = r1.A00.edit();
                synchronized (r1.A01) {
                    try {
                        arrayList = new ArrayList(AnonymousClass1CR.A02.values());
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (it2.hasNext()) {
                    it2.next();
                    th = new NullPointerException("remoteKey");
                    throw th;
                }
                edit2.apply();
                if (sharedPreferences.getBoolean("server_props:one_time_unlocked", true)) {
                    for (C15930s9 A003 : A2D) {
                        A003.A00(edit, map);
                    }
                    edit.putBoolean("server_props:one_time_unlocked", false);
                }
                z2 = true;
            }
            if (i3 == 2) {
                edit.putString("server_props:config_key", str2);
                C226318r r2 = this.A05;
                r2.A02(str2, 2141, 0);
                r2.A02(str2, 2141, 1);
                if (!TextUtils.isEmpty(str)) {
                    edit.putString("server_props:config_hash", str);
                }
            } else {
                edit.remove("server_props:config_key");
                C226318r r5 = this.A05;
                r5.A02((Object) null, 2141, 0);
                r5.A02((Object) null, 2141, 1);
                edit.remove("server_props:config_hash");
            }
            edit.apply();
        }
        AnonymousClass1CT r12 = this.A01;
        ((SharedPreferences) r12.A01.get()).edit().putString("server_props:hash", AnonymousClass1CU.A00(((SharedPreferences) r12.A02.get()).getAll())).apply();
        if (z2) {
            for (C29291aM r3 : this.A02.A01()) {
                r3.A00.A0n.Acl(new RunnableRunnableShape6S0100000_I0_5(r3, 30));
            }
        }
    }

    public boolean A05(C15920s8 r5) {
        boolean z2;
        synchronized (C15910s6.class) {
            z2 = this.A00.getBoolean(r5.A00, r5.A00);
        }
        return z2;
    }

    public void ARG() {
        synchronized (C15910s6.class) {
            C226318r r3 = this.A05;
            String string = this.A00.getString("server_props:config_key", (String) null);
            r3.A02(string, 2141, 0);
            r3.A02(string, 2141, 1);
        }
    }
}
