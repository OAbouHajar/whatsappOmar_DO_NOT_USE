package X;

import java.security.cert.CRLSelector;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4YB  reason: invalid class name */
public abstract class AnonymousClass4YB {
    public static Set A00(Date date, List list, List list2, AnonymousClass5AI r8) {
        HashSet A0o = C13680ns.A0o();
        try {
            A01(A0o, list2, r8);
            A01(A0o, list, r8);
            HashSet A0o2 = C13680ns.A0o();
            Iterator it = A0o.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                if (x509crl.getNextUpdate().after(date)) {
                    CRLSelector cRLSelector = r8.A01;
                    X509Certificate certificateChecking = cRLSelector instanceof X509CRLSelector ? ((X509CRLSelector) cRLSelector).getCertificateChecking() : null;
                    if (certificateChecking == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        A0o2.add(x509crl);
                    }
                }
            }
            return A0o2;
        } catch (C803243k e2) {
            throw C803243k.A00("Exception obtaining complete CRLs.", e2);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.util.HashSet r6, java.util.List r7, X.AnonymousClass5AI r8) {
        /*
            java.util.Iterator r5 = r7.iterator()
            r4 = 0
            r3 = 0
        L_0x0006:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r2 = r5.next()
            boolean r0 = r2 instanceof X.AnonymousClass5R4
            java.lang.String r1 = "Exception searching in X.509 CRL store."
            if (r0 == 0) goto L_0x0020
            X.5R4 r2 = (X.AnonymousClass5R4) r2
            java.util.Collection r0 = r2.ADM(r8)     // Catch:{ 5AU -> 0x0030 }
            r6.addAll(r0)     // Catch:{ 5AU -> 0x0030 }
            goto L_0x002e
        L_0x0020:
            java.security.cert.CertStore r2 = (java.security.cert.CertStore) r2
            X.5Bb r0 = new X.5Bb     // Catch:{  }
            r0.<init>(r8)     // Catch:{  }
            java.util.Collection r0 = r2.getCRLs(r0)     // Catch:{  }
            r6.addAll(r0)     // Catch:{  }
        L_0x002e:
            r3 = 1
            goto L_0x0006
        L_0x0030:
            r0 = move-exception
            X.43k r4 = X.C803243k.A00(r1, r0)
            goto L_0x0006
        L_0x0036:
            if (r3 != 0) goto L_0x003b
            if (r4 == 0) goto L_0x003b
            throw r4
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YB.A01(java.util.HashSet, java.util.List, X.5AI):void");
    }
}
