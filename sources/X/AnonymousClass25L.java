package X;

import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.25L  reason: invalid class name */
public class AnonymousClass25L {
    public int A00 = 0;
    public String A01;
    public List A02 = new ArrayList();
    public C87294We A03;
    public AnonymousClass25N A04;

    public void A00(String str) {
        String str2 = this.A01;
        if (str2 == null || str2.equalsIgnoreCase("TYPE")) {
            this.A03.A04.add(str);
        } else {
            this.A03.A00.put(str2, str);
        }
        this.A01 = null;
    }

    public void A01(List list) {
        C87294We r6;
        String str;
        String str2;
        byte[] bArr;
        StringBuilder sb;
        byte[] bArr2;
        C804143t r1;
        if (list == null || list.size() == 0) {
            C87294We r12 = this.A03;
            r12.A06 = null;
            r12.A03.clear();
            str = "";
            this.A03.A03.add(str);
            r6 = this.A03;
        } else {
            String asString = this.A03.A00.getAsString("ENCODING");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                str2 = (String) it.next();
                C87294We r13 = this.A03;
                List list2 = r13.A03;
                if (asString != null) {
                    int i2 = 0;
                    if (asString.equals("BASE64") || asString.equals("B")) {
                        r13.A06 = Base64.decode(str2.getBytes(), 0);
                        list2.add(str2);
                    } else if (asString.equals("QUOTED-PRINTABLE")) {
                        String replaceAll = str2.replaceAll("= ", " ").replaceAll("=\t", "\t");
                        StringBuilder sb2 = new StringBuilder();
                        int length = replaceAll.length();
                        ArrayList arrayList = new ArrayList();
                        int i3 = 0;
                        while (i3 < length) {
                            char charAt = replaceAll.charAt(i3);
                            if (charAt == 10) {
                                arrayList.add(sb2.toString());
                                sb2 = new StringBuilder();
                            } else if (charAt == 13) {
                                arrayList.add(sb2.toString());
                                sb2 = new StringBuilder();
                                if (i3 < length - 1) {
                                    int i4 = i3 + 1;
                                    if (replaceAll.charAt(i4) == 10) {
                                        i3 = i4;
                                    }
                                }
                            } else {
                                sb2.append(charAt);
                            }
                            i3++;
                        }
                        String obj = sb2.toString();
                        if (obj.length() > 0) {
                            arrayList.add(obj);
                        }
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        StringBuilder sb3 = new StringBuilder();
                        for (String str3 : strArr) {
                            if (str3.endsWith("=")) {
                                str3 = str3.substring(0, str3.length() - 1);
                            }
                            sb3.append(str3);
                        }
                        try {
                            bArr2 = sb3.toString().getBytes(DefaultCrypto.UTF_8);
                        } catch (UnsupportedEncodingException e2) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Failed to encode: charset=");
                            sb4.append(DefaultCrypto.UTF_8);
                            Log.e(sb4.toString(), e2);
                            bArr2 = sb3.toString().getBytes();
                        }
                        if (bArr2 == null) {
                            bArr = null;
                        } else {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                while (i2 < bArr2.length) {
                                    byte b2 = bArr2[i2];
                                    if (b2 == 61) {
                                        int i5 = i2 + 1;
                                        byte b3 = bArr2[i5];
                                        int digit = Character.digit((char) b3, 16);
                                        if (digit != -1) {
                                            i2 = i5 + 1;
                                            byte b4 = bArr2[i2];
                                            int digit2 = Character.digit((char) b4, 16);
                                            if (digit2 != -1) {
                                                byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                                            } else {
                                                StringBuilder sb5 = new StringBuilder("Invalid URL encoding: not a valid digit (radix 16): ");
                                                sb5.append(b4);
                                                r1 = new C804143t(sb5.toString());
                                            }
                                        } else {
                                            StringBuilder sb6 = new StringBuilder("Invalid URL encoding: not a valid digit (radix 16): ");
                                            sb6.append(b3);
                                            r1 = new C804143t(sb6.toString());
                                        }
                                        throw r1;
                                    }
                                    byteArrayOutputStream.write(b2);
                                    i2++;
                                }
                                bArr = byteArrayOutputStream.toByteArray();
                            } catch (ArrayIndexOutOfBoundsException e3) {
                                throw new C804143t((Throwable) e3);
                            } catch (C804143t e4) {
                                Log.e("Failed to decode quoted-printable: ", e4);
                                str2 = "";
                            }
                        }
                        try {
                            str2 = new String(bArr, DefaultCrypto.UTF_8);
                        } catch (UnsupportedEncodingException e5) {
                            e = e5;
                            sb = new StringBuilder();
                            sb.append("Failed to encode: charset=");
                        }
                        list2.add(str2);
                    }
                }
                if (!DefaultCrypto.UTF_8.equalsIgnoreCase(DefaultCrypto.UTF_8)) {
                    ByteBuffer encode = Charset.forName(DefaultCrypto.UTF_8).encode(str2);
                    bArr = new byte[encode.remaining()];
                    encode.get(bArr);
                    try {
                        str2 = new String(bArr, DefaultCrypto.UTF_8);
                    } catch (UnsupportedEncodingException e6) {
                        e = e6;
                        sb = new StringBuilder("Failed to encode: charset=");
                    }
                }
                list2.add(str2);
            }
            r6 = this.A03;
            List<String> list3 = r6.A03;
            int size = list3.size();
            if (size > 1) {
                StringBuilder sb7 = new StringBuilder();
                for (String append : list3) {
                    sb7.append(append);
                    sb7.append(";");
                }
                int length2 = sb7.length();
                if (length2 > 0) {
                    int i6 = length2 - 1;
                    if (sb7.charAt(i6) == ';') {
                        str = sb7.substring(0, i6);
                    }
                }
                str = sb7.toString();
            } else {
                str = size == 1 ? (String) list3.get(0) : "";
            }
        }
        r6.A02 = str;
        return;
        sb.append(DefaultCrypto.UTF_8);
        Log.e(sb.toString(), e);
        str2 = new String(bArr);
        list2.add(str2);
    }
}
