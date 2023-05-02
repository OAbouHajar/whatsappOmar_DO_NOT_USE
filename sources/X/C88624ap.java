package X;

/* renamed from: X.4ap  reason: invalid class name and case insensitive filesystem */
public final class C88624ap {
    public final C16440t3 A00;
    public final C31081dR A01;

    public C88624ap(C16440t3 r3, C31081dR r4) {
        this.A00 = r3;
        this.A01 = r4;
        C31091dS r1 = r4.A06;
        r1.A03 = r1.A03;
    }

    public static final String A00(String str) {
        switch (str.hashCode()) {
            case -1656096205:
                if (str.equals("consent_flow")) {
                    return "consent_flow";
                }
                break;
            case -1547048218:
                if (str.equals("pin_create")) {
                    return "pin_create";
                }
                break;
            case -1236338706:
                if (str.equals("add_card")) {
                    return "add_card";
                }
                break;
            case -791291370:
                if (str.equals("pin_confirm")) {
                    return "pin_confirm";
                }
                break;
            case -593273019:
                if (str.equals("user_detail")) {
                    return "user_detail";
                }
                break;
            case 115032:
                if (str.equals("tos")) {
                    return "tos";
                }
                break;
            case 128430571:
                if (str.equals("add_card_loading")) {
                    return "add_card_loading";
                }
                break;
            case 377959296:
                return !str.equals("user_address") ? "no_surface" : "user_address";
        }
    }

    public final void A01(String str, String str2, String str3, String str4) {
        String str5;
        if (!"no_surface".equals(str2)) {
            switch (str.hashCode()) {
                case -1546498888:
                    if (str.equals("end_trace_successful")) {
                        this.A01.A0C(2);
                        return;
                    }
                    return;
                case -1539401104:
                    str5 = "start_block";
                    break;
                case -649662132:
                    if (str.equals("annotate")) {
                        this.A01.A0A(str3, str4, false);
                        return;
                    }
                    return;
                case 106845584:
                    if (str.equals("point")) {
                        this.A01.A09(str2);
                        return;
                    }
                    return;
                case 1935958057:
                    str5 = "end_block";
                    break;
                default:
                    return;
            }
            if (str.equals(str5)) {
                this.A01.A08(str2);
            }
        }
    }
}
