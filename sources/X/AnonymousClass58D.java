package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: X.58D  reason: invalid class name */
public abstract class AnonymousClass58D implements Callable {
    public final AnonymousClass024 A00 = new AnonymousClass024();

    public void A00() {
        this.A00.A01();
    }

    public Object A01() {
        if (this instanceof C73933pM) {
            StatusesViewModel statusesViewModel = ((C73933pM) this).A00;
            AnonymousClass11G r0 = statusesViewModel.A09;
            r0.A0B();
            Map unmodifiableMap = Collections.unmodifiableMap(r0.A08);
            if (!statusesViewModel.A0H.compareAndSet(false, true)) {
                return unmodifiableMap;
            }
            Map map = (Map) statusesViewModel.A05.A01();
            Set<UserJid> A0o = map == null ? C13680ns.A0o() : map.keySet();
            Set set = statusesViewModel.A0G;
            synchronized (set) {
                for (UserJid userJid : A0o) {
                    if (!unmodifiableMap.containsKey(userJid)) {
                        set.add(userJid);
                    }
                }
                set.addAll(unmodifiableMap.keySet());
            }
            return unmodifiableMap;
        } else if (this instanceof C73963pP) {
            C73963pP r8 = (C73963pP) this;
            Context context = r8.A01;
            AnonymousClass3AC A002 = AnonymousClass3AC.A00(context, r8.A04, r8.A06, r8.A00, false);
            AnonymousClass024 r6 = r8.A00;
            r6.A02();
            String str = A002.A02;
            CharSequence string = str == null ? context.getString(R.string.str19e3) : AnonymousClass2TP.A02(context, r8.A03, AnonymousClass2Sy.A03(context, r8.A02.getPaint(), r8.A05, str), r8.A07);
            r6.A02();
            String str2 = A002.A04;
            List list = r8.A07;
            AnonymousClass013 r1 = r8.A03;
            CharSequence A02 = AnonymousClass2TP.A02(context, r1, str2, list);
            CharSequence A022 = AnonymousClass2TP.A02(context, r1, A002.A03, list);
            r6.A02();
            return new AnonymousClass4MG(A002, A02, A022, string);
        } else if (this instanceof C73953pO) {
            C73953pO r4 = (C73953pO) this;
            C16000sG r12 = r4.A01;
            C16740tZ r3 = r4.A02;
            C15830rv r02 = r3.A11.A00;
            AnonymousClass00B.A06(r02);
            C16010sH A0A = r12.A0A(r02);
            r4.A00.A02();
            C15830rv A003 = C61963Bc.A00(r4.A00, A0A, r3);
            return new AnonymousClass4KU(A0A, A003 == null ? null : r12.A0A(A003), r3);
        } else {
            C73943pN r2 = (C73943pN) this;
            return r2.A01.A0D.A03(r2.A00);
        }
    }

    public final Object call() {
        AnonymousClass024 r2 = this.A00;
        if (!r2.A04()) {
            Object A01 = A01();
            if (!r2.A04()) {
                return A01;
            }
        }
        throw new AnonymousClass057();
    }
}
