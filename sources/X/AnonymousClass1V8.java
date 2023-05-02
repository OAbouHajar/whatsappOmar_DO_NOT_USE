package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape194S0100000_2_I0;
import com.facebook.redex.IDxIDecorationShape4S0101000_2_I0;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.facebook.redex.IDxProviderShape156S0100000_2_I0;
import com.facebook.redex.IDxTListenerShape170S0100000_2_I0;
import com.facebook.redex.IDxUnblockerShape35S0300000_2_I1;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.EmptyTellAFriendView;
import com.obwhatsapp.IDxTSpanShape54S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.blocklist.UnblockDialogFragment;
import com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPicker;
import com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.community.ConfirmLinkExistingGroupsDialog;
import com.obwhatsapp.community.LinkExistingGroups;
import com.obwhatsapp.components.FloatingActionButton;
import com.obwhatsapp.contact.IDxCObserverShape66S0100000_1_I0;
import com.obwhatsapp.contact.picker.AddGroupParticipantsSelector;
import com.obwhatsapp.contact.picker.ContactsAttachmentSelector;
import com.obwhatsapp.contact.picker.ListMembersSelector;
import com.obwhatsapp.conversation.EditBroadcastRecipientsSelector;
import com.obwhatsapp.group.EditGroupAdminsSelector;
import com.obwhatsapp.group.GroupMembersSelector;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape82S0100000_2_I1;
import com.obwhatsapp.registration.NotifyContactsSelector;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1V8  reason: invalid class name */
public abstract class AnonymousClass1V8 extends AnonymousClass1V9 {
    public int A00;
    public int A01;
    public AnimatorSet A02;
    public ValueAnimator A03;
    public MenuItem A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ListView A08;
    public RecyclerView A09;
    public AnonymousClass267 A0A;
    public AnonymousClass1BJ A0B;
    public C16760tb A0C;
    public WaImageButton A0D;
    public WaImageButton A0E;
    public AnonymousClass01Y A0F;
    public AnonymousClass127 A0G;
    public FloatingActionButton A0H;
    public AnonymousClass19Y A0I;
    public C16000sG A0J;
    public C17140ub A0K;
    public C16080sP A0L;
    public AnonymousClass2Ao A0M;
    public C17200uh A0N;
    public C607435q A0O;
    public C64253Nk A0P;
    public AnonymousClass36J A0Q;
    public C220516l A0R;
    public AnonymousClass013 A0S;
    public AnonymousClass18R A0T;
    public C25781Lc A0U;
    public AnonymousClass01D A0V = new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(this, 18));
    public String A0W;
    public ArrayList A0X;
    public List A0Y = new ArrayList();
    public List A0Z;
    public boolean A0a = true;
    public boolean A0b;
    public final C40781ug A0c = new IDxSObserverShape63S0100000_2_I0(this, 7);
    public final C33481ie A0d = new IDxCObserverShape66S0100000_1_I0(this, 3);
    public final AnonymousClass28C A0e = new AnonymousClass28C(this);
    public final ArrayList A0f = new ArrayList();
    public final List A0g = new ArrayList();

    public int A36() {
        return this instanceof NotifyContactsSelector ? R.string.str040d : this instanceof GroupMembersSelector ? R.string.str0dd4 : this instanceof EditGroupAdminsSelector ? R.string.str0762 : this instanceof EditBroadcastRecipientsSelector ? R.string.str0758 : this instanceof ListMembersSelector ? R.string.str0dde : this instanceof ContactsAttachmentSelector ? R.string.str05aa : this instanceof AddGroupParticipantsSelector ? R.string.str00ba : this instanceof LinkExistingGroups ? R.string.str0c1d : ((GroupCallParticipantPicker) this) instanceof GroupCallParticipantPickerSheet ? R.string.str0d03 : R.string.str0dd5;
    }

    public int A37() {
        return 0;
    }

    public int A38() {
        if (this instanceof NotifyContactsSelector) {
            return R.plurals.plurals00ef;
        }
        if ((this instanceof GroupMembersSelector) || (this instanceof EditGroupAdminsSelector)) {
            return R.plurals.plurals00ba;
        }
        if ((this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector)) {
            return R.plurals.plurals000a;
        }
        if (this instanceof ContactsAttachmentSelector) {
            return R.plurals.plurals0024;
        }
        if (this instanceof AddGroupParticipantsSelector) {
            return R.plurals.plurals00ba;
        }
        if (!(this instanceof LinkExistingGroups)) {
            return R.plurals.plurals00b9;
        }
        LinkExistingGroups linkExistingGroups = (LinkExistingGroups) this;
        C14710pd r1 = linkExistingGroups.A01.A0D;
        C16620tM r3 = C16620tM.A02;
        return (r1.A03(r3, 1990) >= linkExistingGroups.A01.A0D.A03(r3, 1238) || linkExistingGroups.A05 != null) ? R.plurals.plurals00c2 : R.plurals.plurals00c3;
    }

    public int A39() {
        if (this instanceof NotifyContactsSelector) {
            return Integer.MAX_VALUE;
        }
        if (this instanceof GroupMembersSelector) {
            return ((GroupMembersSelector) this).A01.A0A.A03(C16620tM.A02, 1304) - 1;
        }
        if (this instanceof EditGroupAdminsSelector) {
            EditGroupAdminsSelector editGroupAdminsSelector = (EditGroupAdminsSelector) this;
            int size = editGroupAdminsSelector.A0Y.size();
            if (size != 0) {
                return Math.min(editGroupAdminsSelector.A00.A0A.A03(C16620tM.A02, 1304) - 1, size);
            }
            return Integer.MAX_VALUE;
        } else if ((this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector)) {
            int A022 = this.A06.A02(C15910s6.A1A);
            if (A022 == 0) {
                return Integer.MAX_VALUE;
            }
            return A022;
        } else if (this instanceof ContactsAttachmentSelector) {
            return 257;
        } else {
            if (!(this instanceof AddGroupParticipantsSelector)) {
                return this instanceof LinkExistingGroups ? getIntent().getIntExtra("max_groups_allowed_to_link", Integer.MAX_VALUE) : this.A0C.A03(C16620tM.A02, 862) - 1;
            }
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            return (addGroupParticipantsSelector.A04.A0A.A03(C16620tM.A02, 1304) - 1) - addGroupParticipantsSelector.A0E.size();
        }
    }

    public int A3A() {
        if (this instanceof NotifyContactsSelector) {
            return 0;
        }
        if (this instanceof GroupMembersSelector) {
            return 1;
        }
        if (this instanceof EditGroupAdminsSelector) {
            return 0;
        }
        if ((this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector)) {
            return 2;
        }
        return ((this instanceof ContactsAttachmentSelector) || (this instanceof AddGroupParticipantsSelector) || !(this instanceof LinkExistingGroups)) ? 1 : 0;
    }

    public int A3B() {
        if (this instanceof NotifyContactsSelector) {
            return R.string.str072c;
        }
        if (this instanceof GroupMembersSelector) {
            return R.string.str0de0;
        }
        if ((this instanceof EditGroupAdminsSelector) || (this instanceof EditBroadcastRecipientsSelector)) {
            return R.string.str072c;
        }
        if (this instanceof ListMembersSelector) {
            return R.string.str0607;
        }
        if (this instanceof ContactsAttachmentSelector) {
            return R.string.str0de0;
        }
        if (this instanceof AddGroupParticipantsSelector) {
            return R.string.str072c;
        }
        if (!(this instanceof LinkExistingGroups)) {
            return 0;
        }
        return R.string.str0de0;
    }

    public Drawable A3C() {
        if (!(this instanceof NotifyContactsSelector)) {
            if (!(this instanceof GroupMembersSelector)) {
                if (!(this instanceof EditGroupAdminsSelector) && !(this instanceof EditBroadcastRecipientsSelector) && !(this instanceof ListMembersSelector)) {
                    if (!(this instanceof ContactsAttachmentSelector)) {
                        if (!(this instanceof AddGroupParticipantsSelector)) {
                            if (!(this instanceof LinkExistingGroups)) {
                                return null;
                            }
                        }
                    }
                }
            }
            return new C447725m(AnonymousClass00T.A04(this, R.drawable.ic_fab_next), this.A0S);
        }
        return AnonymousClass00T.A04(this, R.drawable.ic_fab_check);
    }

    public View A3D() {
        if (!(this instanceof LinkExistingGroups)) {
            return null;
        }
        View inflate = getLayoutInflater().inflate(R.layout.layout037f, ADA(), false);
        TextView textView = (TextView) C004601z.A0E(inflate, R.id.link_existing_groups_picker_header_title);
        AnonymousClass1UP.A06(textView);
        textView.setText(R.string.str0c21);
        return inflate;
    }

    public View A3E() {
        if (this instanceof AddGroupParticipantsSelector) {
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            C16050sL r1 = addGroupParticipantsSelector.A06;
            if (r1 == null || !addGroupParticipantsSelector.A04.A0A(r1) || !addGroupParticipantsSelector.A0C.A0E(C16620tM.A02, 1863)) {
                return null;
            }
            View inflate = addGroupParticipantsSelector.getLayoutInflater().inflate(R.layout.layout061b, (ViewGroup) null);
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C004601z.A0E(inflate, R.id.disclaimer_warning_text);
            addGroupParticipantsSelector.A3g(textEmojiLabel, addGroupParticipantsSelector.A06);
            textEmojiLabel.setMovementMethod(new AnonymousClass3MF());
            return inflate;
        } else if (this instanceof LinkExistingGroups) {
            LinkExistingGroups linkExistingGroups = (LinkExistingGroups) this;
            View view = linkExistingGroups.A00;
            if (view != null) {
                return view;
            }
            View inflate2 = linkExistingGroups.getLayoutInflater().inflate(R.layout.layout061b, (ViewGroup) null);
            linkExistingGroups.A00 = inflate2;
            ((TextView) C004601z.A0E(inflate2, R.id.disclaimer_warning_text)).setText(linkExistingGroups.A3G());
            return linkExistingGroups.A00;
        } else if (!(this instanceof GroupCallParticipantPicker)) {
            return null;
        } else {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            if (groupCallParticipantPicker instanceof GroupCallParticipantPickerSheet) {
                return null;
            }
            View inflate3 = groupCallParticipantPicker.getLayoutInflater().inflate(R.layout.layout061b, (ViewGroup) null);
            TextView textView = (TextView) inflate3.findViewById(R.id.disclaimer_warning_text);
            Spanned fromHtml = Html.fromHtml(groupCallParticipantPicker.A0S.A0J(new Object[]{Integer.valueOf(groupCallParticipantPicker.A39())}, R.plurals.plurals0192, (long) groupCallParticipantPicker.A39()));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
            URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    if ("learn_more_link".equals(uRLSpan.getURL())) {
                        Log.i("GroupCallParticipantPicker/getCustomWarningLayout/learn_more_link link found");
                        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                        int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                        int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                        spannableStringBuilder.removeSpan(uRLSpan);
                        spannableStringBuilder.setSpan(new IDxTSpanShape54S0100000_2_I1((Context) groupCallParticipantPicker, groupCallParticipantPicker), spanStart, spanEnd, spanFlags);
                    }
                }
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(new AnonymousClass3MF());
            return inflate3;
        }
    }

    public AnonymousClass1VD A3F() {
        return this instanceof LinkExistingGroups ? new IDxPObserverShape82S0100000_2_I1(this, 1) : new IDxPObserverShape81S0100000_2_I0(this, 9);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        r0 = r3.A02.A06((r1 = r3.A05));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A3G() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof com.obwhatsapp.contact.picker.ListMembersSelector
            if (r0 == 0) goto L_0x0037
            X.0sK r0 = r4.A01
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            X.013 r3 = r4.A0S
            java.lang.String r2 = r0.cc
            java.lang.String r1 = r0.jabber_id
            int r0 = r2.length()
            java.lang.String r0 = r1.substring(r0)
            java.lang.String r0 = X.AnonymousClass2JN.A0E(r2, r0)
            java.lang.String r2 = r3.A0H(r0)
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r3 = r2.replace(r1, r0)
            r2 = 2131886760(0x7f1202a8, float:1.9408108E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r3
            java.lang.String r0 = r4.getString(r2, r1)
            return r0
        L_0x0037:
            boolean r0 = r4 instanceof com.obwhatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x0068
            r3 = r4
            com.obwhatsapp.community.LinkExistingGroups r3 = (com.obwhatsapp.community.LinkExistingGroups) r3
            X.0pd r2 = r3.A0C
            r1 = 2447(0x98f, float:3.429E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x005c
            X.0sL r1 = r3.A05
            if (r1 == 0) goto L_0x0064
            X.0rt r0 = r3.A02
            X.0rx r0 = r0.A06(r1)
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.A0g
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0064
        L_0x005c:
            r0 = 2131889182(0x7f120c1e, float:1.941302E38)
        L_0x005f:
            java.lang.String r0 = r3.getString(r0)
            return r0
        L_0x0064:
            r0 = 2131889183(0x7f120c1f, float:1.9413022E38)
            goto L_0x005f
        L_0x0068:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1V8.A3G():java.lang.String");
    }

    public final List A3H() {
        List<C16010sH> list = this.A0g;
        ArrayList arrayList = new ArrayList(list.size());
        for (C16010sH A082 : list) {
            arrayList.add(A082.A08(UserJid.class));
        }
        return arrayList;
    }

    public void A3I() {
        AnonymousClass02W layoutManager;
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int A052 = layoutManager.A05();
            int i2 = 0;
            View A0C2 = this.A09.getLayoutManager().A0C(0);
            if (A052 != 0 && A0C2 != null) {
                int width = this.A09.getWidth();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A0C2.getLayoutParams();
                int width2 = A0C2.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int paddingRight = this.A09.getPaddingRight();
                if (A052 < this.A0g.size()) {
                    int i3 = A052 * width2;
                    if (paddingRight == 0 && width >= i3 - marginLayoutParams.leftMargin && width <= i3 + marginLayoutParams.rightMargin) {
                        i2 = width2 >> 1;
                    } else {
                        return;
                    }
                } else if (paddingRight <= 0) {
                    return;
                }
                RecyclerView recyclerView2 = this.A09;
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.A09.getPaddingTop(), i2, this.A09.getPaddingBottom());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.2zu] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3J() {
        /*
            r13 = this;
            r10 = r13
            X.35q r0 = r13.A0O
            r1 = 1
            if (r0 == 0) goto L_0x0009
            r0.A06(r1)
        L_0x0009:
            X.36J r0 = r13.A0Q
            if (r0 == 0) goto L_0x0013
            r0.A06(r1)
            r0 = 0
            r13.A0Q = r0
        L_0x0013:
            boolean r0 = r13 instanceof com.obwhatsapp.community.LinkExistingGroups
            if (r0 == 0) goto L_0x0036
            r5 = r10
            com.obwhatsapp.community.LinkExistingGroups r5 = (com.obwhatsapp.community.LinkExistingGroups) r5
            X.0s5 r3 = r5.A06
            X.0sP r4 = r5.A0L
            X.013 r6 = r5.A0S
            X.0ul r8 = r5.A04
            X.0sO r7 = r5.A03
            java.util.List r9 = r5.A0g
            X.2zu r2 = new X.2zu
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x002b:
            r13.A0O = r2
            X.0sq r1 = r13.A05
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r1.Ack(r2, r0)
            return
        L_0x0036:
            X.0s5 r7 = r13.A06
            X.0sG r8 = r13.A0J
            X.0sP r9 = r13.A0L
            X.013 r11 = r13.A0S
            java.util.List r0 = r13.A0g
            X.2zt r2 = new X.2zt
            r6 = r2
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1V8.A3J():void");
    }

    public void A3K() {
        C32241fu r7;
        C16050sL r1;
        C15840rx A062;
        int i2;
        String string;
        int i3;
        Intent intent;
        ArrayList A063;
        String str;
        if (this instanceof NotifyContactsSelector) {
            intent = new Intent();
            intent.putStringArrayListExtra("jids", C16030sJ.A06(A3H()));
        } else {
            if (this instanceof GroupMembersSelector) {
                GroupMembersSelector groupMembersSelector = (GroupMembersSelector) this;
                List A3H = groupMembersSelector.A3H();
                groupMembersSelector.A03 = A3H;
                if (A3H.isEmpty()) {
                    groupMembersSelector.A05.A09(R.string.str0e14, 0);
                    return;
                }
                C16050sL r2 = groupMembersSelector.A02;
                if (r2 == null) {
                    groupMembersSelector.A3f();
                    return;
                }
                String A082 = groupMembersSelector.A0L.A08(groupMembersSelector.A0J.A0A(r2));
                boolean z2 = false;
                if (A082 != null) {
                    z2 = true;
                }
                StringBuilder sb = new StringBuilder("GroupMembersSelector/ CommunityName is null for");
                sb.append(groupMembersSelector.A02);
                AnonymousClass00B.A0B(sb.toString(), z2);
                r7 = new C32241fu(groupMembersSelector);
                r7.A0F(groupMembersSelector, new IDxObserverShape116S0100000_2_I1(groupMembersSelector, 93), R.string.str02ac);
                r7.A06(A082 != null ? groupMembersSelector.getString(R.string.str1701, new Object[]{A082}) : groupMembersSelector.getString(R.string.str1701));
            } else {
                if (this instanceof EditGroupAdminsSelector) {
                    intent = new Intent();
                    A063 = C16030sJ.A06(A3H());
                    str = "jids";
                } else if (this instanceof EditBroadcastRecipientsSelector) {
                    intent = new Intent();
                    A063 = C16030sJ.A06(A3H());
                    str = "contacts";
                } else if (this instanceof ListMembersSelector) {
                    ListMembersSelector listMembersSelector = (ListMembersSelector) this;
                    C15800rs r6 = listMembersSelector.A00;
                    r6.A00.A0C();
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    synchronized (r6.A01) {
                        while (true) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(currentTimeMillis);
                            sb2.append("@broadcast");
                            if (r6.A0C(C34841kx.A03(sb2.toString()))) {
                                currentTimeMillis++;
                            }
                        }
                        while (true) {
                        }
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(currentTimeMillis);
                    sb3.append("@broadcast");
                    C34841kx A032 = C34841kx.A03(sb3.toString());
                    AnonymousClass00B.A06(A032);
                    C17240ul r22 = listMembersSelector.A01;
                    r22.A0T.A0W(r22.A08(A032, listMembersSelector.A3H()));
                    listMembersSelector.A00.A07(listMembersSelector, new C14750ph().A0v(listMembersSelector, listMembersSelector.A0J.A06(A032, "", System.currentTimeMillis())));
                    listMembersSelector.finish();
                    return;
                } else if (this instanceof ContactsAttachmentSelector) {
                    ContactsAttachmentSelector contactsAttachmentSelector = (ContactsAttachmentSelector) this;
                    C64403Pa r4 = contactsAttachmentSelector.A02;
                    List A3H2 = contactsAttachmentSelector.A3H();
                    AnonymousClass027 r23 = r4.A02;
                    r23.A0B(A3H2);
                    r4.A03.A0B(Boolean.TRUE);
                    C23131Ap r12 = r4.A08;
                    AnonymousClass026 r3 = r4.A01;
                    r12.A00(new AnonymousClass3DS(r4), r23, r3);
                    r4.A00.A0D(r3, new IDxObserverShape116S0100000_2_I1(r4, 79));
                    return;
                } else if (this instanceof AddGroupParticipantsSelector) {
                    AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
                    C16050sL r62 = addGroupParticipantsSelector.A07;
                    if (r62 == null) {
                        addGroupParticipantsSelector.A3f();
                        return;
                    }
                    boolean z3 = false;
                    if (addGroupParticipantsSelector.A0A != null) {
                        z3 = true;
                    }
                    StringBuilder sb4 = new StringBuilder("AddGroupParticipantsSelector/ CommunityName is null for ");
                    sb4.append(r62);
                    AnonymousClass00B.A0B(sb4.toString(), z3);
                    int A033 = addGroupParticipantsSelector.A03.A03(addGroupParticipantsSelector.A06);
                    String str2 = addGroupParticipantsSelector.A0A;
                    if (A033 == 3) {
                        if (str2 != null) {
                            i3 = R.string.str032f;
                        } else {
                            i2 = R.string.str0330;
                            string = addGroupParticipantsSelector.getString(i2);
                            r7 = new C32241fu(addGroupParticipantsSelector);
                            r7.A0F(addGroupParticipantsSelector, new IDxObserverShape116S0100000_2_I1(addGroupParticipantsSelector, 75), R.string.str1700);
                            r7.A06(string);
                        }
                    } else if (str2 != null) {
                        i3 = R.string.str1701;
                    } else {
                        i2 = R.string.str1702;
                        string = addGroupParticipantsSelector.getString(i2);
                        r7 = new C32241fu(addGroupParticipantsSelector);
                        r7.A0F(addGroupParticipantsSelector, new IDxObserverShape116S0100000_2_I1(addGroupParticipantsSelector, 75), R.string.str1700);
                        r7.A06(string);
                    }
                    string = addGroupParticipantsSelector.getString(i3, new Object[]{str2});
                    r7 = new C32241fu(addGroupParticipantsSelector);
                    r7.A0F(addGroupParticipantsSelector, new IDxObserverShape116S0100000_2_I1(addGroupParticipantsSelector, 75), R.string.str1700);
                    r7.A06(string);
                } else if (this instanceof LinkExistingGroups) {
                    LinkExistingGroups linkExistingGroups = (LinkExistingGroups) this;
                    C16050sL r24 = linkExistingGroups.A05;
                    String A083 = r24 != null ? linkExistingGroups.A0L.A08(linkExistingGroups.A0J.A0A(r24)) : linkExistingGroups.getIntent().getStringExtra("community_name");
                    if (!linkExistingGroups.A0C.A0E(C16620tM.A02, 2447) || ((r1 = linkExistingGroups.A05) != null && ((A062 = linkExistingGroups.A02.A06(r1)) == null || (!A062.A0g)))) {
                        linkExistingGroups.Afb(ConfirmLinkExistingGroupsDialog.A01(A083), "ConfirmLinkExistingGroupsDialog");
                        return;
                    } else {
                        linkExistingGroups.AP1();
                        return;
                    }
                } else {
                    return;
                }
                intent.putExtra(str, A063);
            }
            r7.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
            r7.A00();
            return;
        }
        setResult(-1, intent);
        finish();
    }

    public final void A3L() {
        AnonymousClass36J r1 = this.A0Q;
        if (r1 != null) {
            r1.A06(true);
            this.A0Q = null;
        }
        AnonymousClass36J r2 = new AnonymousClass36J(this.A0L, this, this.A0R, this.A0X, this.A0Y);
        this.A0Q = r2;
        this.A05.Ack(r2, new Void[0]);
    }

    public final void A3M() {
        AnimatorSet animatorSet = new AnimatorSet();
        this.A02 = animatorSet;
        if (this.A0b) {
            if (this instanceof GroupCallParticipantPicker) {
                A3R((Animator) null, animatorSet);
                this.A02.start();
            }
            A3O();
            return;
        }
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A03.end();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, this.A01});
        ofInt.addUpdateListener(new C91024fF(this));
        ofInt.addListener(new C90964f9(this));
        ofInt.setDuration(240);
        boolean z2 = this instanceof GroupCallParticipantPicker;
        AnimatorSet animatorSet2 = this.A02;
        if (z2) {
            A3R(ofInt, animatorSet2);
        } else {
            animatorSet2.play(ofInt);
        }
        this.A02.start();
    }

    public final void A3N() {
        View findViewById = findViewById(R.id.contacts_empty_permission_denied);
        View findViewById2 = findViewById(R.id.contacts_empty);
        View findViewById3 = findViewById(R.id.search_no_matches);
        View findViewById4 = findViewById(R.id.init_contacts_progress);
        if (!this.A0I.A00()) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
        } else {
            if (A3c()) {
                A3T(findViewById, findViewById2, findViewById3, findViewById4);
            } else if (!TextUtils.isEmpty(this.A0W)) {
                findViewById4.setVisibility(8);
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
                findViewById3.setVisibility(0);
                ((TextView) findViewById3).setText(getString(R.string.str14a8, new Object[]{this.A0W}));
            } else if (A3d()) {
                A3S(findViewById, findViewById2, findViewById3, findViewById4);
            } else {
                findViewById4.setVisibility(8);
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
            }
            int size = this.A0g.size();
            A3Q(size);
            A3P(size);
        }
        findViewById3.setVisibility(8);
        int size2 = this.A0g.size();
        A3Q(size2);
        A3P(size2);
    }

    public final void A3O() {
        ViewGroup viewGroup;
        int i2;
        if (!this.A0b || !this.A0g.isEmpty()) {
            viewGroup = this.A07;
            i2 = 8;
        } else {
            viewGroup = this.A07;
            i2 = 0;
        }
        viewGroup.setVisibility(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r3 == 0) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3P(int r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof com.obwhatsapp.contact.picker.AddGroupParticipantsSelector
            if (r0 == 0) goto L_0x000d
            com.obwhatsapp.components.FloatingActionButton r1 = r2.A0H
            if (r3 != 0) goto L_0x0026
        L_0x0008:
            r0 = 1
            r1.A03(r0)
        L_0x000c:
            return
        L_0x000d:
            java.util.List r0 = r2.A0Y
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0020
            java.util.List r0 = r2.A0g
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0020
            com.obwhatsapp.components.FloatingActionButton r1 = r2.A0H
            goto L_0x0008
        L_0x0020:
            boolean r0 = r2 instanceof com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 != 0) goto L_0x000c
            com.obwhatsapp.components.FloatingActionButton r1 = r2.A0H
        L_0x0026:
            r0 = 1
            r1.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1V8.A3P(int):void");
    }

    public void A3Q(int i2) {
        String A0J2;
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        int A39 = A39();
        boolean z2 = false;
        if (A39 > 0) {
            z2 = true;
        }
        AnonymousClass00B.A0B("Max contacts must be positive", z2);
        AnonymousClass013 r6 = this.A0S;
        if (A39 == Integer.MAX_VALUE) {
            A0J2 = r6.A0J(new Object[]{Integer.valueOf(i2)}, R.plurals.plurals00da, (long) i2);
        } else {
            A0J2 = r6.A0J(new Object[]{Integer.valueOf(i2), Integer.valueOf(A39)}, R.plurals.plurals00de, (long) i2);
        }
        x2.A0I(A0J2);
    }

    public final void A3R(Animator animator, AnimatorSet animatorSet) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06e3);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen06e4);
        int i2 = dimensionPixelSize + this.A00;
        int i3 = -1;
        int i4 = 1;
        if (!this.A0S.A0T()) {
            i4 = -1;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A0D, "translationX", new float[]{(float) (i2 * i4)});
        ofFloat.setDuration(240).setInterpolator(new DecelerateInterpolator());
        ofFloat.setStartDelay(50);
        int i5 = dimensionPixelSize2 + this.A00;
        if (!(!this.A0S.A0T())) {
            i3 = 1;
        }
        int i6 = i5 * i3;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0E, "translationX", new float[]{(float) i6});
        ofFloat2.setDuration(240).setInterpolator(new DecelerateInterpolator());
        AnimatorSet.Builder play = animatorSet.play(ofFloat);
        if (animator == null) {
            play.with(ofFloat2);
        } else {
            play.with(ofFloat2).after(animator);
        }
    }

    public void A3S(View view, View view2, View view3, View view4) {
        view4.setVisibility(8);
        view.setVisibility(8);
        view2.setVisibility(8);
        view3.setVisibility(0);
        ((TextView) view3).setText(getString(A37(), new Object[]{this.A0W}));
    }

    public void A3T(View view, View view2, View view3, View view4) {
        view4.setVisibility(0);
        view.setVisibility(8);
        view2.setVisibility(8);
        view3.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        if (r5.A0g != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3U(X.AnonymousClass39D r4, X.C16010sH r5) {
        /*
            r3 = this;
            X.2Ao r1 = r3.A0M
            if (r1 == 0) goto L_0x0009
            android.widget.ImageView r0 = r4.A01
            r1.A06(r0, r5)
        L_0x0009:
            X.1cU r1 = r4.A03
            java.util.ArrayList r0 = r3.A0X
            r1.A0D(r5, r0)
            android.view.View r2 = r4.A00
            r1 = 1
            com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0 r0 = new com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0
            r0.<init>(r3, r5, r4, r1)
            r2.setOnClickListener(r0)
            int r1 = r3.A39()
            java.util.List r0 = r3.A0g
            int r0 = r0.size()
            if (r1 != r0) goto L_0x002e
            boolean r1 = r5.A0g
            r0 = 1052938076(0x3ec28f5c, float:0.38)
            if (r1 == 0) goto L_0x0030
        L_0x002e:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0030:
            r2.setAlpha(r0)
            com.obwhatsapp.components.SelectionCheckView r0 = r4.A04
            r0.setTag(r5)
            r3.A3V(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1V8.A3U(X.39D, X.0sH):void");
    }

    public void A3V(AnonymousClass39D r4, C16010sH r5) {
        if (!A3e(r5) || r5.A0g) {
            if (r5.A0T == null || (this instanceof GroupCallParticipantPicker)) {
                r4.A02.setVisibility(8);
            } else {
                TextEmojiLabel textEmojiLabel = r4.A02;
                textEmojiLabel.setVisibility(0);
                textEmojiLabel.A0I((List) null, r5.A0T);
                String str = r5.A0T;
                if (str == null) {
                    str = "";
                }
                textEmojiLabel.A0I((List) null, str);
            }
            r4.A01(r5.A0g);
            return;
        }
        r4.A00(getString(R.string.str178d), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r7 >= 0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A3W(X.C16010sH r10) {
        /*
            r9 = this;
            android.widget.ListView r0 = r9.A08
            android.view.View r6 = r0.findViewWithTag(r10)
            com.obwhatsapp.components.SelectionCheckView r6 = (com.obwhatsapp.components.SelectionCheckView) r6
            boolean r0 = r9.A3e(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r10.A0g
            if (r0 != 0) goto L_0x0014
            r6 = r5
        L_0x0014:
            boolean r0 = r10.A0g
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x01a5
            r10.A0g = r4
            java.util.List r2 = r9.A0g
            int r7 = r2.indexOf(r10)
            if (r7 >= 0) goto L_0x003d
            r7 = 0
        L_0x0025:
            int r0 = r2.size()
            if (r7 >= r0) goto L_0x0058
            X.0rv r1 = r10.A0E
            java.lang.Object r0 = r2.get(r7)
            X.0sH r0 = (X.C16010sH) r0
            X.0rv r0 = r0.A0E
            boolean r0 = X.C34901l3.A00(r1, r0)
            if (r0 == 0) goto L_0x01a1
            if (r7 < 0) goto L_0x0058
        L_0x003d:
            int r8 = r9.A39()
            int r1 = r2.size()
            r0 = 0
            if (r8 != r1) goto L_0x0049
            r0 = 1
        L_0x0049:
            r2.remove(r7)
            if (r0 == 0) goto L_0x0053
            X.3Nk r0 = r9.A0P
            r0.notifyDataSetChanged()
        L_0x0053:
            X.28C r0 = r9.A0e
            r0.A04(r7)
        L_0x0058:
            r9.A3I()
            if (r6 == 0) goto L_0x0062
            boolean r0 = r10.A0g
            r6.A04(r0, r3)
        L_0x0062:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0155
            r0 = 2131364661(0x7f0a0b35, float:1.8349165E38)
            android.view.View r1 = r9.findViewById(r0)
            if (r1 == 0) goto L_0x0076
            r0 = 64
            r1.performAccessibilityAction(r0, r5)
        L_0x0076:
            boolean r0 = r9.A0b
            if (r0 != 0) goto L_0x013c
            android.animation.AnimatorSet r0 = r9.A02
            if (r0 == 0) goto L_0x0089
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0089
            android.animation.AnimatorSet r0 = r9.A02
            r0.end()
        L_0x0089:
            r0 = 2
            int[] r1 = new int[r0]
            int r0 = r9.A01
            r1[r4] = r0
            r7 = 1
            r1[r3] = r4
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            r9.A03 = r1
            X.4fF r0 = new X.4fF
            r0.<init>(r9)
            r1.addUpdateListener(r0)
            android.animation.ValueAnimator r1 = r9.A03
            X.4f9 r0 = new X.4f9
            r0.<init>(r9)
            r1.addListener(r0)
            android.animation.ValueAnimator r3 = r9.A03
            r0 = 240(0xf0, double:1.186E-321)
            r3.setDuration(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131166947(0x7f0706e3, float:1.7948154E38)
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131166948(0x7f0706e4, float:1.7948156E38)
            int r6 = r1.getDimensionPixelSize(r0)
            boolean r0 = r9 instanceof com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x0101
            int r5 = r9.A00
            int r5 = r5 + r3
            X.013 r0 = r9.A0S
            boolean r0 = r0.A0T()
            r1 = r0 ^ 1
            r0 = -1
            if (r1 == 0) goto L_0x00db
            r0 = 1
        L_0x00db:
            int r5 = r5 * r0
            com.obwhatsapp.WaImageButton r3 = r9.A0D
            float r1 = r3.getTranslationX()
            float r0 = (float) r5
            float r1 = r1 + r0
            r3.setTranslationX(r1)
            int r5 = r9.A00
            int r5 = r5 + r6
            X.013 r0 = r9.A0S
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00f5
            r7 = -1
        L_0x00f5:
            int r5 = r5 * r7
            com.obwhatsapp.WaImageButton r3 = r9.A0E
            float r1 = r3.getTranslationX()
            float r0 = (float) r5
            float r1 = r1 + r0
            r3.setTranslationX(r1)
        L_0x0101:
            android.animation.ValueAnimator r0 = r9.A03
            r0.start()
        L_0x0106:
            int r0 = r2.size()
            r9.A3Q(r0)
            r9.A3P(r0)
            java.util.List r0 = r9.A0Y
            java.util.Iterator r3 = r0.iterator()
        L_0x0116:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0134
            java.lang.Object r2 = r3.next()
            X.0sH r2 = (X.C16010sH) r2
            if (r2 == r10) goto L_0x0116
            X.0rv r1 = r10.A0E
            X.0rv r0 = r2.A0E
            boolean r0 = X.C34901l3.A00(r1, r0)
            if (r0 == 0) goto L_0x0116
            boolean r0 = r10.A0g
            r2.A0g = r0
            r4 = 1
            goto L_0x0116
        L_0x0134:
            if (r4 == 0) goto L_0x01d0
            X.3Nk r0 = r9.A0P
            r0.notifyDataSetChanged()
            return
        L_0x013c:
            android.view.View r1 = r9.A05
            r0 = 4
            r1.setVisibility(r0)
            r9.A3O()
            android.widget.ListView r0 = r9.A08
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.topMargin = r4
            android.widget.ListView r0 = r9.A08
            r0.setLayoutParams(r1)
            goto L_0x0106
        L_0x0155:
            android.view.View r0 = r9.A05
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0167
            android.animation.ValueAnimator r0 = r9.A03
            if (r0 == 0) goto L_0x0191
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0191
        L_0x0167:
            android.view.ViewGroup r0 = r9.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x018c
            android.view.ViewGroup r1 = r9.A07
            r0 = 8
            r1.setVisibility(r0)
            int r3 = r9.A01
            android.widget.ListView r0 = r9.A08
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            r1.topMargin = r3
            android.widget.ListView r0 = r9.A08
            r0.setLayoutParams(r1)
            android.view.View r0 = r9.A05
            r0.setVisibility(r4)
        L_0x018c:
            r9.A3M()
            goto L_0x0106
        L_0x0191:
            boolean r0 = r10.A0g
            if (r0 == 0) goto L_0x0106
            androidx.recyclerview.widget.RecyclerView r1 = r9.A09
            int r0 = r2.size()
            int r0 = r0 - r3
            r1.A0Z(r0)
            goto L_0x0106
        L_0x01a1:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x01a5:
            int r1 = r9.A39()
            java.util.List r2 = r9.A0g
            int r0 = r2.size()
            if (r0 != r1) goto L_0x01f9
            boolean r0 = r9 instanceof com.obwhatsapp.calling.callhistory.group.GroupCallParticipantPicker
            if (r0 == 0) goto L_0x01d1
            int r0 = r9.A39()
            X.0pt r7 = r9.A05
            X.013 r6 = r9.A0S
            r5 = 2131755193(0x7f1000b9, float:1.9141258E38)
            long r1 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = r6.A0J(r3, r5, r1)
            r7.A0H(r0, r4)
        L_0x01d0:
            return
        L_0x01d1:
            android.widget.ListView r0 = r9.A08
            android.view.View r7 = r0.findViewWithTag(r10)
            com.obwhatsapp.components.SelectionCheckView r7 = (com.obwhatsapp.components.SelectionCheckView) r7
            int r0 = r9.A39()
            X.013 r6 = r9.A0S
            int r5 = r9.A38()
            long r1 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = r6.A0J(r3, r5, r1)
            r9.Afh(r0)
            if (r7 == 0) goto L_0x01d0
            r7.A04(r4, r4)
            return
        L_0x01f9:
            r0 = 2131365943(0x7f0a1037, float:1.8351766E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 2131365991(0x7f0a1067, float:1.8351863E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0210
            java.lang.String r0 = ""
            r1.setText(r0)
        L_0x0210:
            r10.A0g = r3
            boolean r0 = r2.add(r10)
            if (r0 == 0) goto L_0x0058
            X.28C r1 = r9.A0e
            int r0 = r2.size()
            int r0 = r0 - r3
            r1.A03(r0)
            int r1 = r9.A39()
            int r0 = r2.size()
            if (r1 != r0) goto L_0x0058
            X.3Nk r0 = r9.A0P
            r0.notifyDataSetChanged()
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1V8.A3W(X.0sH):void");
    }

    public void A3X(C16010sH r7) {
        int i2;
        int i3;
        if (this instanceof GroupMembersSelector) {
            i2 = R.string.str1874;
        } else if ((this instanceof EditBroadcastRecipientsSelector) || (this instanceof ListMembersSelector)) {
            i2 = R.string.str1873;
        } else {
            if (this instanceof AddGroupParticipantsSelector) {
                i3 = R.string.str1874;
            } else if (this instanceof GroupCallParticipantPicker) {
                i3 = R.string.str1875;
            } else {
                return;
            }
            String string = getString(i3, new Object[]{this.A0L.A08(r7)});
            AnonymousClass01Y r2 = this.A0F;
            Jid A082 = r7.A08(UserJid.class);
            AnonymousClass00B.A06(A082);
            UnblockDialogFragment.A01(new IDxUnblockerShape35S0300000_2_I1(this, A082, r2, 0), string, R.string.str0242, false).A1G(AGM(), (String) null);
            return;
        }
        String string2 = getString(i2, new Object[]{this.A0L.A08(r7)});
        AnonymousClass01Y r22 = this.A0F;
        Jid A083 = r7.A08(UserJid.class);
        AnonymousClass00B.A06(A083);
        Afc(UnblockDialogFragment.A01(new IDxUnblockerShape35S0300000_2_I1(this, A083, r22, 0), string2, R.string.str0242, false));
    }

    public void A3Y(String str) {
        this.A0W = str;
        ArrayList A022 = C40661uU.A02(this.A0S, str);
        this.A0X = A022;
        if (A022.isEmpty()) {
            this.A0X = null;
        }
        A3L();
    }

    public void A3Z(ArrayList arrayList) {
        this.A0J.A0U(arrayList);
    }

    public void A3a(List list) {
        this.A0Q = null;
        ArrayList arrayList = this.A0f;
        arrayList.clear();
        arrayList.addAll(list);
        C64253Nk r0 = this.A0P;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
        A3N();
    }

    public void A3b(List list) {
        this.A0O = null;
        this.A0Y = list;
        A3L();
        int i2 = 0;
        if (this.A0a) {
            HashSet hashSet = new HashSet();
            List list2 = this.A0Z;
            if (list2 != null && !list2.isEmpty()) {
                for (C16010sH r5 : this.A0Y) {
                    Class<C15830rv> cls = C15830rv.class;
                    if (this.A0Z.contains(r5.A08(cls))) {
                        r5.A0g = true;
                        if (!hashSet.contains(r5.A08(cls))) {
                            List list3 = this.A0g;
                            list3.add(r5);
                            hashSet.add(r5.A08(cls));
                            if (list3.size() >= A39()) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                this.A0e.A01();
            }
            this.A0a = false;
        }
        List list4 = this.A0g;
        int size = list4.size();
        A3Q(size);
        A3P(size);
        View view = this.A05;
        if (list4.isEmpty()) {
            i2 = 4;
        }
        view.setVisibility(i2);
        if (!list4.isEmpty()) {
            int i3 = this.A01;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A08.getLayoutParams();
            layoutParams.topMargin = i3;
            this.A08.setLayoutParams(layoutParams);
            A3M();
        }
        MenuItem menuItem = this.A04;
        if (menuItem != null) {
            menuItem.setVisible(true ^ this.A0Y.isEmpty());
        }
    }

    public boolean A3c() {
        return this.A0O != null;
    }

    public boolean A3d() {
        return false;
    }

    public final boolean A3e(C16010sH r4) {
        Class<UserJid> cls = UserJid.class;
        return r4.A08(cls) != null && this.A0F.A0V((UserJid) r4.A08(cls));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void onBackPressed() {
        if (this.A0A.A06()) {
            this.A0A.A05(true);
        } else {
            finish();
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C16010sH r3 = (C16010sH) ADA().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() == 0) {
            Class<UserJid> cls = UserJid.class;
            if (r3.A08(cls) != null) {
                AnonymousClass01Y r1 = this.A0F;
                Jid A082 = r3.A08(cls);
                AnonymousClass00B.A06(A082);
                r1.A0K(this, (UserJid) A082);
                return true;
            }
            AnonymousClass00B.A08("only user jid should be unblocked");
        }
        return super.onContextItemSelected(menuItem);
    }

    public void onCreate(Bundle bundle) {
        ListView listView;
        int dimensionPixelSize;
        Resources resources;
        int i2;
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(this instanceof GroupCallParticipantPickerSheet ? R.layout.layout02cb : R.layout.layout03f2, (ViewGroup) null));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        Aem(toolbar);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        x2.A0O(true);
        x2.A0B(A36());
        this.A0M = this.A0N.A04(this, "multiple-contact-picker");
        this.A0A = new AnonymousClass267(this, findViewById(R.id.search_holder), new IDxTListenerShape170S0100000_2_I0(this, 6), toolbar, this.A0S);
        ListView ADA = ADA();
        this.A08 = ADA;
        boolean z2 = this instanceof GroupCallParticipantPicker;
        ADA.setFastScrollAlwaysVisible(!z2);
        this.A08.setScrollBarStyle(33554432);
        if (A3D() != null) {
            this.A08.addHeaderView(A3D(), (Object) null, false);
        }
        List list = this.A0g;
        list.clear();
        if (bundle != null) {
            List<C15830rv> A082 = C16030sJ.A08(C15830rv.class, bundle.getStringArrayList("selected_jids"));
            if (!A082.isEmpty()) {
                for (C15830rv A083 : A082) {
                    C16010sH A084 = this.A0J.A08(A083);
                    if (A084 != null) {
                        A084.A0g = true;
                        list.add(A084);
                    }
                }
            }
        } else {
            this.A0Z = C16030sJ.A08(C15830rv.class, getIntent().getStringArrayListExtra("selected"));
        }
        A3J();
        this.A06 = findViewById(R.id.selected_items_divider);
        this.A09 = (RecyclerView) findViewById(R.id.selected_items);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen06df);
        this.A09.setPadding(z2 ? getResources().getDimensionPixelSize(R.dimen.dimen06e1) : 0, this.A09.getPaddingTop(), this.A09.getPaddingRight(), this.A09.getPaddingBottom());
        boolean z3 = z2;
        if (z3) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A09.getLayoutParams();
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen06d8);
            if (!this.A0S.A0T()) {
                layoutParams.rightMargin = dimensionPixelSize2;
            } else {
                layoutParams.leftMargin = dimensionPixelSize2;
            }
            this.A09.setLayoutParams(layoutParams);
        }
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.dimen06e2);
        this.A09.A0m(new IDxIDecorationShape4S0101000_2_I0(this, dimensionPixelSize3, 0));
        SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(0);
        smoothScrollLinearLayoutManager.A1P(0);
        this.A09.setLayoutManager(smoothScrollLinearLayoutManager);
        this.A09.setAdapter(this.A0e);
        this.A09.setItemAnimator(new C57782rn());
        this.A08.setOnScrollListener(new C94614lC(this));
        this.A08.setFastScrollEnabled(true);
        this.A08.setScrollbarFadingEnabled(true);
        boolean A0T2 = this.A0S.A0T();
        ListView listView2 = this.A08;
        if (A0T2) {
            listView2.setVerticalScrollbarPosition(1);
            listView = this.A08;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen01fd);
            resources = getResources();
            i2 = R.dimen.dimen01fc;
        } else {
            listView2.setVerticalScrollbarPosition(2);
            listView = this.A08;
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen01fc);
            resources = getResources();
            i2 = R.dimen.dimen01fd;
        }
        listView.setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i2), 0);
        this.A08.setOnItemClickListener(new IDxCListenerShape194S0100000_2_I0(this, 3));
        this.A01 = getResources().getDimensionPixelSize(z2 ? R.dimen.dimen06dd : R.dimen.dimen06dc);
        View findViewById = findViewById(R.id.selected_list);
        this.A05 = findViewById;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams2.height = this.A01;
        this.A05.setLayoutParams(layoutParams2);
        this.A05.setVisibility(4);
        this.A0D = (WaImageButton) findViewById(R.id.selected_list_action_fab_1);
        this.A0E = (WaImageButton) findViewById(R.id.selected_list_action_fab_2);
        WaImageButton waImageButton = this.A0D;
        if (!z3) {
            waImageButton.setVisibility(8);
            this.A0E.setVisibility(8);
        } else {
            waImageButton.setVisibility(0);
            this.A0E.setVisibility(0);
            this.A0D.setImageDrawable(z2 ? AnonymousClass2SR.A02(this, R.drawable.ic_groupcall_voice, R.color.color07f1) : null);
            this.A0E.setImageDrawable(z2 ? AnonymousClass2SR.A02(this, R.drawable.ic_groupcall_video, R.color.color07f1) : null);
            this.A0D.setContentDescription(getString(z2 ? R.string.str011d : 0));
            this.A0E.setContentDescription(getString(z2 ? R.string.str19b6 : 0));
            this.A0D.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 26));
            this.A0E.setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 25));
            int i3 = dimensionPixelSize3;
            C45902Bo.A09(this.A0D, this.A0S, 0, dimensionPixelSize3, -this.A00, i3);
            C45902Bo.A09(this.A0E, this.A0S, 0, dimensionPixelSize3, -this.A00, i3);
            this.A09.postDelayed(new RunnableRunnableShape7S0100000_I0_6(this, 1), 200);
        }
        this.A07 = (ViewGroup) findViewById(R.id.warning);
        View A3E = A3E();
        if (A3E != null) {
            this.A0b = true;
            this.A07.removeAllViews();
            this.A07.addView(A3E);
        } else {
            String A3G = A3G();
            this.A0b = !TextUtils.isEmpty(A3G);
            ((TextView) findViewById(R.id.warning_text)).setText(A3G);
        }
        A3O();
        C64253Nk r0 = new C64253Nk(this, this, this.A0f);
        this.A0P = r0;
        A35(r0);
        FloatingActionButton floatingActionButton = (FloatingActionButton) AnonymousClass00T.A05(this, R.id.next_btn);
        this.A0H = floatingActionButton;
        if (!z2) {
            floatingActionButton.setImageDrawable(A3C());
            this.A0H.setContentDescription(getString(A3B()));
            this.A0H.setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 11));
        }
        ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 24));
        findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape1S0100000_I0_1(this, 12));
        registerForContextMenu(this.A08);
        A3N();
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C16010sH r1 = (C16010sH) ADA().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        if (A3e(r1)) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            contextMenu.add(0, 0, 0, getString(R.string.str0236, new Object[]{this.A0L.A08(r1)}));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, R.string.str1d7c).setIcon(R.drawable.ic_action_search);
        this.A04 = icon;
        icon.setShowAsAction(2);
        this.A04.setVisible(!this.A0Y.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0Y.clear();
        this.A0f.clear();
        AnonymousClass2Ao r0 = this.A0M;
        if (r0 != null) {
            r0.A00();
            this.A0M = null;
        }
        C607435q r02 = this.A0O;
        if (r02 != null) {
            r02.A06(true);
            this.A0O = null;
        }
        AnonymousClass36J r03 = this.A0Q;
        if (r03 != null) {
            r03.A06(true);
            this.A0Q = null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        super.onPause();
        this.A0K.A03(this.A0d);
        this.A0G.A03(this.A0c);
        this.A0T.A03(this.A0V.get());
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0A.A03(bundle);
    }

    public void onResume() {
        super.onResume();
        this.A0K.A02(this.A0d);
        this.A0G.A02(this.A0c);
        this.A0T.A02(this.A0V.get());
        this.A0P.notifyDataSetChanged();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        List<C16010sH> list = this.A0g;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C16010sH A082 : list) {
                arrayList.add(A082.A08(C15830rv.class));
            }
            bundle.putStringArrayList("selected_jids", C16030sJ.A06(arrayList));
        }
        this.A0A.A04(bundle);
    }

    public boolean onSearchRequested() {
        this.A0A.A02();
        return false;
    }
}
