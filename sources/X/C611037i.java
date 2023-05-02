package X;

import com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.37i  reason: invalid class name and case insensitive filesystem */
public class C611037i extends C19270y9 {
    public final /* synthetic */ AnonymousClass3BC A00;

    public C611037i(AnonymousClass3BC r1) {
        this.A00 = r1;
    }

    public void A02(C37831po r8) {
        Log.i("CallsHistoryDataSource/onCallEnded");
        AnonymousClass3BC r2 = this.A00;
        if (r2.A01 != null) {
            C35011lE r1 = null;
            try {
                r1 = C30341cC.A07();
            } catch (UnsatisfiedLinkError e2) {
                Log.e((Throwable) e2);
            }
            if ((!r8.A0C.equals(r1) && (!r8.A0A() || r8.A04().size() > 0)) || r8.A06 != null) {
                CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r2.A01.A00;
                Iterator it = callsHistoryFragmentV2ViewModel.A04.iterator();
                while (true) {
                    if (it.hasNext()) {
                        C101134wl r22 = (C101134wl) it.next();
                        C616739v r12 = r22.A01;
                        if (r12.A09(r8, true)) {
                            r12.A04.add(r8);
                            C1042754r A02 = CallsHistoryFragmentV2ViewModel.A02(r22, callsHistoryFragmentV2ViewModel);
                            AnonymousClass00B.A07(A02, "CallsHistoryViewModel/onCallEnded failed to update view state for ongoing, joinable call");
                            r22.A00 = A02;
                            break;
                        }
                    } else {
                        Iterator it2 = callsHistoryFragmentV2ViewModel.A03.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C101124wk r23 = (C101124wk) it2.next();
                                C616739v r13 = r23.A01;
                                if (r13.A09(r8, false)) {
                                    r13.A04.add(r8);
                                    AnonymousClass3HT A01 = CallsHistoryFragmentV2ViewModel.A01(r23, callsHistoryFragmentV2ViewModel);
                                    AnonymousClass00B.A07(A01, "CallsHistoryViewModel/onCallEnded failed to update view state for historical call");
                                    r23.A00 = A01;
                                    break;
                                }
                            } else {
                                C16440t3 r24 = callsHistoryFragmentV2ViewModel.A0F;
                                C14710pd r14 = callsHistoryFragmentV2ViewModel.A0H;
                                C16000sG r3 = callsHistoryFragmentV2ViewModel.A0D;
                                C616739v r6 = new C616739v(r3, callsHistoryFragmentV2ViewModel.A0E, r24, r14);
                                r6.A04.add(r8);
                                C16010sH A022 = C30341cC.A02(r3, callsHistoryFragmentV2ViewModel.A0I, r8.A04, callsHistoryFragmentV2ViewModel.A0J);
                                if (r6.A07()) {
                                    C101134wl r25 = new C101134wl(r6, A022);
                                    C1042754r A023 = CallsHistoryFragmentV2ViewModel.A02(r25, callsHistoryFragmentV2ViewModel);
                                    AnonymousClass00B.A07(A023, "CallsHistoryViewModel/onCallEnded failed to update view state for new ongoing, joinable call item");
                                    r25.A00 = A023;
                                    callsHistoryFragmentV2ViewModel.A04.add(0, r25);
                                } else {
                                    C101124wk r15 = new C101124wk(r6, A022);
                                    AnonymousClass3HT A012 = CallsHistoryFragmentV2ViewModel.A01(r15, callsHistoryFragmentV2ViewModel);
                                    if (A012 == null) {
                                        callsHistoryFragmentV2ViewModel.A08.A01();
                                    } else {
                                        r15.A00 = A012;
                                        callsHistoryFragmentV2ViewModel.A03.add(0, r15);
                                    }
                                }
                            }
                        }
                    }
                }
                callsHistoryFragmentV2ViewModel.A06();
                callsHistoryFragmentV2ViewModel.A05();
            }
        }
    }

    public void A04(C37831po r2, boolean z2) {
        Log.i("CallsHistoryDataSource/onCallMissed");
    }
}
