package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.3GN  reason: invalid class name */
public class AnonymousClass3GN implements C109455Se {
    public int A00;
    public int A01 = -1;
    public int A02;
    public long A03 = 0;
    public C009904t A04;
    public C57492rG A05;
    public ArrayList A06;
    public final Context A07;
    public final View A08;
    public final LinearLayoutManager A09;
    public final RecyclerView A0A;
    public final AnonymousClass013 A0B;
    public final HashMap A0C = AnonymousClass000.A0x();

    public AnonymousClass3GN(Context context, View view, AnonymousClass013 r7) {
        this.A07 = context;
        this.A0B = r7;
        this.A08 = view.findViewById(R.id.sticker_picker_header);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_header_recycler);
        this.A0A = recyclerView;
        recyclerView.A0h = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.A09 = linearLayoutManager;
        linearLayoutManager.A1P(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        AnonymousClass3QL r0 = new AnonymousClass3QL(this);
        r0.A00 = false;
        recyclerView.setItemAnimator(r0);
        linearLayoutManager.A1Y(r7.A0T());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064 A[LOOP:0: B:18:0x0062->B:19:0x0064, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass3GL[] r8) {
        /*
            r7 = this;
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            int r6 = r8.length
            r4 = 0
            if (r6 <= 0) goto L_0x007b
            r1 = r8[r4]
            boolean r0 = r1 instanceof X.AnonymousClass359
            if (r0 == 0) goto L_0x007b
            java.lang.String r1 = r1.getId()
            X.4aq r0 = new X.4aq
            r0.<init>((int) r4, (java.lang.String) r1)
            r3.add(r0)
            r5 = 1
        L_0x001b:
            if (r5 >= r6) goto L_0x0031
            r1 = r8[r5]
            boolean r0 = r1 instanceof X.AnonymousClass35D
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = r1.getId()
            X.4aq r0 = new X.4aq
            r0.<init>((int) r5, (java.lang.String) r1)
            r3.add(r0)
            int r5 = r5 + 1
        L_0x0031:
            if (r5 >= r6) goto L_0x0047
            r1 = r8[r5]
            boolean r0 = r1 instanceof X.AnonymousClass35C
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r1.getId()
            X.4aq r0 = new X.4aq
            r0.<init>((int) r5, (java.lang.String) r1)
            r3.add(r0)
            int r5 = r5 + 1
        L_0x0047:
            r2 = -1
            if (r5 >= r6) goto L_0x0071
            r0 = r8[r5]
            boolean r0 = r0 instanceof X.AnonymousClass35A
            if (r0 == 0) goto L_0x0071
            X.3y0 r1 = new X.3y0
            r1.<init>(r5)
            int r0 = r7.A02
            boolean r2 = X.AnonymousClass000.A1R(r0, r2)
            r7.A02 = r5
            r3.add(r1)
            int r5 = r5 + 4
        L_0x0062:
            if (r5 >= r6) goto L_0x007d
            r1 = r8[r5]
            X.4aq r0 = new X.4aq
            r0.<init>((X.AnonymousClass3GL) r1, (int) r5)
            r3.add(r0)
            int r5 = r5 + 1
            goto L_0x0062
        L_0x0071:
            int r0 = r7.A02
            if (r0 == r2) goto L_0x0079
            r7.A02 = r2
            r2 = 1
            goto L_0x0062
        L_0x0079:
            r2 = 0
            goto L_0x0062
        L_0x007b:
            r5 = 0
            goto L_0x001b
        L_0x007d:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r7.A09
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0086
            java.util.Collections.reverse(r3)
        L_0x0086:
            java.util.ArrayList r0 = r7.A06
            if (r0 != 0) goto L_0x009a
            X.013 r0 = r7.A0B
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0098
            int r0 = r3.size()
            int r4 = r0 + -1
        L_0x0098:
            r7.A01 = r4
        L_0x009a:
            r7.A06 = r3
            X.2rG r0 = r7.A05
            if (r0 == 0) goto L_0x00aa
            if (r2 != 0) goto L_0x00aa
            r0.A01 = r8
            r0.A00 = r3
            r0.A01()
            return
        L_0x00aa:
            X.2rG r1 = new X.2rG
            r1.<init>(r7, r3, r8)
            r7.A05 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            r0.setAdapter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GN.A00(X.3GL[]):void");
    }

    public View AGv() {
        return this.A08;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AUP(int r8) {
        /*
            r7 = this;
            int r3 = r7.A00
            if (r8 == r3) goto L_0x0067
            java.util.ArrayList r1 = r7.A06
            r2 = 0
            if (r1 != 0) goto L_0x00a1
        L_0x0009:
            r2 = -1
        L_0x000a:
            r7.A00 = r8
            X.2rG r0 = r7.A05
            if (r0 == 0) goto L_0x0067
            java.util.ArrayList r1 = r7.A06
            r5 = 0
            if (r1 != 0) goto L_0x008c
        L_0x0015:
            r5 = -1
        L_0x0016:
            if (r5 == r2) goto L_0x0062
            androidx.recyclerview.widget.LinearLayoutManager r4 = r7.A09
            int r6 = r4.A18()
            int r2 = r4.A1A()
            int r3 = r2 - r6
            X.013 r0 = r7.A0B
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0046
            int r1 = r7.A02
            r0 = -1
            if (r1 == r0) goto L_0x0046
            int r0 = r4.A05()
            int r0 = r0 + -1
            android.view.View r1 = r4.A0C(r0)
            int r0 = r7.A02
            if (r2 >= r0) goto L_0x0086
            if (r5 >= r0) goto L_0x0086
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            r0.clearChildFocus(r1)
        L_0x0046:
            int r0 = r3 << 1
            int r0 = r0 / 5
            int r3 = r5 - r0
            if (r3 >= r6) goto L_0x0068
            if (r3 >= 0) goto L_0x0051
            r3 = 0
        L_0x0051:
            android.view.View r0 = r7.A08
            android.content.Context r1 = r0.getContext()
            r0 = 0
            com.facebook.redex.IDxSScrollerShape30S0100000_2_I1 r2 = new com.facebook.redex.IDxSScrollerShape30S0100000_2_I1
            r2.<init>(r1, r7, r0)
            r2.A00 = r3
        L_0x005f:
            r4.A0Q(r2)
        L_0x0062:
            X.2rG r0 = r7.A05
            r0.A01()
        L_0x0067:
            return
        L_0x0068:
            int r5 = r5 + r0
            if (r5 <= r2) goto L_0x0062
            int r0 = r4.A06()
            if (r5 < r0) goto L_0x0077
            int r0 = r4.A06()
            int r5 = r0 + -1
        L_0x0077:
            android.view.View r0 = r7.A08
            android.content.Context r1 = r0.getContext()
            r0 = 0
            com.facebook.redex.IDxSScrollerShape30S0100000_2_I1 r2 = new com.facebook.redex.IDxSScrollerShape30S0100000_2_I1
            r2.<init>(r1, r7, r0)
            r2.A00 = r5
            goto L_0x005f
        L_0x0086:
            androidx.recyclerview.widget.RecyclerView r0 = r7.A0A
            r0.requestChildFocus(r1, r1)
            goto L_0x0046
        L_0x008c:
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x0015
            java.lang.Object r0 = r1.get(r5)
            X.4aq r0 = (X.C88634aq) r0
            boolean r0 = r0.A00(r8)
            if (r0 != 0) goto L_0x0016
            int r5 = r5 + 1
            goto L_0x008c
        L_0x00a1:
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0009
            java.lang.Object r0 = r1.get(r2)
            X.4aq r0 = (X.C88634aq) r0
            boolean r0 = r0.A00(r3)
            if (r0 != 0) goto L_0x000a
            int r2 = r2 + 1
            goto L_0x00a1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GN.AUP(int):void");
    }

    public void Adj(C009904t r4) {
        this.A04 = r4;
        if (r4 != null) {
            int A002 = r4.A00();
            if (A002 < 0) {
                C13700nu.A0Z("StickerPickerHeader/setContentPicker/getCurrentPageIndex < 0", Locale.US, new Object[0]);
                A002 = 0;
            }
            AUP(A002);
        }
    }
}
