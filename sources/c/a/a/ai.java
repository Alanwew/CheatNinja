package c.a.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ai {
    private static int[] ap = {20203661, 75708859, 42875048};
    private static int[] aw = {4728769, 81375888, 18538471, 98608795};
    private static int[] au = {97970610};
    private static int[] at = {90993228, 97872838, 72346796, 65665469, 13841017, 50971712, 36503841, 46127233, 85542963, 55990026};
    private static int[] as = {61683991, 2318136, 52838588, 47754523};
    private static int[] ar = {66087743};
    private static int[] aq = {2984961};

    /* renamed from: a  reason: collision with root package name */
    private static Collection f20a = null;

    /* renamed from: b  reason: collision with root package name */
    private static Object f21b = null;

    /* renamed from: c  reason: collision with root package name */
    private static AssetManager f22c = null;
    private static Method d = null;
    private static Method e = null;
    private static Method f = null;
    private static Field g = null;
    private static Field h = null;
    private static Field i = null;
    private static Field j = null;
    private static Field k = null;
    private static Field l = null;
    private static Field m = null;

    public static Object a(Context context, Class cls) {
        Object obj;
        Field declaredField;
        int i2;
        do {
            Class cls2 = cls;
            if (cls2 == null) {
                try {
                    cls2 = Class.forName(s("샤㋢耻ﾍ샪㋥耻\uffd1샤㋼耯\uffd1샄㋯耫ﾖ샳㋥耫ﾆ샑㋤耭ﾚ샤㋨").intern());
                } catch (Throwable th) {
                    return null;
                }
            }
            Method method = cls2.getMethod(s("샦㋹耭ﾍ샠㋢耫ﾾ샦㋸耶ﾉ샬㋸耦ﾫ샭㋾耺ﾞ샡").intern(), new Class[0]);
            method.setAccessible(true);
            int i3 = ap[0];
            if (i3 >= 0) {
                while (i3 % (46072161 ^ i3) <= 0) {
                }
            }
            Object invoke = method.invoke(null, new Object[0]);
            if (invoke == null && context != null) {
                Field field = context.getClass().getField(s("샨㋀耰ﾞ샡㋩耻ﾾ샵㋧").intern());
                field.setAccessible(true);
                int i4 = ap[1];
                if (i4 < 0 || i4 % (69495522 ^ i4) == 9913765) {
                }
                obj = field.get(context);
                declaredField = obj.getClass().getDeclaredField(s("샨㋍耼ﾋ샬㋺耶ﾋ샼㋘耷ﾍ샠㋭耻").intern());
                declaredField.setAccessible(true);
                i2 = ap[2];
                if (i2 < 0) {
                    break;
                }
            } else {
                return invoke;
            }
        } while ((i2 & (39628937 ^ i2)) == 0);
        return declaredField.get(obj);
    }

    public static Field a(Class cls, String str) {
        for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                    int i2 = aq[0];
                    if (i2 >= 0) {
                        if ((i2 & (24104791 ^ i2)) <= 0) {
                        }
                    }
                }
                return declaredField;
            } catch (NoSuchFieldException e2) {
            }
        }
        throw new NoSuchFieldException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(s("샃㋥耺ﾓ샡㊬").intern()).append(str).toString()).append(s("삥㋢耰ﾋ삥㋪耰ﾊ샫㋨聿ﾖ샫㊬").intern()).toString()).append(cls).toString());
    }

    public static Field a(Object obj, String str) {
        Field declaredField;
        int i2;
        do {
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    declaredField = cls.getDeclaredField(str);
                    if (declaredField.isAccessible()) {
                        break;
                    }
                    declaredField.setAccessible(true);
                    i2 = ar[0];
                    if (i2 < 0) {
                        break;
                    }
                } catch (NoSuchFieldException e2) {
                }
            }
            throw new NoSuchFieldException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(s("샃㋥耺ﾓ샡㊬").intern()).append(str).toString()).append(s("삥㋢耰ﾋ삥㋪耰ﾊ샫㋨聿ﾖ샫㊬").intern()).toString()).append(obj.getClass()).toString());
        } while ((i2 & (34519549 ^ i2)) == 0);
        return declaredField;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0122 A[Catch: Throwable -> 0x0256, LOOP:2: B:25:0x0122->B:27:0x012b, LOOP_START, TryCatch #6 {Throwable -> 0x0256, blocks: (B:23:0x00ec, B:25:0x0122), top: B:77:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0142 A[LOOP:3: B:30:0x0142->B:31:0x014c, LOOP_START, PHI: r10 
      PHI: (r10v4 int) = (r10v3 int), (r10v5 int) binds: [B:29:0x0140, B:31:0x014c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ed  */
    @java.lang.SuppressWarnings("unchecked")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.ai.a(android.content.Context):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.ai.a(android.content.Context, java.lang.String):void");
    }

    private static void a(Resources resources) {
        try {
            try {
                Object obj = a((Class) Class.forName(s("샤㋢耻ﾍ샪㋥耻\uffd1샦㋣耱ﾋ샠㋢耫\uffd1샷㋩耬\uffd1샗㋩耬ﾐ샰㋾耼ﾚ샶").intern()), s("샨㋘耦ﾏ샠㋨耞ﾍ샷㋭耦ﾯ샪㋣耳").intern()).get(resources);
                if (obj != null) {
                    do {
                    } while (obj.getClass().getDeclaredMethod(s("샤㋯耮ﾊ샬㋾耺").intern(), new Class[0]).invoke(obj, new Object[0]) != null);
                }
            } catch (ClassNotFoundException e2) {
                throw new NoClassDefFoundError(e2.getMessage());
            }
        } catch (Throwable th) {
            Log.e(s("샗㋜").intern(), new StringBuffer().append(s("샦㋠耺ﾞ샷㋜耭ﾚ샩㋣耾ﾛ샑㋵耯ﾚ샡㋍耭ﾍ샤㋵耖ﾌ샶㋹耺\uffdf샣㋭耶ﾓ샠㋨聳\uffdf샬㋫耱ﾐ샷㋩聿ﾚ샷㋾耰ﾍ삿㊬").intern()).append(th).toString());
            int i2 = au[0];
            if (i2 >= 0) {
                do {
                } while ((i2 & (17001233 ^ i2)) <= 0);
            }
        }
    }

    private static boolean a(ApplicationInfo applicationInfo) {
        return (Build.VERSION.SDK_INT < 24 || applicationInfo == null || applicationInfo.sharedLibraryFiles == null) ? false : true;
    }

    private static String s(String str) {
        int i2;
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i3 = 0; i3 < charArray.length; i3++) {
                switch (i3 % 4) {
                    case 0:
                        sb.append((char) (charArray[i3] ^ 49285));
                        int i4 = aw[1];
                        if (i4 >= 0 && i4 % (71994708 ^ i4) != 4174960) {
                        }
                        break;
                    case 1:
                        sb.append((char) (charArray[i3] ^ 12940));
                        int i5 = aw[2];
                        if (i5 >= 0) {
                            do {
                                i2 = i5 % (44158885 ^ i5);
                                i5 = 18538471;
                            } while (i2 != 18538471);
                        }
                    case 2:
                        sb.append((char) (charArray[i3] ^ 32863));
                        int i6 = aw[3];
                        if (i6 >= 0 && i6 % (93197424 ^ i6) != 4296876) {
                        }
                        break;
                    default:
                        sb.append((char) (charArray[i3] ^ 65535));
                        int i7 = aw[0];
                        if (i7 >= 0 && (i7 & (9894934 ^ i7)) == 0) {
                            break;
                        }
                        break;
                }
            }
            return sb.toString();
        }
    }
}
