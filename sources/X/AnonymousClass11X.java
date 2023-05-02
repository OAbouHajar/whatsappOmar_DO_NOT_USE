package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.11X  reason: invalid class name */
public class AnonymousClass11X extends C16780td {
    public final C16980tz A00;
    public final C206911f A01;
    public final C34381kA A02 = new C34381kA();

    public AnonymousClass11X(C16300so r8, C16980tz r9, C206911f r10, C14710pd r11, String str) {
        super(r9.A00, r8, r11, str, 74);
        this.A01 = r10;
        this.A00 = r9;
    }

    public static final void A00(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS subgroup_info");
        sQLiteDatabase.execSQL("CREATE TABLE subgroup_info (subgroup_raw_jid TEXT NOT NULL, subject TEXT NOT NULL, subject_ts INTEGER, group_type INTEGER NOT NULL DEFAULT 2)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS subgroup_raw_jid_index ON subgroup_info (subgroup_raw_jid)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS group_relationship");
        sQLiteDatabase.execSQL("CREATE TABLE group_relationship (parent_raw_jid TEXT NOT NULL, subgroup_raw_id TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS group_relationship_parent_raw_jid_index ON group_relationship (parent_raw_jid)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS group_relationship_subgroup_raw_jid_index ON group_relationship (subgroup_raw_id)");
    }

    public void A04() {
        super.A04();
        for (C34391kB r0 : this.A02.A01()) {
            AnonymousClass15L r2 = r0.A00;
            if (r2 instanceof C224818c) {
                C224818c r22 = (C224818c) r2;
                synchronized (r22.A07) {
                    r22.A00 = 0;
                }
            }
        }
    }

    public C16810tg A05() {
        try {
            return C33931jQ.A01(super.A00(), this.A01);
        } catch (SQLiteDatabaseCorruptException e2) {
            Log.w("Contacts database is corrupt. Removing...", e2);
            A04();
            return C33931jQ.A01(super.A00(), this.A01);
        } catch (SQLiteException e3) {
            String obj = e3.toString();
            if (obj.contains("file is encrypted")) {
                Log.w("Contacts database is encrypted. Removing...", e3);
                A04();
                return C33931jQ.A01(super.A00(), this.A01);
            } else if (obj.contains("upgrade read-only database")) {
                Log.w("Client actually opened database as read-only and can't upgrade. Switching to writable...", e3);
                return C33931jQ.A01(super.A00(), this.A01);
            } else {
                throw e3;
            }
        } catch (StackOverflowError e4) {
            Log.w("StackOverflowError during db init check");
            for (StackTraceElement methodName : e4.getStackTrace()) {
                if (methodName.getMethodName().equals("onCorruption")) {
                    Log.w("Contacts database is corrupt. Found via StackOverflowError. Removing...");
                    A04();
                    return C33931jQ.A01(super.A00(), this.A01);
                }
            }
            throw e4;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("creating contacts database version 74");
        Log.i("creating contacts table for contacts database version 74");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_contacts");
        sQLiteDatabase.execSQL("CREATE TABLE wa_contacts (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, is_whatsapp_user BOOLEAN NOT NULL, status TEXT, status_timestamp INTEGER, number TEXT, raw_contact_id INTEGER, display_name TEXT, phone_type INTEGER, phone_label TEXT, unseen_msg_count INTEGER, photo_ts INTEGER, thumb_ts INTEGER, photo_id_timestamp INTEGER, given_name TEXT, family_name TEXT, wa_name TEXT, sort_name TEXT, nickname TEXT, company TEXT, title TEXT, status_autodownload_disabled INTEGER, keep_timestamp INTEGER, is_spam_reported INTEGER, is_sidelist_synced BOOLEAN DEFAULT 0, is_business_synced BOOLEAN DEFAULT 0, disappearing_mode_duration INTEGER, disappearing_mode_timestamp LONG, history_sync_initial_phash TEXT)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS is_wa_index ON wa_contacts (is_whatsapp_user);");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS jid_index ON wa_contacts (jid);");
        Log.i("creating system contacts version table for contacts database version 74");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS system_contacts_version_table");
        sQLiteDatabase.execSQL("CREATE TABLE system_contacts_version_table (id INTEGER PRIMARY KEY, version INTEGER)");
        Log.i("creating wa_vnames table for contacts database version 74");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_vnames");
        sQLiteDatabase.execSQL("CREATE TABLE wa_vnames (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, serial INTEGER NOT NULL, issuer TEXT NOT NULL, expires INTEGER, verified_name TEXT NOT NULL, industry TEXT, city TEXT, country TEXT, verified_level INTEGER, identity_unconfirmed_since INTEGER, cert_blob BLOB, host_storage INTEGER DEFAULT 0, actual_actors INTEGER DEFAULT 0, privacy_mode_ts INTEGER DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS vname_jid_index ON wa_vnames (jid);");
        Log.i("creating wa_vnames_localized table for contacts database version 74");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_vnames_localized");
        sQLiteDatabase.execSQL("CREATE TABLE wa_vnames_localized (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, lg TEXT NOT NULL, lc TEXT NOT NULL, verified_name TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS vname_localized_index ON wa_vnames_localized (jid, lg, lc);");
        Log.i("creating storage usage table for contacts database version 74");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_contact_storage_usage");
        sQLiteDatabase.execSQL("CREATE TABLE wa_contact_storage_usage (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, conversation_size INTEGER NOT NULL, conversation_message_count INTEGER NOT NULL)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS wa_contact_storage_usage_index ON wa_contact_storage_usage (jid, conversation_size DESC)");
        Log.i("creating wa_biz_profiles table for contacts database version 74");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS contact_bd_for_business_profiles");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_biz_profiles");
        sQLiteDatabase.execSQL("CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, latitude REAL, longitude REAL, tag TEXT, vertical TEXT,time_zone TEXT,hours_note TEXT,has_catalog BOOLEAN DEFAULT 0, address_postal_code TEXT, address_city_id TEXT, address_city_name TEXT, commerce_experience TEXT, shop_url TEXT, cart_enabled BOOLEAN DEFAULT 0, commerce_manager_url TEXT, direct_connection_enabled BOOLEAN DEFAULT 0, is_shop_banned BOOLEAN DEFAULT 0, default_postcode TEXT, location_name TEXT, galaxy_business_enabled BOOLEAN DEFAULT 0, cover_photo_url TEXT, cover_photo_id TEXT, custom_url TEXT, member_since TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_jid_index ON wa_biz_profiles (jid);");
        sQLiteDatabase.execSQL("CREATE TRIGGER contact_bd_for_business_profiles BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_profiles WHERE jid = old.jid; END");
        sQLiteDatabase.execSQL("CREATE TRIGGER contact_bu_for_business_profiles BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_profiles SET jid = new.jid WHERE jid = old.jid; END");
        Log.i("creating wa_biz_profiles_websites table for contacts database version 74");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_websites");
        sQLiteDatabase.execSQL("CREATE TABLE wa_biz_profiles_websites (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, websites TEXT)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_website_index ON wa_biz_profiles_websites(wa_biz_profile_id, websites);");
        sQLiteDatabase.execSQL("CREATE TRIGGER business_profiles_bd_for_websites_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = old._id; END");
        Log.i("creating wa_biz_profiles_hours table for contacts database version 74");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_hours");
        sQLiteDatabase.execSQL("CREATE TABLE wa_biz_profiles_hours (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, day_of_week INTEGER,mode INTEGER,open_time INTEGER,close_time INTEGER)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_hours_index ON wa_biz_profiles_hours(wa_biz_profile_id);");
        sQLiteDatabase.execSQL("CREATE TRIGGER business_profiles_bd_for_hours_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_hours WHERE wa_biz_profile_id = old._id; END");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_categories");
        sQLiteDatabase.execSQL("CREATE TABLE wa_biz_profiles_categories (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, category_id TEXT NOT NULL,category_name TEXT NOT NULL)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_category_index ON wa_biz_profiles_categories(wa_biz_profile_id, category_id);");
        sQLiteDatabase.execSQL("CREATE TRIGGER business_profiles_bd_for_categories_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_categories WHERE wa_biz_profile_id = old._id; END");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_group_descriptions");
        sQLiteDatabase.execSQL("CREATE TABLE wa_group_descriptions (jid TEXT NOT NULL, description TEXT NOT NULL, description_id INTEGER, description_time INTEGER, description_setter_jid TEXT NOT NULL, description_id_string TEXT NOT NULL DEFAULT '')");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS wa_group_descriptions_jid_index ON wa_group_descriptions(jid)");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_group_admin_settings");
        sQLiteDatabase.execSQL("CREATE TABLE wa_group_admin_settings (jid TEXT NOT NULL, restrict_mode BOOLEAN NOT NULL, announcement_group BOOLEAN NOT NULL DEFAULT 0, no_frequently_forwarded BOOLEAN NOT NULL DEFAULT 0, ephemeral_duration INTEGER DEFAULT NULL, creator_jid TEXT, in_app_support BOOLEAN NOT NULL DEFAULT 0, is_suspended BOOLEAN, group_state INTEGER NOT NULL DEFAULT 0, require_membership_approval BOOLEAN NOT NULL DEFAULT 0, member_add_mode INTEGER NOT NULL DEFAULT 0,incognito BOOLEAN,is_pending_requests_banner_acknowledged BOOLEAN NOT NULL DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS group_admin_settings_jid_index ON wa_group_admin_settings (jid)");
        sQLiteDatabase.execSQL("CREATE TRIGGER group_admin_settings_deletion_trigger BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_group_admin_settings WHERE jid = old.jid; END");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_block_list");
        sQLiteDatabase.execSQL("CREATE TABLE wa_block_list (jid TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS block_list_jid_index ON wa_block_list (jid)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_group_add_black_list");
        sQLiteDatabase.execSQL("CREATE TABLE wa_group_add_black_list (jid TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS group_add_black_list_jid_index ON wa_group_add_black_list (jid)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_last_seen_block_list");
        sQLiteDatabase.execSQL("CREATE TABLE wa_last_seen_block_list (jid TEXT NOT NULL)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_profile_photo_block_list");
        sQLiteDatabase.execSQL("CREATE TABLE wa_profile_photo_block_list (jid TEXT NOT NULL)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_about_block_list");
        sQLiteDatabase.execSQL("CREATE TABLE wa_about_block_list (jid TEXT NOT NULL)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_props");
        sQLiteDatabase.execSQL("CREATE TABLE wa_props (_id INTEGER PRIMARY KEY AUTOINCREMENT, prop_name TEXT UNIQUE, prop_value TEXT)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_last_entry_point");
        sQLiteDatabase.execSQL("CREATE TABLE wa_last_entry_point (jid TEXT NOT NULL, entry_point_type TEXT NOT NULL, entry_point_id TEXT, entry_point_time INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS entry_point_jid_index ON wa_last_entry_point (jid)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_trusted_contacts");
        sQLiteDatabase.execSQL("CREATE TABLE wa_trusted_contacts (jid TEXT PRIMARY KEY NOT NULL, incoming_tc_token BLOB NOT NULL, incoming_tc_token_timestamp LONG NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS incoming_tc_token_timestamp_index ON wa_trusted_contacts (incoming_tc_token_timestamp)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_trusted_contacts_send");
        sQLiteDatabase.execSQL("CREATE TABLE wa_trusted_contacts_send (jid TEXT PRIMARY KEY NOT NULL, sent_tc_token_timestamp LONG NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sent_tc_token_timestamp_index ON wa_trusted_contacts_send (sent_tc_token_timestamp)");
        A00(sQLiteDatabase);
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_linked_accounts_trigger");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_linked_accounts_table");
        sQLiteDatabase.execSQL("CREATE TABLE wa_biz_profiles_linked_accounts_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, account_id TEXT NOT NULL,account_type INTEGER NOT NULL,account_display_name TEXT NOT NULL,account_fan_count INTEGER NOT NULL,account_has_media_post INTEGER NOT NULL DEFAULT 0)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS wa_biz_profiles_linked_accounts_index ON wa_biz_profiles_linked_accounts_table(wa_biz_profile_id);");
        sQLiteDatabase.execSQL("CREATE TRIGGER business_profiles_bd_for_linked_accounts_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_linked_accounts_table WHERE wa_biz_profile_id = old._id; END");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS group_membership_count");
        sQLiteDatabase.execSQL("CREATE TABLE group_membership_count (jid_row_id INTEGER PRIMARY KEY, member_count INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS dismissed_chat");
        sQLiteDatabase.execSQL("CREATE TABLE dismissed_chat (chat_jid TEXT PRIMARY KEY, timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_service_areas_trigger");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_service_areas");
        sQLiteDatabase.execSQL("CREATE TABLE wa_biz_profiles_service_areas (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, area_description TEXT,radius INTEGER NOT NULL,center_latitude REAL NOT NULL,center_longitude REAL NOT NULL)");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_service_area_index ON wa_biz_profiles_service_areas(wa_biz_profile_id);");
        sQLiteDatabase.execSQL("CREATE TRIGGER business_profiles_bd_for_service_areas_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_service_areas WHERE wa_biz_profile_id = old._id; END");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS group_membership_approval_requests");
        sQLiteDatabase.execSQL("CREATE TABLE group_membership_approval_requests (group_jid TEXT NOT NULL, requester_jid TEXT NOT NULL, request_method TEXT NOT NULL, request_creation_time INTEGER, PRIMARY KEY (group_jid,requester_jid))");
        sQLiteDatabase.execSQL(" CREATE INDEX IF NOT EXISTS request_creation_time_index ON group_membership_approval_requests(request_creation_time);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        StringBuilder sb = new StringBuilder("Downgrading contacts database from version ");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03c7, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD commerce_manager_url TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03ce, code lost:
        r12.execSQL("ALTER TABLE wa_contacts ADD disappearing_mode_duration INTEGER");
        r12.execSQL("ALTER TABLE wa_contacts ADD disappearing_mode_timestamp LONG");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03da, code lost:
        X.C34411kD.A01(r12, "wa_biz_profiles", "direct_connection_enabled", "BOOLEAN DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03e1, code lost:
        r12.execSQL("DROP TABLE IF EXISTS wa_last_seen_block_list");
        r12.execSQL("CREATE TABLE wa_last_seen_block_list (jid TEXT NOT NULL)");
        r12.execSQL("DROP TABLE IF EXISTS wa_profile_photo_block_list");
        r12.execSQL("CREATE TABLE wa_profile_photo_block_list (jid TEXT NOT NULL)");
        r12.execSQL("DROP TABLE IF EXISTS wa_about_block_list");
        r12.execSQL("CREATE TABLE wa_about_block_list (jid TEXT NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0401, code lost:
        r12.execSQL("DROP TABLE IF EXISTS wa_trusted_contacts");
        r12.execSQL("CREATE TABLE wa_trusted_contacts (jid TEXT PRIMARY KEY NOT NULL, incoming_tc_token BLOB NOT NULL, incoming_tc_token_timestamp LONG NOT NULL)");
        r12.execSQL("CREATE INDEX IF NOT EXISTS incoming_tc_token_timestamp_index ON wa_trusted_contacts (incoming_tc_token_timestamp)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0412, code lost:
        r12.execSQL("DROP TABLE IF EXISTS wa_trusted_contacts_send");
        r12.execSQL("CREATE TABLE wa_trusted_contacts_send (jid TEXT PRIMARY KEY NOT NULL, sent_tc_token_timestamp LONG NOT NULL)");
        r12.execSQL("CREATE INDEX IF NOT EXISTS sent_tc_token_timestamp_index ON wa_trusted_contacts_send (sent_tc_token_timestamp)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0423, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD is_shop_banned BOOLEAN DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x042a, code lost:
        A00(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x042f, code lost:
        X.C34411kD.A01(r12, "wa_group_admin_settings", "is_suspended", "BOOLEAN");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0438, code lost:
        r12.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_linked_accounts_trigger");
        r12.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_linked_accounts_table");
        r12.execSQL("CREATE TABLE wa_biz_profiles_linked_accounts_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, account_id TEXT NOT NULL,account_type INTEGER NOT NULL,account_display_name TEXT NOT NULL,account_fan_count INTEGER NOT NULL,account_has_media_post INTEGER NOT NULL DEFAULT 0)");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS wa_biz_profiles_linked_accounts_index ON wa_biz_profiles_linked_accounts_table(wa_biz_profile_id);");
        r12.execSQL("CREATE TRIGGER business_profiles_bd_for_linked_accounts_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_linked_accounts_table WHERE wa_biz_profile_id = old._id; END");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0453, code lost:
        X.C34411kD.A01(r12, "subgroup_info", "group_type", "INTEGER NOT NULL DEFAULT 2");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x045f, code lost:
        X.C34411kD.A01(r12, "wa_biz_profiles", "default_postcode", "TEXT");
        X.C34411kD.A01(r12, "wa_biz_profiles", "location_name", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x046b, code lost:
        X.C34411kD.A01(r12, "wa_biz_profiles", "galaxy_business_enabled", "BOOLEAN DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0472, code lost:
        r12.execSQL("DROP TABLE IF EXISTS group_membership_count");
        r12.execSQL("CREATE TABLE group_membership_count (jid_row_id INTEGER PRIMARY KEY, member_count INTEGER NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x047e, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD cover_photo_url TEXT");
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD cover_photo_id TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x048a, code lost:
        X.C34411kD.A01(r12, "wa_contacts", "history_sync_initial_phash", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0491, code lost:
        X.C34411kD.A01(r12, "wa_group_admin_settings", "require_membership_approval", "BOOLEAN NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x049a, code lost:
        r12.execSQL("DROP TABLE IF EXISTS dismissed_chat");
        r12.execSQL("CREATE TABLE dismissed_chat (chat_jid TEXT PRIMARY KEY, timestamp INTEGER NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04a6, code lost:
        X.C34411kD.A01(r12, "wa_group_admin_settings", "member_add_mode", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x04af, code lost:
        X.C34411kD.A01(r12, "wa_group_admin_settings", "incognito", "BOOLEAN");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ce, code lost:
        r12.execSQL("ALTER TABLE wa_contacts ADD callability TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04b8, code lost:
        X.C34411kD.A01(r12, "wa_group_admin_settings", "group_state", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04c1, code lost:
        r12.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_service_areas_trigger");
        r12.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_service_areas");
        r12.execSQL("CREATE TABLE wa_biz_profiles_service_areas (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, area_description TEXT,radius INTEGER NOT NULL,center_latitude REAL NOT NULL,center_longitude REAL NOT NULL)");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_service_area_index ON wa_biz_profiles_service_areas(wa_biz_profile_id);");
        r12.execSQL("CREATE TRIGGER business_profiles_bd_for_service_areas_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_service_areas WHERE wa_biz_profile_id = old._id; END");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04dc, code lost:
        r12.execSQL("DROP TABLE IF EXISTS group_membership_approval_requests");
        r12.execSQL("CREATE TABLE group_membership_approval_requests (group_jid TEXT NOT NULL, requester_jid TEXT NOT NULL, request_method TEXT NOT NULL, request_creation_time INTEGER, PRIMARY KEY (group_jid,requester_jid))");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS request_creation_time_index ON group_membership_approval_requests(request_creation_time);");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x04ed, code lost:
        X.C34411kD.A01(r12, "wa_group_admin_settings", "is_pending_requests_banner_acknowledged", "BOOLEAN NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04f6, code lost:
        r12.execSQL("DROP TRIGGER IF EXISTS contact_bd_for_business_profiles");
        r12.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
        r12.execSQL("CREATE TRIGGER contact_bd_for_business_profiles BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_profiles WHERE jid = old.jid; END");
        r12.execSQL("CREATE TRIGGER contact_bu_for_business_profiles BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_profiles SET jid = new.jid WHERE jid = old.jid; END");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d3, code lost:
        com.whatsapp.util.Log.i("creating contact capabilities table for contacts database version 74");
        r12.execSQL("DROP TABLE IF EXISTS wa_contact_capabilities");
        r12.execSQL("CREATE TABLE wa_contact_capabilities (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, capability TEXT NOT NULL, value TEXT NOT NULL, updated_at INTEGER NOT NULL)");
        r12.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS wa_contact_capabilities_jid_capability_index ON wa_contact_capabilities (jid, capability)");
        com.whatsapp.util.Log.i("migrating callability to capabilities table for contacts database version 74");
        r4 = r12.rawQuery("SELECT jid, callability FROM wa_contacts WHERE callability IS NOT NULL", (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0508, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD custom_url TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x050f, code lost:
        X.C34411kD.A01(r12, "wa_biz_profiles_linked_accounts_table", "account_has_media_post", "INT NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x051b, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD member_since TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0524, code lost:
        if (r37 < 19) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0526, code lost:
        r2 = new android.content.ContentValues(r1);
        r2.put("tag", (java.lang.String) null);
        r12.update("wa_biz_profiles", r2, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0535, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x053d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x053e, code lost:
        if (r4 != null) goto L_0x0540;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0543, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0544, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r15 = java.lang.System.currentTimeMillis();
        r3 = new android.content.ContentValues();
        r3.put("capability", "voip");
        r3.put("updated_at", java.lang.Long.valueOf(r15));
        r2 = r4.getColumnIndexOrThrow("jid");
        r1 = r4.getColumnIndexOrThrow("callability");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0545, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0546, code lost:
        r12.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0549, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x011e, code lost:
        if (r4.moveToNext() == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0120, code lost:
        r0 = r4.getString(r2);
        r15 = r4.getString(r1);
        r3.put("jid", r0);
        r3.put("value", r15);
        r12.insert("wa_contact_capabilities", (java.lang.String) null, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0138, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x013b, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x013c, code lost:
        r12.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r12.execSQL("ALTER TABLE wa_contacts RENAME TO old_wa_contacts");
        r12.execSQL("DROP INDEX is_wa_index");
        r12.execSQL("DROP INDEX jid_index");
        r12.execSQL("DROP TABLE IF EXISTS wa_contacts");
        r12.execSQL("CREATE TABLE wa_contacts (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, is_whatsapp_user BOOLEAN NOT NULL, status TEXT, status_timestamp INTEGER, number TEXT, raw_contact_id INTEGER, display_name TEXT, phone_type INTEGER, phone_label TEXT, unseen_msg_count INTEGER, photo_ts INTEGER, thumb_ts INTEGER, photo_id_timestamp INTEGER, given_name TEXT, family_name TEXT, wa_name TEXT, sort_name TEXT)");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS is_wa_index ON wa_contacts (is_whatsapp_user);");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS jid_index ON wa_contacts (jid);");
        r12.execSQL(X.C34401kC.A01);
        r12.execSQL("DROP TABLE old_wa_contacts");
        r12.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0174, code lost:
        com.whatsapp.util.Log.i("creating system contacts version table for contacts database version 74");
        r12.execSQL("DROP TABLE IF EXISTS system_contacts_version_table");
        r12.execSQL("CREATE TABLE system_contacts_version_table (id INTEGER PRIMARY KEY, version INTEGER)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0185, code lost:
        r12.execSQL("ALTER TABLE wa_contacts ADD nickname TEXT");
        r12.execSQL("ALTER TABLE wa_contacts ADD company TEXT");
        r12.execSQL("ALTER TABLE wa_contacts ADD title TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0196, code lost:
        com.whatsapp.util.Log.i("creating wa_vnames table for contacts database version 74");
        r12.execSQL("DROP TABLE IF EXISTS wa_vnames");
        r12.execSQL("CREATE TABLE wa_vnames (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, serial INTEGER NOT NULL, issuer TEXT NOT NULL, expires INTEGER, verified_name TEXT NOT NULL, industry TEXT, city TEXT, country TEXT)");
        r12.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS vname_jid_index ON wa_vnames (jid);");
        com.whatsapp.util.Log.i("creating wa_vnames_localized table for contacts database version 74");
        r12.execSQL("DROP TABLE IF EXISTS wa_vnames_localized");
        r12.execSQL("CREATE TABLE wa_vnames_localized (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, lg TEXT NOT NULL, lc TEXT NOT NULL, verified_name TEXT NOT NULL)");
        r12.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS vname_localized_index ON wa_vnames_localized (jid, lg, lc);");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01c0, code lost:
        r12.execSQL("ALTER TABLE wa_contacts ADD status_autodownload_disabled INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01d1, code lost:
        r12.execSQL("ALTER TABLE wa_contacts ADD keep_timestamp INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01d8, code lost:
        r12.execSQL("ALTER TABLE wa_contacts ADD is_spam_reported INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01df, code lost:
        r12.execSQL("ALTER TABLE wa_vnames ADD verified_level INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01e6, code lost:
        r12.execSQL("ALTER TABLE wa_contacts ADD description TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01ed, code lost:
        com.whatsapp.util.Log.i("creating storage usage table for contacts database version 74");
        r12.execSQL("DROP TABLE IF EXISTS wa_contact_storage_usage");
        r12.execSQL("CREATE TABLE wa_contact_storage_usage (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, conversation_size INTEGER NOT NULL, conversation_message_count INTEGER NOT NULL)");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS wa_contact_storage_usage_index ON wa_contact_storage_usage (jid, conversation_size DESC)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0203, code lost:
        r12.execSQL("ALTER TABLE wa_vnames ADD identity_unconfirmed_since INTEGER");
        r12.execSQL("ALTER TABLE wa_vnames ADD cert_blob BLOB");
        r12.execSQL("DROP TRIGGER IF EXISTS contact_bu_for_business_profiles");
        r12.execSQL("DROP TRIGGER IF EXISTS contact_bd_for_business_profiles");
        r12.execSQL("DROP TABLE IF EXISTS wa_biz_profiles");
        r12.execSQL("CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, tag TEXT)");
        r12.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_jid_index ON wa_biz_profiles (jid);");
        r12.execSQL("CREATE TRIGGER contact_bd_for_business_profiles BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_profiles WHERE jid = old.jid; END");
        r12.execSQL("CREATE TRIGGER contact_bu_for_business_profiles BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_profiles SET jid = new.jid WHERE jid = old.jid; END");
        r12.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger");
        r12.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_websites");
        r12.execSQL("CREATE TABLE wa_biz_profiles_websites (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, websites TEXT)");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_website_index ON wa_biz_profiles_websites(wa_biz_profile_id, websites);");
        r12.execSQL("CREATE TRIGGER business_profiles_bd_for_websites_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = old._id; END");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0247, code lost:
        r12.execSQL("DROP TABLE IF EXISTS wa_group_descriptions");
        r12.execSQL("CREATE TABLE wa_group_descriptions (jid TEXT NOT NULL, description TEXT NOT NULL, description_id INTEGER, description_time INTEGER, description_setter_jid TEXT NOT NULL)");
        r12.beginTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r12.execSQL("ALTER TABLE wa_contacts RENAME TO old_wa_contacts");
        r12.execSQL("DROP INDEX is_wa_index");
        r12.execSQL("DROP INDEX jid_index");
        com.whatsapp.util.Log.i("creating contacts table for contacts database version 74");
        r12.execSQL("DROP TABLE IF EXISTS wa_contacts");
        r12.execSQL("CREATE TABLE wa_contacts (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, is_whatsapp_user BOOLEAN NOT NULL, status TEXT, status_timestamp INTEGER, number TEXT, raw_contact_id INTEGER, display_name TEXT, phone_type INTEGER, phone_label TEXT, unseen_msg_count INTEGER, photo_ts INTEGER, thumb_ts INTEGER, photo_id_timestamp INTEGER, given_name TEXT, family_name TEXT, wa_name TEXT, sort_name TEXT, nickname TEXT, company TEXT, title TEXT, status_autodownload_disabled INTEGER, keep_timestamp INTEGER, is_spam_reported INTEGER)");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS is_wa_index ON wa_contacts (is_whatsapp_user);");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS jid_index ON wa_contacts (jid);");
        r12.execSQL(X.C34401kC.A00);
        r12.execSQL("DROP TABLE old_wa_contacts");
        r12.setTransactionSuccessful();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0289, code lost:
        r12.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x028e, code lost:
        r12.execSQL("ALTER TABLE wa_group_descriptions ADD description_id_string TEXT NOT NULL DEFAULT ''");
        r12.execSQL("UPDATE wa_group_descriptions SET description_id_string = CAST( description_id as TEXT)");
        r12.execSQL("UPDATE wa_group_descriptions SET description_id = 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x029f, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD longitude REAL");
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD latitude REAL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x02ab, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD vertical TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x02b2, code lost:
        r12.execSQL("ALTER TABLE wa_contacts ADD is_sidelist_synced BOOLEAN DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x02b9, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD time_zone TEXT");
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD hours_note TEXT");
        r12.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger");
        r12.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_hours");
        r12.execSQL("CREATE TABLE wa_biz_profiles_hours (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, day_of_week INTEGER,mode INTEGER,open_time INTEGER,close_time INTEGER)");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_hours_index ON wa_biz_profiles_hours(wa_biz_profile_id);");
        r12.execSQL("CREATE TRIGGER business_profiles_bd_for_hours_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_hours WHERE wa_biz_profile_id = old._id; END");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x02de, code lost:
        r12.execSQL("DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger");
        r12.execSQL("DROP TABLE IF EXISTS wa_group_admin_settings");
        r12.execSQL("CREATE TABLE wa_group_admin_settings (jid TEXT NOT NULL, restrict_mode BOOLEAN NOT NULL)");
        r12.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS group_admin_settings_jid_index ON wa_group_admin_settings (jid)");
        r12.execSQL("CREATE TRIGGER group_admin_settings_deletion_trigger BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_group_admin_settings WHERE jid = old.jid; END");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x02f9, code lost:
        r12.execSQL("ALTER TABLE wa_group_admin_settings ADD announcement_group BOOLEAN NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0300, code lost:
        X.C34411kD.A01(r12, "wa_contacts", "is_business_synced", "BOOLEAN DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0307, code lost:
        r12.execSQL("DROP TABLE IF EXISTS wa_block_list");
        r12.execSQL("CREATE TABLE wa_block_list (jid TEXT NOT NULL)");
        r12.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS block_list_jid_index ON wa_block_list (jid)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0318, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD has_catalog BOOLEAN DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x031f, code lost:
        r12.execSQL("ALTER TABLE wa_group_admin_settings ADD no_frequently_forwarded BOOLEAN NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0326, code lost:
        r12.execSQL("DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger");
        r12.execSQL("DROP TABLE IF EXISTS wa_biz_profiles_categories");
        r12.execSQL("CREATE TABLE wa_biz_profiles_categories (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, category_id TEXT NOT NULL,category_name TEXT NOT NULL)");
        r12.execSQL(" CREATE INDEX IF NOT EXISTS biz_profile_id_category_index ON wa_biz_profiles_categories(wa_biz_profile_id, category_id);");
        r12.execSQL("CREATE TRIGGER business_profiles_bd_for_categories_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_categories WHERE wa_biz_profile_id = old._id; END");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0341, code lost:
        r12.execSQL("ALTER TABLE wa_group_admin_settings ADD ephemeral_duration INTEGER DEFAULT NULL");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0348, code lost:
        r12.execSQL("DROP TABLE IF EXISTS wa_group_add_black_list");
        r12.execSQL("CREATE TABLE wa_group_add_black_list (jid TEXT NOT NULL)");
        r12.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS group_add_black_list_jid_index ON wa_group_add_black_list (jid)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0359, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD address_postal_code TEXT");
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD address_city_id TEXT");
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD address_city_name TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x036a, code lost:
        r12.execSQL("DROP TABLE IF EXISTS wa_props");
        r12.execSQL("CREATE TABLE wa_props (_id INTEGER PRIMARY KEY AUTOINCREMENT, prop_name TEXT UNIQUE, prop_value TEXT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0376, code lost:
        r12.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS wa_group_descriptions_jid_index ON wa_group_descriptions(jid)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x037d, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD commerce_experience TEXT");
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD shop_url TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0389, code lost:
        r12.execSQL("DROP TABLE IF EXISTS wa_last_entry_point");
        r12.execSQL("CREATE TABLE wa_last_entry_point (jid TEXT NOT NULL, entry_point_type TEXT NOT NULL, entry_point_id TEXT, entry_point_time INTEGER)");
        r12.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS entry_point_jid_index ON wa_last_entry_point (jid)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x039a, code lost:
        r12.execSQL("DROP TABLE IF EXISTS wa_contact_capabilities");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x03a1, code lost:
        r12.execSQL("ALTER TABLE wa_group_admin_settings ADD creator_jid TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03a8, code lost:
        r12.execSQL("ALTER TABLE wa_vnames ADD actual_actors INTEGER DEFAULT 0");
        r12.execSQL("ALTER TABLE wa_vnames ADD host_storage INTEGER DEFAULT 0");
        r12.execSQL("ALTER TABLE wa_vnames ADD privacy_mode_ts INTEGER DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x03b9, code lost:
        r12.execSQL("ALTER TABLE wa_biz_profiles ADD cart_enabled BOOLEAN DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03c0, code lost:
        r12.execSQL("ALTER TABLE wa_group_admin_settings ADD in_app_support BOOLEAN NOT NULL DEFAULT 0");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r39, int r40, int r41) {
        /*
            r38 = this;
            java.lang.String r0 = "Upgrading contacts database from version "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = r40
            r1.append(r2)
            java.lang.String r0 = " to "
            r1.append(r0)
            r37 = r41
            r0 = r37
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r28 = "DROP TABLE IF EXISTS wa_contacts"
            java.lang.String r27 = "DROP INDEX jid_index"
            java.lang.String r26 = "DROP INDEX is_wa_index"
            java.lang.String r25 = "ALTER TABLE wa_contacts RENAME TO old_wa_contacts"
            java.lang.String r24 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r23 = "BOOLEAN NOT NULL DEFAULT 0"
            java.lang.String r22 = "BOOLEAN"
            java.lang.String r21 = "CREATE TRIGGER contact_bu_for_business_profiles BEFORE UPDATE ON wa_contacts BEGIN UPDATE wa_biz_profiles SET jid = new.jid WHERE jid = old.jid; END"
            java.lang.String r20 = "CREATE TRIGGER contact_bd_for_business_profiles BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_biz_profiles WHERE jid = old.jid; END"
            java.lang.String r13 = "DROP TRIGGER IF EXISTS contact_bd_for_business_profiles"
            java.lang.String r11 = "DROP TRIGGER IF EXISTS contact_bu_for_business_profiles"
            java.lang.String r10 = "TEXT"
            java.lang.String r9 = "BOOLEAN DEFAULT 0"
            java.lang.String r8 = "wa_contacts"
            r19 = 0
            java.lang.String r7 = "wa_biz_profiles"
            java.lang.String r6 = "wa_group_admin_settings"
            r12 = r39
            switch(r40) {
                case 3: goto L_0x00c9;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00d3;
                case 6: goto L_0x0060;
                case 7: goto L_0x013b;
                case 8: goto L_0x0173;
                case 9: goto L_0x0184;
                case 10: goto L_0x0195;
                case 11: goto L_0x01bf;
                case 12: goto L_0x01c6;
                case 13: goto L_0x01d0;
                case 14: goto L_0x01d7;
                case 15: goto L_0x01de;
                case 16: goto L_0x01e5;
                case 17: goto L_0x01ec;
                case 18: goto L_0x0202;
                case 19: goto L_0x0246;
                case 20: goto L_0x028d;
                case 21: goto L_0x029e;
                case 22: goto L_0x02aa;
                case 23: goto L_0x02b1;
                case 24: goto L_0x02b8;
                case 25: goto L_0x02dd;
                case 26: goto L_0x02f8;
                case 27: goto L_0x02ff;
                case 28: goto L_0x0306;
                case 29: goto L_0x0317;
                case 30: goto L_0x031e;
                case 31: goto L_0x0325;
                case 32: goto L_0x0340;
                case 33: goto L_0x0347;
                case 34: goto L_0x0358;
                case 35: goto L_0x0369;
                case 36: goto L_0x0375;
                case 37: goto L_0x037c;
                case 38: goto L_0x0388;
                case 39: goto L_0x0399;
                case 40: goto L_0x03a0;
                case 41: goto L_0x03a7;
                case 42: goto L_0x03b8;
                case 43: goto L_0x03bf;
                case 44: goto L_0x03c6;
                case 45: goto L_0x03cd;
                case 46: goto L_0x03d9;
                case 47: goto L_0x03d9;
                case 48: goto L_0x03e0;
                case 49: goto L_0x0400;
                case 50: goto L_0x0400;
                case 51: goto L_0x0411;
                case 52: goto L_0x0422;
                case 53: goto L_0x0429;
                case 54: goto L_0x042e;
                case 55: goto L_0x0437;
                case 56: goto L_0x0452;
                case 57: goto L_0x045e;
                case 58: goto L_0x046a;
                case 59: goto L_0x0471;
                case 60: goto L_0x047d;
                case 61: goto L_0x0489;
                case 62: goto L_0x0490;
                case 63: goto L_0x0499;
                case 64: goto L_0x04a5;
                case 65: goto L_0x04ae;
                case 66: goto L_0x04b7;
                case 67: goto L_0x04c0;
                case 68: goto L_0x04db;
                case 69: goto L_0x04ec;
                case 70: goto L_0x04f5;
                case 71: goto L_0x0507;
                case 72: goto L_0x050e;
                case 73: goto L_0x051a;
                default: goto L_0x0049;
            }
        L_0x0049:
            java.lang.String r1 = "Unrecognized old database version; oldVersion="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = r38
            r0.onCreate(r12)
        L_0x005f:
            return
        L_0x0060:
            java.lang.String r0 = "DROP INDEX wa_contact_capabilities_jid_index"
            r12.execSQL(r0)
            java.util.HashSet r18 = new java.util.HashSet
            r18.<init>()
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r1 = "jid"
            r2[r19] = r1
            java.lang.String r0 = "capability"
            r17 = 1
            r2[r17] = r0
            r32 = 0
            java.lang.String r16 = "wa_contact_capabilities"
            r5 = 2
            r34 = r32
            r35 = r32
            r36 = r32
            r29 = r12
            r30 = r16
            r31 = r2
            r33 = r32
            android.database.Cursor r14 = r29.query(r30, r31, r32, r33, r34, r35, r36)
            int r4 = r14.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0536 }
            int r3 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0536 }
        L_0x0097:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x0536 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r15 = r14.getString(r4)     // Catch:{ all -> 0x0536 }
            java.lang.String r0 = r14.getString(r3)     // Catch:{ all -> 0x0536 }
            android.util.Pair r2 = android.util.Pair.create(r15, r0)     // Catch:{ all -> 0x0536 }
            r1 = r18
            boolean r1 = r1.add(r2)     // Catch:{ all -> 0x0536 }
            if (r1 != 0) goto L_0x0097
            java.lang.String r2 = "jid = ? AND capability = ?"
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x0536 }
            r1[r19] = r15     // Catch:{ all -> 0x0536 }
            r1[r17] = r0     // Catch:{ all -> 0x0536 }
            r0 = r16
            r12.delete(r0, r2, r1)     // Catch:{ all -> 0x0536 }
            goto L_0x0097
        L_0x00bf:
            r1 = 1
            r14.close()
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS wa_contact_capabilities_jid_capability_index ON wa_contact_capabilities (jid, capability)"
            r12.execSQL(r0)
            goto L_0x013c
        L_0x00c9:
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD status_timestamp INTEGER"
            r12.execSQL(r0)
        L_0x00ce:
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD callability TEXT"
            r12.execSQL(r0)
        L_0x00d3:
            java.lang.String r0 = "creating contact capabilities table for contacts database version 74"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_contact_capabilities"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_contact_capabilities (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, capability TEXT NOT NULL, value TEXT NOT NULL, updated_at INTEGER NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS wa_contact_capabilities_jid_capability_index ON wa_contact_capabilities (jid, capability)"
            r12.execSQL(r0)
            java.lang.String r14 = "jid"
            java.lang.String r0 = "migrating callability to capabilities table for contacts database version 74"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "SELECT jid, callability FROM wa_contacts WHERE callability IS NOT NULL"
            r5 = 0
            android.database.Cursor r4 = r12.rawQuery(r0, r5)
            long r15 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x053d }
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x053d }
            r3.<init>()     // Catch:{ all -> 0x053d }
            java.lang.String r1 = "capability"
            java.lang.String r0 = "voip"
            r3.put(r1, r0)     // Catch:{ all -> 0x053d }
            java.lang.String r1 = "updated_at"
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x053d }
            r3.put(r1, r0)     // Catch:{ all -> 0x053d }
            int r2 = r4.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x053d }
            java.lang.String r0 = "callability"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x053d }
        L_0x011a:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x053d }
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x053d }
            java.lang.String r15 = r4.getString(r1)     // Catch:{ all -> 0x053d }
            r3.put(r14, r0)     // Catch:{ all -> 0x053d }
            java.lang.String r0 = "value"
            r3.put(r0, r15)     // Catch:{ all -> 0x053d }
            java.lang.String r0 = "wa_contact_capabilities"
            r12.insert(r0, r5, r3)     // Catch:{ all -> 0x053d }
            goto L_0x011a
        L_0x0138:
            r4.close()
        L_0x013b:
            r1 = 1
        L_0x013c:
            r12.beginTransaction()
            r0 = r25
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            r0 = r26
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            r0 = r27
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            r0 = r28
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = "CREATE TABLE wa_contacts (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, is_whatsapp_user BOOLEAN NOT NULL, status TEXT, status_timestamp INTEGER, number TEXT, raw_contact_id INTEGER, display_name TEXT, phone_type INTEGER, phone_label TEXT, unseen_msg_count INTEGER, photo_ts INTEGER, thumb_ts INTEGER, photo_id_timestamp INTEGER, given_name TEXT, family_name TEXT, wa_name TEXT, sort_name TEXT)"
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS is_wa_index ON wa_contacts (is_whatsapp_user);"
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS jid_index ON wa_contacts (jid);"
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = X.C34401kC.A01     // Catch:{ all -> 0x0545 }
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = "DROP TABLE old_wa_contacts"
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            r12.setTransactionSuccessful()     // Catch:{ all -> 0x0545 }
            r12.endTransaction()
            goto L_0x0174
        L_0x0173:
            r1 = 1
        L_0x0174:
            java.lang.String r0 = "creating system contacts version table for contacts database version 74"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS system_contacts_version_table"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE system_contacts_version_table (id INTEGER PRIMARY KEY, version INTEGER)"
            r12.execSQL(r0)
            goto L_0x0185
        L_0x0184:
            r1 = 1
        L_0x0185:
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD nickname TEXT"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD company TEXT"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD title TEXT"
            r12.execSQL(r0)
            goto L_0x0196
        L_0x0195:
            r1 = 1
        L_0x0196:
            java.lang.String r0 = "creating wa_vnames table for contacts database version 74"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_vnames"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_vnames (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, serial INTEGER NOT NULL, issuer TEXT NOT NULL, expires INTEGER, verified_name TEXT NOT NULL, industry TEXT, city TEXT, country TEXT)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS vname_jid_index ON wa_vnames (jid);"
            r12.execSQL(r0)
            java.lang.String r0 = "creating wa_vnames_localized table for contacts database version 74"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_vnames_localized"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_vnames_localized (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, lg TEXT NOT NULL, lc TEXT NOT NULL, verified_name TEXT NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS vname_localized_index ON wa_vnames_localized (jid, lg, lc);"
            r12.execSQL(r0)
            goto L_0x01c0
        L_0x01bf:
            r1 = 1
        L_0x01c0:
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD status_autodownload_disabled INTEGER"
            r12.execSQL(r0)
            goto L_0x01d1
        L_0x01c6:
            r1 = 1
            java.lang.String r2 = "status_autodownload_disabled"
            java.lang.String r0 = "INTEGER"
            X.C34411kD.A01(r12, r8, r2, r0)
            goto L_0x01d1
        L_0x01d0:
            r1 = 1
        L_0x01d1:
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD keep_timestamp INTEGER"
            r12.execSQL(r0)
            goto L_0x01d8
        L_0x01d7:
            r1 = 1
        L_0x01d8:
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD is_spam_reported INTEGER"
            r12.execSQL(r0)
            goto L_0x01df
        L_0x01de:
            r1 = 1
        L_0x01df:
            java.lang.String r0 = "ALTER TABLE wa_vnames ADD verified_level INTEGER"
            r12.execSQL(r0)
            goto L_0x01e6
        L_0x01e5:
            r1 = 1
        L_0x01e6:
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD description TEXT"
            r12.execSQL(r0)
            goto L_0x01ed
        L_0x01ec:
            r1 = 1
        L_0x01ed:
            java.lang.String r0 = "creating storage usage table for contacts database version 74"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_contact_storage_usage"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_contact_storage_usage (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, conversation_size INTEGER NOT NULL, conversation_message_count INTEGER NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS wa_contact_storage_usage_index ON wa_contact_storage_usage (jid, conversation_size DESC)"
            r12.execSQL(r0)
            goto L_0x0203
        L_0x0202:
            r1 = 1
        L_0x0203:
            java.lang.String r0 = "ALTER TABLE wa_vnames ADD identity_unconfirmed_since INTEGER"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_vnames ADD cert_blob BLOB"
            r12.execSQL(r0)
            r12.execSQL(r11)
            r12.execSQL(r13)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_biz_profiles"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_biz_profiles (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, email TEXT, address TEXT, business_description TEXT, tag TEXT)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS biz_profile_jid_index ON wa_biz_profiles (jid);"
            r12.execSQL(r0)
            r0 = r20
            r12.execSQL(r0)
            r0 = r21
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_websites_trigger"
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_biz_profiles_websites"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_biz_profiles_websites (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, websites TEXT)"
            r12.execSQL(r0)
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS biz_profile_id_website_index ON wa_biz_profiles_websites(wa_biz_profile_id, websites);"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER business_profiles_bd_for_websites_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_websites WHERE wa_biz_profile_id = old._id; END"
            r12.execSQL(r0)
            goto L_0x0247
        L_0x0246:
            r1 = 1
        L_0x0247:
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_group_descriptions"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_group_descriptions (jid TEXT NOT NULL, description TEXT NOT NULL, description_id INTEGER, description_time INTEGER, description_setter_jid TEXT NOT NULL)"
            r12.execSQL(r0)
            r12.beginTransaction()
            r0 = r25
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            r0 = r26
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            r0 = r27
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = "creating contacts table for contacts database version 74"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0545 }
            r0 = r28
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = "CREATE TABLE wa_contacts (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, is_whatsapp_user BOOLEAN NOT NULL, status TEXT, status_timestamp INTEGER, number TEXT, raw_contact_id INTEGER, display_name TEXT, phone_type INTEGER, phone_label TEXT, unseen_msg_count INTEGER, photo_ts INTEGER, thumb_ts INTEGER, photo_id_timestamp INTEGER, given_name TEXT, family_name TEXT, wa_name TEXT, sort_name TEXT, nickname TEXT, company TEXT, title TEXT, status_autodownload_disabled INTEGER, keep_timestamp INTEGER, is_spam_reported INTEGER)"
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS is_wa_index ON wa_contacts (is_whatsapp_user);"
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS jid_index ON wa_contacts (jid);"
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = X.C34401kC.A00     // Catch:{ all -> 0x0545 }
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = "DROP TABLE old_wa_contacts"
            r12.execSQL(r0)     // Catch:{ all -> 0x0545 }
            r12.setTransactionSuccessful()     // Catch:{ all -> 0x0545 }
            r12.endTransaction()
            goto L_0x028e
        L_0x028d:
            r1 = 1
        L_0x028e:
            java.lang.String r0 = "ALTER TABLE wa_group_descriptions ADD description_id_string TEXT NOT NULL DEFAULT ''"
            r12.execSQL(r0)
            java.lang.String r0 = "UPDATE wa_group_descriptions SET description_id_string = CAST( description_id as TEXT)"
            r12.execSQL(r0)
            java.lang.String r0 = "UPDATE wa_group_descriptions SET description_id = 0"
            r12.execSQL(r0)
            goto L_0x029f
        L_0x029e:
            r1 = 1
        L_0x029f:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD longitude REAL"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD latitude REAL"
            r12.execSQL(r0)
            goto L_0x02ab
        L_0x02aa:
            r1 = 1
        L_0x02ab:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD vertical TEXT"
            r12.execSQL(r0)
            goto L_0x02b2
        L_0x02b1:
            r1 = 1
        L_0x02b2:
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD is_sidelist_synced BOOLEAN DEFAULT 0"
            r12.execSQL(r0)
            goto L_0x02b9
        L_0x02b8:
            r1 = 1
        L_0x02b9:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD time_zone TEXT"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD hours_note TEXT"
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_hours_trigger"
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_biz_profiles_hours"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_biz_profiles_hours (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, day_of_week INTEGER,mode INTEGER,open_time INTEGER,close_time INTEGER)"
            r12.execSQL(r0)
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS biz_profile_id_hours_index ON wa_biz_profiles_hours(wa_biz_profile_id);"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER business_profiles_bd_for_hours_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_hours WHERE wa_biz_profile_id = old._id; END"
            r12.execSQL(r0)
            goto L_0x02de
        L_0x02dd:
            r1 = 1
        L_0x02de:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS group_admin_settings_deletion_trigger"
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_group_admin_settings"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_group_admin_settings (jid TEXT NOT NULL, restrict_mode BOOLEAN NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS group_admin_settings_jid_index ON wa_group_admin_settings (jid)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER group_admin_settings_deletion_trigger BEFORE DELETE ON wa_contacts BEGIN DELETE FROM wa_group_admin_settings WHERE jid = old.jid; END"
            r12.execSQL(r0)
            goto L_0x02f9
        L_0x02f8:
            r1 = 1
        L_0x02f9:
            java.lang.String r0 = "ALTER TABLE wa_group_admin_settings ADD announcement_group BOOLEAN NOT NULL DEFAULT 0"
            r12.execSQL(r0)
            goto L_0x0300
        L_0x02ff:
            r1 = 1
        L_0x0300:
            java.lang.String r0 = "is_business_synced"
            X.C34411kD.A01(r12, r8, r0, r9)
            goto L_0x0307
        L_0x0306:
            r1 = 1
        L_0x0307:
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_block_list"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_block_list (jid TEXT NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS block_list_jid_index ON wa_block_list (jid)"
            r12.execSQL(r0)
            goto L_0x0318
        L_0x0317:
            r1 = 1
        L_0x0318:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD has_catalog BOOLEAN DEFAULT 0"
            r12.execSQL(r0)
            goto L_0x031f
        L_0x031e:
            r1 = 1
        L_0x031f:
            java.lang.String r0 = "ALTER TABLE wa_group_admin_settings ADD no_frequently_forwarded BOOLEAN NOT NULL DEFAULT 0"
            r12.execSQL(r0)
            goto L_0x0326
        L_0x0325:
            r1 = 1
        L_0x0326:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_categories_trigger"
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_biz_profiles_categories"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_biz_profiles_categories (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, category_id TEXT NOT NULL,category_name TEXT NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS biz_profile_id_category_index ON wa_biz_profiles_categories(wa_biz_profile_id, category_id);"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER business_profiles_bd_for_categories_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_categories WHERE wa_biz_profile_id = old._id; END"
            r12.execSQL(r0)
            goto L_0x0341
        L_0x0340:
            r1 = 1
        L_0x0341:
            java.lang.String r0 = "ALTER TABLE wa_group_admin_settings ADD ephemeral_duration INTEGER DEFAULT NULL"
            r12.execSQL(r0)
            goto L_0x0348
        L_0x0347:
            r1 = 1
        L_0x0348:
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_group_add_black_list"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_group_add_black_list (jid TEXT NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS group_add_black_list_jid_index ON wa_group_add_black_list (jid)"
            r12.execSQL(r0)
            goto L_0x0359
        L_0x0358:
            r1 = 1
        L_0x0359:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD address_postal_code TEXT"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD address_city_id TEXT"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD address_city_name TEXT"
            r12.execSQL(r0)
            goto L_0x036a
        L_0x0369:
            r1 = 1
        L_0x036a:
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_props"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_props (_id INTEGER PRIMARY KEY AUTOINCREMENT, prop_name TEXT UNIQUE, prop_value TEXT)"
            r12.execSQL(r0)
            goto L_0x0376
        L_0x0375:
            r1 = 1
        L_0x0376:
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS wa_group_descriptions_jid_index ON wa_group_descriptions(jid)"
            r12.execSQL(r0)
            goto L_0x037d
        L_0x037c:
            r1 = 1
        L_0x037d:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD commerce_experience TEXT"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD shop_url TEXT"
            r12.execSQL(r0)
            goto L_0x0389
        L_0x0388:
            r1 = 1
        L_0x0389:
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_last_entry_point"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_last_entry_point (jid TEXT NOT NULL, entry_point_type TEXT NOT NULL, entry_point_id TEXT, entry_point_time INTEGER)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS entry_point_jid_index ON wa_last_entry_point (jid)"
            r12.execSQL(r0)
            goto L_0x039a
        L_0x0399:
            r1 = 1
        L_0x039a:
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_contact_capabilities"
            r12.execSQL(r0)
            goto L_0x03a1
        L_0x03a0:
            r1 = 1
        L_0x03a1:
            java.lang.String r0 = "ALTER TABLE wa_group_admin_settings ADD creator_jid TEXT"
            r12.execSQL(r0)
            goto L_0x03a8
        L_0x03a7:
            r1 = 1
        L_0x03a8:
            java.lang.String r0 = "ALTER TABLE wa_vnames ADD actual_actors INTEGER DEFAULT 0"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_vnames ADD host_storage INTEGER DEFAULT 0"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_vnames ADD privacy_mode_ts INTEGER DEFAULT 0"
            r12.execSQL(r0)
            goto L_0x03b9
        L_0x03b8:
            r1 = 1
        L_0x03b9:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD cart_enabled BOOLEAN DEFAULT 0"
            r12.execSQL(r0)
            goto L_0x03c0
        L_0x03bf:
            r1 = 1
        L_0x03c0:
            java.lang.String r0 = "ALTER TABLE wa_group_admin_settings ADD in_app_support BOOLEAN NOT NULL DEFAULT 0"
            r12.execSQL(r0)
            goto L_0x03c7
        L_0x03c6:
            r1 = 1
        L_0x03c7:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD commerce_manager_url TEXT"
            r12.execSQL(r0)
            goto L_0x03ce
        L_0x03cd:
            r1 = 1
        L_0x03ce:
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD disappearing_mode_duration INTEGER"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_contacts ADD disappearing_mode_timestamp LONG"
            r12.execSQL(r0)
            goto L_0x03da
        L_0x03d9:
            r1 = 1
        L_0x03da:
            java.lang.String r0 = "direct_connection_enabled"
            X.C34411kD.A01(r12, r7, r0, r9)
            goto L_0x03e1
        L_0x03e0:
            r1 = 1
        L_0x03e1:
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_last_seen_block_list"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_last_seen_block_list (jid TEXT NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_profile_photo_block_list"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_profile_photo_block_list (jid TEXT NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_about_block_list"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_about_block_list (jid TEXT NOT NULL)"
            r12.execSQL(r0)
            goto L_0x0401
        L_0x0400:
            r1 = 1
        L_0x0401:
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_trusted_contacts"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_trusted_contacts (jid TEXT PRIMARY KEY NOT NULL, incoming_tc_token BLOB NOT NULL, incoming_tc_token_timestamp LONG NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS incoming_tc_token_timestamp_index ON wa_trusted_contacts (incoming_tc_token_timestamp)"
            r12.execSQL(r0)
            goto L_0x0412
        L_0x0411:
            r1 = 1
        L_0x0412:
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_trusted_contacts_send"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_trusted_contacts_send (jid TEXT PRIMARY KEY NOT NULL, sent_tc_token_timestamp LONG NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS sent_tc_token_timestamp_index ON wa_trusted_contacts_send (sent_tc_token_timestamp)"
            r12.execSQL(r0)
            goto L_0x0423
        L_0x0422:
            r1 = 1
        L_0x0423:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD is_shop_banned BOOLEAN DEFAULT 0"
            r12.execSQL(r0)
            goto L_0x042a
        L_0x0429:
            r1 = 1
        L_0x042a:
            A00(r12)
            goto L_0x042f
        L_0x042e:
            r1 = 1
        L_0x042f:
            java.lang.String r2 = "is_suspended"
            r0 = r22
            X.C34411kD.A01(r12, r6, r2, r0)
            goto L_0x0438
        L_0x0437:
            r1 = 1
        L_0x0438:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_linked_accounts_trigger"
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_biz_profiles_linked_accounts_table"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_biz_profiles_linked_accounts_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, account_id TEXT NOT NULL,account_type INTEGER NOT NULL,account_display_name TEXT NOT NULL,account_fan_count INTEGER NOT NULL,account_has_media_post INTEGER NOT NULL DEFAULT 0)"
            r12.execSQL(r0)
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS wa_biz_profiles_linked_accounts_index ON wa_biz_profiles_linked_accounts_table(wa_biz_profile_id);"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER business_profiles_bd_for_linked_accounts_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_linked_accounts_table WHERE wa_biz_profile_id = old._id; END"
            r12.execSQL(r0)
            goto L_0x0453
        L_0x0452:
            r1 = 1
        L_0x0453:
            java.lang.String r3 = "subgroup_info"
            java.lang.String r2 = "group_type"
            java.lang.String r0 = "INTEGER NOT NULL DEFAULT 2"
            X.C34411kD.A01(r12, r3, r2, r0)
            goto L_0x045f
        L_0x045e:
            r1 = 1
        L_0x045f:
            java.lang.String r0 = "default_postcode"
            X.C34411kD.A01(r12, r7, r0, r10)
            java.lang.String r0 = "location_name"
            X.C34411kD.A01(r12, r7, r0, r10)
            goto L_0x046b
        L_0x046a:
            r1 = 1
        L_0x046b:
            java.lang.String r0 = "galaxy_business_enabled"
            X.C34411kD.A01(r12, r7, r0, r9)
            goto L_0x0472
        L_0x0471:
            r1 = 1
        L_0x0472:
            java.lang.String r0 = "DROP TABLE IF EXISTS group_membership_count"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE group_membership_count (jid_row_id INTEGER PRIMARY KEY, member_count INTEGER NOT NULL)"
            r12.execSQL(r0)
            goto L_0x047e
        L_0x047d:
            r1 = 1
        L_0x047e:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD cover_photo_url TEXT"
            r12.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD cover_photo_id TEXT"
            r12.execSQL(r0)
            goto L_0x048a
        L_0x0489:
            r1 = 1
        L_0x048a:
            java.lang.String r0 = "history_sync_initial_phash"
            X.C34411kD.A01(r12, r8, r0, r10)
            goto L_0x0491
        L_0x0490:
            r1 = 1
        L_0x0491:
            java.lang.String r2 = "require_membership_approval"
            r0 = r23
            X.C34411kD.A01(r12, r6, r2, r0)
            goto L_0x049a
        L_0x0499:
            r1 = 1
        L_0x049a:
            java.lang.String r0 = "DROP TABLE IF EXISTS dismissed_chat"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE dismissed_chat (chat_jid TEXT PRIMARY KEY, timestamp INTEGER NOT NULL)"
            r12.execSQL(r0)
            goto L_0x04a6
        L_0x04a5:
            r1 = 1
        L_0x04a6:
            java.lang.String r2 = "member_add_mode"
            r0 = r24
            X.C34411kD.A01(r12, r6, r2, r0)
            goto L_0x04af
        L_0x04ae:
            r1 = 1
        L_0x04af:
            java.lang.String r2 = "incognito"
            r0 = r22
            X.C34411kD.A01(r12, r6, r2, r0)
            goto L_0x04b8
        L_0x04b7:
            r1 = 1
        L_0x04b8:
            java.lang.String r2 = "group_state"
            r0 = r24
            X.C34411kD.A01(r12, r6, r2, r0)
            goto L_0x04c1
        L_0x04c0:
            r1 = 1
        L_0x04c1:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS business_profiles_bd_for_service_areas_trigger"
            r12.execSQL(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS wa_biz_profiles_service_areas"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE wa_biz_profiles_service_areas (_id INTEGER PRIMARY KEY AUTOINCREMENT, wa_biz_profile_id INTEGER NOT NULL, area_description TEXT,radius INTEGER NOT NULL,center_latitude REAL NOT NULL,center_longitude REAL NOT NULL)"
            r12.execSQL(r0)
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS biz_profile_id_service_area_index ON wa_biz_profiles_service_areas(wa_biz_profile_id);"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER business_profiles_bd_for_service_areas_trigger BEFORE DELETE ON wa_biz_profiles BEGIN DELETE FROM wa_biz_profiles_service_areas WHERE wa_biz_profile_id = old._id; END"
            r12.execSQL(r0)
            goto L_0x04dc
        L_0x04db:
            r1 = 1
        L_0x04dc:
            java.lang.String r0 = "DROP TABLE IF EXISTS group_membership_approval_requests"
            r12.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE group_membership_approval_requests (group_jid TEXT NOT NULL, requester_jid TEXT NOT NULL, request_method TEXT NOT NULL, request_creation_time INTEGER, PRIMARY KEY (group_jid,requester_jid))"
            r12.execSQL(r0)
            java.lang.String r0 = " CREATE INDEX IF NOT EXISTS request_creation_time_index ON group_membership_approval_requests(request_creation_time);"
            r12.execSQL(r0)
            goto L_0x04ed
        L_0x04ec:
            r1 = 1
        L_0x04ed:
            java.lang.String r2 = "is_pending_requests_banner_acknowledged"
            r0 = r23
            X.C34411kD.A01(r12, r6, r2, r0)
            goto L_0x04f6
        L_0x04f5:
            r1 = 1
        L_0x04f6:
            r12.execSQL(r13)
            r12.execSQL(r11)
            r0 = r20
            r12.execSQL(r0)
            r0 = r21
            r12.execSQL(r0)
            goto L_0x0508
        L_0x0507:
            r1 = 1
        L_0x0508:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD custom_url TEXT"
            r12.execSQL(r0)
            goto L_0x050f
        L_0x050e:
            r1 = 1
        L_0x050f:
            java.lang.String r3 = "wa_biz_profiles_linked_accounts_table"
            java.lang.String r2 = "account_has_media_post"
            java.lang.String r0 = "INT NOT NULL DEFAULT 0"
            X.C34411kD.A01(r12, r3, r2, r0)
            goto L_0x051b
        L_0x051a:
            r1 = 1
        L_0x051b:
            java.lang.String r0 = "ALTER TABLE wa_biz_profiles ADD member_since TEXT"
            r12.execSQL(r0)
            r2 = 19
            r0 = r37
            if (r0 < r2) goto L_0x005f
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>(r1)
            java.lang.String r1 = "tag"
            r0 = 0
            r2.put(r1, r0)
            r12.update(r7, r2, r0, r0)
            return
        L_0x0536:
            r0 = move-exception
            if (r14 == 0) goto L_0x0544
            r14.close()     // Catch:{ all -> 0x0544 }
            goto L_0x0544
        L_0x053d:
            r0 = move-exception
            if (r4 == 0) goto L_0x0544
            r4.close()     // Catch:{ all -> 0x0544 }
            throw r0
        L_0x0544:
            throw r0
        L_0x0545:
            r0 = move-exception
            r12.endTransaction()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11X.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
