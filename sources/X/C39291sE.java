package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1sE  reason: invalid class name and case insensitive filesystem */
public class C39291sE extends AnonymousClass1WU {
    public int A00;
    public List A01 = new ArrayList();
    public final C30361cE A02;
    public transient long A03;
    public final transient C30641ci A04;

    public C39291sE(C28381Vw r2, C30641ci r3, int i2, long j2) {
        super(r2, i2, j2);
        this.A04 = r3;
        this.A02 = null;
    }

    public C39291sE(C30361cE r5, C30641ci r6, int i2, long j2) {
        super(new C28381Vw(C16030sJ.A00(r6.A01), r6.A07, true), i2, j2);
        this.A02 = r5;
        A0W(6);
        this.A04 = r6;
    }

    public void A13(Object obj) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.size() > 0 && (list.get(0) instanceof String)) {
                this.A01 = C16030sJ.A08(UserJid.class, list);
            }
        }
    }
}
