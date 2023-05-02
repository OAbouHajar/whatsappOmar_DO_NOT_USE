package X;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.5Ba  reason: invalid class name and case insensitive filesystem */
public class C105745Ba extends X509CRLEntry {
    public AnonymousClass5IQ A00;
    public AnonymousClass5Hq A01;
    public volatile int A02;
    public volatile boolean A03;

    public C105745Ba(AnonymousClass5IQ r6, AnonymousClass5Hq r7, boolean z2) {
        AnonymousClass5IH A002;
        this.A01 = r7;
        AnonymousClass5IQ r4 = null;
        if (z2) {
            C32041fY r1 = AnonymousClass5IH.A0A;
            C107335Hu A032 = r7.A03();
            if (A032 == null || (A002 = C107335Hu.A00(r1, A032)) == null) {
                r4 = r6;
            } else {
                try {
                    AnonymousClass5IP[] A033 = AnonymousClass5IG.A00(A002.A03()).A03();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= A033.length) {
                            break;
                        } else if (A033[i2].A00 == 4) {
                            r4 = AnonymousClass5IQ.A01(A033[i2].A01);
                            break;
                        } else {
                            i2++;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        this.A00 = r4;
    }

    public final Set A00(boolean z2) {
        C107335Hu A032 = this.A01.A03();
        if (A032 == null) {
            return null;
        }
        HashSet A0o = C13680ns.A0o();
        Enumeration elements = A032.A01.elements();
        while (elements.hasMoreElements()) {
            C32041fY r1 = (C32041fY) elements.nextElement();
            if (z2 == C107335Hu.A00(r1, A032).A02) {
                A0o.add(r1.A01);
            }
        }
        return A0o;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C105745Ba)) {
            return super.equals(this);
        }
        C105745Ba r3 = (C105745Ba) obj;
        if (!this.A03 || !r3.A03 || this.A02 == r3.A02) {
            return this.A01.equals(r3.A01);
        }
        return false;
    }

    public X500Principal getCertificateIssuer() {
        AnonymousClass5IQ r0 = this.A00;
        if (r0 == null) {
            return null;
        }
        try {
            return new X500Principal(r0.A01());
        } catch (IOException unused) {
            return null;
        }
    }

    public Set getCriticalExtensionOIDs() {
        return A00(true);
    }

    public byte[] getEncoded() {
        try {
            return this.A01.A02("DER");
        } catch (IOException e2) {
            throw new CRLException(e2.toString());
        }
    }

    public byte[] getExtensionValue(String str) {
        C32041fY A0w = AnonymousClass3K3.A0w(str);
        C107335Hu A032 = this.A01.A03();
        AnonymousClass5IH A002 = A032 != null ? C107335Hu.A00(A0w, A032) : null;
        if (A002 == null) {
            return null;
        }
        try {
            return A002.A01.A01();
        } catch (Exception e2) {
            throw AnonymousClass000.A0V(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("Exception encoding: ")));
        }
    }

    public Set getNonCriticalExtensionOIDs() {
        return A00(false);
    }

    public Date getRevocationDate() {
        return AnonymousClass5IO.A00(AnonymousClass3K4.A0h(this.A01.A00)).A04();
    }

    public BigInteger getSerialNumber() {
        return new BigInteger(C33041hq.A00(AnonymousClass3K3.A0u(this.A01.A00)).A01);
    }

    public boolean hasExtensions() {
        return AnonymousClass000.A1V(this.A01.A03());
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        if (!this.A03) {
            this.A02 = super.hashCode();
            this.A03 = true;
        }
        return this.A02;
    }

    public String toString() {
        Object A002;
        StringBuffer stringBuffer = new StringBuffer();
        String str = C32941ha.A00;
        stringBuffer.append("      userCertificate: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(str);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(str);
        C107335Hu A032 = this.A01.A03();
        if (A032 != null) {
            Enumeration elements = A032.A01.elements();
            if (elements.hasMoreElements()) {
                String str2 = "   crlEntryExtensions:";
                loop0:
                while (true) {
                    stringBuffer.append(str2);
                    while (true) {
                        stringBuffer.append(str);
                        while (true) {
                            if (!elements.hasMoreElements()) {
                                break loop0;
                            }
                            C32041fY r5 = (C32041fY) elements.nextElement();
                            AnonymousClass5IH A003 = C107335Hu.A00(r5, A032);
                            C107405Ib r0 = A003.A01;
                            if (r0 != null) {
                                C33011hn A004 = C107405Ib.A00(stringBuffer, r0, A003);
                                try {
                                    if (r5.A04(AnonymousClass5IH.A0T)) {
                                        A002 = AnonymousClass5ID.A00(AnonymousClass5IZ.A00(A004.A05()));
                                    } else if (r5.A04(AnonymousClass5IH.A0A)) {
                                        stringBuffer.append("Certificate issuer: ");
                                        A002 = AnonymousClass5IG.A00(A004.A05());
                                    } else {
                                        stringBuffer.append(r5.A01);
                                        stringBuffer.append(" value = ");
                                        stringBuffer.append(AnonymousClass4YA.A00(A004.A05()));
                                        stringBuffer.append(str);
                                    }
                                    stringBuffer.append(A002);
                                    stringBuffer.append(str);
                                } catch (Exception unused) {
                                    stringBuffer.append(r5.A01);
                                    stringBuffer.append(" value = ");
                                    str2 = "*****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
