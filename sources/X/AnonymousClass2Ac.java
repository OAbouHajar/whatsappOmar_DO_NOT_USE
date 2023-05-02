package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;

/* renamed from: X.2Ac  reason: invalid class name */
public class AnonymousClass2Ac {
    public boolean A00;
    public final View A01;
    public final ViewStub A02;
    public final TextView A03;
    public final TextView A04;
    public final C14870pt A05;
    public final C40781ug A06;
    public final AnonymousClass127 A07;
    public final C16000sG A08;
    public final C33481ie A09;
    public final C17140ub A0A;
    public final C16080sP A0B;
    public final AnonymousClass2Ao A0C;
    public final C17200uh A0D;
    public final C16440t3 A0E;
    public final C15860rz A0F;
    public final AnonymousClass013 A0G;
    public final AnonymousClass1VD A0H;
    public final AnonymousClass18R A0I;
    public final C45682Ad A0J;
    public final AnonymousClass01D A0K;
    public final Runnable A0L = new RunnableRunnableShape15S0100000_I0_14(this, 3);

    public AnonymousClass2Ac(ViewGroup viewGroup, C14870pt r10, AnonymousClass127 r11, C16000sG r12, C17140ub r13, C16080sP r14, C17200uh r15, C16440t3 r16, C15860rz r17, AnonymousClass013 r18, AnonymousClass18R r19, AnonymousClass01D r20) {
        IDxCObserverShape68S0100000_2_I0 iDxCObserverShape68S0100000_2_I0 = new IDxCObserverShape68S0100000_2_I0(this, 34);
        this.A09 = iDxCObserverShape68S0100000_2_I0;
        IDxSObserverShape63S0100000_2_I0 iDxSObserverShape63S0100000_2_I0 = new IDxSObserverShape63S0100000_2_I0(this, 23);
        this.A06 = iDxSObserverShape63S0100000_2_I0;
        IDxPObserverShape81S0100000_2_I0 iDxPObserverShape81S0100000_2_I0 = new IDxPObserverShape81S0100000_2_I0(this, 26);
        this.A0H = iDxPObserverShape81S0100000_2_I0;
        this.A0E = r16;
        this.A05 = r10;
        this.A0D = r15;
        this.A08 = r12;
        this.A0B = r14;
        this.A0G = r18;
        this.A0A = r13;
        this.A07 = r11;
        C15860rz r1 = r17;
        this.A0F = r1;
        AnonymousClass18R r6 = r19;
        this.A0I = r6;
        this.A0K = r20;
        this.A01 = viewGroup;
        this.A0C = r15.A04(viewGroup.getContext(), "status-details-panel");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout056a, viewGroup, true);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.panel_action_buttons);
        viewStub.setLayoutResource(R.layout.layout056b);
        viewStub.inflate();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(16908298);
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.A02 = (ViewStub) C004601z.A0E(inflate, R.id.list_container_header_stub);
        TextView textView = (TextView) inflate.findViewById(16908292);
        this.A03 = textView;
        textView.setText(r1.A1i() ? R.string.str0e01 : R.string.str0e02);
        C45682Ad r110 = new C45682Ad(this);
        this.A0J = r110;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.title);
        this.A04 = textView2;
        AnonymousClass1UP.A06(textView2);
        recyclerView.setAdapter(r110);
        r13.A02(iDxCObserverShape68S0100000_2_I0);
        r11.A02(iDxSObserverShape63S0100000_2_I0);
        r6.A02(iDxPObserverShape81S0100000_2_I0);
    }

    public final void A00() {
        C14870pt r6 = this.A05;
        Runnable runnable = this.A0L;
        r6.A0J(runnable);
        C45682Ad r1 = this.A0J;
        if (r1.A00.size() > 0) {
            long j2 = 0;
            for (C37851pq r0 : r1.A00) {
                long j3 = r0.A00;
                if (j3 > j2) {
                    j2 = j3;
                }
            }
            r6.A0L(runnable, (C42681yF.A01(j2) - System.currentTimeMillis()) + 1000);
        }
    }
}
