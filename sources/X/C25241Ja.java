package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.1Ja  reason: invalid class name and case insensitive filesystem */
public class C25241Ja extends C25251Jb {
    public AnonymousClass1JZ A00;

    public C25241Ja(AnonymousClass1JZ r4) {
        super("bk.action.UpdatedAvatar", "bk.action.DeletedAvatar", "bk.action.avatars.AsyncAvatarEditorLauncherClosed", "bk.action.avatar.AvatarEditorWANoticeEventSubmit", "bk.action.avatar.AvatarEditorEventSubmit");
        this.A00 = r4;
    }

    public /* bridge */ /* synthetic */ Object A8l(C14950q3 r6, C99354tt r7, C14970q5 r8) {
        C14960q4 r82 = (C14960q4) r8;
        String str = r7.A00;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -327257951:
                if (str.equals("bk.action.UpdatedAvatar")) {
                    c2 = 0;
                    break;
                }
                break;
            case 963920255:
                if (str.equals("bk.action.DeletedAvatar")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1731322695:
                if (str.equals("bk.action.avatars.AsyncAvatarEditorLauncherClosed")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1925160680:
                if (str.equals("bk.action.avatar.AvatarEditorWANoticeEventSubmit")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2071347818:
                if (str.equals("bk.action.avatar.AvatarEditorEventSubmit")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                Boolean bool = (Boolean) r6.A00.get(1);
                AnonymousClass1JZ r0 = this.A00;
                AnonymousClass1K6.A00(r82);
                C211913d r02 = r0.A00;
                boolean booleanValue = bool == null ? false : bool.booleanValue();
                AnonymousClass00B.A01();
                for (C211813c AN6 : r02.A01()) {
                    AN6.AN6(booleanValue);
                }
                break;
            case 1:
                AnonymousClass1JZ r03 = this.A00;
                AnonymousClass1K6.A00(r82);
                r03.A00.A04();
                return null;
            case 2:
                C211913d r04 = this.A00.A00;
                AnonymousClass00B.A01();
                for (C211813c AN3 : r04.A01()) {
                    AN3.AN3();
                }
                break;
            case 3:
                List list = r6.A00;
                String str2 = (String) list.get(0);
                Map map = (Map) list.get(1);
                C211913d r05 = this.A00.A00;
                AnonymousClass00B.A01();
                for (C211813c AN5 : r05.A01()) {
                    AN5.AN5(str2, map);
                }
                break;
            case 4:
                String str3 = (String) r6.A00.get(0);
                C211913d r06 = this.A00.A00;
                AnonymousClass00B.A01();
                for (C211813c AN4 : r06.A01()) {
                    AN4.AN4(str3);
                }
                break;
        }
        return null;
    }
}
