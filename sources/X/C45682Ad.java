package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Ad  reason: invalid class name and case insensitive filesystem */
public class C45682Ad extends AnonymousClass01X {
    public List A00 = new ArrayList();
    public final /* synthetic */ AnonymousClass2Ac A01;

    public C45682Ad(AnonymousClass2Ac r2) {
        this.A01 = r2;
    }

    public int A0C() {
        return this.A00.size();
    }

    public void A0E(C15830rv r3) {
        if (r3 != null) {
            for (C37851pq r0 : this.A00) {
                if (r3.equals(r0.A01)) {
                }
            }
            return;
        }
        A01();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r8, int i2) {
        AnonymousClass3SS r82 = (AnonymousClass3SS) r8;
        C37851pq r6 = (C37851pq) this.A00.get(i2);
        UserJid userJid = r6.A01;
        r82.A00 = userJid;
        AnonymousClass2Ac r5 = this.A01;
        C16010sH A0A = r5.A08.A0A(userJid);
        r5.A0C.A08(r82.A01, A0A, false);
        r82.A03.A0I((List) null, r5.A0B.A0D(A0A));
        TextView textView = r82.A02;
        textView.setText(C28961Zl.A01(r5.A0G, r5.A0E.A02(r6.A00)));
        textView.setTextColor(-12303292);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new AnonymousClass3SS(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout056d, viewGroup, false));
    }
}
