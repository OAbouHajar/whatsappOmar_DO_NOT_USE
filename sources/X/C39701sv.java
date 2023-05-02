package X;

import android.provider.ContactsContract;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1sv  reason: invalid class name and case insensitive filesystem */
public class C39701sv {
    public static HashMap A0B = new HashMap();
    public static HashMap A0C;
    public String A00;
    public String A01;
    public List A02;
    public List A03 = new ArrayList();
    public List A04;
    public List A05;
    public List A06;
    public Map A07;
    public AnonymousClass4SC A08 = new AnonymousClass4SC();
    public byte[] A09;
    public final AnonymousClass4JK A0A = new AnonymousClass4JK();

    static {
        HashMap hashMap = new HashMap();
        A0C = hashMap;
        hashMap.put("X-AIM", 0);
        A0C.put("X-MSN", 1);
        A0C.put("X-YAHOO", 2);
        A0C.put("X-GOOGLE-TALK", 5);
        A0C.put("X-GOOGLE TAL", 5);
        A0C.put("X-ICQ", 6);
        A0C.put("X-JABBER", 7);
        A0C.put("X-SKYPE-USERNAME", 3);
        A0B.put("X-AIM", "AIM");
        A0B.put("X-MSN", "Windows Live");
        A0B.put("X-YAHOO", "YAHOO");
        A0B.put("X-GOOGLE-TALK", "Google Talk");
        A0B.put("X-GOOGLE TAL", "Google Talk");
        A0B.put("X-ICQ", "ICQ");
        A0B.put("X-JABBER", "Jabber");
        A0B.put("X-SKYPE-USERNAME", "Skype");
        A0B.put("NICKNAME", "Nickname");
        A0B.put("BDAY", "Birthday");
    }

    public static AnonymousClass25N A00(String str) {
        if (str != null) {
            AnonymousClass25L r3 = new AnonymousClass25L();
            try {
                for (String split : AnonymousClass25M.A00(str)) {
                    AnonymousClass25M.A01(Arrays.asList(AnonymousClass25M.A00.split(split)), r3);
                }
                List list = r3.A02;
                if (list.size() > 0 && ((AnonymousClass25N) list.get(0)).A01.equals("VCARD")) {
                    return (AnonymousClass25N) list.get(0);
                }
            } catch (Exception e2) {
                Log.e("Error parsing vcard", new AnonymousClass25H(e2));
                return null;
            }
        }
        return null;
    }

    public static void A01(List list, AnonymousClass4SC r4) {
        int size = list.size();
        if (size > 1) {
            r4.A00 = (String) list.get(0);
            r4.A02 = (String) list.get(1);
            if (size > 2) {
                if (((String) list.get(2)).length() > 0) {
                    r4.A03 = (String) list.get(2);
                }
                if (size > 3) {
                    if (((String) list.get(3)).length() > 0) {
                        r4.A06 = (String) list.get(3);
                    }
                    if (size > 4 && ((String) list.get(4)).length() > 0) {
                        r4.A07 = (String) list.get(4);
                    }
                }
            }
        }
    }

    public String A02() {
        String str = this.A08.A01;
        if (str != null) {
            return str;
        }
        List list = this.A04;
        if (list != null && list.size() > 0) {
            return ((AnonymousClass4JJ) this.A04.get(0)).A00;
        }
        List list2 = this.A05;
        if (list2 != null && list2.size() > 0) {
            for (C39711sw r1 : this.A05) {
                if (r1.A04) {
                    return r1.A02;
                }
            }
        }
        List list3 = this.A02;
        if (list3 == null || list3.size() <= 0) {
            return "";
        }
        for (C85294Nw r2 : this.A02) {
            if (r2.A01 == ContactsContract.CommonDataKinds.Email.class && r2.A05) {
                return r2.A02;
            }
        }
        return "";
    }

    public void A03(UserJid userJid, String str, String str2, int i2, boolean z2) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("contactstruct/addphone/data is null; skipping (type=");
            sb.append(i2);
            sb.append(" jidFromWaId=");
            sb.append(userJid);
            sb.append(" label=");
            sb.append(str2);
            sb.append(" isPrimary=");
            sb.append(z2);
            sb.append(")");
            Log.w(sb.toString());
        } else if (str.length() > 30) {
            this.A0A.A01++;
        } else {
            List list = this.A05;
            if (list == null) {
                list = new ArrayList();
                this.A05 = list;
            }
            if (list.size() >= 10) {
                this.A0A.A00++;
                return;
            }
            C39711sw r1 = new C39711sw();
            r1.A00 = i2;
            r1.A01 = userJid;
            r1.A02 = str;
            r1.A03 = str2;
            r1.A04 = z2;
            this.A05.add(r1);
        }
    }

    public void A04(String str, String str2) {
        List list = this.A04;
        if (list == null) {
            list = new ArrayList();
            this.A04 = list;
        }
        AnonymousClass4JJ r0 = new AnonymousClass4JJ();
        r0.A00 = str;
        r0.A01 = str2;
        list.add(r0);
    }

    public void A05(C87294We r4) {
        List list;
        String str = r4.A02;
        if (str != null && str.length() != 0) {
            String str2 = r4.A01;
            Map map = this.A07;
            if (map == null) {
                map = new HashMap();
                this.A07 = map;
            }
            if (!map.containsKey(str2)) {
                list = new ArrayList();
                this.A07.put(str2, list);
            } else {
                list = (List) this.A07.get(str2);
            }
            list.add(r4);
        }
    }
}
