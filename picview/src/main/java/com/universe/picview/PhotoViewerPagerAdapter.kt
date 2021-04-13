package com.universe.picview

import androidx.fragment.app.FragmentStatePagerAdapter


class PhotoViewerPagerAdapter(
    private var mData: MutableList<PhotoViewerFragment>,
    fragmentManager: androidx.fragment.app.FragmentManager
) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): androidx.fragment.app.Fragment {
        return mData[position]
    }

    override fun getCount(): Int {
        return mData.size
    }

}
