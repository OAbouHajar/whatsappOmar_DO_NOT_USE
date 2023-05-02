package X;

import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.obwhatsapp.conversation.conversationrow.message.selection.IDxMCallbackShape71S0100000_1_I0;
import com.obwhatsapp.gallery.MediaGalleryActivity;
import com.obwhatsapp.status.playback.MyStatusesActivity;
import com.obwhatsapp.storage.StorageUsageGalleryActivity;
import com.obwhatsapp.storage.StorageUsageMediaGalleryFragment;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3DP  reason: invalid class name */
public abstract class AnonymousClass3DP implements C009804r {
    public MenuItem A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public MenuItem A05;
    public MenuItem A06;
    public MenuItem A07;
    public MenuItem A08;
    public MenuItem A09;
    public MenuItem A0A;
    public MenuItem A0B;
    public MenuItem A0C;
    public MenuItem A0D;
    public MenuItem A0E;
    public MenuItem A0F;
    public MenuItem A0G;
    public MenuItem A0H;
    public MenuItem A0I;
    public MenuItem A0J;
    public MenuItem A0K;
    public final C14530pL A0L;
    public final C16000sG A0M;
    public final C16080sP A0N;
    public final AnonymousClass396 A0O = new AnonymousClass396();
    public final AnonymousClass5PO A0P;
    public final C20310zq A0Q;
    public final AnonymousClass013 A0R;
    public final AnonymousClass47T A0S;
    public MenuItem cp;
    public MenuItem sc;

    /* renamed from: y  reason: collision with root package name */
    public MenuItem f146y;

    public AnonymousClass3DP(C14530pL r2, C16000sG r3, C16080sP r4, AnonymousClass5PO r5, C20310zq r6, AnonymousClass013 r7, AnonymousClass47T r8) {
        this.A0L = r2;
        this.A0S = r8;
        this.A0M = r3;
        this.A0N = r4;
        this.A0R = r7;
        this.A0P = r5;
        this.A0Q = r6;
    }

    public static MenuItem A00(Menu menu, C20010zM r4, AnonymousClass3DP r5, int i2) {
        return menu.add(0, i2, 0, r4.A00(r5.A0L, new Object[0]));
    }

    public static MenuItem A01(Menu menu, C20010zM r4, AnonymousClass3DP r5, int i2) {
        int i3;
        MenuItem add = menu.add(0, i2, 0, r4.A00(r5.A0L, new Object[0]));
        if (!(r4 instanceof AnonymousClass2ZE) && !(r4 instanceof AnonymousClass2ZH) && !(r4 instanceof C20280zn) && !(r4 instanceof C20290zo)) {
            if (r4 instanceof AnonymousClass10I) {
                i3 = R.drawable.ic_action_unstar;
            } else if (r4 instanceof AnonymousClass10D) {
                i3 = R.drawable.ic_action_star;
            } else if (r4 instanceof AnonymousClass1LP) {
                i3 = R.drawable.ic_action_forward;
            } else if (r4 instanceof C20000zL) {
                i3 = R.drawable.ic_action_copy;
            } else if (r4 instanceof AnonymousClass1LN) {
                i3 = R.drawable.ic_action_delete;
            } else if (!(r4 instanceof AnonymousClass1LI)) {
                if (r4 instanceof AnonymousClass1LG) {
                    i3 = R.drawable.ic_action_reply;
                } else if (!(r4 instanceof AnonymousClass1LJ)) {
                    if (r4 instanceof AnonymousClass1LE) {
                        i3 = R.drawable.ic_action_edit;
                    } else if (r4 instanceof AnonymousClass1LL) {
                        i3 = R.drawable.ic_action_share;
                    } else if (!(r4 instanceof AnonymousClass1LQ) && !(r4 instanceof AnonymousClass1LW)) {
                        if (r4 instanceof AnonymousClass1LY) {
                            i3 = R.drawable.ic_action_undo_keep;
                        } else if (r4 instanceof AnonymousClass1LU) {
                            i3 = R.drawable.ic_action_keep;
                        } else if (r4 instanceof AnonymousClass1LO) {
                            i3 = R.drawable.ic_action_info;
                        } else if (r4 instanceof AnonymousClass1LS) {
                            i3 = R.drawable.ic_action_cancel;
                        }
                    }
                }
            }
            MenuItem icon = add.setIcon(i3);
            others.menuItemColor(icon);
            return icon;
        }
        i3 = 0;
        MenuItem icon2 = add.setIcon(i3);
        others.menuItemColor(icon2);
        return icon2;
    }

    public static void A02(MenuItem menuItem, C20310zq r2, Map map, int i2) {
        C20010zM A002 = r2.A00(i2);
        boolean A012 = A002 == null ? false : A002.A01(map);
        if (menuItem != null) {
            menuItem.setVisible(A012);
        }
    }

    public int A03(int i2) {
        if (i2 == R.id.menuitem_reply) {
            return 0;
        }
        if (i2 == R.id.menuitem_star) {
            return 1;
        }
        if (i2 == R.id.menuitem_unstar) {
            return 2;
        }
        if (i2 == R.id.menuitem_details) {
            return 3;
        }
        if (i2 == R.id.menuitem_copy) {
            return 4;
        }
        if (i2 == R.id.menuitem_share) {
            return 5;
        }
        if (i2 == R.id.menuitem_cancel_transfer) {
            return 6;
        }
        if (i2 == R.id.menuitem_forward) {
            return 7;
        }
        if (i2 == R.id.menuitem_message_edit) {
            return 8;
        }
        if (i2 == R.id.menuitem_add_to_contacts) {
            return 9;
        }
        if (i2 == R.id.menuitem_message_contact) {
            return 10;
        }
        if (i2 == R.id.menuitem_reply_privately) {
            return 11;
        }
        if (i2 == R.id.menuitem_share_cross) {
            return 12;
        }
        if (i2 == R.id.menuitem_share_third_party) {
            return 13;
        }
        if (i2 == R.id.menuitem_report_message) {
            return 14;
        }
        if (i2 == R.id.menuitem_rate_message) {
            return 15;
        }
        if (i2 == R.id.menuitem_keep_in_chat) {
            return 18;
        }
        if (i2 == R.id.menuitem_undo_keep_in_chat) {
            return 19;
        }
        if (i2 == R.id.menuitem_delete) {
            return 20;
        }
        if (i2 != R.id.menuitem_internal_copy_message_ids) {
            return i2 == R.id.menuitem_debug_export_messages ? 22 : -1;
        }
        return 21;
    }

    public abstract Map A04();

    public abstract void A05();

    public abstract void A06(Menu menu);

    public boolean AM1(MenuItem menuItem, AnonymousClass05J r14) {
        Map A042 = A04();
        boolean z2 = true;
        if (!(A042 == null || A042.size() == 0)) {
            int itemId = menuItem.getItemId();
            if (menuItem.getItemId() == R.id.translateme) {
                if (!A042.isEmpty()) {
                    ArrayList arrayList = new ArrayList(A042.values());
                    Collections.sort(arrayList, new IDxComparatorShape19S0000000_2_I0(36));
                    AnonymousClass396 r1 = this.A0O;
                    C47612Jr.my(this.A0L, this.A0M, this.A0N, arrayList);
                    A05();
                }
            } else if (menuItem.getItemId() == R.id.copyselect) {
                if (!A042.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(A042.values());
                    Collections.sort(arrayList2, new IDxComparatorShape19S0000000_2_I0(36));
                    C47612Jr.mysc(this.A0L, this.A0M, this.A0N, arrayList2);
                    A05();
                }
            } else if (menuItem.getItemId() != R.id.div2) {
                z2 = true;
                int A032 = A03(itemId);
                if (!this.A0P.A8o(A042, A032)) {
                    return false;
                }
                C20010zM A002 = this.A0Q.A00(A032);
                if (A002 != null && !(A002 instanceof AnonymousClass1LP) && !(A002 instanceof AnonymousClass1LV) && !(A002 instanceof AnonymousClass1LN)) {
                    A05();
                }
            } else if (!A042.isEmpty()) {
                Iterator it = A042.values().iterator();
                if (it.hasNext()) {
                    yo.FetchCopCaptio(it.next());
                }
            }
            A05();
            return true;
        }
        return z2;
    }

    public boolean APA(Menu menu, AnonymousClass05J r8) {
        C20310zq r3 = this.A0Q;
        C20010zM A002 = r3.A00(0);
        if (A002 != null) {
            this.A0E = A01(menu, A002, this, R.id.menuitem_reply);
        }
        C20010zM A003 = r3.A00(1);
        if (A003 != null) {
            this.A00 = A01(menu, A003, this, R.id.menuitem_star);
        }
        C20010zM A004 = r3.A00(2);
        if (A004 != null) {
            this.A0D = A01(menu, A004, this, R.id.menuitem_unstar);
        }
        C20010zM A005 = r3.A00(18);
        if (A005 != null) {
            this.A0A = A01(menu, A005, this, R.id.menuitem_keep_in_chat);
        }
        C20010zM A006 = r3.A00(19);
        if (A006 != null) {
            this.A0K = A01(menu, A006, this, R.id.menuitem_undo_keep_in_chat);
        }
        C20010zM A007 = r3.A00(3);
        if (A007 != null) {
            this.A06 = A01(menu, A007, this, R.id.menuitem_details);
        }
        C20010zM A008 = r3.A00(20);
        if (A008 != null) {
            this.A05 = A01(menu, A008, this, R.id.menuitem_delete);
        }
        C20010zM A009 = r3.A00(4);
        if (A009 != null) {
            this.A03 = A01(menu, A009, this, R.id.menuitem_copy);
            MenuItem icon = menu.add(0, R.id.copyselect, 0, yo.getString((int) R.string.copyselectSt)).setIcon(R.drawable.ic_action_copy_select);
            others.menuItemColor(icon);
            this.sc = icon;
            MenuItem icon2 = menu.add(0, R.id.translateme, 0, yo.getString((int) R.string.translateSt)).setIcon(R.drawable.ic_gt);
            others.menuItemColor(icon2);
            this.f146y = icon2;
        }
        C20010zM A0010 = r3.A00(5);
        if (A0010 != null) {
            this.A0H = A01(menu, A0010, this, R.id.menuitem_share);
        }
        C20010zM A0011 = r3.A00(6);
        if (A0011 != null) {
            this.A02 = A01(menu, A0011, this, R.id.menuitem_cancel_transfer);
        }
        C20010zM A0012 = r3.A00(7);
        if (A0012 != null) {
            this.A09 = A01(menu, A0012, this, R.id.menuitem_forward);
        }
        C20010zM A0013 = r3.A00(8);
        if (A0013 != null) {
            this.A07 = A01(menu, A0013, this, R.id.menuitem_message_edit);
        }
        C20010zM A0014 = r3.A00(11);
        if (A0014 != null) {
            this.A0F = A00(menu, A0014, this, R.id.menuitem_reply_privately);
        }
        if (r3.A00(16) == null && r3.A00(17) == null) {
            C20010zM A0015 = r3.A00(9);
            if (A0015 != null) {
                this.A01 = A00(menu, A0015, this, R.id.menuitem_add_to_contacts);
            }
            C20010zM A0016 = r3.A00(9);
            if (A0016 != null) {
                this.A0B = A00(menu, A0016, this, R.id.menuitem_message_contact);
            }
            C20010zM A0017 = r3.A00(13);
            if (A0017 != null) {
                this.A0I = A00(menu, A0017, this, R.id.menuitem_share_third_party);
            }
            C20010zM A0018 = r3.A00(12);
            if (A0018 != null) {
                this.A0J = A00(menu, A0018, this, R.id.menuitem_share_cross);
            }
            C20010zM A0019 = r3.A00(14);
            if (A0019 != null) {
                this.cp = menu.add(0, R.id.div2, 0, yo.getString((int) R.string.copy_caption));
                this.A0G = A00(menu, A0019, this, R.id.menuitem_report_message);
            }
            C20010zM A0020 = r3.A00(15);
            if (A0020 != null) {
                this.A0C = A00(menu, A0020, this, R.id.menuitem_rate_message);
            }
            C20010zM A0021 = r3.A00(21);
            if (A0021 != null) {
                this.A04 = A00(menu, A0021, this, R.id.menuitem_internal_copy_message_ids);
                this.A0O.A00(R.id.menuitem_internal_copy_message_ids);
            }
            C20010zM A0022 = r3.A00(22);
            if (A0022 != null) {
                this.A08 = A00(menu, A0022, this, R.id.menuitem_debug_export_messages);
                this.A0O.A00(R.id.menuitem_debug_export_messages);
            }
            AnonymousClass396 r1 = this.A0O;
            r1.A00(R.id.menuitem_reply_privately);
            r1.A00(R.id.menuitem_add_to_contacts);
            r1.A00(R.id.menuitem_message_contact);
            r1.A00(R.id.menuitem_share_third_party);
            r1.A00(R.id.menuitem_share_cross);
            r1.A00(R.id.menuitem_report_message);
            r1.A00(R.id.menuitem_rate_message);
            Set set = r1.A01;
            set.add(Integer.valueOf(R.id.menuitem_forward));
            set.add(Integer.valueOf(R.id.menuitem_delete));
            return true;
        }
        throw C13680ns.A0m();
    }

    public void APd(AnonymousClass05J r7) {
        if (this instanceof C603431a) {
            MediaGalleryActivity mediaGalleryActivity = ((C603431a) this).A00;
            C86144Rj r1 = mediaGalleryActivity.A0F;
            if (r1 != null) {
                r1.A00();
                mediaGalleryActivity.A0F = null;
            }
            mediaGalleryActivity.A06 = null;
            for (AnonymousClass01A r12 : mediaGalleryActivity.A2E()) {
                if (r12 instanceof AnonymousClass2DW) {
                    ((AnonymousClass2DW) r12).AWv();
                }
            }
        } else if (this instanceof IDxMCallbackShape71S0100000_1_I0) {
            IDxMCallbackShape71S0100000_1_I0 iDxMCallbackShape71S0100000_1_I0 = (IDxMCallbackShape71S0100000_1_I0) this;
            switch (iDxMCallbackShape71S0100000_1_I0.A01) {
                case 0:
                    Log.i("starred/selectionended");
                    Log.i("conversation/selectionended");
                    MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) iDxMCallbackShape71S0100000_1_I0.A00;
                    C86144Rj r0 = mediaAlbumActivity.A00.A0K;
                    if (r0 != null) {
                        r0.A00();
                        mediaAlbumActivity.A00.A0K = null;
                    }
                    mediaAlbumActivity.A08.notifyDataSetChanged();
                    mediaAlbumActivity.A00.A01 = null;
                    mediaAlbumActivity.A96();
                    return;
                case 1:
                    StringBuilder A0o = AnonymousClass000.A0o();
                    C45692Af r2 = (C45692Af) iDxMCallbackShape71S0100000_1_I0.A00;
                    A0o.append(r2 instanceof StarredMessagesActivity ? "starred" : "kept");
                    Log.i(AnonymousClass000.A0h("/selectionended", A0o));
                    Log.i("conversation/selectionended");
                    C86144Rj r02 = r2.A00.A0K;
                    if (r02 != null) {
                        r02.A00();
                        r2.A00.A0K = null;
                    }
                    r2.A07.notifyDataSetChanged();
                    r2.A00.A01 = null;
                    return;
                case 2:
                    Log.i("conversation/selectionended");
                    C42821yj r3 = (C42821yj) iDxMCallbackShape71S0100000_1_I0.A00;
                    C86144Rj r03 = C14530pL.A0K(r3).A0K;
                    if (r03 != null) {
                        r03.A00();
                        C14530pL.A0K(r3).A0K = null;
                    }
                    r3.A1n.A02();
                    AnonymousClass1yV r13 = r3.A22;
                    ((AnonymousClass1yR) r13).A00.A01 = null;
                    r13.A96();
                    r3.A1n.getConversationCursorAdapter().A07 = C14530pL.A0K(r3).A01;
                    if (r3.A2C.A0D == null) {
                        r3.A0B();
                        return;
                    }
                    return;
                case 3:
                    MyStatusesActivity myStatusesActivity = (MyStatusesActivity) iDxMCallbackShape71S0100000_1_I0.A00;
                    Set set = myStatusesActivity.A18;
                    set.clear();
                    Map map = myStatusesActivity.A17;
                    set.addAll(map.keySet());
                    Handler handler = myStatusesActivity.A0w;
                    Runnable runnable = myStatusesActivity.A12;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, 200);
                    map.clear();
                    myStatusesActivity.A01 = null;
                    myStatusesActivity.A0k.notifyDataSetChanged();
                    return;
                default:
                    StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) iDxMCallbackShape71S0100000_1_I0.A00;
                    C86144Rj r14 = storageUsageGalleryActivity.A0H;
                    if (r14 != null) {
                        r14.A00();
                        storageUsageGalleryActivity.A0H = null;
                    }
                    storageUsageGalleryActivity.A06 = null;
                    StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = storageUsageGalleryActivity.A0d;
                    if (storageUsageMediaGalleryFragment != null && storageUsageMediaGalleryFragment.A0c()) {
                        storageUsageMediaGalleryFragment.A06.A01();
                        return;
                    }
                    return;
            }
        } else {
            Log.i("conversation/selectionended");
        }
    }

    public final boolean AV8(Menu menu, AnonymousClass05J r11) {
        String str;
        UserJid A002;
        C20010zM A003;
        C20010zM A004;
        Map A042 = A04();
        if (!(A042 == null || A042.size() == 0)) {
            MenuItem menuItem = this.A09;
            C20310zq r3 = this.A0Q;
            A02(menuItem, r3, A042, 7);
            A02(this.f146y, r3, A042, 7);
            A02(this.sc, r3, A042, 7);
            A02(this.cp, r3, A042, 7);
            A02(this.A0H, r3, A042, 7);
            A02(this.A03, r3, A042, 4);
            A02(this.A0E, r3, A042, 0);
            A02(this.A06, r3, A042, 3);
            A02(this.A02, r3, A042, 6);
            A02(this.A07, r3, A042, 8);
            A02(this.A01, r3, A042, 9);
            A02(this.A0B, r3, A042, 10);
            A02(this.A0F, r3, A042, 11);
            A02(this.A0J, r3, A042, 12);
            A02(this.A0I, r3, A042, 13);
            A02(this.A0G, r3, A042, 14);
            A02(this.A0C, r3, A042, 15);
            A02(this.A05, r3, A042, 20);
            MenuItem menuItem2 = this.A0H;
            if (A042.size() == 1) {
                Map A043 = A04();
                AnonymousClass00B.A06(A043);
                C16740tZ r6 = (C16740tZ) AnonymousClass000.A0z(AnonymousClass000.A0y(A043)).getValue();
                C28381Vw r1 = r6.A11;
                if (C16030sJ.A0L(r1.A00) && ((!r1.A02 || r6.A0C == 6) && (A002 = C17240ul.A00(r6)) != null)) {
                    String A0C2 = this.A0N.A0C(this.A0M.A0A(A002));
                    MenuItem menuItem3 = this.A0B;
                    String[] strArr = {A0C2};
                    if (!(menuItem3 == null || (A004 = r3.A00(A03(menuItem3.getItemId()))) == null)) {
                        menuItem3.setTitle(A004.A00(this.A0L, strArr));
                    }
                    MenuItem menuItem4 = this.A0G;
                    String[] strArr2 = {A0C2};
                    if (!(menuItem4 == null || (A003 = r3.A00(A03(menuItem4.getItemId()))) == null)) {
                        menuItem4.setTitle(A003.A00(this.A0L, strArr2));
                    }
                }
            }
            A02(this.A00, r3, A042, 1);
            A02(this.A0D, r3, A042, 2);
            C20010zM A005 = r3.A00(16);
            if (A005 != null) {
                A005.A01(A042);
            }
            C20010zM A006 = r3.A00(17);
            if (A006 != null) {
                A006.A01(A042);
            }
            A02(this.A0A, r3, A042, 18);
            A02(this.A0K, r3, A042, 19);
            Locale A0m = C13690nt.A0m(this.A0R);
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, A042.size(), 0);
            r11.A0B(String.format(A0m, "%d", objArr));
            if (this instanceof IDxMCallbackShape71S0100000_1_I0) {
                IDxMCallbackShape71S0100000_1_I0 iDxMCallbackShape71S0100000_1_I0 = (IDxMCallbackShape71S0100000_1_I0) this;
                if (4 - iDxMCallbackShape71S0100000_1_I0.A01 == 0) {
                    StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) iDxMCallbackShape71S0100000_1_I0.A00;
                    Collection values = storageUsageGalleryActivity.A0H.A04.values();
                    HashMap A0x = AnonymousClass000.A0x();
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        C16740tZ A0V = C13680ns.A0V(it);
                        if (A0V instanceof C16730tY) {
                            C16730tY r12 = (C16730tY) A0V;
                            A0x.put(r12.A05, Long.valueOf(r12.A01));
                        }
                    }
                    long j2 = 0;
                    for (Object A012 : A0x.values()) {
                        j2 += C13700nu.A01(A012);
                    }
                    if (j2 > 0) {
                        str = (String) AnonymousClass2GQ.A00(storageUsageGalleryActivity.A01, j2, true).first;
                        r11.A0A(str);
                        A06(menu);
                        this.A0O.A01(this.A0L, menu);
                    }
                }
            }
            str = null;
            r11.A0A(str);
            A06(menu);
            this.A0O.A01(this.A0L, menu);
        }
        return true;
    }
}
