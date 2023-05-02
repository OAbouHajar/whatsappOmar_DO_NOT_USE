package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxSScrollerShape30S0100000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.3GM  reason: invalid class name */
public class AnonymousClass3GM implements C109455Se {
    public int A00;
    public C009904t A01;
    public final View A02;
    public final LinearLayoutManager A03;
    public final C57452rC A04;
    public final ArrayList A05 = AnonymousClass000.A0u();

    public AnonymousClass3GM(View view) {
        this.A02 = view.findViewById(R.id.avatar_picker_header);
        RecyclerView recyclerView = (RecyclerView) C004601z.A0E(view, R.id.avatar_header_recycler);
        recyclerView.A0h = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.A03 = linearLayoutManager;
        linearLayoutManager.A1P(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        C57452rC r0 = new C57452rC(this);
        this.A04 = r0;
        recyclerView.setAdapter(r0);
    }

    public View AGv() {
        return this.A02;
    }

    public void AUP(int i2) {
        ArrayList arrayList;
        IDxSScrollerShape30S0100000_2_I1 iDxSScrollerShape30S0100000_2_I1;
        int i3 = this.A00;
        if (i2 != i3) {
            int i4 = 0;
            while (true) {
                arrayList = this.A05;
                if (i4 < arrayList.size()) {
                    if (i3 == ((AnonymousClass4SV) arrayList.get(i4)).A00()) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            this.A00 = i2;
            int i5 = 0;
            while (true) {
                if (i5 < arrayList.size()) {
                    if (i2 == ((AnonymousClass4SV) arrayList.get(i5)).A00()) {
                        break;
                    }
                    i5++;
                } else {
                    i5 = -1;
                    break;
                }
            }
            if (i5 != i4) {
                LinearLayoutManager linearLayoutManager = this.A03;
                int A18 = linearLayoutManager.A18();
                int A1A = linearLayoutManager.A1A();
                int i6 = ((A1A - A18) << 1) / 5;
                int i7 = i5 - i6;
                if (i7 < A18) {
                    if (i7 < 0) {
                        i7 = 0;
                    }
                    iDxSScrollerShape30S0100000_2_I1 = new IDxSScrollerShape30S0100000_2_I1(this.A02.getContext(), this, 1);
                    iDxSScrollerShape30S0100000_2_I1.A00 = i7;
                } else {
                    int i8 = i5 + i6;
                    if (i8 > A1A) {
                        if (i8 >= linearLayoutManager.A06()) {
                            i8 = linearLayoutManager.A06() - 1;
                        }
                        iDxSScrollerShape30S0100000_2_I1 = new IDxSScrollerShape30S0100000_2_I1(this.A02.getContext(), this, 1);
                        iDxSScrollerShape30S0100000_2_I1.A00 = i8;
                    }
                }
                linearLayoutManager.A0Q(iDxSScrollerShape30S0100000_2_I1);
            }
            this.A04.A01();
        }
    }

    public void Adj(C009904t r4) {
        this.A01 = r4;
        if (r4 != null) {
            int A002 = r4.A00();
            if (A002 < 0) {
                C13700nu.A0Z("AvatarPickerHeader/setContentPicker/getCurrentPageIndex < 0", Locale.US, new Object[0]);
                A002 = 0;
            }
            AUP(A002);
        }
    }
}
