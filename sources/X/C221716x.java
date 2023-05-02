package X;

import com.obwhatsapp.data.ConversationDeleteWorker;
import java.util.Map;

/* renamed from: X.16x  reason: invalid class name and case insensitive filesystem */
public class C221716x {
    public final C15810rt A00;
    public final C221616w A01;
    public final AnonymousClass12P A02;

    public C221716x(C15810rt r1, C221616w r2, AnonymousClass12P r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public void A00(C42561y1 r8, String str) {
        C006903e r3 = new C006903e(ConversationDeleteWorker.class);
        C007103g r6 = new C007103g();
        Map map = r6.A00;
        map.put("delete_action", str);
        map.put("job_id", Long.valueOf(r8.A06));
        r3.A00.A0B = r6.A00();
        r3.A03.add(String.valueOf(r8.A07.hashCode()));
        C007403j r2 = C007403j.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        C007303i r1 = r3.A00;
        r1.A0H = true;
        r1.A0D = r2;
        ((AnonymousClass022) this.A02.get()).A07(r3.A00());
    }
}
