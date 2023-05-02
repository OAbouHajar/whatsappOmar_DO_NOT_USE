package X;

import android.os.Bundle;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.facebook.redex.RunnableRunnableShape0S0501000_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.facebook.redex.RunnableRunnableShape8S0200000_I0_6;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.obwhatsapp.youbasha.ui.activity.CallsPrivacy;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1SV  reason: invalid class name */
public final class AnonymousClass1SV implements C19420yP {
    public final C211512z A00;
    public final AnonymousClass1HD A01;
    public final C15860rz A02;
    public final C208211s A03;
    public final AnonymousClass16P A04;
    public final C18920xT A05;
    public final C24521Gg A06;
    public final C16320sq A07;
    public final boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r9.A0E(r1, 1885) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1SV(X.C211512z r3, X.AnonymousClass1HD r4, X.C15860rz r5, X.C208211s r6, X.AnonymousClass16P r7, X.C18920xT r8, X.C14710pd r9, X.C24521Gg r10, X.C16320sq r11) {
        /*
            r2 = this;
            r2.<init>()
            r2.A07 = r11
            r2.A05 = r8
            r2.A04 = r7
            r2.A00 = r3
            r2.A03 = r6
            r2.A02 = r5
            r2.A06 = r10
            r2.A01 = r4
            r0 = 2232(0x8b8, float:3.128E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r0 = r9.A0E(r1, r0)
            if (r0 == 0) goto L_0x0026
            r0 = 1885(0x75d, float:2.641E-42)
            boolean r1 = r9.A0E(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r2.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SV.<init>(X.12z, X.1HD, X.0rz, X.11s, X.16P, X.0xT, X.0pd, X.1Gg, X.0sq):void");
    }

    public int[] ACW() {
        return new int[]{74, 75, 76, 77, 78, 196, 82, 83, 84};
    }

    public boolean AHS(Message message, int i2) {
        int A032;
        Jid[] jidArr;
        Jid nullable;
        C211512z r7;
        Object[] objArr;
        if (i2 != 196) {
            switch (i2) {
                case 74:
                    List list = (List) message.obj;
                    StringBuilder sb = new StringBuilder("RecvPreKeyMessageListener/onGetPreKeySuccess Schedule processing of prekeys. Count = ");
                    sb.append(list.size());
                    Log.i(sb.toString());
                    AnonymousClass1HD r4 = this.A01;
                    synchronized (r4) {
                        A032 = r4.A05.A03(C16620tM.A01, 767);
                    }
                    if (A032 <= 0 || list.size() < A032) {
                        if (this.A08) {
                            this.A07.Aco(new RunnableRunnableShape9S0200000_I0_7(this, 1, list));
                            return true;
                        }
                        AnonymousClass16P r0 = this.A04;
                        r0.A00.execute(new RunnableRunnableShape9S0200000_I0_7(this, 0, list));
                        return true;
                    } else if (this.A08) {
                        this.A07.Aco(new RunnableRunnableShape8S0200000_I0_6(this, 49, list));
                        return true;
                    } else {
                        AnonymousClass16P r42 = this.A04;
                        r42.A00.execute(new RunnableRunnableShape0S0210000_I0(r42, new RunnableRunnableShape8S0200000_I0_6(this, 48, list)));
                        return true;
                    }
                case 75:
                    Jid A002 = AnonymousClass2RS.A00((Bundle) message.obj, "jid");
                    AnonymousClass00B.A06(A002);
                    if (this.A08) {
                        this.A07.Acl(new RunnableRunnableShape8S0200000_I0_6(this, 47, A002));
                        return true;
                    }
                    AnonymousClass16P r3 = this.A04;
                    r3.A00.execute(new RunnableRunnableShape8S0200000_I0_6(this, 46, A002));
                    return true;
                case 76:
                    Bundle bundle = (Bundle) message.obj;
                    String[] stringArray = bundle.getStringArray("jids");
                    if (stringArray == null) {
                        jidArr = null;
                    } else {
                        List<String> asList = Arrays.asList(stringArray);
                        ArrayList arrayList = new ArrayList(stringArray.length);
                        if (asList != null) {
                            for (String str : asList) {
                                if (!(str == null || (nullable = Jid.getNullable(str)) == null)) {
                                    arrayList.add(nullable);
                                }
                            }
                        }
                        jidArr = (Jid[]) arrayList.toArray(new Jid[0]);
                    }
                    AnonymousClass00B.A06(jidArr);
                    int length = jidArr.length;
                    DeviceJid[] deviceJidArr = new DeviceJid[length];
                    for (int i3 = 0; i3 < length; i3++) {
                        deviceJidArr[i3] = DeviceJid.of(jidArr[i3]);
                    }
                    C24521Gg r6 = this.A06;
                    int i4 = bundle.getInt("errorCode");
                    StringBuilder sb2 = new StringBuilder("prekey request failed; jid=");
                    sb2.append(Arrays.toString(deviceJidArr));
                    sb2.append("; errorCode=");
                    sb2.append(i4);
                    Log.i(sb2.toString());
                    AnonymousClass1HD r9 = r6.A02;
                    synchronized (r9) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("prekeysmanager/onGetPreKeyError:");
                        sb3.append(Arrays.toString(deviceJidArr));
                        Log.e(sb3.toString());
                        for (int i5 = 0; i5 < length; i5++) {
                            DeviceJid deviceJid = deviceJidArr[i5];
                            C46612Fd r1 = (C46612Fd) r9.A08.remove(deviceJid);
                            if (500 <= i4 && i4 < 600 && r1 != null) {
                                r9.A09.put(deviceJid, r1);
                            }
                        }
                        if (500 <= i4 && i4 < 600 && (!r9.A01 || (!r9.A00 && r9.A08.isEmpty()))) {
                            r9.A01 = true;
                            r9.A00 = true;
                            r9.A02.postDelayed(new RunnableRunnableShape2S0100000_I0_1(r9, 12), r9.A07.A01() * 1000);
                        }
                    }
                    boolean z2 = false;
                    if (i4 == 406) {
                        z2 = true;
                    }
                    if (r6.A0A) {
                        r6.A09.Acl(new RunnableRunnableShape0S0210000_I0(r6, deviceJidArr, 18, z2));
                        return true;
                    }
                    AnonymousClass16P r32 = r6.A06;
                    r32.A00.execute(new RunnableRunnableShape0S0210000_I0(r6, deviceJidArr, 17, z2));
                    return true;
                case CallsPrivacy.NOINTERNET_CALLING /*77*/:
                    r7 = this.A00;
                    synchronized (r7) {
                        C30971dG[] r8 = r7.A04;
                        r7.A04 = null;
                        Log.i("prekey set successful");
                        if (r7.A06.A0G() && r7.A0A.A1k()) {
                            AnonymousClass1CH r62 = r7.A08;
                            Log.i("CompanionRegistrationLogger/logRegistrationComplete");
                            r62.A05.Acl(new C52332db(r62, 5, 0));
                        }
                        AnonymousClass16P r33 = r7.A0C;
                        r33.A00.execute(new RunnableRunnableShape2S0200000_I0(r8, 21, r7));
                        r7.A04();
                        break;
                    }
                case 78:
                    int i6 = ((Bundle) message.obj).getInt("errorCode");
                    r7 = this.A00;
                    synchronized (r7) {
                        r7.A04 = null;
                        r7.A05(0);
                        if (r7.A06.A0G() && r7.A0A.A1k()) {
                            r7.A08.A00(4, (long) i6);
                        }
                        if (i6 != 406) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("failed to set prekeys; will try again on next xmpp connect; errorCode=");
                            sb4.append(i6);
                            Log.e(sb4.toString());
                            if (i6 >= 500 && i6 < 600) {
                                r7.A03 = true;
                                r7.A05.A0L(new RunnableRunnableShape2S0100000_I0_1(r7, 5), r7.A0I.A01() * 1000);
                                break;
                            }
                        } else {
                            Log.e("failed to set prekeys; regenerating keys; errorCode=406");
                            AnonymousClass16P r34 = r7.A0C;
                            r34.A00.execute(new RunnableRunnableShape2S0100000_I0_1(r7, 7));
                            break;
                        }
                    }
                default:
                    switch (i2) {
                        case 82:
                            Bundle bundle2 = (Bundle) message.obj;
                            byte[] byteArray = bundle2.getByteArray("registration");
                            byte b2 = bundle2.getByte("type");
                            byte[] byteArray2 = bundle2.getByteArray("signedKeyId");
                            Object[] objArr2 = (Object[]) bundle2.getSerializable("keyIds");
                            if (objArr2 == null) {
                                objArr = null;
                            } else {
                                int length2 = objArr2.length;
                                objArr = new byte[length2][];
                                for (int i7 = 0; i7 < length2; i7++) {
                                    objArr[i7] = objArr2[i7];
                                }
                            }
                            byte[] byteArray3 = bundle2.getByteArray("hash");
                            Log.i("checking prekey digest");
                            this.A00.A01();
                            if (this.A08) {
                                this.A07.Acl(new RunnableRunnableShape0S0501000_I0(byteArray, byteArray3, byteArray2, this, objArr, b2, 2));
                                return true;
                            }
                            AnonymousClass16P r02 = this.A04;
                            r02.A00.execute(new RunnableRunnableShape0S0501000_I0(byteArray, byteArray3, byteArray2, this, objArr, b2, 3));
                            return true;
                        case 83:
                            Log.i("prekey digest none");
                            this.A00.A01();
                            if (this.A08) {
                                this.A07.Acl(new RunnableRunnableShape11S0100000_I0_10((Object) this, 27));
                                return true;
                            }
                            AnonymousClass16P r35 = this.A04;
                            r35.A00.execute(new RunnableRunnableShape11S0100000_I0_10((Object) this, 26));
                            return true;
                        case 84:
                            Log.i("prekey digest server error");
                            this.A00.A01();
                            return true;
                        default:
                            return false;
                    }
            }
            return true;
        }
        Bundle bundle3 = (Bundle) message.obj;
        bundle3.getInt("errorCode");
        bundle3.getString("errorText");
        synchronized (this.A00) {
        }
        return true;
    }
}
