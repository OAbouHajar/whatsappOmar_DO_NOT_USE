package X;

import android.content.SharedPreferences;

/* renamed from: X.1OV  reason: invalid class name */
public class AnonymousClass1OV implements C23541Cj {
    public final C15860rz A00;
    public final C16490t9 A01;

    public AnonymousClass1OV(C15860rz r1, C16490t9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void APJ() {
        C75963t0 r30 = new C75963t0();
        C15860rz r0 = this.A00;
        C15860rz r32 = r0;
        AnonymousClass01D r31 = r0.A01;
        r30.A00 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_cancel_broadcast", 0));
        r30.A01 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_cancel_group", 0));
        r30.A02 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_cancel_individual", 0));
        r30.A03 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_draft_review_broadcast", 0));
        r30.A04 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_draft_review_group", 0));
        r30.A05 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_draft_review_individual", 0));
        r30.A06 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_fast_playback_broadcast", 0));
        r30.A07 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_fast_playback_group", 0));
        r30.A08 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_fast_playback_individual", 0));
        r30.A09 = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_lock_broadcast", 0));
        r30.A0A = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_lock_group", 0));
        r30.A0B = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_lock_individual", 0));
        r30.A0I = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_playback_broadcast", 0));
        r30.A0J = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_playback_group", 0));
        r30.A0K = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_playback_individual", 0));
        r30.A0L = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_record_broadcast", 0));
        r30.A0M = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_record_group", 0));
        r30.A0N = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_record_individual", 0));
        r30.A0O = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_send_broadcast", 0));
        r30.A0P = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_send_group", 0));
        r30.A0Q = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_send_individual", 0));
        r30.A0F = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_pause_tap_broadcast", 0));
        r30.A0G = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_pause_tap_group", 0));
        r30.A0H = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_pause_tap_individual", 0));
        r30.A0E = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_out_of_chat_individual", 0));
        r30.A0C = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_out_of_chat_broadcast", 0));
        r30.A0D = Long.valueOf(((SharedPreferences) r31.get()).getLong("ptt_out_of_chat_group", 0));
        this.A01.A04(r30);
        r32.A0K().remove("ptt_cancel_broadcast").apply();
        r32.A0K().remove("ptt_cancel_group").apply();
        r32.A0K().remove("ptt_cancel_individual").apply();
        r32.A0K().remove("ptt_draft_review_broadcast").apply();
        r32.A0K().remove("ptt_draft_review_group").apply();
        r32.A0K().remove("ptt_draft_review_individual").apply();
        r32.A0K().remove("ptt_playback_broadcast").apply();
        r32.A0K().remove("ptt_playback_group").apply();
        r32.A0K().remove("ptt_playback_individual").apply();
        r32.A0K().remove("ptt_lock_broadcast").apply();
        r32.A0K().remove("ptt_lock_group").apply();
        r32.A0K().remove("ptt_lock_individual").apply();
        r32.A0K().remove("ptt_fast_playback_broadcast").apply();
        r32.A0K().remove("ptt_fast_playback_group").apply();
        r32.A0K().remove("ptt_fast_playback_individual").apply();
        r32.A0K().remove("ptt_record_broadcast").apply();
        r32.A0K().remove("ptt_record_group").apply();
        r32.A0K().remove("ptt_record_individual").apply();
        r32.A0K().remove("ptt_send_broadcast").apply();
        r32.A0K().remove("ptt_send_group").apply();
        r32.A0K().remove("ptt_send_individual").apply();
        r32.A0K().remove("ptt_pause_tap_broadcast").apply();
        r32.A0K().remove("ptt_pause_tap_group").apply();
        r32.A0K().remove("ptt_pause_tap_individual").apply();
        r32.A0K().remove("ptt_out_of_chat_individual").apply();
        r32.A0K().remove("ptt_out_of_chat_broadcast").apply();
        r32.A0K().remove("ptt_out_of_chat_group").apply();
    }

    public /* synthetic */ void APK() {
    }
}
