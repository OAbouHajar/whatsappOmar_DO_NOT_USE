package X;

import com.obwhatsapp.net.tls13.WtCachedPsk;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.CertificateException;
import javax.security.cert.X509Certificate;

/* renamed from: X.1aT  reason: invalid class name and case insensitive filesystem */
public class C29341aT implements SSLSession {
    public int A00;
    public long A01;
    public long A02;
    public WtCachedPsk A03;
    public C219916f A04;
    public String A05;
    public String A06;
    public LinkedHashSet A07 = new LinkedHashSet();
    public Map A08 = new HashMap();
    public boolean A09 = true;
    public byte[] A0A;
    public Certificate[] A0B;
    public final Map A0C = new HashMap();

    public C29341aT(C219916f r3, String str, String str2, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        this.A02 = currentTimeMillis;
        this.A01 = currentTimeMillis;
        this.A04 = r3;
        this.A06 = str;
        this.A00 = i2;
        this.A05 = str2;
        this.A0A = C32311g7.A07(str, str2, i2);
    }

    public Byte A00() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr == null) {
            return null;
        }
        byte b2 = 0;
        for (Certificate publicKey : certificateArr) {
            for (byte b3 : publicKey.getPublicKey().getEncoded()) {
                b2 = (byte) (b2 ^ b3);
            }
        }
        return Byte.valueOf(b2);
    }

    public void A01(Certificate[] certificateArr) {
        this.A0B = certificateArr != null ? (Certificate[]) certificateArr.clone() : null;
    }

    public int getApplicationBufferSize() {
        return 16384;
    }

    public String getCipherSuite() {
        return this.A05;
    }

    public long getCreationTime() {
        return this.A01;
    }

    public byte[] getId() {
        byte[] bArr = this.A0A;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    public long getLastAccessedTime() {
        return this.A02;
    }

    public Certificate[] getLocalCertificates() {
        return null;
    }

    public Principal getLocalPrincipal() {
        return null;
    }

    public int getPacketBufferSize() {
        return 16645;
    }

    public X509Certificate[] getPeerCertificateChain() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr == null || (r7 = certificateArr.length) == 0) {
            throw new SSLPeerUnverifiedException("No peer certificates found");
        }
        ArrayList arrayList = new ArrayList();
        for (Certificate encoded : certificateArr) {
            try {
                arrayList.add(X509Certificate.getInstance(encoded.getEncoded()));
            } catch (CertificateEncodingException | CertificateException e2) {
                AnonymousClass41Y r2 = AnonymousClass41Y.DEBUG;
                StringBuilder sb = new StringBuilder("Could not parse certificates. Exception ");
                sb.append(e2);
                AnonymousClass4Yd.A00(r2, sb.toString());
            }
        }
        return (X509Certificate[]) arrayList.toArray(new X509Certificate[0]);
    }

    public Certificate[] getPeerCertificates() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null) {
            return (Certificate[]) certificateArr.clone();
        }
        return null;
    }

    public String getPeerHost() {
        return this.A06;
    }

    public int getPeerPort() {
        return this.A00;
    }

    public Principal getPeerPrincipal() {
        Certificate[] certificateArr = this.A0B;
        if (certificateArr != null && certificateArr.length != 0) {
            return ((java.security.cert.X509Certificate) certificateArr[0]).getSubjectX500Principal();
        }
        throw new SSLPeerUnverifiedException("No peer certificates found.");
    }

    public final String getProtocol() {
        return "TLSv1.3";
    }

    public SSLSessionContext getSessionContext() {
        return this.A04;
    }

    public Object getValue(String str) {
        if (str != null) {
            return this.A0C.get(str);
        }
        throw new IllegalArgumentException("key cannot be null.");
    }

    public String[] getValueNames() {
        return (String[]) this.A0C.keySet().toArray(new String[0]);
    }

    public void invalidate() {
        this.A09 = false;
    }

    public boolean isValid() {
        boolean z2 = this.A09;
        if (!z2) {
            return z2;
        }
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = this.A07;
        WtCachedPsk[] wtCachedPskArr = null;
        if (linkedHashSet != null) {
            wtCachedPskArr = (WtCachedPsk[]) linkedHashSet.toArray(new WtCachedPsk[0]);
        }
        if (wtCachedPskArr != null) {
            for (WtCachedPsk wtCachedPsk : wtCachedPskArr) {
                if ((wtCachedPsk.useTestTime ? 3600000 : System.currentTimeMillis()) - wtCachedPsk.ticketIssuedTime > wtCachedPsk.ticketLifetime || !wtCachedPsk.sni.equals(this.A06)) {
                    this.A07.remove(wtCachedPsk);
                } else {
                    hashSet.add(Byte.valueOf(wtCachedPsk.certsID));
                }
            }
        }
        Iterator it = this.A08.keySet().iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                it.remove();
            }
        }
        LinkedHashSet linkedHashSet2 = this.A07;
        if (linkedHashSet2 == null || linkedHashSet2.isEmpty()) {
            this.A09 = false;
        }
        return this.A09;
    }

    public void putValue(String str, Object obj) {
        if (str == null || obj == null) {
            throw new IllegalArgumentException("key and value cannot be null.");
        }
        Object put = this.A0C.put(str, obj);
        if (put instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) put).valueUnbound(new SSLSessionBindingEvent(this, str));
        }
        if (obj instanceof SSLSessionBindingListener) {
            ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(this, str));
        }
    }

    public void removeValue(String str) {
        if (str != null) {
            Object remove = this.A0C.remove(str);
            if (remove instanceof SSLSessionBindingListener) {
                ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(this, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("key cannot be null");
    }
}
