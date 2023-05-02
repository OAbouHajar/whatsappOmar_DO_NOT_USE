package X;

import android.util.Pair;
import com.mod.bomfab.R$styleable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0z4  reason: invalid class name and case insensitive filesystem */
public class C19830z4 {
    public final C16000sG A00;
    public final C16440t3 A01;
    public final C19380yL A02;
    public final C15860rz A03;
    public final C19820z3 A04;
    public final C15810rt A05;
    public final C19780yz A06;
    public final C19810z2 A07;
    public final C14710pd A08;
    public final C16490t9 A09;
    public final C18040w3 A0A;
    public final C19790z0 A0B;
    public final C19800z1 A0C;
    public final C16220sf A0D;

    public C19830z4(C16000sG r1, C16440t3 r2, C19380yL r3, C15860rz r4, C19820z3 r5, C15810rt r6, C19780yz r7, C19810z2 r8, C14710pd r9, C16490t9 r10, C18040w3 r11, C19790z0 r12, C19800z1 r13, C16220sf r14) {
        this.A01 = r2;
        this.A08 = r9;
        this.A05 = r6;
        this.A09 = r10;
        this.A00 = r1;
        this.A06 = r7;
        this.A0D = r14;
        this.A03 = r4;
        this.A0A = r11;
        this.A0B = r12;
        this.A0C = r13;
        this.A07 = r8;
        this.A04 = r5;
        this.A02 = r3;
    }

    public static final int A00(C16010sH r2) {
        String str = r2.A0P;
        if (str == null || !str.startsWith("smb:")) {
            return r2.A0I() ? 3 : 1;
        }
        return 2;
    }

    public static final Integer A01(C16740tZ r3) {
        String str;
        int i2;
        if (!(r3 instanceof C30591cd) || (str = ((C30591cd) r3).AGV().A01) == null) {
            return null;
        }
        if ("TRANSACTIONAL".equals(str)) {
            i2 = 1;
        } else if ("NON_TRANSACTIONAL".equals(str)) {
            i2 = 2;
        } else if (!"OTP".equals(str)) {
            return 0;
        } else {
            i2 = 3;
        }
        return Integer.valueOf(i2);
    }

    public static Integer A02(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2046991529:
                    if (str.equals("overflow_menu_report")) {
                        return 4;
                    }
                    break;
                case -1882719533:
                    if (str.equals("account_info_report")) {
                        return 2;
                    }
                    break;
                case -1421455676:
                    if (str.equals("biz_spam_banner_block")) {
                        return 1;
                    }
                    break;
                case 3052376:
                    if (str.equals("chat")) {
                        return 0;
                    }
                    break;
            }
        }
        return 3;
    }

    public static final String A03(byte b2) {
        switch (b2) {
            case 0:
                return "undefined";
            case 1:
                return "image";
            case 2:
                return "audio";
            case 3:
                return "video";
            case 4:
                return "vcard";
            case 5:
                return "location";
            case 8:
                return "call";
            case 9:
                return "document";
            case 10:
                return "missed_call";
            case 13:
                return "gif";
            case 16:
                return "livelocation";
            case 19:
                return "hsm_rejected";
            case 20:
                return "sticker";
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return "product";
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return "group_invite";
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return "template_image";
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return "template_document";
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return "template_hsm";
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return "template_video";
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return "template_gif";
            case 30:
                return "template_location";
            case 32:
                return "template_quick_reply";
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                return "blank_reply";
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                return "catalog";
            case 42:
                return "view_once_image";
            case 43:
                return "view_once_video";
            case 44:
                return "order";
            case 49:
                return "buttons_response";
            case 51:
                return "payment_invite";
            case 52:
                return "product_list";
            case 54:
                return "checkout";
            case 55:
                return "interactive_message";
            case 56:
                return "reaction";
            case 57:
                return "interactive_image_message";
            case 58:
                return "invisible_hello";
            case 59:
                return "waffle_image";
            case 60:
                return "waffle_video";
            case 61:
                return "waffle_gif";
            case 62:
                return "interactive_video_message";
            case 63:
                return "interactive_document_message";
            case 65:
                return "payment_background_image";
            case 66:
                return "poll";
            case 67:
                return "poll_vote";
            case AnonymousClass2EA.A02 /*72*/:
                return "request_phone";
            case 73:
                return "share_phone_number";
            case 74:
                return "edited_message";
            default:
                return null;
        }
    }

    public final C16740tZ A04(C15830rv r4) {
        if (r4 == null) {
            return null;
        }
        List A042 = this.A06.A04(r4, 1);
        if (!A042.isEmpty()) {
            return (C16740tZ) ((Pair) A042.get(0)).first;
        }
        return null;
    }

    public final Long A05(C16740tZ r6) {
        if (r6 == null) {
            return null;
        }
        return Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(Math.max(this.A01.A00() - r6.A0I, 0)));
    }

    public final String A06(C16010sH r4) {
        C15830rv r0 = r4.A0E;
        if (r0 == null) {
            return null;
        }
        C18040w3 r2 = this.A0A;
        return C18040w3.A00(r2.A05(new Random()), r0.getRawString());
    }

    public synchronized void A07(C15830rv r9, C16740tZ r10, C16740tZ r11, byte b2, boolean z2) {
        int A002;
        synchronized (this) {
            C16010sH A082 = this.A00.A08(r9);
            if (!(A082 == null || (A002 = A00(A082)) == 1)) {
                int i2 = 1;
                if (this.A05.A0G(r9)) {
                    i2 = 2;
                }
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(A002);
                C14710pd r2 = this.A08;
                C16620tM r1 = C16620tM.A02;
                if (r2.A0E(r1, 2455)) {
                    C41341vd r4 = new C41341vd();
                    r4.A00 = valueOf;
                    r4.A01 = valueOf2;
                    r4.A09 = A06(A082);
                    r4.A08 = z2 ? "reaction" : A03(b2);
                    if (r11 != null) {
                        r4.A05 = A05(r11);
                        r4.A07 = A03(r11.A10);
                        r4.A03 = A01(r11);
                    }
                    if (r10 != null) {
                        r4.A02 = A01(r10);
                        r4.A04 = A05(r10);
                        r4.A06 = A03(r10.A10);
                    }
                    this.A09.A06(r4);
                }
                if (r11 != null) {
                    r10 = r11;
                }
                if (r2.A0E(r1, 2456) && r10 != null && (r10 instanceof C30591cd)) {
                    C30571cb r102 = (C30571cb) r10;
                    C41351ve r22 = new C41351ve();
                    r22.A02 = A05(r102);
                    Long l2 = null;
                    C15830rv r0 = A082.A0E;
                    if (r0 != null) {
                        l2 = Long.valueOf(r0.user);
                    }
                    r22.A01 = l2;
                    r22.A03 = r102.A00.A04;
                    r22.A00 = A01(r102);
                    this.A09.A06(r22);
                }
            }
        }
    }

    public synchronized void A08(C15830rv r10, String str, int i2, int i3) {
        C16010sH A082 = this.A00.A08(r10);
        if (A082 != null) {
            int A002 = A00(A082);
            C16740tZ A042 = A04(r10);
            Integer A012 = A01(A042);
            Long A052 = A05(A042);
            if (A002 != 1) {
                Integer valueOf = Integer.valueOf(A002);
                C14710pd r7 = this.A08;
                C16620tM r6 = C16620tM.A02;
                if (r7.A0E(r6, 2455)) {
                    C41281vX r2 = new C41281vX();
                    r2.A02 = Integer.valueOf(i2);
                    r2.A03 = Integer.valueOf(i3);
                    r2.A01 = A012;
                    r2.A00 = valueOf;
                    r2.A06 = A06(A082);
                    r2.A04 = A052;
                    r2.A05 = str;
                    this.A09.A06(r2);
                }
                if (r7.A0E(r6, 2456) && A042 != null && (A042 instanceof C30591cd)) {
                    C41291vY r22 = new C41291vY();
                    C30571cb r4 = (C30571cb) A042;
                    r22.A01 = Integer.valueOf(i2);
                    r22.A02 = Integer.valueOf(i3);
                    r22.A04 = A052;
                    Long l2 = null;
                    C15830rv r0 = A082.A0E;
                    if (r0 != null) {
                        l2 = Long.valueOf(r0.user);
                    }
                    r22.A03 = l2;
                    r22.A05 = r4.A00.A04;
                    r22.A00 = A012;
                    this.A09.A06(r22);
                }
            }
        }
    }

    public synchronized void A09(C15830rv r12, Collection collection, int i2) {
        C16010sH A082;
        int A002;
        if (collection != null) {
            C16010sH A083 = this.A00.A08(r12);
            if (!(A083 == null || (A002 = A00(A083)) == 1)) {
                int i3 = 1;
                if (this.A05.A0G(r12)) {
                    i3 = 2;
                }
                Integer valueOf = Integer.valueOf(i3);
                String A062 = A06(A083);
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C16740tZ r5 = (C16740tZ) it.next();
                    if (!r5.A11.A02) {
                        Integer A012 = A01(r5);
                        C14710pd r3 = this.A08;
                        C16620tM r2 = C16620tM.A02;
                        if (r3.A0E(r2, 2455)) {
                            C41311va r1 = new C41311va();
                            r1.A01 = Integer.valueOf(A002);
                            r1.A00 = valueOf;
                            r1.A03 = Integer.valueOf(i2);
                            r1.A04 = A05(r5);
                            r1.A02 = A01(r5);
                            r1.A05 = A03(r5.A10);
                            r1.A06 = A062;
                            r1.A02 = A012;
                            this.A09.A06(r1);
                        }
                        if (r3.A0E(r2, 2456) && (r5 instanceof C30591cd)) {
                            C30571cb r32 = (C30571cb) r5;
                            C41321vb r22 = new C41321vb();
                            r22.A00 = valueOf;
                            r22.A02 = Integer.valueOf(i2);
                            r22.A04 = A05(r5);
                            Long l2 = null;
                            C15830rv r0 = A083.A0E;
                            if (r0 != null) {
                                l2 = Long.valueOf(r0.user);
                            }
                            r22.A03 = l2;
                            r22.A05 = r32.A00.A04;
                            r22.A01 = A012;
                            this.A09.A06(r22);
                        }
                    }
                }
            }
        }
        C19800z1 r33 = this.A0C;
        if ((!r33.A04.isEmpty()) && (A082 = r33.A00.A08(r12)) != null && A082.A0I() && collection != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                C16740tZ r13 = (C16740tZ) it2.next();
                if (r33.A01(r13)) {
                    r33.A03.A06(r33.A00(r12, (C30591cd) r13, 2));
                }
            }
        }
    }

    public synchronized void A0A(Integer num, Collection collection) {
        C16010sH A082;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C16740tZ r5 = (C16740tZ) it.next();
                C15830rv r3 = r5.A11.A00;
                if (!(r3 == null || !this.A08.A0E(C16620tM.A02, 2456) || !(r5 instanceof C30591cd) || (A082 = this.A00.A08(r3)) == null || A00(A082) == 1)) {
                    C30571cb r32 = (C30571cb) r5;
                    C41301vZ r2 = new C41301vZ();
                    r2.A00 = num;
                    Long l2 = null;
                    C15830rv r0 = A082.A0E;
                    if (r0 != null) {
                        l2 = Long.valueOf(r0.user);
                    }
                    r2.A02 = l2;
                    r2.A04 = r32.A00.A04;
                    r2.A03 = A05(r5);
                    r2.A01 = A01(r5);
                    this.A09.A06(r2);
                }
            }
        }
    }
}
