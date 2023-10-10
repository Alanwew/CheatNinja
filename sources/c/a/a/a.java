package c.a.a;

import android.content.SharedPreferences;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    static JSONArray f6b;

    /* renamed from: c  reason: collision with root package name */
    static JSONArray f7c;
    static JSONArray d;
    static JSONArray e;
    static JSONArray f;
    static JSONArray g;
    static JSONArray h;
    private static int[] ah = {90564045, 52618133, 40697785, 40908139};
    private static int[] ab = {62360789};

    /* renamed from: a  reason: collision with root package name */
    static String f5a = p("黷鹫㠊ﾈ麶鹃㠊ﾞ麼鸀㠨ﾞ麱鹁").intern();

    public static String a(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return sb.toString();
                }
                sb.append(readLine);
                int i = ab[0];
                if (i >= 0) {
                    while (true) {
                        int i2 = i % (1543887 ^ i);
                        i = 1542843;
                        if (i2 != 1542843) {
                        }
                    }
                }
            }
        } catch (IOException e2) {
            return e2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2) {
        SharedPreferences.Editor edit = g.f33b.getSharedPreferences(b.f23a, 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        return new String(Base64.decode(str, 2), StandardCharsets.UTF_8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return g.f33b.getSharedPreferences(b.f23a, 0).getString(str, p("麖鹚㠉ﾓ").intern());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(String str) {
        SharedPreferences.Editor edit = g.f33b.getSharedPreferences(b.f23a, 0).edit();
        edit.remove(str);
        edit.apply();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String p(java.lang.String r11) {
        /*
        L0:
            r5 = r11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            char[] r2 = r5.toCharArray()
            r0 = 0
        Lc:
            int r3 = r2.length
            if (r0 >= r3) goto L94
            int r3 = r0 % 4
            switch(r3) {
                case 0: goto L33;
                case 1: goto L54;
                case 2: goto L75;
                default: goto L14;
            }
        L14:
            char r3 = r2[r0]
            r3 = r3 ^ (-1)
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.a.ah
            r8 = 0
            r8 = r7[r8]
            if (r8 < 0) goto L30
            r7 = 31883377(0x1e68071, float:8.467296E-38)
        L28:
            r7 = r7 ^ r8
            r7 = r8 & r7
            if (r7 == 0) goto L0
            goto L30
            goto L28
        L30:
            int r0 = r0 + 1
            goto Lc
        L33:
            char r3 = r2[r0]
            r4 = 171736(0x29ed8, float:2.40653E-40)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.a.ah
            r8 = 1
            r8 = r7[r8]
            if (r8 < 0) goto L53
            r7 = 4295831(0x418c97, float:6.019741E-39)
            r7 = r7 ^ r8
            int r7 = r8 % r7
            r8 = 52618133(0x322e395, float:4.7868773E-37)
            if (r7 != r8) goto L53
            goto L53
        L53:
            goto L30
        L54:
            char r3 = r2[r0]
            r4 = 1455136303(0x56bb9e2f, float:1.0314403E14)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.a.ah
            r8 = 2
            r8 = r7[r8]
            if (r8 < 0) goto L74
            r7 = 85133161(0x5130769, float:6.913268E-36)
            r7 = r7 ^ r8
            int r7 = r8 % r7
            r8 = 40697785(0x26cffb9, float:1.741193E-37)
            if (r7 != r8) goto L74
            goto L74
        L74:
            goto L30
        L75:
            char r3 = r2[r0]
            r4 = -1413269403(0xffffffffabc33865, float:-1.3871236E-12)
            r3 = r3 ^ r4
            char r3 = (char) r3
            r1.append(r3)
            int[] r7 = c.a.a.a.ah
            r8 = 3
            r8 = r7[r8]
            if (r8 < 0) goto L93
            r7 = 50215900(0x2fe3bdc, float:3.7356303E-37)
        L8b:
            r7 = r7 ^ r8
            int r7 = r8 % r7
            if (r7 == 0) goto L0
            goto L93
            goto L8b
        L93:
            goto L30
        L94:
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.p(java.lang.String):java.lang.String");
    }
}
