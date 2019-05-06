# CustomDialog



## Download

Get the latest artifact via gradle

```groxy
implementation 'me.jason.library:custom-dialog:1.0.1'
```



## proguard-rules.pro

```java
################BRVAH#################
-keep class com.chad.library.adapter.** {
*;
}
-keep public class * extends com.chad.library.adapter.base.BaseQuickAdapter
-keep public class * extends com.chad.library.adapter.base.BaseViewHolder
-keepclassmembers  class **$** extends com.chad.library.adapter.base.BaseViewHolder {
     <init>(...);
}
```



## Thanks

[CymChad / BaseRecyclerViewAdapterHelper](https://github.com/CymChad/BaseRecyclerViewAdapterHelper)

