package X;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.obwhatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver;
import com.whatsapp.util.Log;

/* renamed from: X.0yl  reason: invalid class name and case insensitive filesystem */
public class C19640yl {
    public final C16980tz A00;
    public final C15860rz A01;
    public final C16900tq A02;
    public final AnonymousClass14X A03;
    public final C16320sq A04;

    public C19640yl(C16980tz r1, C15860rz r2, C16900tq r3, AnonymousClass14X r4, C16320sq r5) {
        this.A00 = r1;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A00() {
        String string = ((SharedPreferences) this.A01.A01.get()).getString("registration_sibling_app_country_code", (String) null);
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled/sibling-country-code = ");
        sb.append(string);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb2.append(false);
        Log.i(sb2.toString());
        StringBuilder sb3 = new StringBuilder("InterAppCommunicationManager/migrateFromConsumerAppFlowEnabled = ");
        sb3.append(false);
        Log.i(sb3.toString());
    }

    public void A01() {
        Bundle bundle = new Bundle();
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/smbIsCapableOfMigratingFromConsumer=");
        sb.append(false);
        Log.i(sb.toString());
        bundle.putBoolean("database_migration_is_enabled_on_requester_side", false);
        Log.i("InterAppCommunicationManager/sendInitialMigrationInfoNeededBroadcast/sendInitialMigrationInfoNeededBroadcast");
        A03("com.obwhatsapp.registration.directmigration.initialMigrationInfoAction", bundle);
    }

    public void A02() {
        Bundle bundle = new Bundle();
        bundle.putInt("migration_state_on_provider_side", 2);
        Log.i("InterAppCommunicationManager/setDirectMigrationStateOnProviderSide");
        A03("com.obwhatsapp.registration.directmigration.setMigrationStateOnProviderSide", bundle);
    }

    public final void A03(String str, Bundle bundle) {
        StringBuilder sb = new StringBuilder("InterAppCommunicationManager/sendRequesterToProviderOrderedBroadcast/action = ");
        sb.append(str);
        Log.i(sb.toString());
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.obwhatsapp.w4b", MigrationProviderOrderedBroadcastReceiver.class.getName()));
        intent.setAction(str);
        intent.addFlags(32);
        new RunnableRunnableShape2S0300000_I0_2(this, intent, bundle, 9).run();
    }
}
