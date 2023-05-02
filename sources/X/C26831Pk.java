package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Pk  reason: invalid class name and case insensitive filesystem */
public class C26831Pk {
    public final C16440t3 A00;
    public final C17020u3 A01;

    public C26831Pk(C16440t3 r1, C17020u3 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public long A00() {
        long j2 = this.A01.A00("AccountDefenceLocalDataRepository_prefs").getLong("com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_sms_wait_time", 0);
        StringBuilder sb = new StringBuilder("AccountDefenceLocalDataRepository/get-original-sms-wait-time-diff ");
        sb.append(j2);
        Log.i(sb.toString());
        return j2;
    }

    public long A01() {
        long j2 = this.A01.A00("AccountDefenceLocalDataRepository_prefs").getLong("com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.account_defence_original_voice_wait_time", 0);
        StringBuilder sb = new StringBuilder("AccountDefenceLocalDataRepository/get-original-voice-wait-time-diff ");
        sb.append(j2);
        Log.i(sb.toString());
        return j2;
    }

    public long A02() {
        Log.i("AccountDefenceLocalDataRepository/getRetryTimeForResendingNotice");
        long j2 = this.A01.A00("AccountDefenceLocalDataRepository_prefs").getLong("com.obwhatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice", -1);
        StringBuilder sb = new StringBuilder("AccountDefenceLocalDataRepository/getRetryTimeForResendingNotice/result ");
        sb.append(j2);
        sb.append(" cur_time=");
        sb.append(System.currentTimeMillis());
        Log.i(sb.toString());
        return j2;
    }
}
