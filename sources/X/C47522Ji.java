package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Ji  reason: invalid class name and case insensitive filesystem */
public class C47522Ji implements AnonymousClass1WE {
    public int A00 = 0;
    public boolean A01 = false;
    public final /* synthetic */ C43241zg A02;
    public final /* synthetic */ AnonymousClass1HE A03;
    public final /* synthetic */ AnonymousClass1XP A04;
    public final /* synthetic */ AnonymousClass1XK A05;

    public C47522Ji(C43241zg r2, AnonymousClass1HE r3, AnonymousClass1XP r4, AnonymousClass1XK r5) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r2;
        this.A05 = r5;
    }

    public /* bridge */ /* synthetic */ void accept(Object obj) {
        String str = (String) obj;
        this.A00++;
        AnonymousClass1HE r6 = this.A03;
        C27411Rq r0 = r6.A0J;
        AnonymousClass1XP r2 = this.A04;
        C31681er r3 = (C31681er) r0.A00(r2);
        List unmodifiableList = Collections.unmodifiableList(this.A02.A01);
        C15830rv r7 = null;
        if (unmodifiableList.size() == 1) {
            C15830rv r1 = ((C16740tZ) unmodifiableList.get(0)).A11.A00;
            if (C16030sJ.A0O(r1)) {
                r7 = r1;
            }
        }
        if (r3 != null && str != null && str.contains("express") && r6.A0B.A0E(C16620tM.A01, 1539)) {
            AnonymousClass1XK r12 = this.A05;
            if (r7 == null) {
                return;
            }
            if ((r12 == AnonymousClass1XK.A08 || r12 == AnonymousClass1XK.A0B || r12 == AnonymousClass1XK.A0X) && !this.A01) {
                C31761ez r02 = r3.A0W;
                String A052 = r02.A05();
                String A042 = r02.A04();
                long j2 = r2.A00().A02;
                if (A052 == null || A042 == null || j2 <= 0) {
                    Log.e("sendmediamessagemanager/whenhttpconnected could not send medianotify since some params are invalid");
                } else {
                    C39201s5 r13 = new C39201s5(r6.A0N.A05.A02(r7, true), r6.A05.A00());
                    r13.A03 = str;
                    r13.A02 = A052;
                    r13.A01 = A042;
                    r13.A00 = j2;
                    r6.A06.A0W(r13);
                }
                this.A01 = true;
            }
        }
    }
}
