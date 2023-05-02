package org.spongycastle.jcajce.provider.digest;

import X.AnonymousClass4U8;
import X.AnonymousClass5BJ;
import X.AnonymousClass5JR;
import X.AnonymousClass5Kp;
import X.C1054559r;
import X.C106005Cd;
import X.C106015Ce;
import X.C32041fY;
import X.C32991hg;

public class SHA1 {

    public class Mappings extends C32991hg {
        public static final String A00 = SHA1.class.getName();
    }

    public class Digest extends AnonymousClass5BJ implements Cloneable {
        public Digest() {
            super(new AnonymousClass5JR());
        }

        public Object clone() {
            AnonymousClass5BJ r2 = (AnonymousClass5BJ) super.clone();
            r2.A01 = new AnonymousClass5JR((AnonymousClass5JR) this.A01);
            return r2;
        }
    }

    public class HashMac extends C106015Ce {
        public HashMac() {
            super(new C1054559r(new AnonymousClass5JR()));
        }
    }

    public class KeyGenerator extends C106005Cd {
        public KeyGenerator() {
            super("HMACSHA1", new AnonymousClass4U8(), 160);
        }
    }

    public class PBEWithMacKeyFactory extends AnonymousClass5Kp {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", (C32041fY) null, 2, 1, 160, 0, false);
        }
    }

    public class SHA1Mac extends C106015Ce {
        public SHA1Mac() {
            super(new C1054559r(new AnonymousClass5JR()));
        }
    }
}
