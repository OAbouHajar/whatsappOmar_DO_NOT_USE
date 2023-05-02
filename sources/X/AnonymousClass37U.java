package X;

import com.facebook.simplejni.NativeHolder;
import com.obwhatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.37U  reason: invalid class name */
public class AnonymousClass37U extends C16690tT {
    public Set A00;
    public Set A01;
    public final UserJid A02;
    public final WeakReference A03;
    public final /* synthetic */ C26191Mr A04;

    public AnonymousClass37U(C26191Mr r2, AnonymousClass4QJ r3, UserJid userJid) {
        this.A04 = r2;
        this.A02 = userJid;
        this.A03 = C13690nt.A0h(r3);
    }

    public static String A03(String str, List list) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-512");
            byte[] A06 = A06(list);
            byte[] bArr = new byte[2];
            byte b2 = (byte) 0;
            bArr[1] = b2;
            bArr[0] = b2;
            byte[] A042 = C28641Wx.A04(bArr, A06, str.getBytes());
            for (int i2 = 0; i2 < 5200; i2++) {
                instance.update(A042);
                A042 = instance.digest(A06);
            }
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(A04(A042, 0));
            A0o.append(A04(A042, 5));
            A0o.append(A04(A042, 10));
            A0o.append(A04(A042, 15));
            A0o.append(A04(A042, 20));
            return AnonymousClass000.A0h(A04(A042, 25), A0o);
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static String A04(byte[] bArr, int i2) {
        long j2 = ((((long) bArr[i2]) & 255) << 32) | ((((long) bArr[i2 + 1]) & 255) << 24) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 8);
        Object[] A1b = C13680ns.A1b();
        A1b[0] = Long.valueOf(((((long) bArr[i2 + 4]) & 255) | j2) % 100000);
        return String.format("%05d", A1b);
    }

    public static C36751o3 A05(C28581Wr r4, C28581Wr r5, String str, byte[] bArr) {
        byte[] bytes = str.getBytes();
        C28631Ww A012 = C28631Ww.A01(bytes, 0, bytes.length);
        r4.A03();
        C36761o4 r1 = (C36761o4) r4.A00;
        r1.A00 |= 2;
        r1.A02 = A012;
        C28631Ww A013 = C28631Ww.A01(bArr, 0, bArr.length);
        r4.A03();
        C36761o4 r12 = (C36761o4) r4.A00;
        r12.A00 |= 1;
        r12.A01 = A013;
        r5.A03();
        return (C36751o3) r5.A00;
    }

    public static byte[] A06(List list) {
        ArrayList A0w = AnonymousClass000.A0w(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0w.add(((AnonymousClass1WL) it.next()).A00.A00());
        }
        Collections.sort(A0w, new AnonymousClass27Q());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it2 = A0w.iterator();
        while (it2.hasNext()) {
            byte[] bArr = (byte[]) it2.next();
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        UserJid userJid = this.A02;
        if (userJid == null) {
            return null;
        }
        C26191Mr r3 = this.A04;
        C19810z2 r5 = r3.A03;
        Set A0D = r5.A0D(userJid);
        this.A01 = A0D;
        AnonymousClass1L0 r4 = r3.A02;
        Map A002 = r4.A00(A0D);
        if (A002.isEmpty() || this.A01.size() != A002.size()) {
            return null;
        }
        C17380uz A06 = r5.A06();
        this.A00 = A06;
        Map A003 = r4.A00(A06);
        C16040sK r0 = r3.A00;
        r0.A0B();
        AnonymousClass1ZT r52 = r0.A05;
        AnonymousClass00B.A06(r52);
        Collection<AnonymousClass1WL> values = A003.values();
        ArrayList A0u = AnonymousClass000.A0u();
        for (AnonymousClass1WL r02 : values) {
            A0u.add(r02.A00);
        }
        ArrayList A0n = C13680ns.A0n(A0u);
        C28861Yb A022 = C28851Ya.A02(DeviceJid.of(userJid));
        C208211s r32 = r3.A01;
        String A004 = AnonymousClass293.A00(r52.user);
        String A005 = AnonymousClass293.A00(A022.A02);
        Collection<AnonymousClass1WL> values2 = A002.values();
        ArrayList A0u2 = AnonymousClass000.A0u();
        for (AnonymousClass1WL r03 : values2) {
            A0u2.add(r03.A00);
        }
        ArrayList A0n2 = C13680ns.A0n(A0u2);
        if (r32.A04.A05(C15910s6.A14)) {
            C35991mp r04 = r32.A01;
            List A006 = r04.A00(A0n);
            if (A006 == null) {
                str = "wamsys/generateFingerprint/local-identity-key-conversion-failed";
            } else {
                List A007 = r04.A00(A0n2);
                if (A007 == null) {
                    str = "wamsys/generateFingerprint/remote-identity-key-conversion-failed";
                } else {
                    NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOOO(0, A004, A005, r04.A03.wajContext.get(), A006, A007);
                    if (nativeHolder != null) {
                        C82144Bj r05 = new C82144Bj(nativeHolder);
                        try {
                            JniBridge.getInstance();
                            NativeHolder nativeHolder2 = r05.A00;
                            JniBridge.getInstance();
                            AnonymousClass4TV r33 = new AnonymousClass4TV((String) JniBridge.jvidispatchOIO(2, (long) 58, nativeHolder2), (String) JniBridge.jvidispatchOIO(2, (long) 59, nativeHolder2));
                            JniBridge.getInstance();
                            return new C48682Ol(r33, (C36751o3) C28541Wm.A0E(C36751o3.A04, (byte[]) JniBridge.jvidispatchOIO(0, (long) 57, nativeHolder2)));
                        } catch (C29791bD unused) {
                            Log.e("wamsys/generateFingerprint/protobuf-parsing-failed");
                            return null;
                        }
                    } else {
                        str = "wamsys/generateFingerprint/processing-fingerprints-failed";
                    }
                }
            }
            Log.e(str);
            return null;
        }
        C35981mo r34 = r32.A00;
        ArrayList A0u3 = AnonymousClass000.A0u();
        Iterator it = A0n.iterator();
        while (it.hasNext()) {
            A0u3.add(new AnonymousClass1WL((C30351cD) it.next()));
        }
        A0u3.add(r34.A04().A01);
        ArrayList A0u4 = AnonymousClass000.A0u();
        Iterator it2 = A0n2.iterator();
        while (it2.hasNext()) {
            A0u4.add(new AnonymousClass1WL((C30351cD) it2.next()));
        }
        AnonymousClass4TV r35 = new AnonymousClass4TV(A03(A004, A0u3), A03(A005, A0u4));
        byte[] A062 = A06(A0u3);
        byte[] A063 = A06(A0u4);
        C28581Wr A0U = C36751o3.A04.A0U();
        C36751o3 r2 = (C36751o3) C28581Wr.A00(A0U);
        r2.A00 |= 1;
        r2.A01 = 0;
        C36761o4 r22 = C36761o4.A03;
        C28581Wr A0U2 = r22.A0U();
        C36751o3 A05 = A05(A0U2, A0U, A004, A062);
        A05.A02 = (C36761o4) A0U2.A02();
        A05.A00 |= 2;
        C28581Wr A0U3 = r22.A0U();
        C36751o3 A052 = A05(A0U3, A0U, A005, A063);
        A052.A03 = (C36761o4) A0U3.A02();
        A052.A00 |= 4;
        return new C48682Ol(r35, (C36751o3) A0U.A02());
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C48682Ol r7 = (C48682Ol) obj;
        AnonymousClass4QJ r5 = (AnonymousClass4QJ) this.A03.get();
        if (r5 != null) {
            Set set = this.A00;
            Set set2 = this.A01;
            IdentityVerificationActivity identityVerificationActivity = r5.A00;
            identityVerificationActivity.A06.setVisibility(8);
            if (r7 != null) {
                C48682Ol r0 = identityVerificationActivity.A0I;
                if (r0 == r7) {
                    return;
                }
                if (r0 != null && r0.A00.equals(r7.A00)) {
                    return;
                }
            }
            identityVerificationActivity.A0I = r7;
            int i2 = 0;
            identityVerificationActivity.A01 = set == null ? 0 : set.size();
            if (set2 != null) {
                i2 = set2.size() - 1;
            }
            identityVerificationActivity.A00 = i2;
            if (!identityVerificationActivity.A0U) {
                r5.A00();
            }
        }
    }
}
