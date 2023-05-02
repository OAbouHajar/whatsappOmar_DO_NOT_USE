package X;

import android.graphics.Rect;
import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5fT  reason: invalid class name and case insensitive filesystem */
public final class C111185fT extends AnonymousClass5wI implements Cloneable {
    public Rect A00;
    public Rect A01;
    public AnonymousClass5vQ A02;
    public AnonymousClass5vQ A03;
    public AnonymousClass5vQ A04;
    public AnonymousClass5vQ A05;
    public AnonymousClass5vQ A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Double A0J;
    public Double A0K;
    public Double A0L;
    public Float A0M;
    public Float A0N;
    public Float A0O = Float.valueOf(-1.0f);
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public Integer A0d;
    public Integer A0e;
    public Long A0f;
    public Long A0g;
    public String A0h;
    public HashMap A0i;
    public List A0j;
    public List A0k;
    public float[] A0l;
    public int[] A0m;
    public final AnonymousClass5wJ A0n;
    public final int[] A0o;

    public C111185fT(AnonymousClass5wJ r7) {
        Integer A0X2 = C13680ns.A0X();
        this.A0U = A0X2;
        this.A0e = A0X2;
        this.A0T = A0X2;
        Boolean bool = Boolean.FALSE;
        this.A0H = bool;
        this.A0E = bool;
        this.A0F = bool;
        this.A0G = bool;
        this.A0A = bool;
        this.A0I = bool;
        this.A0D = bool;
        this.A07 = bool;
        this.A0i = AnonymousClass000.A0x();
        this.A0C = bool;
        Boolean bool2 = Boolean.TRUE;
        this.A08 = bool2;
        this.A0o = new int[2];
        this.A0V = A0X2;
        this.A0d = -1;
        this.A0P = A0X2;
        this.A0R = A0X2;
        this.A0X = A0X2;
        this.A0Y = A0X2;
        this.A0a = A0X2;
        this.A0b = A0X2;
        this.A0Z = A0X2;
        this.A0W = A0X2;
        Long A0Z2 = AnonymousClass3K2.A0Z();
        this.A0f = A0Z2;
        Float valueOf = Float.valueOf(0.0f);
        this.A0M = valueOf;
        Integer A0Y2 = C13680ns.A0Y();
        this.A0Q = A0Y2;
        this.A0c = A0X2;
        this.A0S = A0Y2;
        this.A0g = A0Z2;
        Double valueOf2 = Double.valueOf(0.0d);
        this.A0J = valueOf2;
        this.A0L = valueOf2;
        this.A0K = valueOf2;
        this.A0h = "";
        List list = Collections.EMPTY_LIST;
        this.A0j = list;
        this.A0k = list;
        this.A09 = bool2;
        this.A0N = valueOf;
        this.A0B = bool;
        this.A0n = r7;
    }

    public static void A00(C111185fT r1, C115835qO r2, int i2) {
        r1.A06(r2, Integer.valueOf(i2));
    }

    public static void A01(C111185fT r1, C115835qO r2, boolean z2) {
        r1.A06(r2, Boolean.valueOf(z2));
    }

    public void A06(C115835qO r6, Object obj) {
        int i2 = r6.A00;
        Rect rect = null;
        int i3 = 0;
        switch (i2) {
            case 2:
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0G, this.A0n)) {
                    boolean A1X = AnonymousClass000.A1X(obj);
                    if (A1X) {
                        i3 = 17;
                    }
                    A00(this, AnonymousClass5wI.A0o, i3);
                    if (A1X) {
                        A06(AnonymousClass5wI.A0n, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A0H = (Boolean) obj;
                return;
            case 4:
                this.A0E = (Boolean) obj;
                return;
            case 5:
                this.A0D = (Boolean) obj;
                return;
            case 6:
                this.A07 = (Boolean) obj;
                return;
            case 8:
                this.A0G = (Boolean) obj;
                return;
            case 9:
                this.A0V = (Integer) obj;
                return;
            case 10:
                int A0D2 = AnonymousClass000.A0D(obj);
                if (A0D2 != -1) {
                    i3 = A0D2;
                }
                this.A0U = Integer.valueOf(i3);
                return;
            case 11:
                this.A0P = (Integer) obj;
                return;
            case 12:
                this.A0R = (Integer) obj;
                return;
            case 13:
                this.A0T = (Integer) obj;
                return;
            case 14:
                this.A0X = (Integer) obj;
                return;
            case 15:
                this.A0Y = (Integer) obj;
                return;
            case 17:
                this.A0a = (Integer) obj;
                return;
            case 18:
            case 52:
                return;
            case 19:
                this.A0b = (Integer) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                this.A0Z = (Integer) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                this.A0W = (Integer) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                this.A0c = (Integer) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                this.A0d = (Integer) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                this.A0e = (Integer) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                this.A0O = (Float) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                this.A0g = (Long) obj;
                return;
            case 30:
                this.A0J = (Double) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                this.A0L = (Double) obj;
                return;
            case 32:
                this.A0K = (Double) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                AnonymousClass5vQ r7 = (AnonymousClass5vQ) obj;
                this.A04 = r7;
                if (r7 != null) {
                    rect = new Rect(0, 0, r7.A02, r7.A01);
                }
                this.A01 = rect;
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                AnonymousClass5vQ r72 = (AnonymousClass5vQ) obj;
                this.A03 = r72;
                if (r72 != null) {
                    rect = new Rect(0, 0, r72.A02, r72.A01);
                }
                this.A00 = rect;
                return;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                this.A05 = (AnonymousClass5vQ) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                this.A02 = (AnonymousClass5vQ) obj;
                return;
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                this.A0j = C119115vz.A00((List) obj);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                this.A0k = C119115vz.A00((List) obj);
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    int[] iArr2 = this.A0o;
                    iArr2[0] = iArr[0];
                    iArr2[1] = iArr[1];
                    return;
                }
                return;
            case 42:
                this.A0h = (String) obj;
                return;
            case 44:
                this.A0C = (Boolean) obj;
                return;
            case 45:
                this.A08 = (Boolean) obj;
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH:
                this.A0f = (Long) obj;
                return;
            case 47:
                this.A0S = (Integer) obj;
                return;
            case 48:
                this.A0M = (Float) obj;
                return;
            case 49:
                if (Build.VERSION.SDK_INT >= 21) {
                    this.A0l = (float[]) obj;
                    return;
                }
                return;
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS:
                this.A0Q = (Integer) obj;
                return;
            case 51:
                if (Build.VERSION.SDK_INT >= 21) {
                    this.A0m = (int[]) obj;
                    return;
                }
                return;
            case 53:
                this.A09 = (Boolean) obj;
                return;
            case 54:
                this.A0N = (Float) obj;
                return;
            case 55:
                this.A0i = (HashMap) obj;
                return;
            case 56:
                this.A0B = (Boolean) obj;
                return;
            case 58:
                this.A06 = (AnonymousClass5vQ) obj;
                return;
            case 60:
                this.A0F = (Boolean) obj;
                return;
            default:
                throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Cannot directly set: "));
        }
    }

    public boolean A07(C117775tX r5) {
        boolean z2;
        if (r5.A0u) {
            A00(this, AnonymousClass5wI.A0A, r5.A0C);
            z2 = true;
        } else {
            z2 = false;
        }
        if (r5.A0q) {
            A00(this, AnonymousClass5wI.A08, r5.A0B);
            z2 = true;
        }
        if (r5.A15) {
            A01(this, AnonymousClass5wI.A0T, r5.A14);
            z2 = true;
        }
        if (r5.A1V) {
            A01(this, AnonymousClass5wI.A0W, r5.A1U);
            z2 = true;
        }
        if (r5.A1N) {
            A01(this, AnonymousClass5wI.A0V, r5.A1M);
            z2 = true;
        }
        if (r5.A1E) {
            A01(this, AnonymousClass5wI.A0U, r5.A1D);
            z2 = true;
        }
        if (r5.A1P) {
            A01(this, AnonymousClass5wI.A0n, r5.A1O);
            z2 = true;
        }
        if (r5.A1K) {
            A00(this, AnonymousClass5wI.A0k, r5.A0K);
            z2 = true;
        }
        if (r5.A1J) {
            A06(AnonymousClass5wI.A0j, r5.A1b);
            z2 = true;
        }
        if (r5.A0w) {
            A00(this, AnonymousClass5wI.A0C, r5.A0D);
            z2 = true;
        }
        if (r5.A00) {
            A01(this, AnonymousClass5wI.A0L, r5.A0h);
            z2 = true;
        }
        if (r5.A1B) {
            A06(AnonymousClass5wI.A0a, Float.valueOf(r5.A05));
            z2 = true;
        }
        if (r5.A0y) {
            A01(this, AnonymousClass5wI.A0R, r5.A0x);
            z2 = true;
        }
        if (r5.A0e) {
            A01(this, AnonymousClass5wI.A0J, r5.A0d);
            z2 = true;
        }
        if (r5.A0c) {
            A06(AnonymousClass5wI.A02, r5.A0X);
            z2 = true;
        }
        if (r5.A1W) {
            A00(this, AnonymousClass5wI.A0t, r5.A0N);
            z2 = true;
        }
        if (r5.A0a) {
            A00(this, AnonymousClass5wI.A00, r5.A07);
            z2 = true;
        }
        if (r5.A0n) {
            A00(this, AnonymousClass5wI.A06, r5.A09);
            z2 = true;
        }
        if (r5.A18) {
            A00(this, AnonymousClass5wI.A0X, r5.A0F);
            z2 = true;
        }
        if (r5.A19) {
            A00(this, AnonymousClass5wI.A0Y, r5.A0G);
            z2 = true;
        }
        if (r5.A1A) {
            A06(AnonymousClass5wI.A0Z, r5.A0R);
            z2 = true;
        }
        if (r5.A1G) {
            A00(this, AnonymousClass5wI.A0e, r5.A0I);
            z2 = true;
        }
        if (r5.A1F) {
            A00(this, AnonymousClass5wI.A0c, r5.A0H);
            z2 = true;
        }
        if (r5.A17) {
            A00(this, AnonymousClass5wI.A0I, r5.A0E);
            z2 = true;
        }
        if (r5.A0t) {
            A06(AnonymousClass5wI.A09, Long.valueOf(r5.A0P));
            z2 = true;
        }
        if (r5.A0o) {
            A00(this, AnonymousClass5wI.A07, r5.A0A);
            z2 = true;
        }
        if (r5.A0b) {
            A06(AnonymousClass5wI.A01, Float.valueOf(r5.A04));
            z2 = true;
        }
        if (r5.A0k) {
            A06(AnonymousClass5wI.A03, r5.A1Z);
            z2 = true;
        }
        if (r5.A0l) {
            A00(this, AnonymousClass5wI.A04, r5.A08);
            z2 = true;
        }
        if (r5.A0m) {
            A06(AnonymousClass5wI.A05, r5.A1a);
            z2 = true;
        }
        if (r5.A1Q) {
            A00(this, AnonymousClass5wI.A0o, r5.A0L);
            z2 = true;
        }
        if (r5.A1Y) {
            A00(this, AnonymousClass5wI.A0v, r5.A0O);
            z2 = true;
        }
        if (r5.A1R) {
            A06(AnonymousClass5wI.A0p, Float.valueOf(r5.A06));
            z2 = true;
        }
        if (r5.A13) {
            A06(AnonymousClass5wI.A0H, Long.valueOf(r5.A0Q));
            z2 = true;
        }
        if (r5.A0z) {
            A06(AnonymousClass5wI.A0D, Double.valueOf(r5.A01));
            z2 = true;
        }
        if (r5.A11) {
            A06(AnonymousClass5wI.A0F, Double.valueOf(r5.A03));
            z2 = true;
        }
        if (r5.A10) {
            A06(AnonymousClass5wI.A0E, Double.valueOf(r5.A02));
            z2 = true;
        }
        if (r5.A12) {
            A06(AnonymousClass5wI.A0G, r5.A0W);
            z2 = true;
        }
        if (r5.A0v) {
            A06(AnonymousClass5wI.A0B, r5.A0Y);
            z2 = true;
        }
        if (r5.A1C) {
            A06(AnonymousClass5wI.A0b, r5.A0Z);
            z2 = true;
        }
        if (r5.A1L) {
            A06(AnonymousClass5wI.A0m, r5.A0T);
            z2 = true;
        }
        if (r5.A1H) {
            A06(AnonymousClass5wI.A0g, r5.A0S);
            z2 = true;
        }
        if (r5.A1X) {
            A06(AnonymousClass5wI.A0u, r5.A0V);
            z2 = true;
        }
        if (r5.A1T) {
            A06(AnonymousClass5wI.A0s, r5.A0U);
            z2 = true;
        }
        if (r5.A0s) {
            A01(this, AnonymousClass5wI.A0P, r5.A0r);
            z2 = true;
        }
        if (r5.A0g) {
            A01(this, AnonymousClass5wI.A0K, r5.A0f);
            z2 = true;
        }
        if (r5.A0p) {
            A06(AnonymousClass5wI.A0h, (Object) null);
            z2 = true;
        }
        if (!r5.A0j) {
            return z2;
        }
        A01(this, AnonymousClass5wI.A0N, r5.A0i);
        return true;
    }

    public Object clone() {
        return super.clone();
    }
}
