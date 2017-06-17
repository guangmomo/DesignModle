# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in E:\AndroidSDK/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}


# 关闭压缩
-dontshrink

#关闭混淆
#-dontobfuscate

#关闭优化
-dontoptimize

#proguardtest的子包的类还是会被混淆
#-keep class com.xuliwen.dm.proguardtest.*

#proguardtest的子包的类不会被混淆
#-keep class com.xuliwen.dm.proguardtest.**

# 对于接口，使用class和 interface修饰都可以
-keep class com.xuliwen.dm.adapter.objectadapter.TargetIml

#要使TargetIml的实现类不被混淆，前提是TargetIml不被混淆
-keep class * implements com.xuliwen.dm.adapter.objectadapter.TargetIml

#不混淆Test的内部类TestInner1
#-keep class  com.xuliwen.dm.proguardtest.Test$TestInner1

#不混淆Test的所有内部类
#-keep class  com.xuliwen.dm.proguardtest.Test$*

#要使Test的子类不被混淆，貌似不需要Test不被混淆
#-keep class * extends com.xuliwen.dm.proguardtest.Test

#注意public
#-keep public class * extends com.xuliwen.dm.proguardtest.Test

#Test的类名不会混淆，但是Test的方法，变量会被混淆
#-keep class com.xuliwen.dm.proguardtest.Test

#{*;}意思是Test的方法，变量不会被混淆,但是内部类依然会被混淆
#-keep class com.xuliwen.dm.proguardtest.Test{*;}


#-keep class com.xuliwen.dm.proguardtest.Test{
#<fields>;  #成员变量
#<methods>; #方法
#}

#不保留Test的类名，只保留<fields>和<methods>
-keepclassmembers class com.xuliwen.dm.proguardtest.Test{
<fields>;
<methods>;
}


#不混淆 class com.xuliwen.dm.adapter.objectadapter.English
-keep class com.xuliwen.dm.adapter.objectadapter.English

#不混淆adxmi的jar包

#不报警告
-dontwarn com.adxmi.android.**
#忽略adxmi的包
-keep class com.adxmi.android.** {
    *;
}

