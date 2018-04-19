package com.flyco.tablayout;

import android.graphics.drawable.Drawable;

import com.flyco.tablayout.listener.CustomTabEntity;

public class TabDrawableEntity implements CustomTabEntity
{
    public String title;
    public Drawable selectedDrawable;
    public Drawable unSelectedDrawable;

    public TabDrawableEntity(String title, Drawable selectedDrawable, Drawable unSelectedDrawable)
    {
        this.title = title;
        this.selectedDrawable = selectedDrawable;
        this.unSelectedDrawable = unSelectedDrawable;
    }

    public Drawable getSelectedDrawable()
    {
        return selectedDrawable;
    }

    public Drawable getUnSelectedDrawable()
    {
        return unSelectedDrawable;
    }

    @Override
    public String getTabTitle()
    {
        return title;
    }

    @Override
    public int getTabSelectedIcon()
    {
        return 0;
    }

    @Override
    public int getTabUnselectedIcon()
    {
        return 0;
    }
}
