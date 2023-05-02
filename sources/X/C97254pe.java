package X;

/* renamed from: X.4pe  reason: invalid class name and case insensitive filesystem */
public class C97254pe implements C109745Tk {
    public C108285Nj A7J(C32491gT r3) {
        String str = r3.A0T;
        if (str != null) {
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        return new C65493Uz();
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        return new AnonymousClass3V2();
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        return new AnonymousClass3V3((C108305Nl) null);
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        return new AnonymousClass3V0();
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        return new AnonymousClass3V1();
                    }
                    break;
            }
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Attempted to create decoder for unsupported MIME type: ")));
    }

    public boolean AgY(C32491gT r3) {
        String str = r3.A0T;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
