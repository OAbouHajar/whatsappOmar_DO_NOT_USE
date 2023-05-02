package X;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: X.2uw  reason: invalid class name and case insensitive filesystem */
public class C59152uw extends AnonymousClass2S7 {
    public final /* synthetic */ C18900xR A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59152uw(Activity activity, C18900xR r8, AnonymousClass01V r9, C16440t3 r10, AnonymousClass013 r11) {
        super(activity, r9, r10, r11, R.layout.layout0107);
        this.A00 = r8;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Date date = new Date();
        Log.w(AnonymousClass000.A0h(date.toString(), AnonymousClass000.A0r("conversations/clock-wrong-time ")));
        Date date2 = this.A00.A00;
        long time = date2 != null ? date2.getTime() : date.getTime();
        Activity activity = this.A01;
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass013 r3 = this.A04;
        A1Z[0] = C42681yF.A05(r3, C28891Zc.A05(r3, time), C47672Jx.A00(r3, time));
        ((TextView) findViewById(R.id.clock_wrong_date)).setText(C13680ns.A0d(activity, TimeZone.getDefault().getDisplayName(C13690nt.A0m(r3)), A1Z, 1, R.string.str0470));
        C13680ns.A1A(findViewById(R.id.close), this, 8);
    }
}
