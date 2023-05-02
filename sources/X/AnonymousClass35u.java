package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.obwhatsapp.registration.directmigration.MigrationRequesterBroadcastReceiver;
import com.whatsapp.util.Log;
import java.io.Serializable;

/* renamed from: X.35u  reason: invalid class name */
public class AnonymousClass35u extends C16690tT {
    public final C19640yl A00;

    public AnonymousClass35u(C19640yl r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C19640yl r3 = this.A00;
        C16900tq r0 = r3.A02;
        r0.A04();
        long length = r0.A06.length();
        AnonymousClass14X r2 = r3.A03;
        C28921Zf r6 = new C28921Zf(false);
        long A002 = AnonymousClass1XI.A00((AnonymousClass024) null, r2.A00.A00.A0B()) + 0 + r2.A01.A00.getDatabasePath("stickers.db").length();
        StringBuilder A0r = AnonymousClass000.A0r("StickerDBStorage/getStickerFilesSize: took = ");
        A0r.append(r6.A01());
        A0r.append(" ms for total file size of = ");
        A0r.append(A002);
        C13680ns.A1V(A0r);
        Context context = r3.A00.A00;
        return C13690nt.A0I(Long.valueOf(((A002 + length) * 3) + C13700nu.A0C(context.getFilesDir(), "wallpaper.jpg").length() + context.getDatabasePath("chatsettings.db").length() + 10000000), Long.valueOf(length));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        C19640yl r4 = this.A00;
        Log.i(C13680ns.A0h("InterAppCommunicationManager/sendProviderToRequesterBroadcast/action = ", "com.obwhatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction"));
        Intent A09 = C13680ns.A09();
        A09.setComponent(new ComponentName("com.obwhatsapp.w4b", MigrationRequesterBroadcastReceiver.class.getName()));
        A09.addFlags(32);
        A09.setAction("com.obwhatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction");
        if ("com.obwhatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction".equals("com.obwhatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction") && pair != null) {
            A09.putExtra("extra_min_storage_needed", (Serializable) pair.first);
            A09.putExtra("extra_msg_db_size", (Serializable) pair.second);
        }
        r4.A00.A00.sendBroadcast(A09, "com.obwhatsapp.permission.REGISTRATION");
    }
}
