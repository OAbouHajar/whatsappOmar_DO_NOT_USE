package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: X.3Ig  reason: invalid class name and case insensitive filesystem */
public class C63453Ig extends SSLServerSocketFactory {
    public SSLServerSocketFactory A00;
    public final PrivateKey A01;
    public final Certificate A02;
    public final SSLContext A03 = AnonymousClass47U.A00();

    public C63453Ig(PrivateKey privateKey, Certificate certificate) {
        this.A01 = privateKey;
        this.A02 = certificate;
    }

    public final SSLServerSocketFactory A00() {
        SSLServerSocketFactory sSLServerSocketFactory = this.A00;
        if (sSLServerSocketFactory != null) {
            return sSLServerSocketFactory;
        }
        SSLContext sSLContext = this.A03;
        try {
            char[] charArray = "pass".toCharArray();
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load((InputStream) null, (char[]) null);
            instance.setKeyEntry("self-signed-certificate", this.A01, charArray, new Certificate[]{this.A02});
            KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            instance2.init(instance, charArray);
            sSLContext.init(instance2.getKeyManagers(), (TrustManager[]) null, (SecureRandom) null);
            SSLServerSocketFactory serverSocketFactory = sSLContext.getServerSocketFactory();
            this.A00 = serverSocketFactory;
            return serverSocketFactory;
        } catch (IOException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e2) {
            Log.e("fpm/SslSocketFactoryWithGivenCertificate/", e2);
            throw new RuntimeException(e2);
        }
    }

    public ServerSocket createServerSocket() {
        return A00().createServerSocket();
    }

    public ServerSocket createServerSocket(int i2) {
        return A00().createServerSocket(i2);
    }

    public ServerSocket createServerSocket(int i2, int i3) {
        return A00().createServerSocket(i2, i3);
    }

    public ServerSocket createServerSocket(int i2, int i3, InetAddress inetAddress) {
        return A00().createServerSocket(i2, i3, inetAddress);
    }

    public String[] getDefaultCipherSuites() {
        return A00().getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return A00().getSupportedCipherSuites();
    }
}
