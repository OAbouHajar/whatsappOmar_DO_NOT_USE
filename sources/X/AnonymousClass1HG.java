package X;

import com.obwhatsapp.jobqueue.job.GenerateTcTokenJob;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1HG  reason: invalid class name */
public class AnonymousClass1HG {
    public Set A00;
    public final C19000xb A01;
    public final AnonymousClass12G A02;
    public final C16440t3 A03;
    public final C14710pd A04;

    public AnonymousClass1HG(C19000xb r1, AnonymousClass12G r2, C16440t3 r3, C14710pd r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r1;
        this.A02 = r2;
    }

    public void A00(UserJid userJid) {
        int i2;
        if (A02(userJid)) {
            Long A032 = this.A02.A03(userJid);
            if (A032 != null) {
                long longValue = A032.longValue();
                long A033 = (long) this.A04.A03(C16620tM.A02, 996);
                if (A033 <= 0) {
                    StringBuilder sb = new StringBuilder("Bad bucket configuration, bucketLengthSec = ");
                    sb.append(A033);
                    Log.e(sb.toString());
                    i2 = (longValue > ((this.A03.A01() / 1000) - AnonymousClass12G.A04) ? 1 : (longValue == ((this.A03.A01() / 1000) - AnonymousClass12G.A04) ? 0 : -1));
                } else {
                    i2 = ((longValue / A033) > ((this.A03.A01() / 1000) / A033) ? 1 : ((longValue / A033) == ((this.A03.A01() / 1000) / A033) ? 0 : -1));
                }
                if (i2 >= 0) {
                    A01(userJid);
                    return;
                }
            }
            this.A01.A00(new GenerateTcTokenJob(userJid, Long.valueOf(this.A03.A01() / 1000)));
        }
    }

    public void A01(UserJid userJid) {
        Set set;
        synchronized (this) {
            set = this.A00;
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet());
                this.A00 = set;
            }
        }
        synchronized (set) {
            set.remove(userJid);
        }
    }

    public boolean A02(UserJid userJid) {
        Set set;
        synchronized (this) {
            set = this.A00;
            if (set == null) {
                set = Collections.synchronizedSet(new HashSet());
                this.A00 = set;
            }
        }
        synchronized (set) {
            if (set.contains(userJid)) {
                return false;
            }
            set.add(userJid);
            return true;
        }
    }
}
