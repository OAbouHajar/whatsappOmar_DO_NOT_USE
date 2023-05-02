package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.apache.commons.io.IOUtils;

/* renamed from: X.4Qm  reason: invalid class name and case insensitive filesystem */
public final class C85914Qm {
    public final C16300so A00;
    public final C17190ug A01;

    public C85914Qm(C16300so r1, C17190ug r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final C89284bt A00(AnonymousClass4WK r11, C28371Vv r12) {
        RuntimeException runtimeException;
        RuntimeException runtimeException2;
        C83094Fi r5 = (C83094Fi) r11.A03.getValue();
        C16300so r4 = this.A00;
        C18450wi.A0H(r5, 1);
        ArrayList A0u = AnonymousClass000.A0u();
        try {
            C86994Uy r9 = new C86994Uy(r4, r12, r5);
            ArrayList A0u2 = AnonymousClass000.A0u();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (AnonymousClass4UY r0 : r9.A04) {
                UserJid userJid = r0.A00;
                C18450wi.A0B(userJid);
                C109095Qr r1 = r0.A02;
                if (r1 == null) {
                    A0u2.add(userJid);
                } else {
                    r1.A4M(new C83524Ha(userJid, linkedHashMap));
                }
            }
            C16050sL r6 = r9.A00;
            C18450wi.A0B(r6);
            return new C89284bt(r6, C003101j.A0A(A0u2), C25411Jr.A03(linkedHashMap));
        } catch (AnonymousClass1W9 e2) {
            A0u.add(AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("RemoveParticipantsResponseSuccess: ")));
            AnonymousClass4UX r02 = new AnonymousClass4UX(r4, r12, r5);
            AnonymousClass4HW r2 = new AnonymousClass4HW();
            r02.A02.A4K(r2);
            String str = r2.A00;
            if (str != null) {
                String str2 = r2.A01;
                if (str2 != null) {
                    return new C89284bt(str, str2);
                }
                runtimeException2 = C18450wi.A03("text");
            } else {
                runtimeException2 = C18450wi.A03("code");
            }
            throw runtimeException2;
        } catch (AnonymousClass1W9 e3) {
            A0u.add(AnonymousClass000.A0h(e3.getMessage(), AnonymousClass000.A0r("RemoveParticipantsResponseClientError: ")));
            try {
                AnonymousClass4U4 r03 = new AnonymousClass4U4(r4, r12, r5);
                AnonymousClass4HZ r22 = new AnonymousClass4HZ();
                r03.A01.A01.A4L(r22);
                String str3 = r22.A00;
                if (str3 != null) {
                    String str4 = r22.A01;
                    if (str4 != null) {
                        return new C89284bt(str3, str4);
                    }
                    runtimeException = C18450wi.A03("text");
                } else {
                    runtimeException = C18450wi.A03("code");
                }
                throw runtimeException;
            } catch (AnonymousClass1W9 e4) {
                A0u.add(AnonymousClass000.A0h(e4.getMessage(), AnonymousClass000.A0r("RemoveParticipantsResponseServerError: ")));
                throw new AnonymousClass1W9(AnonymousClass000.A0h(AnonymousClass1ZW.A0A(IOUtils.LINE_SEPARATOR_UNIX, A0u), AnonymousClass000.A0r("Could not parse stanza into valid response class, encountered the following errors for each possible response:\n")));
            }
        }
    }
}
