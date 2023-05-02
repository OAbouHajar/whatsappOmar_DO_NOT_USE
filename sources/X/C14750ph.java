package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0ph  reason: invalid class name and case insensitive filesystem */
public class C14750ph {
    public static Intent A00(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.registration.ChangeNumberOverview");
        return intent;
    }

    public static Intent A01(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.registration.EULA");
        intent.setFlags(268468224);
        return intent;
    }

    public static Intent A02(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.HomeActivity");
        return intent;
    }

    public static Intent A03(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.HomeActivity").setAction("com.obwhatsapp.intent.action.CHATS");
    }

    public static Intent A04(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.Main");
        return intent;
    }

    public static Intent A05(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.registration.RegisterName");
        return intent;
    }

    public static Intent A06(Context context) {
        return new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.registration.RegisterPhone");
    }

    public static Intent A07(Context context) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.registration.RegisterPhone");
        className.putExtra("com.obwhatsapp.registration.RegisterPhone.resetstate", true);
        className.putExtra("com.obwhatsapp.registration.RegisterPhone.clear_phone_number", true);
        return className;
    }

    public static Intent A08(Context context, int i2) {
        return new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.Conversation").putExtra("mat_entry_point", i2);
    }

    public static Intent A09(Context context, int i2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.backup.encryptedbackup.EncBackupMainActivity");
        intent.putExtra("user_action", i2);
        return intent;
    }

    public static Intent A0A(Context context, int i2, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.registration.VerifyPhoneNumber");
        className.putExtra("changenumber", z2);
        className.putExtra("sms_retry_time", j2);
        className.putExtra("voice_retry_time", j3);
        className.putExtra("wa_old_retry_time", j4);
        className.putExtra("use_sms_retriever", z3);
        className.putExtra("wa_old_eligible", z4);
        className.putExtra("code_verification_mode", i2);
        return className;
    }

    public static Intent A0B(Context context, int i2, boolean z2, boolean z3, boolean z4) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.registration.VerifyPhoneNumber");
        className.putExtra("changenumber", z2);
        className.putExtra("use_sms_retriever", z3);
        className.putExtra("wa_old_eligible", z4);
        className.putExtra("code_verification_mode", i2);
        return className;
    }

    public static Intent A0C(Context context, long j2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity");
        intent.putExtra("allowSkipKey", false);
        intent.putExtra("spaceNeededInBytes", j2);
        return intent;
    }

    public static Intent A0D(Context context, long j2, long j3, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.registration.PrimaryFlashCallEducationScreen");
        intent.putExtra("sms_retry_time", j2);
        intent.putExtra("voice_retry_time", j3);
        intent.putExtra("change_number", z2);
        return intent;
    }

    public static Intent A0E(Context context, long j2, long j3, boolean z2, boolean z3) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity");
        className.putExtra("change_number", z2);
        className.putExtra("sms_retry_time", j2);
        className.putExtra("voice_retry_time", j3);
        className.putExtra("use_sms_retriever", z3);
        return className;
    }

    public static Intent A0F(Context context, Bundle bundle, C15830rv r6, C16050sL r7, ArrayList arrayList, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.viewsharedcontacts.ViewSharedContactArrayActivity");
        className.putExtra("edit_mode", true);
        className.putExtra("jid", C16030sJ.A03(r6));
        className.putExtra("quoted_message", bundle);
        className.putExtra("quoted_group_jid", C16030sJ.A03(r7));
        className.putExtra("has_number_from_url", z2);
        className.putStringArrayListExtra("vcard_array", arrayList);
        return className;
    }

    public static Intent A0G(Context context, C15830rv r4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.gallery.MediaGalleryActivity");
        intent.putExtra("jid", C16030sJ.A03(r4));
        return intent;
    }

    public static Intent A0H(Context context, C15830rv r4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.shareinvitelink.ShareInviteLinkActivity");
        intent.putExtra("jid", r4.getRawString());
        return intent;
    }

    public static Intent A0I(Context context, C15830rv r6, int i2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.gallery.MediaGalleryActivity");
        intent.putExtra("pos", -1);
        intent.putExtra("jid", C16030sJ.A03(r6));
        intent.putExtra("alert", true);
        intent.putExtra("key", i2);
        return intent;
    }

    public static Intent A0J(Context context, C15830rv r4, int i2, int i3) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.ephemeral.ChangeEphemeralSettingActivity");
        className.putExtra("jid", r4.getRawString());
        className.putExtra("current_setting", i2);
        className.putExtra("entry_point", i3);
        return className;
    }

    public static Intent A0K(Context context, C15830rv r4, Boolean bool) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.status.playback.StatusPlaybackActivity");
        intent.putExtra("jid", C16030sJ.A03(r4));
        intent.putExtra("single_contact_update", bool);
        return intent;
    }

    public static Intent A0L(Context context, C15830rv r4, String str, int i2, int i3, long j2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.storage.StorageUsageGalleryActivity");
        className.putExtra("gallery_type", i2);
        className.putExtra("jid", C16030sJ.A03(r4));
        className.putExtra("memory_size", j2);
        className.putExtra("session_id", str);
        className.putExtra("entry_point", i3);
        return className;
    }

    public static Intent A0M(Context context, GroupJid groupJid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.community.CommunityHomeActivity");
        intent.putExtra("parent_group_jid", groupJid.getRawString());
        StringBuilder sb = new StringBuilder("whatsapp://community/");
        sb.append(groupJid.hashCode());
        intent.setData(Uri.parse(sb.toString()));
        intent.setFlags(603979776);
        return intent;
    }

    public static Intent A0N(Context context, GroupJid groupJid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.group.GroupSettingsActivity");
        intent.putExtra("gid", groupJid.getRawString());
        return intent;
    }

    public static Intent A0O(Context context, GroupJid groupJid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.community.ManageGroupsInCommunityActivity");
        intent.putExtra("parent_group_jid", groupJid.getRawString());
        return intent;
    }

    public static Intent A0P(Context context, GroupJid groupJid, Long l2, ArrayList arrayList, ArrayList arrayList2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.invites.InviteGroupParticipantsActivity");
        intent.putExtra("jids", arrayList);
        intent.putExtra("invite_hashes", arrayList2);
        intent.putExtra("invite_expiration", l2);
        intent.putExtra("group_jid", groupJid.getRawString());
        return intent;
    }

    public static Intent A0Q(Context context, Jid jid) {
        return A08(context, 0).putExtra("jid", C16030sJ.A03(jid));
    }

    public static Intent A0R(Context context, Jid jid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.chatinfo.ListChatInfoActivity");
        intent.putExtra("gid", C16030sJ.A03(jid));
        intent.putExtra("circular_transition", true);
        return intent;
    }

    public static Intent A0S(Context context, Jid jid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity");
        intent.putExtra("jid", C16030sJ.A03(jid));
        return intent;
    }

    public static Intent A0T(Context context, Jid jid, Integer num, int i2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity");
        intent.putExtra("cache_jid", jid.getRawString());
        intent.putExtra("source", num);
        intent.putExtra("entry_point", i2);
        return intent;
    }

    public static Intent A0U(Context context, Jid jid, String str, float f2, int i2, int i3, int i4, int i5, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.profile.ViewProfilePhoto");
        intent.putExtra("jid", jid.getRawString());
        intent.putExtra("circular_transition", z2);
        if (str != null) {
            intent.putExtra("circular_return_name", str);
        }
        intent.putExtra("start_transition_alpha", f2);
        intent.putExtra("start_transition_status_bar_color", i2);
        intent.putExtra("return_transition_status_bar_color", i3);
        intent.putExtra("start_transition_navigation_bar_color", i4);
        intent.putExtra("return_transition_navigation_bar_color", i5);
        return intent;
    }

    public static Intent A0V(Context context, Jid jid, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.group.GroupAdminPickerActivity");
        intent.putExtra("gid", C16030sJ.A03(jid));
        intent.putExtra("subgroup_subject", str);
        intent.putExtra("subgroup_request_message", str3);
        intent.putExtra("parent_group_jid", str2);
        return intent;
    }

    public static Intent A0W(Context context, Jid jid, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.group.GroupChatInfoActivity");
        intent.putExtra("gid", C16030sJ.A03(jid));
        intent.putExtra("circular_transition", z2);
        intent.putExtra("show_description", z3);
        intent.putExtra("show_chat_action", z4);
        return intent;
    }

    public static Intent A0X(Context context, UserJid userJid) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.identity.IdentityVerificationActivity");
        intent.putExtra("jid", userJid.getRawString());
        return intent;
    }

    public static Intent A0Y(Context context, UserJid userJid, Integer num, Integer num2, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.businesscollection.view.activity.CollectionProductListActivity");
        intent.putExtra("collection_id", str);
        intent.putExtra("collection_name", str2);
        intent.putExtra("cache_jid", userJid.getRawString());
        intent.putExtra("collection_index", str3);
        if (num != null) {
            intent.putExtra("category_browsing_entry_point", num);
        }
        if (num2 != null) {
            intent.putExtra("category_level", num2);
        }
        return intent;
    }

    public static Intent A0Z(Context context, UserJid userJid, Integer num, boolean z2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.chatinfo.ContactInfoActivity");
        className.putExtra("jid", userJid.getRawString());
        className.putExtra("circular_transition", true);
        className.putExtra("should_show_chat_action", z2);
        className.putExtra("profile_entry_point", num);
        return className;
    }

    public static Intent A0a(Context context, UserJid userJid, String str, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.blockbusiness.BlockBusinessActivity");
        intent.putExtra("jid_extra", userJid.getRawString());
        intent.putExtra("entry_point_extra", str);
        intent.putExtra("show_success_toast_extra", z2);
        intent.putExtra("from_spam_panel_extra", z3);
        intent.putExtra("show_report_upsell", z4);
        return intent;
    }

    public static Intent A0b(Context context, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.whatsapp.voipcalling.VoipActivityV2");
        if (list != null) {
            className.putStringArrayListExtra("jid", C16030sJ.A06(list));
        }
        if (bool != null) {
            className.putExtra("isTaskRoot", bool);
        }
        if (bool4 != null) {
            className.putExtra("newCall", bool4);
        }
        if (bool2 != null) {
            className.putExtra("video_call", bool2);
        }
        if (bool3 != null || AnonymousClass22N.A00(context) == null) {
            className.setFlags(268435456);
        }
        return className;
    }

    public static Intent A0c(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.contact.picker.ContactPicker");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
        return intent;
    }

    public static Intent A0d(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.backup.google.GoogleBackupService");
        if (!TextUtils.isEmpty(str)) {
            intent.setAction(str);
        }
        return intent;
    }

    public static Intent A0e(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.identity.IdentityVerificationActivity");
        intent.putExtra("jid", str);
        return intent;
    }

    public static Intent A0f(Context context, String str, int i2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.camera.CameraActivity");
        intent.putExtra("jid", str);
        intent.putExtra("camera_origin", i2);
        return intent;
    }

    public static Intent A0g(Context context, String str, int i2) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.storage.StorageUsageActivity");
        className.putExtra("session_id", str);
        className.putExtra("entry_point", i2);
        return className;
    }

    public static Intent A0h(Context context, String str, int i2, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Intent className = new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.registration.VerifyPhoneNumber");
        className.putExtra("sms_retry_time", j2);
        className.putExtra("voice_retry_time", j3);
        className.putExtra("wa_old_retry_time", j4);
        className.putExtra("use_sms_retriever", z2);
        className.putExtra("show_request_sms_code_progress", z3);
        className.putExtra("changenumber", z4);
        className.putExtra("should_request_flash_call", z5);
        className.putExtra("server_start_message", str);
        className.putExtra("flash_type", i2);
        className.putExtra("wa_old_eligible", z6);
        className.putExtra("code_verification_mode", 0);
        return className;
    }

    public static Intent A0i(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity");
        intent.putExtra("sticker_pack_id", str);
        intent.putExtra("sticker_pack_preview_source", str2);
        return intent;
    }

    public static Intent A0j(Context context, String str, String str2, String str3, List list, int i2, int i3, boolean z2, boolean z3) {
        return new Intent().setClassName(context.getPackageName(), "com.obwhatsapp.gifvideopreview.GifVideoPreviewActivity").putExtra("preview_media_url", str).putExtra("media_url", str2).putExtra("static_preview_url", str3).putExtra("jids", C16030sJ.A06(list)).putExtra("send", z3).putExtra("provider", i2).putExtra("number_from_url", z2).putExtra("origin", i3);
    }

    public static Intent A0k(Context context, String str, String str2, boolean z2, boolean z3) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.WaInAppBrowsingActivity");
        AnonymousClass00B.A06(str);
        intent.putExtra("webview_url", str);
        intent.putExtra("webview_javascript_enabled", true);
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("webview_callback", str2);
        }
        intent.putExtra("webview_hide_url", z2);
        intent.putExtra("webview_javascript_enabled", z3);
        return intent;
    }

    public static Intent A0l(Context context, String str, int... iArr) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.twofactor.TwoFactorAuthActivity");
        intent.putExtra("primaryCTA", str);
        intent.putExtra("workflows", iArr);
        return intent;
    }

    public static Intent A0m(Context context, Collection collection, int i2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.group.GroupMembersSelector");
        intent.putExtra("entry_point", i2);
        if (collection != null && !collection.isEmpty()) {
            intent.putExtra("selected", new ArrayList(collection));
        }
        return intent;
    }

    public static Intent A0n(Context context, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.registration.EULA");
        intent.putExtra("show_registration_first_dlg", z2);
        return intent;
    }

    public static Intent A0o(Context context, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.biz.product.view.activity.ProductDetailActivity");
        intent.putExtra("is_from_product_detail_screen", z2);
        return intent;
    }

    public static Intent A0p(Context context, boolean z2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.registration.VerifyTwoFactorAuth");
        intent.putExtra("changenumber", z2);
        return intent;
    }

    public static C14750ph A0q() {
        return new C14750ph();
    }

    public static final void A0r(Context context, Intent intent, int i2) {
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.dmsetting.ChangeDMSettingActivity");
        intent.putExtra("entry_point", i2);
    }

    public Intent A0s(Context context, int i2, boolean z2) {
        Intent intent = new Intent();
        if (z2) {
            intent.setClassName(context.getPackageName(), "com.obwhatsapp.dmsetting.DisappearingMessagesSettingActivity");
            intent.putExtra("entry_point", i2);
            return intent;
        }
        A0r(context, intent, i2);
        return intent;
    }

    public Intent A0t(Context context, Bundle bundle, Parcelable parcelable, String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.inappsupport.ui.ContactUsActivity");
        intent.putExtra("com.obwhatsapp.inappsupport.ui.ContactUsActivity.from", str);
        intent.putExtra("com.obwhatsapp.inappsupport.ui.ContactUsActivity.serverStatus", str2);
        if (bundle != null) {
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("com.obwhatsapp.support.DescribeProblemActivity.from");
            String string2 = bundle.getString("com.obwhatsapp.support.DescribeProblemActivity.serverstatus");
            String string3 = bundle.getString("com.obwhatsapp.support.DescribeProblemActivity.emailAddress");
            String string4 = bundle.getString("com.obwhatsapp.support.DescribeProblemActivity.description");
            Parcelable parcelable2 = bundle.getParcelable("com.obwhatsapp.support.DescribeProblemActivity.suspendedEntityJid");
            if (!TextUtils.isEmpty(string)) {
                bundle2.putString("com.obwhatsapp.inappsupport.ui.ContactUsActivity.from", string);
            }
            if (!TextUtils.isEmpty(string2)) {
                bundle2.putString("com.obwhatsapp.inappsupport.ui.ContactUsActivity.serverStatus", string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("com.obwhatsapp.inappsupport.ui.ContactUsActivity.emailAddress", string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("com.obwhatsapp.inappsupport.ui.ContactUsActivity.description", string4);
            }
            if (parcelable2 != null) {
                bundle2.putParcelable("com.obwhatsapp.inappsupport.ui.ContactUsActivity.suspendedEntityJid", parcelable2);
            }
            intent.putExtras(bundle2);
        }
        if (parcelable != null) {
            intent.putExtra("com.obwhatsapp.inappsupport.ui.ContactUsActivity.supportUserContext", parcelable);
        }
        return intent;
    }

    @Deprecated
    public Intent A0u(Context context, C16010sH r5) {
        Jid A08 = r5.A08(UserJid.class);
        AnonymousClass00B.A06(A08);
        return A0Z(context, (UserJid) A08, (Integer) null, true);
    }

    public Intent A0v(Context context, C16010sH r3) {
        return A0x(context, (C15830rv) r3.A08(C15830rv.class));
    }

    public Intent A0w(Context context, C16010sH r4, Integer num) {
        Jid A08 = r4.A08(UserJid.class);
        AnonymousClass00B.A06(A08);
        return A0Z(context, (UserJid) A08, num, true);
    }

    public Intent A0x(Context context, C15830rv r5) {
        return A08(context, 0).putExtra("jid", C16030sJ.A03(r5)).addFlags(335544320);
    }

    public Intent A0y(Context context, C15830rv r6) {
        return A08(context, 0).putExtra("jid", C16030sJ.A03(r6)).addFlags(335544320).putExtra("start_t", SystemClock.uptimeMillis());
    }

    public Intent A0z(Context context, C15830rv r6, String str) {
        Intent A0x = A0x(context, r6);
        A0x.putExtra("wa_type", (byte) 0);
        A0x.putExtra("share_msg", str);
        A0x.putExtra("has_share", true);
        A0x.putExtra("confirm", true);
        A0x.putExtra("text_from_url", true);
        A0x.putExtra("number_from_url", true);
        C51382ba.A00(context, A0x);
        return A0x;
    }

    public Intent A10(Context context, UserJid userJid, Boolean bool) {
        ArrayList arrayList = new ArrayList();
        if (userJid != null) {
            arrayList.add(userJid);
        }
        return A0b(context, bool, (Boolean) null, (Boolean) null, (Boolean) null, arrayList);
    }

    public Intent A11(Context context, String str, int i2, boolean z2) {
        Intent A0b = A0b(context, Boolean.valueOf(z2), (Boolean) null, (Boolean) null, (Boolean) null, (List) null);
        A0b.setAction("com.obwhatsapp.intent.action.ACCEPT_CALL");
        A0b.putExtra("call_ui_action", i2);
        A0b.putExtra("call_id", str);
        A0b.putExtra("isTaskRoot", z2);
        return A0b;
    }

    public Intent A12(Context context, Collection collection) {
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.community.NewCommunityActivity");
        ArrayList arrayList = new ArrayList(collection);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Jid) it.next()).getRawString());
        }
        intent.putExtra("NewCommunityActivity_groups_to_be_added", arrayList2);
        return intent;
    }
}
