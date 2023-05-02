package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1OW  reason: invalid class name */
public class AnonymousClass1OW implements C23541Cj {
    public final C16040sK A00;
    public final C16440t3 A01;
    public final C16980tz A02;
    public final C15860rz A03;
    public final AnonymousClass013 A04;
    public final AnonymousClass10J A05;
    public final C14710pd A06;
    public final C17190ug A07;
    public final C15960sC A08;
    public final C16320sq A09;

    public AnonymousClass1OW(C16040sK r1, C16440t3 r2, C16980tz r3, C15860rz r4, AnonymousClass013 r5, AnonymousClass10J r6, C14710pd r7, C17190ug r8, C15960sC r9, C16320sq r10) {
        this.A01 = r2;
        this.A06 = r7;
        this.A00 = r1;
        this.A02 = r3;
        this.A09 = r10;
        this.A07 = r8;
        this.A04 = r5;
        this.A05 = r6;
        this.A03 = r4;
        this.A08 = r9;
    }

    public void APJ() {
        if (this.A08.A01()) {
            C16980tz r9 = this.A02;
            Context context = r9.A00;
            C16440t3 r8 = this.A01;
            C16040sK r0 = this.A00;
            C15860rz r10 = this.A03;
            if (!r0.A0G()) {
                long A002 = r8.A00();
                long A0J = r10.A0J("backup_token_file_timestamp");
                StringBuilder sb = new StringBuilder("BackupTokenUtils/shouldUpdateBackupToken/current time is ");
                sb.append(A002);
                sb.append(", token last update time is ");
                sb.append(r10.A0J("backup_token_file_timestamp"));
                Log.i(sb.toString());
                if (!new File(context.getFilesDir(), "backup_token").exists() || A002 - A0J > TimeUnit.DAYS.toMillis(14)) {
                    Log.i("RegistrationDailyCron/shouldUpdateBackupToken");
                    C14710pd r12 = this.A06;
                    C16320sq r14 = this.A09;
                    new C46602Fc(r8, r9, r10, this.A05, r12, this.A07, r14).A00();
                }
            }
        }
        AnonymousClass013 r4 = this.A04;
        C16290sm r3 = r4.A08;
        String string = r3.A00.getString("forced_language", (String) null);
        if (!TextUtils.isEmpty(string) && AnonymousClass1WH.A05(r4.A05).equals(string)) {
            r3.A00();
        }
    }

    public /* synthetic */ void APK() {
    }
}
