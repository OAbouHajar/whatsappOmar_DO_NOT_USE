package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.redex.IDxICallbackShape3S0000000_2_I0;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import com.whatsapp.util.Log;

/* renamed from: X.0vI  reason: invalid class name and case insensitive filesystem */
public class C17570vI extends AnonymousClass01W {
    public final C17430v4 A00;
    public final C17440v5 A01;
    public final C17450v6 A02;
    public final C17460v7 A03;
    public final C17470v8 A04;
    public final C17480v9 A05;
    public final C17490vA A06;
    public final C17500vB A07;
    public final C17510vC A08;
    public final C17520vD A09;
    public final C17530vE A0A;
    public final C17540vF A0B;
    public final C17550vG A0C;
    public final C17560vH A0D;

    public C17570vI(C17430v4 r3, C17440v5 r4, C17450v6 r5, C17460v7 r6, C17470v8 r7, C17480v9 r8, C17490vA r9, C17500vB r10, C17510vC r11, C17520vD r12, C17530vE r13, C17540vF r14, C17550vG r15, C17560vH r16) {
        super(new AnonymousClass0US(new IDxICallbackShape3S0000000_2_I0(1)).A00());
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = r7;
        this.A02 = r5;
        this.A03 = r6;
        this.A0A = r13;
        this.A06 = r9;
        this.A07 = r10;
        this.A05 = r8;
        this.A08 = r11;
        this.A0C = r15;
        this.A09 = r12;
        this.A0D = r16;
        this.A0B = r14;
    }

    public /* bridge */ /* synthetic */ void A07(C005602k r1) {
        ((C65133Sz) r1).A07();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        C65133Sz r22 = (C65133Sz) r2;
        r22.A07();
        r22.A08(A0E(i2));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        switch (AnonymousClass428.values()[i2].ordinal()) {
            case 0:
                return new C72413m6(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout03a5, viewGroup, false));
            case 1:
                return new C72483mD(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout039b, viewGroup, false), viewGroup);
            case 2:
                return new C72473mC(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout039b, viewGroup, false), viewGroup);
            case 3:
                return new C59782z1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0526, viewGroup, false));
            case 4:
                return new C72373m2(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0524, viewGroup, false));
            case 5:
                return new C72613mQ(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0508, viewGroup, false), (C17180uf) this.A06.A00.A01.A2n.get());
            case 6:
                return new C72583mN(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout059f, viewGroup, false));
            case 7:
                C17450v6 r4 = this.A02;
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0534, viewGroup, false);
                C16150sX r2 = r4.A00.A01;
                return new C59832z6(inflate, (C25641Ko) r2.ALS.get(), (C25651Kp) r2.A2m.get());
            case 8:
                AnonymousClass3OO r3 = new AnonymousClass3OO(viewGroup.getContext());
                r3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                r3.setFAQLink("how-to-search-for-businesses-inside-whatsapp");
                return new C72343ly(r3);
            case 9:
                return new C72643mT(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout051a, viewGroup, false), new AnonymousClass3R8((AnonymousClass1PV) this.A03.A00.A01.A9c.get()));
            case 10:
                C17440v5 r32 = this.A01;
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00c7, viewGroup, false);
                C16150sX r22 = r32.A00.A01;
                C16040sK r33 = (C16040sK) r22.ADr.get();
                AnonymousClass013 r10 = (AnonymousClass013) r22.AR8.get();
                C25661Kq r7 = (C25661Kq) r22.A70.get();
                C17180uf r42 = (C17180uf) r22.A2n.get();
                C19840z5 A1O = r22.A1O();
                return new C72633mS(inflate2, new C615339h(r33, r42, r22.A1N(), A1O, r7, (AnonymousClass152) r22.A51.get(), (C16980tz) r22.AQB.get(), r10, (C16320sq) r22.ARB.get()));
            case 11:
                return new C72353lz(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00c2, viewGroup, false));
            case 12:
                return new C72403m5(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout03a4, viewGroup, false));
            case 13:
                return new C72423m7(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout040b, viewGroup, false));
            case 14:
                return new C72433m8(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04f4, viewGroup, false));
            case 15:
                return new C72623mR(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0232, viewGroup, false), (C17180uf) this.A00.A00.A01.A2n.get());
            case 16:
                return new C72443m9(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0506, viewGroup, false));
            case 17:
                return new C72363m1(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout03a7, viewGroup, false));
            case 18:
                C18450wi.A0H(viewGroup, 0);
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout020d, viewGroup, false);
                C18450wi.A0B(inflate3);
                return new AnonymousClass3m0(inflate3);
            case 19:
                return new C72393m4(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0289, viewGroup, false));
            case 20:
                return new C72383m3(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0525, viewGroup, false));
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return new C72493mE(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout03a7, viewGroup, false));
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return new C72453mA(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0542, viewGroup, false));
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                Context context = viewGroup.getContext();
                C18450wi.A0H(context, 0);
                AnonymousClass3OY r34 = new AnonymousClass3OY(context);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dimen0652);
                r34.setPadding(dimensionPixelSize, context.getResources().getDimensionPixelSize(R.dimen.dimen02fe), dimensionPixelSize, dimensionPixelSize);
                C004601z.A0X(r34, context.getResources().getDimension(R.dimen.dimen005d));
                return new C72523mH(r34);
            case 30:
                return new C72463mB(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00fb, viewGroup, false));
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                return new C72593mO(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0233, viewGroup, false), (C17180uf) this.A05.A00.A01.A2n.get());
            case 32:
                return new C72553mK(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04f1, viewGroup, false));
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                return new C72603mP(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0372, viewGroup, false), (C25661Kq) this.A09.A00.A01.A70.get());
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                C17540vF r35 = this.A0B;
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout00c6, viewGroup, false);
                C16150sX r36 = r35.A00.A01;
                return new C59852z8(inflate4, r36.A1N(), (C17140ub) r36.A4y.get(), (C17200uh) r36.A52.get());
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                return new C72653mU(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout051f, viewGroup, false), new C64613Qz((AnonymousClass1PU) this.A07.A00.A01.A9h.get()));
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                C17510vC r37 = this.A08;
                View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04a7, viewGroup, false);
                C16150sX r38 = r37.A00.A01;
                AnonymousClass3R1 r1 = new AnonymousClass3R1((AnonymousClass1PT) r38.A9j.get());
                return new C72683mX(inflate5, (C17180uf) r38.A2n.get(), r1, (AnonymousClass013) r38.AR8.get());
            case 39:
                return new C72673mW(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04a6, viewGroup, false), (C17180uf) this.A0A.A00.A01.A2n.get());
            case 40:
                return new C72693mY(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0368, viewGroup, false));
            case 42:
                C18450wi.A0H(viewGroup, 0);
                View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout036b, viewGroup, false);
                C18450wi.A0B(inflate6);
                return new C59792z2(inflate6);
            case 43:
                C18450wi.A0H(viewGroup, 0);
                View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout039b, viewGroup, false);
                C18450wi.A0B(inflate7);
                return new C72513mG(inflate7);
            case 44:
                C18450wi.A0H(viewGroup, 0);
                View inflate8 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout036e, viewGroup, false);
                C18450wi.A0B(inflate8);
                return new C72543mJ(inflate8);
            case 45:
                C17470v8 r39 = this.A04;
                C18450wi.A0H(viewGroup, 0);
                View inflate9 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0370, viewGroup, false);
                C18450wi.A0B(inflate9);
                return new C59812z4(inflate9, C16150sX.A0G(r39.A00.A01));
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*46*/:
                C17550vG r310 = this.A0C;
                C18450wi.A0H(viewGroup, 0);
                View inflate10 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout036c, viewGroup, false);
                C18450wi.A0B(inflate10);
                C16150sX r43 = r310.A00.A01;
                return new C59862z9(inflate10, (C17180uf) r43.A2n.get(), (C25641Ko) r43.ALS.get(), new C50302Yu((C14870pt) r43.AB3.get(), (C17130ua) r43.AN9.get(), (C16980tz) r43.AQB.get(), (C19950zG) r43.AQV.get()), (AnonymousClass1GE) r43.A1e.get());
            case 47:
                C18450wi.A0H(viewGroup, 0);
                View inflate11 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout036f, viewGroup, false);
                C18450wi.A0B(inflate11);
                return new C59822z5(inflate11);
            case 48:
                C18450wi.A0H(viewGroup, 0);
                View inflate12 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0515, viewGroup, false);
                C18450wi.A0B(inflate12);
                return new C72563mL(inflate12);
            case 49:
                C18450wi.A0H(viewGroup, 0);
                View inflate13 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout03ac, viewGroup, false);
                C18450wi.A0B(inflate13);
                return new C59802z3(inflate13);
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*50*/:
                C18450wi.A0H(viewGroup, 0);
                View inflate14 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout05a1, viewGroup, false);
                C18450wi.A0B(inflate14);
                return new C59842z7(inflate14);
            case 51:
                C18450wi.A0H(viewGroup, 0);
                View inflate15 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout0231, viewGroup, false);
                C18450wi.A0B(inflate15);
                return new C72573mM(inflate15);
            case 52:
                C18450wi.A0H(viewGroup, 0);
                View inflate16 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout039b, viewGroup, false);
                C18450wi.A0B(inflate16);
                return new C72503mF(inflate16);
            default:
                StringBuilder sb = new StringBuilder("DirectorySearchFragmentListAdapter/onCreateViewHolder type not handled: ");
                sb.append(i2);
                Log.e(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DirectorySearchFragmentListAdapter/onCreateViewHolder type not handled: ");
                sb2.append(i2);
                throw new IllegalStateException(sb2.toString());
        }
    }

    public int getItemViewType(int i2) {
        return ((C31301dt) A0E(i2)).A00.ordinal();
    }
}
