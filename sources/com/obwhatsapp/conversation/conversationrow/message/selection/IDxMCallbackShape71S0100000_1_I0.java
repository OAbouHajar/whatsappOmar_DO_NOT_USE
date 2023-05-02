package com.obwhatsapp.conversation.conversationrow.message.selection;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass05J;
import X.AnonymousClass1MD;
import X.AnonymousClass1yR;
import X.AnonymousClass1yV;
import X.AnonymousClass2DF;
import X.AnonymousClass3DP;
import X.AnonymousClass47T;
import X.AnonymousClass5PO;
import X.C000900k;
import X.C14530pL;
import X.C16000sG;
import X.C16080sP;
import X.C20310zq;
import X.C42821yj;
import X.C75273rt;
import X.C86144Rj;
import android.graphics.Rect;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.MyStatusesActivity;
import com.obwhatsapp.storage.StorageUsageGalleryActivity;
import java.util.Map;

public class IDxMCallbackShape71S0100000_1_I0 extends AnonymousClass3DP {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxMCallbackShape71S0100000_1_I0(C14530pL r1, C16000sG r2, C16080sP r3, AnonymousClass5PO r4, C20310zq r5, AnonymousClass013 r6, AnonymousClass47T r7, Object obj, int i2) {
        super(r1, r2, r3, r4, r5, r6, r7);
        this.A01 = i2;
        this.A00 = obj;
    }

    public Map A04() {
        AnonymousClass2DF A0K;
        C86144Rj r0;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 2:
                A0K = C14530pL.A0K((C42821yj) obj);
                break;
            case 3:
                return ((MyStatusesActivity) obj).A17;
            case 4:
                r0 = ((StorageUsageGalleryActivity) obj).A0H;
                break;
            default:
                A0K = ((AnonymousClass1yR) obj).A00;
                break;
        }
        r0 = A0K.A0K;
        if (r0 != null) {
            return r0.A04;
        }
        return null;
    }

    public void A05() {
        AnonymousClass2DF A0K;
        AnonymousClass05J r0;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 2:
                A0K = C14530pL.A0K((C42821yj) obj);
                break;
            case 3:
                r0 = ((MyStatusesActivity) obj).A01;
                break;
            case 4:
                ((StorageUsageGalleryActivity) obj).A96();
                return;
            default:
                A0K = ((AnonymousClass1yR) obj).A00;
                break;
        }
        r0 = A0K.A01;
        if (r0 != null) {
            r0.A05();
        }
    }

    public void A06(Menu menu) {
        boolean z2;
        MenuItem menuItem;
        View findViewById;
        View findViewById2;
        switch (this.A01) {
            case 0:
                MenuItem menuItem2 = this.A01;
                z2 = false;
                if (menuItem2 != null) {
                    menuItem2.setVisible(false);
                }
                menuItem = this.A0B;
                break;
            case 1:
                MenuItem menuItem3 = this.A0C;
                if (menuItem3 != null) {
                    menuItem3.setVisible(false);
                    return;
                }
                return;
            case 2:
                C42821yj r4 = (C42821yj) this.A00;
                r4.A0B();
                AnonymousClass1yV r2 = r4.A22;
                if (((AnonymousClass1yR) r2).A00.A0K != null) {
                    C000900k r22 = (C000900k) r2;
                    if (menu.size() != 0 && (findViewById = r22.findViewById(menu.getItem(0).getItemId())) != null && (findViewById.getParent() instanceof View) && (findViewById2 = ((View) findViewById.getParent()).findViewById(R.id.menuitem_overflow)) != null) {
                        Rect A0J = AnonymousClass000.A0J();
                        findViewById2.getGlobalVisibleRect(A0J);
                        if (!A0J.isEmpty()) {
                            AnonymousClass1MD r3 = r4.A1o;
                            C75273rt A002 = AnonymousClass1MD.A00(C14530pL.A0K(r4).A0K, r4.A33, 2);
                            A002.A04 = 2;
                            r3.A00.A06(A002);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                MenuItem menuItem4 = this.A0H;
                z2 = false;
                if (menuItem4 != null) {
                    menuItem4.setVisible(false);
                }
                MenuItem menuItem5 = this.A02;
                if (menuItem5 != null) {
                    menuItem5.setVisible(false);
                }
                MenuItem menuItem6 = this.A06;
                if (menuItem6 != null) {
                    menuItem6.setVisible(false);
                }
                MenuItem menuItem7 = this.A01;
                if (menuItem7 != null) {
                    menuItem7.setVisible(false);
                }
                MenuItem menuItem8 = this.A0B;
                if (menuItem8 != null) {
                    menuItem8.setVisible(false);
                }
                MenuItem menuItem9 = this.A00;
                if (menuItem9 != null) {
                    menuItem9.setVisible(false);
                }
                MenuItem menuItem10 = this.A0D;
                if (menuItem10 != null) {
                    menuItem10.setVisible(false);
                }
                menuItem = this.A0E;
                break;
            default:
                MenuItem menuItem11 = this.A0H;
                z2 = false;
                if (menuItem11 != null) {
                    menuItem11.setVisible(false);
                }
                MenuItem menuItem12 = this.A02;
                if (menuItem12 != null) {
                    menuItem12.setVisible(false);
                }
                MenuItem menuItem13 = this.A06;
                if (menuItem13 != null) {
                    menuItem13.setVisible(false);
                }
                MenuItem menuItem14 = this.A01;
                if (menuItem14 != null) {
                    menuItem14.setVisible(false);
                }
                MenuItem menuItem15 = this.A0B;
                if (menuItem15 != null) {
                    menuItem15.setVisible(false);
                }
                MenuItem menuItem16 = this.A0E;
                if (menuItem16 != null) {
                    menuItem16.setVisible(false);
                }
                menuItem = this.A09;
                break;
        }
        if (menuItem != null) {
            menuItem.setVisible(z2);
        }
        MenuItem menuItem17 = this.A0C;
        if (menuItem17 != null) {
            menuItem17.setVisible(z2);
        }
    }

    public boolean AM1(MenuItem menuItem, AnonymousClass05J r7) {
        if (2 - this.A01 == 0) {
            C42821yj r1 = (C42821yj) this.A00;
            C86144Rj r0 = C14530pL.A0K(r1).A0K;
            if (r0 == null || r0.A04.size() == 0) {
                return true;
            }
            AnonymousClass1MD r2 = r1.A1o;
            int itemId = menuItem.getItemId();
            C75273rt A002 = AnonymousClass1MD.A00(C14530pL.A0K(r1).A0K, r1.A33, 2);
            int i2 = 2;
            if (itemId != R.id.menuitem_overflow) {
                i2 = 3;
                if (itemId != R.id.menuitem_forward) {
                    i2 = 4;
                    if (itemId != R.id.menuitem_delete) {
                        i2 = 5;
                        if (itemId != R.id.menuitem_reply) {
                            i2 = 6;
                            if (itemId != R.id.menuitem_reply_privately) {
                                if (itemId == R.id.menuitem_star || itemId == R.id.menuitem_unstar || itemId == R.id.menuitem_unstar_all) {
                                    i2 = 7;
                                } else {
                                    i2 = 8;
                                    if (itemId != R.id.menuitem_copy) {
                                        i2 = 9;
                                        if (itemId != R.id.menuitem_report_message) {
                                            i2 = 10;
                                            if (itemId != R.id.menuitem_message_contact) {
                                                i2 = 1;
                                                if (itemId == R.id.menuitem_details) {
                                                    i2 = 11;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            A002.A04 = Integer.valueOf(i2);
            r2.A00.A06(A002);
        }
        return super.AM1(menuItem, r7);
    }
}
