package X;

import android.os.Build;
import com.facebook.redex.IDxFactoryShape405S0100000_2_I0;
import com.facebook.redex.IDxFactoryShape406S0100000_2_I0;
import com.facebook.redex.IDxFactoryShape407S0100000_1_I0;
import com.facebook.redex.IDxFactoryShape408S0100000_1_I0;
import com.mod.bomfab.R$styleable;

/* renamed from: X.2Yd  reason: invalid class name and case insensitive filesystem */
public final class C50142Yd implements AnonymousClass01J {
    public final int A00;
    public final C49132Rg A01;
    public final AnonymousClass2YU A02;
    public final C17050uS A03;
    public final C16150sX A04;

    public C50142Yd(C49132Rg r1, AnonymousClass2YU r2, C17050uS r3, C16150sX r4, int i2) {
        this.A04 = r4;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A00 = i2;
    }

    public Object get() {
        switch (this.A00) {
            case 0:
                return new AnonymousClass4CU(this);
            case 1:
                return new C82274Ce(this);
            case 2:
                return new C82314Ci(this);
            case 3:
                return new C82324Cj(this);
            case 4:
                return new C82334Ck(this);
            case 5:
                return new C82344Cl(this);
            case 6:
                return new C82354Cm(this);
            case 7:
                return new C82364Cn(this);
            case 8:
                return new C82374Co(this);
            case 9:
                return new AnonymousClass38U(this);
            case 10:
                return new AnonymousClass4CQ(this);
            case 11:
                return new IDxFactoryShape405S0100000_2_I0(this, 0);
            case 12:
                return new IDxFactoryShape406S0100000_2_I0(this, 0);
            case 13:
                return new IDxFactoryShape407S0100000_1_I0(this, 0);
            case 14:
                return new IDxFactoryShape408S0100000_1_I0(this, 0);
            case 15:
                return new AnonymousClass4CR(this);
            case 16:
                return new AnonymousClass38V(this);
            case 17:
                return new AnonymousClass4CS(this);
            case 18:
                return new AnonymousClass4CT(this);
            case 19:
                return new AnonymousClass4CV(this);
            case 20:
                return new AnonymousClass4CW(this);
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return new AnonymousClass4CX(this);
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return Build.VERSION.SDK_INT >= 24 ? new C101714xl() : new C101724xm();
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return new AnonymousClass4CY(this);
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return new C50132Yc(this);
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return new AnonymousClass4CZ(this);
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return new C82234Ca(this);
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return new C82244Cb(this);
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return new C82254Cc(this);
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return new C82264Cd(this);
            case 30:
                return new C82284Cf(this);
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                return new C82294Cg(this);
            case 32:
                C16150sX r2 = this.A04;
                return new AnonymousClass4J5(C17270uo.A00(r2.AEu), C17270uo.A00(r2.AMT));
            default:
                return new C82304Ch(this);
        }
    }
}
