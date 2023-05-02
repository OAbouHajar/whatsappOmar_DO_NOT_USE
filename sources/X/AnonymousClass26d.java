package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.26d  reason: invalid class name */
public class AnonymousClass26d extends AnonymousClass01X {
    public int A00 = R.style.style0390;
    public RecyclerView A01;
    public AnonymousClass4DV A02;
    public AnonymousClass4Q9 A03;
    public AnonymousClass5SU A04;
    public CallGridViewModel A05;
    public boolean A06;
    public final AnonymousClass2ZZ A07;
    public final AnonymousClass2ZY A08;
    public final AnonymousClass2ZX A09;
    public final AnonymousClass2ZW A0A;
    public final AnonymousClass2ZV A0B;
    public final C33481ie A0C = new IDxCObserverShape68S0100000_2_I0(this, 3);
    public final C14710pd A0D;
    public final List A0E = new ArrayList();

    public AnonymousClass26d(AnonymousClass2ZZ r3, AnonymousClass2ZY r4, AnonymousClass2ZX r5, AnonymousClass2ZW r6, AnonymousClass2ZV r7, C14710pd r8) {
        this.A0D = r8;
        this.A07 = r3;
        this.A08 = r4;
        this.A09 = r5;
        this.A0A = r6;
        this.A0B = r7;
    }

    public /* bridge */ /* synthetic */ void A07(C005602k r1) {
        ((AnonymousClass26E) r1).A08();
    }

    public void A09(RecyclerView recyclerView) {
        this.A01 = recyclerView;
    }

    public void A0A(RecyclerView recyclerView) {
        this.A01 = null;
    }

    public int A0C() {
        return this.A0E.size();
    }

    public View A0E(int i2, ViewGroup viewGroup) {
        LayoutInflater from;
        int i3;
        AnonymousClass06V r0 = new AnonymousClass06V(viewGroup.getContext(), this.A00);
        switch (i2) {
            case 1:
                from = LayoutInflater.from(r0);
                i3 = R.layout.layout05c9;
                break;
            case 3:
                from = LayoutInflater.from(r0);
                i3 = R.layout.layout007e;
                break;
            case 4:
                from = LayoutInflater.from(r0);
                i3 = R.layout.layout007d;
                break;
            case 5:
                from = LayoutInflater.from(r0);
                i3 = R.layout.layout007c;
                break;
            case 6:
                from = LayoutInflater.from(r0);
                i3 = R.layout.layout007a;
                break;
            case 7:
                from = LayoutInflater.from(r0);
                i3 = R.layout.layout007b;
                break;
            case 8:
                from = LayoutInflater.from(r0);
                i3 = R.layout.layout0079;
                break;
            case 9:
                FrameLayout frameLayout = new FrameLayout(r0);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            default:
                from = LayoutInflater.from(r0);
                i3 = R.layout.layout05cb;
                break;
        }
        return from.inflate(i3, viewGroup, false);
    }

    public AnonymousClass26E A0F(View view, int i2) {
        return A0G(view, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006a, code lost:
        if (r19 != 0) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r5 != 2) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass26E A0G(android.view.View r18, int r19, boolean r20) {
        /*
            r17 = this;
            r4 = r17
            X.0pd r2 = r4.A0D
            r1 = 1502(0x5de, float:2.105E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r3 = r2.A0E(r0, r1)
            r2 = 2
            r1 = 0
            r0 = 1
            r6 = r18
            r5 = r19
            if (r3 == 0) goto L_0x0066
            if (r5 == r2) goto L_0x0019
            if (r5 != r0) goto L_0x0066
        L_0x0019:
            r15 = 1
        L_0x001a:
            if (r5 == r0) goto L_0x001e
            if (r5 != r2) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            java.lang.String r0 = "Unknown view holder type"
            X.AnonymousClass00B.A0B(r0, r1)
            X.2ZZ r0 = r4.A07
            X.4DV r8 = r4.A02
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r9 = r4.A05
            X.2Yk r0 = r0.A00
            X.0sX r1 = r0.A03
            X.01J r0 = r1.A05
            java.lang.Object r14 = r0.get()
            X.0pd r14 = (X.C14710pd) r14
            X.01J r0 = r1.AQ9
            java.lang.Object r13 = r0.get()
            X.0sP r13 = (X.C16080sP) r13
            X.01J r0 = r1.A4t
            java.lang.Object r12 = r0.get()
            X.0ud r12 = (X.C17160ud) r12
            X.01J r0 = r1.APr
            java.lang.Object r10 = r0.get()
            X.1Pf r10 = (X.C26801Pf) r10
            X.01J r0 = r1.APs
            java.lang.Object r11 = r0.get()
            X.1Ph r11 = (X.C26811Ph) r11
            X.01J r0 = r1.A1k
            java.lang.Object r7 = r0.get()
            X.1Cv r7 = (X.C23651Cv) r7
            X.26F r5 = new X.26F
            r16 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r5
        L_0x0066:
            r15 = 0
            switch(r19) {
                case 3: goto L_0x00e9;
                case 4: goto L_0x00c1;
                case 5: goto L_0x0091;
                case 6: goto L_0x00e9;
                case 7: goto L_0x00e9;
                case 8: goto L_0x00e9;
                case 9: goto L_0x006d;
                default: goto L_0x006a;
            }
        L_0x006a:
            if (r19 == 0) goto L_0x001e
            goto L_0x001a
        L_0x006d:
            X.2ZV r0 = r4.A0B
            X.2Yk r0 = r0.A00
            X.0sX r1 = r0.A03
            X.01J r0 = r1.AQ9
            java.lang.Object r3 = r0.get()
            X.0sP r3 = (X.C16080sP) r3
            X.01J r0 = r1.A4t
            java.lang.Object r2 = r0.get()
            X.0ud r2 = (X.C17160ud) r2
            X.01J r0 = r1.A1k
            java.lang.Object r1 = r0.get()
            X.1Cv r1 = (X.C23651Cv) r1
            X.3mu r0 = new X.3mu
            r0.<init>(r6, r1, r2, r3)
            return r0
        L_0x0091:
            X.2ZY r0 = r4.A08
            X.4DV r8 = r4.A02
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r9 = r4.A05
            X.2Yk r0 = r0.A00
            X.0sX r1 = r0.A03
            X.01J r0 = r1.AQ9
            java.lang.Object r11 = r0.get()
            X.0sP r11 = (X.C16080sP) r11
            X.01J r0 = r1.A4t
            java.lang.Object r10 = r0.get()
            X.0ud r10 = (X.C17160ud) r10
            X.01J r0 = r1.AR8
            java.lang.Object r12 = r0.get()
            X.013 r12 = (X.AnonymousClass013) r12
            X.01J r0 = r1.A1k
            java.lang.Object r7 = r0.get()
            X.1Cv r7 = (X.C23651Cv) r7
            X.3mv r5 = new X.3mv
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L_0x00c1:
            X.2ZW r0 = r4.A0A
            X.4DV r8 = r4.A02
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r9 = r4.A05
            X.2Yk r0 = r0.A00
            X.0sX r1 = r0.A03
            X.01J r0 = r1.AQ9
            java.lang.Object r11 = r0.get()
            X.0sP r11 = (X.C16080sP) r11
            X.01J r0 = r1.A4t
            java.lang.Object r10 = r0.get()
            X.0ud r10 = (X.C17160ud) r10
            X.01J r0 = r1.A1k
            java.lang.Object r7 = r0.get()
            X.1Cv r7 = (X.C23651Cv) r7
            X.3mw r5 = new X.3mw
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L_0x00e9:
            X.2ZX r0 = r4.A09
            X.4DV r8 = r4.A02
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r9 = r4.A05
            X.2Yk r0 = r0.A00
            X.0sX r1 = r0.A03
            X.01J r0 = r1.AQ9
            java.lang.Object r11 = r0.get()
            X.0sP r11 = (X.C16080sP) r11
            X.01J r0 = r1.A4t
            java.lang.Object r10 = r0.get()
            X.0ud r10 = (X.C17160ud) r10
            X.01J r0 = r1.A1k
            java.lang.Object r7 = r0.get()
            X.1Cv r7 = (X.C23651Cv) r7
            X.2zE r5 = new X.2zE
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26d.A0G(android.view.View, int, boolean):X.26E");
    }

    public void A0H(int i2) {
        if (!(this instanceof C50042Xk)) {
            this.A00 = i2;
        }
    }

    /* renamed from: A0I */
    public void ANf(AnonymousClass26E r2, int i2) {
        A08(r2, new ArrayList(), i2);
    }

    /* renamed from: A0J */
    public void A08(AnonymousClass26E r8, List list, int i2) {
        if (i2 >= 0) {
            List list2 = this.A0E;
            if (i2 < list2.size()) {
                r8.A0G((C37921px) list2.get(i2));
                boolean z2 = false;
                if (list.size() > 0 && (list.get(0) instanceof Bundle) && ((Bundle) list.get(0)).getBoolean("update_contact")) {
                    r8.A07();
                }
                if ((r8 instanceof C59882zE) && this.A01 != null && !(this instanceof C50042Xk) && !this.A06) {
                    int size = list2.size();
                    int height = this.A01.getHeight();
                    CallGridViewModel callGridViewModel = this.A05;
                    if (callGridViewModel != null && ((Boolean) callGridViewModel.A0O.A01()).booleanValue()) {
                        z2 = true;
                    }
                    int A002 = C89574cT.A00(size, height, z2);
                    Log.i("VoiceParticipantViewHolder/setItemViewHeight get called");
                    View view = r8.A0H;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int i3 = layoutParams.height;
                    if (i3 != A002) {
                        StringBuilder sb = new StringBuilder("VoiceParticipantViewHolder/setItemViewHeight Height Mismatch, layoutParams.height: ");
                        sb.append(i3);
                        sb.append(", itemViewHeightPx: ");
                        sb.append(A002);
                        Log.i(sb.toString());
                        layoutParams.height = A002;
                        view.setLayoutParams(layoutParams);
                    }
                    int i4 = 0;
                    if (size > 2) {
                        i4 = 2;
                        if (size <= 8) {
                            i4 = 1;
                        }
                    }
                    r8.A09(i4);
                    return;
                }
                return;
            }
        }
        Log.w("CallGridAdapter/onCreateViewHolder index out of bounds");
    }

    public void A0K(UserJid userJid) {
        if (userJid != null) {
            int i2 = 0;
            while (true) {
                List list = this.A0E;
                if (i2 >= list.size()) {
                    return;
                }
                if (!userJid.equals(((C37921px) list.get(i2)).A0U)) {
                    i2++;
                } else if (i2 != -1) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("update_contact", true);
                    this.A01.A04(bundle, i2, 1);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public void A0L(List list) {
        List list2 = this.A0E;
        AnonymousClass07C A002 = AnonymousClass07B.A00(new AnonymousClass3QO(list2, list));
        boolean z2 = false;
        if (list2.size() != list.size()) {
            z2 = true;
        }
        this.A06 = z2;
        list2.clear();
        list2.addAll(list);
        A002.A02(this);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        StringBuilder sb = new StringBuilder("CallGridAdapter/onCreateViewHolder, viewType: ");
        sb.append(i2);
        Log.i(sb.toString());
        AnonymousClass26E A0F = A0F(A0E(i2, viewGroup), i2);
        boolean z2 = true;
        if (!(i2 == 7 || i2 == 8 || i2 == 1)) {
            z2 = false;
        }
        A0F.A08 = z2;
        if (A0F instanceof AnonymousClass26F) {
            ((AnonymousClass26F) A0F).A04 = new C101034wb(this);
        }
        A0F.A0F(this.A03);
        return A0F;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getItemViewType(int r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C50042Xk
            if (r0 == 0) goto L_0x0024
            if (r4 < 0) goto L_0x0021
            java.util.List r1 = r3.A0E
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x0021
            java.lang.Object r1 = r1.get(r4)
            X.1px r1 = (X.C37921px) r1
            if (r1 == 0) goto L_0x0021
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.A07
            r1 = 0
            if (r0 == 0) goto L_0x0020
            r1 = 3
        L_0x0020:
            return r1
        L_0x0021:
            r1 = 9
            return r1
        L_0x0024:
            if (r4 < 0) goto L_0x0050
            java.util.List r1 = r3.A0E
            int r0 = r1.size()
            if (r4 >= r0) goto L_0x0050
            java.lang.Object r0 = r1.get(r4)
            X.1px r0 = (X.C37921px) r0
        L_0x0034:
            r2 = 9
            if (r0 == 0) goto L_0x004f
            boolean r1 = r0.A08
            if (r1 != 0) goto L_0x004f
            boolean r1 = r0.A0F
            if (r1 != 0) goto L_0x0052
            java.util.List r1 = r3.A0E
            int r2 = r1.size()
            r1 = 1
            if (r2 != r1) goto L_0x0061
            boolean r0 = r0.A09
            r2 = 5
            if (r0 == 0) goto L_0x004f
            r2 = 4
        L_0x004f:
            return r2
        L_0x0050:
            r0 = 0
            goto L_0x0034
        L_0x0052:
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0063
            java.util.List r0 = r3.A0E
            int r1 = r0.size()
            r0 = 4
            if (r1 > r0) goto L_0x0061
            r2 = 6
            return r2
        L_0x0061:
            r2 = 3
            return r2
        L_0x0063:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass26d.getItemViewType(int):int");
    }
}
