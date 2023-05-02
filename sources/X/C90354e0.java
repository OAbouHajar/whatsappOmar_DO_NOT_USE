package X;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLConnection;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRL;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.naming.NamingException;
import javax.naming.directory.InitialDirContext;

/* renamed from: X.4e0  reason: invalid class name and case insensitive filesystem */
public class C90354e0 {
    public static Map A00 = Collections.synchronizedMap(new WeakHashMap());

    public static Collection A00(URI uri, CertificateFactory certificateFactory) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("java.naming.factory.initial", "com.sun.jndi.ldap.LdapCtxFactory");
        hashtable.put("java.naming.provider.url", uri.toString());
        try {
            byte[] bArr = (byte[]) new InitialDirContext(hashtable).getAttributes("").get("certificateRevocationList;binary").get();
            if (bArr != null && bArr.length != 0) {
                return certificateFactory.generateCRLs(new ByteArrayInputStream(bArr));
            }
            throw new CRLException(AnonymousClass000.A0g("no CRL returned from: ", uri));
        } catch (NamingException e2) {
            throw new CRLException(AnonymousClass000.A0h(uri.toString(), AnonymousClass000.A0r("issue connecting to: ")), e2);
        }
    }

    public static synchronized AnonymousClass5AJ A01(URI uri, CertificateFactory certificateFactory, Date date) {
        Collection<? extends CRL> generateCRLs;
        AnonymousClass5AJ r3;
        synchronized (C90354e0.class) {
            Map map = A00;
            WeakReference weakReference = (WeakReference) map.get(uri);
            if (!(weakReference == null || (r3 = (AnonymousClass5AJ) weakReference.get()) == null)) {
                Iterator it = C13680ns.A0n(r3.A00).iterator();
                while (it.hasNext()) {
                    Date nextUpdate = ((X509CRL) it.next()).getNextUpdate();
                    if (nextUpdate == null || !nextUpdate.before(date)) {
                    }
                }
                return r3;
            }
            if (uri.getScheme().equals("ldap")) {
                generateCRLs = A00(uri, certificateFactory);
            } else {
                URLConnection openConnection = uri.toURL().openConnection();
                openConnection.setConnectTimeout(15000);
                openConnection.setReadTimeout(15000);
                InputStream inputStream = openConnection.getInputStream();
                generateCRLs = certificateFactory.generateCRLs(inputStream);
                inputStream.close();
            }
            AnonymousClass5AJ r1 = new AnonymousClass5AJ(new AnonymousClass5AK(generateCRLs));
            map.put(uri, C13690nt.A0h(r1));
            return r1;
        }
    }
}
