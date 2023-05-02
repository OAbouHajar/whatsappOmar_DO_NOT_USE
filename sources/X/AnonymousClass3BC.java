package X;

import android.text.TextUtils;
import com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.obwhatsapp.contact.IDxCObserverShape67S0100000_1_I1;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3BC  reason: invalid class name */
public class AnonymousClass3BC {
    public AnonymousClass37D A00;
    public C82514Dc A01;
    public final AnonymousClass1SN A02;
    public final C16000sG A03;
    public final C33481ie A04;
    public final C17140ub A05;
    public final C16080sP A06;
    public final C16440t3 A07;
    public final AnonymousClass1D0 A08;
    public final C14710pd A09;
    public final C17240ul A0A;
    public final AnonymousClass18R A0B;
    public final C216014s A0C;
    public final C16320sq A0D;
    public final C109505Sk A0E;
    public final AnonymousClass1SP A0F;
    public final C19270y9 A0G;
    public final AnonymousClass15A A0H;

    public AnonymousClass3BC(AnonymousClass1SN r7, C16000sG r8, C17140ub r9, C16080sP r10, C16440t3 r11, AnonymousClass1D0 r12, C14710pd r13, C17240ul r14, AnonymousClass18R r15, C216014s r16, C16320sq r17, AnonymousClass1SP r18, AnonymousClass15A r19) {
        AnonymousClass53I r3 = new AnonymousClass53I(this);
        this.A0E = r3;
        C611037i r2 = new C611037i(this);
        this.A0G = r2;
        IDxCObserverShape67S0100000_1_I1 iDxCObserverShape67S0100000_1_I1 = new IDxCObserverShape67S0100000_1_I1(this, 0);
        this.A04 = iDxCObserverShape67S0100000_1_I1;
        this.A09 = r13;
        AnonymousClass15A r1 = r19;
        this.A0H = r1;
        AnonymousClass1SP r4 = r18;
        this.A0F = r4;
        this.A08 = r12;
        this.A03 = r8;
        this.A05 = r9;
        this.A0A = r14;
        this.A0B = r15;
        this.A02 = r7;
        this.A0C = r16;
        this.A07 = r11;
        this.A06 = r10;
        this.A0D = r17;
        r1.A02(r2);
        r4.A02(r3);
        r9.A02(iDxCObserverShape67S0100000_1_I1);
        A01();
    }

    public static /* synthetic */ void A00(AnonymousClass4KH r3, AnonymousClass3BC r4) {
        if (r3 == null) {
            Log.i("CallsHistoryDataSource/notifyCallItemsUpdated task result null");
            return;
        }
        C82514Dc r2 = r4.A01;
        if (r2 != null) {
            ArrayList A0n = C13680ns.A0n(r3.A00);
            ArrayList A0n2 = C13680ns.A0n(r3.A01);
            Log.i("CallsHistoryViewModel/onCallLogUpdated");
            CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r2.A00;
            callsHistoryFragmentV2ViewModel.A03 = A0n;
            Iterator it = A0n.iterator();
            while (it.hasNext()) {
                C101124wk r1 = (C101124wk) it.next();
                r1.A00 = CallsHistoryFragmentV2ViewModel.A01(r1, callsHistoryFragmentV2ViewModel);
            }
            callsHistoryFragmentV2ViewModel.A04 = A0n2;
            Iterator it2 = A0n2.iterator();
            while (it2.hasNext()) {
                C101134wl r12 = (C101134wl) it2.next();
                C1042754r A022 = CallsHistoryFragmentV2ViewModel.A02(r12, callsHistoryFragmentV2ViewModel);
                AnonymousClass00B.A06(A022);
                r12.A00 = A022;
            }
            callsHistoryFragmentV2ViewModel.A06();
            C56832oa r13 = callsHistoryFragmentV2ViewModel.A0A;
            if (!TextUtils.isEmpty(r13.A00)) {
                r13.filter(r13.A00);
            }
            callsHistoryFragmentV2ViewModel.A05();
        }
    }

    public void A01() {
        C13680ns.A1T(this.A00);
        AnonymousClass37D r1 = new AnonymousClass37D(this);
        this.A00 = r1;
        C13680ns.A1U(r1, this.A0D);
    }
}
