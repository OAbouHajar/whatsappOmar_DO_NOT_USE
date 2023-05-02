package X;

import com.facebook.redex.RunnableRunnableShape9S0100000_I0_8;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.json.JSONException;

/* renamed from: X.2OL  reason: invalid class name */
public final class AnonymousClass2OL extends C16690tT {
    public Thread A00;
    public final /* synthetic */ C16650tP A01;

    public AnonymousClass2OL(C16650tP r1) {
        this.A01 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2;
        AnonymousClass1ZS r0 = new AnonymousClass1ZS(new RunnableRunnableShape9S0100000_I0_8(this, 22), "MAIN_CHECK");
        this.A00 = r0;
        r0.start();
        C84384Ki r3 = new C84384Ki();
        try {
            C16650tP r7 = this.A01;
            C25551Kf r6 = r7.A05;
            boolean z2 = r7 instanceof AnonymousClass32K;
            int i3 = z2 ? 20 : 19;
            C16650tP.A00(r7, r3, r6.A00(r7, r7.A01(), AnonymousClass021.A0I, z2 ? AnonymousClass021.A06 : AnonymousClass021.A07, r7.A03(), i3, z2 ? 33 : 19));
            if (this.A00.isAlive()) {
                this.A00.interrupt();
                return r3;
            }
        } catch (JSONException e2) {
            this.A01.A02.AcB("TimeoutTask/doInBackground: Error while generating or parsing the JSON: ", e2.getMessage(), true);
            Log.e("TimeoutTask/doInBackground: Error while generating or parsing the JSON", e2);
            i2 = 2;
            r3.A00 = i2;
        } catch (IOException e3) {
            if (!this.A02.isCancelled()) {
                Log.e("TimeoutTask/doInBackground failed", e3);
                r3.A00 = 1;
                return r3;
            }
        } catch (Exception e4) {
            this.A01.A02.AcB("TimeoutTask/doInBackground: Error while generating or parsing the JSON: ", e4.getMessage(), true);
            Log.e("TimeoutTask/doInBackground: generic error - ", e4);
            i2 = 3;
            r3.A00 = i2;
        }
        return r3;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C84384Ki r2 = (C84384Ki) obj;
        if (!this.A02.isCancelled()) {
            this.A01.A07(r2);
        }
    }
}
