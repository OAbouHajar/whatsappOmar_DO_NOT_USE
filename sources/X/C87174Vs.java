package X;

import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4Vs  reason: invalid class name and case insensitive filesystem */
public final class C87174Vs {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();
    public final /* synthetic */ VoipPhysicalCamera A01;

    public C87174Vs(VoipPhysicalCamera voipPhysicalCamera) {
        this.A01 = voipPhysicalCamera;
    }

    public void A00() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C26821Pi) it.next()).AOi(this.A01);
        }
    }

    public void A01() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C26821Pi) it.next()).AQl(this.A01);
        }
    }

    public void A02() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((C26821Pi) it.next()).AZM(this.A01);
        }
    }
}
