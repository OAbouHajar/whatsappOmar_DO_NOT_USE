package X;

import android.content.SharedPreferences;

/* renamed from: X.1OX  reason: invalid class name */
public final class AnonymousClass1OX implements C23541Cj {
    public final C15900s5 A00;

    public AnonymousClass1OX(C15900s5 r2) {
        C18450wi.A0H(r2, 1);
        this.A00 = r2;
    }

    public void APJ() {
        SharedPreferences.Editor edit = this.A00.A00.edit();
        edit.remove("local_backup_in_service");
        edit.remove("abprops_config_codes_enabled");
        edit.remove("broadcast_noncontacts");
        edit.remove("multi_share_file_preview");
        edit.remove("storage_migration_enabled");
        edit.remove("community_nux");
        edit.remove("about_community_nux");
        edit.remove("privatestats_upload_jitter_secs");
        edit.remove("group_call_callee_ring_duration");
        edit.remove("group_call_max_participants");
        edit.remove("linked_devices_ui_enabled");
        edit.remove("linked_devices_title_enabled");
        edit.apply();
    }

    public /* synthetic */ void APK() {
    }
}
