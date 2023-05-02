package X;

/* renamed from: X.1kz  reason: invalid class name and case insensitive filesystem */
public enum C34861kz {
    A0J(r4, "REGISTRATION_FULL", 0, 0),
    A0B(r4, "INTERACTIVE_FULL", 1, 1),
    A09(r4, "INTERACTIVE_DELTA", 2, 2),
    A03(r4, "BACKGROUND_FULL", 3, 3),
    A02(r4, "BACKGROUND_DELTA", 4, 4),
    A0F(r29, "NOTIFICATION_CONTACT", 5, 5),
    A0D(r29, "INTERACTIVE_QUERY", 6, 6),
    A0H(r41, "NOTIFICATION_SIDELIST", 7, 7),
    A0A(r41, "INTERACTIVE_DELTA_SIDELIST", 8, 8),
    A01(r29, "ADD_QUERY", 9, 9),
    A06(r49, "BACKGROUND_QUERY_PICTURES", 10, 16),
    A07(r49, "BACKGROUND_QUERY_PICTURES_PREVIEW", 11, 17),
    A0I(r49, "OUT_CONTACT_DISCOVERY", 12, 19),
    A08(r49, "CONTACT_DISCOVERY_DELTA", 13, 20),
    A05(r49, "BACKGROUND_MULTI_PROTOCOL_QUERY", 14, 21),
    A04(r49, "BACKGROUND_FULL_MULTI_PROTOCOL_QUERY", 15, 22),
    A0K(r49, "REGISTRATION_FULL_MULTI_PROTOCOL_QUERY", 16, 23),
    A0C(r49, "INTERACTIVE_MULTI_PROTOCOL_QUERY", 17, 24),
    A0E(r49, "MESSAGE_MULTI_PROTOCOL_QUERY", 18, 25),
    A0L(r49, "VOIP_MULTI_PROTOCOL_QUERY", 19, 26),
    A0G(r49, "NOTIFICATION_MULTI_PROTOCOL_QUERY", 20, 27);
    
    public final int code;
    public final C453227y context;
    public final C453327z mode;
    public final AnonymousClass28R scope;

    /* access modifiers changed from: public */
    C34861kz(AnonymousClass28R r3, String str, int i2, int i3) {
        this.context = r1;
        this.mode = r2;
        this.scope = r3;
        this.code = i3;
    }
}
