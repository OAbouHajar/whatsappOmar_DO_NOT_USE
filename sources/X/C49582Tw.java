package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxPDisplayerShape297S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Tw  reason: invalid class name and case insensitive filesystem */
public class C49582Tw extends AnonymousClass01W {
    public static final AnonymousClass3QW A0E = new AnonymousClass3QW();
    public RecyclerView A00;
    public C16300so A01;
    public ParticipantsListViewModel A02;
    public C16000sG A03;
    public C16080sP A04;
    public AnonymousClass01V A05;
    public AnonymousClass013 A06;
    public C17240ul A07;
    public UserJid A08;
    public C25781Lc A09;
    public C216014s A0A;
    public AnonymousClass4FS A0B;
    public final AnonymousClass2OY A0C;
    public final AnonymousClass2Ao A0D;

    public C49582Tw(Context context, C17160ud r4, C17200uh r5) {
        super((AnonymousClass0Q5) A0E);
        this.A0C = new IDxPDisplayerShape297S0100000_2_I0(r4, 0);
        this.A0D = r5.A04(context, "voip-call-control-bottom-sheet");
        A0B(true);
    }

    public /* bridge */ /* synthetic */ void A07(C005602k r3) {
        AnonymousClass26H r32 = (AnonymousClass26H) r3;
        if (r32 instanceof AnonymousClass26G) {
            AnonymousClass26G r33 = (AnonymousClass26G) r32;
            r33.A08();
            r33.A00 = null;
            r33.A05.removeCallbacks(r33.A0A);
        }
    }

    public void A09(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A0A(RecyclerView recyclerView) {
        Log.i("voip/ParticipantsListAdapter/onDetachedFromRecyclerView");
        this.A0D.A00();
    }

    public long A0D(int i2) {
        AnonymousClass26J r1 = (AnonymousClass26J) super.A0E(i2);
        return (long) (r1 instanceof AnonymousClass26I ? ((AnonymousClass26I) r1).A02.hashCode() : r1.A00);
    }

    public /* bridge */ /* synthetic */ Object A0E(int i2) {
        return super.A0E(i2);
    }

    public void A0F(List list) {
        super.A0F(list == null ? null : new ArrayList(list));
    }

    public void A0G() {
        if (this.A00 != null) {
            for (int i2 = 0; i2 < A0C(); i2++) {
                AnonymousClass26J r2 = (AnonymousClass26J) super.A0E(i2);
                if (r2.A00 == 4) {
                    C005602k A0D2 = this.A00.A0D(i2);
                    if (A0D2 instanceof AnonymousClass26H) {
                        ((AnonymousClass26H) A0D2).A07(r2);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void A0H(int i2) {
        AnonymousClass4FS r0 = this.A0B;
        if (r0 != null) {
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r0.A00;
            if (voipCallControlBottomSheetV2.A0D != null && voipCallControlBottomSheetV2.A0C != null) {
                StringBuilder sb = new StringBuilder("voip/VoipCallControlBottomSheetV2 scroll to position: ");
                sb.append(i2);
                Log.i(sb.toString());
                voipCallControlBottomSheetV2.A0I.A08 = null;
                voipCallControlBottomSheetV2.A0D.post(new RunnableRunnableShape0S0101000_I0((Object) voipCallControlBottomSheetV2, i2, 31));
            }
        }
    }

    public void A0I(UserJid userJid) {
        this.A08 = userJid;
        if (userJid != null) {
            for (int i2 = 0; i2 < A0C(); i2++) {
                AnonymousClass26J r1 = (AnonymousClass26J) super.A0E(i2);
                if ((r1 instanceof AnonymousClass26I) && ((AnonymousClass26I) r1).A02.equals(this.A08)) {
                    A0H(i2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        r5 = (X.AnonymousClass26G) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            java.lang.String r1 = "voip/ParticipantsListAdapter/updateProfilePhoto "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = 0
        L_0x0013:
            int r0 = r7.A0C()
            if (r6 >= r0) goto L_0x0050
            java.lang.Object r1 = super.A0E(r6)
            X.26J r1 = (X.AnonymousClass26J) r1
            boolean r0 = r1 instanceof X.AnonymousClass26I
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            if (r0 == 0) goto L_0x004d
            X.26I r1 = (X.AnonymousClass26I) r1
            com.whatsapp.jid.UserJid r0 = r1.A02
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.RecyclerView r0 = r7.A00
            X.02k r5 = r0.A0D(r6)
            boolean r0 = r5 instanceof X.AnonymousClass26G
            if (r0 == 0) goto L_0x004d
            X.26G r5 = (X.AnonymousClass26G) r5
            X.26I r0 = r5.A00
            if (r0 == 0) goto L_0x004d
            X.2Ao r4 = r5.A08
            X.0sH r3 = r0.A01
            android.widget.ImageView r2 = r5.A02
            r1 = 1
            X.2OY r0 = r5.A07
            r4.A03(r2, r0, r3, r1)
        L_0x004d:
            int r6 = r6 + 1
            goto L_0x0013
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49582Tw.A0J(com.whatsapp.jid.UserJid):void");
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r3, int i2) {
        AnonymousClass26J r1 = (AnonymousClass26J) super.A0E(i2);
        AnonymousClass00B.A06(r1);
        ((AnonymousClass26H) r3).A07(r1);
        if ((r1 instanceof AnonymousClass26I) && ((AnonymousClass26I) r1).A02.equals(this.A08)) {
            A0H(i2);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            return new C72963n2(from.inflate(R.layout.layout05f1, viewGroup, false), this.A02);
        }
        if (i2 == 2 || i2 == 3) {
            return new AnonymousClass3n3(from.inflate(R.layout.layout05f3, viewGroup, false), this.A02);
        }
        if (i2 == 4) {
            return new C449226g(from.inflate(R.layout.layout05f4, viewGroup, false), this.A02, this.A03, this.A04, this.A07, this.A0A);
        } else if (i2 == 5) {
            return new C72973n4(from.inflate(R.layout.layout05ef, viewGroup, false), this.A02);
        } else {
            boolean z2 = true;
            if (i2 != 1) {
                z2 = false;
            }
            AnonymousClass00B.A0B("Unknown list item type", z2);
            View inflate = from.inflate(R.layout.layout05f5, viewGroup, false);
            ParticipantsListViewModel participantsListViewModel = this.A02;
            AnonymousClass013 r9 = this.A06;
            C16080sP r5 = this.A04;
            C25781Lc r10 = this.A09;
            return new AnonymousClass26G(inflate, participantsListViewModel, r5, this.A0C, this.A0D, this.A05, r9, r10);
        }
    }

    public int getItemViewType(int i2) {
        AnonymousClass26J r0 = (AnonymousClass26J) super.A0E(i2);
        AnonymousClass00B.A06(r0);
        return r0.A00;
    }
}
