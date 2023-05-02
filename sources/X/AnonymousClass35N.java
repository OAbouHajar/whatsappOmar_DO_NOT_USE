package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.polls.PollCreatorViewModel;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* renamed from: X.35N  reason: invalid class name */
public class AnonymousClass35N extends C41651wK {
    public final /* synthetic */ AnonymousClass01V A00;
    public final /* synthetic */ AnonymousClass013 A01;
    public final /* synthetic */ C17250um A02;
    public final /* synthetic */ C14710pd A03;
    public final /* synthetic */ AnonymousClass33r A04;
    public final /* synthetic */ PollCreatorViewModel A05;
    public final /* synthetic */ C17020u3 A06;

    public AnonymousClass35N(AnonymousClass01V r1, AnonymousClass013 r2, C17250um r3, C14710pd r4, AnonymousClass33r r5, PollCreatorViewModel pollCreatorViewModel, C17020u3 r7) {
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = r1;
        this.A06 = r7;
        this.A05 = pollCreatorViewModel;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void afterTextChanged(Editable editable) {
        AnonymousClass33r r4 = this.A04;
        if (r4.A00() != -1) {
            Editable editable2 = editable;
            String obj = editable.toString();
            String replace = obj.replace(IOUtils.LINE_SEPARATOR_UNIX, "");
            if (TextUtils.equals(obj, replace)) {
                String obj2 = editable.toString();
                WaEditText waEditText = r4.A01;
                Context context = waEditText.getContext();
                C17250um r9 = this.A02;
                C45922Bq.A06(context, waEditText.getPaint(), editable2, this.A00, r9, this.A06);
                AnonymousClass2Sy.A07(waEditText.getContext(), waEditText.getPaint(), editable, r9, 1.3f);
                int A002 = r4.A00() - 2;
                PollCreatorViewModel pollCreatorViewModel = this.A05;
                List list = pollCreatorViewModel.A0G;
                int size = list.size();
                C14710pd r1 = pollCreatorViewModel.A07;
                C16620tM r6 = C16620tM.A02;
                if (size < r1.A03(r6, 1408) && obj2.length() == 1) {
                    if (C13700nu.A00(list, 1) != A002) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C77753wU) it.next()).A00.isEmpty()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    int i2 = pollCreatorViewModel.A02;
                    pollCreatorViewModel.A02 = i2 + 1;
                    list.add(new C77753wU(i2));
                    pollCreatorViewModel.A05();
                    pollCreatorViewModel.A0E.A09(C13690nt.A0Y());
                }
                if (pollCreatorViewModel.A07(obj2, A002)) {
                    boolean A062 = pollCreatorViewModel.A06(A002);
                    int i3 = pollCreatorViewModel.A01;
                    if (A062) {
                        if (A002 != i3) {
                            C13680ns.A1P(pollCreatorViewModel.A03, list.size() - 1);
                            pollCreatorViewModel.A01 = A002;
                            pollCreatorViewModel.A0E.A09(C13690nt.A0Y());
                        }
                    } else if (i3 != -1) {
                        C13680ns.A1P(pollCreatorViewModel.A03, -1);
                        pollCreatorViewModel.A01 = -1;
                    }
                    boolean A0E = this.A03.A0E(r6, 2661);
                    int i4 = r4.A00;
                    if (A0E) {
                        int i5 = 0;
                        while (true) {
                            List list2 = pollCreatorViewModel.A0F;
                            if (i5 >= list2.size()) {
                                break;
                            } else if (i4 == AnonymousClass000.A0D(list2.get(i5))) {
                                list2.remove(i5);
                                pollCreatorViewModel.A0B.A09(C13690nt.A0I(C13680ns.A0n(list2), Boolean.FALSE));
                                break;
                            } else {
                                i5++;
                            }
                        }
                    } else if (i4 == pollCreatorViewModel.A00) {
                        pollCreatorViewModel.A00 = -1;
                        pollCreatorViewModel.A0B.A09(C13690nt.A0I(-1, Boolean.FALSE));
                    }
                }
                boolean isEmpty = obj2.isEmpty();
                int i6 = R.drawable.sticker_store_reorder;
                if (isEmpty) {
                    i6 = 0;
                }
                if (this.A01.A0T()) {
                    waEditText.setCompoundDrawablesWithIntrinsicBounds(i6, 0, 0, 0);
                } else {
                    waEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, i6, 0);
                }
            } else {
                editable.clear();
                editable.append(replace);
            }
        }
    }
}
