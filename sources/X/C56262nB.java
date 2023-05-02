package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2nB  reason: invalid class name and case insensitive filesystem */
public class C56262nB extends BroadcastReceiver {
    public C16440t3 A00;
    public C15860rz A01;
    public AnonymousClass10J A02;
    public C14710pd A03;
    public C27851Tj A04;
    public final Object A05 = C13690nt.A0Y();
    public volatile boolean A06 = false;

    public void onReceive(Context context, Intent intent) {
        Context context2 = context;
        if (!this.A06) {
            synchronized (this.A05) {
                if (!this.A06) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A00 = C16150sX.A0U(A002);
                    this.A03 = C16150sX.A0k(A002);
                    this.A02 = (AnonymousClass10J) A002.A02.get();
                    this.A01 = C16150sX.A0Y(A002);
                    this.A04 = (C27851Tj) A002.A6u.get();
                    this.A06 = true;
                }
            }
        }
        Log.i("ProcessProviderMigrationInfo/on-receive");
        Bundle resultExtras = getResultExtras(true);
        if (getResultCode() == -1 && resultExtras != null && intent != null) {
            boolean z2 = false;
            if ("com.obwhatsapp.registration.directmigration.initialMigrationInfoAction".equals(intent.getAction())) {
                Log.i("ProcessProviderMigrationInfo/received-phone-number");
                C15860rz r1 = this.A01;
                C13680ns.A0y(r1.A0K(), "registration_sibling_app_country_code", resultExtras.getString("me_country_code", (String) null));
                C15860rz r12 = this.A01;
                C13680ns.A0y(r12.A0K(), "registration_sibling_app_phone_number", resultExtras.getString("phone_number", (String) null));
                C13680ns.A1S(this.A01, "direct_db_migration_timeout_in_secs", resultExtras.getInt("direct_db_migration_timeout_in_secs", 180));
                boolean z3 = resultExtras.getBoolean("sister_app_content_provider_enabled", false);
                C13680ns.A0z(this.A01.A0K(), "sister_app_content_provider_is_enabled", z3);
                StringBuilder A0r = AnonymousClass000.A0r("ProcessProviderMigrationInfo/sister-app-content-provider-is-enabled = ");
                A0r.append(z3);
                C13680ns.A1V(A0r);
            } else if ("com.obwhatsapp.registration.directmigration.recoveryTokenAction".equals(intent.getAction())) {
                Log.i("ProcessProviderMigrationInfo/received-token");
                String string = C13680ns.A0B(this.A01).getString("registration_sibling_app_country_code", (String) null);
                String string2 = C13680ns.A0B(this.A01).getString("registration_sibling_app_phone_number", (String) null);
                String A003 = AnonymousClass293.A00(AnonymousClass000.A0h(string2, AnonymousClass000.A0q(string)));
                byte[] byteArray = resultExtras.getByteArray("key_recovery_token");
                if (!TextUtils.isEmpty(A003) && byteArray != null) {
                    C004101u.A0B(context, A003, byteArray);
                    z2 = true;
                }
                byte[] byteArray2 = resultExtras.getByteArray("key_backup_token");
                if (!TextUtils.isEmpty(string2) && byteArray2 != null) {
                    try {
                        C16440t3 r8 = this.A00;
                        C14710pd r11 = this.A03;
                        AnonymousClass2FR.A01(context2, r8, this.A01, this.A02, r11, string2, byteArray2);
                    } catch (IOException e2) {
                        Log.e("ProcessProviderMigrationInfo/encryptAndSaveToken failed with IOException:", e2);
                    }
                } else if (!z2) {
                    return;
                }
                this.A04.A01.A00 = true;
            }
        }
    }
}
