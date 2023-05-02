package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.redex.IDxNConsumerShape151S0100000_1_I0;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.MuteDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.BlockConfirmationDialogFragment;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.conversationslist.ViewHolder;
import com.obwhatsapp.dialogs.CreateOrAddToContactsDialog;
import com.obwhatsapp.dialogs.ProgressDialogFragment;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.2JC  reason: invalid class name */
public class AnonymousClass2JC implements C009804r {
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
    public final AnonymousClass396 A0K = new AnonymousClass396();
    public final /* synthetic */ ConversationsFragment A0L;

    public AnonymousClass2JC(ConversationsFragment conversationsFragment) {
        this.A0L = conversationsFragment;
    }

    public final void A00(boolean z2) {
        ConversationsFragment conversationsFragment = this.A0L;
        C15830rv A012 = ConversationsFragment.A01(conversationsFragment);
        conversationsFragment.A1p = A012;
        UserJid of = UserJid.of(A012);
        conversationsFragment.A1Q(2);
        if (of != null) {
            String str = z2 ? "chat_list_block" : "chat_list_noinsub_block";
            boolean A0V = conversationsFragment.A0d.A0V(of);
            C16000sG r0 = conversationsFragment.A0p;
            if (A0V) {
                conversationsFragment.A0d.A0J(conversationsFragment.A0D(), r0.A0A(of), str, false);
                return;
            }
            C16010sH A0A2 = r0.A0A(of);
            C001000l A0D2 = conversationsFragment.A0D();
            if (A0A2.A0H()) {
                A0D2.startActivity(C14750ph.A0a(A0D2, of, str, false, false, true));
            } else {
                BlockConfirmationDialogFragment.A01(of, str, false, false, true, true).A1G(conversationsFragment.A0F(), (String) null);
            }
        }
    }

    public boolean AM1(MenuItem menuItem, AnonymousClass05J r18) {
        Object tag;
        Intent A0W;
        int itemId = menuItem.getItemId();
        ConversationsFragment conversationsFragment = this.A0L;
        C17760vb r3 = conversationsFragment.A0h;
        int i2 = 5;
        if (conversationsFragment.A2Q.size() == 1) {
            i2 = 1;
        }
        r3.A01 = i2;
        if (itemId == R.id.menuitem_conversations_archive) {
            ArrayList arrayList = new ArrayList(conversationsFragment.A2Q);
            conversationsFragment.A1Q(0);
            if (!arrayList.isEmpty()) {
                conversationsFragment.A2M.Acl(new RunnableRunnableShape5S0200000_I0_3(this, 40, arrayList));
            }
        } else if (itemId == R.id.menuitem_conversations_unarchive) {
            ArrayList arrayList2 = new ArrayList(conversationsFragment.A2Q);
            conversationsFragment.A1Q(0);
            conversationsFragment.A09.post(new RunnableRunnableShape5S0200000_I0_3(this, 41, arrayList2));
            if (conversationsFragment.A1J.A1b()) {
                int size = arrayList2.size();
                conversationsFragment.A1V(conversationsFragment.A03().getQuantityString(R.plurals.plurals002b, size, new Object[]{Integer.valueOf(size)}), conversationsFragment.A0J(R.string.str1886), new ViewOnClickCListenerShape3S0200000_I0(this, 27, arrayList2));
                return true;
            }
        } else if (itemId == R.id.menuitem_conversations_delete) {
            conversationsFragment.A2K.A07(conversationsFragment.A0D()).A00(new IDxNConsumerShape151S0100000_1_I0(this, 0));
            return true;
        } else if (itemId == R.id.menuitem_conversations_leave) {
            AnonymousClass02C r4 = conversationsFragment.A0H;
            if (r4 != null) {
                ProgressDialogFragment A012 = ProgressDialogFragment.A01(R.string.str130a, R.string.str13db);
                A012.A1G(r4, "count_progress");
                LinkedHashSet linkedHashSet = conversationsFragment.A2Q;
                HashSet hashSet = new HashSet();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C16050sL) {
                        hashSet.add(next);
                    }
                }
                conversationsFragment.A2M.Ack(new C55462je(new C94964ll(r4, A012, hashSet), conversationsFragment, conversationsFragment.A0i, conversationsFragment.A1Y, hashSet), new Object[0]);
                return true;
            }
        } else if (itemId == R.id.menuitem_conversations_mute) {
            C15830rv A013 = ConversationsFragment.A01(conversationsFragment);
            conversationsFragment.A1p = A013;
            MuteDialogFragment.A02(A013 != null ? Collections.singleton(A013) : conversationsFragment.A2Q, 1).A1G(conversationsFragment.A0G(), (String) null);
            return true;
        } else if (itemId == R.id.menuitem_conversations_unmute) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(conversationsFragment.A2Q);
            conversationsFragment.A1Q(1);
            conversationsFragment.A2M.Acl(new RunnableRunnableShape5S0200000_I0_3(this, 38, linkedHashSet2));
            return true;
        } else if (itemId == R.id.menuitem_conversations_block_non_trusted || itemId == R.id.menuitem_conversations_unblock_non_trusted) {
            A00(false);
            return true;
        } else if (itemId == R.id.menuitem_conversations_block || itemId == R.id.menuitem_conversations_unblock) {
            A00(true);
            return true;
        } else if (itemId == R.id.menuitem_conversations_pin || itemId == R.id.menuitem_conversations_overflow_menu_pin) {
            HashSet hashSet2 = new HashSet(conversationsFragment.A2Q);
            Set A0A2 = conversationsFragment.A27.A0A();
            hashSet2.removeAll(A0A2);
            int size2 = hashSet2.size();
            if (A0A2.size() + size2 > 100) {
                conversationsFragment.A18.A01(A0A2);
                return true;
            }
            conversationsFragment.A1Q(1);
            conversationsFragment.A2M.Acl(new RunnableRunnableShape0S0201000_I0((Object) this, size2, (Object) hashSet2, 15));
            return true;
        } else if (itemId == R.id.menuitem_conversations_unpin || itemId == R.id.menuitem_conversations_overflow_menu_unpin) {
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(conversationsFragment.A2Q);
            conversationsFragment.A1Q(1);
            conversationsFragment.A2M.Acl(new RunnableRunnableShape5S0200000_I0_3(this, 39, linkedHashSet3));
            return true;
        } else if (itemId == R.id.menuitem_conversations_create_shortcuit) {
            C15830rv A014 = ConversationsFragment.A01(conversationsFragment);
            conversationsFragment.A1p = A014;
            if (A014 != null) {
                conversationsFragment.A0U.A04(conversationsFragment.A0p.A0A(A014));
            }
            conversationsFragment.A1Q(2);
            return true;
        } else {
            if (itemId == R.id.menuitem_conversations_contact_info) {
                C15830rv A015 = ConversationsFragment.A01(conversationsFragment);
                conversationsFragment.A1p = A015;
                if (A015 != null) {
                    C16010sH A0A3 = conversationsFragment.A0p.A0A(A015);
                    conversationsFragment.A1Q(2);
                    if (A0A3.A0D != null) {
                        C001000l A0D2 = conversationsFragment.A0D();
                        Jid A082 = A0A3.A08(UserJid.class);
                        AnonymousClass00B.A06(A082);
                        A0D2.startActivity(C14750ph.A0Z(A0D2, (UserJid) A082, 12, true));
                        return true;
                    }
                    boolean A0G2 = C16030sJ.A0G(A0A3.A0E);
                    C001000l A0D3 = conversationsFragment.A0D();
                    C15830rv r0 = A0A3.A0E;
                    if (A0G2) {
                        A0W = C14750ph.A0R(A0D3, r0);
                    } else {
                        A0W = C14750ph.A0W(A0D3, r0, true, false, true);
                        AnonymousClass22U.A00(A0W, A0D3.getClass().getSimpleName());
                    }
                    A0D3.startActivity(A0W, (Bundle) null);
                    return true;
                }
            } else if (itemId == R.id.menuitem_conversations_add_new_contact) {
                C15830rv A016 = ConversationsFragment.A01(conversationsFragment);
                conversationsFragment.A1p = A016;
                if (A016 != null) {
                    C16010sH A0A4 = conversationsFragment.A0p.A0A(A016);
                    CreateOrAddToContactsDialog.A01(A0A4, conversationsFragment.A0P.A0I(A0A4.A0E)).A1G(conversationsFragment.A0F(), (String) null);
                    return true;
                }
            } else {
                if (itemId == R.id.menuitem_conversations_mark_read) {
                    Iterator it2 = conversationsFragment.A2Q.iterator();
                    while (it2.hasNext()) {
                        C15830rv r11 = (C15830rv) it2.next();
                        if (!C16030sJ.A0R(r11)) {
                            conversationsFragment.A0y.A01(r11, 1, true, true, true);
                            conversationsFragment.A1t.A08();
                        }
                    }
                } else if (itemId == R.id.menuitem_conversations_mark_unread) {
                    Iterator it3 = conversationsFragment.A2Q.iterator();
                    while (it3.hasNext()) {
                        C15830rv r1 = (C15830rv) it3.next();
                        if (!C16030sJ.A0G(r1) && !C16030sJ.A0R(r1)) {
                            conversationsFragment.A0y.A02(r1, true);
                        }
                    }
                } else if (itemId == R.id.menuitem_conversations_select_all) {
                    conversationsFragment.A2R.clear();
                    for (int i3 = 0; i3 < conversationsFragment.A09.getChildCount(); i3++) {
                        View childAt = conversationsFragment.A09.getChildAt(i3);
                        if (!(childAt == null || (tag = childAt.getTag()) == null || !(tag instanceof ViewHolder))) {
                            ViewHolder viewHolder = (ViewHolder) tag;
                            C15830rv ACx = viewHolder.A02.ACx();
                            if (!conversationsFragment.A2Q.contains(ACx)) {
                                conversationsFragment.A2Q.add(ACx);
                                viewHolder.A06.setBackgroundResource(R.color.color04c8);
                                viewHolder.A0K(true, true);
                            }
                        }
                    }
                    Iterator it4 = conversationsFragment.A1E().iterator();
                    while (it4.hasNext()) {
                        C15830rv ACx2 = ((C49902Wp) it4.next()).ACx();
                        if (!conversationsFragment.A2Q.contains(ACx2) && !C16030sJ.A0R(ACx2)) {
                            conversationsFragment.A2Q.add(ACx2);
                        }
                    }
                    if (conversationsFragment.A0F != null) {
                        conversationsFragment.A0F.A0B(String.format(AnonymousClass013.A00(conversationsFragment.A1K.A00), "%d", new Object[]{Integer.valueOf(conversationsFragment.A2Q.size())}));
                        conversationsFragment.A0F.A06();
                    }
                    if (!conversationsFragment.A2Q.isEmpty()) {
                        AnonymousClass2JP.A00(conversationsFragment.A0D(), conversationsFragment.A1E, conversationsFragment.A03().getQuantityString(R.plurals.plurals00dc, conversationsFragment.A2Q.size(), new Object[]{Integer.valueOf(conversationsFragment.A2Q.size())}));
                        return true;
                    }
                }
                conversationsFragment.A1Q(1);
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean APA(Menu menu, AnonymousClass05J r15) {
        yo.addHiOpt(menu, this.A0L);
        this.A08 = menu.add(0, R.id.menuitem_conversations_pin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_pin);
        this.A0D = menu.add(0, R.id.menuitem_conversations_unpin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unpin);
        MenuItem add = menu.add(0, R.id.menuitem_conversations_block_non_trusted, 0, (CharSequence) null);
        ConversationsFragment conversationsFragment = this.A0L;
        this.A02 = add.setIcon(AnonymousClass2SR.A02(conversationsFragment.A02(), R.drawable.ic_spam_block, R.color.color090b));
        this.A0H = menu.add(0, R.id.menuitem_conversations_unblock_non_trusted, 0, (CharSequence) null).setIcon(AnonymousClass2SR.A02(conversationsFragment.A02(), R.drawable.ic_spam_block, R.color.color090b));
        this.A05 = menu.add(0, R.id.menuitem_conversations_delete, 0, (CharSequence) null).setIcon(R.drawable.ic_action_delete);
        this.A07 = menu.add(0, R.id.menuitem_conversations_mute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_mute);
        this.A0C = menu.add(0, R.id.menuitem_conversations_unmute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unmute);
        this.A04 = menu.add(0, R.id.menuitem_conversations_archive, 0, (CharSequence) null).setIcon(AnonymousClass2SR.A02(conversationsFragment.A02(), R.drawable.ic_action_archive, R.color.color090b));
        this.A0B = menu.add(0, R.id.menuitem_conversations_unarchive, 0, (CharSequence) null).setIcon(AnonymousClass2SR.A02(conversationsFragment.A02(), R.drawable.ic_action_unarchive, R.color.color090b));
        this.A09 = menu.add(0, R.id.menuitem_conversations_overflow_menu_pin, 0, (CharSequence) null);
        this.A0E = menu.add(0, R.id.menuitem_conversations_overflow_menu_unpin, 0, (CharSequence) null);
        this.A06 = menu.add(0, R.id.menuitem_conversations_leave, 0, (CharSequence) null);
        this.A01 = menu.add(0, R.id.menuitem_conversations_create_shortcuit, 0, R.string.str00c0);
        this.A0J = menu.add(0, R.id.menuitem_conversations_contact_info, 0, R.string.str054e);
        this.A00 = menu.add(0, R.id.menuitem_conversations_add_new_contact, 0, R.string.str00a6);
        this.A0A = menu.add(0, R.id.menuitem_conversations_mark_read, 0, R.string.str0cc1);
        this.A0F = menu.add(0, R.id.menuitem_conversations_mark_unread, 0, R.string.str0cc2);
        this.A0G = menu.add(0, R.id.menuitem_conversations_select_all, 0, R.string.str14c2);
        this.A03 = menu.add(0, R.id.menuitem_conversations_block, 0, R.string.str022f);
        this.A0I = menu.add(0, R.id.menuitem_conversations_unblock, 0, R.string.str187d);
        this.A08.setShowAsAction(2);
        this.A0D.setShowAsAction(2);
        this.A04.setShowAsAction(2);
        this.A0B.setShowAsAction(2);
        this.A05.setShowAsAction(2);
        this.A07.setShowAsAction(2);
        this.A0C.setShowAsAction(2);
        this.A02.setShowAsAction(2);
        this.A0H.setShowAsAction(2);
        this.A09.setShowAsAction(8);
        this.A0E.setShowAsAction(8);
        this.A06.setShowAsAction(8);
        this.A01.setShowAsAction(8);
        this.A0J.setShowAsAction(8);
        this.A00.setShowAsAction(8);
        this.A0A.setShowAsAction(8);
        this.A0F.setShowAsAction(8);
        this.A0G.setShowAsAction(8);
        this.A03.setShowAsAction(8);
        this.A0I.setShowAsAction(8);
        AnonymousClass396 r0 = this.A0K;
        r0.A00(R.id.menuitem_conversations_overflow_menu_pin);
        r0.A00(R.id.menuitem_conversations_overflow_menu_unpin);
        r0.A00(R.id.menuitem_conversations_leave);
        r0.A00(R.id.menuitem_conversations_create_shortcuit);
        r0.A00(R.id.menuitem_conversations_contact_info);
        r0.A00(R.id.menuitem_conversations_add_new_contact);
        r0.A00(R.id.menuitem_conversations_mark_read);
        r0.A00(R.id.menuitem_conversations_mark_unread);
        r0.A00(R.id.menuitem_conversations_select_all);
        r0.A00(R.id.menuitem_conversations_block);
        r0.A00(R.id.menuitem_conversations_unblock);
        return true;
    }

    public void APd(AnonymousClass05J r4) {
        ConversationsFragment conversationsFragment = this.A0L;
        conversationsFragment.A1P(2);
        conversationsFragment.A0F = null;
        AnonymousClass2X9 r0 = conversationsFragment.A12;
        if (r0 != null) {
            r0.setEnableState(true);
        }
        AnonymousClass2X9 r02 = conversationsFragment.A11;
        if (r02 != null) {
            r02.setEnableState(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0301, code lost:
        if (r2.A1c() != false) goto L_0x0303;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x030d, code lost:
        if (r16 == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0318, code lost:
        if (r16 != false) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r2 != 1) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0242, code lost:
        if (r0 == false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0248, code lost:
        if (r0 == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024e, code lost:
        if (r0 != false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0254, code lost:
        if (r0 != false) goto L_0x0256;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x035d A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e8 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AV8(android.view.Menu r21, X.AnonymousClass05J r22) {
        /*
            r20 = this;
            r10 = r20
            com.obwhatsapp.conversationslist.ConversationsFragment r9 = r10.A0L
            boolean r0 = r9.A0c()
            r8 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "conversations/actionmode/fragment is not attached to activity."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r8
        L_0x0011:
            java.util.LinkedHashSet r0 = r9.A2Q
            r3 = 1
            r5 = r22
            if (r0 == 0) goto L_0x03b8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03b8
            X.2X9 r0 = r9.A12
            if (r0 == 0) goto L_0x0025
            r0.setEnableState(r8)
        L_0x0025:
            X.2X9 r0 = r9.A11
            if (r0 == 0) goto L_0x002c
            r0.setEnableState(r8)
        L_0x002c:
            java.util.LinkedHashSet r0 = r9.A2Q
            int r2 = r0.size()
            boolean r0 = r9.A2U
            if (r0 == 0) goto L_0x03b4
            X.0sK r0 = r9.A0P
            r0.A0B()
            X.1Zb r0 = r0.A01
            if (r0 == 0) goto L_0x03b4
            X.0rv r1 = r0.A0E
            if (r1 == 0) goto L_0x03b4
            java.util.LinkedHashSet r0 = r9.A2Q
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x03b4
            r19 = 0
            r18 = 0
            if (r2 == r3) goto L_0x0053
        L_0x0051:
            r18 = 1
        L_0x0053:
            X.013 r0 = r9.A1K
            android.content.Context r0 = r0.A00
            java.util.Locale r4 = X.AnonymousClass013.A00(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r8] = r0
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r4, r0, r1)
            r5.A0B(r0)
            android.view.MenuItem r4 = r10.A04
            android.content.res.Resources r1 = r9.A03()
            r0 = 2131755019(0x7f10000b, float:1.9140905E38)
            java.lang.String r0 = r1.getQuantityString(r0, r2)
            r4.setTitle(r0)
            android.view.MenuItem r4 = r10.A0B
            android.content.res.Resources r1 = r9.A03()
            r0 = 2131755026(0x7f100012, float:1.914092E38)
            java.lang.String r0 = r1.getQuantityString(r0, r2)
            r4.setTitle(r0)
            android.view.MenuItem r4 = r10.A05
            android.content.res.Resources r1 = r9.A03()
            r0 = 2131755021(0x7f10000d, float:1.914091E38)
            java.lang.String r0 = r1.getQuantityString(r0, r2)
            r4.setTitle(r0)
            android.view.MenuItem r1 = r10.A07
            r0 = 2131889409(0x7f120d01, float:1.941348E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r10.A0C
            r0 = 2131889427(0x7f120d13, float:1.9413517E38)
            r1.setTitle(r0)
            android.view.MenuItem r4 = r10.A06
            android.content.res.Resources r1 = r9.A03()
            r0 = 2131755023(0x7f10000f, float:1.9140914E38)
            java.lang.String r0 = r1.getQuantityString(r0, r2)
            r4.setTitle(r0)
            android.view.MenuItem r1 = r10.A08
            android.content.res.Resources r0 = r9.A03()
            r5 = 2131755025(0x7f100011, float:1.9140918E38)
            java.lang.String r0 = r0.getQuantityString(r5, r2)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r10.A0D
            android.content.res.Resources r0 = r9.A03()
            r4 = 2131755027(0x7f100013, float:1.9140922E38)
            java.lang.String r0 = r0.getQuantityString(r4, r2)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r10.A09
            android.content.res.Resources r0 = r9.A03()
            java.lang.String r0 = r0.getQuantityString(r5, r2)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r10.A0E
            android.content.res.Resources r0 = r9.A03()
            java.lang.String r0 = r0.getQuantityString(r4, r2)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r10.A02
            r0 = 2131886639(0x7f12022f, float:1.9407863E38)
            r1.setTitle(r0)
            android.view.MenuItem r1 = r10.A0H
            r0 = 2131892349(0x7f12187d, float:1.9419444E38)
            r1.setTitle(r0)
            java.util.ArrayList r0 = r9.A1E()
            int r0 = r0.size()
            r7 = 0
            if (r2 >= r0) goto L_0x0112
            r7 = 1
        L_0x0112:
            r0 = 64
            r6 = 0
            if (r2 <= r0) goto L_0x0118
            r6 = 1
        L_0x0118:
            java.util.LinkedHashSet r0 = r9.A2Q
            int r0 = r0.size()
            if (r0 != r3) goto L_0x0121
            r8 = 1
        L_0x0121:
            java.util.LinkedHashSet r0 = r9.A2Q
            int r0 = r0.size()
            r5 = 0
            if (r0 != r3) goto L_0x012b
            r5 = 1
        L_0x012b:
            java.util.LinkedHashSet r2 = r9.A2Q
            int r0 = r2.size()
            r1 = 1
            if (r0 != r3) goto L_0x03b1
            java.util.Iterator r0 = r2.iterator()
            java.lang.Object r0 = r0.next()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            boolean r0 = X.C16030sJ.A0M(r0)
            if (r0 != 0) goto L_0x03b1
            X.0sK r0 = r9.A0P
            boolean r0 = r0.A0G()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03b1
        L_0x014e:
            java.util.LinkedHashSet r0 = r9.A2Q
            java.util.Iterator r17 = r0.iterator()
            r4 = 1
            r3 = 0
            r16 = 0
            r15 = 0
            r11 = 1
            r14 = 1
            r12 = 1
        L_0x015c:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01ff
            java.lang.Object r2 = r17.next()
            X.0rv r2 = (X.C15830rv) r2
            X.0sG r0 = r9.A0p
            X.0sH r12 = r0.A0A(r2)
            X.0rs r0 = r9.A0z
            boolean r13 = r0.A0C(r2)
            boolean r0 = X.C16030sJ.A0R(r2)
            if (r0 == 0) goto L_0x0183
            r6 = 1
            r8 = 0
            r5 = 0
            r1 = 0
            r3 = 1
            r16 = 1
            r15 = 1
            r11 = 0
        L_0x0183:
            X.1ko r0 = r12.A0D
            if (r0 != 0) goto L_0x03a2
            X.0rv r0 = r12.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 == 0) goto L_0x0360
            android.view.MenuItem r1 = r10.A0J
            r0 = 2131889248(0x7f120c60, float:1.9413154E38)
            r1.setTitle(r0)
            r8 = 0
            r1 = 0
        L_0x0199:
            r11 = 0
        L_0x019a:
            X.0zl r0 = r9.A1f
            boolean r0 = X.C40561uK.A01(r0, r2)
            if (r0 == 0) goto L_0x01a3
            r1 = 0
        L_0x01a3:
            X.0rt r0 = r9.A1M
            boolean r0 = r0.A0G(r2)
            r0 = r0 ^ 1
            r3 = r3 | r0
            boolean r0 = r9.A2U
            if (r0 == 0) goto L_0x01b8
            X.0sK r0 = r9.A0P
            boolean r0 = r0.A0I(r2)
            if (r0 != 0) goto L_0x01ca
        L_0x01b8:
            X.0sf r12 = r9.A27
            java.lang.String r0 = r2.getRawString()
            X.1WS r0 = r12.A07(r0)
            boolean r0 = r0.A09()
            r0 = r0 ^ 1
            r16 = r16 | r0
        L_0x01ca:
            X.0sf r12 = r9.A27
            java.lang.String r0 = r2.getRawString()
            X.1WS r0 = r12.A07(r0)
            boolean r0 = r0.A0G
            r0 = r0 ^ 1
            r15 = r15 | r0
            X.0rt r0 = r9.A1M
            int r2 = r0.A00(r2)
            r0 = 0
            if (r2 != 0) goto L_0x01e3
            r0 = 1
        L_0x01e3:
            r0 = r0 ^ 1
            r6 = r6 | r0
            if (r4 != 0) goto L_0x035d
            if (r11 != 0) goto L_0x035d
            if (r8 != 0) goto L_0x035d
            if (r5 != 0) goto L_0x035d
            if (r1 != 0) goto L_0x035d
            if (r14 != 0) goto L_0x035d
            if (r15 == 0) goto L_0x035d
            if (r16 == 0) goto L_0x035d
            if (r6 == 0) goto L_0x035d
            if (r3 == 0) goto L_0x035d
            r8 = 0
            r5 = 0
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x01ff:
            android.view.MenuItem r0 = r10.A05
            r0.setVisible(r4)
            android.view.MenuItem r0 = r10.A06
            r0.setVisible(r11)
            android.view.MenuItem r0 = r10.A0G
            r0.setVisible(r7)
            android.view.MenuItem r0 = r10.A04
            r0.setVisible(r3)
            com.obwhatsapp.yo.yo.hHideOpt(r3)
            android.view.MenuItem r2 = r10.A0B
            r0 = r3 ^ 1
            r2.setVisible(r0)
            X.0rv r0 = com.obwhatsapp.conversationslist.ConversationsFragment.A01(r9)
            com.whatsapp.jid.UserJid r4 = com.whatsapp.jid.UserJid.of(r0)
            if (r4 == 0) goto L_0x0357
            X.0pd r3 = r9.A1e
            r2 = 2290(0x8f2, float:3.209E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r2)
            if (r0 == 0) goto L_0x0357
            X.01Y r0 = r9.A0d
            boolean r3 = r0.A0V(r4)
            X.14s r0 = r9.A2F
            boolean r0 = r0.A07(r4)
            if (r3 != 0) goto L_0x0244
            r4 = 1
            if (r0 != 0) goto L_0x024a
        L_0x0244:
            r4 = 0
            if (r3 == 0) goto L_0x024a
            r2 = 1
            if (r0 != 0) goto L_0x0250
        L_0x024a:
            r2 = 0
            if (r3 != 0) goto L_0x0250
            r7 = 1
            if (r0 == 0) goto L_0x0256
        L_0x0250:
            r7 = 0
            if (r3 == 0) goto L_0x0256
            r3 = 1
            if (r0 == 0) goto L_0x0257
        L_0x0256:
            r3 = 0
        L_0x0257:
            android.view.MenuItem r0 = r10.A03
            r0.setVisible(r4)
            android.view.MenuItem r0 = r10.A0I
            r0.setVisible(r2)
            android.view.MenuItem r0 = r10.A02
            r0.setVisible(r7)
            android.view.MenuItem r0 = r10.A0H
            r0.setVisible(r3)
            if (r15 == 0) goto L_0x034d
            boolean r0 = r9 instanceof com.obwhatsapp.conversationslist.ArchivedConversationsFragment
            if (r0 != 0) goto L_0x034d
            r4 = 1
        L_0x0272:
            r2 = 0
        L_0x0273:
            if (r7 != 0) goto L_0x0336
            if (r3 != 0) goto L_0x0336
            android.view.MenuItem r0 = r10.A08
            r0.setVisible(r4)
            android.view.MenuItem r0 = r10.A0D
            r0.setVisible(r2)
            android.view.MenuItem r0 = r10.A09
            r3 = 0
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0E
            r0.setVisible(r3)
        L_0x028c:
            if (r12 == 0) goto L_0x02dc
            android.view.MenuItem r0 = r10.A07
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0C
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0A
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0F
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A04
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0B
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A08
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0D
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A09
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0E
        L_0x02bd:
            r0.setVisible(r3)
        L_0x02c0:
            android.view.MenuItem r0 = r10.A01
            r0.setVisible(r8)
            android.view.MenuItem r0 = r10.A0J
            r0.setVisible(r5)
            android.view.MenuItem r0 = r10.A00
            r0.setVisible(r1)
            X.396 r1 = r10.A0K
            X.00l r0 = r9.A0C()
            r2 = r21
            r1.A01(r0, r2)
            r0 = 1
            return r0
        L_0x02dc:
            if (r14 == 0) goto L_0x02f0
            android.view.MenuItem r0 = r10.A07
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0C
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0A
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0F
            goto L_0x02bd
        L_0x02f0:
            boolean r0 = r9 instanceof com.obwhatsapp.conversationslist.ArchivedConversationsFragment
            if (r0 == 0) goto L_0x0334
            X.0rz r2 = r9.A1J
            boolean r0 = r2.A1b()
            if (r0 == 0) goto L_0x0303
            boolean r2 = r2.A1c()
            r0 = 1
            if (r2 == 0) goto L_0x0304
        L_0x0303:
            r0 = 0
        L_0x0304:
            r0 = r0 ^ 1
        L_0x0306:
            android.view.MenuItem r2 = r10.A07
            if (r0 == 0) goto L_0x032b
            if (r19 == 0) goto L_0x030f
            r0 = 1
            if (r16 != 0) goto L_0x0310
        L_0x030f:
            r0 = 0
        L_0x0310:
            r2.setVisible(r0)
            android.view.MenuItem r2 = r10.A0C
            if (r18 == 0) goto L_0x031a
            r0 = 1
            if (r16 == 0) goto L_0x031b
        L_0x031a:
            r0 = 0
        L_0x031b:
            r2.setVisible(r0)
        L_0x031e:
            android.view.MenuItem r0 = r10.A0A
            r0.setVisible(r6)
            android.view.MenuItem r2 = r10.A0F
            r0 = r6 ^ 1
            r2.setVisible(r0)
            goto L_0x02c0
        L_0x032b:
            r2.setVisible(r3)
            android.view.MenuItem r0 = r10.A0C
            r0.setVisible(r3)
            goto L_0x031e
        L_0x0334:
            r0 = 1
            goto L_0x0306
        L_0x0336:
            r3 = 0
            android.view.MenuItem r0 = r10.A08
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A0D
            r0.setVisible(r3)
            android.view.MenuItem r0 = r10.A09
            r0.setVisible(r4)
            android.view.MenuItem r0 = r10.A0E
            r0.setVisible(r2)
            goto L_0x028c
        L_0x034d:
            r4 = 0
            if (r15 != 0) goto L_0x0272
            boolean r0 = r9 instanceof com.obwhatsapp.conversationslist.ArchivedConversationsFragment
            if (r0 != 0) goto L_0x0272
            r2 = 1
            goto L_0x0273
        L_0x0357:
            r3 = 0
            r4 = 0
            r2 = 0
            r7 = 0
            goto L_0x0257
        L_0x035d:
            r12 = 0
            goto L_0x015c
        L_0x0360:
            boolean r0 = r12.A0J()
            if (r0 == 0) goto L_0x03ad
            android.view.MenuItem r1 = r10.A0J
            r0 = 2131888794(0x7f120a9a, float:1.9412233E38)
            r1.setTitle(r0)
            X.0ul r13 = r9.A1h
            X.0sL r12 = X.C16050sL.A03(r2)
            boolean r0 = r13.A0c()
            if (r0 == 0) goto L_0x0391
            X.0rt r0 = r13.A0R
            int r1 = r0.A02(r12)
            r0 = 3
            if (r1 != r0) goto L_0x0391
            X.0sO r0 = r13.A0a
            boolean r0 = r0.A0A(r12)
            if (r0 == 0) goto L_0x0391
            r4 = 0
        L_0x038c:
            r11 = 0
        L_0x038d:
            r1 = 0
            r14 = 0
            goto L_0x019a
        L_0x0391:
            X.0sO r1 = r9.A1R
            com.whatsapp.jid.GroupJid r0 = com.whatsapp.jid.GroupJid.of(r2)
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x038c
            r4 = 0
            goto L_0x038d
        L_0x03a2:
            android.view.MenuItem r1 = r10.A0J
            r0 = 2131892692(0x7f1219d4, float:1.942014E38)
            r1.setTitle(r0)
            r4 = r4 & r13
            r1 = 0
            goto L_0x03ae
        L_0x03ad:
            r5 = 0
        L_0x03ae:
            r14 = 0
            goto L_0x0199
        L_0x03b1:
            r1 = 0
            goto L_0x014e
        L_0x03b4:
            r19 = 1
            goto L_0x0051
        L_0x03b8:
            X.2X9 r0 = r9.A12
            if (r0 == 0) goto L_0x03bf
            r0.setEnableState(r3)
        L_0x03bf:
            X.2X9 r0 = r9.A11
            if (r0 == 0) goto L_0x03c6
            r0.setEnableState(r3)
        L_0x03c6:
            r5.A05()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JC.AV8(android.view.Menu, X.05J):boolean");
    }
}
