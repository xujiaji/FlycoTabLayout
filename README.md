# FlycoTabLayout
[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-FlycoTabLayout-green.svg?style=true)](https://android-arsenal.com/details/1/2756)

# 新增CommonTabLayout底部导航 xml属性，简化代码
|属性名|作用|
|-|-|
|tl_mipmaps_select|用来定义选中的图片效果|
|tl_mipmaps_unselect|用来定义未选中的图片效果|
|tl_titles|用来定义每个item的下标题|

> 例子xml配置

``` xml
    <com.flyco.tablayout.CommonTabLayout
        android:id="@+id/tl_2"
        android:layout_width="match_parent"
        android:layout_height="54dp"
        android:background="#ffffff"
        app:tl_mipmaps_select="tab_home_select,tab_speech_select,tab_contact_select,tab_more_select"
        app:tl_mipmaps_unselect="tab_home_unselect,tab_speech_unselect,tab_contact_unselect,tab_more_unselect"
        app:tl_titles="首页,消息,联系人,更多"
        app:tl_iconHeight="23dp"
        app:tl_iconWidth="23dp"
        app:tl_textSelectColor="#2C97DE"
        app:tl_textUnselectColor="#66000000"
        app:tl_textsize="12sp"/>
```

> Java代码

获取实例后调用`linkViewPager`方法直接既可配置ViewPager
``` java
mTabLayout.linkViewPager(mViewPager);
```

> 注意

1. 每个元素之间用逗号隔开
2. 它们三个属性定义的数量必须相同
3. 定义的图片放在mipmap文件夹，并且只需要写入名字就可自动匹配

> 原来Java代码改动情况

将`setOnTabSelectListener` 监听方法，名字修改为`addOnTabSelectListener`

新增`changeTabData` 用于换肤改变图标时使用

---

## Demo
![](https://github.com/H07000223/FlycoTabLayout/blob/master/preview_1.gif)

![](https://github.com/H07000223/FlycoTabLayout/blob/master/preview_2.gif)

![](https://github.com/H07000223/FlycoTabLayout/blob/master/preview_3.gif)

## Attributes

|name|format|description|
|:---:|:---:|:---:|
| tl_indicator_color | color |设置显示器颜色
| tl_indicator_height | dimension |设置显示器高度
| tl_indicator_width | dimension |设置显示器固定宽度
| tl_indicator_margin_left | dimension |设置显示器margin,当indicator_width大于0,无效
| tl_indicator_margin_top | dimension |设置显示器margin,当indicator_width大于0,无效
| tl_indicator_margin_right | dimension |设置显示器margin,当indicator_width大于0,无效
| tl_indicator_margin_bottom | dimension |设置显示器margin,当indicator_width大于0,无效 
| tl_indicator_corner_radius | dimension |设置显示器圆角弧度
| tl_indicator_gravity | enum |设置显示器上方(TOP)还是下方(BOTTOM),只对常规显示器有用
| tl_indicator_style | enum |设置显示器为常规(NORMAL)或三角形(TRIANGLE)或背景色块(BLOCK)
| tl_underline_color | color |设置下划线颜色
| tl_underline_height | dimension |设置下划线高度
| tl_underline_gravity | enum |设置下划线上方(TOP)还是下方(BOTTOM)
| tl_divider_color | color |设置分割线颜色
| tl_divider_width | dimension |设置分割线宽度
| tl_divider_padding |dimension| 设置分割线的paddingTop和paddingBottom
| tl_tab_padding |dimension| 设置tab的paddingLeft和paddingRight
| tl_tab_space_equal |boolean| 设置tab大小等分
| tl_tab_width |dimension| 设置tab固定大小
| tl_textsize |dimension| 设置字体大小
| tl_textSelectColor |color| 设置字体选中颜色
| tl_textUnselectColor |color| 设置字体未选中颜色
| tl_textBold |boolean| 设置字体加粗
| tl_iconWidth |dimension| 设置icon宽度(仅支持CommonTabLayout)
| tl_iconHeight |dimension|设置icon高度(仅支持CommonTabLayout)
| tl_iconVisible |boolean| 设置icon是否可见(仅支持CommonTabLayout)
| tl_iconGravity |enum| 设置icon显示位置,对应Gravity中常量值,左上右下(仅支持CommonTabLayout)
| tl_iconMargin |dimension| 设置icon与文字间距(仅支持CommonTabLayout)
| tl_indicator_anim_enable |boolean| 设置显示器支持动画(only for CommonTabLayout)
| tl_indicator_anim_duration |integer| 设置显示器动画时间(only for CommonTabLayout)
| tl_indicator_bounce_enable |boolean| 设置显示器支持动画回弹效果(only for CommonTabLayout)
| tl_indicator_width_equal_title |boolean| 设置显示器与标题一样长(only for SlidingTabLayout)

## Dependence
*   [NineOldAndroids](https://github.com/JakeWharton/NineOldAndroids)
*   [FlycoRoundView](https://github.com/H07000223/FlycoRoundView)

## Thanks
*   [PagerSlidingTabStrip](https://github.com/jpardogo/PagerSlidingTabStrip)
