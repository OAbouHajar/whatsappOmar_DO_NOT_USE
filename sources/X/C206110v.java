package X;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.whatsapp.util.Log;
import java.util.concurrent.ExecutionException;

/* renamed from: X.10v  reason: invalid class name and case insensitive filesystem */
public class C206110v extends AbstractThreadedSyncAdapter {
    public final C16300so A00;
    public final C16040sK A01;
    public final C19600yh A02;

    public C206110v(C16300so r3, C16040sK r4, C19600yh r5, C16980tz r6) {
        super(r6.A00, true);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (!this.A01.A0G()) {
            C452927v r1 = new C452927v(C34861kz.A02);
            r1.A03 = true;
            r1.A04 = true;
            r1.A00 = C453027w.A09;
            C452727t A012 = r1.A01();
            AnonymousClass28Q r4 = new AnonymousClass28Q(true);
            A012.A03.add(r4);
            C19600yh r3 = this.A02;
            r3.A0R.execute(new RunnableRunnableShape5S0200000_I0_3(r3, 4, A012));
            try {
                r4.get();
            } catch (InterruptedException unused) {
            } catch (ExecutionException e2) {
                AnonymousClass00B.A0E(e2);
                Log.e("ContactsSyncAdapterService/onCreate", e2);
                this.A00.AcB("ContactsSyncAdapterService/onCreate", e2.getMessage(), true);
            }
        }
    }
}
