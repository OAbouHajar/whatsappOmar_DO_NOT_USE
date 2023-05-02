package X;

import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

/* renamed from: X.5Ce  reason: invalid class name and case insensitive filesystem */
public class C106015Ce extends MacSpi implements AnonymousClass5NP {
    public static final Class A01 = C32971hd.A00(C106015Ce.class, "javax.crypto.spec.GCMParameterSpec");
    public C46912Gt A00;

    public C106015Ce(C46912Gt r1) {
        this.A00 = r1;
    }

    public byte[] engineDoFinal() {
        C46912Gt r2 = this.A00;
        byte[] bArr = new byte[r2.ADH()];
        r2.A8A(bArr, 0);
        return bArr;
    }

    public int engineGetMacLength() {
        return this.A00.ADH();
    }

    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        String str;
        String str2;
        C46932Gv r1;
        if (key != null) {
            if (key instanceof AnonymousClass58X) {
                AnonymousClass58X r5 = (AnonymousClass58X) key;
                AnonymousClass58X.A00(r5);
                if (r5.param != null) {
                    AnonymousClass58X.A00(r5);
                    r1 = r5.param;
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    str = "PBE requires PBE parameters to be set.";
                    throw AnonymousClass3K4.A0d(str);
                } else if (algorithmParameterSpec != null) {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    AnonymousClass58X.A00(r5);
                    int i2 = r5.type;
                    AnonymousClass58X.A00(r5);
                    C89194bk A012 = C90294du.A01(i2, r5.digest);
                    byte[] encoded = r5.getEncoded();
                    byte[] salt = pBEParameterSpec.getSalt();
                    int iterationCount = pBEParameterSpec.getIterationCount();
                    A012.A01 = encoded;
                    A012.A02 = salt;
                    A012.A00 = iterationCount;
                    AnonymousClass58X.A00(r5);
                    r1 = A012.A01(r5.keySize);
                } else {
                    throw AnonymousClass000.A0T("Need a PBEParameter spec with a PBE key.");
                }
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                r1 = new C46922Gu(key.getEncoded());
            } else {
                str2 = "inappropriate parameter type: ";
                str = AnonymousClass000.A0h(AnonymousClass000.A0d(algorithmParameterSpec), AnonymousClass000.A0r(str2));
                throw AnonymousClass3K4.A0d(str);
            }
            C46932Gv r4 = r1;
            if (r1 instanceof C1054259l) {
                r4 = ((C1054259l) r4).A00;
            }
            C46922Gu r42 = (C46922Gu) r4;
            if (algorithmParameterSpec instanceof C106035Cg) {
                C106035Cg r8 = (C106035Cg) algorithmParameterSpec;
                r1 = new C1053859h(r42, r8.getIV(), C33111hx.A02(r8.A01), r8.A00);
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                r1 = new C1054259l(r42, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                byte[] bArr = r42.A00;
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                rC2ParameterSpec.getEffectiveKeyBits();
                r1 = new C1054259l(new AnonymousClass5JZ(bArr), rC2ParameterSpec.getIV());
            } else if (algorithmParameterSpec instanceof C1047456t) {
                Map map = ((C1047456t) algorithmParameterSpec).A00;
                Hashtable hashtable = new Hashtable();
                Iterator A0I = C13700nu.A0I(map);
                while (A0I.hasNext()) {
                    Object next = A0I.next();
                    hashtable.put(next, map.get(next));
                }
                Hashtable hashtable2 = new Hashtable();
                Enumeration keys = hashtable.keys();
                while (keys.hasMoreElements()) {
                    Object nextElement = keys.nextElement();
                    hashtable2.put(nextElement, hashtable.get(nextElement));
                }
                hashtable2.put(C13680ns.A0X(), r42.A00);
                r1 = new C1054159k(hashtable2);
            } else if (algorithmParameterSpec == null) {
                r1 = new C46922Gu(key.getEncoded());
            } else {
                Class cls = A01;
                if (cls != null && cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
                    try {
                        r1 = (C1053859h) AccessController.doPrivileged(new C1046956n(algorithmParameterSpec, r42));
                    } catch (Exception unused) {
                        str = "Cannot process GCMParameterSpec.";
                    }
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    str2 = "unknown parameter type: ";
                    str = AnonymousClass000.A0h(AnonymousClass000.A0d(algorithmParameterSpec), AnonymousClass000.A0r(str2));
                    throw AnonymousClass3K4.A0d(str);
                }
            }
            try {
                this.A00.AHz(r1);
            } catch (Exception e2) {
                str = AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("cannot initialize MAC: "));
            }
        } else {
            throw new InvalidKeyException("key is null");
        }
    }

    public void engineReset() {
        this.A00.reset();
    }

    public void engineUpdate(byte b2) {
        this.A00.AhH(b2);
    }

    public void engineUpdate(byte[] bArr, int i2, int i3) {
        this.A00.update(bArr, i2, i3);
    }
}
