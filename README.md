[![Download](https://img.shields.io/badge/Download-AutoPageLayout-brightgreen.svg?style=flat)](https://bintray.com/jasonlian/maven/custom-dialog)
[![API](https://img.shields.io/badge/API-17%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=17)
[![Build Status](https://www.travis-ci.org/JasonLian2020/CustomDialog.svg?branch=master)](https://www.travis-ci.org/JasonLian2020/CustomDialog)


# CustomDialog



## Download

Get the latest artifact via gradle

```groxy
implementation 'me.jason.library:custom-dialog:1.1.1'
```

## Usage

See more，[Demo](https://github.com/JasonLian2020/CustomDialog/tree/master/app)



## ChangeLog

See more，[ChangeLog](https://github.com/JasonLian2020/CustomDialog/releases)



## Interface Explain



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

