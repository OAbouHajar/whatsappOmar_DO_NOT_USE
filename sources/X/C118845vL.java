package X;

import android.os.Build;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.calling.crypto.DefaultCryptoCallback;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5vL  reason: invalid class name and case insensitive filesystem */
public class C118845vL {
    public double A00;
    public double A01;
    public double A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public long A0O;
    public long A0P;
    public AnonymousClass5vQ A0Q;
    public AnonymousClass5vQ A0R;
    public AnonymousClass5vQ A0S;
    public AnonymousClass5vQ A0T;
    public AnonymousClass5vQ A0U;
    public String A0V;
    public HashMap A0W = AnonymousClass000.A0x();
    public List A0X;
    public List A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public boolean A12;
    public boolean A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public boolean A17;
    public boolean A18;
    public boolean A19;
    public boolean A1A;
    public boolean A1B;
    public boolean A1C;
    public boolean A1D;
    public boolean A1E;
    public boolean A1F;
    public boolean A1G;
    public boolean A1H;
    public boolean A1I;
    public boolean A1J;
    public boolean A1K;
    public boolean A1L;
    public boolean A1M;
    public boolean A1N;
    public boolean A1O;
    public boolean A1P;
    public boolean A1Q;
    public boolean A1R;
    public boolean A1S;
    public boolean A1T;
    public boolean A1U;
    public boolean A1V;
    public boolean A1W;
    public boolean A1X;
    public boolean A1Y;
    public float[] A1Z;
    public int[] A1a;
    public int[] A1b;

    public C117775tX A00() {
        if (!this.A1D || !this.A1U) {
            return new C117775tX(this);
        }
        throw AnonymousClass000.A0V("Unable to build setting modifications, video stabilization will not work correctly if optical stabilization is also enabled, please enable one at a time only.");
    }

    public void A01(C115835qO r5, Object obj) {
        String str;
        int i2 = r5.A00;
        switch (i2) {
            case 2:
                this.A14 = AnonymousClass000.A1X(obj);
                this.A15 = true;
                return;
            case 3:
                this.A1U = AnonymousClass000.A1X(obj);
                this.A1V = true;
                return;
            case 4:
                this.A1D = AnonymousClass000.A1X(obj);
                this.A1E = true;
                return;
            case 5:
                this.A0x = AnonymousClass000.A1X(obj);
                this.A0y = true;
                return;
            case 6:
                this.A0c = AnonymousClass000.A1X(obj);
                this.A0d = true;
                return;
            case 8:
                this.A1O = AnonymousClass000.A1X(obj);
                this.A1P = true;
                return;
            case 9:
                this.A0C = AnonymousClass000.A0D(obj);
                this.A0w = true;
                return;
            case 10:
                this.A0B = AnonymousClass000.A0D(obj);
                this.A0u = true;
                return;
            case 11:
                this.A06 = AnonymousClass000.A0D(obj);
                this.A0Z = true;
                return;
            case 12:
                this.A08 = AnonymousClass000.A0D(obj);
                this.A0n = true;
                return;
            case 13:
                this.A0A = AnonymousClass000.A0D(obj);
                this.A0q = true;
                return;
            case 14:
                this.A0E = AnonymousClass000.A0D(obj);
                this.A18 = true;
                return;
            case 15:
                this.A0F = AnonymousClass000.A0D(obj);
                this.A19 = true;
                return;
            case 17:
                this.A0H = AnonymousClass000.A0D(obj);
                this.A1G = true;
                return;
            case 18:
                this.A0I = AnonymousClass000.A0D(obj);
                this.A1I = true;
                return;
            case 19:
                this.A0J = AnonymousClass000.A0D(obj);
                this.A1K = true;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                this.A0G = AnonymousClass000.A0D(obj);
                this.A1F = true;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                this.A0D = AnonymousClass000.A0D(obj);
                this.A17 = true;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                this.A0K = AnonymousClass000.A0D(obj);
                this.A1Q = true;
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                this.A0M = AnonymousClass000.A0D(obj);
                this.A1W = true;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                this.A0N = AnonymousClass000.A0D(obj);
                this.A1Y = true;
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                this.A05 = AnonymousClass000.A04(obj);
                this.A1R = true;
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                this.A0P = C13700nu.A01(obj);
                this.A13 = true;
                return;
            case 30:
                this.A00 = ((Number) obj).doubleValue();
                this.A0z = true;
                return;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                this.A02 = ((Number) obj).doubleValue();
                this.A11 = true;
                return;
            case 32:
                this.A01 = ((Number) obj).doubleValue();
                this.A10 = true;
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                this.A0S = (AnonymousClass5vQ) obj;
                this.A1L = true;
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                this.A0R = (AnonymousClass5vQ) obj;
                this.A1H = true;
                return;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                this.A0T = (AnonymousClass5vQ) obj;
                this.A1T = true;
                return;
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                this.A0Q = (AnonymousClass5vQ) obj;
                this.A1A = true;
                return;
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                this.A0X = C119115vz.A00((List) obj);
                this.A0v = true;
                return;
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                this.A0Y = C119115vz.A00((List) obj);
                this.A1C = true;
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    this.A1b = new int[]{iArr[0], iArr[1]};
                    this.A1J = true;
                    return;
                }
                return;
            case 42:
                this.A0V = (String) obj;
                this.A12 = true;
                return;
            case 44:
                this.A0r = AnonymousClass000.A1X(obj);
                this.A0s = true;
                return;
            case 45:
                this.A0e = AnonymousClass000.A1X(obj);
                this.A0f = true;
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH:
                this.A0O = C13700nu.A01(obj);
                this.A0t = true;
                return;
            case 47:
                this.A09 = AnonymousClass000.A0D(obj);
                this.A0o = true;
                return;
            case 48:
                this.A03 = AnonymousClass000.A04(obj);
                this.A0a = true;
                return;
            case 49:
                if (Build.VERSION.SDK_INT >= 21) {
                    float[] fArr = (float[]) obj;
                    if (fArr != null && fArr.length != 4) {
                        str = "Color Correction Gains invalid length";
                        break;
                    } else {
                        this.A1Z = fArr;
                        this.A0k = true;
                        return;
                    }
                } else {
                    return;
                }
                break;
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS:
                this.A07 = AnonymousClass000.A0D(obj);
                this.A0l = true;
                return;
            case 51:
                if (Build.VERSION.SDK_INT >= 21) {
                    int[] iArr2 = (int[]) obj;
                    if (iArr2 != null && iArr2.length != 18) {
                        str = "Color Correction Transform invalid length";
                        break;
                    } else {
                        this.A1a = iArr2;
                        this.A0m = true;
                        return;
                    }
                } else {
                    return;
                }
            case 52:
                this.A0p = true;
                return;
            case 53:
                this.A0g = AnonymousClass000.A1X(obj);
                this.A0h = true;
                return;
            case 54:
                this.A04 = AnonymousClass000.A04(obj);
                this.A1B = true;
                return;
            case 55:
                this.A0W = (HashMap) obj;
                this.A0b = true;
                return;
            case 56:
                this.A0i = AnonymousClass000.A1X(obj);
                this.A0j = true;
                return;
            case 57:
                this.A16 = AnonymousClass000.A1X(obj);
                return;
            case 58:
                this.A0U = (AnonymousClass5vQ) obj;
                this.A1X = true;
                return;
            case 59:
                this.A0L = AnonymousClass000.A0D(obj);
                this.A1S = true;
                return;
            case 60:
                this.A1M = AnonymousClass000.A1X(obj);
                this.A1N = true;
                return;
            default:
                throw AnonymousClass000.A0a(C13680ns.A0c(i2, "Invalid Settings key: "));
        }
        throw AnonymousClass000.A0T(str);
    }
}
